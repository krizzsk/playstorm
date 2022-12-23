package com.smaato.sdk.core.flow;

class FlowFromAction<T> extends Flow<T> {
    private final Action0 action;

    FlowFromAction(Action0 action0) {
        this.action = action0;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        subscriber.onSubscribe(new FromActionSubscription(subscriber, this.action));
    }

    private static class FromActionSubscription<T> implements Subscription {
        private final Action0 action;
        private final Subscriber<? super T> downstream;

        public void cancel() {
        }

        FromActionSubscription(Subscriber<? super T> subscriber, Action0 action0) {
            this.downstream = subscriber;
            this.action = action0;
        }

        public void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                try {
                    this.action.invoke();
                    this.downstream.onComplete();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                }
            }
        }
    }
}
