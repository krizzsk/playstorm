package com.mbridge.msdk.mbsignalcommon.p337a;

import android.util.Base64;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.a.a */
/* compiled from: H5ReportManager */
public class C8786a {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f21377c = C8786a.class.getSimpleName();

    /* renamed from: a */
    int f21378a = 0;

    /* renamed from: b */
    int f21379b = 1;

    /* renamed from: d */
    private String f21380d = "handlerNativeResult";

    /* renamed from: com.mbridge.msdk.mbsignalcommon.a.a$a */
    /* compiled from: H5ReportManager */
    private static final class C8788a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C8786a f21382a = new C8786a();
    }

    /* renamed from: a */
    public static C8786a m25543a() {
        return C8788a.f21382a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0195, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0196, code lost:
        com.mbridge.msdk.foundation.tools.C8608u.m24880a(f21377c, r0.getMessage());
        m25544a(r1.f21379b, "exception: " + r0.getMessage(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        com.mbridge.msdk.foundation.tools.C8608u.m24884d(f21377c, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c3, code lost:
        r6 = r3.optJSONObject(1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x000c, B:29:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0171 A[Catch:{ all -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c9 A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cf A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d9 A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00df A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e9 A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ef A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f9 A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ff A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0109 A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010f A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0119 A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0120 A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012b A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0132 A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x013e A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145 A[Catch:{ Exception -> 0x009b, all -> 0x0195 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58183a(java.lang.Object r22, java.lang.String r23, org.json.JSONArray r24, int r25) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r0 = r23
            r3 = r24
            java.lang.String r4 = "called reporter failed, params empty"
            if (r3 != 0) goto L_0x0012
            int r0 = r1.f21379b     // Catch:{ all -> 0x0195 }
            r1.m25544a(r0, r4, r2)     // Catch:{ all -> 0x0195 }
            return
        L_0x0012:
            int r5 = r24.length()     // Catch:{ all -> 0x0195 }
            if (r5 != 0) goto L_0x001e
            int r0 = r1.f21379b     // Catch:{ all -> 0x0195 }
            r1.m25544a(r0, r4, r2)     // Catch:{ all -> 0x0195 }
            return
        L_0x001e:
            java.lang.String r4 = "reportMessageR"
            boolean r4 = r4.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0195 }
            r6 = 0
            r7 = 1
            java.lang.String r8 = "value"
            if (r4 == 0) goto L_0x00a7
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ all -> 0x0195 }
            r0.<init>()     // Catch:{ all -> 0x0195 }
            r4 = r6
        L_0x0030:
            int r9 = r5 + -1
            java.lang.String r10 = "="
            java.lang.String r11 = "key"
            if (r4 >= r9) goto L_0x0057
            org.json.JSONObject r9 = r3.optJSONObject(r4)     // Catch:{ all -> 0x0195 }
            if (r9 == 0) goto L_0x0054
            java.lang.String r11 = r9.optString(r11)     // Catch:{ all -> 0x0195 }
            r0.append(r11)     // Catch:{ all -> 0x0195 }
            r0.append(r10)     // Catch:{ all -> 0x0195 }
            java.lang.Object r9 = r9.opt(r8)     // Catch:{ all -> 0x0195 }
            r0.append(r9)     // Catch:{ all -> 0x0195 }
            java.lang.String r9 = "&"
            r0.append(r9)     // Catch:{ all -> 0x0195 }
        L_0x0054:
            int r4 = r4 + 1
            goto L_0x0030
        L_0x0057:
            org.json.JSONObject r3 = r3.optJSONObject(r9)     // Catch:{ all -> 0x0195 }
            if (r3 == 0) goto L_0x006e
            java.lang.String r4 = r3.optString(r11)     // Catch:{ all -> 0x0195 }
            r0.append(r4)     // Catch:{ all -> 0x0195 }
            r0.append(r10)     // Catch:{ all -> 0x0195 }
            java.lang.Object r3 = r3.opt(r8)     // Catch:{ all -> 0x0195 }
            r0.append(r3)     // Catch:{ all -> 0x0195 }
        L_0x006e:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0195 }
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x0195 }
            android.content.Context r3 = r3.mo15792g()     // Catch:{ all -> 0x0195 }
            if (r3 == 0) goto L_0x018d
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0195 }
            if (r4 != 0) goto L_0x018d
            com.mbridge.msdk.foundation.same.report.d.a r4 = new com.mbridge.msdk.foundation.same.report.d.a     // Catch:{ Exception -> 0x009b }
            r4.<init>(r3)     // Catch:{ Exception -> 0x009b }
            com.mbridge.msdk.foundation.same.net.g.d r0 = com.mbridge.msdk.foundation.same.report.C8542e.m24690a((java.lang.String) r0, (android.content.Context) r3)     // Catch:{ Exception -> 0x009b }
            com.mbridge.msdk.foundation.same.net.f.d r3 = com.mbridge.msdk.foundation.same.net.p310f.C8487d.m24492a()     // Catch:{ Exception -> 0x009b }
            java.lang.String r3 = r3.f20531a     // Catch:{ Exception -> 0x009b }
            com.mbridge.msdk.mbsignalcommon.a.a$1 r5 = new com.mbridge.msdk.mbsignalcommon.a.a$1     // Catch:{ Exception -> 0x009b }
            r5.<init>()     // Catch:{ Exception -> 0x009b }
            r4.mo57603c(r6, r3, r0, r5)     // Catch:{ Exception -> 0x009b }
            goto L_0x018d
        L_0x009b:
            r0 = move-exception
            java.lang.String r3 = f21377c     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0195 }
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r3, r0)     // Catch:{ all -> 0x0195 }
            goto L_0x018d
        L_0x00a7:
            java.lang.String r4 = "reportMessageD"
            boolean r0 = r4.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x018d
            java.lang.String r0 = ""
            if (r5 <= 0) goto L_0x00bf
            org.json.JSONObject r4 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0195 }
            if (r4 == 0) goto L_0x00bf
            java.lang.String r4 = r4.getString(r8)     // Catch:{ all -> 0x0195 }
            r10 = r4
            goto L_0x00c0
        L_0x00bf:
            r10 = r0
        L_0x00c0:
            r4 = -1
            if (r5 <= r7) goto L_0x00cf
            org.json.JSONObject r6 = r3.optJSONObject(r7)     // Catch:{ all -> 0x0195 }
            if (r6 == 0) goto L_0x00cf
            int r6 = r6.getInt(r8)     // Catch:{ all -> 0x0195 }
            r11 = r6
            goto L_0x00d0
        L_0x00cf:
            r11 = r4
        L_0x00d0:
            r6 = 2
            if (r5 <= r6) goto L_0x00df
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0195 }
            if (r6 == 0) goto L_0x00df
            int r6 = r6.getInt(r8)     // Catch:{ all -> 0x0195 }
            r12 = r6
            goto L_0x00e0
        L_0x00df:
            r12 = r4
        L_0x00e0:
            r6 = 3
            if (r5 <= r6) goto L_0x00ef
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0195 }
            if (r6 == 0) goto L_0x00ef
            int r6 = r6.getInt(r8)     // Catch:{ all -> 0x0195 }
            r13 = r6
            goto L_0x00f0
        L_0x00ef:
            r13 = r4
        L_0x00f0:
            r6 = 4
            if (r5 <= r6) goto L_0x00ff
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0195 }
            if (r6 == 0) goto L_0x00ff
            int r6 = r6.getInt(r8)     // Catch:{ all -> 0x0195 }
            r14 = r6
            goto L_0x0100
        L_0x00ff:
            r14 = r4
        L_0x0100:
            r6 = 5
            if (r5 <= r6) goto L_0x010f
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0195 }
            if (r6 == 0) goto L_0x010f
            java.lang.String r6 = r6.getString(r8)     // Catch:{ all -> 0x0195 }
            r15 = r6
            goto L_0x0110
        L_0x010f:
            r15 = r0
        L_0x0110:
            r6 = 6
            if (r5 <= r6) goto L_0x0120
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0195 }
            if (r6 == 0) goto L_0x0120
            java.lang.String r6 = r6.getString(r8)     // Catch:{ all -> 0x0195 }
            r16 = r6
            goto L_0x0122
        L_0x0120:
            r16 = r0
        L_0x0122:
            r6 = 7
            if (r5 <= r6) goto L_0x0132
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0195 }
            if (r6 == 0) goto L_0x0132
            int r6 = r6.getInt(r8)     // Catch:{ all -> 0x0195 }
            r17 = r6
            goto L_0x0134
        L_0x0132:
            r17 = r4
        L_0x0134:
            r6 = 8
            if (r5 <= r6) goto L_0x0145
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0195 }
            if (r6 == 0) goto L_0x0145
            java.lang.String r6 = r6.getString(r8)     // Catch:{ all -> 0x0195 }
            r18 = r6
            goto L_0x0147
        L_0x0145:
            r18 = r0
        L_0x0147:
            r6 = 9
            if (r5 <= r6) goto L_0x0155
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0195 }
            if (r6 == 0) goto L_0x0155
            int r4 = r6.getInt(r8)     // Catch:{ all -> 0x0195 }
        L_0x0155:
            r19 = r4
            r4 = 10
            if (r5 <= r4) goto L_0x0165
            org.json.JSONObject r3 = r3.optJSONObject(r4)     // Catch:{ all -> 0x0195 }
            if (r3 == 0) goto L_0x0165
            java.lang.String r0 = r3.getString(r8)     // Catch:{ all -> 0x0195 }
        L_0x0165:
            r20 = r0
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x0183 }
            android.content.Context r0 = r0.mo15792g()     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x018d
            com.mbridge.msdk.foundation.entity.m r3 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ all -> 0x0183 }
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0183 }
            com.mbridge.msdk.foundation.db.g r0 = com.mbridge.msdk.foundation.p066db.C2376g.m5723a((android.content.Context) r0)     // Catch:{ all -> 0x0183 }
            com.mbridge.msdk.foundation.db.p r0 = com.mbridge.msdk.foundation.p066db.C2385p.m5777a((com.mbridge.msdk.foundation.p066db.C2374f) r0)     // Catch:{ all -> 0x0183 }
            r0.mo15934a((com.mbridge.msdk.foundation.entity.C8412m) r3)     // Catch:{ all -> 0x0183 }
            goto L_0x018d
        L_0x0183:
            r0 = move-exception
            java.lang.String r3 = f21377c     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0195 }
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r3, r0)     // Catch:{ all -> 0x0195 }
        L_0x018d:
            int r0 = r1.f21378a     // Catch:{ all -> 0x0195 }
            java.lang.String r3 = "called reporter success"
            r1.m25544a(r0, r3, r2)     // Catch:{ all -> 0x0195 }
            goto L_0x01b9
        L_0x0195:
            r0 = move-exception
            java.lang.String r3 = f21377c
            java.lang.String r4 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r3, r4)
            int r3 = r1.f21379b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "exception: "
            r4.append(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.m25544a(r3, r0, r2)
        L_0x01b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbsignalcommon.p337a.C8786a.mo58183a(java.lang.Object, java.lang.String, org.json.JSONArray, int):void");
    }

    /* renamed from: a */
    private void m25544a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            C8608u.m24880a(f21377c, e.getMessage());
        } catch (Throwable th) {
            C8608u.m24880a(f21377c, th.getMessage());
        }
    }
}
