package com.mbridge.msdk.video.module.p365a.p366a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.p365a.C9384a;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.p371b.C9541c;

/* renamed from: com.mbridge.msdk.video.module.a.a.h */
/* compiled from: PlayableStatisticsOnNotifyListener */
public final class C9393h extends C9396k {
    public C9393h(CampaignEx campaignEx, C9552a aVar, C9541c cVar, String str, String str2, C9384a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
    }

    /* renamed from: a */
    public final void mo62252a(int i, Object obj) {
        if (i == 100) {
            mo62791g();
            mo62790f();
            mo62789e();
            mo62782a(2);
        } else if (i == 109) {
            mo62786b(2);
        } else if (i == 122) {
            mo62781a();
        } else if (i != 129) {
            String str = "";
            if (i == 118) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                mo62783a(3, str);
            } else if (i == 119) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                mo62783a(4, str);
            }
        } else if (this.f22974b != null && this.f22974b.getPlayable_ads_without_video() == 2) {
            mo62791g();
            mo62790f();
            mo62789e();
            mo62782a(1);
        }
        super.mo62252a(i, obj);
    }
}
