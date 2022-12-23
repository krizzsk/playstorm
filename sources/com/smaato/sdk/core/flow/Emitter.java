package com.smaato.sdk.core.flow;

public interface Emitter<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
