package com.mbridge.msdk.video.signal.p369a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2385p;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.tools.C8554aa;
import com.mbridge.msdk.foundation.tools.C8573c;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.videocommon.p373d.C9548a;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.signal.a.j */
/* compiled from: JSCommon */
public final class C9425j extends C9416c {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Activity f23036n;

    /* renamed from: o */
    private String f23037o;

    /* renamed from: p */
    private String f23038p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public CampaignEx f23039q;

    /* renamed from: r */
    private List<CampaignEx> f23040r;

    /* renamed from: s */
    private int f23041s;

    /* renamed from: t */
    private String f23042t = "";

    /* renamed from: u */
    private String f23043u = "";

    /* renamed from: v */
    private boolean f23044v = false;

    /* renamed from: w */
    private boolean f23045w = false;

    /* renamed from: a */
    public final void mo62848a(CampaignEx campaignEx) {
        this.f23039q = campaignEx;
    }

    /* renamed from: a */
    public final void mo62849a(List<CampaignEx> list) {
        this.f23040r = list;
    }

    /* renamed from: c */
    public final void mo62851c(boolean z) {
        this.f23044v = z;
    }

    public C9425j(Activity activity, CampaignEx campaignEx) {
        this.f23036n = activity;
        this.f23039q = campaignEx;
    }

    public C9425j(Activity activity, CampaignEx campaignEx, List<CampaignEx> list) {
        this.f23036n = activity;
        this.f23039q = campaignEx;
        this.f23040r = list;
    }

    /* renamed from: n */
    public final void mo62855n() {
        this.f23037o = "";
    }

    /* renamed from: c */
    public final void mo62850c(String str) {
        this.f23042t = str;
    }

    /* renamed from: d */
    public final void mo62852d(String str) {
        this.f23043u = str;
    }

    /* renamed from: o */
    public final int mo62856o() {
        return this.f23041s;
    }

    /* renamed from: i */
    public final void mo62854i(int i) {
        this.f23041s = i;
    }

    /* renamed from: d */
    public final void mo62853d(boolean z) {
        this.f23045w = z;
    }

    /* renamed from: c */
    public final String mo62822c() {
        this.f23028l.mo62253a();
        this.f23017a = true;
        if (TextUtils.isEmpty(this.f23037o)) {
            this.f23037o = m27038p();
        }
        return this.f23037o;
    }

