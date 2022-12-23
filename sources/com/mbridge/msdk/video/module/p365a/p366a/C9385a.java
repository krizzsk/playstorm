package com.mbridge.msdk.video.module.p365a.p366a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.click.C2309b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8608u;

/* renamed from: com.mbridge.msdk.video.module.a.a.a */
/* compiled from: CommonContainerNotifyListener */
public class C9385a extends C9391f {

    /* renamed from: a */
    private Activity f22960a;

    /* renamed from: b */
    private CampaignEx f22961b;

    public C9385a(Activity activity, CampaignEx campaignEx) {
        this.f22960a = activity;
        this.f22961b = campaignEx;
    }

    /* renamed from: a */
    public void mo62252a(int i, Object obj) {
        super.mo62252a(i, obj);
        if (i == 106 && this.f22960a != null && this.f22961b != null) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                String a = C2309b.m5444a(this.f22961b.getClickURL(), "-999", "-999");
                if (!TextUtils.isEmpty(a)) {
                    intent.setData(Uri.parse(a));
                    this.f22960a.startActivity(intent);
                }
            } catch (Throwable th) {
                C8608u.m24881a("NotifyListener", th.getMessage(), th);
            }
            this.f22960a.finish();
        }
    }
}
