package com.mbridge.msdk.mbbanner.common.p322a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.p310f.C8482b;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.p299a.C8417d;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.p374my.tracker.ads.AdFormat;

/* renamed from: com.mbridge.msdk.mbbanner.common.a.d */
/* compiled from: BannerV3Params */
public class C8669d {

    /* renamed from: a */
    private static final String f21000a = C8669d.class.getSimpleName();

    /* renamed from: a */
    public static C8494d m25157a(boolean z, Context context, String str, String str2, int i, C8667b bVar) {
        String h = C2350a.m5601e().mo15793h();
        String md5 = SameMD5.getMD5(C2350a.m5601e().mo15793h() + C2350a.m5601e().mo15794i());
        String b = C8613y.m24931b(context, str);
        String a = C8417d.m24306a(str, AdFormat.BANNER);
        String closeIds = BannerUtils.getCloseIds(str);
        C8494d dVar = new C8494d();
        C8482b.m24484a(dVar, "app_id", h);
        C8482b.m24484a(dVar, MBridgeConstans.PROPERTIES_UNIT_ID, str);
        if (!TextUtils.isEmpty(bVar.mo57981d())) {
            C8482b.m24484a(dVar, MBridgeConstans.PLACEMENT_ID, bVar.mo57981d());
        }
        C8482b.m24484a(dVar, "sign", md5);
        C8482b.m24484a(dVar, "only_impression", "1");
        C8482b.m24484a(dVar, "ping_mode", "1");
        C8482b.m24484a(dVar, C8494d.f20562c, b);
        C8482b.m24484a(dVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        C8482b.m24484a(dVar, C8494d.f20560a, str2);
        C8482b.m24484a(dVar, "ad_type", "296");
        C8482b.m24484a(dVar, "offset", i + "");
        C8482b.m24484a(dVar, C8494d.f20561b, a);
        C8482b.m24484a(dVar, "close_id", closeIds);
        C8482b.m24484a(dVar, CampaignUnit.JSON_KEY_UNIT_SIZE, bVar.mo57976a() + "");
        C8482b.m24484a(dVar, "refresh_time", bVar.mo57978b() + "");
        if (!TextUtils.isEmpty(bVar.mo57980c())) {
            C8482b.m24484a(dVar, "token", bVar.mo57980c() + "");
        }
        return dVar;
    }
}
