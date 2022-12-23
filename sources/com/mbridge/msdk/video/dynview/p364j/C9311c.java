package com.mbridge.msdk.video.dynview.p364j;

import android.view.View;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.video.dynview.C9252c;
import com.mbridge.msdk.video.dynview.p360i.C9297b;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import com.mbridge.msdk.videocommon.p373d.C9551c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.dynview.j.c */
/* compiled from: ViewOptionWrapper */
public final class C9311c {
    /* renamed from: a */
    private String m26703a(int i) {
        return i != 3 ? i != 302 ? i != 802 ? "mbridge_reward_layer_floor" : "mbridge_reward_layer_floor_802" : "mbridge_reward_layer_floor_302" : "mbridge_reward_layer_floor_bottom";
    }

    /* renamed from: a */
    public final C9252c mo62510a(View view, CampaignEx campaignEx) {
        String str;
        int i;
        boolean z;
        int i2 = 0;
        String str2 = "";
        int i3 = 102;
        if (campaignEx != null) {
            String campaignUnitId = campaignEx.getCampaignUnitId();
            if (campaignEx.getRewardTemplateMode() != null) {
                i3 = campaignEx.getRewardTemplateMode().mo57202b();
                str2 = campaignEx.getRewardTemplateMode().mo57205e();
            }
            str = m26703a(i3);
            int i4 = i3;
            z = C9297b.m26664a(str2);
            str2 = campaignUnitId;
            i = i4;
        } else {
            str = str2;
            i = 102;
            z = false;
        }
        C9551c a = C9549b.m27299a().mo63124a(C2350a.m5601e().mo15793h(), str2, false);
        if (a != null) {
            i2 = a.mo63152g();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        return new C9252c.C9254a().mo62378a(str).mo62375a(i).mo62379a((List<CampaignEx>) arrayList).mo62376a(view.getContext()).mo62377a(view).mo62384c(i2).mo62383b(C8596q.m24828d(view.getContext())).mo62385d(i).mo62380a(z).mo62381a();
    }

    /* renamed from: b */
    public final C9252c mo62511b(View view, CampaignEx campaignEx) {
        String str;
        String str2 = "";
        if (campaignEx != null) {
            str2 = campaignEx.getCampaignUnitId();
            str = m26703a(3);
        } else {
            str = str2;
        }
        int i = 0;
        C9551c a = C9549b.m27299a().mo63124a(C2350a.m5601e().mo15793h(), str2, false);
        if (a != null) {
            i = a.mo63152g();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        return new C9252c.C9254a().mo62378a(str).mo62375a(3).mo62379a((List<CampaignEx>) arrayList).mo62376a(view.getContext()).mo62377a(view).mo62384c(i).mo62383b(C8596q.m24828d(view.getContext())).mo62385d(3).mo62381a();
    }
}
