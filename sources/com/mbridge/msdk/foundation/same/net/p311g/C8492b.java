package com.mbridge.msdk.foundation.same.net.p311g;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.p067a.C2366a;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.net.C8447Aa;
import com.mbridge.msdk.foundation.same.net.C8449a;
import com.mbridge.msdk.foundation.same.net.C8453b;
import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.C8502l;
import com.mbridge.msdk.foundation.same.net.C8507n;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.p054c.C2294d;
import java.io.File;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.foundation.same.net.g.b */
/* compiled from: CommonAsyncHttpRequest */
public class C8492b {

    /* renamed from: b */
    private static final String f20558b = C8492b.class.getSimpleName();

    /* renamed from: a */
    protected Context f20559a;

    public C8492b(Context context) {
        if (context == null) {
            this.f20559a = C2350a.m5601e().mo15792g();
        } else {
            this.f20559a = context.getApplicationContext();
        }
    }

    /* renamed from: a */
    public void mo15557a(String str, C8494d dVar) {
        if (dVar != null) {
            dVar.mo57606a("open", C8413a.f20339u);
            String a = C8447Aa.m24392a();
            if (a == null) {
                a = "";
            }
            dVar.mo57606a("channel", a);
            dVar.mo57606a("band_width", C8449a.m24396a().mo57540e() + "");
            String str2 = dVar.mo57607b().get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (str2 != null) {
                String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
                if (!TextUtils.isEmpty(customInfoByUnitId)) {
                    dVar.mo57606a("ch_info", customInfoByUnitId);
                }
                C2294d e = C2283b.m5275a().mo15569e(C2350a.m5601e().mo15793h(), str2);
                if (e != null && !TextUtils.isEmpty(e.mo15583a())) {
                    dVar.mo57606a("u_stid", e.mo15583a());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo57600a(int i, String str, C8494d dVar, C8476e eVar) {
        m24508b(i, str, dVar, new C8453b(), eVar, false);
    }

    /* renamed from: b */
    public final void mo57602b(int i, String str, C8494d dVar, C8476e eVar) {
        mo57601a(i, str, dVar, new C8453b(), eVar, true);
    }

    /* renamed from: a */
    public final void mo57601a(int i, String str, C8494d dVar, C8502l lVar, C8476e eVar, boolean z) {
        m24508b(i, str, dVar, lVar, eVar, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24508b(int r14, java.lang.String r15, com.mbridge.msdk.foundation.same.net.p311g.C8494d r16, com.mbridge.msdk.foundation.same.net.C8502l r17, com.mbridge.msdk.foundation.same.net.C8476e r18, boolean r19) {
        /*
            r13 = this;
            r2 = r14
            r3 = r15
            r10 = r18
            if (r16 != 0) goto L_0x0013
            com.mbridge.msdk.foundation.same.net.g.d r0 = new com.mbridge.msdk.foundation.same.net.g.d     // Catch:{ Exception -> 0x000e }
            r0.<init>()     // Catch:{ Exception -> 0x000e }
            r11 = r13
            r1 = r0
            goto L_0x0016
        L_0x000e:
            r0 = move-exception
            r11 = r13
            r1 = r16
            goto L_0x006e
        L_0x0013:
            r11 = r13
            r1 = r16
        L_0x0016:
            r13.mo15557a(r15, r1)     // Catch:{ Exception -> 0x006d }
            com.mbridge.msdk.foundation.same.net.p311g.C8495e.m24529c(r1)     // Catch:{ Exception -> 0x006d }
            java.util.Map r0 = r1.mo57607b()     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = "sign"
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = ""
            if (r0 != 0) goto L_0x002d
            r0 = r4
        L_0x002d:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x006d }
            java.lang.String r7 = "ts"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006d }
            r8.<init>()     // Catch:{ Exception -> 0x006d }
            r8.append(r5)     // Catch:{ Exception -> 0x006d }
            r8.append(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x006d }
            r1.mo57606a(r7, r4)     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = "st"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006d }
            r7.<init>()     // Catch:{ Exception -> 0x006d }
            r7.append(r5)     // Catch:{ Exception -> 0x006d }
            r7.append(r0)     // Catch:{ Exception -> 0x006d }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x006d }
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r0)     // Catch:{ Exception -> 0x006d }
            r1.mo57606a(r4, r0)     // Catch:{ Exception -> 0x006d }
            com.mbridge.msdk.foundation.same.net.f.c r0 = com.mbridge.msdk.foundation.same.net.p310f.C8483c.m24488a()     // Catch:{ Exception -> 0x006d }
            com.mbridge.msdk.foundation.same.net.k r0 = r0.mo57588a((com.mbridge.msdk.foundation.same.net.p311g.C8494d) r1)     // Catch:{ Exception -> 0x006d }
            if (r0 == 0) goto L_0x0077
            if (r10 == 0) goto L_0x0077
            r10.mo57520a(r0)     // Catch:{ Exception -> 0x006d }
            return
        L_0x006d:
            r0 = move-exception
        L_0x006e:
            java.lang.String r4 = f20558b
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r4, r0)
        L_0x0077:
            r12 = r1
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()
            java.lang.String r0 = r0.f20533c
            boolean r0 = r15.contains(r0)
            if (r0 == 0) goto L_0x00ec
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()
            boolean r0 = r0.f20538h
            if (r0 == 0) goto L_0x00ec
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x00e2 }
            r1.<init>()     // Catch:{ all -> 0x00e2 }
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r0.f20534d     // Catch:{ all -> 0x00bd }
            android.net.Uri r4 = android.net.Uri.parse(r15)     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r5.<init>()     // Catch:{ all -> 0x00bd }
            r5.append(r0)     // Catch:{ all -> 0x00bd }
            r5.append(r4)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = "uri"
            r1.put(r4, r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "data"
            java.lang.String r4 = r12.mo57604a()     // Catch:{ all -> 0x00bd }
            r1.put(r0, r4)     // Catch:{ all -> 0x00bd }
            goto L_0x00c7
        L_0x00bd:
            r0 = move-exception
            java.lang.String r4 = f20558b     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00e2 }
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r4, r0)     // Catch:{ all -> 0x00e2 }
        L_0x00c7:
            com.mbridge.msdk.foundation.same.net.m r4 = com.mbridge.msdk.foundation.same.net.C8503m.m24579a()     // Catch:{ all -> 0x00e2 }
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ all -> 0x00e2 }
            java.lang.String r5 = r0.f20534d     // Catch:{ all -> 0x00e2 }
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ all -> 0x00e2 }
            int r6 = r0.f20537g     // Catch:{ all -> 0x00e2 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x00e2 }
            r8 = 1
            r9 = r18
            r4.mo57643a(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00e2 }
            return
        L_0x00e2:
            r0 = move-exception
            java.lang.String r1 = f20558b
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r0)
        L_0x00ec:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            java.lang.String r1 = "?"
            r0.append(r1)
            java.lang.String r1 = r12.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p054c.C2283b.m5275a()
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r4 = r4.mo15793h()
            com.mbridge.msdk.c.a r1 = r1.mo15571f(r4)
            int r4 = r0.length()
            int r5 = r1.mo15509g()
            if (r4 < r5) goto L_0x0136
            com.mbridge.msdk.foundation.same.net.f.d r4 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()
            java.lang.String r4 = r4.f20533c
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x0136
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r12
            r5 = r17
            r6 = r18
            r1.m24506a((int) r2, (java.lang.String) r3, (com.mbridge.msdk.foundation.same.net.p311g.C8494d) r4, (com.mbridge.msdk.foundation.same.net.C8502l) r5, (com.mbridge.msdk.foundation.same.net.C8476e) r6)
            return
        L_0x0136:
            int r4 = r0.length()
            int r1 = r1.mo15511h()
            if (r4 < r1) goto L_0x014e
            if (r19 == 0) goto L_0x014e
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r12
            r5 = r17
            r6 = r18
            r1.m24506a((int) r2, (java.lang.String) r3, (com.mbridge.msdk.foundation.same.net.p311g.C8494d) r4, (com.mbridge.msdk.foundation.same.net.C8502l) r5, (com.mbridge.msdk.foundation.same.net.C8476e) r6)
            return
        L_0x014e:
            r1 = 0
            r3 = 0
            if (r2 == 0) goto L_0x0165
            r4 = 1
            if (r2 == r4) goto L_0x015f
            r4 = 2
            if (r2 == r4) goto L_0x0159
            goto L_0x016b
        L_0x0159:
            com.mbridge.msdk.foundation.same.net.d.c r2 = new com.mbridge.msdk.foundation.same.net.d.c
            r2.<init>(r1, r0, r3, r10)
            goto L_0x016a
        L_0x015f:
            com.mbridge.msdk.foundation.same.net.d.d r2 = new com.mbridge.msdk.foundation.same.net.d.d
            r2.<init>(r1, r0, r3, r10)
            goto L_0x016a
        L_0x0165:
            com.mbridge.msdk.foundation.same.net.d.f r2 = new com.mbridge.msdk.foundation.same.net.d.f
            r2.<init>(r1, r0, r3, r10)
        L_0x016a:
            r3 = r2
        L_0x016b:
            if (r3 == 0) goto L_0x017c
            r1 = r17
            r3.mo57613a((com.mbridge.msdk.foundation.same.net.C8502l) r1)
            int r0 = r3.mo57573g()
            r3.mo57621b(r0)
            com.mbridge.msdk.foundation.same.net.C8507n.m24588a((com.mbridge.msdk.foundation.same.net.C8498i) r3)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.p311g.C8492b.m24508b(int, java.lang.String, com.mbridge.msdk.foundation.same.net.g.d, com.mbridge.msdk.foundation.same.net.l, com.mbridge.msdk.foundation.same.net.e, boolean):void");
    }

    /* renamed from: a */
    public static void m24507a(File file, String str, C8476e eVar) {
        C8507n.m24586a().mo57574a(file, str, eVar);
    }

    /* renamed from: a */
    public final void mo57598a(int i, C8494d dVar, C8476e eVar, String str) {
        mo57599a(i, dVar, eVar, str, (C8502l) new C8453b());
    }

    /* renamed from: a */
    public final void mo57599a(int i, C8494d dVar, C8476e eVar, String str, C8502l lVar) {
        int i2;
        C2278a f = C2283b.m5275a().mo15571f(C2350a.m5601e().mo15793h());
        if (TextUtils.isEmpty(str)) {
            i2 = f.mo15459aB();
        } else {
            i2 = f.mo15458aA();
        }
        String a = C8487d.m24492a().mo57590a(str, i2);
        if (i2 >= 2) {
            if (i2 % 2 == 0) {
                if (dVar == null) {
                    dVar = new C8494d();
                }
                JSONArray b = C2366a.m5655a().mo15843b();
                if (b != null) {
                    String jSONArray = b.toString();
                    int b2 = C8487d.m24492a().mo57593b();
                    if (b2 <= 0 || jSONArray.length() <= b2) {
                        dVar.mo57606a(C8494d.f20564e, jSONArray);
                    } else {
                        mo57603c(i, a, dVar, eVar);
                        return;
                    }
                }
            }
            C8494d dVar2 = dVar;
            if (lVar == null) {
                mo57602b(i, a, dVar2, eVar);
            } else {
                mo57601a(i, a, dVar2, lVar, eVar, true);
            }
        } else if (lVar == null) {
            m24509d(i, a, dVar, eVar);
        } else {
            m24505a(i, a, dVar, eVar, lVar);
        }
    }

    /* renamed from: d */
    private void m24509d(int i, String str, C8494d dVar, C8476e eVar) {
        String str2 = dVar.mo57607b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        dVar.mo57606a(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis + "");
        dVar.mo57606a(UserDataStore.STATE, SameMD5.getMD5(currentTimeMillis + str2));
        m24506a(i, str, dVar, (C8502l) new C8453b(), eVar);
    }

    /* renamed from: a */
    private void m24505a(int i, String str, C8494d dVar, C8476e eVar, C8502l lVar) {
        String str2 = dVar.mo57607b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        dVar.mo57606a(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis + "");
        dVar.mo57606a(UserDataStore.STATE, SameMD5.getMD5(currentTimeMillis + str2));
        if (lVar != null) {
            m24506a(i, str, dVar, lVar, eVar);
            return;
        }
        m24506a(i, str, dVar, (C8502l) new C8453b(), eVar);
    }

    /* renamed from: c */
    public final void mo57603c(int i, String str, C8494d dVar, C8476e eVar) {
        m24506a(i, str, dVar, (C8502l) new C8453b(), eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088 A[SYNTHETIC, Splitter:B:29:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3 A[Catch:{ Exception -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24506a(int r11, java.lang.String r12, com.mbridge.msdk.foundation.same.net.p311g.C8494d r13, com.mbridge.msdk.foundation.same.net.C8502l r14, com.mbridge.msdk.foundation.same.net.C8476e r15) {
        /*
            r10 = this;
            if (r13 != 0) goto L_0x0008
            com.mbridge.msdk.foundation.same.net.g.d r0 = new com.mbridge.msdk.foundation.same.net.g.d     // Catch:{ Exception -> 0x001e }
            r0.<init>()     // Catch:{ Exception -> 0x001e }
            r13 = r0
        L_0x0008:
            r10.mo15557a(r12, r13)     // Catch:{ Exception -> 0x001e }
            com.mbridge.msdk.foundation.same.net.p311g.C8495e.m24529c(r13)     // Catch:{ Exception -> 0x001e }
            com.mbridge.msdk.foundation.same.net.f.c r0 = com.mbridge.msdk.foundation.same.net.p310f.C8483c.m24488a()     // Catch:{ Exception -> 0x001e }
            com.mbridge.msdk.foundation.same.net.k r0 = r0.mo57588a((com.mbridge.msdk.foundation.same.net.p311g.C8494d) r13)     // Catch:{ Exception -> 0x001e }
            if (r0 == 0) goto L_0x0028
            if (r15 == 0) goto L_0x0028
            r15.mo57520a(r0)     // Catch:{ Exception -> 0x001e }
            return
        L_0x001e:
            r0 = move-exception
            java.lang.String r1 = f20558b
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r1, r0)
        L_0x0028:
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()
            java.lang.String r0 = r0.f20531a
            boolean r0 = r12.contains(r0)
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x00d1
            com.mbridge.msdk.c.b r0 = com.mbridge.msdk.p054c.C2283b.m5275a()
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r3 = r3.mo15793h()
            com.mbridge.msdk.c.a r0 = r0.mo15563b(r3)
            java.lang.String r3 = ""
            r4 = 0
            if (r0 == 0) goto L_0x007e
            int r4 = r0.mo15471aj()
            java.lang.String r5 = r0.mo15487az()
            java.util.Map r6 = r13.mo57607b()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r7 = "data"
            java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0068 }
            boolean r3 = com.mbridge.msdk.foundation.same.report.C8542e.m24599a(r0, r6)     // Catch:{ Exception -> 0x0066 }
            if (r3 != 0) goto L_0x006f
            return
        L_0x0066:
            r3 = move-exception
            goto L_0x006c
        L_0x0068:
            r6 = move-exception
            r9 = r6
            r6 = r3
            r3 = r9
        L_0x006c:
            r3.printStackTrace()
        L_0x006f:
            r3 = r6
            int r6 = r0.mo15525o()
            java.lang.String r7 = r0.mo15493c()
            java.lang.String r8 = "a_stid"
            r13.mo57606a(r8, r7)
            goto L_0x0081
        L_0x007e:
            java.lang.String r5 = "UNKNOWN"
            r6 = r4
        L_0x0081:
            java.lang.String r7 = "country_code"
            r13.mo57606a(r7, r5)
            if (r4 != r1) goto L_0x00b3
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00b1 }
            if (r4 != 0) goto L_0x00b0
            boolean r0 = com.mbridge.msdk.foundation.same.report.C8542e.m24599a(r0, r3)     // Catch:{ Exception -> 0x00b1 }
            if (r0 == 0) goto L_0x00b0
            if (r6 == r2) goto L_0x0099
            r0 = 3
            if (r6 != r0) goto L_0x0110
        L_0x0099:
            com.mbridge.msdk.foundation.same.net.m r0 = com.mbridge.msdk.foundation.same.net.C8503m.m24579a()     // Catch:{ Exception -> 0x00b1 }
            com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r3 = r3.f20535e     // Catch:{ Exception -> 0x00b1 }
            com.mbridge.msdk.foundation.same.net.f.d r4 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x00b1 }
            int r4 = r4.f20536f     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r5 = r13.toString()     // Catch:{ Exception -> 0x00b1 }
            r0.mo57642a(r3, r4, r5, r15)     // Catch:{ Exception -> 0x00b1 }
        L_0x00b0:
            return
        L_0x00b1:
            r0 = move-exception
            goto L_0x00cd
        L_0x00b3:
            if (r4 != r2) goto L_0x0110
            com.mbridge.msdk.foundation.same.net.m r0 = com.mbridge.msdk.foundation.same.net.C8503m.m24579a()     // Catch:{ Exception -> 0x00b1 }
            com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r3 = r3.f20535e     // Catch:{ Exception -> 0x00b1 }
            com.mbridge.msdk.foundation.same.net.f.d r4 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x00b1 }
            int r4 = r4.f20536f     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r5 = r13.toString()     // Catch:{ Exception -> 0x00b1 }
            r0.mo57642a(r3, r4, r5, r15)     // Catch:{ Exception -> 0x00b1 }
            return
        L_0x00cd:
            r0.printStackTrace()
            goto L_0x0110
        L_0x00d1:
            com.mbridge.msdk.foundation.same.net.f.d r0 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()
            java.lang.String r0 = r0.f20544n
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x0110
            if (r13 == 0) goto L_0x00f7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r12 = "?"
            r0.append(r12)
            java.lang.String r12 = r13.toString()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
        L_0x00f7:
            com.mbridge.msdk.foundation.db.a.a r0 = com.mbridge.msdk.foundation.p066db.p067a.C2366a.m5655a()
            org.json.JSONArray r0 = r0.mo15843b()
            if (r0 == 0) goto L_0x0110
            java.lang.String r13 = r0.toString()
            com.mbridge.msdk.foundation.same.net.g.d r0 = new com.mbridge.msdk.foundation.same.net.g.d
            r0.<init>()
            java.lang.String r3 = com.mbridge.msdk.foundation.same.net.p311g.C8494d.f20564e
            r0.mo57606a(r3, r13)
            r13 = r0
        L_0x0110:
            r0 = 0
            java.lang.String r3 = "application/x-www-form-urlencoded"
            java.lang.String r4 = "Content-Type"
            if (r11 == 0) goto L_0x0136
            if (r11 == r2) goto L_0x0129
            if (r11 == r1) goto L_0x011c
            goto L_0x0142
        L_0x011c:
            com.mbridge.msdk.foundation.same.net.d.c r0 = new com.mbridge.msdk.foundation.same.net.d.c
            java.lang.String r11 = r13.toString()
            r0.<init>(r2, r12, r11, r15)
            r0.mo57619a((java.lang.String) r4, (java.lang.String) r3)
            goto L_0x0142
        L_0x0129:
            com.mbridge.msdk.foundation.same.net.d.d r0 = new com.mbridge.msdk.foundation.same.net.d.d
            java.lang.String r11 = r13.toString()
            r0.<init>(r2, r12, r11, r15)
            r0.mo57619a((java.lang.String) r4, (java.lang.String) r3)
            goto L_0x0142
        L_0x0136:
            com.mbridge.msdk.foundation.same.net.d.f r0 = new com.mbridge.msdk.foundation.same.net.d.f
            java.lang.String r11 = r13.toString()
            r0.<init>(r2, r12, r11, r15)
            r0.mo57619a((java.lang.String) r4, (java.lang.String) r3)
        L_0x0142:
            if (r0 == 0) goto L_0x014a
            r0.mo57613a((com.mbridge.msdk.foundation.same.net.C8502l) r14)
            com.mbridge.msdk.foundation.same.net.C8507n.m24588a((com.mbridge.msdk.foundation.same.net.C8498i) r0)
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.p311g.C8492b.m24506a(int, java.lang.String, com.mbridge.msdk.foundation.same.net.g.d, com.mbridge.msdk.foundation.same.net.l, com.mbridge.msdk.foundation.same.net.e):void");
    }
}
