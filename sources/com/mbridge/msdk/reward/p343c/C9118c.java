package com.mbridge.msdk.reward.p343c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C8480f;
import com.mbridge.msdk.foundation.same.net.C8501k;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p307c.C8457b;
import com.mbridge.msdk.foundation.same.net.p310f.C8481a;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.out.Frame;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.reward.c.c */
/* compiled from: RewardResponseHandler */
public abstract class C9118c extends C8480f<JSONObject> {

    /* renamed from: a */
    private static final String f22074a = C9118c.class.getSimpleName();

    /* renamed from: b */
    private int f22075b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f22076c;

    /* renamed from: a */
    public abstract void mo60992a(List<Frame> list);

    /* renamed from: a */
    public abstract void mo60993a(List<C8457b> list, CampaignUnit campaignUnit);

    /* renamed from: b */
    public abstract void mo60994b(int i, String str);

    /* renamed from: a */
    public final void mo60995a(String str) {
        this.f22076c = str;
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
            int i = this.f22075b;
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
                                campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), C9118c.this.f22076c);
                            } else {
                                campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), C9118c.this.f22076c);
                            }
                            C8442b.m24391d().post(new Runnable() {
                                public final void run() {
                                    CampaignUnit campaignUnit = campaignUnit;
                                    if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                                        String str = null;
                                        CampaignUnit campaignUnit2 = campaignUnit;
                                        if (campaignUnit2 != null) {
                                            str = campaignUnit2.getMsg();
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            str = jSONObject.optString("msg");
                                        }
                                        C9118c.this.mo60994b(optInt, str);
                                        return;
                                    }
                                    C9118c.this.mo60993a(list, campaignUnit);
                                    C9118c.this.mo57585a(campaignUnit.getAds().size());
                                }
                            });
                        }
                    });
                    return;
                }
                mo60994b(optInt, jSONObject.optString("msg"));
            } else if (i == 1) {
                List<C8457b> list2 = kVar.f20596c.f20494d;
                JSONObject jSONObject2 = (JSONObject) kVar.f20594a;
                int optInt2 = jSONObject2.optInt("status");
                if (1 == optInt2) {
                    mo57586a(System.currentTimeMillis());
                    if ("v5".equals(jSONObject2.optString("version"))) {
                        campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject2.optJSONObject("data"), this.f22076c);
                    } else {
                        campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject2.optJSONObject("data"), this.f22076c);
                    }
                    if (campaignUnit == null || campaignUnit.getListFrames() == null || campaignUnit.getListFrames().size() <= 0) {
                        String str = null;
                        if (campaignUnit != null) {
                            str = campaignUnit.getMsg();
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = jSONObject2.optString("msg");
                        }
                        mo60994b(optInt2, str);
                        return;
                    }
                    List<Frame> listFrames = campaignUnit.getListFrames();
                    mo60992a(listFrames);
                    mo57585a(listFrames.size());
                    return;
                }
                mo60994b(optInt2, jSONObject2.optString("msg"));
            }
        }
    }

    /* renamed from: a */
    public final void mo57519a(C8452a aVar) {
        String str = f22074a;
        C8608u.m24884d(str, "errorCode = " + aVar.f20430a);
        mo60994b(aVar.f20430a, C8481a.m24481a(aVar));
    }
}
