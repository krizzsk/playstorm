package com.mbridge.msdk.mbsignalcommon.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8405f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2379j;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.p299a.C8417d;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.p374my.tracker.ads.AdFormat;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.communication.b */
/* compiled from: CommonSignalCommunicatioImpUtils */
public class C8805b {

    /* renamed from: a */
    public static final String f21410a = C8805b.class.getSimpleName();

    /* renamed from: b */
    public static int f21411b = 0;

    /* renamed from: c */
    public static int f21412c = 1;

    /* renamed from: a */
    public static void m25605a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m25604a(obj, "data is empty");
                return;
            }
            final CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject);
            if (parseCampaignWithBackData == null) {
                m25604a(obj, "data camapign is empty");
                return;
            }
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        C2379j a = C2379j.m5740a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
                        if (a != null) {
                            if (!a.mo15907a(parseCampaignWithBackData.getId())) {
                                C8405f fVar = new C8405f();
                                fVar.mo57347a(parseCampaignWithBackData.getId());
                                fVar.mo57345a(parseCampaignWithBackData.getFca());
                                fVar.mo57349b(parseCampaignWithBackData.getFcb());
                                fVar.mo57353d(0);
                                fVar.mo57351c(1);
                                fVar.mo57346a(System.currentTimeMillis());
                                a.mo15906a(fVar);
                            } else {
                                a.mo15910b(parseCampaignWithBackData.getId());
                            }
                        }
                        C8805b.m25606a(parseCampaignWithBackData.getCampaignUnitId(), parseCampaignWithBackData);
                    } catch (Throwable th) {
                        C8608u.m24881a(C8805b.f21410a, th.getMessage(), th);
                    }
                }
            }).start();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f21411b);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", "");
            jSONObject2.put("data", jSONObject3);
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e) {
            m25604a(obj, e.getMessage());
            C8608u.m24880a(f21410a, e.getMessage());
        } catch (Throwable th) {
            m25604a(obj, th.getMessage());
        }
    }

    /* renamed from: a */
    public static String m25602a(float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C8413a.f20323e, C8613y.m24912a(C2350a.m5601e().mo15792g(), f));
            jSONObject2.put(C8413a.f20324f, C8613y.m24912a(C2350a.m5601e().mo15792g(), f2));
            jSONObject2.put(C8413a.f20326h, 0);
            jSONObject2.put(C8413a.f20327i, C2350a.m5601e().mo15792g().getResources().getConfiguration().orientation);
            jSONObject2.put(C8413a.f20328j, (double) C8613y.m24941d(C2350a.m5601e().mo15792g()));
            jSONObject.put(C8413a.f20325g, jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static String m25603a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C8608u.m24884d(f21410a, "code to string is error");
            return "";
        }
    }

    /* renamed from: a */
    public static void m25604a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f21412c);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C8608u.m24880a(f21410a, e.getMessage());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25606a(String str, CampaignEx campaignEx) {
        if (C8417d.f20357g != null && !TextUtils.isEmpty(campaignEx.getId())) {
            C8417d.m24308a(str, campaignEx, AdFormat.BANNER);
        }
    }
}
