package com.smaato.sdk.core.flow;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class FlowReplay<T> extends Flow<T> {
    /* access modifiers changed from: private */
    public final long capacity;
    /* access modifiers changed from: private */
    public volatile boolean done;
    /* access modifiers changed from: private */
    public volatile Throwable error;
    /* access modifiers changed from: private */
    public final Queue<T> queue = new ConcurrentLinkedQueue();
    private final Publisher<T> source;

    FlowReplay(Publisher<T> publisher, long j) {
        this.source = publisher;
        this.capacity = j;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe(new FlowReplaySubscriber(subscriber));
    }

    private class FlowReplaySubscriber implements Subscriber<T> {
        private final Subscriber<? super T> downstream;

        FlowReplaySubscriber(Subscriber<? super T> subscriber) {
            this.downstream = subscriber;
        }

        public void onSubscribe(Subscription subscription) {
            this.downstream.onSubscribe(subscription);
            for (Object onNext : FlowReplay.this.queue) {
                this.downstream.onNext(onNext);
            }
            if (!FlowReplay.this.done) {
                return;
            }
            if (FlowReplay.this.error != null) {
                this.downstream.onError(FlowReplay.this.error);
            } else {
                this.downstream.onComplete();
            }
        }

        public void onNext(T t) {
            if (!FlowReplay.this.done) {
                try {
                    if (((long) FlowReplay.this.queue.size()) >= FlowReplay.this.capacity) {
                        FlowReplay.this.queue.remove();
                    }
                    if (FlowReplay.this.queue.offer(t)) {
                        this.downstream.onNext(t);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (!FlowReplay.this.done) {
                this.downstream.onError(th);
                boolean unused = FlowReplay.this.done = true;
                Throwable unused2 = FlowReplay.this.error = th;
            }
        }

        public void onComplete() {
            if (!FlowReplay.this.done) {
                this.downstream.onComplete();
                boolean unused = FlowReplay.this.done = true;
            }
        }
    }
}
