package com.smaato.sdk.core.flow;

import java.util.concurrent.atomic.AtomicReference;

class DisposableSubscriber<T> implements Subscriber<T>, Subscription, Disposable {
    private volatile Subscriber<? super T> downstream;
    private final AtomicReference<Subscription> upstream = new AtomicReference<>();

    DisposableSubscriber(Subscriber<? super T> subscriber) {
        this.downstream = subscriber;
    }

    public void onSubscribe(Subscription subscription) {
        if (Subscriptions.setOnce(this.upstream, subscription)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void onNext(T t) {
        if (this.downstream != null) {
            this.downstream.onNext(t);
        }
    }

    public void onError(Throwable th) {
        if (this.downstream != null) {
            this.downstream.onError(th);
        }
    }

    public void onComplete() {
        if (this.downstream != null) {
            this.downstream.onComplete();
        }
    }

    public void request(long j) {
        if (this.downstream != null && Subscriptions.validate(this.downstream, j)) {
            this.upstream.get().request(j);
        }
    }

    public void cancel() {
        Subscriptions.cancel(this.upstream);
        this.downstream = null;
    }

    public void dispose() {
        cancel();
    }
}
