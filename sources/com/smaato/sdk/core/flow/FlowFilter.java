package com.smaato.sdk.core.flow;

class FlowFilter<T> extends Flow<T> {
    private final Predicate1<? super T> predicate;
    private final Publisher<T> source;

    FlowFilter(Publisher<T> publisher, Predicate1<? super T> predicate1) {
        this.source = publisher;
        this.predicate = predicate1;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe(new FlowFilterSubscriber(subscriber, this.predicate));
    }

    private static class FlowFilterSubscriber<T, K> implements Subscriber<T> {
        private final Subscriber<? super T> downstream;
        private final Predicate1<? super T> predicate;

        FlowFilterSubscriber(Subscriber<? super T> subscriber, Predicate1<? super T> predicate1) {
            this.downstream = subscriber;
            this.predicate = predicate1;
        }

        public void onSubscribe(Subscription subscription) {
            this.downstream.onSubscribe(subscription);
        }

        public void onNext(T t) {
            try {
                if (this.predicate.test(t)) {
                    this.downstream.onNext(t);
                }
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
