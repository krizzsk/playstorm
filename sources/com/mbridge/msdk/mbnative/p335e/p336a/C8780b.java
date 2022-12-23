package com.mbridge.msdk.mbnative.p335e.p336a;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C8480f;
import com.mbridge.msdk.foundation.same.net.C8501k;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p307c.C8457b;
import com.mbridge.msdk.foundation.same.net.p310f.C8481a;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.out.Frame;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbnative.e.a.b */
/* compiled from: NativeResponseHandler */
public abstract class C8780b extends C8480f<JSONObject> {

    /* renamed from: a */
    private static final String f21367a = C8780b.class.getSimpleName();

    /* renamed from: b */
    private int f21368b;

    /* renamed from: c */
    private String f21369c;

    /* renamed from: a */
    public abstract void mo58128a(int i, String str);

    /* renamed from: a */
    public abstract void mo58131a(List<C8457b> list, CampaignUnit campaignUnit);

    /* renamed from: b */
    public abstract void mo58132b(List<Frame> list);

    /* renamed from: a */
    public final void mo58177a(String str) {
        this.f21369c = str;
    }

    /* renamed from: f */
    public final String mo58178f() {
        return this.f21369c;
    }

    /* renamed from: g */
    public final void mo58180g(int i) {
        this.f21368b = i;
    }

    /* renamed from: g */
    public final int mo58179g() {
        return this.f21368b;
    }

    /* renamed from: a */
    public final void mo57576a() {
        super.mo57576a();
    }

    /* renamed from: a */
    public final void mo57520a(C8501k<JSONObject> kVar) {
        CampaignUnit campaignUnit;
        super.mo57520a(kVar);
        if (kVar != null && kVar.f20596c != null) {
            int i = this.f21368b;
            if (i == 0) {
                final List<C8457b> list = kVar.f20596c.f20494d;
                final JSONObject jSONObject = (JSONObject) kVar.f20594a;
                final int optInt = jSONObject.optInt("status");
                if (1 == optInt) {
                    mo57586a(System.currentTimeMillis());
                    final String optString = jSONObject.optString("version");
                    C8442b.m24388a().execute(new Runnable() {
                        public final void run() {
                            final CampaignUnit campaignUnit;
                            if ("v5".equals(optString)) {
                                campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"));
                            } else {
                                campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"));
                            }
                            C8442b.m24391d().post(new Runnable() {
                                public final void run() {
                                    CampaignUnit campaignUnit = campaignUnit;
                                    if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                                        C8780b.this.mo58128a(optInt, jSONObject.optString("msg"));
                                        return;
                                    }
                                    C8780b.this.mo58131a((List<C8457b>) list, campaignUnit);
                                    C8780b.this.mo57585a(campaignUnit.getAds().size());
                                }
                            });
                        }
                    });
                    return;
                }
                mo58128a(optInt, jSONObject.optString("msg"));
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
                        mo58128a(optInt2, jSONObject2.optString("msg"));
                        return;
                    }
                    mo58132b(campaignUnit.getListFrames());
                    mo57585a(campaignUnit.getListFrames().size());
                    return;
                }
                mo58128a(optInt2, jSONObject2.optString("msg"));
            }
        }
    }

    /* renamed from: a */
    public final void mo57519a(C8452a aVar) {
        mo58128a(aVar.f20430a, C8481a.m24481a(aVar));
    }
}
