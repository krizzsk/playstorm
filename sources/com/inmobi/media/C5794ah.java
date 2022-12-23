package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C5762ad;
import com.inmobi.media.C5846ba;
import com.p374my.tracker.ads.AdFormat;
import java.util.Map;

/* renamed from: com.inmobi.media.ah */
/* compiled from: BannerUnifiedAdManager */
public class C5794ah extends C5827at {

    /* renamed from: k */
    private static final String f14611k = C5794ah.class.getSimpleName();

    /* renamed from: l */
    private static final String f14612l = "InMobi";

    /* renamed from: m */
    private C5785ag f14613m;

    /* renamed from: n */
    private C5785ag f14614n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C5785ag f14615o;

    /* renamed from: p */
    private C5785ag f14616p;

    /* renamed from: a */
    public void mo34635a(Context context, C5894bm bmVar, String str) {
        C5846ba a = new C5846ba.C5848a(AdFormat.BANNER, f14612l).mo34805b(C5963d.m17818a(context)).mo34797a(bmVar.f14879a).mo34806c(bmVar.f14880b).mo34801a(bmVar.f14881c).mo34800a(str).mo34802a(bmVar.f14882d).mo34807d(bmVar.f14883e).mo34808e(bmVar.f14884f).mo34803a();
        C5785ag agVar = this.f14613m;
        if (agVar == null || this.f14614n == null) {
            this.f14613m = new C5785ag(context, a, this);
            this.f14614n = new C5785ag(context, a, this);
            this.f14616p = this.f14613m;
            return;
        }
        agVar.mo34470a(context, a, (C5762ad.C5780a) this);
        this.f14614n.mo34470a(context, a, (C5762ad.C5780a) this);
    }

