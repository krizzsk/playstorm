package com.smaato.sdk.core.flow;

public interface Publisher<T> {
    void subscribe(Subscriber<? super T> subscriber);
}
