package com.fyber.inneractive.sdk.p192ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.C4167R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.measurement.C4459a;
import com.fyber.inneractive.sdk.measurement.C4463d;
import com.fyber.inneractive.sdk.measurement.C4465f;
import com.fyber.inneractive.sdk.mraid.C4501a;
import com.fyber.inneractive.sdk.mraid.C4502a0;
import com.fyber.inneractive.sdk.mraid.C4503b;
import com.fyber.inneractive.sdk.mraid.C4504b0;
import com.fyber.inneractive.sdk.mraid.C4505c;
import com.fyber.inneractive.sdk.mraid.C4506d;
import com.fyber.inneractive.sdk.mraid.C4507e;
import com.fyber.inneractive.sdk.mraid.C4508f;
import com.fyber.inneractive.sdk.mraid.C4509g;
import com.fyber.inneractive.sdk.mraid.C4510h;
import com.fyber.inneractive.sdk.mraid.C4511i;
import com.fyber.inneractive.sdk.mraid.C4512j;
import com.fyber.inneractive.sdk.mraid.C4513k;
import com.fyber.inneractive.sdk.mraid.C4514l;
import com.fyber.inneractive.sdk.mraid.C4515m;
import com.fyber.inneractive.sdk.mraid.C4516n;
import com.fyber.inneractive.sdk.mraid.C4517o;
import com.fyber.inneractive.sdk.mraid.C4518p;
import com.fyber.inneractive.sdk.mraid.C4519q;
import com.fyber.inneractive.sdk.mraid.C4520r;
import com.fyber.inneractive.sdk.mraid.C4522t;
import com.fyber.inneractive.sdk.mraid.C4523u;
import com.fyber.inneractive.sdk.mraid.C4524v;
import com.fyber.inneractive.sdk.mraid.C4525w;
import com.fyber.inneractive.sdk.mraid.C4526x;
import com.fyber.inneractive.sdk.mraid.C4527y;
import com.fyber.inneractive.sdk.mraid.C4528z;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5348k;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5396a;
import com.fyber.inneractive.sdk.web.C5405c;
import com.fyber.inneractive.sdk.web.C5407d;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.Partner;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URI;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController */
public class IAmraidWebViewController extends C5407d<C5407d.C5413f> {

    /* renamed from: Y */
    public boolean f14118Y;

    /* renamed from: Z */
    public boolean f14119Z = false;

    /* renamed from: a0 */
    public boolean f14120a0 = false;

    /* renamed from: b0 */
    public boolean f14121b0 = false;

    /* renamed from: c0 */
    public boolean f14122c0 = true;

    /* renamed from: d0 */
    public boolean f14123d0 = false;

    /* renamed from: e0 */
    public C5407d.C5414g f14124e0;

    /* renamed from: f0 */
    public final Runnable f14125f0 = new C5303a();

    /* renamed from: g0 */
    public final Runnable f14126g0 = new C5306b();

