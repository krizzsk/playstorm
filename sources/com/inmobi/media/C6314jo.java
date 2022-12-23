package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;

/* renamed from: com.inmobi.media.jo */
/* compiled from: UnifiedIdNetworkRequest */
public final class C6314jo extends C6208gz {
    protected C6314jo(String str, String str2, C6271ir irVar, String str3, int i, int i2, int i3) {
        super(str, str2, irVar, str3, i, i2, ShareTarget.ENCODING_TYPE_URL_ENCODED);
        this.f15712l = i3;
    }

    /* renamed from: a */
    public final void mo34922a() {
        super.mo34922a();
        HashMap<String, String> d = C6258ig.m18692d();
        this.f15708h.put("mk-version", C6228hp.m18569a());
        this.f15708h.put("bundle-id", C6249ia.m18645a().f15825a);
        this.f15708h.put("ua", C6227ho.m18564i());
        this.f15708h.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(System.currentTimeMillis()));
        this.f15708h.put("account_id", this.f15719s);
        Boolean g = C6269iq.m18729a().mo35480g();
        if (g == null) {
            this.f15708h.put("lat", "true");
        } else {
            this.f15708h.put("lat", g.toString());
        }
        if (d.get("u-age") != null) {
            this.f15708h.put("age", d.get("u-age"));
        }
        if (C6308jj.m18859b() != null) {
            this.f15708h.put("email", new C6262ij().mo35468a(C6308jj.m18859b()).toString());
        }
        if (C6308jj.m18856a() != null) {
            this.f15708h.put("phone", new C6262ij().mo35468a(C6308jj.m18856a()).toString());
        }
        this.f15708h.put("ufids", C6310jl.m18877d().toString());
        if (C6308jj.m18861c() != null) {
            this.f15708h.putAll(C6308jj.m18861c());
        }
    }
}
