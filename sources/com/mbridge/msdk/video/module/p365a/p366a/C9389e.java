package com.mbridge.msdk.video.module.p365a.p366a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2385p;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;

/* renamed from: com.mbridge.msdk.video.module.a.a.e */
/* compiled from: DefaultImageLoaderListener */
public class C9389e implements C8428c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CampaignEx f22965a;

    /* renamed from: b */
    protected ImageView f22966b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f22967c;

    public C9389e(ImageView imageView) {
        this.f22966b = imageView;
    }

    public C9389e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.f22966b = imageView;
        this.f22965a = campaignEx;
        this.f22967c = str;
    }

    public void onSuccessLoad(Bitmap bitmap, String str) {
        if (bitmap == null) {
            try {
                C8608u.m24884d("ImageLoaderListener", "bitmap=null");
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        } else if (this.f22966b != null && !bitmap.isRecycled()) {
            this.f22966b.setImageBitmap(bitmap);
            this.f22966b.setVisibility(0);
        }
    }

    public void onFailedLoad(final String str, String str2) {
        C93901 r3 = new Runnable() {
            public final void run() {
                try {
                    C2385p a = C2385p.m5777a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
                    if (C9389e.this.f22965a == null) {
                        C8608u.m24880a("ImageLoaderListener", "campaign is null");
                        return;
                    }
                    C8412m mVar = new C8412m();
                    mVar.mo57471o("2000044");
                    mVar.mo57445c(C8596q.m24849n(C2350a.m5601e().mo15792g()));
                    mVar.mo57469n(C9389e.this.f22965a.getId());
                    mVar.mo57449d(C9389e.this.f22965a.getImageUrl());
                    mVar.mo57463k(C9389e.this.f22965a.getRequestId());
                    mVar.mo57465l(C9389e.this.f22965a.getRequestIdNotice());
                    mVar.mo57467m(C9389e.this.f22967c);
                    mVar.mo57473p(str);
                    a.mo15934a(mVar);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        if (C2358b.m5644a().mo15829d()) {
            C8442b.m24388a().execute(r3);
        } else {
            r3.run();
        }
        C8608u.m24884d("ImageLoaderListener", "desc:" + str);
    }
}
