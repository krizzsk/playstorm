package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.enums.C4250a;
import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import com.fyber.inneractive.sdk.config.C4327r;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C4437u;
import com.fyber.inneractive.sdk.mraid.C4502a0;
import com.fyber.inneractive.sdk.network.C4575s;
import com.fyber.inneractive.sdk.p192ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.response.C5292f;
import com.fyber.inneractive.sdk.util.C5320d0;
import com.fyber.inneractive.sdk.util.C5325e;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5407d;

/* renamed from: com.fyber.inneractive.sdk.renderers.e */
public class C5272e implements C5407d.C5413f {

    /* renamed from: a */
    public final /* synthetic */ C5274g f13982a;

    public C5272e(C5274g gVar) {
        this.f13982a = gVar;
    }

    /* renamed from: a */
    public void mo24964a(C5407d dVar) {
        C5274g gVar = this.f13982a;
        gVar.getClass();
        IAlog.m16699a("%sweb view callback: onExpand", IAlog.m16696a((Object) gVar));
        C5274g gVar2 = this.f13982a;
        EventsListener eventslistener = gVar2.f10922c;
        if (eventslistener != null) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdExpanded(gVar2.f10920a);
        }
        C5274g gVar3 = this.f13982a;
        gVar3.getClass();
        IAlog.m16699a("%sweb view callback: onExpand", IAlog.m16696a((Object) gVar3));
        this.f13982a.mo26340d(true);
    }

    /* renamed from: a */
    public void mo24966a(C5407d dVar, boolean z) {
    }

    /* renamed from: a */
    public void mo24967a(C5407d dVar, boolean z, Orientation orientation) {
    }

    /* renamed from: b */
    public void mo24971b(C5407d dVar) {
        this.f13982a.mo26340d(true);
        C5274g gVar = this.f13982a;
        gVar.getClass();
        IAlog.m16699a("%sweb view callback: onResize", IAlog.m16696a((Object) gVar));
        C5274g gVar2 = this.f13982a;
        EventsListener eventslistener = gVar2.f10922c;
        if (eventslistener != null) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdResized(gVar2.f10920a);
        }
    }

    /* renamed from: b */
    public void mo24970b() {
        this.f13982a.mo24609z();
        this.f13982a.mo24596B();
    }

    /* renamed from: a */
    public void mo24965a(C5407d dVar, C4502a0 a0Var) {
        C5274g gVar = this.f13982a;
        gVar.getClass();
        IAlog.m16699a("%sweb view callback: onClose", IAlog.m16696a((Object) gVar));
        C5274g gVar2 = this.f13982a;
        EventsListener eventslistener = gVar2.f10922c;
        if (eventslistener != null) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdCollapsed(gVar2.f10920a);
        }
        this.f13982a.mo26336I();
        C5274g gVar3 = this.f13982a;
        gVar3.getClass();
        IAlog.m16699a("%sweb view callback: onClose", IAlog.m16696a((Object) gVar3));
    }

    /* renamed from: a */
    public C5320d0.C5321a mo24961a(String str, C5364p0 p0Var) {
        Context context;
        C4251b bVar;
        C5274g gVar = this.f13982a;
        gVar.getClass();
        IAlog.m16699a("%sweb view callback: onClicked", IAlog.m16696a((Object) gVar));
        ViewGroup viewGroup = this.f13982a.f13989p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            context = C5350l.f14216a;
        } else {
            context = this.f13982a.f13989p.getContext();
        }
        if (context != null) {
            C5274g gVar2 = this.f13982a;
            if (gVar2.f10928i) {
                AdContent adcontent = gVar2.f10921b;
                C5292f fVar = adcontent != null ? (C5292f) ((C4437u) adcontent).f10914b : null;
                if (fVar != null) {
                    gVar2.mo24602a((C5291e) fVar);
                }
                C5274g gVar3 = this.f13982a;
                AdContent adcontent2 = gVar3.f10921b;
                if (adcontent2 != null) {
                    C4437u uVar = (C4437u) adcontent2;
                    if (!(uVar.f10916d == null || ((C4345y) uVar.f10916d).f10747c == null)) {
                        C4250a aVar = C4250a.CLICK;
                        if (((C4345y) uVar.f10916d).f10747c.f10691b == UnitDisplayType.MRECT) {
                            bVar = C4251b.RECTANGLE_DISPLAY;
                        } else {
                            bVar = C4251b.BANNER_DISPLAY;
                        }
                        gVar3.mo24600a(aVar, bVar);
                    }
                }
                return this.f13982a.mo24599a(context, str, p0Var, C5325e.DISPLAY);
            }
        }
        return new C5320d0.C5321a(C5320d0.C5323c.FAILED, new Exception("No context or no native click detected"), context == null ? "null" : context.getClass().getName());
    }

    /* renamed from: a */
    public void mo24962a() {
        this.f13982a.mo24601a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
    }

    /* renamed from: a */
    public void mo24968a(String str, String str2) {
        C5274g gVar = this.f13982a;
        gVar.getClass();
        IAlog.m16699a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.m16696a((Object) gVar));
        ViewGroup viewGroup = this.f13982a.f13989p;
        if (viewGroup != null && viewGroup.getContext() != null) {
            C5274g gVar2 = this.f13982a;
            if (!gVar2.f13995v) {
                C4575s.m14052a(gVar2.f13989p.getContext(), str, str2, this.f13982a.f10921b);
                boolean unused = this.f13982a.f13995v = true;
                C5274g gVar3 = this.f13982a;
                gVar3.getClass();
                IAlog.m16699a("%sreporting auto redirect", IAlog.m16696a((Object) gVar3));
                return;
            }
            gVar2.getClass();
            IAlog.m16699a("%sredirect already reported for this ad", IAlog.m16696a((Object) gVar2));
        }
    }

    /* renamed from: a */
    public void mo26330a(boolean z) {
        C4346z zVar;
        C4327r rVar;
        C4251b bVar;
        C5274g gVar = this.f13982a;
        gVar.getClass();
        IAlog.m16699a("%sweb view callback: onVisibilityChanged: %s", IAlog.m16696a((Object) gVar), Boolean.valueOf(z));
        if (z) {
            C5274g gVar2 = this.f13982a;
            if (!gVar2.f13988o) {
                IAlog.m16699a("%sonShownForTheFirstTime called", IAlog.m16696a((Object) gVar2));
                AdContent adcontent = gVar2.f10921b;
                C5292f fVar = adcontent != null ? (C5292f) ((C4437u) adcontent).f10914b : null;
                if (fVar != null) {
                    IAmraidWebViewController iAmraidWebViewController = gVar2.f13986m;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.mo26421m();
                    }
                    gVar2.mo24604b((C5291e) fVar);
                }
                long G = (long) gVar2.mo26334G();
                gVar2.f13984k = G;
                if (G != 0) {
                    gVar2.mo26337a(G, true);
                }
                AdContent adcontent2 = gVar2.f10921b;
                if (!(adcontent2 == null || (zVar = ((C4437u) adcontent2).f10916d) == null || (rVar = ((C4345y) zVar).f10747c) == null)) {
                    C4250a aVar = C4250a.IMPRESSION;
                    if (rVar.f10691b == UnitDisplayType.MRECT) {
                        bVar = C4251b.RECTANGLE_DISPLAY;
                    } else {
                        bVar = C4251b.BANNER_DISPLAY;
                    }
                    gVar2.mo24600a(aVar, bVar);
                }
                gVar2.mo24595A();
                this.f13982a.f13988o = true;
                return;
            }
            C5266b bVar2 = gVar2.f13998y;
            if (bVar2 != null) {
                bVar2.mo26325b();
            }
            this.f13982a.mo26336I();
            return;
        }
        C5266b bVar3 = this.f13982a.f13998y;
        if (bVar3 != null && bVar3.f13975h) {
            bVar3.mo26326c();
        }
        this.f13982a.mo26340d(false);
    }

    /* renamed from: a */
    public boolean mo24969a(String str) {
        ViewGroup viewGroup = this.f13982a.f13989p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return false;
        }
        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.f13982a.f13989p.getContext(), str);
        if (!startRichMediaIntent) {
            return startRichMediaIntent;
        }
        C5274g gVar = this.f13982a;
        if (gVar.f10922c == null) {
            return startRichMediaIntent;
        }
        gVar.mo24609z();
        return startRichMediaIntent;
    }

    /* renamed from: a */
    public void mo24963a(InneractiveUnitController.AdDisplayError adDisplayError) {
        C5274g gVar = this.f13982a;
        EventsListener eventslistener = gVar.f10922c;
        if (eventslistener != null) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdEnteredErrorState(gVar.f10920a, adDisplayError);
        }
    }
}
