package com.tapjoy.internal;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C11676gi;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.fs */
public abstract class C11644fs {

    /* renamed from: b */
    private static final String f28320b = C11644fs.class.getSimpleName();

    /* renamed from: a */
    public final Map<String, Object> f28321a = new HashMap();

    /* renamed from: c */
    private final Map<String, C11676gi.C11678a> f28322c = new HashMap();

    protected C11644fs(String str, String str2, String str3) {
        this.f28321a.put("placement", str);
        this.f28321a.put("placement_type", str2);
        this.f28321a.put(FirebaseAnalytics.Param.CONTENT_TYPE, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C11676gi.C11678a mo72514a(String str, Map<String, Object> map, Map<String, Long> map2) {
        C11676gi.C11678a b = C11676gi.m33889e(str).mo72564a().mo72568a(this.f28321a).mo72568a(map).mo72571b(map2);
        this.f28322c.put(str, b);
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C11676gi.C11678a mo72517b(String str, Map<String, Object> map, Map<String, Long> map2) {
        C11676gi.C11678a a = m33811a(str);
        if (a == null) {
            String str2 = f28320b;
            TapjoyLog.m33196e(str2, "Error when calling endTrackingEvent -- " + str + " tracking has not been started.");
        } else {
            a.mo72568a(this.f28321a).mo72568a(map).mo72571b(map2).mo72569b().mo72572c();
        }
        return a;
    }

    /* renamed from: a */
    private C11676gi.C11678a m33811a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f28322c.remove(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo72515a(String str, Object obj) {
        this.f28321a.put(str, obj);
    }

    /* renamed from: c */
    public final void mo72518c() {
        this.f28322c.clear();
    }

    /* renamed from: a */
    public final C11676gi.C11678a mo72513a() {
        return mo72514a("Content.rendered", (Map<String, Object>) null, (Map<String, Long>) null);
    }

    /* renamed from: b */
    public final C11676gi.C11678a mo72516b() {
        return mo72517b("Content.rendered", (Map<String, Object>) null, (Map<String, Long>) null);
    }
}
