package com.bytedance.sdk.openadsdk.core.p155i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2535b;
import com.bytedance.sdk.component.p110d.p113c.p117b.C2859a;
import com.bytedance.sdk.component.p120e.p121a.C2912a;
import com.bytedance.sdk.component.p120e.p122b.C2918c;
import com.bytedance.sdk.component.p120e.p122b.C2919d;
import com.bytedance.sdk.component.p120e.p123c.C2927d;
import com.bytedance.sdk.component.p120e.p124d.C2933b;
import com.bytedance.sdk.component.p120e.p124d.C2938c;
import com.bytedance.sdk.component.utils.C2958a;
import com.bytedance.sdk.component.utils.C2963e;
import com.bytedance.sdk.component.utils.C2964f;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3538j;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.p130b.C3166i;
import com.bytedance.sdk.openadsdk.p135c.C3217d;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C3985e;
import com.bytedance.sdk.openadsdk.utils.C4006n;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.com.bytedance.overseas.sdk.p187b.C4028a;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.i.d */
/* compiled from: SdkSettingsHelper */
public class C3533d implements Runnable {

    /* renamed from: d */
    private static final AtomicLong f8796d = new AtomicLong(0);

    /* renamed from: e */
    private static volatile C3533d f8797e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile boolean f8798f = false;

    /* renamed from: g */
    private static boolean f8799g = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3531b f8800a;

    /* renamed from: b */
    private final Context f8801b;

    /* renamed from: c */
    private final Executor f8802c;

