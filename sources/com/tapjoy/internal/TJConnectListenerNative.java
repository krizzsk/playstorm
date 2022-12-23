package com.tapjoy.internal;

import com.tapjoy.TJConnectListener;

public class TJConnectListenerNative implements TJConnectListener {

    /* renamed from: a */
    private final long f27648a;

    private static native void onConnectFailureNative(long j);

    private static native void onConnectSuccessNative(long j);

    private TJConnectListenerNative(long j) {
        if (j != 0) {
            this.f27648a = j;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void onConnectSuccess() {
        onConnectSuccessNative(this.f27648a);
    }

    public void onConnectFailure() {
        onConnectFailureNative(this.f27648a);
    }

    static Object create(long j) {
        return new TJConnectListenerNative(j);
    }
}
