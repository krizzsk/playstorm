package com.smaato.sdk.core.flow;

import java.util.concurrent.Callable;

class FlowError<T> extends Flow<T> {
    private final Callable<? extends Throwable> producer;

    FlowError(Callable<? extends Throwable> callable) {
        this.producer = callable;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        subscriber.onSubscribe(new Subscription() {
            public void cancel() {
            }

            public void request(long j) {
            }
        });
        try {
            subscriber.onError((Throwable) this.producer.call());
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }
}
