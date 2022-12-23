package com.mbridge.msdk.videocommon.p373d;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.p062a.p063a.C2338a;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.videocommon.download.C9563g;
import com.mbridge.msdk.videocommon.p371b.C9539a;
import com.mbridge.msdk.videocommon.p371b.C9540b;
import com.mbridge.msdk.videocommon.p371b.C9541c;
import com.mbridge.msdk.videocommon.p372c.C9542a;
import com.mbridge.msdk.videocommon.p372c.C9547c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.d.b */
/* compiled from: RewardSettingManager */
public class C9549b {

    /* renamed from: a */
    public static C9548a f23411a = null;

    /* renamed from: c */
    private static Map<String, C9551c> f23412c = new HashMap();

    /* renamed from: e */
    private static C9549b f23413e;

    /* renamed from: b */
    private Object f23414b = new Object();

    /* renamed from: d */
    private boolean f23415d = false;

    private C9549b() {
    }

    /* renamed from: a */
    public static C9549b m27299a() {
        if (f23413e == null) {
            synchronized (C9549b.class) {
                if (f23413e == null) {
                    f23413e = new C9549b();
                }
            }
        }
        return f23413e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.mbridge.msdk.videocommon.p373d.C9548a mo63129b() {
        /*
            r7 = this;
            com.mbridge.msdk.videocommon.d.a r0 = f23411a
            if (r0 != 0) goto L_0x0077
            com.mbridge.msdk.foundation.a.a.a r0 = com.mbridge.msdk.foundation.p062a.p063a.C2338a.m5535a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "reward_"
            r1.append(r2)
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r2 = r2.mo15793h()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.mo15735b(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0060
            com.mbridge.msdk.videocommon.d.a r0 = com.mbridge.msdk.videocommon.p373d.C9548a.m27280a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0044
            long r1 = r0.mo63109b()
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.mo63119g()
            long r5 = r5 + r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0044
            r1 = 0
            goto L_0x0045
        L_0x0044:
            r1 = 1
        L_0x0045:
            if (r1 != 0) goto L_0x0048
            return r0
        L_0x0048:
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r0 = r0.mo15793h()
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r1 = r1.mo15794i()
            r7.m27302b(r0, r1)
            com.mbridge.msdk.videocommon.d.a r0 = r7.mo63130c()
            return r0
        L_0x0060:
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r0 = r0.mo15793h()
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r1 = r1.mo15794i()
            r7.m27302b(r0, r1)
            com.mbridge.msdk.videocommon.d.a r0 = r7.mo63130c()
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.p373d.C9549b.mo63129b():com.mbridge.msdk.videocommon.d.a");
    }

    /* renamed from: b */
    private void m27302b(String str, String str2) {
        if (!this.f23415d) {
            this.f23415d = true;
            new C9542a().mo63102a(C2350a.m5601e().mo15792g(), str, str2);
        }
    }

    /* renamed from: a */
    public final void mo63127a(String str, String str2, String str3, C9547c cVar) {
        new C9542a().mo63103a(C2350a.m5601e().mo15792g(), str, str2, str3, cVar);
    }

    /* renamed from: a */
    public final C9551c mo63123a(String str, String str2) {
        synchronized (this.f23414b) {
            String str3 = "reward" + "_" + str + "_" + str2;
            if (f23412c.containsKey(str3)) {
                C9551c cVar = f23412c.get(str3);
                return cVar;
            }
            C9551c c = C9551c.m27316c(C2338a.m5535a().mo15735b(str3));
            if (m27300a(c)) {
                return null;
            }
            f23412c.put(str3, c);
            return c;
        }
    }

    /* renamed from: a */
    public final C9551c mo63124a(String str, String str2, boolean z) {
        synchronized (this.f23414b) {
            String str3 = "reward_" + str + "_" + str2;
            if (f23412c.containsKey(str3)) {
                C9551c cVar = f23412c.get(str3);
                return cVar;
            }
            C9551c c = C9551c.m27316c(C2338a.m5535a().mo15735b(str3));
            if (!m27300a(c)) {
                f23412c.put(str3, c);
                return c;
            } else if (c != null) {
                return c;
            } else {
                C9551c b = m27301b(z);
                return b;
            }
        }
    }

    /* renamed from: c */
    public final C9548a mo63130c() {
        C9548a aVar = new C9548a();
        HashMap hashMap = new HashMap(5);
        hashMap.put("1", 1000);
        hashMap.put("9", 1000);
        hashMap.put("8", 1000);
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("1", new C9541c("Virtual Item", 1));
        aVar.mo63108a((Map<String, Integer>) hashMap);
        aVar.mo63111b((Map<String, C9541c>) hashMap2);
        aVar.mo63107a(43200);
        aVar.mo63110b(5400);
        aVar.mo63113c(3600);
        aVar.mo63115d(3600);
        aVar.mo63117e(5);
        aVar.mo63106a(1);
        return aVar;
    }

    /* renamed from: a */
    private final boolean m27300a(C9551c cVar) {
        C9548a b = mo63129b();
        if (b == null || cVar == null) {
            return true;
        }
        return cVar.mo63182v() + b.mo63112c() <= System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo63126a(String str, String str2, String str3) {
        synchronized (this.f23414b) {
            String str4 = "reward_" + str + "_" + str2;
            C2338a.m5535a().mo15733a(str4, str3);
            f23412c.put(str4, C9551c.m27316c(str3));
            if (!TextUtils.isEmpty(C9551c.f23420a)) {
                m27304c(C9551c.f23420a, str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo63125a(String str) {
        if (!TextUtils.isEmpty(str)) {
            m27299a().mo63124a(C2350a.m5601e().mo15793h(), str, false);
            String str2 = C9551c.f23420a;
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(C9563g.m27460a().mo63242b(str2))) {
                m27304c(str2, str);
            }
        }
    }

    /* renamed from: c */
    private void m27304c(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            Context g = C2350a.m5601e().mo15792g();
            C8542e.m24701a(g, str, str2, 2, "alert url is exception ,url:" + str);
            return;
        }
        C9563g.m27460a().mo63243b(str, new C9563g.C9571d() {
            /* renamed from: a */
            public final void mo57995a(String str) {
                C8542e.m24701a(C2350a.m5601e().mo15792g(), str, str2, 1, "");
            }

            /* renamed from: a */
            public final void mo57996a(String str, String str2) {
                C8542e.m24701a(C2350a.m5601e().mo15792g(), str, str2, 2, str2);
            }
        });
    }

    /* renamed from: a */
    public final void mo63128a(boolean z) {
        this.f23415d = z;
    }

    /* renamed from: b */
    public static boolean m27303b(String str) {
        JSONArray optJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (optJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String optString = optJSONArray.optJSONObject(0).optString("unitId");
                if (optJSONArray == null || optJSONArray.length() <= 0 || TextUtils.isEmpty(optString)) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private static C9551c m27301b(boolean z) {
        C9551c cVar = new C9551c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C9540b(1, 15, (C9539a) null));
            cVar.mo63140a((List<C9540b>) arrayList);
            cVar.mo63165m(1);
            cVar.mo63163l(1);
            cVar.mo63167n(1);
            cVar.mo63173q(1);
            cVar.mo63169o(1);
            cVar.mo63171p(1);
            cVar.mo63155h(3);
            cVar.mo63157i(80);
            cVar.mo63159j(100);
            cVar.mo63161k(0);
            cVar.mo63153g(2);
            cVar.mo63149e(-1);
            cVar.mo63187x(70);
            cVar.mo63147d(2);
            if (z) {
                cVar.mo63145c(5);
            } else {
                cVar.mo63145c(-1);
            }
            cVar.mo63142b(0);
            cVar.mo63137a(0);
            cVar.mo63151f(1);
            cVar.mo63175r(1);
            cVar.mo63179t(3);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(4);
            arrayList2.add(6);
            cVar.mo63139a((ArrayList<Integer>) arrayList2);
            cVar.mo63181u(1);
            cVar.mo63183v(1);
            cVar.mo63185w(60);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cVar;
    }
}
