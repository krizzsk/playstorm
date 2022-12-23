package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.b */
/* compiled from: OguryEventBusEntry.kt */
public final class C10239b {

    /* renamed from: a */
    private final String f26005a;

    /* renamed from: b */
    private final OguryEventCallback f26006b;

    public C10239b(String str, OguryEventCallback oguryEventCallback) {
        C10219ai.m31036b(str, "event");
        C10219ai.m31036b(oguryEventCallback, "callback");
        this.f26005a = str;
        this.f26006b = oguryEventCallback;
    }

    /* renamed from: a */
    public final String mo66791a() {
        return this.f26005a;
    }

    /* renamed from: b */
    public final OguryEventCallback mo66792b() {
        return this.f26006b;
    }
}
