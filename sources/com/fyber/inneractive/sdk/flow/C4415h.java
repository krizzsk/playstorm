package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import com.fyber.inneractive.sdk.config.C4261a;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.C4290h;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.measurement.C4459a;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.p192ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.C5292f;
import com.fyber.inneractive.sdk.util.C5334g;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5396a;
import com.fyber.inneractive.sdk.web.C5407d;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.flow.h */
public class C4415h extends C4406c<C5292f, C4437u> {

    /* renamed from: h */
    public IAmraidWebViewController f10908h;

    /* renamed from: i */
    public C5396a.C5402f f10909i = new C4416a();

    /* renamed from: com.fyber.inneractive.sdk.flow.h$b */
    public static /* synthetic */ class C4417b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10911a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10911a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10911a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C4415h.C4417b.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo24566a() {
        IAmraidWebViewController iAmraidWebViewController;
        if (!(this.f10872c == null || (iAmraidWebViewController = this.f10908h) == null)) {
            iAmraidWebViewController.mo26558k();
            this.f10908h.mo26420l();
            this.f10908h = null;
        }
        super.mo24566a();
    }

    /* renamed from: b */
    public String mo24370b() {
        return "send_failed_display_creatives";
    }

    /* renamed from: e */
    public void mo24371e() {
        C5407d.C5411d dVar;
        String str;
        String str2;
        Content uVar = new C4437u(mo24570c(), this.f10875f);
        this.f10872c = uVar;
        C5292f fVar = this.f10871b;
        uVar.f10914b = fVar;
        uVar.f10918f = this.f10876g;
        UnitDisplayType unitDisplayType = fVar.f14079n;
        C5407d.C5414g gVar = C5407d.C5414g.INLINE;
        C4459a aVar = null;
        if (unitDisplayType == null) {
            this.f10909i.mo24590a((C5396a) null, InneractiveErrorCode.SDK_INTERNAL_ERROR);
            return;
        }
        int i = C4417b.f10911a[unitDisplayType.ordinal()];
        boolean z = false;
        if (i == 1 || i == 2) {
            dVar = C5407d.C5411d.ENABLED;
            InneractiveAdRequest inneractiveAdRequest = this.f10870a;
            if (inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen()) {
                gVar = C5407d.C5414g.INTERSTITIAL;
            }
        } else {
            dVar = C5407d.C5411d.ENABLED;
        }
        C5407d.C5414g gVar2 = gVar;
        C5407d.C5411d dVar2 = dVar;
        boolean z2 = !((C5292f) this.f10871b).f14092B.contains("iaNotifyLoadFinished");
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        boolean a = C5334g.m16733a(unitDisplayType, iAConfigManager.f10557v.f10660b);
        try {
            Application application = C5350l.f14216a;
            C5407d.C5415h hVar = C5407d.C5415h.AD_CONTROLLED;
            if (((C4290h) this.f10875f.mo24338a(C4290h.class)).mo24318c()) {
                aVar = iAConfigManager.f10535I;
            }
            IAmraidWebViewController iAmraidWebViewController = new IAmraidWebViewController(application, a, gVar2, dVar2, hVar, z2, aVar);
            this.f10908h = iAmraidWebViewController;
            iAmraidWebViewController.setAdContent(this.f10872c);
            this.f10908h.setAdRequest(this.f10870a);
            InneractiveAdRequest inneractiveAdRequest2 = this.f10870a;
            if (!(inneractiveAdRequest2 == null || inneractiveAdRequest2.getSelectedUnitConfig() == null || ((C4345y) this.f10870a.getSelectedUnitConfig()).f10747c == null)) {
                IAmraidWebViewController iAmraidWebViewController2 = this.f10908h;
                C4437u uVar2 = (C4437u) this.f10872c;
                uVar2.getClass();
                iAmraidWebViewController2.setMuteMraidVideo((iAConfigManager.f10547l || uVar2.f10918f) && ((C4345y) this.f10870a.getSelectedUnitConfig()).f10747c.f10691b != UnitDisplayType.REWARDED);
            }
            ((C4437u) this.f10872c).f10971g = this.f10908h;
            Response response = this.f10871b;
            if (response != null) {
                UnitDisplayType unitDisplayType2 = ((C5292f) response).f14079n;
                InneractiveAdRequest inneractiveAdRequest3 = this.f10870a;
                if (inneractiveAdRequest3 == null || inneractiveAdRequest3.getAllowFullscreen()) {
                    z = true;
                }
                StringBuilder sb = new StringBuilder();
                if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z) {
                    sb.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
                }
                String sb2 = sb.toString();
                str = m13710a(unitDisplayType2);
                str2 = sb2;
            } else {
                str2 = "";
                str = str2;
            }
            this.f10908h.setAutoplayMRAIDVideos(unitDisplayType.isFullscreenUnit());
            this.f10908h.mo26503a(C4261a.m13437a(), "" + ((C5292f) this.f10871b).f14092B, str2, str, this.f10909i, TimeUnit.SECONDS.toMillis((long) iAConfigManager.f10558w.f10665a.f10660b.mo24345a("DisplayAdLoadTimeOutInSeconds", 10, 3)));
        } catch (Throwable th) {
            mo24569a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, th));
        }
    }

    /* renamed from: a */
    public static String m13710a(UnitDisplayType unitDisplayType) {
        StringBuilder sb = new StringBuilder();
        if (unitDisplayType != null && !unitDisplayType.isFullscreenUnit()) {
            if (unitDisplayType == UnitDisplayType.BANNER) {
                sb.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
            } else {
                sb.append(" #iawrapper { position:unset !important; display: unset !important; }");
            }
        }
        return sb.toString();
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.h$a */
    public class C4416a implements C5396a.C5402f {
        public C4416a() {
        }

        /* renamed from: a */
        public void mo24589a(C5396a aVar) {
            C4415h hVar = C4415h.this;
            hVar.getClass();
            IAlog.m16699a("%sweb view returned onReady!", IAlog.m16696a((Object) hVar));
            Response response = C4415h.this.f10871b;
            UnitDisplayType unitDisplayType = response != null ? ((C5292f) response).f14079n : null;
            if (unitDisplayType != null && unitDisplayType.isFullscreenUnit()) {
                C4415h hVar2 = C4415h.this;
                hVar2.getClass();
                try {
                    C4567p pVar = C4567p.EVENT_READY_ON_CLIENT;
                    InneractiveAdRequest inneractiveAdRequest = hVar2.f10870a;
                    Content content = hVar2.f10872c;
                    C4569q.C4570a aVar2 = new C4569q.C4570a(content != null ? (C5292f) ((C4437u) content).f10914b : null);
                    aVar2.f11365c = pVar;
                    aVar2.f11363a = inneractiveAdRequest;
                    aVar2.f11366d = null;
                    aVar2.mo24768a((String) null);
                } catch (Exception unused) {
                }
            }
            C4415h.this.mo24571d();
        }

        /* renamed from: a */
        public void mo24590a(C5396a aVar, InneractiveErrorCode inneractiveErrorCode) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode);
            C4415h.this.mo24568a((InneractiveError) inneractiveInfrastructureError);
            C4415h hVar = C4415h.this;
            hVar.getClass();
            IAlog.m16699a("%sweb view returned onFailedLoading!", IAlog.m16696a((Object) hVar));
            C4415h.this.mo24569a(inneractiveInfrastructureError);
            if (inneractiveErrorCode == InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED) {
                C4565o oVar = C4565o.MRAID_ERROR_UNSECURE_CONTENT;
                C4415h hVar2 = C4415h.this;
                InneractiveAdRequest inneractiveAdRequest = hVar2.f10870a;
                Response response = hVar2.f10871b;
                JSONArray c = hVar2.f10875f.mo24342c();
                C4569q.C4570a aVar2 = new C4569q.C4570a(response);
                aVar2.f11364b = oVar;
                aVar2.f11363a = inneractiveAdRequest;
                aVar2.f11366d = c;
                aVar2.mo24768a((String) null);
            }
        }
    }
}
