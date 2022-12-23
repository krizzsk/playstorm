package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5762ad;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.ak */
/* compiled from: IntLoadMarkupInContainerNative */
final class C5800ak extends C5825as<Boolean> {

    /* renamed from: a */
    private final WeakReference<C5801al> f14626a;

    /* renamed from: b */
    private final WeakReference<C5762ad.C5780a> f14627b;

    /* renamed from: c */
    private byte f14628c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34436a(Object obj) {
        C5762ad.C5780a aVar;
        Boolean bool = (Boolean) obj;
        C5801al alVar = (C5801al) this.f14626a.get();
        if (alVar != null && (aVar = (C5762ad.C5780a) this.f14627b.get()) != null) {
            if (bool.booleanValue()) {
                C6286j s = alVar.mo34549s();
                C6337q M = alVar.mo34450M();
                if (M != null) {
                    if (s instanceof C6318n) {
                        C6318n nVar = (C6318n) s;
                        nVar.f16019t = M;
                        nVar.f16021v = alVar.f14542h;
                    } else {
                        alVar.mo34660b(aVar, (byte) 84);
                        return;
                    }
                }
                alVar.mo34662i(aVar);
                return;
            }
            byte b = this.f14628c;
            if (b != 0) {
                alVar.mo34487a(this.f14627b, b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            } else {
                alVar.mo34660b(aVar, (byte) 85);
            }
        }
    }

    C5800ak(C5801al alVar, C5762ad.C5780a aVar) {
        super(alVar, (byte) 5);
        this.f14626a = new WeakReference<>(alVar);
        this.f14627b = new WeakReference<>(aVar);
    }

    /* renamed from: b */
    public final void mo34437b() {
        super.mo34437b();
        C5801al alVar = (C5801al) this.f14626a.get();
        if (alVar != null && ((C5762ad.C5780a) this.f14627b.get()) != null) {
            alVar.mo34487a(this.f14627b, (byte) 40, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    /* renamed from: a */
    public final void mo34435a() {
        C5801al alVar = (C5801al) this.f14626a.get();
        if (alVar == null) {
            mo34703b(Boolean.FALSE);
            return;
        }
        C5762ad.C5780a aVar = (C5762ad.C5780a) this.f14627b.get();
        if (aVar == null) {
            mo34703b(Boolean.FALSE);
            return;
        }
        C5838au u = alVar.mo34551u();
        boolean z = true;
        if (u != null && !u.mo34726a(alVar.f14537c.mo35324a(alVar.mo34539k()).timeToLive)) {
            byte e = alVar.mo34521e(aVar);
            this.f14628c = e;
            if (e != 0) {
                z = false;
            }
            mo34703b(Boolean.valueOf(z));
            return;
        }
        mo34703b(Boolean.FALSE);
    }
}
