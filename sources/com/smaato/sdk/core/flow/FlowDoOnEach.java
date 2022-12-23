package com.smaato.sdk.core.flow;

class FlowDoOnEach<T> extends Flow<T> {
    /* access modifiers changed from: private */
    public final Action0 onComplete;
    /* access modifiers changed from: private */
    public final Action1<? super Throwable> onError;
    /* access modifiers changed from: private */
    public final Action1<? super T> onNext;
    private final Publisher<T> source;

    FlowDoOnEach(Publisher<T> publisher, Action1<? super T> action1, Action1<? super Throwable> action12, Action0 action0) {
        this.source = publisher;
        this.onNext = action1;
        this.onError = action12;
        this.onComplete = action0;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe(new DoOnEachSubscriber(subscriber, this));
    }

    private static class DoOnEachSubscriber<T> implements Subscriber<T> {
        private final Subscriber<? super T> downstream;
        private final FlowDoOnEach<T> parent;

        DoOnEachSubscriber(Subscriber<? super T> subscriber, FlowDoOnEach<T> flowDoOnEach) {
            this.downstream = subscriber;
            this.parent = flowDoOnEach;
        }

        public void onSubscribe(Subscription subscription) {
            this.downstream.onSubscribe(subscription);
        }

        public void onNext(T t) {
            try {
                this.parent.onNext.invoke(t);
                this.downstream.onNext(t);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        public void onError(Throwable th) {
            try {
                this.parent.onError.invoke(th);
                this.downstream.onError(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }

        public void onComplete() {
            try {
                this.parent.onComplete.invoke();
                this.downstream.onComplete();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }
    }
}
