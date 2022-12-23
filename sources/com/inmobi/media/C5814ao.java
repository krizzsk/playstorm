package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5762ad;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.ao */
/* compiled from: NativeAdUnit */
public final class C5814ao extends C5762ad {

    /* renamed from: x */
    public static final String f14656x = C5814ao.class.getSimpleName();

    /* renamed from: A */
    private int f14657A = 0;

    /* renamed from: y */
    public WeakReference<View> f14658y;

    /* renamed from: z */
    public boolean f14659z = false;

    /* renamed from: a */
    public final void mo34609a(int i, C6337q qVar) {
    }

    /* renamed from: b */
    public final void mo34614b() {
    }

    /* renamed from: k */
    public final String mo34539k() {
        return "native";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final byte mo34541l() {
        return 0;
    }

    C5814ao(Context context, C5846ba baVar, C5762ad.C5780a aVar) {
        super(context, baVar, aVar);
        baVar.mo34779e();
        mo34470a(context, baVar, aVar);
    }

    /* renamed from: a */
    public final void mo34469a(Context context) {
        super.mo34469a(context);
        m17321b(context);
    }

    /* renamed from: aa */
    private boolean m17320aa() {
        C5762ad.C5780a p = mo34546p();
        if (mo34554x()) {
            if (p != null) {
                p.mo34584a((C5762ad) this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
            }
            return false;
        } else if (1 == mo34537j() || 2 == mo34537j()) {
            C6238hu.m18605a((byte) 1, f14656x, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            return false;
        } else {
            String str = f14656x;
            C6238hu.m18605a((byte) 2, str, "Fetching a Native ad for placement id: " + mo34535i().toString());
            if (4 == mo34537j()) {
                if (!mo34547q()) {
                    if (p != null) {
                        m17321b(mo34533h());
                        mo34499b(p);
                        mo34511c(p);
                    }
                    return false;
                }
                mo34607Y();
            }
            this.f14546l = false;
            return true;
        }
    }

    /* renamed from: b */
    private void m17321b(Context context) {
        C6286j s = mo34549s();
        if (s instanceof C6318n) {
            ((C6318n) s).mo35554a(context);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34478a(C5846ba baVar, boolean z) {
        super.mo34478a(baVar, z);
        if (!z) {
            if (!mo34535i().equals(baVar)) {
                return;
            }
            if (2 == mo34537j() || 4 == mo34537j()) {
                this.f14536b = 0;
                if (mo34546p() != null) {
                    mo34546p().mo34584a((C5762ad) this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE));
                }
            }
        } else if (mo34535i().equals(baVar) && 2 == mo34537j() && mo34546p() != null && mo34533h() != null) {
            if (this.f14544j) {
                this.f14545k = true;
                mo34452O();
                return;
            }
            mo34453P();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo34500b(C5849bb bbVar) {
        if (TJAdUnitConstants.String.HTML.equals(mo34544n()) || "htmlUrl".equals(mo34544n())) {
            mo34477a(mo34535i(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 57);
        } else {
            super.mo34500b(bbVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34492a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C5762ad.C5780a p;
        super.mo34492a(z, inMobiAdRequestStatus);
        if (mo34537j() == 2 && (p = mo34546p()) != null) {
            mo34499b(p);
        }
    }

    /* renamed from: S */
    public final void mo34456S() {
        mo34443F();
        try {
            if (!mo34455R()) {
                mo34457T();
            }
        } catch (IllegalStateException unused) {
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 48);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|(2:9|10)(4:11|(2:13|(1:15))(1:16)|17|(2:19|23)(1:24))) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        mo34472a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) com.google.common.base.Ascii.f17935CR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[Catch:{ Exception -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017 A[Catch:{ Exception -> 0x0042 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34476a(com.inmobi.media.C5838au r2, boolean r3, byte r4) {
        /*
            r1 = this;
            r0 = 1
            if (r3 != 0) goto L_0x000e
            com.inmobi.ads.InMobiAdRequestStatus r2 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r3 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r2.<init>(r3)
            r1.mo34472a((com.inmobi.ads.InMobiAdRequestStatus) r2, (boolean) r0, (byte) r4)
            return
        L_0x000e:
            super.mo34476a((com.inmobi.media.C5838au) r2, (boolean) r3, (byte) r4)     // Catch:{ IllegalStateException -> 0x0011 }
        L_0x0011:
            com.inmobi.media.au r2 = r1.mo34551u()     // Catch:{ Exception -> 0x0042 }
            if (r2 != 0) goto L_0x0024
            com.inmobi.ads.InMobiAdRequestStatus r2 = new com.inmobi.ads.InMobiAdRequestStatus     // Catch:{ Exception -> 0x0042 }
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r3 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR     // Catch:{ Exception -> 0x0042 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0042 }
            r3 = 55
            r1.mo34472a((com.inmobi.ads.InMobiAdRequestStatus) r2, (boolean) r0, (byte) r3)     // Catch:{ Exception -> 0x0042 }
            return
        L_0x0024:
            byte r3 = r1.f14542h     // Catch:{ Exception -> 0x0042 }
            if (r3 != 0) goto L_0x0033
            boolean r3 = r2.mo34731d()     // Catch:{ Exception -> 0x0042 }
            if (r3 != 0) goto L_0x0036
            r3 = 0
            r1.mo34542l(r3)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0036
        L_0x0033:
            r1.mo34475a((com.inmobi.media.C5838au) r2)     // Catch:{ Exception -> 0x0042 }
        L_0x0036:
            boolean r2 = r2.mo34731d()     // Catch:{ Exception -> 0x0042 }
            if (r2 == 0) goto L_0x0041
            r1.f14544j = r0     // Catch:{ Exception -> 0x0042 }
            r1.mo34451N()     // Catch:{ Exception -> 0x0042 }
        L_0x0041:
            return
        L_0x0042:
            com.inmobi.ads.InMobiAdRequestStatus r2 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r3 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r2.<init>(r3)
            r3 = 13
            r1.mo34472a((com.inmobi.ads.InMobiAdRequestStatus) r2, (boolean) r0, (byte) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5814ao.mo34476a(com.inmobi.media.au, boolean, byte):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo34453P() {
        this.f14557w.mo35434a(hashCode(), new C5816ap(this));
    }

    /* renamed from: Y */
    public final void mo34607Y() {
        try {
            super.mo34441D();
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, "InMobi", "Could not destroy native ad; SDK encountered unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
    }

    /* renamed from: Z */
    public final boolean mo34608Z() {
        return mo34537j() == 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Map<String, String> mo34543m() {
        Map<String, String> m = super.mo34543m();
        m.put("a-parentViewWidth", String.valueOf(C6252ic.m18655a().f15838a));
        m.put("a-productVersion", "NS-1.0.0-20160411");
        m.put("trackerType", "url_ping");
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo34528f(C5762ad.C5780a aVar) {
        if (mo34537j() == 4) {
            this.f14536b = 6;
        } else if (mo34537j() == 6) {
            this.f14657A++;
        }
        C6238hu.m18605a((byte) 2, "InMobi", "Successfully displayed fullscreen for placement id: " + mo34535i().toString());
        if (this.f14657A != 0) {
            return;
        }
        if (aVar != null) {
            mo34519d(aVar);
        } else {
            C6238hu.m18605a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo34531g(C5762ad.C5780a aVar) {
        if (mo34537j() == 6) {
            int i = this.f14657A;
            if (i > 0) {
                this.f14657A = i - 1;
            } else {
                this.f14536b = 4;
            }
        }
        C6238hu.m18605a((byte) 2, "InMobi", "Successfully dismissed fullscreen for placement id: " + mo34535i().toString());
        if (this.f14657A != 0 || mo34537j() != 4) {
            return;
        }
        if (aVar != null) {
            aVar.mo34595c();
        } else {
            C6238hu.m18605a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
        }
    }

    /* renamed from: y */
    public final void mo34555y() {
        if (!this.f14546l && m17320aa()) {
            super.mo34555y();
        }
    }
}
