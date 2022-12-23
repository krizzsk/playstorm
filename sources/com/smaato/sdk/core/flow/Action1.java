package com.smaato.sdk.core.flow;

@FunctionalInterface
public interface Action1<T> {
    void invoke(T t) throws Throwable;
}
