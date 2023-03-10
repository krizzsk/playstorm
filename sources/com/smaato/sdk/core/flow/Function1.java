package com.smaato.sdk.core.flow;

@FunctionalInterface
public interface Function1<T, R> {
    R apply(T t) throws Throwable;
}
