package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.network.C4556l;
import com.fyber.inneractive.sdk.network.C4558m;
import com.fyber.inneractive.sdk.util.C5348k;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.response.k */
public class C5297k implements C5296j {

    /* renamed from: a */
    public final C4558m f14101a;

    public C5297k(C4558m mVar) {
        this.f14101a = mVar;
    }

    /* renamed from: a */
    public final String mo26395a(Map<String, String> map, C4556l lVar) {
        String lowerCase = lVar.f11283a.toLowerCase();
        String str = map.get(lowerCase);
        IAlog.m16702d("%s%s extracted from response header: %s", IAlog.m16696a((Object) this), lowerCase, str);
        int i = IAlog.f14137a;
        IAlog.m16697a(1, (Exception) null, "%s %s : %s", "RESPONSE_HEADER", lowerCase, str);
        return str;
    }

    /* renamed from: a */
    public String mo24231a() {
        return this.f14101a.mo24736d().toString();
    }

    /* renamed from: a */
    public void mo24232a(C5288b bVar) {
        long j;
        C5288b bVar2 = bVar;
        bVar2.f14055a.f14065A = false;
        IAConfigManager.f10525J.f10559x.f10605e = false;
        ImpressionData impressionData = new ImpressionData();
        Map<String, String> o = this.f14101a.mo24737o();
        String a = mo26395a(o, C4556l.RETURNED_AD_TYPE);
        mo26395a(o, C4556l.ERROR_CODE);
        String a2 = mo26395a(o, C4556l.SESSION_ID);
        String a3 = mo26395a(o, C4556l.CONTENT_ID);
        mo26395a(o, C4556l.PUBLISHER_ID);
        String a4 = mo26395a(o, C4556l.WIDTH);
        String a5 = mo26395a(o, C4556l.HEIGHT);
        String a6 = mo26395a(o, C4556l.SDK_IMPRESSION_URL);
        String a7 = mo26395a(o, C4556l.SDK_CLICK_URL);
        String a8 = mo26395a(o, C4556l.AD_TIMEOUT);
        String a9 = mo26395a(o, C4556l.AD_COMPLETION_URL);
        bVar2.f14056b = mo26395a(o, C4556l.AD_UNIT_ID);
        mo26395a(o, C4556l.AD_UNIT_TYPE);
        String a10 = mo26395a(o, C4556l.AD_UNIT_DISPLAY_TYPE);
        String a11 = mo26395a(o, C4556l.AD_NETWORK);
        String a12 = mo26395a(o, C4556l.AD_NETWORK_ID);
        String str = a10;
        String a13 = mo26395a(o, C4556l.CREATIVE_ID);
        String a14 = mo26395a(o, C4556l.AD_DOMAIN);
        String a15 = mo26395a(o, C4556l.APP_BUNDLE);
        String str2 = a9;
        String a16 = mo26395a(o, C4556l.CAMPAIGN_ID);
        String a17 = mo26395a(o, C4556l.CPM_VALUE);
        String str3 = a7;
        String a18 = mo26395a(o, C4556l.CPM_CURRENCY);
        impressionData.setCpmValue(a17);
        impressionData.setCurrency(a18);
        String a19 = mo26395a(o, C4556l.BANNER_MRC_PERCENT);
        String a20 = mo26395a(o, C4556l.BANNER_MRC_DURATION);
        String a21 = mo26395a(o, C4556l.BANNER_MRC_IMPRESSION_URL);
        String a22 = mo26395a(o, C4556l.INTERSTITIAL_SKIP_MODE);
        if (bVar.mo24395b()) {
            bVar2.f14055a.f14081p = o;
        }
        C5291e eVar = bVar2.f14055a;
        eVar.getClass();
        try {
            j = Long.parseLong(a8);
        } catch (NumberFormatException unused) {
            j = 20;
        }
        String str4 = a22;
        long j2 = j;
        eVar.f14067b = j2;
        String str5 = a6;
        String str6 = a19;
        String str7 = str4;
        eVar.f14066a = eVar.f14068c + TimeUnit.MINUTES.toMillis(j2);
        impressionData.setImpressionId(a2);
        impressionData.setDemandSource(a11);
        C5291e eVar2 = bVar2.f14055a;
        eVar2.f14069d = a3;
        eVar2.getClass();
        bVar2.f14055a.f14090y = a15;
        if (!TextUtils.isEmpty(a12)) {
            impressionData.setDemandId(Long.valueOf(a12));
        }
        if (!TextUtils.isEmpty(a)) {
            bVar2.f14055a.f14072g = Integer.valueOf(a).intValue();
        }
        if (!TextUtils.isEmpty(a4)) {
            bVar2.f14055a.f14070e = Integer.valueOf(a4).intValue();
        }
        if (!TextUtils.isEmpty(a5)) {
            bVar2.f14055a.f14071f = Integer.valueOf(a5).intValue();
        }
        C5291e eVar3 = bVar2.f14055a;
        eVar3.f14076k = str5;
        eVar3.f14077l = str3;
        eVar3.f14080o = str2;
        eVar3.f14078m = bVar2.f14056b;
        try {
            eVar3.f14079n = UnitDisplayType.fromValue(str);
        } catch (IllegalArgumentException unused2) {
            bVar2.f14055a.f14079n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(a13)) {
            impressionData.setCreativeId(a13);
        }
        if (!TextUtils.isEmpty(a14)) {
            impressionData.setAdvertiserDomain(a14);
        }
        if (!TextUtils.isEmpty(a16)) {
            impressionData.setCampaignId(a16);
        }
        impressionData.setCountry(C5348k.m16742g());
        C5291e eVar4 = bVar2.f14055a;
        eVar4.f14083r = impressionData;
        eVar4.f14085t = C5370s.m16783a(str6, 0);
        C5291e eVar5 = bVar2.f14055a;
        float f = -1.0f;
        if (!TextUtils.isEmpty(a20)) {
            try {
                f = Float.parseFloat(a20);
            } catch (NumberFormatException unused3) {
            }
        }
        eVar5.f14086u = f;
        C5291e eVar6 = bVar2.f14055a;
        eVar6.f14087v = a21;
        eVar6.f14088w = C5370s.m16783a(str7, -1);
    }
}
