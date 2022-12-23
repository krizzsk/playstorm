package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.enums.C4250a;
import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import com.fyber.inneractive.sdk.config.C4271d0;
import com.fyber.inneractive.sdk.config.C4276g;
import com.fyber.inneractive.sdk.config.C4310h;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.C4291i;
import com.fyber.inneractive.sdk.config.global.features.C4292j;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C4429p;
import com.fyber.inneractive.sdk.flow.C4433s;
import com.fyber.inneractive.sdk.flow.C4450y;
import com.fyber.inneractive.sdk.interfaces.C4455c;
import com.fyber.inneractive.sdk.model.vast.C4478b;
import com.fyber.inneractive.sdk.model.vast.C4479c;
import com.fyber.inneractive.sdk.model.vast.C4483g;
import com.fyber.inneractive.sdk.model.vast.C4484h;
import com.fyber.inneractive.sdk.model.vast.C4493q;
import com.fyber.inneractive.sdk.network.C4575s;
import com.fyber.inneractive.sdk.player.C4591c;
import com.fyber.inneractive.sdk.player.C5066f;
import com.fyber.inneractive.sdk.player.C5073i;
import com.fyber.inneractive.sdk.player.controller.C4632b;
import com.fyber.inneractive.sdk.player.p191ui.C5098g;
import com.fyber.inneractive.sdk.player.p191ui.C5100i;
import com.fyber.inneractive.sdk.response.C5293g;
import com.fyber.inneractive.sdk.util.C5311a;
import com.fyber.inneractive.sdk.util.C5320d0;
import com.fyber.inneractive.sdk.util.C5325e;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.renderers.m */
public class C5284m extends C4433s<C4450y, InneractiveFullscreenAdEventsListener> implements C4455c {

    /* renamed from: A */
    public boolean f14032A = false;

    /* renamed from: B */
    public boolean f14033B = false;

    /* renamed from: C */
    public boolean f14034C = false;

    /* renamed from: D */
    public C4455c.C4457b f14035D;

    /* renamed from: E */
    public UnitDisplayType f14036E = UnitDisplayType.INTERSTITIAL;

    /* renamed from: F */
    public C5286n f14037F;

    /* renamed from: G */
    public final C4591c.C4594c f14038G = new C5285a();

    /* renamed from: H */
    public final RelativeLayout.LayoutParams f14039H = new RelativeLayout.LayoutParams(-1, -1);

    /* renamed from: I */
    public boolean f14040I = false;

    /* renamed from: J */
    public boolean f14041J = false;

    /* renamed from: w */
    public C4455c.C4456a f14042w;

    /* renamed from: x */
    public C5098g f14043x;

    /* renamed from: y */
    public C4632b f14044y;

    /* renamed from: z */
    public WeakReference<InneractiveFullscreenVideoContentController> f14045z;

    /* renamed from: com.fyber.inneractive.sdk.renderers.m$a */
    public class C5285a implements C4591c.C4594c {
        public C5285a() {
        }

        /* renamed from: a */
        public void mo24802a(C4591c cVar) {
            C5284m.this.f14044y.mo24880d(false);
            C5284m.this.f14044y.mo24882f();
        }
    }

    /* renamed from: E */
    public boolean mo24407E() {
        return this.f14040I;
    }

