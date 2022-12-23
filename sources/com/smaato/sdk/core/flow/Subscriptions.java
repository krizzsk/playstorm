package com.smaato.sdk.core.flow;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

abstract class Subscriptions {
    private static final Subscription CANCELLED_SUB = new Subscription() {
        public void cancel() {
        }

        public void request(long j) {
        }
    };
    static final Subscription EMPTY_SUB = new Subscription() {
        public void cancel() {
        }

        public void request(long j) {
            if (j <= 0) {
                throw new IllegalArgumentException("§3.9 violated: request amount is negative [" + j + "]");
            }
        }
    };

    private static long addCap(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    private Subscriptions() {
    }

    static boolean setOnce(AtomicReference<Subscription> atomicReference, Subscription subscription) {
        if (atomicReference.compareAndSet((Object) null, subscription)) {
            return true;
        }
        subscription.cancel();
        return false;
    }

    static boolean validate(Subscriber<?> subscriber, long j) {
        if (j > 0) {
            return true;
        }
        subscriber.onError(new IllegalArgumentException("§3.9 violated: request amount is negative [" + j + "]"));
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void requested(java.util.concurrent.atomic.AtomicLong r4, long r5) {
        /*
        L_0x0000:
            long r0 = r4.get()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            long r2 = addCap(r0, r5)
            boolean r0 = r4.compareAndSet(r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.flow.Subscriptions.requested(java.util.concurrent.atomic.AtomicLong, long):void");
    }

    static void produced(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 - j;
                if (j3 < 0) {
                    throw new IllegalStateException("More produced than requested: " + j3);
                }
            } else {
                return;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    static void error(Subscriber<?> subscriber, Throwable th) {
        subscriber.onSubscribe(EMPTY_SUB);
        subscriber.onError(th);
    }

    static void empty(Subscriber<?> subscriber) {
        subscriber.onSubscribe(EMPTY_SUB);
        subscriber.onComplete();
    }

    static void cancel(AtomicReference<Subscription> atomicReference) {
        Subscription andSet;
        Subscription subscription = atomicReference.get();
        Subscription subscription2 = CANCELLED_SUB;
        if (subscription2 != subscription && subscription2 != (andSet = atomicReference.getAndSet(subscription2)) && andSet != null) {
            andSet.cancel();
        }
    }
}
