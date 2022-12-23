package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C5846ba;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.aq */
/* compiled from: NativeUnifiedAdManager */
public class C5817aq extends C5827at {

    /* renamed from: k */
    private static final String f14663k = C5817aq.class.getSimpleName();

    /* renamed from: l */
    private static final String f14664l = "InMobi";

    /* renamed from: m */
    private C5814ao f14665m;

    /* renamed from: a */
    public void mo34580a() {
    }

    public C5817aq(PublisherCallbacks publisherCallbacks) {
        this.f14690h = publisherCallbacks;
    }

    /* renamed from: a */
    public void mo34681a(C5894bm bmVar, Context context) {
        C5814ao aoVar = this.f14665m;
        if (aoVar == null) {
            this.f14665m = new C5814ao(context, new C5846ba.C5848a("native", f14664l).mo34797a(bmVar.f14879a).mo34805b(C5963d.m17818a(context)).mo34806c(bmVar.f14880b).mo34801a(bmVar.f14881c).mo34802a(bmVar.f14882d).mo34807d(bmVar.f14883e).mo34808e(bmVar.f14884f).mo34803a(), this);
        } else {
            aoVar.mo34469a(context);
            this.f14665m.mo34501b(C5963d.m17818a(context));
        }
        if (TextUtils.isEmpty(bmVar.f14883e)) {
            this.f14665m.mo34447J();
        }
        this.f14665m.mo34489a(bmVar.f14881c);
    }

    /* renamed from: l */
    public boolean mo34683l() {
        C5814ao aoVar = this.f14665m;
        return aoVar != null && aoVar.mo34608Z();
    }

    /* renamed from: m */
    public C5762ad mo34645m() {
        return this.f14665m;
    }

    /* renamed from: a */
    public void mo34582a(final AdMetaInfo adMetaInfo) {
        this.f14692j = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C5814ao aoVar = this.f14665m;
        if (aoVar == null) {
            mo34584a((C5762ad) null, inMobiAdRequestStatus);
        } else if (aoVar.mo34551u() == null) {
            mo34584a((C5762ad) null, inMobiAdRequestStatus);
        } else {
            super.mo34582a(adMetaInfo);
            this.f14691i.post(new Runnable() {
                public final void run() {
                    if (C5817aq.this.f14690h != null) {
                        C5817aq.this.f14690h.onAdFetchSuccessful(adMetaInfo);
                    }
                }
            });
            if (!mo34683l() && this.f14665m.mo34525e((byte) 1)) {
                this.f14665m.mo34456S();
            }
        }
    }

    /* renamed from: n */
    public void mo34684n() {
        if (this.f14689g == null || this.f14689g.booleanValue()) {
            this.f14689g = Boolean.TRUE;
            C5814ao aoVar = this.f14665m;
            if (aoVar != null && mo34709a(f14664l, aoVar.mo34535i().toString(), this.f14690h)) {
                this.f14688f = 1;
                this.f14665m.mo34555y();
                return;
            }
            return;
        }
        C6238hu.m18605a((byte) 1, f14664l, "Cannot call load() API after calling load(byte[])");
    }

