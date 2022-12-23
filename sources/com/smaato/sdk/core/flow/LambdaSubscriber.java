package com.smaato.sdk.core.flow;

class LambdaSubscriber<T> implements Subscriber<T> {
    private final Action0 onComplete;
    private final Action1<? super Throwable> onError;
    private final Action1<? super T> onNext;

    LambdaSubscriber(Action1<? super T> action1, Action1<? super Throwable> action12, Action0 action0) {
        this.onNext = action1;
        this.onError = action12;
        this.onComplete = action0;
    }

    public void onSubscribe(Subscription subscription) {
        subscription.request(Long.MAX_VALUE);
    }

    public void onNext(T t) {
        try {
            this.onNext.invoke(t);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            onError(th);
        }
    }

    public void onError(Throwable th) {
        try {
            this.onError.invoke(th);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th);
            FlowPlugins.onError(th2);
        }
    }

    public void onComplete() {
        try {
            this.onComplete.invoke();
        } catch (Throwable th) {
            onError(th);
        }
    }
}
