package com.ogury.sdk.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ogury.sdk.internal.e */
/* compiled from: MonitoringInfoHeaders.kt */
public final class C10854e {

    /* renamed from: a */
    private final C10856f f27084a;

    static {
        new C10855a((byte) 0);
    }

    public C10854e(C10856f fVar) {
        C10865m.m32951b(fVar, "monitoringInfoHelper");
        this.f27084a = fVar;
    }

    /* renamed from: a */
    public final Map<String, String> mo67921a() {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Content-Encoding", "gzip");
        linkedHashMap.put("Content-Type", "application/json");
        linkedHashMap.put("Asset-Key", this.f27084a.mo67922a());
        try {
            linkedHashMap.put("Package-Name", this.f27084a.mo67923c());
        } catch (Exception unused) {
        }
        return linkedHashMap;
    }

    /* renamed from: com.ogury.sdk.internal.e$a */
    /* compiled from: MonitoringInfoHeaders.kt */
    public static final class C10855a {
        private C10855a() {
        }

        public /* synthetic */ C10855a(byte b) {
            this();
        }
    }
}
