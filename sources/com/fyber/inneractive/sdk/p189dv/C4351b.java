package com.fyber.inneractive.sdk.p189dv;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C4406c;
import com.fyber.inneractive.sdk.p189dv.banner.C4353a;
import com.fyber.inneractive.sdk.p189dv.interstitial.C4372b;
import com.fyber.inneractive.sdk.p189dv.interstitial.C4375c;
import com.fyber.inneractive.sdk.p189dv.rewarded.C4379a;
import com.fyber.inneractive.sdk.p189dv.rewarded.C4383b;
import com.fyber.inneractive.sdk.util.C5350l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;

/* renamed from: com.fyber.inneractive.sdk.dv.b */
public class C4351b extends C4406c<C4363f, C4350a> implements C4360d {

    /* renamed from: h */
    public boolean f10757h = (!C5350l.m16757a("com.google.android.gms.ads.InterstitialAd"));

    /* renamed from: com.fyber.inneractive.sdk.dv.b$a */
    public static /* synthetic */ class C4352a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10758a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10758a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10758a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10758a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10758a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p189dv.C4351b.C4352a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public String mo24370b() {
        return null;
    }

    /* renamed from: e */
    public void mo24371e() {
        Content content;
        Response response = this.f10871b;
        if (response == null || ((C4363f) response).f14084s == null) {
            mo24372f();
            return;
        }
        InneractiveAdRequest inneractiveAdRequest = this.f10870a;
        if (inneractiveAdRequest != null) {
            boolean muteVideo = inneractiveAdRequest.getMuteVideo();
            try {
                MobileAds.setAppMuted(muteVideo);
                MobileAds.setAppVolume(muteVideo ? 0.0f : 1.0f);
            } catch (Throwable unused) {
            }
        }
        C4363f fVar = (C4363f) this.f10871b;
        UnitDisplayType unitDisplayType = fVar.f14079n;
        QueryInfo queryInfo = fVar.f14084s.f10769a;
        int i = C4352a.f10758a[unitDisplayType.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                content = new C4353a(mo24570c(), this.f10875f, (C4363f) this.f10871b);
            } else if (i != 4) {
                content = null;
            } else if (this.f10757h) {
                content = new C4379a(mo24570c(), this.f10875f, (C4363f) this.f10871b);
            } else {
                content = new C4383b(mo24570c(), this.f10875f, (C4363f) this.f10871b);
            }
        } else if (this.f10757h) {
            content = new C4372b(mo24570c(), this.f10875f, (C4363f) this.f10871b);
        } else {
            content = new C4375c(mo24570c(), this.f10875f, (C4363f) this.f10871b);
        }
        this.f10872c = content;
        if (queryInfo == null || content == null) {
            mo24372f();
        } else {
            ((C4350a) this.f10872c).mo24366a(new AdRequest.Builder().setAdInfo(new AdInfo(queryInfo, ((C4363f) this.f10871b).f10768B)).build(), this);
        }
    }

    /* renamed from: f */
    public void mo24372f() {
        mo24569a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
    }
}