    /* renamed from: G */
    public int mo24408G() {
        Integer b;
        AdContent adcontent = this.f10921b;
        if (adcontent == null) {
            return -1;
        }
        C4450y yVar = (C4450y) adcontent;
        if (yVar.f10915c == null || yVar.f10915c.mo24338a(C4291i.class) == null || (b = ((C4291i) ((C4450y) this.f10921b).f10915c.mo24338a(C4291i.class)).mo24314b("close_clickable_area_dp")) == null) {
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
        C4450y yVar = (C4450y) adcontent;
        if (yVar.f10915c == null || yVar.f10915c.mo24338a(C4291i.class) == null || (b = ((C4291i) ((C4450y) this.f10921b).f10915c.mo24338a(C4291i.class)).mo24314b("close_visible_size_dp")) == null) {
            return -1;
        }
        return b.intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008e  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo24410I() {
        /*
            r8 = this;
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f10525J
            com.fyber.inneractive.sdk.config.i r1 = r0.f10557v
            com.fyber.inneractive.sdk.config.h r1 = r1.f10660b
            java.lang.String r2 = "endcard"
            com.fyber.inneractive.sdk.config.f r1 = r1.mo24346a((java.lang.String) r2)
            r1.getClass()
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f10609a
            java.lang.String r3 = "endcard_cr"
            boolean r2 = r2.containsKey(r3)
            r4 = 1
            java.lang.String r5 = "endcard_ci"
            r6 = 3
            if (r2 != 0) goto L_0x0094
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f10609a
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x0028
            goto L_0x0094
        L_0x0028:
            com.fyber.inneractive.sdk.config.i r0 = r0.f10557v
            com.fyber.inneractive.sdk.config.h r0 = r0.f10660b
            java.lang.String r1 = "vast_endcard_x_delay"
            java.lang.String r2 = java.lang.Long.toString(r6)
            java.util.Map<java.lang.String, java.lang.String> r3 = r0.f10657a
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L_0x0043
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f10657a
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0043:
            long r6 = java.lang.Long.parseLong(r2)     // Catch:{ all -> 0x0047 }
        L_0x0047:
            AdContent r0 = r8.f10921b
            if (r0 == 0) goto L_0x00c1
            com.fyber.inneractive.sdk.flow.y r0 = (com.fyber.inneractive.sdk.flow.C4450y) r0
            T r1 = r0.f10914b
            if (r1 == 0) goto L_0x00c1
            com.fyber.inneractive.sdk.response.g r1 = (com.fyber.inneractive.sdk.response.C5293g) r1
            com.fyber.inneractive.sdk.model.vast.b r1 = r1.f14094C
            if (r1 == 0) goto L_0x00c1
            com.fyber.inneractive.sdk.model.vast.c r1 = r1.f11066g
            if (r1 == 0) goto L_0x00c1
            com.fyber.inneractive.sdk.model.vast.g r1 = r1.f11069a
            com.fyber.inneractive.sdk.model.vast.g r2 = com.fyber.inneractive.sdk.model.vast.C4483g.Static
            if (r1 != r2) goto L_0x00c1
            com.fyber.inneractive.sdk.config.global.s r0 = r0.f10915c
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r1 = com.fyber.inneractive.sdk.config.global.features.C4292j.class
            com.fyber.inneractive.sdk.config.global.features.e r0 = r0.mo24338a(r1)
            com.fyber.inneractive.sdk.config.global.features.j r0 = (com.fyber.inneractive.sdk.config.global.features.C4292j) r0
            if (r0 == 0) goto L_0x008b
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r8.f14036E
            int[] r2 = com.fyber.inneractive.sdk.config.global.features.C4292j.C4293a.f10628a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == r4) goto L_0x0084
            r2 = 2
            if (r1 == r2) goto L_0x007d
            goto L_0x008b
        L_0x007d:
            java.lang.String r1 = "endcard_x_btn_delay_iv"
            java.lang.Integer r0 = r0.mo24314b(r1)
            goto L_0x008c
        L_0x0084:
            java.lang.String r1 = "endcard_x_btn_delay_rv"
            java.lang.Integer r0 = r0.mo24314b(r1)
            goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.intValue()
            long r6 = (long) r0
            goto L_0x00c1
        L_0x0094:
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r8.f14036E
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r0 != r2) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r3 = r5
        L_0x009c:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f10609a     // Catch:{ Exception -> 0x00b1 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ Exception -> 0x00b1 }
            if (r0 == 0) goto L_0x00b1
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f10609a     // Catch:{ Exception -> 0x00b1 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00b1 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b2
        L_0x00b1:
            r0 = r6
        L_0x00b2:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x00c1
            r2 = 5
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x00c1
            r8.f10965t = r4
            r6 = r0
        L_0x00c1:
            com.fyber.inneractive.sdk.player.controller.b r0 = r8.f14044y
            r1 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x00cc
            long r3 = r6 * r1
            r0.mo24874a((long) r3)
        L_0x00cc:
            long r6 = r6 * r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5284m.mo24410I():long");
    }

    /* renamed from: J */
    public boolean mo24411J() {
        C5098g gVar = this.f14043x;
        return gVar != null && ((C5100i) gVar).mo25750d();
    }

    /* renamed from: L */
    public void mo26364L() {
        if (!this.f14033B && this.f10922c != null) {
            this.f14033B = true;
            C4455c.C4456a aVar = this.f14042w;
            if (aVar != null && aVar.wasDismissedByUser()) {
                mo26369a(C4493q.EVENT_CLOSE);
                mo26369a(C4493q.EVENT_CLOSE_LINEAR);
            }
            ((InneractiveFullscreenAdEventsListener) this.f10922c).onAdDismissed(this.f10920a);
        }
    }

    /* renamed from: M */
    public final void mo26365M() {
        C4251b bVar;
        AdContent adcontent = this.f10921b;
        if (adcontent != null) {
            C4450y yVar = (C4450y) adcontent;
            if (yVar.f10916d != null && ((C4345y) yVar.f10916d).f10747c != null) {
                UnitDisplayType unitDisplayType = ((C4345y) yVar.f10916d).f10747c.f10691b;
                C4271d0 d0Var = IAConfigManager.f10525J.f10559x;
                if (unitDisplayType == UnitDisplayType.REWARDED) {
                    bVar = C4251b.REWARDED_VIDEO;
                } else {
                    bVar = C4251b.INTERSTITIAL_VIDEO;
                }
                d0Var.mo24285a(bVar, C4250a.CLICK);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.fyber.inneractive.sdk.flow.l, com.fyber.inneractive.sdk.renderers.m, com.fyber.inneractive.sdk.player.controller.s, com.fyber.inneractive.sdk.flow.s, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24413a(com.fyber.inneractive.sdk.interfaces.C4455c.C4456a r5, android.app.Activity r6) throws com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError {
        /*
            r4 = this;
            super.mo24413a((com.fyber.inneractive.sdk.interfaces.C4455c.C4456a) r5, (android.app.Activity) r6)
            r4.f14042w = r5
            r5 = 0
            r4.f14032A = r5
            r4.f14033B = r5
            r4.f14041J = r5
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r6 = r4.f10920a
            com.fyber.inneractive.sdk.external.InneractiveUnitController r6 = r6.getSelectedUnitController()
            r0 = 1
            if (r6 == 0) goto L_0x0053
            boolean r1 = r6 instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController
            if (r1 != 0) goto L_0x0027
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r1 = com.fyber.inneractive.sdk.util.IAlog.m16696a((java.lang.Object) r4)
            r6[r5] = r1
            java.lang.String r1 = "%sWrong type of unit controller found. Expecting InneractiveFullscreenUnitController"
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r1, r6)
            goto L_0x0053
        L_0x0027:
            com.fyber.inneractive.sdk.external.InneractiveContentController r6 = r6.getSelectedContentController()
            if (r6 == 0) goto L_0x0053
            boolean r1 = r6 instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController
            if (r1 == 0) goto L_0x003b
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController r6 = (com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController) r6
            r1.<init>(r6)
            r4.f14045z = r1
            goto L_0x0053
        L_0x003b:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = com.fyber.inneractive.sdk.util.IAlog.m16696a((java.lang.Object) r4)
            r1[r5] = r2
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r1[r0] = r6
            java.lang.String r6 = "%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s"
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r6, r1)
        L_0x0053:
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r6 = r4.f10920a
            com.fyber.inneractive.sdk.flow.j r6 = r6.getAdContent()
            com.fyber.inneractive.sdk.config.z r6 = r6.f10916d
            if (r6 == 0) goto L_0x0067
            com.fyber.inneractive.sdk.config.y r6 = (com.fyber.inneractive.sdk.config.C4345y) r6
            com.fyber.inneractive.sdk.config.a0 r6 = r6.f10750f
            if (r6 == 0) goto L_0x0067
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = r6.f10579j
            r4.f14036E = r6
        L_0x0067:
            AdContent r6 = r4.f10921b
            com.fyber.inneractive.sdk.flow.y r6 = (com.fyber.inneractive.sdk.flow.C4450y) r6
            com.fyber.inneractive.sdk.player.i r6 = r6.f10998g
            com.fyber.inneractive.sdk.interfaces.c$a r1 = r4.f14042w
            android.view.ViewGroup r1 = r1.getLayout()
            android.content.Context r1 = r1.getContext()
            if (r6 == 0) goto L_0x00f8
            com.fyber.inneractive.sdk.player.a$a r2 = r6.f13575f
            if (r2 == 0) goto L_0x008b
            r3 = r2
            com.fyber.inneractive.sdk.player.f r3 = (com.fyber.inneractive.sdk.player.C5066f) r3
            com.fyber.inneractive.sdk.player.controller.g r3 = r3.f11406b
            if (r3 == 0) goto L_0x0086
            r3 = r0
            goto L_0x0087
        L_0x0086:
            r3 = r5
        L_0x0087:
            if (r3 == 0) goto L_0x008b
            r3 = r0
            goto L_0x008c
        L_0x008b:
            r3 = r5
        L_0x008c:
            if (r3 == 0) goto L_0x00e3
            com.fyber.inneractive.sdk.player.f r2 = (com.fyber.inneractive.sdk.player.C5066f) r2
            r2.getClass()
            com.fyber.inneractive.sdk.renderers.c r5 = new com.fyber.inneractive.sdk.renderers.c
            r5.<init>(r6)
            r4.f14037F = r5
            com.fyber.inneractive.sdk.player.ui.g r5 = r5.mo26329a((android.content.Context) r1)
            r4.f14043x = r5
            com.fyber.inneractive.sdk.renderers.n r5 = r4.f14037F
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r6 = r4.f10920a
            AdContent r1 = r4.f10921b
            com.fyber.inneractive.sdk.flow.y r1 = (com.fyber.inneractive.sdk.flow.C4450y) r1
            com.fyber.inneractive.sdk.player.controller.b r5 = r5.mo26320a(r6, r1)
            r4.f14044y = r5
            com.fyber.inneractive.sdk.renderers.n r6 = r4.f14037F
            boolean r6 = r6.mo26323a()
            r5.mo24880d(r6)
            com.fyber.inneractive.sdk.player.controller.b r5 = r4.f14044y
            r5.mo24876a(r4)
            com.fyber.inneractive.sdk.player.ui.g r5 = r4.f14043x
            com.fyber.inneractive.sdk.player.ui.c r5 = (com.fyber.inneractive.sdk.player.p191ui.C5094c) r5
            r5.mo25727b()
            android.widget.RelativeLayout$LayoutParams r5 = r4.f14039H
            r6 = 13
            r5.addRule(r6)
            com.fyber.inneractive.sdk.interfaces.c$a r5 = r4.f14042w
            android.view.ViewGroup r5 = r5.getLayout()
            com.fyber.inneractive.sdk.player.ui.g r6 = r4.f14043x
            android.view.View r6 = (android.view.View) r6
            android.widget.RelativeLayout$LayoutParams r1 = r4.f14039H
            r5.addView(r6, r1)
            com.fyber.inneractive.sdk.renderers.n r5 = r4.f14037F
            com.fyber.inneractive.sdk.player.c$c r6 = r4.f14038G
            r5.mo26322a(r6)
            r4.f14032A = r0
            goto L_0x00f8
        L_0x00e3:
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.m16696a((java.lang.Object) r4)
            r6[r5] = r0
            java.lang.String r5 = "%sFull screen video ad renderer is not valid."
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r5, r6)
            com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError r5 = new com.fyber.inneractive.sdk.external.InneractiveUnitController$AdDisplayError
            java.lang.String r6 = "Full screen video could not be loaded"
            r5.<init>((java.lang.String) r6)
            throw r5
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5284m.mo24413a(com.fyber.inneractive.sdk.interfaces.c$a, android.app.Activity):void");
    }

    /* renamed from: b */
    public void mo24415b() {
    }

    /* renamed from: c */
    public void mo24626c(boolean z) {
        C5098g gVar = this.f14043x;
        if ((gVar != null && ((C5100i) gVar).mo25750d()) && this.f14040I) {
            return;
        }
        if (z) {
            this.f10966u.mo26439c();
        } else {
            this.f10966u.mo26436a();
        }
    }

    public void destroy() {
        C4455c.C4456a aVar = this.f14042w;
        if (aVar != null) {
            aVar.destroy();
        }
        if (this.f14032A) {
            mo26364L();
        }
        C4632b bVar = this.f14044y;
        if (bVar != null) {
            bVar.destroy();
            this.f14044y = null;
        }
        C5098g gVar = this.f14043x;
        if (gVar != null) {
            gVar.destroy();
            this.f14043x = null;
        }
        this.f14042w = null;
        this.f14045z = null;
        super.destroy();
    }

    /* renamed from: e */
    public void mo26374e() {
        if (!this.f14034C) {
            this.f10966u.mo26437a(true);
        }
        this.f14034C = true;
    }

    /* renamed from: g */
    public void mo26375g() {
        C4479c cVar;
        C4484h hVar;
        AdContent adcontent = this.f10921b;
        if (adcontent != null) {
            C4450y yVar = (C4450y) adcontent;
            if (yVar.f10913a != null && yVar.f10914b != null) {
                String str = null;
                mo26365M();
                C4478b bVar = ((C5293g) ((C4450y) this.f10921b).f10914b).f14094C;
                if (!(bVar == null || (cVar = bVar.f11066g) == null || (hVar = cVar.f11070b) == null)) {
                    str = hVar.toString();
                }
                mo24603a(str);
            }
        }
    }

    /* renamed from: h */
    public void mo26376h() {
        this.f14040I = true;
        CountDownTimer countDownTimer = this.f10967v;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f10967v = null;
        }
        if (!this.f10964s) {
            this.f10964s = true;
            C4455c.C4456a aVar = this.f14042w;
            if (aVar != null) {
                mo24627d(aVar.isCloseButtonDisplay());
            }
        }
        C4455c.C4456a aVar2 = this.f14042w;
        if (aVar2 != null && aVar2.isCloseButtonDisplay()) {
            mo24628e(true);
        }
    }

    /* renamed from: j */
    public void mo26377j() {
        C4455c.C4456a aVar = this.f14042w;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        mo24601a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
    }

    /* renamed from: k */
    public void mo26378k() {
        C4455c.C4456a aVar = this.f14042w;
        if (aVar != null) {
            aVar.dismissAd(true);
        }
    }

    /* renamed from: l */
    public void mo26379l() {
        C4251b bVar;
        C4271d0 d0Var = IAConfigManager.f10525J.f10559x;
        if (this.f14036E == UnitDisplayType.INTERSTITIAL) {
            bVar = C4251b.INTERSTITIAL_VIDEO;
        } else {
            bVar = C4251b.REWARDED_VIDEO;
        }
        d0Var.mo24285a(bVar, C4250a.IMPRESSION);
        mo24595A();
    }

    /* renamed from: m */
    public void mo24419m() {
        mo26364L();
        InneractiveAdSpot inneractiveAdSpot = this.f10920a;
        if (inneractiveAdSpot != null && (inneractiveAdSpot instanceof C4429p)) {
            ((C4429p) inneractiveAdSpot).mo24610a();
        }
    }

    /* renamed from: o */
    public void mo24629o() {
        super.mo24629o();
        this.f10966u.mo26438b();
    }

    public void onCompleted() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) C5370s.m16784a(this.f14045z);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onCompleted();
        }
        C4271d0 d0Var = IAConfigManager.f10525J.f10559x;
        UnitDisplayType unitDisplayType = this.f14036E;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.REWARDED;
        d0Var.mo24285a(unitDisplayType == unitDisplayType2 ? C4251b.REWARDED_VIDEO : C4251b.INTERSTITIAL_VIDEO, C4250a.COMPLETION);
        if (this.f14036E == unitDisplayType2) {
            C4455c.C4457b bVar = this.f14035D;
            if (bVar != null) {
                ((InneractiveFullscreenUnitController.C4391a) bVar).mo24529a();
            }
            mo24598D();
        }
        AdContent adcontent = this.f10921b;
        if (adcontent != null && ((C4450y) adcontent).f10998g != null) {
            mo24624F();
        }
    }

    public void onPlayerError() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) C5370s.m16784a(this.f14045z);
        C4455c.C4456a aVar = this.f14042w;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onPlayerError();
        }
    }

