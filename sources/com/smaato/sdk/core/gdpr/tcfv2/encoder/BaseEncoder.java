package com.smaato.sdk.core.gdpr.tcfv2.encoder;

public interface BaseEncoder<T> {
    T decode(String str);
}
