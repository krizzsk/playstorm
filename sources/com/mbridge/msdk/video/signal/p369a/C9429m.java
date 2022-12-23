package com.mbridge.msdk.video.signal.p369a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8554aa;
import com.mbridge.msdk.foundation.tools.C8573c;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import com.mbridge.msdk.videocommon.p373d.C9551c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.signal.a.m */
/* compiled from: JSRewardVideoV1 */
public final class C9429m extends C9421f {

    /* renamed from: a */
    private Activity f23054a;

    /* renamed from: b */
    private MBridgeContainerView f23055b;

    public C9429m(Activity activity, MBridgeContainerView mBridgeContainerView) {
        this.f23054a = activity;
        this.f23055b = mBridgeContainerView;
    }

    /* renamed from: a */
    public final String mo62844a() {
        C9551c cVar;
        if (this.f23055b == null) {
            super.mo62844a();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f23055b.getCampaign());
                String unitID = this.f23055b.getUnitID();
                if (C9549b.m27299a() == null) {
                    cVar = null;
                } else {
                    cVar = C9549b.m27299a().mo63123a(C2350a.m5601e().mo15793h(), unitID);
                }
                JSONObject jSONObject = new JSONObject();
                if (cVar != null) {
                    jSONObject = cVar.mo63134D();
                }
                C8608u.m24880a("JSRewardVideoV1", "getEndScreenInfo success campaign = " + this.f23055b.getCampaign());
                return m27072a(arrayList, unitID, "MAL_16.1.61,3.0.1", jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.mo62844a();
    }

    public final void toggleCloseBtn(int i) {
        super.toggleCloseBtn(i);
        MBridgeContainerView mBridgeContainerView = this.f23055b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.toggleCloseBtn(i);
        }
    }

    /* renamed from: a */
    public final void mo62845a(String str) {
        super.mo62845a(str);
        try {
            if (this.f23054a != null && !TextUtils.isEmpty(str) && str.equals("click") && this.f23055b != null) {
                this.f23055b.triggerCloseBtn(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void notifyCloseBtn(int i) {
        super.notifyCloseBtn(i);
        MBridgeContainerView mBridgeContainerView = this.f23055b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.notifyCloseBtn(i);
        }
    }

    /* renamed from: c */
    public final void mo62847c(String str) {
        super.mo62847c(str);
        try {
            if (this.f23054a != null && !TextUtils.isEmpty(str) && this.f23055b != null) {
                this.f23055b.handlerPlayableException(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo62846b(String str) {
        super.mo62846b(str);
        try {
            if (this.f23054a != null && !TextUtils.isEmpty(str)) {
                if (str.equals("landscape")) {
                    this.f23054a.setRequestedOrientation(0);
                } else if (str.equals("portrait")) {
                    this.f23054a.setRequestedOrientation(1);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private String m27072a(List<CampaignEx> list, String str, String str2, JSONObject jSONObject) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            C8573c cVar = new C8573c(C2350a.m5601e().mo15792g());
            JSONArray parseCamplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campaignList", parseCamplistToJson);
            jSONObject2.put("device", cVar.mo57749a());
            jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject2.put("sdk_info", str2);
            jSONObject2.put("unitSetting", jSONObject);
            if (C2283b.m5275a() != null) {
                String c = C2283b.m5275a().mo15566c(C2350a.m5601e().mo15793h());
                if (!TextUtils.isEmpty(c)) {
                    JSONObject jSONObject3 = new JSONObject(c);
                    try {
                        Context g = C2350a.m5601e().mo15792g();
                        String obj = C8554aa.m24733b(g, "MBridge_ConfirmTitle" + str, "").toString();
                        String obj2 = C8554aa.m24733b(g, "MBridge_ConfirmContent" + str, "").toString();
                        String obj3 = C8554aa.m24733b(g, "MBridge_CancelText" + str, "").toString();
                        String obj4 = C8554aa.m24733b(g, "MBridge_ConfirmText" + str, "").toString();
                        if (!TextUtils.isEmpty(obj)) {
                            jSONObject3.put("confirm_title", obj);
                        }
                        if (!TextUtils.isEmpty(obj2)) {
                            jSONObject3.put("confirm_description", obj2);
                        }
                        if (!TextUtils.isEmpty(obj3)) {
                            jSONObject3.put("confirm_t", obj3);
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            jSONObject3.put("confirm_c_play", obj4);
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            jSONObject3.put("confirm_c_rv", obj4);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    String d = C2283b.m5275a().mo15568d(str);
                    if (!TextUtils.isEmpty(d)) {
                        jSONObject3.put("ivreward", new JSONObject(d));
                    }
                    jSONObject2.put("appSetting", jSONObject3);
                }
            }
            return jSONObject2.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
