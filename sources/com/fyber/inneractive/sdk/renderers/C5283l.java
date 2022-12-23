package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.os.Build;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.enums.C4250a;
import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C4437u;
import com.fyber.inneractive.sdk.interfaces.C4455c;
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
import com.fyber.inneractive.sdk.web.C5405c;
import com.fyber.inneractive.sdk.web.C5407d;

/* renamed from: com.fyber.inneractive.sdk.renderers.l */
public class C5283l implements C5407d.C5413f {

    /* renamed from: a */
    public final /* synthetic */ C5281k f14031a;

    public C5283l(C5281k kVar) {
        this.f14031a = kVar;
    }

    /* renamed from: a */
    public void mo24964a(C5407d dVar) {
        C5281k kVar = this.f14031a;
        kVar.getClass();
        IAlog.m16699a("%sweb view callback: onExpand", IAlog.m16696a((Object) kVar));
        boolean unused = this.f14031a.f14018C = true;
        this.f14031a.mo26363M();
    }

    /* renamed from: b */
    public void mo24971b(C5407d dVar) {
        C5281k kVar = this.f14031a;
        kVar.getClass();
        IAlog.m16699a("%sweb view callback: onResize", IAlog.m16696a((Object) kVar));
    }

    /* renamed from: b */
    public void mo24970b() {
        this.f14031a.mo24609z();
    }

    /* renamed from: a */
    public void mo24965a(C5407d dVar, C4502a0 a0Var) {
        C5281k kVar = this.f14031a;
        kVar.getClass();
        IAlog.m16699a("%sweb view callback: onClose", IAlog.m16696a((Object) kVar));
        C5281k kVar2 = this.f14031a;
        if (kVar2.f14018C) {
            boolean unused = kVar2.f14018C = false;
            this.f14031a.mo26363M();
            return;
        }
        if (kVar2.f14021F == UnitDisplayType.REWARDED) {
            kVar2.mo26362L();
        }
        C4455c.C4456a aVar = this.f14031a.f10956k;
        if (aVar != null) {
            aVar.dismissAd(true);
        }
    }

    /* renamed from: a */
    public C5320d0.C5321a mo24961a(String str, C5364p0 p0Var) {
        C5292f fVar;
        C4251b bVar;
        C5281k kVar = this.f14031a;
        kVar.getClass();
        IAlog.m16699a("%sweb view callback: onClicked", IAlog.m16696a((Object) kVar));
        Context context = C5350l.f14216a;
        C4455c.C4456a aVar = this.f14031a.f10956k;
        if (!(aVar == null || aVar.getLayout() == null || this.f14031a.f10956k.getLayout().getContext() == null)) {
            context = this.f14031a.f10956k.getLayout().getContext();
        }
        if (context != null) {
            C5281k kVar2 = this.f14031a;
            if (kVar2.f10928i) {
                AdContent adcontent = kVar2.f10921b;
                if (adcontent == null) {
                    fVar = null;
                } else {
                    fVar = (C5292f) ((C4437u) adcontent).f10914b;
                }
                if (fVar != null) {
                    kVar2.mo24602a((C5291e) fVar);
                }
                C5281k kVar3 = this.f14031a;
                C4250a aVar2 = C4250a.CLICK;
                if (kVar3.f14021F == UnitDisplayType.REWARDED) {
                    bVar = C4251b.REWARDED_DISPLAY;
                } else {
                    bVar = C4251b.INTERSTITIAL_DISPLAY;
                }
                kVar3.mo24600a(aVar2, bVar);
                return this.f14031a.mo24599a(context, str, p0Var, C5325e.DISPLAY);
            }
        }
        return new C5320d0.C5321a(C5320d0.C5323c.FAILED, new Exception("No context or no native click detected"), context == null ? "null" : context.getClass().getName());
    }

    /* renamed from: a */
    public void mo24962a() {
        this.f14031a.mo24601a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
        this.f14031a.destroy();
    }

