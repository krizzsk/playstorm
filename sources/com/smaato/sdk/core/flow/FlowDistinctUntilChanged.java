package com.smaato.sdk.core.flow;

class FlowDistinctUntilChanged<T, K> extends Flow<T> {
    private final Function1<? super T, K> keySelector;
    private final Publisher<T> source;

    FlowDistinctUntilChanged(Publisher<T> publisher, Function1<? super T, K> function1) {
        this.source = publisher;
        this.keySelector = function1;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe(new FlowDistinctUntilChangedSubscriber(subscriber, this.keySelector));
    }

    private static class FlowDistinctUntilChangedSubscriber<T, K> implements Subscriber<T> {
        private final Subscriber<? super T> downstream;
        private final Function1<? super T, K> keySelector;
        private volatile K lastKey;

        FlowDistinctUntilChangedSubscriber(Subscriber<? super T> subscriber, Function1<? super T, K> function1) {
            this.downstream = subscriber;
            this.keySelector = function1;
        }

        public void onSubscribe(Subscription subscription) {
            this.downstream.onSubscribe(subscription);
        }

        public void onNext(T t) {
            try {
                K apply = this.keySelector.apply(t);
                if (this.lastKey != apply) {
                    this.downstream.onNext(t);
                }
                this.lastKey = apply;
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
