package com.smaato.sdk.core.flow;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

class FlowSwitchIfError<T> extends Flow<T> {
    private final Function1<? super Throwable, ? extends Publisher<? extends T>> mapper;
    private final Publisher<T> source;

    FlowSwitchIfError(Publisher<T> publisher, Function1<? super Throwable, ? extends Publisher<? extends T>> function1) {
        this.source = publisher;
        this.mapper = function1;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe(new SwitchIfErrorSubscriber(subscriber, this.mapper));
    }

    private static class SwitchIfErrorSubscriber<T> implements Subscriber<T>, Subscription {
        private volatile boolean cancelled;
        private final AtomicLong demand = new AtomicLong();
        private volatile boolean done;
        private final Subscriber<? super T> downstream;
        private volatile Throwable lastError;
        private final Function1<? super Throwable, ? extends Publisher<? extends T>> mapper;
        private final AtomicReference<Subscription> upstream = new AtomicReference<>(Subscriptions.EMPTY_SUB);

        SwitchIfErrorSubscriber(Subscriber<? super T> subscriber, Function1<? super Throwable, ? extends Publisher<? extends T>> function1) {
            this.downstream = subscriber;
            this.mapper = function1;
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
                this.downstream.onNext(t);
                Subscriptions.produced(this.demand, 1);
            }
        }

        public void onError(Throwable th) {
            if (this.cancelled || this.done) {
                FlowPlugins.onError(th);
            } else if (this.lastError != null) {
                this.downstream.onError(th);
                this.done = true;
            } else {
                this.lastError = th;
                try {
                    ((Publisher) this.mapper.apply(th)).subscribe(this);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    Subscriptions.cancel(this.upstream);
                    this.downstream.onError(th2);
                }
            }
        }

        public void onComplete() {
            if (!this.cancelled && !this.done) {
                this.downstream.onComplete();
                this.done = true;
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
