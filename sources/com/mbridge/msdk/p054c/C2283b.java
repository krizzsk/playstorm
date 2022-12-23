package com.mbridge.msdk.p054c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.p062a.p063a.C2338a;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.tools.C8554aa;
import java.util.HashMap;

/* renamed from: com.mbridge.msdk.c.b */
/* compiled from: SettingManager */
public class C2283b {

    /* renamed from: a */
    public static final String f4622a = C2283b.class.getSimpleName();

    /* renamed from: b */
    private static C2283b f4623b = null;

    /* renamed from: c */
    private static HashMap<String, C2294d> f4624c = new HashMap<>();

    /* renamed from: d */
    private static volatile C2278a f4625d = null;

    private C2283b() {
    }

    /* renamed from: a */
    public static synchronized C2283b m5275a() {
        C2283b bVar;
        synchronized (C2283b.class) {
            if (f4623b == null) {
                f4623b = new C2283b();
            }
            bVar = f4623b;
        }
        return bVar;
    }

    /* renamed from: a */
    public final boolean mo15559a(String str) {
        C2278a b = mo15563b(str);
        if (b == null) {
            return true;
        }
        return b.mo15445S() + (b.mo15444R() * 1000) <= System.currentTimeMillis();
    }

    /* renamed from: a */
    public final boolean mo15560a(String str, int i, String str2) {
        try {
            Context g = C2350a.m5601e().mo15792g();
            String str3 = str + "_" + i + "_" + str2;
            long currentTimeMillis = System.currentTimeMillis();
            long j = 0;
            long longValue = ((Long) C8554aa.m24733b(g, str3, 0L)).longValue();
            C2278a b = mo15563b(str);
            if (b == null) {
                b = m5275a().mo15562b();
            } else {
                j = longValue;
            }
            if (j + (b.mo15438L() * 1000) > currentTimeMillis) {
                return false;
            }
            C8554aa.m24732a(g, str3, Long.valueOf(currentTimeMillis));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo15561a(String str, String str2) {
        C2278a b = mo15563b(str2);
        if (mo15559a(str2) && mo15560a(str2, 1, str)) {
            new C2290c().mo15579a(C2350a.m5601e().mo15792g(), str2, C2350a.m5601e().mo15794i());
        }
        C2294d e = mo15569e(str2, str);
        if (!(b == null || e == null)) {
            if (e.mo15606t() + (b.mo15440N() * 1000) > System.currentTimeMillis()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo15564b(String str, String str2) {
        C2338a.m5535a().mo15733a(str, str2);
        f4625d = C2278a.m5142c(str2);
        if (f4625d != null) {
            f4625d.mo15463ab();
        }
    }

    /* renamed from: b */
    public final C2278a mo15563b(String str) {
        if (f4625d == null) {
            try {
                f4625d = C2278a.m5142c(C2338a.m5535a().mo15735b(str));
                if (f4625d != null) {
                    f4625d.mo15463ab();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return f4625d;
    }

    /* renamed from: c */
    public final String mo15566c(String str) {
        if (str == null) {
            return "";
        }
        try {
            String b = C2338a.m5535a().mo15735b(str);
            return b == null ? "" : b;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022 A[SYNTHETIC, Splitter:B:8:0x0022] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5276a(android.content.Context r5, java.lang.String r6) {
        /*
            com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C2358b.m5644a()
            boolean r0 = r0.mo15829d()
            java.lang.String r1 = "mbridge"
            r2 = 0
            if (r0 == 0) goto L_0x001d
            com.mbridge.msdk.foundation.tools.FastKV$Builder r0 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch:{ Exception -> 0x001d }
            com.mbridge.msdk.foundation.same.b.c r3 = com.mbridge.msdk.foundation.same.p300b.C8420c.MBRIDGE_700_CONFIG     // Catch:{ Exception -> 0x001d }
            java.lang.String r3 = com.mbridge.msdk.foundation.same.p300b.C8422e.m24335b(r3)     // Catch:{ Exception -> 0x001d }
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x001d }
            com.mbridge.msdk.foundation.tools.FastKV r0 = r0.build()     // Catch:{ Exception -> 0x001d }
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            java.lang.String r3 = "_"
            if (r0 == 0) goto L_0x0066
            java.util.Map r2 = r0.getAll()     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            if (r2 == 0) goto L_0x00ac
            java.util.Set r5 = r2.keySet()     // Catch:{ Exception -> 0x0061 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0061 }
        L_0x0030:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x0061 }
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r5.next()     // Catch:{ Exception -> 0x0061 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0061 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061 }
            r1.<init>()     // Catch:{ Exception -> 0x0061 }
            r1.append(r6)     // Catch:{ Exception -> 0x0061 }
            r1.append(r3)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0061 }
            boolean r1 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0061 }
            if (r1 == 0) goto L_0x0030
            java.util.HashMap<java.lang.String, com.mbridge.msdk.c.d> r1 = f4624c     // Catch:{ Exception -> 0x0061 }
            java.lang.Object r4 = r2.get(r0)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0061 }
            com.mbridge.msdk.c.d r4 = com.mbridge.msdk.p054c.C2294d.m5323b((java.lang.String) r4)     // Catch:{ Exception -> 0x0061 }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0061 }
            goto L_0x0030
        L_0x0061:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x00ac
        L_0x0066:
            r0 = 0
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r1, r0)     // Catch:{ Exception -> 0x00a8 }
            java.util.Map r5 = r5.getAll()     // Catch:{ Exception -> 0x00a8 }
            java.util.Set r0 = r5.keySet()     // Catch:{ Exception -> 0x00a8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00a8 }
        L_0x0077:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x00a8 }
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00a8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8 }
            r2.<init>()     // Catch:{ Exception -> 0x00a8 }
            r2.append(r6)     // Catch:{ Exception -> 0x00a8 }
            r2.append(r3)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00a8 }
            boolean r2 = r1.startsWith(r2)     // Catch:{ Exception -> 0x00a8 }
            if (r2 == 0) goto L_0x0077
            java.util.HashMap<java.lang.String, com.mbridge.msdk.c.d> r2 = f4624c     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r4 = r5.get(r1)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00a8 }
            com.mbridge.msdk.c.d r4 = com.mbridge.msdk.p054c.C2294d.m5323b((java.lang.String) r4)     // Catch:{ Exception -> 0x00a8 }
            r2.put(r1, r4)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x0077
        L_0x00a8:
            r5 = move-exception
            r5.printStackTrace()
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.p054c.C2283b.m5276a(android.content.Context, java.lang.String):void");
    }

    /* renamed from: c */
    public final C2294d mo15565c(String str, String str2) {
        C2294d e = mo15569e(str, str2);
        return e == null ? C2294d.m5328k() : e;
    }

    /* renamed from: e */
    public final C2294d mo15569e(String str, String str2) {
        C2294d g = m5277g(str, str2);
        if (g != null && g.mo15596i() == 0) {
            g.mo15589c(1);
        }
        return g;
    }

    /* renamed from: g */
    private C2294d m5277g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = C2350a.m5601e().mo15793h();
        }
        String str3 = str + "_" + str2;
        C2294d dVar = null;
        if (f4624c.containsKey(str3)) {
            return f4624c.get(str3);
        }
        try {
            dVar = C2294d.m5323b(C2338a.m5535a().mo15735b(str3));
            f4624c.put(str3, dVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dVar;
    }

    /* renamed from: f */
    public final C2294d mo15572f(String str, String str2) {
        return m5277g(str, str2);
    }

    /* renamed from: a */
    public final void mo15558a(String str, String str2, String str3) {
        String str4 = str + "_" + str2;
        C2338a.m5535a().mo15733a(str4, str3);
        f4624c.put(str4, C2294d.m5323b(str3));
    }

    /* renamed from: d */
    public final String mo15568d(String str) {
        C2338a a = C2338a.m5535a();
        return a.mo15735b("ivreward_" + str);
    }

    /* renamed from: e */
    public final void mo15570e(String str) {
        C2338a a = C2338a.m5535a();
        a.mo15736c("ivreward_" + str);
    }

    /* renamed from: b */
    public final C2278a mo15562b() {
        C2278a aVar = new C2278a();
        aVar.mo15532r(1);
        aVar.mo15501d(true);
        aVar.mo15495c(3600);
        aVar.mo15499d(0);
        aVar.mo15496c(false);
        aVar.mo15492b(false);
        aVar.mo15455a(7200);
        aVar.mo15491b("mbridge");
        aVar.mo15528p(1);
        aVar.mo15490b(1800);
        aVar.mo15530q(259200);
        aVar.mo15504e(10);
        aVar.mo15518k(1);
        aVar.mo15516j(1);
        aVar.mo15520l(1);
        aVar.mo15522m(0);
        aVar.mo15524n(1);
        aVar.mo15526o(-1);
        aVar.mo15494c(0);
        aVar.mo15505e("https://cdn-adn-https.rayjump.com/cdn-adn/v2/portal/19/08/20/11/06/5d5b63cb457e2.js");
        aVar.mo15500d("https://mtg-native.rayjump.com/omsdk/omsdkjs_common_js.txt");
        aVar.mo15489b(120);
        aVar.mo15506e(false);
        aVar.mo15534s(0);
        aVar.mo15536t(120);
        aVar.mo15539u(1);
        aVar.mo15510g(C8413a.f20341w);
        aVar.mo15508f(C8413a.f20343y);
        aVar.mo15503e(C8413a.f20342x);
        aVar.mo15454a(10);
        aVar.mo15512h(C8413a.f20344z);
        aVar.mo15498d(10);
        aVar.mo15543w(0);
        aVar.mo15541v(0);
        aVar.mo15456a("");
        aVar.mo15545x(1);
        aVar.mo15457a(false);
        return aVar;
    }

    /* renamed from: f */
    public final C2278a mo15571f(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return mo15562b();
            }
            C2278a b = mo15563b(str);
            if (b == null) {
                return mo15562b();
            }
            return b;
        } catch (Exception unused) {
            return mo15562b();
        }
    }

    /* renamed from: d */
    public final C2294d mo15567d(String str, String str2) {
        C2294d g = m5277g(str, str2);
        return g == null ? C2294d.m5328k() : g;
    }
}
