package com.mbridge.msdk.mbbanner.common.p327f;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C8480f;
import com.mbridge.msdk.foundation.same.net.C8501k;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p307c.C8457b;
import com.mbridge.msdk.foundation.same.net.p310f.C8481a;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbbanner.common.f.a */
/* compiled from: BannerResponseHandler */
public abstract class C8707a extends C8480f<JSONObject> {

    /* renamed from: a */
    private static final String f21112a = C8707a.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f21113b = "";

    /* renamed from: a */
    public abstract void mo58023a(int i, String str);

    /* renamed from: a */
    public abstract void mo58024a(CampaignUnit campaignUnit);

    /* renamed from: a */
    public final void mo58041a(String str) {
        this.f21113b = str;
    }

    /* renamed from: a */
    public final void mo57520a(C8501k<JSONObject> kVar) {
        super.mo57520a(kVar);
        List<C8457b> list = kVar.f20596c.f20494d;
        final JSONObject jSONObject = (JSONObject) kVar.f20594a;
        final int optInt = jSONObject.optInt("status");
        if (1 == optInt) {
            mo57586a(System.currentTimeMillis());
            final String optString = jSONObject.optString("version");
            C8442b.m24388a().execute(new Runnable() {
                public final void run() {
                    final CampaignUnit campaignUnit;
                    if ("v5".equals(optString)) {
                        campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), C8707a.this.f21113b);
                    } else {
                        campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), C8707a.this.f21113b);
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
                                C8707a.this.mo58023a(optInt, str);
                                return;
                            }
                            C8707a.this.mo58024a(campaignUnit);
                            if (!TextUtils.isEmpty(C8707a.this.f21113b)) {
                                C8707a.this.mo57587b(1);
                            }
                            C8707a.this.mo57585a(campaignUnit.getAds().size());
                        }
                    });
                }
            });
            return;
        }
        mo58023a(optInt, jSONObject.optString("msg"));
    }

    /* renamed from: a */
    public final void mo57519a(C8452a aVar) {
        mo58023a(aVar.f20430a, C8481a.m24481a(aVar));
    }
}
