package com.fyber.inneractive.sdk.renderers;

import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.cache.session.enums.C4250a;
import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import com.fyber.inneractive.sdk.config.C4310h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.config.global.features.C4285c;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.flow.C4429p;
import com.fyber.inneractive.sdk.flow.C4433s;
import com.fyber.inneractive.sdk.flow.C4437u;
import com.fyber.inneractive.sdk.interfaces.C4455c;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.p192ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5311a;
import com.fyber.inneractive.sdk.util.C5318c0;
import com.fyber.inneractive.sdk.util.C5353l0;
import com.fyber.inneractive.sdk.util.C5384w0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5405c;
import com.fyber.inneractive.sdk.web.C5407d;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.renderers.k */
public class C5281k extends C4433s<C4437u, InneractiveFullscreenAdEventsListener> {

    /* renamed from: A */
    public boolean f14016A = false;

    /* renamed from: B */
    public boolean f14017B = false;

    /* renamed from: C */
    public boolean f14018C = false;

    /* renamed from: D */
    public boolean f14019D = false;

    /* renamed from: E */
    public C5384w0 f14020E;

    /* renamed from: F */
    public UnitDisplayType f14021F = UnitDisplayType.INTERSTITIAL;

    /* renamed from: G */
    public boolean f14022G = false;

    /* renamed from: H */
    public boolean f14023H = false;

    /* renamed from: I */
    public C4455c.C4457b f14024I;

    /* renamed from: J */
    public C5353l0 f14025J;

    /* renamed from: w */
    public C5407d.C5413f f14026w;

    /* renamed from: x */
    public boolean f14027x = false;

    /* renamed from: y */
    public IAmraidWebViewController f14028y;

    /* renamed from: z */
    public boolean f14029z = false;

    /* renamed from: com.fyber.inneractive.sdk.renderers.k$a */
    public class C5282a implements C5384w0.C5386b {
        public C5282a() {
        }

        /* renamed from: a */
        public void mo24274a(C5384w0 w0Var) {
            boolean unused = C5281k.this.f14022G = true;
        }
    }

    /* renamed from: E */
    public boolean mo24407E() {
        return !this.f14017B && this.f14028y.f14328I;
    }

    /* renamed from: G */
    public int mo24408G() {
        Integer b;
        AdContent adcontent = this.f10921b;
        if (adcontent == null) {
            return -1;
        }
        C4437u uVar = (C4437u) adcontent;
        if (uVar.f10915c == null || uVar.f10915c.mo24338a(C4285c.class) == null || (b = ((C4285c) ((C4437u) this.f10921b).f10915c.mo24338a(C4285c.class)).mo24314b("close_clickable_area_dp")) == null) {
            return -1;
        }
        return b.intValue();
    }

    /* renamed from: H */
    public int mo24409H() {
        Integer b;
        AdContent adcontent = this.f10921b;
        if (adcontent == null) {
            return -1;
        }
        C4437u uVar = (C4437u) adcontent;
        if (uVar.f10915c == null || uVar.f10915c.mo24338a(C4285c.class) == null || (b = ((C4285c) ((C4437u) this.f10921b).f10915c.mo24338a(C4285c.class)).mo24314b("close_visible_size_dp")) == null) {
            return -1;
        }
        return b.intValue();
    }

    /* renamed from: I */
    public long mo24410I() {
        int i = 2;
        if (this.f14021F == UnitDisplayType.REWARDED) {
            int a = IAConfigManager.f10525J.f10557v.f10660b.mo24345a("rewarded_mraid_delay", 31, 30);
            IAlog.m16699a("%sGetting rewarded total delay of %d seconds", IAlog.m16696a((Object) this), Integer.valueOf(a));
            i = a;
        } else {
            C4310h hVar = IAConfigManager.f10525J.f10557v.f10660b;
            String l = Long.toString(2);
            if (hVar.f10657a.containsKey("mraid_x_delay")) {
                l = hVar.f10657a.get("mraid_x_delay");
            }
            try {
                i = Integer.parseInt(l);
            } catch (Throwable unused) {
            }
        }
        return (long) (i * 1000);
    }

    /* renamed from: J */
    public boolean mo24411J() {
        return false;
    }

