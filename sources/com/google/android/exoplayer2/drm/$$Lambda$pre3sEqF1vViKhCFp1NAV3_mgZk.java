package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Consumer;

/* renamed from: com.google.android.exoplayer2.drm.-$$Lambda$pre3sEqF1vViKhCFp1NAV3_mgZk  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pre3sEqF1vViKhCFp1NAV3_mgZk implements Consumer {
    public static final /* synthetic */ $$Lambda$pre3sEqF1vViKhCFp1NAV3_mgZk INSTANCE = new $$Lambda$pre3sEqF1vViKhCFp1NAV3_mgZk();

    private /* synthetic */ $$Lambda$pre3sEqF1vViKhCFp1NAV3_mgZk() {
    }

    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRemoved();
    }
}
