package com.inmobi.media;

import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5762ad;
import com.inmobi.media.C6145fs;
import com.smaato.sdk.video.vast.model.C11286Ad;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.inmobi.media.aj */
/* compiled from: GetSignalsWorker */
final class C5799aj extends C5825as<byte[]> {

    /* renamed from: a */
    private final WeakReference<C5762ad> f14623a;

    /* renamed from: b */
    private C5897bp f14624b;

    /* renamed from: c */
    private final long f14625c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34436a(Object obj) {
        byte[] bArr = (byte[]) obj;
        C5762ad adVar = (C5762ad) this.f14623a.get();
        if (adVar != null) {
            if (this.f14624b != null) {
                adVar.f14536b = 3;
            }
            C5762ad.C5780a p = adVar.mo34546p();
            if (p != null) {
                C5897bp bpVar = this.f14624b;
                if (bpVar != null) {
                    adVar.mo34466a((int) bpVar.f14888b, this.f14625c);
                    p.mo34592b(new InMobiAdRequestStatus(this.f14624b.f14887a.getStatusCode()));
                } else if (bArr == null) {
                    adVar.f14536b = 3;
                    adVar.mo34466a(13, this.f14625c);
                    p.mo34592b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                } else {
                    long j = this.f14625c;
                    adVar.f14547m = false;
                    HashMap hashMap = new HashMap();
                    hashMap.put(C11286Ad.AD_TYPE, adVar.mo34539k());
                    hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j));
                    hashMap.put("networkType", C6251ib.m18652b());
                    adVar.mo34514c("AdGetSignalsSucceeded", hashMap);
                    p.mo34589a(bArr);
                }
            }
        }
    }

    C5799aj(C5762ad adVar, long j) {
        super(adVar, (byte) 2);
        this.f14623a = new WeakReference<>(adVar);
        this.f14625c = j;
    }

    /* renamed from: b */
    public final void mo34437b() {
        C5762ad.C5780a p;
        super.mo34437b();
        C5762ad adVar = (C5762ad) this.f14623a.get();
        if (adVar != null && (p = adVar.mo34546p()) != null) {
            p.mo34592b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    /* renamed from: a */
    public final void mo34435a() {
        C5762ad adVar = (C5762ad) this.f14623a.get();
        if (adVar == null || adVar.f14548n == null) {
            mo34703b(null);
        } else if (adVar.mo34546p() == null) {
            mo34703b(null);
        } else {
            try {
                C5927cj cjVar = adVar.f14548n;
                cjVar.f15022b = new C5928ck(cjVar.f15021a);
                C5930cm C = cjVar.f15022b.f15023a.mo34440C();
                HashMap hashMap = new HashMap();
                hashMap.put("h-user-agent", C6227ho.m18564i());
                C.mo35388c(hashMap);
                C.mo34922a();
                if (((C6166gd) C6145fs.m18321a("root", C6227ho.m18559f(), (C6145fs.C6148c) null)).mo35352i()) {
                    throw new C5897bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (byte) 9);
                } else if (C.f15717q) {
                    mo34703b(C.mo35393f().getBytes());
                } else {
                    throw new C5897bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), Ascii.NAK);
                }
            } catch (C5897bp e) {
                this.f14624b = e;
                mo34703b(null);
            }
        }
    }
}
