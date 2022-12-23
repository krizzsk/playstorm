package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C5762ad;
import com.inmobi.media.C5846ba;

/* renamed from: com.inmobi.media.am */
/* compiled from: InterstitialUnifiedAdManager */
public class C5808am extends C5827at {

    /* renamed from: k */
    private static final String f14641k = C5808am.class.getSimpleName();

    /* renamed from: l */
    private static final String f14642l = "InMobi";

    /* renamed from: m */
    private C5801al f14643m;

    /* renamed from: n */
    private boolean f14644n;

    /* renamed from: d */
    private void m17297d(final AdMetaInfo adMetaInfo) {
        super.mo34591b(adMetaInfo);
        this.f14688f = 2;
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5808am.this.f14690h != null) {
                    C5808am.this.f14690h.onAdLoadSucceeded(adMetaInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private void m17295a(boolean z, byte b) {
        C5801al alVar = this.f14643m;
        if (!(alVar == null || b == 0)) {
            alVar.mo34510c((int) b);
        }
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5808am.this.f14690h != null) {
                    C5808am.this.f14690h.onAdDisplayFailed();
                }
                C5808am.this.m17300q();
            }
        });
        if (z) {
            this.f14688f = 6;
            C5801al alVar2 = this.f14643m;
            if (alVar2 != null) {
                alVar2.mo34441D();
            }
        }
    }

    /* renamed from: a */
    public void mo34670a(C5894bm bmVar, Context context) {
        if (this.f14643m == null) {
            this.f14643m = new C5801al(context, new C5846ba.C5848a("int", f14642l).mo34797a(bmVar.f14879a).mo34806c(bmVar.f14880b).mo34801a(bmVar.f14881c).mo34807d(bmVar.f14883e).mo34808e(bmVar.f14884f).mo34803a(), this);
        }
        if (!TextUtils.isEmpty(bmVar.f14883e)) {
            this.f14643m.mo34447J();
        }
        this.f14643m.mo34469a(context);
        this.f14643m.mo34489a(bmVar.f14881c);
        this.f14643m.mo34501b("activity");
        if (bmVar.f14882d) {
            this.f14643m.mo34608Z();
        }
    }

    /* renamed from: a */
    public void mo34582a(final AdMetaInfo adMetaInfo) {
        this.f14692j = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        if (this.f14643m == null) {
            mo34584a((C5762ad) null, inMobiAdRequestStatus);
            return;
        }
        super.mo34582a(adMetaInfo);
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5808am.this.f14690h != null) {
                    C5808am.this.f14690h.onAdFetchSuccessful(adMetaInfo);
                }
            }
        });
    }

    /* renamed from: l */
    public void mo34671l() throws IllegalStateException {
        C5801al alVar = this.f14643m;
        if (alVar != null) {
            if (!alVar.mo34607Y() || this.f14692j == null) {
                if (this.f14644n) {
                    this.f14643m.mo34465a((byte) 89);
                    C6238hu.m18605a((byte) 1, f14642l, C5827at.f14683b);
                    return;
                }
                C5838au u = this.f14643m.mo34551u();
                boolean a = mo34708a(f14642l, this.f14643m.mo34535i().toString());
                if (u != null && this.f14692j != null && a) {
                    if (u.mo34738k()) {
                        this.f14688f = 8;
                        if (this.f14643m.mo34525e((byte) 1)) {
                            this.f14643m.mo34456S();
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            m17297d(this.f14692j);
            return;
        }
        throw new IllegalStateException(C5827at.f14685d);
    }

    /* renamed from: b */
    public final void mo34591b(AdMetaInfo adMetaInfo) {
        C5801al alVar = this.f14643m;
        if (alVar == null) {
            m17298d((C5762ad) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        try {
            if (!m17296a(alVar, true) || this.f14644n) {
                this.f14643m.mo34448K();
                this.f14643m.mo34661h(this);
                return;
            }
            m17297d(adMetaInfo);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public final void mo34580a() {
        C5801al alVar = this.f14643m;
        if (alVar != null) {
            alVar.mo34498b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    /* renamed from: c */
    public final void mo34595c() {
        C5801al alVar = this.f14643m;
        if (alVar != null && !alVar.mo34459V()) {
            this.f14691i.post(new Runnable() {
                public final void run() {
                    if (C5808am.this.f14690h != null) {
                        C5808am.this.f14690h.onAdDismissed();
                    }
                }
            });
            this.f14643m.mo34441D();
            this.f14688f = 0;
            this.f14689g = null;
            this.f14643m.mo34460W();
        }
    }

    /* renamed from: m */
    public C5762ad mo34645m() {
        return this.f14643m;
    }

    /* renamed from: a */
    public void mo34669a(PublisherCallbacks publisherCallbacks) {
        if (this.f14689g != null && !this.f14689g.booleanValue()) {
            this.f14643m.mo34497b((byte) 52);
            C6238hu.m18605a((byte) 1, f14642l, "Cannot call load() API after calling load(byte[])");
        } else if (this.f14644n) {
            this.f14643m.mo34497b((byte) 89);
            C6238hu.m18605a((byte) 1, f14642l, C5827at.f14683b);
        } else {
            this.f14689g = Boolean.TRUE;
            C5801al alVar = this.f14643m;
            if (alVar != null && mo34709a(f14642l, alVar.mo34535i().toString(), publisherCallbacks)) {
                this.f14688f = 1;
                this.f14690h = publisherCallbacks;
                String str = f14641k;
                C6238hu.m18605a((byte) 2, str, "Fetching an Interstitial ad for placement id: " + this.f14643m.mo34535i().toString());
                this.f14643m.mo34473a((C5762ad.C5780a) this);
                this.f14643m.mo34555y();
            }
        }
    }

    /* renamed from: n */
    public boolean mo34672n() {
        if (this.f14643m == null || 2 != this.f14688f) {
            return false;
        }
        try {
            if (!m17296a(this.f14643m, false) || this.f14643m.mo34607Y()) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* renamed from: o */
    public void mo34673o() {
        this.f14643m.mo34448K();
        if (!m17299p()) {
            return;
        }
        if (!C6256ie.m18678h()) {
            C5801al alVar = this.f14643m;
            if (alVar != null) {
                alVar.mo34510c(21);
                m17298d(this.f14643m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED));
                this.f14643m.mo34441D();
                return;
            }
            return;
        }
        C5801al alVar2 = this.f14643m;
        if (alVar2 != null && alVar2.mo34525e((byte) 4)) {
            this.f14644n = true;
            try {
                if (m17296a(this.f14643m, true)) {
                    this.f14643m.mo34661h(this);
                } else {
                    this.f14643m.mo34456S();
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: i */
    public void mo34602i() {
        C5762ad m = mo34645m();
        if (m == null) {
            return;
        }
        if (m.mo34537j() == 6 || m.mo34537j() == 7) {
            C5801al alVar = this.f14643m;
            if (alVar != null) {
                alVar.mo34460W();
            }
            m.mo34531g((C5762ad.C5780a) this);
            return;
        }
        m17295a(true, (byte) 45);
    }

    /* renamed from: j */
    public void mo34603j() {
        C5801al alVar = this.f14643m;
        if (alVar != null) {
            alVar.mo34498b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo34641b(C5762ad adVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (!z) {
            m17298d(adVar, inMobiAdRequestStatus);
        }
    }

    /* renamed from: a */
    public final void mo34584a(C5762ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (inMobiAdRequestStatus == null || !InMobiAdRequestStatus.StatusCode.AD_ACTIVE.equals(inMobiAdRequestStatus.getStatusCode())) {
            super.mo34584a(adVar, inMobiAdRequestStatus);
        } else {
            mo34711c(adVar, inMobiAdRequestStatus);
        }
    }

    /* renamed from: c */
    public void mo34596c(AdMetaInfo adMetaInfo) {
        super.mo34596c(adMetaInfo);
        C5762ad m = mo34645m();
        if (m != null) {
            m.mo34449L();
        }
        this.f14644n = false;
    }

    /* renamed from: a */
    private boolean m17296a(C5801al alVar, boolean z) throws IllegalStateException {
        C5838au auVar;
        C5849bb bbVar = alVar.f14550p;
        if (bbVar == null) {
            auVar = null;
        } else {
            auVar = bbVar.mo34822l();
        }
        if (auVar != null) {
            return bbVar.mo34820j();
        }
        if (z) {
            m17298d(alVar, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
        throw new IllegalStateException("AdUnit doesn't have a current ad");
    }

    /* renamed from: d */
    private void m17298d(C5762ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        byte b = this.f14688f;
        if (b != 1) {
            if (b == 2) {
                C6238hu.m18605a((byte) 1, f14642l, "Unable to Show Ad, canShowAd Failed");
                m17295a(true, (byte) 0);
                return;
            } else if (b == 5) {
                C6238hu.m18605a((byte) 1, f14642l, "Ad will be dismissed, Internal error");
                C5801al alVar = this.f14643m;
                if (alVar != null) {
                    alVar.mo34460W();
                }
                m17300q();
                mo34595c();
                return;
            } else if (b != 8) {
                return;
            }
        }
        mo34711c(adVar, inMobiAdRequestStatus);
    }

    /* renamed from: p */
    private boolean m17299p() {
        byte b = this.f14688f;
        if (b != 1) {
            if (b == 5) {
                if (this.f14643m != null) {
                    C6238hu.m18605a((byte) 1, f14642l, C5827at.f14682a + this.f14643m.mo34535i().toString());
                    m17295a(false, (byte) Ascii.f17944SI);
                }
                return false;
            } else if (b != 7) {
                if (!this.f14644n) {
                    return true;
                }
                C5801al alVar = this.f14643m;
                if (alVar != null) {
                    alVar.mo34510c(89);
                }
                C6238hu.m18605a((byte) 1, f14642l, C5827at.f14683b);
                return false;
            }
        }
        C6238hu.m18605a((byte) 1, f14642l, "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m17300q() {
        C5801al alVar = this.f14643m;
        if (alVar != null) {
            alVar.mo34527f((byte) 4);
        }
    }
}
