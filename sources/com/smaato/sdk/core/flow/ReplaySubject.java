package com.smaato.sdk.core.flow;

import com.smaato.sdk.core.util.Optional;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class ReplaySubject<T> extends Subject<T> {
    private final int capacity;
    private volatile boolean done;
    private volatile Throwable error;
    private volatile T lastValue;
    private final Queue<T> queue = new ConcurrentLinkedQueue();
    private Queue<PublishSubscription<? super T>> subscribers = new ConcurrentLinkedQueue();

    ReplaySubject(int i) {
        this.capacity = i;
    }

    public Optional<T> lastValue() {
        return Optional.m32963of(this.lastValue);
    }

    public void onNext(T t) {
        if (!this.done) {
            try {
                if (this.queue.size() >= this.capacity) {
                    this.queue.remove();
                }
                if (this.queue.offer(t)) {
                    for (PublishSubscription onNext : this.subscribers) {
                        this.lastValue = t;
                        onNext.onNext(t);
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                onError(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (!this.done) {
            if (this.error != null) {
                FlowPlugins.onError(th);
                return;
            }
            for (PublishSubscription onError : this.subscribers) {
                onError.onError(th);
                this.error = th;
            }
            this.subscribers.clear();
            this.done = true;
        }
    }

    public void onComplete() {
        if (!this.done) {
            for (PublishSubscription onComplete : this.subscribers) {
                onComplete.onComplete();
            }
            this.subscribers.clear();
            this.done = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        PublishSubscription publishSubscription = new PublishSubscription(subscriber);
        subscriber.onSubscribe(publishSubscription);
        try {
            for (T onNext : this.queue) {
                publishSubscription.onNext(onNext);
            }
            if (!this.done) {
                this.subscribers.add(publishSubscription);
            } else if (this.error != null) {
                publishSubscription.onError(this.error);
            } else {
                publishSubscription.onComplete();
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }

    private static class PublishSubscription<T> implements Subscription {
        private final Subscriber<? super T> downstream;

        public void cancel() {
        }

        PublishSubscription(Subscriber<? super T> subscriber) {
            this.downstream = subscriber;
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void request(long j) {
            Subscriptions.validate(this.downstream, j);
        }
    }
}
