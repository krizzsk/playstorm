package com.fyber.inneractive.sdk.renderers;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.display.C4348b;
import com.fyber.inneractive.sdk.display.C4349c;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.flow.C4421l;
import com.fyber.inneractive.sdk.flow.C4450y;
import com.fyber.inneractive.sdk.interfaces.C4454b;
import com.fyber.inneractive.sdk.model.vast.C4478b;
import com.fyber.inneractive.sdk.model.vast.C4479c;
import com.fyber.inneractive.sdk.model.vast.C4484h;
import com.fyber.inneractive.sdk.network.C4575s;
import com.fyber.inneractive.sdk.p189dv.C4350a;
import com.fyber.inneractive.sdk.player.C4591c;
import com.fyber.inneractive.sdk.player.C5066f;
import com.fyber.inneractive.sdk.player.C5073i;
import com.fyber.inneractive.sdk.player.controller.C4660q;
import com.fyber.inneractive.sdk.player.p191ui.C5094c;
import com.fyber.inneractive.sdk.player.p191ui.C5098g;
import com.fyber.inneractive.sdk.response.C5293g;
import com.fyber.inneractive.sdk.util.C5320d0;
import com.fyber.inneractive.sdk.util.C5325e;
import com.fyber.inneractive.sdk.util.C5328f0;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.renderers.h */
public class C5276h extends C4421l<C4450y, InneractiveAdViewEventsListener> implements C4454b, InneractiveNativeVideoContentController.Renderer, C5328f0.C5333e {

    /* renamed from: k */
    public FrameLayout f14000k;

    /* renamed from: l */
    public C5098g f14001l;

    /* renamed from: m */
    public C4660q f14002m;

    /* renamed from: n */
    public VideoContentListener f14003n;

    /* renamed from: o */
    public final C4591c.C4594c f14004o = new C5277a();

    /* renamed from: p */
    public ViewGroup f14005p;

    /* renamed from: q */
    public C5286n f14006q;

    /* renamed from: r */
    public float f14007r = 0.0f;

    /* renamed from: s */
    public Rect f14008s = new Rect();

    /* renamed from: t */
    public Runnable f14009t;

    /* renamed from: u */
    public boolean f14010u = false;

    /* renamed from: v */
    public final C4660q.C4661a f14011v = new C5278b();

    /* renamed from: com.fyber.inneractive.sdk.renderers.h$a */
    public class C5277a implements C4591c.C4594c {
        public C5277a() {
        }

        /* renamed from: a */
        public void mo24802a(C4591c cVar) {
            C4660q qVar = C5276h.this.f14002m;
            if (qVar != null) {
                qVar.mo24880d(false);
                C5276h.this.f14002m.mo24882f();
            }
        }
    }

    /* renamed from: E */
    public final void mo26342E() {
        ViewGroup viewGroup;
        Runnable runnable = this.f14009t;
        if (runnable != null && (viewGroup = this.f14005p) != null) {
            viewGroup.removeCallbacks(runnable);
            this.f14009t = null;
        }
    }

    /* renamed from: a */
    public void mo24375a(int i) {
    }

    public void destroy() {
        mo24384t();
        super.destroy();
    }

    /* renamed from: f */
    public int mo24380f() {
        return 0;
    }

    /* renamed from: n */
    public void mo24381n() {
        C4660q qVar = this.f14002m;
        if (qVar != null) {
            qVar.mo24880d(false);
        }
    }

    /* renamed from: p */
    public int mo24382p() {
        return 0;
    }

    public void pauseVideo() {
        C4660q qVar = this.f14002m;
        if (qVar != null) {
            qVar.pauseVideo();
        }
    }

    public void playVideo() {
        C4660q qVar = this.f14002m;
        if (qVar != null) {
            qVar.mo24877b(0);
        }
    }

    /* renamed from: q */
    public void mo24383q() {
    }

    /* renamed from: t */
    public void mo24384t() {
        mo26342E();
        C5328f0.C5332d.f14185a.mo26446a(this.f14005p);
        IAlog.m16699a("%sunbind called. root is %s", IAlog.m16696a((Object) this), this.f14005p);
        if (this.f14002m != null) {
            IAlog.m16699a("%sdestroying video ui controller", IAlog.m16696a((Object) this));
            this.f14002m.mo24876a(null);
            this.f14002m.destroy();
            this.f14002m = null;
        }
        if (this.f14001l != null) {
            this.f14005p.setLayoutTransition((LayoutTransition) null);
            this.f14005p.removeView(this.f14000k);
            this.f14001l.destroy();
            this.f14001l = null;
        }
    }

