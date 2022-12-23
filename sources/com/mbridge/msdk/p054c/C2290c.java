package com.mbridge.msdk.p054c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.p062a.p063a.C2338a;
import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.p306b.C8454a;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8492b;
import com.mbridge.msdk.foundation.same.net.p311g.C8493c;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.p051a.C2265b;
import com.mbridge.msdk.p054c.p055a.C2282b;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.c.c */
/* compiled from: SettingRequestController */
public class C2290c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f4641a = C2290c.class.getSimpleName();

    /* renamed from: a */
    public final void mo15579a(final Context context, final String str, final String str2) {
        if (context != null) {
            C8494d dVar = new C8494d();
            dVar.mo57606a("app_id", str);
            dVar.mo57606a("sign", SameMD5.getMD5(str + str2));
            if (C8487d.m24492a().f20513E) {
                dVar.mo57606a("st_net", C8487d.m24492a().f20539i + "");
            }
            C22911 r1 = new C8493c() {
                /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|(1:10)) */
                /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
                    r4.getSharedPreferences("mb_optimization_setting", 0).edit().putInt("use_thread_pool", 0).apply();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:53:0x016c, code lost:
                    r10 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:54:0x016d, code lost:
                    r10.printStackTrace();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
                    if (r4 != null) goto L_0x002d;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0029 */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo15582a(org.json.JSONObject r10) {
                    /*
                        r9 = this;
                        java.lang.String r0 = "web_env_url"
                        java.lang.String r1 = "mraid_js"
                        java.lang.String r2 = "hst_st_t"
                        java.lang.String r3 = "hst_st"
                        java.lang.String r4 = "mb_optimization_setting"
                        java.lang.String r5 = "use_thread_pool"
                        if (r10 == 0) goto L_0x0159
                        r6 = 0
                        int r7 = r10.optInt(r5, r6)     // Catch:{ Exception -> 0x0029 }
                        android.content.Context r8 = r4     // Catch:{ Exception -> 0x0029 }
                        if (r8 == 0) goto L_0x003e
                        android.content.Context r8 = r4     // Catch:{ Exception -> 0x0029 }
                        android.content.SharedPreferences r8 = r8.getSharedPreferences(r4, r6)     // Catch:{ Exception -> 0x0029 }
                        android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ Exception -> 0x0029 }
                        android.content.SharedPreferences$Editor r7 = r8.putInt(r5, r7)     // Catch:{ Exception -> 0x0029 }
                        r7.apply()     // Catch:{ Exception -> 0x0029 }
                        goto L_0x003e
                    L_0x0029:
                        android.content.Context r7 = r4     // Catch:{ Exception -> 0x016c }
                        if (r7 == 0) goto L_0x003e
                        android.content.Context r7 = r4     // Catch:{ Exception -> 0x016c }
                        android.content.SharedPreferences r4 = r7.getSharedPreferences(r4, r6)     // Catch:{ Exception -> 0x016c }
                        android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Exception -> 0x016c }
                        android.content.SharedPreferences$Editor r4 = r4.putInt(r5, r6)     // Catch:{ Exception -> 0x016c }
                        r4.apply()     // Catch:{ Exception -> 0x016c }
                    L_0x003e:
                        java.lang.String r4 = "current_time"
                        long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x016c }
                        r10.put(r4, r5)     // Catch:{ Exception -> 0x016c }
                        com.mbridge.msdk.foundation.same.net.f.d r4 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x016c }
                        boolean r4 = r4.f20538h     // Catch:{ Exception -> 0x016c }
                        if (r4 == 0) goto L_0x0063
                        java.lang.String r3 = r10.optString(r2)     // Catch:{ Exception -> 0x016c }
                        boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x016c }
                        if (r3 == 0) goto L_0x0076
                        com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x016c }
                        java.lang.String r3 = r3.f20534d     // Catch:{ Exception -> 0x016c }
                        r10.put(r2, r3)     // Catch:{ Exception -> 0x016c }
                        goto L_0x0076
                    L_0x0063:
                        java.lang.String r2 = r10.optString(r3)     // Catch:{ Exception -> 0x016c }
                        boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x016c }
                        if (r2 == 0) goto L_0x0076
                        com.mbridge.msdk.foundation.same.net.f.d r2 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x016c }
                        java.lang.String r2 = r2.f20533c     // Catch:{ Exception -> 0x016c }
                        r10.put(r3, r2)     // Catch:{ Exception -> 0x016c }
                    L_0x0076:
                        com.mbridge.msdk.foundation.same.net.f.d r2 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x016c }
                        boolean r2 = r2.f20538h     // Catch:{ Exception -> 0x016c }
                        if (r2 == 0) goto L_0x0085
                        com.mbridge.msdk.foundation.same.net.f.d r2 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x016c }
                        java.lang.String r2 = r2.f20551u     // Catch:{ Exception -> 0x016c }
                        goto L_0x008b
                    L_0x0085:
                        com.mbridge.msdk.foundation.same.net.f.d r2 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x016c }
                        java.lang.String r2 = r2.f20546p     // Catch:{ Exception -> 0x016c }
                    L_0x008b:
                        com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ all -> 0x00e7 }
                        boolean r3 = r3.f20538h     // Catch:{ all -> 0x00e7 }
                        if (r3 == 0) goto L_0x00f3
                        com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ all -> 0x00e7 }
                        boolean r3 = r3.f20513E     // Catch:{ all -> 0x00e7 }
                        if (r3 == 0) goto L_0x00f3
                        com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ all -> 0x00e7 }
                        int r3 = r3.f20512D     // Catch:{ all -> 0x00e7 }
                        com.mbridge.msdk.foundation.same.net.f.d r4 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ all -> 0x00e7 }
                        java.util.ArrayList<java.lang.String> r4 = r4.f20515G     // Catch:{ all -> 0x00e7 }
                        int r4 = r4.size()     // Catch:{ all -> 0x00e7 }
                        if (r3 >= r4) goto L_0x00f3
                        com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ all -> 0x00e7 }
                        java.util.ArrayList<java.lang.String> r3 = r3.f20515G     // Catch:{ all -> 0x00e7 }
                        com.mbridge.msdk.foundation.same.net.f.d r4 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ all -> 0x00e7 }
                        int r4 = r4.f20512D     // Catch:{ all -> 0x00e7 }
                        java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00e7 }
                        java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00e7 }
                        boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00e7 }
                        if (r4 != 0) goto L_0x00f3
                        java.lang.String r4 = "http"
                        boolean r4 = r3.startsWith(r4)     // Catch:{ all -> 0x00e7 }
                        if (r4 != 0) goto L_0x00d5
                        java.lang.String r4 = "https"
                        boolean r4 = r3.startsWith(r4)     // Catch:{ all -> 0x00e7 }
                        if (r4 == 0) goto L_0x00f3
                    L_0x00d5:
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e7 }
                        r4.<init>()     // Catch:{ all -> 0x00e7 }
                        r4.append(r3)     // Catch:{ all -> 0x00e7 }
                        java.lang.String r3 = "/setting"
                        r4.append(r3)     // Catch:{ all -> 0x00e7 }
                        java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x00e7 }
                        goto L_0x00f3
                    L_0x00e7:
                        r3 = move-exception
                        java.lang.String r4 = com.mbridge.msdk.p054c.C2290c.f4641a     // Catch:{ Exception -> 0x016c }
                        java.lang.String r3 = r3.getMessage()     // Catch:{ Exception -> 0x016c }
                        com.mbridge.msdk.foundation.tools.C8608u.m24884d(r4, r3)     // Catch:{ Exception -> 0x016c }
                    L_0x00f3:
                        com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x016c }
                        int r3 = r3.f20539i     // Catch:{ Exception -> 0x016c }
                        com.mbridge.msdk.c.b r4 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ Exception -> 0x016c }
                        java.lang.String r5 = r5     // Catch:{ Exception -> 0x016c }
                        java.lang.String r6 = r10.toString()     // Catch:{ Exception -> 0x016c }
                        r4.mo15564b(r5, r6)     // Catch:{ Exception -> 0x016c }
                        com.mbridge.msdk.foundation.same.net.f.d r4 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x016c }
                        r4.mo57594c()     // Catch:{ Exception -> 0x016c }
                        java.lang.String r4 = r10.optString(r1)     // Catch:{ Exception -> 0x016c }
                        boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x016c }
                        if (r4 != 0) goto L_0x0124
                        com.mbridge.msdk.c.b.a r4 = com.mbridge.msdk.p054c.p056b.C2284a.m5293a()     // Catch:{ Exception -> 0x016c }
                        android.content.Context r5 = r4     // Catch:{ Exception -> 0x016c }
                        java.lang.String r1 = r10.optString(r1)     // Catch:{ Exception -> 0x016c }
                        r4.mo15573a((android.content.Context) r5, (java.lang.String) r1)     // Catch:{ Exception -> 0x016c }
                    L_0x0124:
                        java.lang.String r1 = r10.optString(r0)     // Catch:{ Exception -> 0x016c }
                        boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x016c }
                        if (r1 != 0) goto L_0x013b
                        com.mbridge.msdk.c.b.b r1 = com.mbridge.msdk.p054c.p056b.C2287b.m5301a()     // Catch:{ Exception -> 0x016c }
                        android.content.Context r4 = r4     // Catch:{ Exception -> 0x016c }
                        java.lang.String r10 = r10.optString(r0)     // Catch:{ Exception -> 0x016c }
                        r1.mo15576a((android.content.Context) r4, (java.lang.String) r10)     // Catch:{ Exception -> 0x016c }
                    L_0x013b:
                        com.mbridge.msdk.foundation.same.report.d r10 = new com.mbridge.msdk.foundation.same.report.d     // Catch:{ all -> 0x014c }
                        android.content.Context r0 = r4     // Catch:{ all -> 0x014c }
                        r10.<init>(r0)     // Catch:{ all -> 0x014c }
                        r10.mo57687a()     // Catch:{ all -> 0x014c }
                        r0 = 2
                        java.lang.String r1 = ""
                        r10.mo57688a((int) r0, (int) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x014c }
                        goto L_0x0162
                    L_0x014c:
                        r10 = move-exception
                        java.lang.String r0 = com.mbridge.msdk.p054c.C2290c.f4641a     // Catch:{ Exception -> 0x016c }
                        java.lang.String r10 = r10.getMessage()     // Catch:{ Exception -> 0x016c }
                        com.mbridge.msdk.foundation.tools.C8608u.m24884d(r0, r10)     // Catch:{ Exception -> 0x016c }
                        goto L_0x0162
                    L_0x0159:
                        java.lang.String r10 = com.mbridge.msdk.p054c.C2290c.f4641a     // Catch:{ Exception -> 0x016c }
                        java.lang.String r0 = "app setting is null"
                        com.mbridge.msdk.foundation.tools.C8608u.m24884d(r10, r0)     // Catch:{ Exception -> 0x016c }
                    L_0x0162:
                        com.mbridge.msdk.c.c r10 = com.mbridge.msdk.p054c.C2290c.this     // Catch:{ Exception -> 0x016c }
                        android.content.Context r0 = r4     // Catch:{ Exception -> 0x016c }
                        java.lang.String r1 = r5     // Catch:{ Exception -> 0x016c }
                        com.mbridge.msdk.p054c.C2290c.m5312a((com.mbridge.msdk.p054c.C2290c) r10, (android.content.Context) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x016c }
                        goto L_0x0170
                    L_0x016c:
                        r10 = move-exception
                        r10.printStackTrace()
                    L_0x0170:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.p054c.C2290c.C22911.mo15582a(org.json.JSONObject):void");
                }

                /* renamed from: a */
                public final void mo15581a(String str) {
                    String str2 = C8487d.m24492a().f20538h ? C8487d.m24492a().f20551u : C8487d.m24492a().f20546p;
                    try {
                        if (C8487d.m24492a().f20538h && C8487d.m24492a().f20513E && C8487d.m24492a().f20512D < C8487d.m24492a().f20515G.size()) {
                            String str3 = C8487d.m24492a().f20515G.get(C8487d.m24492a().f20512D);
                            if (!TextUtils.isEmpty(str3) && (str3.startsWith("http") || str3.startsWith("https"))) {
                                str2 = str3 + "/setting";
                            }
                        }
                    } catch (Throwable th) {
                        C8608u.m24884d(C2290c.f4641a, th.getMessage());
                    }
                    int i = C8487d.m24492a().f20539i;
                    if (!C8487d.m24492a().f20538h) {
                        C8487d.m24492a().f20511C++;
                    } else {
                        C8487d.m24492a().f20512D++;
                    }
                    C2290c.this.m5314b(context, str, str2);
                    try {
                        C8526d dVar = new C8526d(context);
                        dVar.mo57687a();
                        dVar.mo57688a(2, i, str, str2);
                    } catch (Throwable th2) {
                        C8608u.m24884d(C2290c.f4641a, th2.getMessage());
                    }
                    C8608u.m24884d(C2290c.f4641a, "get app setting error" + str);
                }
            };
            C2282b bVar = new C2282b(context);
            String str3 = C8487d.m24492a().f20546p;
            try {
                if (C8487d.m24492a().f20538h && C8487d.m24492a().f20513E && C8487d.m24492a().f20512D < C8487d.m24492a().f20515G.size()) {
                    String str4 = C8487d.m24492a().f20515G.get(C8487d.m24492a().f20512D);
                    if (!TextUtils.isEmpty(str4) && (str4.startsWith("http") || str4.startsWith("https"))) {
                        str3 = str4 + "/setting";
                    }
                }
            } catch (Throwable th) {
                C8608u.m24884d(f4641a, th.getMessage());
            }
            bVar.mo57600a(1, str3, dVar, (C8476e) r1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5314b(final Context context, final String str, final String str2) {
        if (!C8487d.m24492a().mo57595d()) {
            try {
                if (!C8487d.m24492a().f20513E) {
                    C8487d.m24492a().f20513E = true;
                    if (System.currentTimeMillis() >= C2338a.m5535a().mo15730a("mkey_spare_host_ts").longValue() + 86400000) {
                        String b = C2338a.m5535a().mo15735b("mkey_spare_host");
                        if (!TextUtils.isEmpty(b)) {
                            for (String str3 : b.split("\n")) {
                                if (!TextUtils.isEmpty(str3.trim()) && !C8487d.m24492a().f20514F.contains(str3.trim())) {
                                    C8487d.m24492a().f20514F.add(str3.trim());
                                    C8487d.m24492a().f20515G.add(str3.trim());
                                }
                            }
                            m5314b(context, str, str2);
                            return;
                        }
                    }
                    new C8492b(context.getApplicationContext()).mo57600a(0, C8487d.m24492a().f20510B, new C8494d(), (C8476e) new C8454a() {
                        /* renamed from: a */
                        public final void mo15406a(String str) {
                            C8608u.m24880a(C2290c.f4641a, "fetch CNDSettingHost success, content = " + str);
                            if (!TextUtils.isEmpty(str)) {
                                C2338a.m5535a().mo15732a("mkey_spare_host_ts", System.currentTimeMillis());
                                C2338a.m5535a().mo15733a("mkey_spare_host", str);
                                for (String str2 : str.split("\n")) {
                                    if (!TextUtils.isEmpty(str2.trim()) && !C8487d.m24492a().f20514F.contains(str2.trim())) {
                                        C8487d.m24492a().f20514F.add(str2.trim());
                                        C8487d.m24492a().f20515G.add(str2.trim());
                                    }
                                }
                                C2290c.this.m5314b(context, str, str2);
                            }
                        }

                        /* renamed from: b */
                        public final void mo15407b(String str) {
                            C8487d.m24492a().f20513E = false;
                            String a = C2290c.f4641a;
                            C8608u.m24880a(a, "fetch CNDSettingHost failed, errorCode = " + str);
                        }
                    });
                }
            } catch (Throwable th) {
                C8487d.m24492a().f20513E = false;
                C8608u.m24884d(f4641a, th.getMessage());
            }
        } else {
            mo15579a(context, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo15580a(final Context context, final String str, String str2, final String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = C2350a.m5601e().mo15793h();
            str2 = C2350a.m5601e().mo15794i();
        }
        if (C2283b.m5275a().mo15561a(str3, str) && C2283b.m5275a().mo15560a(str, 2, str3)) {
            C8494d dVar = new C8494d();
            dVar.mo57606a("unit_ids", "[" + str3 + "]");
            dVar.mo57606a("app_id", str);
            dVar.mo57606a("sign", SameMD5.getMD5(str + str2));
            new C2282b(context).mo57600a(1, C8487d.m24492a().f20546p, dVar, (C8476e) new C8493c() {
                /* renamed from: a */
                public final void mo15582a(JSONObject jSONObject) {
                    if (jSONObject != null) {
                        try {
                            JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                            if (optJSONArray != null && optJSONArray.length() > 0) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                                optJSONObject.put("current_time", System.currentTimeMillis());
                                C2283b.m5275a().mo15558a(str, str3, optJSONObject.toString());
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    } else {
                        C8608u.m24884d(C2290c.f4641a, "UNIT SETTING IS NULL");
                    }
                    try {
                        new C8526d(context).mo57688a(1, C8487d.m24492a().f20539i, "", C8487d.m24492a().f20538h ? C8487d.m24492a().f20551u : C8487d.m24492a().f20546p);
                    } catch (Throwable th) {
                        C8608u.m24884d(C2290c.f4641a, th.getMessage());
                    }
                }

                /* renamed from: a */
                public final void mo15581a(String str) {
                    try {
                        new C8526d(context).mo57688a(2, C8487d.m24492a().f20539i, str, C8487d.m24492a().f20538h ? C8487d.m24492a().f20551u : C8487d.m24492a().f20546p);
                    } catch (Throwable th) {
                        C8608u.m24884d(C2290c.f4641a, th.getMessage());
                    }
                    String a = C2290c.f4641a;
                    C8608u.m24884d(a, "GET UNITID SETTING ERROR" + str);
                }
            });
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5312a(C2290c cVar, Context context, String str) {
        C2278a b;
        C2283b a = C2283b.m5275a();
        if (!(a == null || (b = a.mo15563b(str)) == null)) {
            MBridgeConstans.OMID_JS_SERVICE_URL = b.mo15478aq();
            MBridgeConstans.OMID_JS_H5_URL = b.mo15477ap();
        }
        C2265b.m5118a(context);
        C2265b.m5120b(context);
    }
}
