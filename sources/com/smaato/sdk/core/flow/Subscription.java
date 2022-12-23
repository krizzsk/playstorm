package com.smaato.sdk.core.flow;

public interface Subscription {
    void cancel();

    void request(long j);
}
