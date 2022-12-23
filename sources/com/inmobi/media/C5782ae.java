package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5762ad;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ae */
/* compiled from: AuctionCloseWorker */
final class C5782ae extends C5825as<InMobiAdRequestStatus> {

    /* renamed from: a */
    private final WeakReference<C5762ad> f14591a;

    /* renamed from: b */
    private final JSONObject f14592b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34436a(Object obj) {
        C5762ad.C5780a p;
        InMobiAdRequestStatus inMobiAdRequestStatus = (InMobiAdRequestStatus) obj;
        C5762ad adVar = (C5762ad) this.f14591a.get();
        if (adVar != null && (p = adVar.mo34546p()) != null) {
            if (inMobiAdRequestStatus == null) {
                adVar.f14536b = 2;
                adVar.mo34499b(p);
                return;
            }
            p.mo34583a(inMobiAdRequestStatus);
        }
    }

    C5782ae(C5762ad adVar, JSONObject jSONObject) {
        super(adVar, (byte) 4);
        this.f14591a = new WeakReference<>(adVar);
        this.f14592b = jSONObject;
    }

    /* renamed from: b */
    public final void mo34437b() {
        C5762ad.C5780a p;
        super.mo34437b();
        C5762ad adVar = (C5762ad) this.f14591a.get();
        if (adVar != null && (p = adVar.mo34546p()) != null) {
            p.mo34583a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    /* renamed from: a */
    public final void mo34435a() {
        C5762ad adVar = (C5762ad) this.f14591a.get();
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        if (adVar == null || adVar.f14550p == null) {
            mo34703b(inMobiAdRequestStatus);
            return;
        }
        try {
            adVar.f14550p.mo34811a(this.f14592b, adVar.f14537c);
            mo34703b(null);
        } catch (Exception unused) {
            String str = C5762ad.f14527a;
            mo34703b(inMobiAdRequestStatus);
        }
    }
}
