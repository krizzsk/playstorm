package com.ogury.core.internal.network;

/* compiled from: OguryNetworkException.kt */
public final class OguryNetworkException extends Exception {

    /* renamed from: a */
    private final int f26081a;

    public OguryNetworkException(int i) {
        super("Received " + i + " from the server");
        this.f26081a = i;
    }

    public final int getResponseCode() {
        return this.f26081a;
    }
}
