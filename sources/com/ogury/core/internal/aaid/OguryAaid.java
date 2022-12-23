package com.ogury.core.internal.aaid;

import com.ogury.core.internal.C10219ai;

/* compiled from: OguryAaid.kt */
public final class OguryAaid {

    /* renamed from: id */
    private final String f25983id;
    private final boolean isAdTrackingEnabled;
    private final boolean isFake;

    public OguryAaid(String str, boolean z, boolean z2) {
        C10219ai.m31036b(str, "id");
        this.f25983id = str;
        this.isAdTrackingEnabled = z;
        this.isFake = z2;
    }

    public final String getId() {
        return this.f25983id;
    }

    public final boolean isAdTrackingEnabled() {
        return this.isAdTrackingEnabled;
    }

    public final boolean isFake() {
        return this.isFake;
    }
}
