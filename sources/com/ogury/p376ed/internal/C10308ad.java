package com.ogury.p376ed.internal;

import android.app.Application;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ad */
public final class C10308ad implements C10342au {

    /* renamed from: a */
    private final C10741lv<C10483eb, List<C10483eb>, C10684ke> f26114a;

    public C10308ad(C10741lv<? super C10483eb, ? super List<C10483eb>, C10684ke> lvVar) {
        C10765mq.m32773b(lvVar, "showNextAd");
        this.f26114a = lvVar;
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
        this.f26114a.mo67117a(a, list);
        return true;
    }
}
