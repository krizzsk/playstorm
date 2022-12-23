package com.smaato.sdk.core.flow;

import java.util.concurrent.Callable;

class FlowMaybe<T> extends Flow<T> {
    private final Callable<? extends T> producer;

    FlowMaybe(Callable<? extends T> callable) {
        this.producer = callable;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        subscriber.onSubscribe(new MaybeSubscription(subscriber, this.producer));
    }

    private static class MaybeSubscription<T> implements Subscription {
        private final Subscriber<? super T> downstream;
        private final Callable<? extends T> producer;

        public void cancel() {
        }

        MaybeSubscription(Subscriber<? super T> subscriber, Callable<? extends T> callable) {
            this.downstream = subscriber;
            this.producer = callable;
        }

        public void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                try {
                    Object call = this.producer.call();
                    if (call != null) {
                        this.downstream.onNext(call);
                    }
                    this.downstream.onComplete();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                }
            }
        }
    }
}
