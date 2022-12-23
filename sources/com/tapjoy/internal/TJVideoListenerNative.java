package com.tapjoy.internal;

import com.tapjoy.TJVideoListener;

public class TJVideoListenerNative implements TJVideoListener {

    /* renamed from: a */
    private final long f27654a;

    private static native void onVideoCompleteNative(long j);

    private static native void onVideoErrorNative(long j, int i);

    private static native void onVideoStartNative(long j);

    private TJVideoListenerNative(long j) {
        if (j != 0) {
            this.f27654a = j;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void onVideoStart() {
        onVideoStartNative(this.f27654a);
    }

    public void onVideoError(int i) {
        onVideoErrorNative(this.f27654a, i);
    }

    public void onVideoComplete() {
        onVideoCompleteNative(this.f27654a);
    }

    static Object create(long j) {
        return new TJVideoListenerNative(j);
    }
}