    /* renamed from: M */
    public final void mo26363M() {
        if (this.f10921b == null || this.f14028y == null) {
            IAlog.m16699a("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C5405c cVar = this.f14028y.f14280b;
        layoutParams.gravity = 17;
        cVar.setLayoutParams(layoutParams);
    }

    public void destroy() {
        EventsListener eventslistener;
        if (this.f14029z && !this.f14016A && (eventslistener = this.f10922c) != null) {
            this.f14016A = true;
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.f10920a);
        }
        this.f14026w = null;
        C5384w0 w0Var = this.f14020E;
        if (w0Var != null) {
            w0Var.f14266e = null;
            this.f14020E = null;
        }
        super.destroy();
    }

    /* renamed from: m */
    public void mo24419m() {
        C4309s sVar;
        EventsListener eventslistener;
        if (this.f14021F == UnitDisplayType.REWARDED) {
            mo26362L();
        }
        if (!this.f14016A && (eventslistener = this.f10922c) != null) {
            this.f14016A = true;
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.f10920a);
        }
        C5353l0 l0Var = this.f14025J;
        if (l0Var != null) {
            long j = l0Var.f14220b;
            if (j != 0) {
                String a = C5318c0.m16712a(j, l0Var.f14222d);
                l0Var.f14220b = 0;
                l0Var.f14221c = 0;
                l0Var.f14222d = 0;
                InneractiveAdSpot inneractiveAdSpot = l0Var.f14219a;
                C4419j adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
                C4567p pVar = C4567p.INTERSTITIAL_VIEW_TIME;
                InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f10913a : null;
                C5291e c = adContent != null ? adContent.mo24367c() : null;
                JSONArray c2 = (adContent == null || (sVar = adContent.f10915c) == null) ? null : sVar.mo24342c();
                C4569q.C4570a aVar = new C4569q.C4570a(c);
                aVar.f11365c = pVar;
                aVar.f11363a = inneractiveAdRequest;
                aVar.f11366d = c2;
                aVar.mo24767a("time", a);
                aVar.mo24768a((String) null);
            }
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f10920a;
        if (inneractiveAdSpot2 != null && (inneractiveAdSpot2 instanceof C4429p)) {
            ((C4429p) inneractiveAdSpot2).mo24610a();
        }
    }

    /* renamed from: o */
    public void mo24629o() {
        C5384w0 w0Var;
        super.mo24629o();
        if (this.f14021F == UnitDisplayType.REWARDED && (w0Var = this.f14020E) != null) {
            w0Var.mo26485b();
        }
        C5353l0 l0Var = this.f14025J;
        if (l0Var != null) {
            if (l0Var.f14220b == 0) {
                l0Var.f14220b = System.currentTimeMillis();
            }
            if (l0Var.f14221c > 0) {
                l0Var.f14222d += System.currentTimeMillis() - l0Var.f14221c;
                l0Var.f14221c = 0;
            }
        }
        this.f10966u.mo26438b();
    }

    /* renamed from: s */
    public void mo24630s() {
        C5384w0 w0Var;
        super.mo24630s();
        if (this.f14021F == UnitDisplayType.REWARDED && (w0Var = this.f14020E) != null) {
            w0Var.mo26483a();
        }
        C5353l0 l0Var = this.f14025J;
        if (l0Var != null) {
            l0Var.f14221c = System.currentTimeMillis();
        }
        C5311a aVar = this.f10966u;
        if (aVar.f14141b) {
            aVar.f14144e = System.currentTimeMillis();
        }
    }

    /* renamed from: u */
    public boolean mo24421u() {
        boolean z;
        if (this.f10956k == null) {
            z = true;
        } else if (this.f14021F == UnitDisplayType.REWARDED) {
            if (this.f14022G) {
                mo26362L();
            }
            z = this.f14022G;
        } else {
            z = this.f10961p;
        }
        if (!z) {
            return true;
        }
        C4455c.C4456a aVar = this.f10956k;
        if (aVar == null) {
            return false;
        }
        aVar.dismissAd(true);
        return true;
    }

    /* renamed from: L */
    public final void mo26362L() {
        IAlog.m16699a("%sprovide reward called", IAlog.m16696a((Object) this));
        if (this.f14023H) {
            IAlog.m16699a("%sreward was already provided", IAlog.m16696a((Object) this));
            return;
        }
        IAlog.m16699a("%sreward sent", IAlog.m16696a((Object) this));
        if (this.f14024I != null) {
            mo24600a(C4250a.COMPLETION, C4251b.REWARDED_DISPLAY);
            ((InneractiveFullscreenUnitController.C4391a) this.f14024I).mo24529a();
        }
        mo24598D();
        this.f14023H = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = ((com.fyber.inneractive.sdk.flow.C4437u) r7).f10916d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24413a(com.fyber.inneractive.sdk.interfaces.C4455c.C4456a r6, android.app.Activity r7) throws com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError, android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            super.mo24413a((com.fyber.inneractive.sdk.interfaces.C4455c.C4456a) r6, (android.app.Activity) r7)
            AdContent r7 = r5.f10921b
            r0 = 0
            if (r7 == 0) goto L_0x0014
            r1 = r7
            com.fyber.inneractive.sdk.flow.u r1 = (com.fyber.inneractive.sdk.flow.C4437u) r1
            com.fyber.inneractive.sdk.config.z r1 = r1.f10916d
            if (r1 == 0) goto L_0x0014
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C4345y) r1
            com.fyber.inneractive.sdk.config.r r1 = r1.f10747c
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00f3
            if (r7 == 0) goto L_0x0020
            com.fyber.inneractive.sdk.flow.u r7 = (com.fyber.inneractive.sdk.flow.C4437u) r7
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r7 = r7.f10971g
            goto L_0x0021
        L_0x0020:
            r7 = r0
        L_0x0021:
            r5.f14028y = r7
            if (r7 == 0) goto L_0x00de
            com.fyber.inneractive.sdk.web.c r4 = r7.f14280b
            if (r4 == 0) goto L_0x002b
            r4 = r2
            goto L_0x002c
        L_0x002b:
            r4 = r3
        L_0x002c:
            if (r4 == 0) goto L_0x00de
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f10691b
            r5.f14021F = r1
            r5.f14029z = r3
            r5.f14016A = r3
            com.fyber.inneractive.sdk.util.l0 r1 = new com.fyber.inneractive.sdk.util.l0
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r4 = r5.f10920a
            r1.<init>(r4)
            r5.f14025J = r1
            r5.f10956k = r6
            android.view.View r6 = r6.getCloseButton()
            if (r6 == 0) goto L_0x005b
            com.fyber.inneractive.sdk.measurement.a$a r7 = r7.f14344x
            if (r7 == 0) goto L_0x005b
            com.fyber.inneractive.sdk.measurement.f r7 = (com.fyber.inneractive.sdk.measurement.C4465f) r7
            com.iab.omid.library.fyber.adsession.AdSession r1 = r7.f11008b     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x005b
            com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose r4 = com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose.CLOSE_AD     // Catch:{ all -> 0x0057 }
            r1.addFriendlyObstruction(r6, r4, r0)     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r6 = move-exception
            r7.mo24661a(r6)
        L_0x005b:
            AdContent r6 = r5.f10921b
            com.fyber.inneractive.sdk.flow.u r6 = (com.fyber.inneractive.sdk.flow.C4437u) r6
            T r6 = r6.f10914b
            com.fyber.inneractive.sdk.response.f r6 = (com.fyber.inneractive.sdk.response.C5292f) r6
            int r7 = r6.f14070e
            int r6 = r6.f14071f
            r1 = 300(0x12c, float:4.2E-43)
            if (r7 != r1) goto L_0x006f
            r1 = 250(0xfa, float:3.5E-43)
            if (r6 == r1) goto L_0x0077
        L_0x006f:
            r1 = 600(0x258, float:8.41E-43)
            if (r7 != r1) goto L_0x0078
            r1 = 500(0x1f4, float:7.0E-43)
            if (r6 != r1) goto L_0x0078
        L_0x0077:
            r3 = r2
        L_0x0078:
            r5.f14017B = r3
            if (r3 == 0) goto L_0x008b
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r1 = r5.f14028y
            float r7 = (float) r7
            int r7 = com.fyber.inneractive.sdk.util.C5350l.m16752a((float) r7)
            float r6 = (float) r6
            int r6 = com.fyber.inneractive.sdk.util.C5350l.m16752a((float) r6)
            r1.setAdDefaultSize(r7, r6)
        L_0x008b:
            com.fyber.inneractive.sdk.web.d$f r6 = r5.f14026w
            if (r6 != 0) goto L_0x0096
            com.fyber.inneractive.sdk.renderers.l r6 = new com.fyber.inneractive.sdk.renderers.l
            r6.<init>(r5)
            r5.f14026w = r6
        L_0x0096:
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r6 = r5.f14028y
            com.fyber.inneractive.sdk.web.d$f r7 = r5.f14026w
            r6.setListener(r7)
            r5.mo26363M()
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r6 = r5.f14028y
            com.fyber.inneractive.sdk.interfaces.c$a r7 = r5.f10956k
            android.view.ViewGroup r7 = r7.getLayout()
            AdContent r1 = r5.f10921b
            com.fyber.inneractive.sdk.flow.u r1 = (com.fyber.inneractive.sdk.flow.C4437u) r1
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r1.f10913a
            r6.mo26501a(r7, r0)
            r5.f14029z = r2
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = r5.f14021F
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r7 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r6 != r7) goto L_0x00dd
            com.fyber.inneractive.sdk.util.w0 r6 = new com.fyber.inneractive.sdk.util.w0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f10525J
            com.fyber.inneractive.sdk.config.i r0 = r0.f10557v
            com.fyber.inneractive.sdk.config.h r0 = r0.f10660b
            r1 = 31
            r2 = 30
            java.lang.String r3 = "rewarded_mraid_delay"
            int r0 = r0.mo24345a(r3, r1, r2)
            long r0 = (long) r0
            r6.<init>(r7, r0)
            r5.f14020E = r6
            com.fyber.inneractive.sdk.renderers.k$a r7 = new com.fyber.inneractive.sdk.renderers.k$a
            r7.<init>()
            r6.f14266e = r7
            r6.mo26486c()
        L_0x00dd:
            return
        L_0x00de:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r7 = com.fyber.inneractive.sdk.util.IAlog.m16696a((java.lang.Object) r5)
            r6[r3] = r7
            java.lang.String r7 = "%sWeb view controller content is not valid. Web view might have crashed"
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r7, r6)
            com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError r6 = new com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError
            java.lang.String r7 = "Web view could not be loaded"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x00f3:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r7 = com.fyber.inneractive.sdk.util.IAlog.m16696a((java.lang.Object) r5)
            r6[r3] = r7
            java.lang.String r7 = "%sNo display config for full screen mraid ad renderer! Cannot render"
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r7, r6)
            com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError r6 = new com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError
            java.lang.String r7 = "No display config for full screen mraid"
            r6.<init>((java.lang.String) r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5281k.mo24413a(com.fyber.inneractive.sdk.interfaces.c$a, android.app.Activity):void");
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo24416b(C4419j jVar) {
        C4437u uVar = (C4437u) jVar;
        return false;
    }

    /* renamed from: c */
    public void mo24626c(boolean z) {
        if (mo24407E()) {
            return;
        }
        if (z) {
            this.f10966u.mo26439c();
        } else {
            this.f10966u.mo26436a();
        }
    }

    /* renamed from: b */
    public void mo24415b() {
        mo26363M();
    }

    /* renamed from: a */
    public long mo24412a(long j) {
        if (this.f14021F == UnitDisplayType.REWARDED) {
            return 0;
        }
        C4310h hVar = IAConfigManager.f10525J.f10557v.f10660b;
        long j2 = 13;
        String l = Long.toString(13);
        if (hVar.f10657a.containsKey("mraid_x_fallback_delay")) {
            l = hVar.f10657a.get("mraid_x_fallback_delay");
        }
        try {
            j2 = Long.parseLong(l);
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    /* renamed from: a */
    public void mo24414a(C4455c.C4457b bVar) {
        this.f14024I = bVar;
    }
}
