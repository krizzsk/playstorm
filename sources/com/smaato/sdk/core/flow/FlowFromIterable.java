package com.smaato.sdk.core.flow;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

class FlowFromIterable<T> extends Flow<T> {
    private final Iterable<T> iterable;

    FlowFromIterable(Iterable<T> iterable2) {
        this.iterable = iterable2;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        try {
            Iterator<T> it = this.iterable.iterator();
            try {
                if (!it.hasNext()) {
                    Subscriptions.empty(subscriber);
                } else {
                    subscriber.onSubscribe(new IteratorSubscription(subscriber, it));
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                Subscriptions.error(subscriber, th);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            Subscriptions.error(subscriber, th2);
        }
    }

    private static class IteratorSubscription<T> implements Subscription {
        private volatile boolean cancelled;
        private final Subscriber<? super T> downstream;
        private final Iterator<T> iterator;
        private final AtomicInteger wip = new AtomicInteger();

        IteratorSubscription(Subscriber<? super T> subscriber, Iterator<T> it) {
            this.downstream = subscriber;
            this.iterator = it;
        }

        public void request(long j) {
            if (Subscriptions.validate(this.downstream, j) && this.wip.getAndIncrement() == 0) {
                int i = 1;
                do {
                    long j2 = 0;
                    while (j2 != j && !this.cancelled && this.iterator.hasNext()) {
                        try {
                            T next = this.iterator.next();
                            if (next == null) {
                                this.downstream.onError(new NullPointerException("Iterator.next() returned a null value."));
                                return;
                            } else {
                                this.downstream.onNext(next);
                                j2++;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.downstream.onError(th);
                            return;
                        }
                    }
                    if (this.cancelled || this.iterator.hasNext()) {
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