    /* renamed from: com.bytedance.sdk.openadsdk.core.i.d$a */
    /* compiled from: SdkSettingsHelper */
    private class C3535a extends BroadcastReceiver {
        private C3535a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                int intExtra = intent.getIntExtra(C2933b.b1655274989200dc("b^opcZoc"), -1);
                if (intExtra == 1) {
                    long longExtra = intent.getLongExtra(C2933b.b1655274989200dc("b^opcZrnel"), -1);
                    if (longExtra > 0) {
                        C3533d.m10959d().set(longExtra);
                    }
                } else if (intExtra == 2) {
                    try {
                        if (C3533d.this.f8800a != null) {
                            C3533d.this.f8800a.mo19908a();
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private C3533d(C3531b bVar) {
        this.f8800a = bVar == null ? C3578m.m11241h() : bVar;
        this.f8801b = C3578m.m11231a();
        this.f8802c = Executors.newSingleThreadExecutor();
        if (C3953b.m12901c()) {
            try {
                this.f8801b.registerReceiver(new C3535a(), new IntentFilter(C2859a.a1655274989226dc("cno-f|rblhdhi#auswgq}9k|nousyMEBGJR@T")));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static int m10947a(Context context) {
        if (context == null || !m10958c(context)) {
            return -2;
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(C2938c.c1655274989199dc("I@@WGCY`lyxJ|}bfub"), -1);
    }

    /* renamed from: a */
    public static C3533d m10949a(C3531b bVar) {
        Class<C3533d> cls = C3533d.class;
        if (f8797e == null) {
            synchronized (cls) {
                if (f8797e == null) {
                    f8797e = new C3533d(bVar);
                }
            }
        }
        return f8797e;
    }

    /* renamed from: a */
    private JSONObject m10950a(JSONObject jSONObject) {
        return f8799g ? C2958a.m8335a(jSONObject) : jSONObject;
    }

    /* renamed from: a */
    public static void m10951a() {
        try {
            Context a = C3578m.m11231a();
            File file = new File(Build.VERSION.SDK_INT >= 24 ? new File(a.getDataDir(), C2927d.d1655274989178dc("sicqaaYwzllx")) : new File(a.getDatabasePath(C2927d.d1655274989178dc("1")).getParentFile().getParentFile(), C2927d.d1655274989178dc("sicqaaYwzllx")), C2927d.d1655274989178dc("tu]p`nYtm}~bbj}!h|~"));
            if (file.exists()) {
                if (file.isFile()) {
                    String replace = file.getName().replace(C2927d.d1655274989178dc(".yoo"), "");
                    if (Build.VERSION.SDK_INT >= 24) {
                        a.deleteSharedPreferences(replace);
                    } else {
                        a.getSharedPreferences(replace, 0).edit().clear().apply();
                        C2964f.m8359c(file);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m10952a(long j) {
        if (j > 0 && C3578m.m11231a() != null) {
            try {
                Intent intent = new Intent();
                intent.setAction(C2859a.a1655274989226dc("cno-f|rblhdhi#auswgq}9k|nousyMEBGJR@T"));
                intent.putExtra(C2859a.a1655274989226dc("b^opcZoc"), 1);
                intent.putExtra(C2859a.a1655274989226dc("b^opcZrnel"), j);
                C3578m.m11231a().sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10954a(String str, Map<String, String> map) {
        int i = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                int intValue = Integer.valueOf(map.get(C2975l.l1655274989215dc("abvjr`+dgg~yca"))).intValue();
                long longValue = Long.valueOf(map.get(C2975l.l1655274989215dc("tr"))).longValue();
                String str2 = map.get(C2975l.l1655274989215dc("prv"));
                String a = C2535b.m6426a(str + intValue + longValue);
                if (a != null && a.equalsIgnoreCase(str2)) {
                    i = intValue;
                }
            }
        } catch (Throwable unused) {
        }
        C3536e.m10967a(i);
    }

    /* renamed from: b */
    public static String m10955b(Context context) {
        return context != null ? PreferenceManager.getDefaultSharedPreferences(context).getString(C3537f.f8807b, "") : "";
    }

    /* renamed from: b */
    public static void m10956b() {
        if (C3578m.m11231a() != null) {
            try {
                Intent intent = new Intent();
                intent.setAction(C2859a.a1655274989226dc("cno-f|rblhdhi#auswgq}9k|nousyMEBGJR@T"));
                intent.putExtra(C2859a.a1655274989226dc("b^opcZoc"), 2);
                C3578m.m11231a().sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ boolean m10957b(boolean r3) {
        /*
        L_0x0000:
            r0 = 94
            r1 = 75
            r2 = 93
        L_0x0006:
            switch(r0) {
                case 92: goto L_0x000e;
                case 93: goto L_0x0011;
                case 94: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x001c
        L_0x000a:
            r0 = 4
            if (r1 > r0) goto L_0x0016
            goto L_0x001c
        L_0x000e:
            switch(r1) {
                case 21: goto L_0x0016;
                case 22: goto L_0x0015;
                case 23: goto L_0x0015;
                default: goto L_0x0011;
            }
        L_0x0011:
            switch(r1) {
                case 91: goto L_0x0000;
                case 92: goto L_0x0016;
                case 93: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0019
        L_0x0015:
            return r3
        L_0x0016:
            f8798f = r3
            goto L_0x001c
        L_0x0019:
            r1 = 91
            goto L_0x0011
        L_0x001c:
            r0 = r2
            r1 = r0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p155i.C3533d.m10957b(boolean):boolean");
    }

    /* renamed from: c */
    private static boolean m10958c(Context context) {
        if (context == null) {
            return true;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return (defaultSharedPreferences.getInt(C2938c.c1655274989199dc("I@@WGCYDeyYogDJ"), Integer.MIN_VALUE) == Integer.MIN_VALUE && defaultSharedPreferences.getInt(C2938c.c1655274989199dc("I@@WGCYDeyYog[k}cx}}"), Integer.MIN_VALUE) == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: d */
    static /* synthetic */ AtomicLong m10959d() {
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        if (c2 > 4) {
                            break;
                        } else {
                            continue;
                        }
                }
                while (true) {
                    switch (c2) {
                        case '[':
                        case ']':
                            break;
                        case '\\':
                            break;
                        default:
                            c2 = '[';
                    }
                }
                c = '^';
                c2 = 'K';
            }
        }
        return f8796d;
    }

    /* renamed from: f */
    private boolean m10961f() {
        return TextUtils.isEmpty(C3524h.m10852d().mo19854f());
    }

    /* renamed from: g */
    private JSONObject m10962g() {
        JSONObject jSONObject = new JSONObject();
        int i = 1;
        C4014u.m13192a(jSONObject, true);
        try {
            int j = C3524h.m10852d().mo19860j();
            String l1655274989215dc = C2975l.l1655274989215dc("sdvwmka");
            C2975l.m8384b(l1655274989215dc, C2975l.l1655274989215dc("Sdvwmkat  $bJjbDavf5+") + C3578m.m11241h().mo19974x());
            jSONObject.put(C2975l.l1655274989215dc("mnffh"), Build.MODEL);
            jSONObject.put(C2975l.l1655274989215dc("ddtjg`Yda}s"), C4014u.m13255n());
            C3537f h = C3578m.m11241h();
            if (h.mo19966p(C2975l.l1655274989215dc("g`kg"))) {
                jSONObject.put(C3166i.i1655274989219dc("g`kg"), C4028a.m13343a().mo20936b());
            }
            jSONObject.put(C2975l.l1655274989215dc("gerq"), j);
            jSONObject.put(C2975l.l1655274989215dc("cnrse"), C3524h.m10852d().mo19859i());
            jSONObject.put(C2975l.l1655274989215dc("cbrb"), C3524h.m10852d().mo19872v());
            String l1655274989215dc2 = C2975l.l1655274989215dc("SeiPaqrnfnyCia~jb");
            C2975l.m8387c(l1655274989215dc2, C2975l.l1655274989215dc("cnrse%;") + C3524h.m10852d().mo19859i());
            if (h.mo19966p(C3166i.i1655274989219dc("mba"))) {
                jSONObject.put(C3166i.i1655274989219dc("mba"), C4006n.m13149b());
            }
            jSONObject.put(C3166i.i1655274989219dc("cnlm[qwm"), C4014u.m13261p(this.f8801b));
            jSONObject.put(C3166i.i1655274989219dc("or"), 1);
            jSONObject.put(C3166i.i1655274989219dc("owgqw`gX~lxxeb`Pdhbv"), 1);
            jSONObject.put(C3166i.i1655274989219dc("or]uawungg"), String.valueOf(Build.VERSION.RELEASE));
            jSONObject.put(C3166i.i1655274989219dc("sei\\r`ttafd"), C3166i.i1655274989219dc("4/7-4+2"));
            jSONObject.put(C3166i.i1655274989219dc("l`ldqdab"), C3538j.m11044a());
            jSONObject.put(C3166i.i1655274989219dc("thof[iim"), C4014u.m13263q());
            jSONObject.put(C3166i.i1655274989219dc("p`ahebcXfhgn"), C4014u.m13214d());
            boolean c = C4014u.m13209c(this.f8801b, C4014u.m13214d());
            String i1655274989219dc = C3166i.i1655274989219dc("irCstiodi}cdbKa}uv`|a{r");
            C2975l.m8387c(i1655274989219dc, C3166i.i1655274989219dc("irCstiodi}cdbKa}uv`|a{r-") + c);
            String i1655274989219dc2 = C3166i.i1655274989219dc("pnqjplii");
            if (!c) {
                i = 2;
            }
            jSONObject.put(i1655274989219dc2, i);
            jSONObject.put(C3166i.i1655274989219dc("aqr\\r`ttafd"), C4014u.m13226f());
            jSONObject.put(C3166i.i1655274989219dc("vdlgkw"), Build.MANUFACTURER);
            jSONObject.put(C3166i.i1655274989219dc("utkg"), C3538j.m11049c(this.f8801b));
            if (!(C3524h.m10852d() == null || C3524h.m10852d().mo19854f() == null)) {
                jSONObject.put(C3166i.i1655274989219dc("aqr\\ma"), C3524h.m10852d().mo19854f());
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put(C3166i.i1655274989219dc("tr"), currentTimeMillis);
            String str = "";
            if (!(C3524h.m10852d() == null || C3524h.m10852d().mo19854f() == null)) {
                str = C3524h.m10852d().mo19854f().concat(String.valueOf(currentTimeMillis)).concat(C3166i.i1655274989219dc("4/7-4+2"));
            }
            jSONObject.put(C3166i.i1655274989219dc("rds\\wlai"), C2963e.m8350a(str));
            jSONObject.put(C3166i.i1655274989219dc("tbqwvlh`"), m10955b(this.f8801b));
            jSONObject.put(C3166i.i1655274989219dc("tbd\\cavu"), m10947a(this.f8801b));
            jSONObject.put(C3166i.i1655274989219dc("llv"), C3985e.m13056b());
            jSONObject.put(C3166i.i1655274989219dc("lnabh`Ykigm~mjk"), C3985e.m13062c());
            jSONObject.put(C3166i.i1655274989219dc("cicmj`j"), C3166i.i1655274989219dc("m`km"));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo19910a(boolean z) {
        try {
            if (!m10961f()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (z || currentTimeMillis - f8796d.get() >= 600000) {
                    f8796d.set(currentTimeMillis);
                    if (C3953b.m12901c()) {
                        m10952a(currentTimeMillis);
                    }
                    this.f8802c.execute(this);
                }
            }
        } catch (Throwable th) {
            C2975l.m8379a(C2975l.l1655274989215dc("SeiPaqrnfnyCia~jb"), C2975l.l1655274989215dc("lncg$vbl(zoxd`hc1wafzd-8"), th);
        }
    }

    /* renamed from: c */
    public void mo19911c() {
        C3985e.m13071g();
    }

    public void run() {
        if (!C2979o.m8406a(this.f8801b)) {
            try {
                this.f8800a.mo19908a();
            } catch (Throwable unused) {
            }
        } else if (!m10961f()) {
            C2975l.m8387c(C2975l.l1655274989215dc("SeiPaqrnfnyCia~jb"), C2975l.l1655274989215dc("Fdv`l%ub|}cek-|jadw``5ecykn"));
            JSONObject g = m10962g();
            C2919d b = C3854d.m12660a().mo20705b().mo17761b();
            try {
                b.mo17789a(C3217d.m9387a(b, C4014u.m13231g(C2975l.l1655274989215dc("/`rj+db(}gcdb\"}k{>av`ayj5"))));
                b.mo17792b(C2975l.l1655274989215dc("Urgq)Dabf}"), C4014u.m13197b());
            } catch (Exception unused2) {
            }
            b.mo17799c(m10950a(g).toString());
            b.mo17797a((C2912a) new C2912a() {
                /* JADX WARNING: Can't fix incorrect switch cases order */
                /* JADX WARNING: Can't wrap try/catch for region: R(9:12|(2:14|(3:16|17|18))|21|22|23|24|(3:26|42|30)|38|(2:41|44)(1:45)) */
                /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
                    com.bytedance.sdk.openadsdk.core.p155i.C3533d.m10957b(true);
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
                /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
                /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void mo17771a(com.bytedance.sdk.component.p120e.p122b.C2918c r6, com.bytedance.sdk.component.p120e.C2913b r7) {
                    /*
                        r5 = this;
                        r6 = 5
                        if (r7 == 0) goto L_0x0081
                        boolean r0 = r7.mo17779f()
                        if (r0 == 0) goto L_0x0081
                        java.lang.String r0 = r7.mo17777d()
                        java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                        boolean r0 = android.text.TextUtils.isEmpty(r0)
                        if (r0 != 0) goto L_0x0081
                        r0 = 0
                        org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0020 }
                        java.lang.String r2 = r7.mo17777d()     // Catch:{ JSONException -> 0x0020 }
                        r1.<init>(r2)     // Catch:{ JSONException -> 0x0020 }
                        goto L_0x0027
                    L_0x0020:
                        r1 = move-exception
                        org.json.JSONException r1 = (org.json.JSONException) r1
                        r1.printStackTrace()
                        r1 = r0
                    L_0x0027:
                        if (r1 == 0) goto L_0x0081
                        java.lang.String r2 = "cxrkaw"
                        java.lang.String r2 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r2)
                        r3 = -1
                        int r2 = r1.optInt(r2, r3)
                        r3 = 3
                        if (r2 != r3) goto L_0x0065
                        java.lang.String r0 = "mdqpebc"
                        java.lang.String r0 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r0)
                        java.lang.String r0 = r1.optString(r0)
                        java.lang.String r0 = com.bytedance.sdk.component.utils.C2958a.m8337b(r0)
                        r2 = r0
                        java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                        boolean r2 = android.text.TextUtils.isEmpty(r2)
                        if (r2 != 0) goto L_0x0065
                        org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0055 }
                        r2.<init>(r0)     // Catch:{ all -> 0x0055 }
                        r1 = r2
                        goto L_0x0065
                    L_0x0055:
                        r2 = move-exception
                        java.lang.String r3 = "SeiPaqrnfnyCia~jb"
                        java.lang.String r3 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r3)
                        java.lang.String r4 = "sdvwmka'lh~j,h|}c )4"
                        java.lang.String r4 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r4)
                        com.bytedance.sdk.component.utils.C2975l.m8379a(r3, r4, r2)
                    L_0x0065:
                        java.util.Map r7 = r7.mo17776c()     // Catch:{ all -> 0x006e }
                        com.bytedance.sdk.openadsdk.core.i.d r2 = com.bytedance.sdk.openadsdk.core.p155i.C3533d.this     // Catch:{ all -> 0x006e }
                        r2.m10954a(r0, r7)     // Catch:{ all -> 0x006e }
                    L_0x006e:
                        com.bytedance.sdk.openadsdk.core.i.d r7 = com.bytedance.sdk.openadsdk.core.p155i.C3533d.this     // Catch:{ all -> 0x009b }
                        com.bytedance.sdk.openadsdk.core.i.b r7 = r7.f8800a     // Catch:{ all -> 0x009b }
                        r7.mo19909a(r1)     // Catch:{ all -> 0x009b }
                        boolean r7 = com.bytedance.sdk.openadsdk.core.p155i.C3533d.f8798f     // Catch:{ all -> 0x009b }
                        if (r7 != 0) goto L_0x009b
                        r7 = 11
                        r0 = r7
                        goto L_0x00a5
                    L_0x0081:
                        com.bytedance.sdk.openadsdk.core.i.d r7 = com.bytedance.sdk.openadsdk.core.p155i.C3533d.this     // Catch:{ all -> 0x00a8 }
                        com.bytedance.sdk.openadsdk.core.i.b r7 = r7.f8800a     // Catch:{ all -> 0x00a8 }
                        r7.mo19908a()     // Catch:{ all -> 0x00a8 }
                        r7 = 64
                        r0 = r6
                    L_0x008d:
                        switch(r7) {
                            case 63: goto L_0x0097;
                            case 64: goto L_0x0091;
                            case 65: goto L_0x0097;
                            default: goto L_0x0090;
                        }
                    L_0x0090:
                        goto L_0x00a5
                    L_0x0091:
                        r7 = 4
                        if (r0 == r7) goto L_0x0097
                        if (r0 == r6) goto L_0x00a8
                        r6 = 6
                    L_0x0097:
                        r6 = 1
                        com.bytedance.sdk.openadsdk.core.p155i.C3533d.m10957b((boolean) r6)     // Catch:{ all -> 0x009b }
                    L_0x009b:
                        boolean r6 = com.bytedance.sdk.openadsdk.multipro.C3953b.m12901c()
                        if (r6 == 0) goto L_0x00a4
                        com.bytedance.sdk.openadsdk.core.p155i.C3533d.m10956b()
                    L_0x00a4:
                        return
                    L_0x00a5:
                        r7 = 63
                        goto L_0x008d
                    L_0x00a8:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p155i.C3533d.C35341.mo17771a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                }

                /* renamed from: a */
                public void mo17772a(C2918c cVar, IOException iOException) {
                    try {
                        C3533d.this.f8800a.mo19908a();
                    } catch (Throwable unused) {
                    }
                }
            });
        } else {
            return;
        }
        mo19911c();
    }
}
