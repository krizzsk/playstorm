package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.mbbanner.common.p323b.C8671b;

/* renamed from: com.mbridge.msdk.mbbanner.common.util.a */
/* compiled from: BannerDelivery */
public class C8710a {

    /* renamed from: a */
    private static final String f21120a = C8710a.class.getSimpleName();

    /* renamed from: b */
    private final Handler f21121b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f21122c;

    /* renamed from: a */
    public final void mo58047a(boolean z) {
        this.f21122c = z;
    }

    /* renamed from: a */
    public final void mo58044a(final C8671b bVar, final CampaignUnit campaignUnit, final String str) {
        this.f21121b.post(new Runnable() {
            public final void run() {
                C8671b bVar = bVar;
                if (bVar != null) {
                    bVar.mo57962a(str, campaignUnit, C8710a.this.f21122c);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo58046a(final C8671b bVar, final String str, final String str2) {
        this.f21121b.post(new Runnable() {
            public final void run() {
                C8671b bVar = bVar;
                if (bVar != null) {
                    bVar.mo57963a(str2, str, C8710a.this.f21122c);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo58045a(final C8671b bVar, final String str) {
        this.f21121b.post(new Runnable() {
            public final void run() {
                C8671b bVar = bVar;
                if (bVar != null) {
                    bVar.mo57964a(str, C8710a.this.f21122c);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo58048b(final C8671b bVar, final String str) {
        this.f21121b.post(new Runnable() {
            public final void run() {
                C8671b bVar = bVar;
                if (bVar != null) {
                    bVar.mo57965b(str, C8710a.this.f21122c);
                }
            }
        });
    }
}
