package com.ogury.p376ed.internal;

import android.app.Application;
import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;
import p394io.presage.interstitial.p395ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.gx */
public final class C10575gx implements C10342au {

    /* renamed from: a */
    private final InterstitialActivity.C12363a f26700a;

    public /* synthetic */ C10575gx() {
        this(InterstitialActivity.f29347a);
    }

    private C10575gx(InterstitialActivity.C12363a aVar) {
        C10765mq.m32773b(aVar, "interstitialStartCommand");
        this.f26700a = aVar;
    }

    /* renamed from: a */
    public final boolean mo67004a(Application application, List<C10483eb> list, String str) {
        C10765mq.m32773b(application, "application");
        C10765mq.m32773b(list, CampaignUnit.JSON_KEY_ADS);
        C10765mq.m32773b(str, "nextAdId");
        C10483eb a = C10405cm.m31490a(list, str);
        if (a == null) {
            return false;
        }
        this.f26700a.mo67080a((Context) application, a, list);
        return true;
    }
}
