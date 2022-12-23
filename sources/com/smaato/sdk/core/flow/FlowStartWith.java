package com.smaato.sdk.core.flow;

class FlowStartWith<T> extends Flow<T> {
    private final T initialValue;
    private final Publisher<T> source;

    FlowStartWith(Publisher<T> publisher, T t) {
        this.source = publisher;
        this.initialValue = t;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe(new FlowStartWithSubscriber(subscriber, this.initialValue));
    }

    private static class FlowStartWithSubscriber<T, U> implements Subscriber<T> {
        private final Subscriber<? super T> downstream;
        private final T initialValue;
        private volatile boolean initialValueEmitted;

        FlowStartWithSubscriber(Subscriber<? super T> subscriber, T t) {
            this.downstream = subscriber;
            this.initialValue = t;
        }

        public void onSubscribe(Subscription subscription) {
            this.downstream.onSubscribe(subscription);
        }

        public void onNext(T t) {
            if (!this.initialValueEmitted) {
                this.downstream.onNext(this.initialValue);
                this.initialValueEmitted = true;
            }
            this.downstream.onNext(t);
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