    /* renamed from: p */
    private String m27038p() {
        JSONObject jSONObject = new JSONObject();
        C8573c cVar = new C8573c(C2350a.m5601e().mo15792g());
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f23025i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.f23042t);
            jSONObject2.put("rootViewInstanceId", this.f23043u);
            jSONObject2.put("isRootTemplateWebView", this.f23044v);
            jSONObject.put("sdk_info", "MAL_16.1.61,3.0.1");
            jSONObject2.put("playVideoMute", this.f23029m);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", cVar.mo57749a());
            JSONArray jSONArray = new JSONArray();
            if (this.f23040r == null || this.f23040r.size() <= 0) {
                jSONArray.put(CampaignEx.campaignToJsonObject(this.f23039q));
            } else {
                for (CampaignEx next : this.f23040r) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(next, next.isReady(), m27037b(next)));
                }
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", m27047y());
            String c = C2283b.m5275a().mo15566c(C2350a.m5601e().mo15793h());
            if (!TextUtils.isEmpty(c)) {
                JSONObject jSONObject3 = new JSONObject(c);
                m27034a(jSONObject3);
                String d = C2283b.m5275a().mo15568d(this.f23025i);
                if (!TextUtils.isEmpty(d)) {
                    jSONObject3.put("ivreward", new JSONObject(d));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", m27048z());
            if (!TextUtils.isEmpty(this.f23025i)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f23025i);
            }
            jSONObject.put("rw_plus", this.f23045w ? "1" : "0");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    private void m27034a(JSONObject jSONObject) {
        try {
            Context g = C2350a.m5601e().mo15792g();
            String obj = C8554aa.m24733b(g, "MBridge_ConfirmTitle" + this.f23025i, "").toString();
            String obj2 = C8554aa.m24733b(g, "MBridge_ConfirmContent" + this.f23025i, "").toString();
            String obj3 = C8554aa.m24733b(g, "MBridge_CancelText" + this.f23025i, "").toString();
            String obj4 = C8554aa.m24733b(g, "MBridge_ConfirmText" + this.f23025i, "").toString();
            if (!TextUtils.isEmpty(obj)) {
                jSONObject.put("confirm_title", obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                jSONObject.put("confirm_description", obj2);
            }
            if (!TextUtils.isEmpty(obj3)) {
                jSONObject.put("confirm_t", obj3);
            }
            if (!TextUtils.isEmpty(obj4)) {
                jSONObject.put("confirm_c_play", obj4);
            }
            if (!TextUtils.isEmpty(obj4)) {
                jSONObject.put("confirm_c_rv", obj4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:38|39|40|41|(1:43)|44|45|(2:48|46)|56|49|50|61) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0104 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010e A[Catch:{ JSONException -> 0x0125 }, LOOP:1: B:46:0x0108->B:48:0x010e, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.mbridge.msdk.foundation.entity.CampaignEx m27033a(java.lang.String r8, com.mbridge.msdk.foundation.entity.CampaignEx r9) {
        /*
            r7 = this;
            java.lang.String r0 = "deep_link"
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto L_0x0009
            return r9
        L_0x0009:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto L_0x0015
            if (r9 == 0) goto L_0x0012
            goto L_0x0015
        L_0x0012:
            r9 = 0
            goto L_0x0129
        L_0x0015:
            java.lang.String r1 = "notice"
            boolean r1 = r8.contains(r1)
            if (r1 != 0) goto L_0x00f0
            org.json.JSONObject r0 = com.mbridge.msdk.foundation.entity.CampaignEx.campaignToJsonObject(r9)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaignWithBackData(r0)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r1 != 0) goto L_0x0028
            r1 = r9
        L_0x0028:
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r2 != 0) goto L_0x00e4
            r7.m27035a((org.json.JSONObject) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r1)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r0.<init>(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r8 = com.mbridge.msdk.foundation.same.C8413a.f20325g     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            org.json.JSONObject r8 = r0.optJSONObject(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r0 = "-999"
            if (r8 == 0) goto L_0x0073
            android.app.Activity r0 = r7.f23036n     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C8413a.f20323e     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r2 = r8.getString(r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            float r2 = (float) r2     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r0 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r0, (float) r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            android.app.Activity r2 = r7.f23036n     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C8413a.f20324f     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r3 = r8.getString(r3)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r3 = r3.intValue()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            float r3 = (float) r3     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r2 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r2, (float) r3)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            goto L_0x0074
        L_0x0073:
            r2 = r0
        L_0x0074:
            java.lang.String r3 = r1.getClickURL()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r0 = com.mbridge.msdk.click.C2309b.m5444a((java.lang.String) r3, (java.lang.String) r0, (java.lang.String) r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r1.setClickURL(r0)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r0 = r1.getNoticeUrl()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r8 == 0) goto L_0x00e4
            java.util.Iterator r2 = r8.keys()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r3.<init>()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
        L_0x008e:
            boolean r4 = r2.hasNext()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r4 == 0) goto L_0x00d2
            java.lang.String r4 = "&"
            r3.append(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.Object r4 = r2.next()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r5 = r8.optString(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r6 = com.mbridge.msdk.foundation.same.C8413a.f20323e     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            boolean r6 = r6.equals(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r6 != 0) goto L_0x00b3
            java.lang.String r6 = com.mbridge.msdk.foundation.same.C8413a.f20324f     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            boolean r6 = r6.equals(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r6 == 0) goto L_0x00c6
        L_0x00b3:
            android.app.Activity r6 = r7.f23036n     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r5 = r5.intValue()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            float r5 = (float) r5     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r5 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r6, (float) r5)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
        L_0x00c6:
            r3.append(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r4 = "="
            r3.append(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r3.append(r5)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            goto L_0x008e
        L_0x00d2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r8.<init>()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r8.append(r0)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r8.append(r3)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r1.setNoticeUrl(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
        L_0x00e4:
            r9 = r1
            goto L_0x0129
        L_0x00e6:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x0129
        L_0x00eb:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x0129
        L_0x00f0:
            org.json.JSONObject r1 = com.mbridge.msdk.foundation.entity.CampaignEx.campaignToJsonObject(r9)     // Catch:{ JSONException -> 0x0125 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0125 }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x0125 }
            boolean r8 = r2.has(r0)     // Catch:{ Exception -> 0x0104 }
            if (r8 != 0) goto L_0x0104
            java.lang.String r8 = ""
            r1.put(r0, r8)     // Catch:{ Exception -> 0x0104 }
        L_0x0104:
            java.util.Iterator r8 = r2.keys()     // Catch:{ JSONException -> 0x0125 }
        L_0x0108:
            boolean r0 = r8.hasNext()     // Catch:{ JSONException -> 0x0125 }
            if (r0 == 0) goto L_0x011c
            java.lang.Object r0 = r8.next()     // Catch:{ JSONException -> 0x0125 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0125 }
            java.lang.String r3 = r2.getString(r0)     // Catch:{ JSONException -> 0x0125 }
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x0125 }
            goto L_0x0108
        L_0x011c:
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaignWithBackData(r1)     // Catch:{ JSONException -> 0x0125 }
            r7.m27035a((org.json.JSONObject) r1, (com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ JSONException -> 0x0125 }
            r9 = r8
            goto L_0x0129
        L_0x0125:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0129:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.p369a.C9425j.m27033a(java.lang.String, com.mbridge.msdk.foundation.entity.CampaignEx):com.mbridge.msdk.foundation.entity.CampaignEx");
    }

    /* renamed from: a */
    private void m27035a(JSONObject jSONObject, CampaignEx campaignEx) {
        try {
            String optString = jSONObject.optString("unitId");
            if (!TextUtils.isEmpty(optString)) {
                campaignEx.setCampaignUnitId(optString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        com.mbridge.msdk.foundation.tools.C8608u.m24881a("DefaultJSCommon", "INSTALL", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ac, code lost:
        com.mbridge.msdk.foundation.tools.C8608u.m24881a("DefaultJSCommon", r6.getMessage(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x000d, B:29:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008a A[Catch:{ all -> 0x007e, all -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008b A[Catch:{ all -> 0x007e, all -> 0x00ab }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void click(int r6, java.lang.String r7) {
        /*
            r5 = this;
            super.click(r6, r7)
            java.lang.String r0 = "DefaultJSCommon"
            r1 = 1
            if (r6 == r1) goto L_0x003f
            r2 = 3
            if (r6 == r2) goto L_0x000d
            goto L_0x00b3
        L_0x000d:
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23039q     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x0021
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23039q     // Catch:{ all -> 0x00ab }
            int r6 = r6.getCbd()     // Catch:{ all -> 0x00ab }
            r2 = -2
            if (r6 <= r2) goto L_0x0021
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23039q     // Catch:{ all -> 0x00ab }
            int r6 = r6.getCbd()     // Catch:{ all -> 0x00ab }
            goto L_0x002d
        L_0x0021:
            com.mbridge.msdk.videocommon.d.c r6 = r5.f23026j     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x002c
            com.mbridge.msdk.videocommon.d.c r6 = r5.f23026j     // Catch:{ all -> 0x00ab }
            int r6 = r6.mo63166n()     // Catch:{ all -> 0x00ab }
            goto L_0x002d
        L_0x002c:
            r6 = r1
        L_0x002d:
            r2 = -1
            if (r6 != r2) goto L_0x003a
            com.mbridge.msdk.video.signal.a.c$b r6 = new com.mbridge.msdk.video.signal.a.c$b     // Catch:{ all -> 0x00ab }
            com.mbridge.msdk.video.signal.c$a r2 = r5.f23028l     // Catch:{ all -> 0x00ab }
            r6.<init>(r5, r2)     // Catch:{ all -> 0x00ab }
            r5.mo62814a((com.mbridge.msdk.video.signal.C9432c.C9433a) r6)     // Catch:{ all -> 0x00ab }
        L_0x003a:
            r5.click(r1, r7)     // Catch:{ all -> 0x00ab }
            goto L_0x00b3
        L_0x003f:
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23039q     // Catch:{ all -> 0x00ab }
            r2 = 0
            if (r6 != 0) goto L_0x005a
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6 = r5.f23040r     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x005a
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6 = r5.f23040r     // Catch:{ all -> 0x00ab }
            int r6 = r6.size()     // Catch:{ all -> 0x00ab }
            if (r6 <= 0) goto L_0x005a
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6 = r5.f23040r     // Catch:{ all -> 0x00ab }
            java.lang.Object r6 = r6.get(r2)     // Catch:{ all -> 0x00ab }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6     // Catch:{ all -> 0x00ab }
            r5.f23039q = r6     // Catch:{ all -> 0x00ab }
        L_0x005a:
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23039q     // Catch:{ all -> 0x00ab }
            if (r6 != 0) goto L_0x005f
            return
        L_0x005f:
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f23039q     // Catch:{ all -> 0x00ab }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.m27033a((java.lang.String) r7, (com.mbridge.msdk.foundation.entity.CampaignEx) r6)     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = r6.getNoticeUrl()     // Catch:{ all -> 0x00ab }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C8413a.f20326h     // Catch:{ all -> 0x007e }
            java.lang.String r7 = r7.getQueryParameter(r3)     // Catch:{ all -> 0x007e }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x007e }
            if (r3 != 0) goto L_0x0084
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ all -> 0x007e }
            goto L_0x0085
        L_0x007e:
            r7 = move-exception
            java.lang.String r3 = "INSTALL"
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r3, r7)     // Catch:{ all -> 0x00ab }
        L_0x0084:
            r7 = r2
        L_0x0085:
            com.mbridge.msdk.video.signal.c$a r3 = r5.f23028l     // Catch:{ all -> 0x00ab }
            r4 = 2
            if (r7 != r4) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r1 = r2
        L_0x008c:
            r3.mo62255a(r1)     // Catch:{ all -> 0x00ab }
            com.mbridge.msdk.click.a r7 = r5.m27039q()     // Catch:{ all -> 0x00ab }
            com.mbridge.msdk.video.signal.c$a r1 = r5.f23028l     // Catch:{ all -> 0x00ab }
            r7.mo15642a((com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r1)     // Catch:{ all -> 0x00ab }
            com.mbridge.msdk.click.a r7 = r5.m27039q()     // Catch:{ all -> 0x00ab }
            r7.mo15639a((com.mbridge.msdk.foundation.entity.CampaignEx) r6)     // Catch:{ all -> 0x00ab }
            com.mbridge.msdk.foundation.controller.a r7 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x00ab }
            android.content.Context r7 = r7.mo15792g()     // Catch:{ all -> 0x00ab }
            com.mbridge.msdk.video.module.p367b.C9410b.m26953d(r7, r6)     // Catch:{ all -> 0x00ab }
            goto L_0x00b3
        L_0x00ab:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r7, r6)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.p369a.C9425j.click(int, java.lang.String):void");
    }

    public final void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        try {
            this.f23028l.mo62254a(i, str);
        } catch (Throwable th) {
            C8608u.m24881a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    public final void mo62812a(int i, String str) {
        super.mo62812a(i, str);
        if (i == 2) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                final String optString = jSONObject.optString("event", "event");
                final String optString2 = jSONObject.optString("template", "-1");
                final String optString3 = jSONObject.optString("layout", "-1");
                final String optString4 = jSONObject.optString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f23025i);
                final int n = C8596q.m24849n(this.f23036n.getApplication());
                C94261 r2 = new Runnable() {
                    public final void run() {
                        C2385p.m5777a((C2374f) C2376g.m5723a((Context) C9425j.this.f23036n.getApplication())).mo15934a(new C8412m("2000039", optString, optString2, optString3, optString4, C9425j.this.f23039q.getId(), n, C8596q.m24818a((Context) C9425j.this.f23036n.getApplication(), n)));
                    }
                };
                if (C2358b.m5644a().mo15829d()) {
                    C8442b.m24388a().execute(r2);
                } else {
                    r2.run();
                }
            } catch (Throwable th) {
                C8608u.m24881a("DefaultJSCommon", th.getMessage(), th);
            }
        }
    }

    /* renamed from: f */
    public final void mo62828f() {
        super.mo62828f();
        if (this.f23028l != null) {
            this.f23028l.mo62256b();
        }
    }

    /* renamed from: d */
    public final void mo62824d() {
        super.mo62824d();
        try {
            if (this.f23036n != null) {
                this.f23036n.finish();
            }
        } catch (Throwable th) {
            C8608u.m24881a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    /* renamed from: q */
    private C2295a m27039q() {
        if (this.f23027k == null) {
            this.f23027k = new C2295a(C2350a.m5601e().mo15792g(), this.f23025i);
        }
        return this.f23027k;
    }

    /* renamed from: g */
    public final String mo62831g(int i) {
        switch (i) {
            case 1:
                return m27041s().toString();
            case 2:
                return m27042t().toString();
            case 3:
                return m27043u().toString();
            case 4:
                return m27044v().toString();
            case 5:
                return m27045w().toString();
            case 6:
                return m27046x().toString();
            default:
                return m27040r().toString();
        }
    }

    /* renamed from: r */
    private JSONObject m27040r() {
        JSONObject jSONObject = new JSONObject();
        C8573c cVar = new C8573c(C2350a.m5601e().mo15792g());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f23029m);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", cVar.mo57749a());
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(CampaignEx.campaignToJsonObject(this.f23039q));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", m27047y());
            String c = C2283b.m5275a().mo15566c(C2350a.m5601e().mo15793h());
            if (!TextUtils.isEmpty(c)) {
                JSONObject jSONObject3 = new JSONObject(c);
                m27034a(jSONObject3);
                String d = C2283b.m5275a().mo15568d(this.f23025i);
                if (!TextUtils.isEmpty(d)) {
                    jSONObject3.put("ivreward", d);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", m27048z());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: s */
    private JSONObject m27041s() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_info", "MAL_16.1.61,3.0.1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: t */
    private JSONObject m27042t() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f23025i)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f23025i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: u */
    private JSONObject m27043u() {
        JSONObject jSONObject = new JSONObject();
        try {
            String c = C2283b.m5275a().mo15566c(C2350a.m5601e().mo15793h());
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("appSetting", new JSONObject(c));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: v */
    private JSONObject m27044v() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f23026j != null) {
                jSONObject.put("unitSetting", this.f23026j.mo63134D());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: w */
    private JSONObject m27045w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", new C8573c(C2350a.m5601e().mo15792g()).mo57749a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: x */
    private JSONObject m27046x() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f23029m);
            jSONObject2.put("instanceId", this.f23042t);
            jSONObject.put("sdkSetting", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: y */
    private JSONObject m27047y() {
        return this.f23026j != null ? this.f23026j.mo63134D() : new JSONObject();
    }

    /* renamed from: z */
    private JSONObject m27048z() {
        JSONObject jSONObject = new JSONObject();
        C9548a b = C9549b.m27299a().mo63129b();
        return b != null ? b.mo63122j() : jSONObject;
    }

    /* renamed from: a */
    public final void mo62813a(Activity activity) {
        this.f23036n = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r0 = com.mbridge.msdk.p054c.C2283b.m5275a().mo15563b(r0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m27037b(com.mbridge.msdk.foundation.entity.CampaignEx r7) {
        /*
            r6 = this;
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0038 }
            java.lang.String r0 = r0.mo15793h()     // Catch:{ Exception -> 0x0038 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0038 }
            r2 = 0
            if (r1 != 0) goto L_0x0022
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ Exception -> 0x0038 }
            com.mbridge.msdk.c.a r0 = r1.mo15563b(r0)     // Catch:{ Exception -> 0x0038 }
            if (r0 == 0) goto L_0x0022
            long r0 = r0.mo15436J()     // Catch:{ Exception -> 0x0038 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            goto L_0x0023
        L_0x0022:
            r0 = r2
        L_0x0023:
            com.mbridge.msdk.videocommon.d.b r4 = com.mbridge.msdk.videocommon.p373d.C9549b.m27299a()     // Catch:{ Exception -> 0x0038 }
            com.mbridge.msdk.videocommon.d.a r4 = r4.mo63129b()     // Catch:{ Exception -> 0x0038 }
            if (r4 == 0) goto L_0x0031
            long r2 = r4.mo63114d()     // Catch:{ Exception -> 0x0038 }
        L_0x0031:
            if (r7 == 0) goto L_0x0038
            boolean r7 = r7.isSpareOffer(r2, r0)     // Catch:{ Exception -> 0x0038 }
            return r7
        L_0x0038:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.p369a.C9425j.m27037b(com.mbridge.msdk.foundation.entity.CampaignEx):boolean");
    }

    /* renamed from: b */
    public final void mo62819b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f23038p = str;
        }
    }

    /* renamed from: i */
    public final String mo62834i() {
        C8608u.m24880a("DefaultJSCommon", "getNotchArea");
        return this.f23038p;
    }
}
