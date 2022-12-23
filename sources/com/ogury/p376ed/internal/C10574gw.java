package com.ogury.p376ed.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;
import p394io.presage.interstitial.p395ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.gw */
public final class C10574gw implements C10832t {

    /* renamed from: a */
    public static final C10574gw f26698a = new C10574gw();

    /* renamed from: b */
    private static InterstitialActivity.C12363a f26699b = InterstitialActivity.f29347a;

    private C10574gw() {
    }

    /* renamed from: a */
    public final void mo67135a(Context context, List<C10483eb> list) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(list, CampaignUnit.JSON_KEY_ADS);
        if (!list.isEmpty()) {
            f26699b.mo67080a(context, list.remove(0), list);
        }
    }
}
