package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5762ad;
import com.p374my.tracker.ads.AdFormat;
import java.util.Map;

/* renamed from: com.inmobi.media.ag */
/* compiled from: BannerAdUnit */
public class C5785ag extends C5762ad implements Application.ActivityLifecycleCallbacks {
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final String f14598x = C5785ag.class.getSimpleName();

    /* renamed from: y */
    private boolean f14599y = false;

    /* renamed from: z */
    private int f14600z = 0;

    /* renamed from: b */
    public void mo34614b() {
    }

    /* renamed from: k */
    public String mo34539k() {
        return AdFormat.BANNER;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final byte mo34541l() {
        return 0;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean mo34554x() {
        return false;
    }

    /* renamed from: a */
    static /* synthetic */ int m17186a(C5785ag agVar) {
        int i = agVar.f14600z;
        agVar.f14600z = i + 1;
        return i;
    }

    /* renamed from: b */
    static /* synthetic */ int m17188b(C5785ag agVar) {
        int i = agVar.f14600z - 1;
        agVar.f14600z = i;
        return i;
    }

    public C5785ag(Context context, C5846ba baVar, C5762ad.C5780a aVar) {
        super(context, baVar, aVar);
        baVar.mo34779e();
        mo34470a(context, baVar, aVar);
    }

    /* renamed from: b */
    public void mo34615b(boolean z) {
        if (z) {
            C6238hu.m18605a((byte) 2, "InMobi", "Initiating Banner refresh for placement id: " + mo34535i().toString());
        }
        this.f14599y = z;
        mo34555y();
    }

    /* renamed from: Y */
    public boolean mo34607Y() {
        return mo34537j() == 7;
    }

    /* renamed from: t */
    public C6337q mo34550t() {
        C6337q t = super.mo34550t();
        if (mo34535i().mo34781f() && t != null) {
            t.mo35497a();
        }
        return t;
    }

    /* renamed from: c */
    public void mo34617c(String str) {
        mo34535i().mo34772a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Map<String, String> mo34543m() {
        Map<String, String> m = super.mo34543m();
        m.put("u-rt", this.f14599y ? "1" : "0");
        m.put("mk-ad-slot", mo34535i().mo34789m());
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34492a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C5762ad.C5780a p;
        super.mo34492a(z, inMobiAdRequestStatus);
        C6238hu.m18605a((byte) 2, "InMobi", "Banner ad fetch successful for placement id: " + mo34535i().toString());
        if (mo34537j() == 2 && (p = mo34546p()) != null) {
            mo34499b(p);
        }
    }

    /* renamed from: S */
    public void mo34456S() {
        mo34443F();
        try {
            if (!mo34455R()) {
                mo34457T();
                this.f14543i.post(new Runnable() {
                    public final void run() {
                        if (C5785ag.this.f14556v) {
                            C5785ag.this.f14554t = System.currentTimeMillis();
                            for (int i = 0; i < C5785ag.this.f14550p.mo34812b().size(); i++) {
                                C5785ag.this.f14555u.add(Integer.valueOf(i));
                            }
                        }
                        C5785ag.this.mo34491a(true);
                    }
                });
            }
        } catch (IllegalStateException unused) {
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 48);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo34538j(C6337q qVar) {
        super.mo34538j(qVar);
        if (this.f14556v && this.f14538d.indexOf(qVar) > 0 && mo34537j() == 6) {
            mo34527f((byte) 2);
            ((C6337q) this.f14538d.get(this.f14553s)).mo35612a(true);
        } else if (mo34537j() == 2) {
            mo34527f((byte) 2);
            this.f14536b = 4;
            mo34446I();
            C6238hu.m18605a((byte) 2, "InMobi", "Successfully loaded Banner ad markup in the WebView for placement id: " + mo34535i().toString());
            C5762ad.C5780a p = mo34546p();
            if (p != null) {
                mo34511c(p);
            }
            mo34439B();
            if (!mo34458U()) {
                mo34526f();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo34540k(C6337q qVar) {
        super.mo34540k(qVar);
        if (this.f14556v) {
            int indexOf = this.f14538d.indexOf(qVar);
            mo34518d(indexOf);
            if (indexOf > 0 && mo34537j() == 6) {
                mo34527f((byte) 2);
                ((C6337q) this.f14538d.get(this.f14553s)).mo35612a(false);
            }
        }
        if (mo34537j() == 2) {
            mo34527f((byte) 2);
            this.f14536b = 3;
            C6238hu.m18605a((byte) 2, "InMobi", "Failed to load the Banner markup in the WebView for placement id: " + mo34535i().toString());
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 43);
        }
    }

    /* renamed from: f */
    public void mo34529f(C6337q qVar) {
        super.mo34529f(qVar);
        this.f14543i.post(new Runnable() {
            public final void run() {
                try {
                    if (C5785ag.this.mo34537j() == 4) {
                        C5785ag.this.f14536b = 6;
                    }
                } catch (Exception unused) {
                    C6238hu.m18605a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an internal error");
                    String unused2 = C5785ag.f14598x;
                }
            }
        });
    }

    /* renamed from: a_ */
    public synchronized void mo34610a_(C6337q qVar) {
        super.mo34610a_(qVar);
        this.f14543i.post(new Runnable() {
            public final void run() {
                try {
                    if (C5785ag.this.mo34537j() == 6) {
                        C5785ag.m17186a(C5785ag.this);
                        C5785ag.this.f14536b = 7;
                        C6238hu.m18605a((byte) 2, "InMobi", "Successfully displayed banner ad for placement Id : " + C5785ag.this.mo34535i().toString());
                        C5762ad.C5780a p = C5785ag.this.mo34546p();
                        if (p != null) {
                            C5785ag.this.mo34519d(p);
                        }
                    } else if (C5785ag.this.mo34537j() == 7) {
                        C5785ag.m17186a(C5785ag.this);
                    }
                } catch (Exception unused) {
                    C6238hu.m18605a((byte) 1, "InMobi", "Unable to display ad; SDK encountered an internal error");
                    String unused2 = C5785ag.f14598x;
                }
            }
        });
    }

    /* renamed from: b_ */
    public synchronized void mo34616b_(C6337q qVar) {
        super.mo34616b_(qVar);
        this.f14543i.post(new Runnable() {
            public final void run() {
                try {
                    if (C5785ag.this.mo34537j() == 7 && C5785ag.m17188b(C5785ag.this) == 0) {
                        C5785ag.this.f14536b = 6;
                        if (C5785ag.this.mo34546p() != null) {
                            C5785ag.this.mo34546p().mo34595c();
                        }
                    }
                } catch (Exception unused) {
                    C6238hu.m18605a((byte) 1, "InMobi", "Unable to dismiss ad; SDK encountered an internal error");
                    String unused2 = C5785ag.f14598x;
                }
            }
        });
    }

    /* renamed from: Z */
    public void mo34608Z() {
        C6286j s;
        C6004dw viewableAd;
        byte j = mo34537j();
        if ((j == 4 || j == 6 || j == 7) && (s = mo34549s()) != null && (viewableAd = s.getViewableAd()) != null) {
            viewableAd.mo35117a(mo34533h(), (byte) 1);
        }
    }

    /* renamed from: aa */
    public void mo34611aa() {
        C6286j s;
        C6004dw viewableAd;
        byte j = mo34537j();
        if ((j == 4 || j == 6 || j == 7) && (s = mo34549s()) != null && (viewableAd = s.getViewableAd()) != null) {
            viewableAd.mo35117a(mo34533h(), (byte) 0);
        }
    }

    /* renamed from: ab */
    public void mo34612ab() {
        if (mo34533h() instanceof Activity) {
            ((Activity) mo34533h()).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public void onActivityStarted(Activity activity) {
        Context h = mo34533h();
        if (h != null && h.equals(activity)) {
            mo34611aa();
        }
    }

    public void onActivityStopped(Activity activity) {
        Context h = mo34533h();
        if (h != null && h.equals(activity)) {
            mo34608Z();
        }
    }

    public void onActivityDestroyed(Activity activity) {
        Context h = mo34533h();
        if (h != null && h.equals(activity)) {
            ((Activity) h).getApplication().unregisterActivityLifecycleCallbacks(this);
            mo34441D();
        }
    }

    /* renamed from: g */
    public void mo34530g() {
        super.mo34530g();
        this.f14551q = true;
        this.f14543i.post(new Runnable() {
            public final void run() {
                C6286j s = C5785ag.this.mo34549s();
                if (s != null) {
                    s.destroy();
                }
            }
        });
    }

    /* renamed from: ac */
    public void mo34613ac() {
        Context h = mo34533h();
        if (h != null) {
            C6227ho.m18539a(h, (Application.ActivityLifecycleCallbacks) this);
        }
    }

    /* renamed from: a */
    public void mo34609a(int i, C6337q qVar) {
        if (!this.f14555u.contains(Integer.valueOf(i)) || i <= this.f14538d.indexOf(qVar)) {
            ((C6337q) this.f14538d.get(this.f14538d.indexOf(qVar))).mo35612a(false);
            return;
        }
        this.f14552r = i;
        this.f14543i.post(new Runnable() {
            public final void run() {
                C5785ag.this.mo34491a(true);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34471a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.mo34471a(inMobiAdRequestStatus);
        if (this.f14556v && this.f14552r > 0) {
            ((C6337q) this.f14538d.get(this.f14553s)).mo35612a(false);
            this.f14543i.post(new Runnable() {
                public final void run() {
                    C5785ag agVar = C5785ag.this;
                    agVar.mo34518d(agVar.f14552r);
                }
            });
        }
    }

    /* renamed from: y */
    public void mo34555y() {
        boolean z = false;
        if (mo34554x()) {
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (byte) 39);
        } else if (1 == mo34537j() || 2 == mo34537j()) {
            C6238hu.m18605a((byte) 1, f14598x, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            mo34497b((byte) 53);
        } else if (7 == mo34537j()) {
            mo34472a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (byte) Ascii.f17944SI);
            C6238hu.m18605a((byte) 1, "InMobi", C5827at.f14682a + mo34535i().mo34779e());
        } else {
            C6238hu.m18605a((byte) 2, "InMobi", "Fetching a Banner ad for placement id: " + mo34535i().toString());
            this.f14546l = false;
            z = true;
        }
        if (z) {
            super.mo34555y();
        }
    }

    /* renamed from: a */
    public void mo34467a(final int i, final C6337q qVar, Context context) {
        if (!this.f14556v) {
            ((C6337q) this.f14538d.get(this.f14538d.indexOf(qVar))).mo35621d(false);
        } else if (!this.f14555u.contains(Integer.valueOf(i)) || i <= this.f14538d.indexOf(qVar) || this.f14538d.get(i) == null || !((C6337q) this.f14538d.get(i)).f16125w) {
            ((C6337q) this.f14538d.get(this.f14538d.indexOf(qVar))).mo35621d(false);
        } else {
            super.mo34467a(i, qVar, context);
            this.f14543i.post(new Runnable() {
                public final void run() {
                    int indexOf = C5785ag.this.f14538d.indexOf(qVar);
                    try {
                        C5762ad.C5780a p = C5785ag.this.mo34546p();
                        if (p != null) {
                            p.mo34581a(i, indexOf, qVar);
                        }
                    } catch (Exception unused) {
                        C5785ag.this.mo34468a(indexOf, false);
                        C5785ag.this.mo34523e(indexOf);
                    }
                }
            });
        }
    }
}
