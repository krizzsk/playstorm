package com.inmobi.media;

import android.os.SystemClock;
import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5762ad;
import com.inmobi.media.C6145fs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.ac */
/* compiled from: AdFetcherTask */
final class C5761ac extends C5825as<C5849bb> {

    /* renamed from: a */
    private final WeakReference<C5762ad> f14524a;

    /* renamed from: b */
    private C5897bp f14525b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34436a(Object obj) {
        C5849bb bbVar = (C5849bb) obj;
        C5762ad adVar = (C5762ad) this.f14524a.get();
        if (adVar != null) {
            adVar.mo34527f((byte) 0);
            if (this.f14525b != null) {
                adVar.mo34477a(adVar.mo34535i(), this.f14525b.f14887a, this.f14525b.f14888b);
            } else if (bbVar == null) {
                adVar.mo34477a(adVar.mo34535i(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
            } else if (bbVar.mo34813c()) {
                adVar.mo34480a(bbVar);
            } else if (!adVar.f14546l && adVar.mo34533h() != null && adVar.mo34537j() == 1) {
                adVar.f14550p = bbVar;
                adVar.f14556v = adVar.f14550p.mo34814d();
                C5762ad.C5780a p = adVar.mo34546p();
                if (p != null) {
                    p.mo34586a(adVar.f14549o, bbVar);
                }
            }
        }
    }

    C5761ac(C5762ad adVar) {
        super(adVar, (byte) 0);
        this.f14524a = new WeakReference<>(adVar);
    }

    /* renamed from: b */
    public final void mo34437b() {
        super.mo34437b();
        C5762ad adVar = (C5762ad) this.f14524a.get();
        if (adVar != null) {
            adVar.mo34477a(adVar.mo34535i(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (byte) 56);
        }
    }

    /* renamed from: a */
    public final void mo34435a() {
        C5762ad adVar = (C5762ad) this.f14524a.get();
        if (adVar == null) {
            this.f14525b = new C5897bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
            mo34703b(null);
            return;
        }
        boolean z = true;
        if (!((C6166gd) C6145fs.m18321a("root", C6227ho.m18559f(), (C6145fs.C6148c) null)).mo35352i()) {
            adVar.f14539e = System.currentTimeMillis();
            try {
                C5851bc r = adVar.mo34548r();
                C5930cm C = adVar.mo34440C();
                Integer w = adVar.mo34553w();
                if (w != null) {
                    if (SystemClock.elapsedRealtime() - r.f14776c >= ((long) (w.intValue() * 1000))) {
                        z = false;
                    }
                    if (z) {
                        throw new C5897bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST), Ascii.DLE);
                    }
                }
                C5851bc.m17515a(C);
                r.f14776c = SystemClock.elapsedRealtime();
                C5931cn a = new C5929cl(C).mo34921a();
                if (a == null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 7);
                    r.mo34827a((Map<String, Object>) hashMap);
                    throw new C5897bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
                } else if (a.f15035a.f15722a == null) {
                    mo34703b(r.mo34825a(a));
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, String.valueOf(a.f15035a.f15722a.f15700a));
                    r.mo34827a((Map<String, Object>) hashMap2);
                    throw new C5897bp(a.f15036b, (byte) 0);
                }
            } catch (C5897bp e) {
                String str = C5762ad.f14527a;
                this.f14525b = e;
                mo34703b(null);
            }
        } else {
            C6238hu.m18605a((byte) 1, C5762ad.f14527a, "SDK will not perform this load operation as monetization has been disabled. Please contact InMobi for further info.");
            this.f14525b = new C5897bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (byte) 9);
            mo34703b(null);
        }
    }
}
