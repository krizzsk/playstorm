package com.tapjoy.internal;

import com.tapjoy.TJSetUserIDListener;

public class TJSetUserIDListenerNative implements TJSetUserIDListener {

    /* renamed from: a */
    private final long f27652a;

    private static native void onSetUserIDFailureNative(long j, String str);

    private static native void onSetUserIDSuccessNative(long j);

    private TJSetUserIDListenerNative(long j) {
        if (j != 0) {
            this.f27652a = j;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void onSetUserIDSuccess() {
        onSetUserIDSuccessNative(this.f27652a);
    }

    public void onSetUserIDFailure(String str) {
        onSetUserIDFailureNative(this.f27652a, str);
    }

    static Object create(long j) {
        return new TJSetUserIDListenerNative(j);
    }
}
