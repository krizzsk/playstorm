package com.mbridge.msdk.interstitial.p319d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C8480f;
import com.mbridge.msdk.foundation.same.net.C8501k;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p307c.C8457b;
import com.mbridge.msdk.foundation.same.net.p310f.C8481a;
import com.mbridge.msdk.out.Frame;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.interstitial.d.c */
/* compiled from: InterstitialResponseHandler */
public abstract class C8641c extends C8480f<JSONObject> {

    /* renamed from: a */
    private static final String f20916a = C8641c.class.getSimpleName();

    /* renamed from: b */
    private int f20917b;

    /* renamed from: a */
    public abstract void mo57853a(List<Frame> list);

    /* renamed from: a */
    public abstract void mo57854a(List<C8457b> list, CampaignUnit campaignUnit);

    /* renamed from: b */
    public abstract void mo57855b(int i, String str);

    /* renamed from: a */
    public final void mo57576a() {
        super.mo57576a();
    }

    /* renamed from: a */
    public final void mo57520a(C8501k<JSONObject> kVar) {
        CampaignUnit campaignUnit;
        CampaignUnit campaignUnit2;
        super.mo57520a(kVar);
        if (kVar != null && kVar.f20596c != null) {
            int i = this.f20917b;
            String str = null;
            if (i == 0) {
                List<C8457b> list = kVar.f20596c.f20494d;
                JSONObject jSONObject = (JSONObject) kVar.f20594a;
                int optInt = jSONObject.optInt("status");
                if (1 == optInt) {
                    mo57586a(System.currentTimeMillis());
                    if ("v5".equals(jSONObject.optString("version"))) {
                        campaignUnit2 = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"));
                    } else {
                        campaignUnit2 = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"));
                    }
                    if (campaignUnit2 == null || campaignUnit2.getAds() == null || campaignUnit2.getAds().size() <= 0) {
                        if (campaignUnit2 != null) {
                            str = campaignUnit2.getMsg();
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = jSONObject.optString("msg");
                        }
                        mo57855b(optInt, str);
                        return;
                    }
                    mo57854a(list, campaignUnit2);
                    mo57585a(campaignUnit2.getAds().size());
                    return;
                }
                mo57855b(optInt, jSONObject.optString("msg"));
            } else if (i == 1) {
                List<C8457b> list2 = kVar.f20596c.f20494d;
                JSONObject jSONObject2 = (JSONObject) kVar.f20594a;
                int optInt2 = jSONObject2.optInt("status");
                if (1 == optInt2) {
                    mo57586a(System.currentTimeMillis());
                    if ("v5".equals(jSONObject2.optString("version"))) {
                        campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject2.optJSONObject("data"));
                    } else {
                        campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject2.optJSONObject("data"));
                    }
                    if (campaignUnit == null || campaignUnit.getListFrames() == null || campaignUnit.getListFrames().size() <= 0) {
                        if (campaignUnit != null) {
                            str = campaignUnit.getMsg();
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = jSONObject2.optString("msg");
                        }
                        mo57855b(optInt2, str);
                        return;
                    }
                    List<Frame> listFrames = campaignUnit.getListFrames();
                    mo57853a(listFrames);
                    mo57585a(listFrames.size());
                    return;
                }
                mo57855b(optInt2, jSONObject2.optString("msg"));
            }
        }
    }

    /* renamed from: a */
    public final void mo57519a(C8452a aVar) {
        mo57855b(aVar.f20430a, C8481a.m24481a(aVar));
    }
}