    /* renamed from: a */
    public final void mo34582a(final AdMetaInfo adMetaInfo) {
        this.f14692j = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C5785ag agVar = this.f14616p;
        if (agVar == null) {
            mo34584a((C5762ad) null, inMobiAdRequestStatus);
        } else if (agVar.mo34551u() == null) {
            mo34584a((C5762ad) null, inMobiAdRequestStatus);
        } else {
            super.mo34582a(adMetaInfo);
            this.f14691i.post(new Runnable() {
                public final void run() {
                    if (C5794ah.this.f14690h != null) {
                        C5794ah.this.f14690h.onAdFetchSuccessful(adMetaInfo);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo34591b(final AdMetaInfo adMetaInfo) {
        super.mo34591b(adMetaInfo);
        this.f14688f = 0;
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5794ah.this.f14690h != null) {
                    C5794ah.this.f14690h.onAdLoadSucceeded(adMetaInfo);
                }
            }
        });
    }

    /* renamed from: c */
    public void mo34595c() {
        this.f14688f = 0;
        super.mo34595c();
    }

    /* renamed from: j */
    public void mo34603j() {
        C5762ad m = mo34645m();
        if (m != null) {
            m.mo34498b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    /* renamed from: a */
    public void mo34581a(int i, final int i2, C6337q qVar) {
        super.mo34581a(i, i2, qVar);
        try {
            if (this.f14615o != null) {
                InMobiBanner inMobiBanner = (InMobiBanner) qVar.getParent();
                if (inMobiBanner != null) {
                    this.f14615o.mo34468a(i2, true);
                    mo34643c(inMobiBanner);
                    this.f14691i.post(new Runnable() {
                        public final void run() {
                            if (C5794ah.this.f14615o != null) {
                                C5794ah.this.f14615o.mo34518d(i2);
                            }
                        }
                    });
                    return;
                }
                this.f14615o.mo34523e(i2);
                this.f14615o.mo34468a(i2, false);
            }
        } catch (Exception unused) {
            this.f14615o.mo34523e(i2);
            this.f14615o.mo34468a(i2, false);
        }
    }

    /* renamed from: l */
    public boolean mo34644l() {
        C5785ag agVar;
        C5785ag agVar2 = this.f14616p;
        if (agVar2 == null || agVar2.mo34537j() == 4 || this.f14616p.mo34537j() == 1 || this.f14616p.mo34537j() == 2 || ((agVar = this.f14615o) != null && agVar.mo34537j() == 7)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public C5762ad mo34645m() {
        if (m17215y()) {
            return this.f14615o;
        }
        return this.f14616p;
    }

    /* renamed from: y */
    private boolean m17215y() {
        C5785ag agVar = this.f14615o;
        if (agVar != null) {
            return agVar.mo34537j() == 4 || this.f14615o.mo34537j() == 7 || this.f14615o.mo34537j() == 6;
        }
        return false;
    }

    /* renamed from: a */
    public void mo34637a(PublisherCallbacks publisherCallbacks, String str, boolean z) {
        if (this.f14689g == null || this.f14689g.booleanValue()) {
            this.f14689g = Boolean.TRUE;
            C5785ag agVar = this.f14616p;
            if (agVar != null && mo34709a(f14612l, agVar.mo34535i().toString(), publisherCallbacks)) {
                this.f14688f = 1;
                this.f14692j = null;
                this.f14690h = publisherCallbacks;
                this.f14616p.mo34617c(str);
                this.f14616p.mo34615b(z);
                return;
            }
            return;
        }
        C5785ag agVar2 = this.f14616p;
        if (agVar2 != null) {
            agVar2.mo34497b((byte) 52);
        }
        C6238hu.m18605a((byte) 1, f14612l, "Cannot call load() API after calling load(byte[])");
    }

    /* renamed from: n */
    public void mo34646n() throws IllegalStateException {
        C5785ag agVar = this.f14616p;
        if (agVar == null) {
            throw new IllegalStateException(C5827at.f14685d);
        } else if (mo34708a(f14612l, agVar.mo34535i().toString())) {
            this.f14688f = 8;
            if (this.f14616p.mo34525e((byte) 1)) {
                this.f14616p.mo34456S();
            }
        }
    }

    /* renamed from: o */
    public void mo34647o() {
        C5785ag agVar = this.f14616p;
        if (agVar != null) {
            agVar.mo34556z();
        }
    }

    /* renamed from: a */
    public void mo34638a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        if (this.f14689g == null || !this.f14689g.booleanValue()) {
            this.f14689g = Boolean.FALSE;
            this.f14688f = 1;
            if (this.f14616p != null) {
                C5785ag agVar = this.f14615o;
                if (agVar == null || !agVar.mo34438A()) {
                    this.f14690h = publisherCallbacks;
                    this.f14616p.f14546l = false;
                    this.f14616p.mo34493a(bArr);
                    return;
                }
                return;
            }
            return;
        }
        C6238hu.m18605a((byte) 1, f14612l, "Cannot call load(byte[]) API after load() API is called");
    }

    /* renamed from: p */
    public void mo34648p() {
        C5785ag agVar = this.f14615o;
        if (agVar == null) {
            this.f14615o = this.f14613m;
            this.f14616p = this.f14614n;
        } else if (agVar.equals(this.f14613m)) {
            this.f14615o = this.f14614n;
            this.f14616p = this.f14613m;
        } else if (this.f14615o.equals(this.f14614n)) {
            this.f14615o = this.f14613m;
            this.f14616p = this.f14614n;
        }
    }

    /* renamed from: a */
    public void mo34636a(RelativeLayout relativeLayout) {
        C6337q qVar;
        C5785ag agVar = this.f14615o;
        if (agVar != null && (qVar = (C6337q) agVar.mo34549s()) != null) {
            C6004dw viewableAd = qVar.getViewableAd();
            if (this.f14615o.mo34535i().mo34781f()) {
                qVar.mo35497a();
            }
            ViewGroup viewGroup = (ViewGroup) qVar.getParent();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            View c = viewableAd.mo35121c();
            viewableAd.mo35119a((Map<View, FriendlyObstructionPurpose>) null);
            C5785ag agVar2 = this.f14616p;
            if (agVar2 != null) {
                agVar2.mo34608Z();
            }
            if (viewGroup == null) {
                relativeLayout.addView(c, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(c, layoutParams);
            }
            this.f14616p.mo34441D();
        }
    }

    /* renamed from: q */
    public void mo34649q() {
        C5785ag agVar = this.f14615o;
        if (agVar != null) {
            agVar.mo34611aa();
        }
    }

    /* renamed from: r */
    public void mo34650r() {
        C5785ag agVar = this.f14615o;
        if (agVar != null) {
            agVar.mo34608Z();
        }
    }

    /* renamed from: a */
    public int mo34633a(int i, int i2) {
        C5785ag agVar = this.f14616p;
        if (agVar != null) {
            return i < agVar.mo34545o().minimumRefreshInterval ? this.f14616p.mo34545o().minimumRefreshInterval : i;
        }
        return i2;
    }

    /* renamed from: s */
    public int mo34651s() {
        C5762ad m = mo34645m();
        if (m != null) {
            return m.mo34545o().defaultRefreshInterval;
        }
        return -1;
    }

    /* renamed from: a */
    public boolean mo34639a(long j) {
        C5785ag agVar = this.f14616p;
        if (agVar == null) {
            return false;
        }
        int i = agVar.mo34545o().minimumRefreshInterval;
        if (SystemClock.elapsedRealtime() - j >= ((long) (i * 1000))) {
            return true;
        }
        mo34634a((byte) Ascii.DLE);
        C5785ag agVar2 = this.f14616p;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST);
        mo34711c(agVar2, inMobiAdRequestStatus.setCustomMessage("Ad cannot be refreshed before " + i + " seconds"));
        String str = f14611k;
        C6238hu.m18605a((byte) 1, str, "Ad cannot be refreshed before " + i + " seconds (AdPlacement Id = " + this.f14616p.mo34535i().toString() + ")");
        return false;
    }

    /* renamed from: t */
    public boolean mo34652t() {
        C5785ag agVar = this.f14615o;
        return agVar != null && agVar.mo34607Y();
    }

    /* renamed from: u */
    public void mo34653u() {
        C5785ag agVar = this.f14613m;
        if (agVar != null) {
            agVar.mo34612ab();
        }
        C5785ag agVar2 = this.f14614n;
        if (agVar2 != null) {
            agVar2.mo34612ab();
        }
    }

    /* renamed from: b */
    public boolean mo34642b(RelativeLayout relativeLayout) {
        if (this.f14615o == null) {
            return true;
        }
        C5785ag agVar = this.f14616p;
        if ((agVar != null && agVar.mo34537j() == 4) || !this.f14615o.mo34459V()) {
            return true;
        }
        mo34643c(relativeLayout);
        this.f14615o.mo34460W();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo34643c(RelativeLayout relativeLayout) {
        C6337q qVar;
        C5785ag agVar = this.f14615o;
        if (agVar != null && (qVar = (C6337q) agVar.mo34549s()) != null) {
            C6004dw viewableAd = qVar.getViewableAd();
            if (this.f14615o.mo34535i().mo34781f()) {
                qVar.mo35497a();
            }
            View c = viewableAd.mo35121c();
            viewableAd.mo35119a((Map<View, FriendlyObstructionPurpose>) null);
            ViewGroup viewGroup = (ViewGroup) qVar.getParent();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (viewGroup == null) {
                relativeLayout.addView(c, layoutParams);
                return;
            }
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo34584a(C5762ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (!mo34712c(inMobiAdRequestStatus) || !mo34707a(adVar)) {
            mo34711c(adVar, inMobiAdRequestStatus);
            return;
        }
        C5785ag agVar = this.f14615o;
        if (agVar != null && agVar.equals(adVar)) {
            this.f14615o.f14551q = true;
        }
        adVar.mo34498b(inMobiAdRequestStatus);
    }

    /* renamed from: b */
    public void mo34641b(C5762ad adVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (2 == this.f14688f) {
            if (z) {
            }
        } else if (!z) {
            adVar.mo34460W();
            mo34711c(adVar, inMobiAdRequestStatus);
        }
    }

    /* renamed from: v */
    public void mo34654v() {
        C5785ag agVar = this.f14613m;
        if (agVar != null) {
            agVar.mo34613ac();
        }
        C5785ag agVar2 = this.f14614n;
        if (agVar2 != null) {
            agVar2.mo34613ac();
        }
    }

    /* renamed from: w */
    public void mo34655w() {
        mo34653u();
        C5785ag agVar = this.f14613m;
        if (agVar != null) {
            agVar.mo34441D();
            this.f14613m = null;
        }
        C5785ag agVar2 = this.f14614n;
        if (agVar2 != null) {
            agVar2.mo34441D();
            this.f14614n = null;
        }
        this.f14615o = null;
        this.f14616p = null;
        this.f14689g = null;
    }

    /* renamed from: x */
    public void mo34656x() {
        C5762ad m = mo34645m();
        if (m != null) {
            m.mo34447J();
        }
    }

    /* renamed from: a */
    public void mo34634a(byte b) {
        C5762ad m = mo34645m();
        if (m != null) {
            m.mo34497b(b);
        }
    }

    /* renamed from: b */
    public void mo34640b(byte b) {
        C5762ad m = mo34645m();
        if (m != null) {
            m.mo34465a(b);
        }
    }
}