    /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$MraidVideoFailedToDisplayError */
    public static class MraidVideoFailedToDisplayError extends InneractiveUnitController.AdDisplayError {
        public MraidVideoFailedToDisplayError(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$a */
    public class C5303a implements Runnable {

        /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$a$a */
        public class C5304a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$a$a$a */
            public class C5305a implements Runnable {
                public C5305a() {
                }

                public void run() {
                    C4459a.C4460a aVar;
                    AdEvents adEvents;
                    IAmraidWebViewController iAmraidWebViewController = IAmraidWebViewController.this;
                    if (iAmraidWebViewController.f14343w != null && (aVar = iAmraidWebViewController.f14344x) != null) {
                        C4465f fVar = (C4465f) aVar;
                        if (!fVar.f11010d && fVar.f11008b != null && (adEvents = fVar.f11009c) != null) {
                            fVar.f11010d = true;
                            try {
                                adEvents.impressionOccurred();
                            } catch (Throwable th) {
                                fVar.mo24661a(th);
                            }
                        }
                    }
                }
            }

            public C5304a() {
            }

            public boolean onPreDraw() {
                int i;
                C5405c cVar;
                C5405c cVar2 = IAmraidWebViewController.this.f14280b;
                if (cVar2 != null) {
                    cVar2.getViewTreeObserver().removeOnPreDrawListener(this);
                    IAmraidWebViewController iAmraidWebViewController = IAmraidWebViewController.this;
                    iAmraidWebViewController.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (iAmraidWebViewController.f14280b.getScaleX() == 1.0f || iAmraidWebViewController.f14280b.getScaleY() == 1.0f) {
                        arrayList.add(new C4526x(iAmraidWebViewController.f14330K, iAmraidWebViewController.f14331L));
                        arrayList.add(new C4524v(iAmraidWebViewController.f14332M, iAmraidWebViewController.f14333N));
                    } else {
                        arrayList.add(new C4526x(iAmraidWebViewController.f14280b.getWidthDp(), iAmraidWebViewController.f14280b.getHeightDp()));
                        arrayList.add(new C4524v(iAmraidWebViewController.f14280b.getWidthDp(), iAmraidWebViewController.f14280b.getHeightDp()));
                    }
                    C5405c cVar3 = iAmraidWebViewController.f14280b;
                    int c = C5350l.m16765c(cVar3 != null ? cVar3.getWidth() : iAmraidWebViewController.f14332M);
                    C5405c cVar4 = iAmraidWebViewController.f14280b;
                    if (cVar4 != null) {
                        i = cVar4.getHeight();
                    } else {
                        i = iAmraidWebViewController.f14333N;
                    }
                    arrayList.add(new C4523u(0, 0, c, C5350l.m16765c(i)));
                    if (iAmraidWebViewController.f14280b != null) {
                        String arrayList2 = arrayList.toString();
                        if (arrayList2.length() >= 2) {
                            String str = "{" + arrayList2.substring(1, arrayList2.length() - 1) + "}";
                            iAmraidWebViewController.f14280b.mo26523a("window.mraidbridge.fireChangeEvent(" + str + ");");
                            IAlog.m16702d("Fire changes: %s", str);
                        }
                    }
                    C4502a0 a0Var = C4502a0.DEFAULT;
                    iAmraidWebViewController.f14345y = a0Var;
                    iAmraidWebViewController.mo26546a((C4522t) new C4527y(a0Var));
                    C5405c cVar5 = iAmraidWebViewController.f14280b;
                    boolean a = (cVar5 == null || cVar5.getContext() == null) ? false : C5348k.m16741a(new Intent(iAmraidWebViewController.f14280b.getContext(), InneractiveRichMediaVideoPlayerActivityCore.class));
                    C4528z zVar = new C4528z();
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(Uri.parse("tel:"));
                    zVar.f11191b = C5348k.m16741a(intent);
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse("sms:"));
                    zVar.f11190a = C5348k.m16741a(intent2);
                    zVar.f11192c = C5348k.m16741a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"));
                    zVar.f11194e = a;
                    zVar.f11193d = C5348k.m16749n();
                    iAmraidWebViewController.mo26546a((C4522t) zVar);
                    IAmraidWebViewController iAmraidWebViewController2 = IAmraidWebViewController.this;
                    iAmraidWebViewController2.mo26546a((C4522t) new C4525w(iAmraidWebViewController2.f14124e0));
                    IAmraidWebViewController iAmraidWebViewController3 = IAmraidWebViewController.this;
                    if (iAmraidWebViewController3.f14124e0 == C5407d.C5414g.INTERSTITIAL && (cVar = iAmraidWebViewController3.f14280b) != null) {
                        cVar.mo26523a("showInterstitial();");
                    }
                    C5405c cVar6 = IAmraidWebViewController.this.f14280b;
                    if (cVar6 != null) {
                        cVar6.mo26523a("window.mraidbridge.fireReadyEvent();");
                    }
                    IAmraidWebViewController iAmraidWebViewController4 = IAmraidWebViewController.this;
                    iAmraidWebViewController4.mo26544a(iAmraidWebViewController4.mo26554g(), true);
                    IAmraidWebViewController.this.mo26422n();
                    C5357n.f14225b.postDelayed(new C5305a(), 100);
                }
                return false;
            }
        }

