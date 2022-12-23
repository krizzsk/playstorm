package com.smaato.sdk.core.flow;

import com.smaato.sdk.core.flow.FlowSubscribeOn;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

class FlowSubscribeOn<T> extends Flow<T> {
    private final Executor executor;
    private final Publisher<T> source;

    FlowSubscribeOn(Publisher<T> publisher, Executor executor2) {
        this.source = publisher;
        this.executor = executor2;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(subscriber);
        subscriber.onSubscribe(subscribeOnSubscriber);
        try {
            this.executor.execute(new Runnable(subscribeOnSubscriber) {
                public final /* synthetic */ FlowSubscribeOn.SubscribeOnSubscriber f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    FlowSubscribeOn.this.lambda$subscribeActual$0$FlowSubscribeOn(this.f$1);
                }
            });
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }

    public /* synthetic */ void lambda$subscribeActual$0$FlowSubscribeOn(SubscribeOnSubscriber subscribeOnSubscriber) {
        this.source.subscribe(subscribeOnSubscriber);
    }

    private static class SubscribeOnSubscriber<T> implements Subscriber<T>, Subscription {
        private final AtomicLong demand = new AtomicLong();
        private final Subscriber<? super T> downstream;
        private final AtomicReference<Subscription> upstream = new AtomicReference<>();

        SubscribeOnSubscriber(Subscriber<? super T> subscriber) {
            this.downstream = subscriber;
        }

        public void onSubscribe(Subscription subscription) {
            if (Subscriptions.setOnce(this.upstream, subscription)) {
                long j = this.demand.get();
                if (j > 0) {
                    subscription.request(j);
                }
            }
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
            Subscriptions.produced(this.demand, 1);
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                Subscriptions.requested(this.demand, j);
                Subscription subscription = this.upstream.get();
                if (subscription != null) {
                    subscription.request(j);
                }
            }
        }

        public void cancel() {
            Subscriptions.cancel(this.upstream);
        }
    }
}
