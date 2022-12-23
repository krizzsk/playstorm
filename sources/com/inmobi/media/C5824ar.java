package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: com.inmobi.media.ar */
/* compiled from: ParseAdResponseWorker */
final class C5824ar extends C5825as<Boolean> {

    /* renamed from: a */
    private final WeakReference<C5762ad> f14675a;

    /* renamed from: b */
    private final C5838au f14676b;

    /* renamed from: c */
    private final C5849bb f14677c;

    /* renamed from: d */
    private final boolean f14678d;

    /* renamed from: e */
    private InMobiAdRequestStatus f14679e;

    C5824ar(C5762ad adVar, C5838au auVar, C5849bb bbVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super(adVar, (byte) 1);
        this.f14675a = new WeakReference<>(adVar);
        this.f14676b = auVar;
        this.f14677c = bbVar;
        this.f14678d = z;
        this.f14679e = inMobiAdRequestStatus;
    }

    /* renamed from: b */
    public final void mo34437b() {
        super.mo34437b();
        this.f14679e = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY);
        mo34436a(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo34436a(Boolean bool) {
        C5762ad adVar = (C5762ad) this.f14675a.get();
        if (adVar == null) {
            return;
        }
        if (this.f14678d) {
            adVar.mo34505b(bool.booleanValue(), this.f14679e);
        } else {
            adVar.mo34492a(bool.booleanValue(), this.f14679e);
        }
    }

    /* renamed from: a */
    public final void mo34435a() {
        C5762ad adVar = (C5762ad) this.f14675a.get();
        if (adVar == null) {
            mo34703b(Boolean.FALSE);
        } else if (this.f14677c.mo34814d()) {
            LinkedList<C5838au> b = this.f14677c.mo34812b();
            if (adVar.mo34494a(b.getFirst(), 0)) {
                ListIterator<C5838au> listIterator = b.listIterator(1);
                while (listIterator.hasNext()) {
                    C5838au next = listIterator.next();
                    if (!adVar.mo34494a(next, b.indexOf(next))) {
                        listIterator.remove();
                    }
                }
                mo34703b(Boolean.TRUE);
                return;
            }
            mo34703b(Boolean.FALSE);
        } else {
            mo34703b(Boolean.valueOf(adVar.mo34494a(this.f14676b, 0)));
        }
    }
}