    /* renamed from: b */
    public void mo34591b(final AdMetaInfo adMetaInfo) {
        super.mo34591b(adMetaInfo);
        this.f14688f = 2;
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5817aq.this.f14690h != null) {
                    C5817aq.this.f14690h.onAdLoadSucceeded(adMetaInfo);
                }
            }
        });
    }

    /* renamed from: o */
    public void mo34685o() {
        C5814ao aoVar = this.f14665m;
        if (aoVar != null) {
            aoVar.mo34607Y();
        }
        this.f14665m = null;
    }

    /* renamed from: p */
    public void mo34686p() {
        C5814ao aoVar = this.f14665m;
        if (aoVar == null) {
            C6238hu.m18605a((byte) 1, f14663k, "InMobiNative is not initialized. Ignoring takeAction");
        } else if (aoVar.f14541g != null) {
            aoVar.f14541g.mo35585r();
        }
    }

    /* renamed from: q */
    public void mo34687q() {
        C6286j s;
        C5814ao aoVar = this.f14665m;
        if (aoVar != null && aoVar.mo34537j() == 4 && !(aoVar.mo34533h() instanceof Activity) && (s = aoVar.mo34549s()) != null) {
            ((C6318n) s).mo35584q();
        }
    }

    /* renamed from: r */
    public void mo34688r() {
        C6286j s;
        C5814ao aoVar = this.f14665m;
        if (aoVar != null && aoVar.mo34537j() == 4 && !(aoVar.mo34533h() instanceof Activity) && (s = aoVar.mo34549s()) != null) {
            ((C6318n) s).mo35583p();
        }
    }

    /* renamed from: s */
    public JSONObject mo34689s() {
        C5907bx bxVar;
        C5814ao aoVar = this.f14665m;
        if (aoVar == null) {
            return new JSONObject();
        }
        C6286j s = aoVar.mo34549s();
        if (s == null || (bxVar = (C5907bx) s.getDataModel()) == null) {
            return null;
        }
        return bxVar.f14943i.f14955a;
    }

    /* renamed from: t */
    public String mo34690t() {
        C6286j s;
        C5907bx bxVar;
        C5814ao aoVar = this.f14665m;
        if (aoVar == null || (s = aoVar.mo34549s()) == null || (bxVar = (C5907bx) s.getDataModel()) == null) {
            return null;
        }
        return bxVar.f14943i.f14956b.f14959a;
    }

    /* renamed from: u */
    public String mo34691u() {
        C6286j s;
        C5907bx bxVar;
        C5814ao aoVar = this.f14665m;
        if (aoVar == null || (s = aoVar.mo34549s()) == null || (bxVar = (C5907bx) s.getDataModel()) == null) {
            return null;
        }
        return bxVar.f14943i.f14956b.f14960b;
    }

    /* renamed from: v */
    public String mo34692v() {
        C6286j s;
        C5907bx bxVar;
        C5814ao aoVar = this.f14665m;
        if (aoVar == null || (s = aoVar.mo34549s()) == null || (bxVar = (C5907bx) s.getDataModel()) == null) {
            return null;
        }
        return bxVar.f14943i.f14956b.f14961c;
    }

    /* renamed from: w */
    public String mo34693w() {
        C6286j s;
        C5907bx bxVar;
        C5814ao aoVar = this.f14665m;
        if (aoVar == null || (s = aoVar.mo34549s()) == null || (bxVar = (C5907bx) s.getDataModel()) == null) {
            return null;
        }
        return bxVar.f14943i.f14956b.f14964f;
    }

    /* renamed from: x */
    public String mo34694x() {
        C6286j s;
        C5907bx bxVar;
        C5814ao aoVar = this.f14665m;
        if (aoVar == null || (s = aoVar.mo34549s()) == null || (bxVar = (C5907bx) s.getDataModel()) == null) {
            return null;
        }
        return bxVar.f14943i.f14956b.f14962d;
    }

    /* renamed from: y */
    public float mo34695y() {
        C6286j s;
        C5907bx bxVar;
        C5814ao aoVar = this.f14665m;
        if (aoVar == null || (s = aoVar.mo34549s()) == null || (bxVar = (C5907bx) s.getDataModel()) == null) {
            return 0.0f;
        }
        return bxVar.f14943i.f14956b.f14963e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = (com.inmobi.media.C5907bx) r0.getDataModel();
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34696z() {
        /*
            r2 = this;
            com.inmobi.media.ao r0 = r2.f14665m
            r1 = 0
            if (r0 == 0) goto L_0x001f
            com.inmobi.media.j r0 = r0.mo34549s()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r0.getDataModel()
            com.inmobi.media.bx r0 = (com.inmobi.media.C5907bx) r0
            if (r0 == 0) goto L_0x001a
            com.inmobi.media.bx$a r0 = r0.f14943i
            com.inmobi.media.bx$a$a r0 = r0.f14956b
            boolean r0 = r0.f14965g
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            if (r0 == 0) goto L_0x001f
            r0 = 1
            return r0
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5817aq.mo34696z():boolean");
    }

    /* renamed from: A */
    public Boolean mo34679A() {
        C6286j s;
        C5814ao aoVar = this.f14665m;
        if (aoVar == null || (s = aoVar.mo34549s()) == null) {
            return null;
        }
        return Boolean.valueOf(s instanceof C6332o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = (com.inmobi.media.C6318n) r0;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34680B() {
        /*
            r4 = this;
            com.inmobi.media.ao r0 = r4.f14665m
            if (r0 == 0) goto L_0x0022
            com.inmobi.media.j r0 = r0.mo34549s()
            if (r0 == 0) goto L_0x0022
            com.inmobi.media.n r0 = (com.inmobi.media.C6318n) r0
            com.inmobi.media.bx r1 = r0.mo35568h()
            if (r1 == 0) goto L_0x0022
            r2 = 0
            com.inmobi.media.bx$a r3 = r1.f14943i
            com.inmobi.media.bt r3 = r3.f14957c
            r0.mo35556a((android.view.View) r2, (com.inmobi.media.C5901bt) r3)
            com.inmobi.media.bx$a r1 = r1.f14943i
            com.inmobi.media.bt r1 = r1.f14957c
            r2 = 1
            r0.mo35557a((com.inmobi.media.C5901bt) r1, (boolean) r2)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5817aq.mo34680B():void");
    }

    /* renamed from: b */
    public void mo34682b(C5894bm bmVar, Context context) {
        if (this.f14665m == null) {
            mo34681a(bmVar, context);
        }
        C5814ao aoVar = this.f14665m;
        if (aoVar != null) {
            aoVar.f14659z = true;
        }
    }

    /* renamed from: e */
    public void mo34598e() {
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5817aq.this.f14690h != null) {
                    C5817aq.this.f14690h.onAdImpressed();
                }
            }
        });
    }

    /* renamed from: h */
    public void mo34601h() {
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5817aq.this.f14690h != null) {
                    C5817aq.this.f14690h.onVideoSkipped();
                }
            }
        });
    }

    /* renamed from: f */
    public void mo34599f() {
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5817aq.this.f14690h != null) {
                    C5817aq.this.f14690h.onVideoCompleted();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo34588a(final boolean z) {
        this.f14691i.post(new Runnable() {
            public final void run() {
                if (C5817aq.this.f14690h != null) {
                    C5817aq.this.f14690h.onAudioStateChanged(z);
                }
            }
        });
    }
}
