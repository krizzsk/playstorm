package com.mbridge.msdk.video.dynview.p356f.p357a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C8480f;
import com.mbridge.msdk.foundation.same.net.C8501k;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p307c.C8457b;
import com.mbridge.msdk.foundation.same.net.p310f.C8481a;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.dynview.f.a.a */
/* compiled from: AbsMoreOfferResponseHandler */
public abstract class C9280a extends C8480f<JSONObject> {

    /* renamed from: a */
    private int f22497a;

    /* renamed from: b */
    private String f22498b;

    /* renamed from: a */
    public abstract void mo62461a(int i, String str);

    /* renamed from: a */
    public abstract void mo62462a(List<C8457b> list, CampaignUnit campaignUnit);

    /* renamed from: a */
    public final void mo57576a() {
        super.mo57576a();
    }

    /* renamed from: a */
    public final void mo57520a(C8501k<JSONObject> kVar) {
        CampaignUnit campaignUnit;
        super.mo57520a(kVar);
        if (kVar != null && kVar.f20596c != null && this.f22497a == 0) {
            List<C8457b> list = kVar.f20596c.f20494d;
            JSONObject jSONObject = (JSONObject) kVar.f20594a;
            int optInt = jSONObject.optInt("status");
            if (1 == optInt) {
                mo57586a(System.currentTimeMillis());
                if ("v5".equals(jSONObject.optString("version"))) {
                    campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f22498b);
                } else {
                    campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f22498b);
                }
                if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                    String str = null;
                    if (campaignUnit != null) {
                        str = campaignUnit.getMsg();
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = jSONObject.optString("msg");
                    }
                    mo62461a(optInt, str);
                    return;
                }
                mo62462a(list, campaignUnit);
                mo57585a(campaignUnit.getAds().size());
                return;
            }
            mo62461a(optInt, jSONObject.optString("msg"));
        }
    }

    /* renamed from: a */
    public final void mo57519a(C8452a aVar) {
        mo62461a(aVar.f20430a, C8481a.m24481a(aVar));
    }
}
