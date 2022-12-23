package com.smaato.sdk.core.flow;

import java.util.concurrent.atomic.AtomicInteger;

class FlowFromArray<T> extends Flow<T> {
    private final T[] array;

    FlowFromArray(T[] tArr) {
        this.array = tArr;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        subscriber.onSubscribe(new ArraySubscription(subscriber, this.array));
    }

    private static class ArraySubscription<T> implements Subscription {
        private final T[] array;
        private volatile boolean cancelled;
        private final Subscriber<? super T> downstream;
        private volatile int index;
        private final AtomicInteger wip = new AtomicInteger();

        ArraySubscription(Subscriber<? super T> subscriber, T[] tArr) {
            this.downstream = subscriber;
            this.array = tArr;
        }

        public void request(long j) {
            if (Subscriptions.validate(this.downstream, j) && this.wip.getAndIncrement() == 0) {
                int i = 1;
                do {
                    int i2 = this.index;
                    int length = this.array.length;
                    for (long j2 = 0; j2 != j && i2 != length && !this.cancelled; j2++) {
                        T t = this.array[i2];
                        if (t == null) {
                            this.downstream.onError(new NullPointerException("The element at index " + i2 + " is null"));
                            return;
                        }
                        this.downstream.onNext(t);
                        i2++;
                    }
                    if (i2 != length || this.cancelled) {
                        this.index = i2;
                        i = this.wip.addAndGet(-i);
                    } else {
                        this.downstream.onComplete();
                        return;
                    }
                } while (((long) i) != 0);
            }
        }

        public void cancel() {
            this.cancelled = true;
        }
    }
}
