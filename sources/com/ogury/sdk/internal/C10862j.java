package com.ogury.sdk.internal;

import com.ogury.core.internal.network.HeadersLoader;
import java.util.Map;

/* renamed from: com.ogury.sdk.internal.j */
/* compiled from: MonitoringRequestHeader.kt */
public final class C10862j implements HeadersLoader {

    /* renamed from: a */
    private final C10856f f27091a;

    public C10862j(C10856f fVar) {
        C10865m.m32951b(fVar, "monitoringInfoHelper");
        this.f27091a = fVar;
    }

    public final Map<String, String> loadHeaders() {
        return new C10854e(this.f27091a).mo67921a();
    }
}
