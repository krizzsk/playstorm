package com.ogury.p376ed.internal;

import android.content.Context;
import com.google.common.net.HttpHeaders;
import com.ogury.core.internal.network.HeadersLoader;
import com.tapjoy.TapjoyConstants;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.dr */
public abstract class C10464dr implements HeadersLoader {

    /* renamed from: a */
    private final Context f26444a;

    /* renamed from: b */
    private final C10514fa f26445b;

    /* renamed from: c */
    private final C10542fx f26446c;

    /* renamed from: a */
    public abstract String mo67194a();

    public C10464dr(Context context, C10514fa faVar, C10542fx fxVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10765mq.m32773b(fxVar, "coreWrapper");
        this.f26444a = context;
        this.f26445b = faVar;
        this.f26446c = fxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C10514fa mo67198b() {
        return this.f26445b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C10542fx mo67199c() {
        return this.f26446c;
    }

    public Map<String, String> loadHeaders() {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Content-Type", "application/json");
        linkedHashMap.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
        linkedHashMap.put("Content-Encoding", "gzip");
        linkedHashMap.put("Device-OS", "android");
        linkedHashMap.put("User-Agent", this.f26445b.mo67360e());
        linkedHashMap.put("Package-Name", this.f26445b.mo67361f());
        linkedHashMap.put("User", mo67194a());
        linkedHashMap.put("Instance-Token", this.f26446c.mo67453d());
        return linkedHashMap;
    }
}