    /* renamed from: a */
    public boolean mo24378a(C4419j jVar) {
        return jVar instanceof C4450y;
    }

    /* renamed from: a */
    public void mo24376a(ViewGroup viewGroup) {
        Bitmap bitmap;
        InneractiveAdSpot inneractiveAdSpot = this.f10920a;
        if (inneractiveAdSpot == null) {
            IAlog.m16703e("%sYou must set the spot to render before calling renderAd", IAlog.m16696a((Object) this));
            return;
        }
        this.f14005p = viewGroup;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        if (!(selectedUnitController instanceof InneractiveAdViewUnitController)) {
            IAlog.m16703e("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.m16696a((Object) this));
        } else {
            InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
            if (selectedContentController != null) {
                if (selectedContentController instanceof InneractiveAdViewVideoContentController) {
                    this.f14003n = (VideoContentListener) ((InneractiveAdViewVideoContentController) selectedContentController).getEventsListener();
                } else {
                    IAlog.m16703e("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.m16696a((Object) this), selectedContentController.getClass().getSimpleName());
                }
            }
        }
        this.f14010u = false;
        this.f14000k = new FrameLayout(viewGroup.getContext());
        C5073i iVar = ((C4450y) this.f10921b).f10998g;
        Context context = viewGroup.getContext();
        if (iVar != null) {
            ((C5066f) iVar.f13575f).getClass();
            C5265a aVar = new C5265a(iVar);
            this.f14006q = aVar;
            this.f14001l = aVar.mo26321a(context);
            this.f14002m = (C4660q) this.f14006q.mo26320a(this.f10920a, (C4450y) this.f10921b);
            this.f14005p.addView(this.f14000k, new ViewGroup.LayoutParams(-1, -2));
            this.f14005p.setLayoutTransition((LayoutTransition) null);
            this.f14000k.addView((View) this.f14001l, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f14002m.mo24876a(this.f14011v);
            this.f14002m.mo24880d(this.f14006q.mo26323a());
            this.f14006q.mo26322a(this.f14004o);
            if ((this.f14006q instanceof C5265a) && (bitmap = ((C5066f) iVar.f13575f).f11416l) != null) {
                this.f14002m.mo24875a(bitmap);
            }
            C5328f0 f0Var = C5328f0.C5332d.f14185a;
            ViewGroup viewGroup2 = this.f14005p;
            f0Var.getClass();
            f0Var.mo26444a(viewGroup2.getContext(), (View) viewGroup2, (C5328f0.C5333e) this);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.renderers.h$b */
    public class C5278b implements C4660q.C4661a {
        public C5278b() {
        }

        /* renamed from: a */
        public void mo24992a(String str, String str2) {
            C5276h hVar = C5276h.this;
            hVar.getClass();
            IAlog.m16699a("%s ad view video ad renderer callback: onSuspiciousNoUserWebActionDetected", IAlog.m16696a((Object) hVar));
            ViewGroup viewGroup = C5276h.this.f14005p;
            if (viewGroup != null && viewGroup.getContext() != null) {
                C5276h hVar2 = C5276h.this;
                if (!hVar2.f14010u) {
                    C4575s.m14052a(hVar2.f14005p.getContext(), str, str2, C5276h.this.f10921b);
                    boolean unused = C5276h.this.f14010u = true;
                    C5276h hVar3 = C5276h.this;
                    hVar3.getClass();
                    IAlog.m16699a("%s reporting auto redirect", IAlog.m16696a((Object) hVar3));
                    return;
                }
                hVar2.getClass();
                IAlog.m16699a("%s redirect already reported for this ad", IAlog.m16696a((Object) hVar2));
            }
        }

        /* renamed from: a */
        public void mo24993a(boolean z) {
        }

        /* renamed from: a */
        public void mo24994a(boolean z, Orientation orientation) {
        }

        /* renamed from: c */
        public void mo24973c() {
            Object obj;
            C5276h hVar = C5276h.this;
            EventsListener eventslistener = hVar.f10922c;
            if (eventslistener != null) {
                ((InneractiveAdViewEventsListener) eventslistener).onAdExpanded(hVar.f10920a);
            }
            ViewGroup viewGroup = C5276h.this.f14005p;
            if (viewGroup != null && viewGroup.getContext() != null) {
                C5276h hVar2 = C5276h.this;
                if (hVar2.f10921b instanceof C4350a) {
                    obj = new C4348b();
                } else {
                    obj = new C4349c();
                }
                if (obj instanceof C4349c) {
                    C4349c cVar = (C4349c) obj;
                    Context context = hVar2.f14005p.getContext();
                    InneractiveAdSpot inneractiveAdSpot = C5276h.this.f10920a;
                    Intent intent = new Intent(context, InneractiveFullscreenAdActivity.class);
                    intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
                    if (!(context instanceof Activity)) {
                        intent.setFlags(268435456);
                    }
                    try {
                        IAlog.m16699a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.m16696a((Object) context), inneractiveAdSpot.getLocalUniqueId());
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        IAlog.m16701c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.m16696a((Object) context));
                    }
                }
            }
        }

        /* renamed from: e */
        public void mo24995e() {
        }

        /* renamed from: g */
        public void mo24996g() {
            C4479c cVar;
            C4484h hVar;
            AdContent adcontent = C5276h.this.f10921b;
            if (adcontent != null) {
                C4450y yVar = (C4450y) adcontent;
                if (yVar.f10913a != null && yVar.f10914b != null) {
                    String str = null;
                    C4478b bVar = ((C5293g) yVar.f10914b).f14094C;
                    if (!(bVar == null || (cVar = bVar.f11066g) == null || (hVar = cVar.f11070b) == null)) {
                        str = hVar.toString();
                    }
                    C5276h.this.mo24603a(str);
                }
            }
        }

        /* renamed from: h */
        public void mo24997h() {
        }

        /* renamed from: j */
        public void mo24998j() {
            C5276h.this.mo24601a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
        }

        /* renamed from: k */
        public void mo24999k() {
        }

        /* renamed from: l */
        public void mo25000l() {
            C5276h hVar = C5276h.this;
            C4450y yVar = (C4450y) hVar.f10921b;
            if (!yVar.f10999h) {
                yVar.f10999h = true;
                hVar.mo24595A();
            }
        }

        public void onCompleted() {
            C5098g gVar;
            C5276h hVar = C5276h.this;
            VideoContentListener videoContentListener = hVar.f14003n;
            if (videoContentListener != null && (gVar = hVar.f14001l) != null && ((C5094c) gVar).f13642e) {
                videoContentListener.onCompleted();
            }
        }

        public void onPlayerError() {
            C5098g gVar;
            C5276h hVar = C5276h.this;
            VideoContentListener videoContentListener = hVar.f14003n;
            if (videoContentListener != null && (gVar = hVar.f14001l) != null && ((C5094c) gVar).f13642e) {
                videoContentListener.onPlayerError();
            }
        }

        public void onProgress(int i, int i2) {
            C5098g gVar;
            C5276h hVar = C5276h.this;
            VideoContentListener videoContentListener = hVar.f14003n;
            if (videoContentListener != null && (gVar = hVar.f14001l) != null && ((C5094c) gVar).f13642e) {
                videoContentListener.onProgress(i, i2);
            }
        }

        /* renamed from: r */
        public void mo25004r() {
            C5276h hVar = C5276h.this;
            if (hVar.f10922c != null) {
                hVar.mo24609z();
            }
        }

        /* renamed from: a */
        public void mo24991a(View view, String str) {
            if (view != null && view.getContext() != null) {
                InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
                C5276h.this.mo24609z();
            }
        }

        /* renamed from: a */
        public C5320d0.C5321a mo24989a(C5364p0 p0Var, C5325e eVar) {
            Context context;
            C5276h hVar = C5276h.this;
            if (hVar.f14001l.getContext() == null) {
                context = C5350l.f14216a;
            } else {
                context = C5276h.this.f14001l.getContext();
            }
            AdContent adcontent = C5276h.this.f10921b;
            return hVar.mo24599a(context, adcontent != null ? ((C4450y) adcontent).mo24648f() : null, p0Var, eVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
            r0 = (r0 = r0.f11066g).f11070b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.fyber.inneractive.sdk.util.C5320d0.C5321a mo24990a(java.lang.String r4, com.fyber.inneractive.sdk.util.C5364p0 r5) {
            /*
                r3 = this;
                com.fyber.inneractive.sdk.renderers.h r0 = com.fyber.inneractive.sdk.renderers.C5276h.this
                AdContent r0 = r0.f10921b
                r1 = 0
                if (r0 == 0) goto L_0x002c
                com.fyber.inneractive.sdk.flow.y r0 = (com.fyber.inneractive.sdk.flow.C4450y) r0
                com.fyber.inneractive.sdk.external.InneractiveAdRequest r2 = r0.f10913a
                if (r2 == 0) goto L_0x002c
                T r2 = r0.f10914b
                if (r2 == 0) goto L_0x002c
                T r0 = r0.f10914b
                com.fyber.inneractive.sdk.response.g r0 = (com.fyber.inneractive.sdk.response.C5293g) r0
                com.fyber.inneractive.sdk.model.vast.b r0 = r0.f14094C
                if (r0 == 0) goto L_0x0026
                com.fyber.inneractive.sdk.model.vast.c r0 = r0.f11066g
                if (r0 == 0) goto L_0x0026
                com.fyber.inneractive.sdk.model.vast.h r0 = r0.f11070b
                if (r0 == 0) goto L_0x0026
                java.lang.String r0 = r0.toString()
                goto L_0x0027
            L_0x0026:
                r0 = r1
            L_0x0027:
                com.fyber.inneractive.sdk.renderers.h r2 = com.fyber.inneractive.sdk.renderers.C5276h.this
                r2.mo24603a((java.lang.String) r0)
            L_0x002c:
                android.app.Application r0 = com.fyber.inneractive.sdk.util.C5350l.f14216a
                com.fyber.inneractive.sdk.renderers.h r2 = com.fyber.inneractive.sdk.renderers.C5276h.this
                android.view.ViewGroup r2 = r2.f14005p
                if (r2 == 0) goto L_0x0042
                android.content.Context r2 = r2.getContext()
                if (r2 == 0) goto L_0x0042
                com.fyber.inneractive.sdk.renderers.h r0 = com.fyber.inneractive.sdk.renderers.C5276h.this
                android.view.ViewGroup r0 = r0.f14005p
                android.content.Context r0 = r0.getContext()
            L_0x0042:
                boolean r2 = android.text.TextUtils.isEmpty(r4)
                if (r2 == 0) goto L_0x0064
                com.fyber.inneractive.sdk.renderers.h r4 = com.fyber.inneractive.sdk.renderers.C5276h.this
                AdContent r4 = r4.f10921b
                com.fyber.inneractive.sdk.flow.y r4 = (com.fyber.inneractive.sdk.flow.C4450y) r4
                T r2 = r4.f10914b
                if (r2 == 0) goto L_0x0063
                com.fyber.inneractive.sdk.response.g r2 = (com.fyber.inneractive.sdk.response.C5293g) r2
                com.fyber.inneractive.sdk.model.vast.b r2 = r2.f14094C
                com.fyber.inneractive.sdk.model.vast.c r2 = r2.f11066g
                if (r2 == 0) goto L_0x005c
                java.lang.String r1 = r2.f11075g
            L_0x005c:
                if (r1 != 0) goto L_0x0063
                java.lang.String r4 = r4.mo24648f()
                goto L_0x0064
            L_0x0063:
                r4 = r1
            L_0x0064:
                com.fyber.inneractive.sdk.renderers.h r1 = com.fyber.inneractive.sdk.renderers.C5276h.this
                com.fyber.inneractive.sdk.util.e r2 = com.fyber.inneractive.sdk.util.C5325e.VAST_ENDCARD
                com.fyber.inneractive.sdk.util.d0$a r4 = r1.mo24599a(r0, r4, r5, r2)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5276h.C5278b.mo24990a(java.lang.String, com.fyber.inneractive.sdk.util.p0):com.fyber.inneractive.sdk.util.d0$a");
        }
    }

    /* renamed from: a */
    public void mo26343a(View view, float f, Rect rect) {
        if (this.f14007r != f || !this.f14008s.equals(rect)) {
            this.f14007r = f;
            this.f14008s.set(rect);
            C4660q qVar = this.f14002m;
            if (qVar != null) {
                qVar.mo24926b(false);
                ((C5094c) this.f14001l).mo25727b();
                this.f14002m.mo24925a(f);
            }
            if (f > 0.0f) {
                mo26342E();
                C5279i iVar = new C5279i(this);
                this.f14009t = iVar;
                this.f14005p.postDelayed(iVar, 100);
                return;
            }
            mo26342E();
        }
    }

    /* renamed from: a */
    public boolean mo24377a(View view) {
        return view.equals(this.f14005p);
    }

    /* renamed from: a */
    public void mo24374a() {
        C4660q qVar = this.f14002m;
        if (qVar != null) {
            qVar.mo24924a();
        }
    }
}
