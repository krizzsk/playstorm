package com.smaato.sdk.core.flow;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

class FlowCreate<T> extends Flow<T> {
    private final Action1<Emitter<? super T>> source;

    FlowCreate(Action1<Emitter<? super T>> action1) {
        this.source = action1;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        BufferedEmitter bufferedEmitter = new BufferedEmitter(subscriber);
        subscriber.onSubscribe(bufferedEmitter);
        try {
            this.source.invoke(bufferedEmitter);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }

    private static class BufferedEmitter<T> implements Emitter<T>, Subscription {
        private final Queue<T> buffer = new ConcurrentLinkedQueue();
        private volatile boolean cancelled;
        private final AtomicLong demand = new AtomicLong();
        private volatile boolean done;
        private final Subscriber<T> downstream;
        private volatile Throwable error;
        private final AtomicInteger wip = new AtomicInteger();

        BufferedEmitter(Subscriber<T> subscriber) {
            this.downstream = subscriber;
        }

        public void onNext(T t) {
            if (!this.cancelled && !this.done) {
                this.buffer.offer(t);
                drainNext();
            }
        }

        public void onError(Throwable th) {
            if (this.cancelled || this.done) {
                FlowPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drainNext();
        }

        public void onComplete() {
            if (!this.cancelled && !this.done) {
                this.done = true;
                drainNext();
            }
        }

        public void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                Subscriptions.requested(this.demand, j);
                drainNext();
            }
        }

        public void cancel() {
            this.cancelled = true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
            r0 = r10.wip.addAndGet(-r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void drainNext() {
            /*
                r10 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r10.wip
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                r0 = 1
            L_0x000a:
                java.util.concurrent.atomic.AtomicLong r1 = r10.demand
                long r1 = r1.get()
                java.util.Queue<T> r3 = r10.buffer
                monitor-enter(r3)
                r4 = 0
                r6 = r4
            L_0x0016:
                int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r8 == 0) goto L_0x0035
                boolean r8 = r10.cancelled     // Catch:{ all -> 0x006d }
                if (r8 != 0) goto L_0x0035
                java.util.Queue<T> r8 = r10.buffer     // Catch:{ all -> 0x006d }
                boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x006d }
                if (r8 != 0) goto L_0x0035
                com.smaato.sdk.core.flow.Subscriber<T> r8 = r10.downstream     // Catch:{ all -> 0x006d }
                java.util.Queue<T> r9 = r10.buffer     // Catch:{ all -> 0x006d }
                java.lang.Object r9 = r9.poll()     // Catch:{ all -> 0x006d }
                r8.onNext(r9)     // Catch:{ all -> 0x006d }
                r8 = 1
                long r6 = r6 + r8
                goto L_0x0016
            L_0x0035:
                java.util.concurrent.atomic.AtomicLong r1 = r10.demand     // Catch:{ all -> 0x006d }
                com.smaato.sdk.core.flow.Subscriptions.produced(r1, r6)     // Catch:{ all -> 0x006d }
                boolean r1 = r10.cancelled     // Catch:{ all -> 0x006d }
                if (r1 == 0) goto L_0x0040
                monitor-exit(r3)     // Catch:{ all -> 0x006d }
                return
            L_0x0040:
                java.util.Queue<T> r1 = r10.buffer     // Catch:{ all -> 0x006d }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x006d }
                if (r1 == 0) goto L_0x005f
                boolean r1 = r10.done     // Catch:{ all -> 0x006d }
                if (r1 == 0) goto L_0x005f
                java.lang.Throwable r0 = r10.error     // Catch:{ all -> 0x006d }
                if (r0 == 0) goto L_0x0058
                com.smaato.sdk.core.flow.Subscriber<T> r0 = r10.downstream     // Catch:{ all -> 0x006d }
                java.lang.Throwable r1 = r10.error     // Catch:{ all -> 0x006d }
                r0.onError(r1)     // Catch:{ all -> 0x006d }
                goto L_0x005d
            L_0x0058:
                com.smaato.sdk.core.flow.Subscriber<T> r0 = r10.downstream     // Catch:{ all -> 0x006d }
                r0.onComplete()     // Catch:{ all -> 0x006d }
            L_0x005d:
                monitor-exit(r3)     // Catch:{ all -> 0x006d }
                return
            L_0x005f:
                monitor-exit(r3)     // Catch:{ all -> 0x006d }
                java.util.concurrent.atomic.AtomicInteger r1 = r10.wip
                int r0 = -r0
                int r0 = r1.addAndGet(r0)
                long r1 = (long) r0
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 != 0) goto L_0x000a
                return
            L_0x006d:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x006d }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.flow.FlowCreate.BufferedEmitter.drainNext():void");
        }
    }
}
