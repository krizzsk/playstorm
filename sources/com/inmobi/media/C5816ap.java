package com.inmobi.media;

import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5762ad;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.ap */
/* compiled from: NativeLoadMarkupInContainerNative */
final class C5816ap extends C5825as<Byte> {

    /* renamed from: a */
    private final WeakReference<C5814ao> f14662a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34436a(Object obj) {
        Byte b = (Byte) obj;
        C5814ao aoVar = (C5814ao) this.f14662a.get();
        if (aoVar != null) {
            if (b.byteValue() != 0) {
                aoVar.mo34487a((WeakReference<C5762ad.C5780a>) new WeakReference(aoVar.mo34546p()), b.byteValue(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            } else if (2 == aoVar.mo34537j()) {
                aoVar.f14536b = 4;
                C6286j s = aoVar.mo34549s();
                C6337q M = aoVar.mo34450M();
                C5762ad.C5780a p = aoVar.mo34546p();
                if (s instanceof C6318n) {
                    C6318n nVar = (C6318n) s;
                    nVar.f16019t = M;
                    nVar.f16021v = aoVar.f14542h;
                    aoVar.mo34446I();
                    if (p != null) {
                        String str = C5814ao.f14656x;
                        aoVar.mo34511c(p);
                    }
                } else if (p != null) {
                    String str2 = C5814ao.f14656x;
                    p.mo34584a((C5762ad) aoVar, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    C5816ap(C5814ao aoVar) {
        super(aoVar, (byte) 6);
        this.f14662a = new WeakReference<>(aoVar);
    }

    /* renamed from: b */
    public final void mo34437b() {
        C5762ad.C5780a p;
        super.mo34437b();
        C5814ao aoVar = (C5814ao) this.f14662a.get();
        if (aoVar != null && (p = aoVar.mo34546p()) != null) {
            p.mo34584a((C5762ad) aoVar, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    /* renamed from: a */
    public final void mo34435a() {
        C5814ao aoVar = (C5814ao) this.f14662a.get();
        if (aoVar == null) {
            mo34703b(Byte.valueOf(Ascii.f17935CR));
        } else {
            mo34703b(Byte.valueOf(aoVar.mo34521e(aoVar.mo34546p())));
        }
    }
}