    /* renamed from: a */
    public void mo24968a(String str, String str2) {
        C5281k kVar = this.f14031a;
        kVar.getClass();
        IAlog.m16699a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.m16696a((Object) kVar));
        C4455c.C4456a aVar = this.f14031a.f10956k;
        if (aVar != null && aVar.getLayout() != null) {
            C5281k kVar2 = this.f14031a;
            if (!kVar2.f14019D) {
                C4575s.m14052a(kVar2.f10956k.getLayout().getContext(), str, str2, this.f14031a.f10921b);
                boolean unused = this.f14031a.f14019D = true;
                C5281k kVar3 = this.f14031a;
                kVar3.getClass();
                IAlog.m16699a("%sreporting auto redirect", IAlog.m16696a((Object) kVar3));
                return;
            }
            kVar2.getClass();
            IAlog.m16699a("%sredirect already reported for this ad", IAlog.m16696a((Object) kVar2));
        }
    }

    /* renamed from: a */
    public void mo26330a(boolean z) {
        C4251b bVar;
        C5405c cVar;
        String str;
        if (z) {
            C5281k kVar = this.f14031a;
            if (!kVar.f14027x) {
                kVar.f14027x = true;
                if (kVar.f10921b != null) {
                    IAmraidWebViewController iAmraidWebViewController = kVar.f14028y;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.mo26421m();
                    }
                    T t = ((C4437u) kVar.f10921b).f10914b;
                    if (!(t == null || (str = t.f14076k) == null || str.trim().length() <= 0)) {
                        IAlog.m16702d("%sfiring impression!", IAlog.m16696a((Object) kVar));
                        int i = IAlog.f14137a;
                        IAlog.m16697a(1, (Exception) null, "AD_IMPRESSION", new Object[0]);
                        kVar.mo24605b(str);
                    }
                    if (Build.VERSION.SDK_INT >= 19 && (cVar = kVar.f14028y.f14280b) != null) {
                        cVar.mo26523a("var forceReflow = function(elem){ elem = elem || document.documentElement; elem.style.zIndex = 2147483646; var width = elem.style.width, px = elem.offsetWidth+1; elem.style.width = px+'px'; setTimeout(function(){ elem.style.zIndex = 2147483646; elem.style.width = width; elem = null; }, 0); }; forceReflow(document.documentElement);");
                    }
                    C4250a aVar = C4250a.IMPRESSION;
                    if (kVar.f14021F == UnitDisplayType.REWARDED) {
                        bVar = C4251b.REWARDED_DISPLAY;
                    } else {
                        bVar = C4251b.INTERSTITIAL_DISPLAY;
                    }
                    kVar.mo24600a(aVar, bVar);
                    kVar.mo24595A();
                    kVar.mo24624F();
                }
            }
        }
        C5281k kVar2 = this.f14031a;
        kVar2.getClass();
        IAlog.m16699a("%sweb view callback: onVisibilityChanged: %s", IAlog.m16696a((Object) kVar2), Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo24967a(C5407d dVar, boolean z, Orientation orientation) {
        C4455c.C4456a aVar = this.f14031a.f10956k;
        if (aVar != null) {
            aVar.setActivityOrientation(z, orientation);
        }
    }

    /* renamed from: a */
    public boolean mo24969a(String str) {
        C4455c.C4456a aVar = this.f14031a.f10956k;
        if (aVar == null || aVar.getLayout() == null) {
            return false;
        }
        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.f14031a.f10956k.getLayout().getContext(), str);
        if (!startRichMediaIntent) {
            return startRichMediaIntent;
        }
        this.f14031a.mo24609z();
        return startRichMediaIntent;
    }

    /* renamed from: a */
    public void mo24966a(C5407d dVar, boolean z) {
        if (z) {
            C5281k kVar = this.f14031a;
            if (!kVar.f10964s) {
                boolean unused = kVar.f10964s = true;
                C5281k kVar2 = this.f14031a;
                C4455c.C4456a aVar = kVar2.f10956k;
                if (aVar != null) {
                    kVar2.mo24627d(aVar.isCloseButtonDisplay());
                }
            }
            this.f14031a.mo24625K();
            C4455c.C4456a aVar2 = this.f14031a.f10956k;
            if (aVar2 != null && aVar2.isCloseButtonDisplay()) {
                C5281k kVar3 = this.f14031a;
                kVar3.f10961p = false;
                C4455c.C4456a aVar3 = kVar3.f10956k;
                if (aVar3 != null) {
                    aVar3.disableCloseButton();
                }
                kVar3.f10966u.mo26436a();
            }
        }
    }

    /* renamed from: a */
    public void mo24963a(InneractiveUnitController.AdDisplayError adDisplayError) {
        this.f14031a.mo24628e(false);
        C5281k kVar = this.f14031a;
        EventsListener eventslistener = kVar.f10922c;
        if (eventslistener != null) {
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdEnteredErrorState(kVar.f10920a, adDisplayError);
        }
    }
}