        public C5303a() {
        }

        public void run() {
            C5405c cVar = IAmraidWebViewController.this.f14280b;
            if (cVar != null) {
                cVar.getViewTreeObserver().addOnPreDrawListener(new C5304a());
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$b */
    public class C5306b implements Runnable {
        public C5306b() {
        }

        public void run() {
            C5405c cVar = IAmraidWebViewController.this.f14280b;
            if (cVar != null) {
                cVar.mo26523a("if (FyMraidVideo.getCurrentTime() < 0.2) { var ifr = document.createElement('iframe'); var container = document.body || document.documentElement; container.appendChild(ifr); ifr.setAttribute('sandbox', ''); ifr.setAttribute('style', 'position: fixed; bottom: -20px; border: none; visibility: hidden; height: 20px; z-index: -99999'); ifr.setAttribute('src','FyMraidVideo://fyMraidVideoAdPlaybackFailure'); console.log('dispatched closure event'); } else { console.log('video has progressed'); };");
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$c */
    public class C5307c implements Runnable {
        public C5307c() {
        }

        public void run() {
            C5405c cVar = IAmraidWebViewController.this.f14280b;
            if (cVar != null) {
                try {
                    cVar.invalidate();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public IAmraidWebViewController(Context context, boolean z, C5407d.C5414g gVar, C5407d.C5411d dVar, C5407d.C5415h hVar, boolean z2, C4459a aVar) {
        super(context, z, false, gVar, dVar, hVar, aVar);
        this.f14118Y = z2;
        this.f14280b.setId(C4167R.C4169id.inneractive_webview_mraid);
        this.f14124e0 = gVar;
    }

    /* renamed from: a */
    public final void mo26416a(long j) {
        C5357n.f14225b.postDelayed(new C5307c(), j);
    }

    /* renamed from: e */
    public void mo26419e(boolean z) {
        C5405c cVar;
        mo26546a((C4522t) new C4504b0(z));
        IAlog.m16699a("%sonWebViewVisibilityChanged called with: %s", IAlog.m16696a((Object) this), Boolean.valueOf(z));
        L l = this.f14285g;
        if (l != null) {
            l.mo26330a(z);
        }
        if (this.f14120a0 && this.f14119Z && this.f14121b0 && (cVar = this.f14280b) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("FyMraidVideo.");
            sb.append(z ? "play" : CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
            sb.append("();");
            cVar.mo26523a(sb.toString());
        }
        if (this.f14280b != null && z) {
            mo26416a(1);
            mo26416a(100);
            mo26416a(250);
            mo26416a(1000);
        }
    }

    /* renamed from: l */
    public void mo26420l() {
        mo26504a(false);
        Handler handler = C5357n.f14225b;
        handler.removeCallbacks(this.f14126g0);
        handler.removeCallbacks(this.f14125f0);
    }

    /* renamed from: m */
    public void mo26421m() {
        C5405c cVar = this.f14280b;
        if (cVar != null) {
            this.f14119Z = true;
            if (Build.VERSION.SDK_INT >= 17 && this.f14121b0) {
                cVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            C5357n.f14225b.postDelayed(this.f14125f0, 0);
        }
    }

    /* renamed from: n */
    public final void mo26422n() {
        C5405c cVar;
        if (this.f14119Z && this.f14120a0 && this.f14121b0 && (cVar = this.f14280b) != null) {
            cVar.mo26523a("FyMraidVideo.play()");
            Runnable runnable = this.f14126g0;
            if (runnable != null) {
                C5357n.f14225b.postDelayed(runnable, 5000);
            }
            if (this.f14123d0) {
                this.f14280b.mo26523a("FyMraidVideo.mute(true)");
            }
        }
    }

    public void setAutoplayMRAIDVideos(boolean z) {
        this.f14121b0 = z;
    }

    public void setCenteringTagsRequired(boolean z) {
        this.f14122c0 = z;
    }

    public void setMuteMraidVideo(boolean z) {
        this.f14123d0 = z;
    }

    /* renamed from: a */
    public boolean mo26418a(String str, C5364p0 p0Var) {
        C4508f fVar;
        C5405c cVar;
        C4465f fVar2;
        AdSessionConfiguration adSessionConfiguration;
        AdSessionContext adSessionContext;
        Uri parse = Uri.parse(str);
        String uri = parse.toString();
        parse.getScheme();
        C4503b bVar = null;
        if (uri.startsWith("iaadfinishedloading")) {
            if (uri.endsWith("success")) {
                IAlog.m16702d("received iaadfinishedloading success", new Object[0]);
                if (!(this.f14279a || this.f14284f == null || (cVar = this.f14280b) == null)) {
                    cVar.mo26524a();
                    this.f14279a = true;
                    C4459a aVar = this.f14343w;
                    if (aVar != null) {
                        C5405c cVar2 = this.f14280b;
                        C4419j jVar = this.f14300v;
                        IAlog.m16699a("omsdk initMraidSession", new Object[0]);
                        Partner partner = ((C4463d) aVar).f11005c;
                        if (partner == null) {
                            IAlog.m16699a("omsdk partner is null", new Object[0]);
                            fVar2 = null;
                        } else {
                            fVar2 = new C4465f(partner, cVar2, jVar);
                            try {
                                adSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.UNSPECIFIED, Owner.NATIVE, Owner.NONE, false);
                            } catch (Throwable th) {
                                fVar2.mo24661a(th);
                            }
                            try {
                                adSessionContext = AdSessionContext.createHtmlAdSessionContext(fVar2.f11007a, cVar2, "", "");
                            } catch (Throwable th2) {
                                fVar2.mo24661a(th2);
                                adSessionContext = null;
                            }
                            AdSession createAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
                            fVar2.f11008b = createAdSession;
                            createAdSession.registerAdView(cVar2);
                            fVar2.f11008b.start();
                            AdEvents createAdEvents = AdEvents.createAdEvents(fVar2.f11008b);
                            fVar2.f11009c = createAdEvents;
                            createAdEvents.loaded();
                        }
                        this.f14344x = fVar2;
                    }
                    IAlog.m16699a("%sIAWebViewController: onWebviewLoaded - load took %d msec", IAlog.m16696a((Object) this), Long.valueOf(System.currentTimeMillis() - this.f14295q));
                    Runnable runnable = this.f14293o;
                    if (runnable != null) {
                        C5357n.f14225b.removeCallbacks(runnable);
                        this.f14293o = null;
                    }
                    C5396a.C5402f fVar3 = this.f14284f;
                    if (fVar3 != null) {
                        fVar3.mo24589a(this);
                    }
                }
            }
            return true;
        } else if (!CampaignEx.JSON_KEY_MRAID.equals(Uri.parse(str).getScheme())) {
            return false;
        } else {
            URI create = URI.create(str);
            String host = create.getHost();
            try {
                Map<String, String> a = mo26542a(create);
                C4508f[] values = C4508f.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        fVar = C4508f.UNSPECIFIED;
                        break;
                    }
                    fVar = values[i];
                    if (fVar.f11177a.equals(host)) {
                        break;
                    }
                    i++;
                }
                switch (fVar.ordinal()) {
                    case 0:
                        bVar = new C4505c(a, this, p0Var);
                        break;
                    case 1:
                        bVar = new C4507e(a, this, p0Var);
                        break;
                    case 2:
                        bVar = new C4520r(a, this, p0Var);
                        break;
                    case 3:
                        bVar = new C4514l(a, this, p0Var);
                        break;
                    case 4:
                        bVar = new C4516n(a, this, p0Var);
                        break;
                    case 5:
                        bVar = new C4512j(a, this, p0Var);
                        break;
                    case 6:
                        bVar = new C4518p(a, this, p0Var);
                        break;
                    case 7:
                        bVar = new C4517o(a, this, p0Var);
                        break;
                    case 8:
                        bVar = new C4515m(a, this, p0Var);
                        break;
                    case 9:
                        bVar = new C4519q(a, this, p0Var);
                        break;
                    case 10:
                        bVar = new C4509g(a, this, p0Var);
                        break;
                    case 11:
                        bVar = new C4510h(a, this, p0Var);
                        break;
                    case 12:
                        bVar = new C4511i(a, this, p0Var);
                        break;
                    case 13:
                        bVar = new C4513k(a, this, p0Var);
                        break;
                    case 14:
                        bVar = new C4506d(a, this, p0Var);
                        break;
                }
                if (bVar == null || ((bVar instanceof C4507e) && this.f14321B == C5407d.C5414g.INTERSTITIAL)) {
                    mo26548b(host);
                    return true;
                }
                bVar.f11162a = host;
                IAlog.m16702d("Processing MRaid command: %s", host);
                if (bVar instanceof C4501a) {
                    mo26505a((C5396a.C5401e) new C5407d.C5417j(this, (C4501a) bVar, p0Var));
                } else {
                    if (bVar.mo24706b()) {
                        mo26508d();
                    }
                    bVar.mo24710a();
                }
                mo26548b(host);
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    /* renamed from: a */
    public boolean mo26417a(WebView webView, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IAlog.m16699a("IAmraidWebViewController: handleUrl = %s", str);
        if (this.f14280b == null) {
            IAlog.m16699a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        } else if (str == null || !str.toLowerCase().startsWith("FyMraidVideo".toLowerCase())) {
            return super.mo26417a(webView, str);
        } else {
            if (str.toLowerCase().endsWith("fyMraidVideoAd".toLowerCase())) {
                IAlog.m16702d("Dispatching MRAID Video detection event", new Object[0]);
                C4567p pVar = C4567p.MRAID_VIDEO_DETECTED;
                InneractiveAdRequest inneractiveAdRequest = this.f14299u;
                C4419j jVar = this.f14300v;
                C5291e c = jVar == null ? null : jVar.mo24367c();
                C4419j jVar2 = this.f14300v;
                if (jVar2 == null) {
                    jSONArray2 = null;
                } else {
                    jSONArray2 = jVar2.f10915c.mo24342c();
                }
                C4569q.C4570a aVar = new C4569q.C4570a(c);
                aVar.f11365c = pVar;
                aVar.f11363a = inneractiveAdRequest;
                aVar.f11366d = jSONArray2;
                aVar.mo24768a((String) null);
                this.f14120a0 = true;
                mo26422n();
            } else if (str.toLowerCase().endsWith("fyMraidVideoAdPlaybackFailure".toLowerCase())) {
                IAlog.m16700b("MRAID Video has not started in a timely fashion, showing close button", new Object[0]);
                if (this.f14285g != null) {
                    mo26549b(false);
                    C4565o oVar = C4565o.MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION;
                    InneractiveAdRequest inneractiveAdRequest2 = this.f14299u;
                    C4419j jVar3 = this.f14300v;
                    C5291e c2 = jVar3 == null ? null : jVar3.mo24367c();
                    C4419j jVar4 = this.f14300v;
                    if (jVar4 == null) {
                        jSONArray = null;
                    } else {
                        jSONArray = jVar4.f10915c.mo24342c();
                    }
                    C4569q.C4570a aVar2 = new C4569q.C4570a(c2);
                    aVar2.f11364b = oVar;
                    aVar2.f11363a = inneractiveAdRequest2;
                    aVar2.f11366d = jSONArray;
                    aVar2.mo24767a("video_timeout_in_msecs", String.valueOf(5000)).mo24768a((String) null);
                }
                L l = this.f14285g;
                if (l != null) {
                    ((C5407d.C5413f) l).mo24963a((InneractiveUnitController.AdDisplayError) new MraidVideoFailedToDisplayError("an MRAID video has not started playing in a timely fashion"));
                }
            }
            return true;
        }
    }
}
