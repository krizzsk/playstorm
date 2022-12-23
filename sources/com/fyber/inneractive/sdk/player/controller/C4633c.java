package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.view.View;
import com.fyber.inneractive.sdk.C4167R;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.measurement.C4459a;
import com.fyber.inneractive.sdk.model.vast.C4483g;
import com.fyber.inneractive.sdk.p192ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.renderers.C5274g;
import com.fyber.inneractive.sdk.util.C5328f0;
import com.fyber.inneractive.sdk.util.C5334g;
import com.fyber.inneractive.sdk.util.C5367q0;
import com.fyber.inneractive.sdk.web.C5405c;
import com.fyber.inneractive.sdk.web.C5407d;

/* renamed from: com.fyber.inneractive.sdk.player.controller.c */
public class C4633c {

    /* renamed from: a */
    public IAmraidWebViewController f11546a;

    /* renamed from: b */
    public C5407d.C5414g f11547b = C5407d.C5414g.INLINE;

    /* renamed from: c */
    public UnitDisplayType f11548c;

    /* renamed from: d */
    public C5407d.C5411d f11549d = C5407d.C5411d.ENABLED;

    /* renamed from: e */
    public boolean f11550e;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.c$a */
    public static /* synthetic */ class C4634a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11551a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f11552b;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|5|6|7|8|9|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
        static {
            /*
                com.fyber.inneractive.sdk.model.vast.g[] r0 = com.fyber.inneractive.sdk.model.vast.C4483g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11552b = r0
                r1 = 1
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                int[] r2 = f11552b     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2[r0] = r0     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r2 = f11552b     // Catch:{ NoSuchFieldError -> 0x0017 }
                r3 = 3
                r2[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f11551a = r2
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r3 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r1 = f11551a     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4633c.C4634a.<clinit>():void");
        }
    }

    public C4633c(Context context, UnitDisplayType unitDisplayType, boolean z, int i, int i2, C4346z zVar, C4483g gVar) {
        mo24884a(unitDisplayType, z);
        try {
            this.f11546a = new IAmraidWebViewController(context, C5334g.m16733a(unitDisplayType, IAConfigManager.m13429b().mo24350a()), this.f11547b, this.f11549d, C5407d.C5415h.AD_CONTROLLED, true, (C4459a) null);
            mo24885a(gVar);
            C5328f0.m16724a().mo26444a(context, (View) this.f11546a.mo26499a(), (C5328f0.C5333e) this.f11546a);
            this.f11546a.mo26507c();
            C5367q0 a = C5274g.m16466a(i, i2, zVar);
            this.f11546a.setAdDefaultSize(a.f14238a, a.f14239b);
        } catch (Throwable unused) {
            this.f11546a = null;
        }
    }

    /* renamed from: a */
    public void mo24884a(UnitDisplayType unitDisplayType, boolean z) {
        this.f11548c = unitDisplayType;
        this.f11550e = z;
        int i = C4634a.f11551a[unitDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            this.f11549d = C5407d.C5411d.ENABLED;
            if (z) {
                this.f11547b = C5407d.C5414g.INTERSTITIAL;
                return;
            }
            return;
        }
        this.f11549d = C5407d.C5411d.ENABLED;
    }

    /* renamed from: a */
    public final void mo24885a(C4483g gVar) {
        C5405c cVar = this.f11546a.f14280b;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            cVar.setId(C4167R.C4169id.inneractive_vast_endcard_gif);
        } else if (ordinal == 1) {
            cVar.setId(C4167R.C4169id.inneractive_vast_endcard_iframe);
        } else if (ordinal == 2) {
            cVar.setId(C4167R.C4169id.inneractive_vast_endcard_html);
        }
    }
}