    public void onProgress(int i, int i2) {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) C5370s.m16784a(this.f14045z);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onProgress(i, i2);
        }
    }

    /* renamed from: r */
    public void mo26383r() {
        mo24609z();
    }

    /* renamed from: s */
    public void mo24630s() {
        super.mo24630s();
        C5311a aVar = this.f10966u;
        if (aVar.f14141b) {
            aVar.f14144e = System.currentTimeMillis();
        }
    }

    /* renamed from: u */
    public boolean mo24421u() {
        C4632b bVar;
        C4455c.C4456a aVar;
        C5098g gVar;
        AdContent adcontent = this.f10921b;
        if (adcontent != null) {
            C4450y yVar = (C4450y) adcontent;
            if (!(yVar.f10998g == null || (bVar = this.f14044y) == null || (aVar = this.f14042w) == null || (gVar = this.f14043x) == null)) {
                ((C5066f) yVar.f10998g.f13575f).getClass();
                if (bVar == null) {
                    aVar.dismissAd(true);
                    return true;
                } else if (((C5100i) gVar).mo25750d()) {
                    if (!this.f10961p) {
                        return true;
                    }
                    aVar.dismissAd(true);
                    return true;
                } else if (!bVar.mo24879c()) {
                    return true;
                } else {
                    bVar.mo24878c(true);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo24414a(C4455c.C4457b bVar) {
        this.f14035D = bVar;
    }

    /* renamed from: a */
    public C5320d0.C5321a mo26366a(C5364p0 p0Var, C5325e eVar) {
        Context context;
        mo26365M();
        if (this.f14043x.getContext() == null) {
            context = C5350l.f14216a;
        } else {
            context = this.f14043x.getContext();
        }
        AdContent adcontent = this.f10921b;
        return mo24599a(context, adcontent != null ? ((C4450y) adcontent).mo24648f() : null, p0Var, eVar);
    }

    /* renamed from: a */
    public void mo26372a(boolean z, Orientation orientation) {
        C4455c.C4456a aVar = this.f14042w;
        if (aVar != null) {
            aVar.setActivityOrientation(z, orientation);
        }
    }

    /* renamed from: a */
    public void mo26370a(String str, String str2) {
        IAlog.m16699a(IAlog.m16696a((Object) this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
        C4455c.C4456a aVar = this.f14042w;
        if (aVar != null && aVar.getLayout() != null && this.f14042w.getLayout().getContext() != null) {
            if (!this.f14041J) {
                C4575s.m14052a(this.f14042w.getLayout().getContext(), str, str2, this.f10921b);
                this.f14041J = true;
                IAlog.m16699a(IAlog.m16696a((Object) this) + "reporting auto redirect", new Object[0]);
                return;
            }
            IAlog.m16699a(IAlog.m16696a((Object) this) + "redirect already reported for this ad", new Object[0]);
        }
    }

    /* renamed from: a */
    public C5320d0.C5321a mo26367a(String str, C5364p0 p0Var) {
        Context context;
        C4484h hVar;
        AdContent adcontent = this.f10921b;
        if (adcontent != null) {
            C4450y yVar = (C4450y) adcontent;
            if (!(yVar.f10914b == null || yVar.f10914b == null)) {
                C4478b bVar = ((C5293g) yVar.f10914b).f14094C;
                mo26365M();
                if (bVar != null) {
                    C4479c cVar = bVar.f11066g;
                    String str2 = null;
                    if (!(cVar == null || (hVar = cVar.f11070b) == null)) {
                        str2 = hVar.toString();
                    }
                    mo24603a(str2);
                    C5325e eVar = cVar == null ? C5325e.DEFAULT_ENDCARD : C5325e.VAST_ENDCARD;
                    if (this.f14043x.getContext() == null) {
                        context = C5350l.f14216a;
                    } else {
                        context = this.f14043x.getContext();
                    }
                    C5320d0.C5321a a = mo24599a(context, str, p0Var, eVar);
                    if (!(cVar == null || a.f14158a == C5320d0.C5323c.FAILED)) {
                        C4493q qVar = C4493q.EVENT_CLICK;
                        String[] strArr = {"EVENT_CLICK"};
                        C5073i iVar = ((C4450y) this.f10921b).f10998g;
                        if (iVar != null) {
                            iVar.mo25679a("EVENT_TRACKING", strArr);
                        }
                    }
                    return a;
                }
            }
        }
        return new C5320d0.C5321a(C5320d0.C5323c.FAILED, new Exception("Internal SDK Error"), "null");
    }

    /* renamed from: a */
    public void mo26371a(boolean z) {
        C4455c.C4456a aVar;
        AdContent adcontent = this.f10921b;
        if (adcontent != null) {
            C4450y yVar = (C4450y) adcontent;
            if (yVar.f10998g != null) {
                yVar.f10998g.mo25679a("TRACKING_COMPLETED", new String[0]);
                mo24624F();
                String[] strArr = new String[0];
                C5073i iVar = ((C4450y) this.f10921b).f10998g;
                if (iVar != null) {
                    iVar.mo25679a("TRACKING_COMPLETED", strArr);
                }
                if (!IAConfigManager.f10525J.f10557v.f10660b.mo24346a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).mo24302a("dsos", false) || !z || (aVar = this.f14042w) == null) {
                    mo24626c(z);
                } else {
                    aVar.dismissAd(true);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo26368a(View view, String str) {
        if (view != null && view.getContext() != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
            mo24609z();
        }
    }

    /* renamed from: a */
    public boolean mo24416b(C4450y yVar) {
        C4276g gVar;
        T t;
        C4478b bVar;
        C4479c cVar;
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        C4310h hVar = iAConfigManager.f10557v.f10660b;
        hVar.getClass();
        String str = iAConfigManager.f10539d;
        if (hVar.f10658b.containsKey(str)) {
            gVar = hVar.f10658b.get(str);
        } else {
            gVar = new C4276g();
        }
        if (gVar.f10610a.containsKey(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD) || (t = yVar.f10914b) == null || (bVar = ((C5293g) t).f14094C) == null || (cVar = bVar.f11066g) == null || cVar.f11069a != C4483g.Static) {
            return false;
        }
        C4292j jVar = (C4292j) yVar.f10915c.mo24338a(C4292j.class);
        UnitDisplayType unitDisplayType = this.f14036E;
        jVar.getClass();
        int i = C4292j.C4293a.f10628a[unitDisplayType.ordinal()];
        if (i == 1) {
            return jVar.mo24313a("countdown_rv", false);
        }
        if (i != 2) {
            return false;
        }
        return jVar.mo24313a("countdown_iv", false);
    }

    /* renamed from: a */
    public long mo24412a(long j) {
        if (this.f10965t) {
            return j;
        }
        C4310h hVar = IAConfigManager.f10525J.f10557v.f10660b;
        long j2 = 12;
        String l = Long.toString(12);
        if (hVar.f10657a.containsKey("vast_endcard_x_fallback_delay")) {
            l = hVar.f10657a.get("vast_endcard_x_fallback_delay");
        }
        try {
            j2 = Long.parseLong(l);
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    /* renamed from: a */
    public void mo26369a(C4493q qVar) {
        C5073i iVar;
        AdContent adcontent = this.f10921b;
        if (adcontent != null && (iVar = ((C4450y) adcontent).f10998g) != null) {
            String[] strArr = {qVar.f11150a};
            if (iVar != null) {
                iVar.mo25679a("EVENT_TRACKING", strArr);
            }
        }
    }
}
