package com.ogury.p376ed.internal;

import android.app.Application;
import com.ogury.p376ed.internal.C10318aj;
import p394io.presage.interstitial.p395ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.gu */
public final class C10570gu {

    /* renamed from: a */
    public static final C10570gu f26686a = new C10570gu();

    private C10570gu() {
    }

    /* renamed from: a */
    public static C10318aj m32124a(InterstitialActivity interstitialActivity, C10546g gVar, C10336ao aoVar) {
        C10765mq.m32773b(interstitialActivity, "activity");
        C10765mq.m32773b(gVar, "adLayout");
        C10765mq.m32773b(aoVar, "expandToInterstitialViewCommand");
        Application application = interstitialActivity.getApplication();
        C10765mq.m32770a((Object) application, "activity.application");
        return new C10318aj.C10319a(application, gVar, aoVar, true).mo67073p();
    }
}
