package com.smaato.sdk.core.flow;

import java.util.concurrent.atomic.AtomicReference;

class FlowSingle<T> extends Flow<T> {
    private final Publisher<T> source;

    FlowSingle(Publisher<T> publisher) {
        this.source = publisher;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe(new FlowSingleSubscriber(subscriber));
    }

    private static class FlowSingleSubscriber<T> implements Subscriber<T>, Subscription {
        private volatile boolean done;
        private final Subscriber<? super T> downstream;
        private final AtomicReference<Subscription> upstream = new AtomicReference<>();

        FlowSingleSubscriber(Subscriber<? super T> subscriber) {
            this.downstream = subscriber;
        }

        public void onSubscribe(Subscription subscription) {
            if (Subscriptions.setOnce(this.upstream, subscription)) {
                this.downstream.onSubscribe(subscription);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                this.downstream.onNext(t);
                this.downstream.onComplete();
                cancel();
                this.done = true;
            }
        }

        public void onError(Throwable th) {
            if (!this.done) {
                this.downstream.onError(th);
                this.done = true;
            }
        }

        public void onComplete() {
            if (!this.done) {
                this.downstream.onComplete();
                this.done = true;
            }
        }

        public void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                this.upstream.get().request(j);
            }
        }

        public void cancel() {
            Subscriptions.cancel(this.upstream);
        }
    }
}
