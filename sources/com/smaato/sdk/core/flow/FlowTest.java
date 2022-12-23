package com.smaato.sdk.core.flow;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowTest<T> {
    /* access modifiers changed from: private */
    public final AtomicLong completions = new AtomicLong();
    /* access modifiers changed from: private */
    public final List<Throwable> errors = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */
    public final CountDownLatch latch = new CountDownLatch(1);
    final Subscriber<T> subscriber = new Subscriber<T>() {
        public void onSubscribe(Subscription subscription) {
            subscription.request(Long.MAX_VALUE);
        }

        public void onNext(T t) {
            FlowTest.this.values.add(t);
        }

        public void onError(Throwable th) {
            FlowTest.this.errors.add(th);
            FlowTest.this.latch.countDown();
        }

        public void onComplete() {
            FlowTest.this.completions.incrementAndGet();
            FlowTest.this.latch.countDown();
        }
    };
    /* access modifiers changed from: private */
    public final List<T> values = new CopyOnWriteArrayList();

    public FlowTest<T> await(long j, TimeUnit timeUnit) throws InterruptedException {
        if (this.latch.getCount() == 0) {
            return this;
        }
        this.latch.await(j, timeUnit);
        return this;
    }

    public List<T> values() {
        return Collections.unmodifiableList(this.values);
    }

    public Throwable error() {
        assertHasErrors();
        return this.errors.get(0);
    }

    public FlowTest<T> assertComplete() {
        long j = this.completions.get();
        if (j == 0) {
            throw fail("Not completed");
        } else if (j <= 1) {
            return this;
        } else {
            throw fail("Multiple completions: " + j);
        }
    }

    public FlowTest<T> assertNotComplete() {
        long j = this.completions.get();
        int i = (j > 1 ? 1 : (j == 1 ? 0 : -1));
        if (i == 0) {
            throw fail("Completed!");
        } else if (i <= 0) {
            return this;
        } else {
            throw fail("Multiple completions: " + j);
        }
    }

    public FlowTest<T> assertNoErrors() {
        if (this.errors.isEmpty()) {
            return this;
        }
        throw fail("Error(s) present: " + this.errors);
    }

    public FlowTest<T> assertHasErrors() {
        if (this.errors.isEmpty()) {
            throw fail("Has no errors");
        } else if (this.errors.size() <= 1) {
            return this;
        } else {
            throw fail("Has multiple errors: " + this.errors.size());
        }
    }

    private AssertionError fail(String str) {
        AssertionError assertionError = new AssertionError(str + " (latch = " + this.latch.getCount() + ", values = " + this.values.size() + ", errors = " + this.errors.size() + ", completions = " + this.completions + ")");
        if (!this.errors.isEmpty() && this.errors.size() == 1) {
            assertionError.initCause(this.errors.get(0));
        }
        return assertionError;
    }
}
