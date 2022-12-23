package com.smaato.sdk.core.flow;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

class FlowSwitchIfEmpty<T> extends Flow<T> {
    private final Callable<? extends Publisher<? extends T>> producer;
    private final Publisher<T> source;

    FlowSwitchIfEmpty(Publisher<T> publisher, Callable<? extends Publisher<? extends T>> callable) {
        this.source = publisher;
        this.producer = callable;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe(new SwitchIfEmptySubscriber(subscriber, this.producer));
    }

    private static class SwitchIfEmptySubscriber<T> implements Subscriber<T>, Subscription {
        private volatile boolean cancelled;
        private volatile boolean completed;
        private final AtomicLong demand = new AtomicLong();
        private volatile boolean done;
        private final Subscriber<? super T> downstream;
        private volatile boolean hasValues;
        private final Callable<? extends Publisher<? extends T>> producer;
        private final AtomicReference<Subscription> upstream = new AtomicReference<>(Subscriptions.EMPTY_SUB);

        SwitchIfEmptySubscriber(Subscriber<? super T> subscriber, Callable<? extends Publisher<? extends T>> callable) {
            this.downstream = subscriber;
            this.producer = callable;
        }

        public void onSubscribe(Subscription subscription) {
            Subscription subscription2 = this.upstream.get();
            Subscription subscription3 = Subscriptions.EMPTY_SUB;
            if (subscription3 != subscription2) {
                subscription2.cancel();
            }
            if (!this.upstream.compareAndSet(subscription2, subscription)) {
                return;
            }
            if (subscription3 == subscription2) {
                this.downstream.onSubscribe(this);
            } else if (this.demand.get() > 0) {
                subscription.request(this.demand.get());
            }
        }

        public void onNext(T t) {
            if (!this.cancelled && !this.done) {
                Subscriptions.produced(this.demand, 1);
                this.downstream.onNext(t);
                this.hasValues = true;
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
            if (!this.cancelled && !this.done) {
                if (this.completed || this.hasValues) {
                    this.downstream.onComplete();
                    this.done = true;
                    return;
                }
                this.completed = true;
                try {
                    ((Publisher) this.producer.call()).subscribe(this);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    Subscriptions.cancel(this.upstream);
                    this.downstream.onError(th);
                }
            }
        }

        public void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                Subscriptions.requested(this.demand, j);
                this.upstream.get().request(j);
            }
        }

        public void cancel() {
            if (!this.cancelled && !this.done) {
                Subscriptions.cancel(this.upstream);
                this.cancelled = true;
            }
        }
    }
}
