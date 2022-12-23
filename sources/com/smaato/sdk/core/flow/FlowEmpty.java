package com.smaato.sdk.core.flow;

class FlowEmpty<T> extends Flow<T> {
    FlowEmpty() {
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        subscriber.onSubscribe(new Subscription() {
            public void cancel() {
            }

            public void request(long j) {
            }
        });
        subscriber.onComplete();
    }
}
