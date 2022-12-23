package com.smaato.sdk.core.flow;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

class FlowMap<T, U> extends Flow<U> {
    private final Function1<? super T, ? extends U> mapper;
    private final Publisher<T> source;

    FlowMap(Publisher<T> publisher, Function1<? super T, ? extends U> function1) {
        this.source = publisher;
        this.mapper = function1;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super U> subscriber) {
        this.source.subscribe(new FlowMapSubscriber(subscriber, this.mapper));
    }

    private static class FlowMapSubscriber<T, U> implements Subscriber<T>, Subscription {
        private volatile boolean cancelled;
        private final AtomicLong demand = new AtomicLong();
        private volatile boolean done;
        private final Subscriber<? super U> downstream;
        private final Function1<? super T, ? extends U> mapper;
        private final AtomicReference<Subscription> upstream = new AtomicReference<>();

        FlowMapSubscriber(Subscriber<? super U> subscriber, Function1<? super T, ? extends U> function1) {
            this.downstream = subscriber;
            this.mapper = function1;
        }

        public void onSubscribe(Subscription subscription) {
            if (Subscriptions.setOnce(this.upstream, subscription)) {
                this.downstream.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.cancelled && !this.done) {
                try {
                    this.downstream.onNext(this.mapper.apply(t));
                    Subscriptions.produced(this.demand, 1);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    Subscriptions.cancel(this.upstream);
                    this.downstream.onError(th);
                }
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
            Subscriptions.cancel(this.upstream);
            this.cancelled = true;
        }
    }
}
