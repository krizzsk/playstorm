package com.ogury.sdk;

import com.ogury.sdk.internal.C10865m;

/* compiled from: OguryIntegrationException.kt */
public final class OguryIntegrationException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OguryIntegrationException(String str) {
        super(str);
        C10865m.m32951b(str, "message");
    }
}
