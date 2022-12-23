package com.mbridge.msdk.video.module.p365a.p366a;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.click.p057a.C2302a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.video.module.p365a.C9384a;
import com.mbridge.msdk.video.module.p367b.C9410b;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.p371b.C9541c;

/* renamed from: com.mbridge.msdk.video.module.a.a.d */
/* compiled from: ContainerViewStatisticsListener */
public class C9388d extends C9396k {
    public C9388d(CampaignEx campaignEx, C9552a aVar, C9541c cVar, String str, String str2, C9384a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
    }

    /* renamed from: a */
    public void mo62252a(int i, Object obj) {
        super.mo62252a(i, obj);
        if (!this.f22973a) {
            return;
        }
        if (i == 105 || i == 106 || i == 113) {
            C9410b.m26953d(C2350a.m5601e().mo15792g(), this.f22974b);
            if (i != 105) {
                String noticeUrl = this.f22974b.getNoticeUrl();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    if (!noticeUrl.contains(C8413a.f20326h)) {
                        noticeUrl = noticeUrl + "&" + C8413a.f20326h + "=2";
                    } else {
                        noticeUrl = noticeUrl.replace(C8413a.f20326h + "=" + Uri.parse(noticeUrl).getQueryParameter(C8413a.f20326h), C8413a.f20326h + "=2");
                    }
                }
                C2295a.m5361a(C2350a.m5601e().mo15792g(), this.f22974b, this.f22978f, noticeUrl, true, false, C2302a.f4735i);
            }
        } else if (i != 122) {
            switch (i) {
                case 109:
                    mo62786b(2);
                    mo62782a(2);
                    return;
                case 110:
                    mo62786b(1);
                    mo62782a(1);
                    return;
                case 111:
                    mo62782a(1);
                    return;
                default:
                    return;
            }
        } else {
            mo62781a();
        }
    }
}
