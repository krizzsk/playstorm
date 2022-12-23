package com.smaato.sdk.core.flow;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

class FlowConcatArray<T> extends Flow<T> {
    private final Publisher<? extends T>[] sources;

    FlowConcatArray(Publisher<? extends T>[] publisherArr) {
        this.sources = publisherArr;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(subscriber, this.sources);
        subscriber.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }

    private static class ConcatArraySubscriber<T> implements Subscriber<T>, Subscription {
        private volatile boolean cancelled;
        private final AtomicLong demand = new AtomicLong();
        private volatile boolean done;
        private final Subscriber<? super T> downstream;
        private volatile int index;
        private final Publisher<? extends T>[] sources;
        private final AtomicReference<Subscription> upstream = new AtomicReference<>(Subscriptions.EMPTY_SUB);
        private final AtomicInteger wip = new AtomicInteger();

        ConcatArraySubscriber(Subscriber<? super T> subscriber, Publisher<? extends T>[] publisherArr) {
            this.downstream = subscriber;
            this.sources = publisherArr;
        }

        public void onSubscribe(Subscription subscription) {
            Subscription subscription2 = this.upstream.get();
            if (Subscriptions.EMPTY_SUB != subscription2) {
                subscription2.cancel();
            }
            if (this.upstream.compareAndSet(subscription2, subscription) && this.demand.get() > 0) {
                subscription.request(this.demand.get());
            }
        }

        public void onNext(T t) {
            if (!this.cancelled && !this.done) {
                this.downstream.onNext(t);
                Subscriptions.produced(this.demand, 1);
            }
        }

        public void onError(Throwable th) {
            if (this.cancelled || this.done) {
                FlowPlugins.onError(th);
                return;
            }
            this.downstream.onError(th);
            this.done = true;
        }

        public void onComplete() {
            if (!this.cancelled && !this.done && this.wip.getAndIncrement() == 0) {
                int i = 1;
                do {
                    int i2 = this.index;
                    Publisher<? extends T>[] publisherArr = this.sources;
                    if (i2 == publisherArr.length) {
                        this.downstream.onComplete();
                        return;
                    }
                    publisherArr[i2].subscribe(this);
                    this.index = i2 + 1;
                    i = this.wip.addAndGet(-i);
                } while (((long) i) != 0);
            }
        }

        public void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                Subscriptions.requested(this.demand, j);
                this.upstream.get().request(j);
            }
        }

        public void cancel() {
            Subscriptions.cancel(this.upstream);
            this.cancelled = true;
        }
    }
}
