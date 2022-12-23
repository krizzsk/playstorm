package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.C4167R;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.model.vast.C4478b;
import com.fyber.inneractive.sdk.model.vast.C4479c;
import com.fyber.inneractive.sdk.model.vast.C4483g;
import com.fyber.inneractive.sdk.model.vast.C4484h;
import com.fyber.inneractive.sdk.network.C4531b;
import com.fyber.inneractive.sdk.network.C4552j0;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.network.C4579u;
import com.fyber.inneractive.sdk.player.controller.C4633c;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.response.C5293g;
import com.fyber.inneractive.sdk.util.C5382v0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5396a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.UnknownHostException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.g */
public class C4412g {

    /* renamed from: a */
    public int f10887a = 2;

    /* renamed from: b */
    public final InneractiveAdRequest f10888b;

    /* renamed from: c */
    public final C5293g f10889c;

    /* renamed from: d */
    public C4309s f10890d;

    /* renamed from: e */
    public C4478b f10891e;

    /* renamed from: f */
    public boolean f10892f = false;

    /* renamed from: g */
    public View f10893g = null;

    /* renamed from: h */
    public Context f10894h;

    /* renamed from: i */
    public C4633c f10895i;

    /* renamed from: j */
    public boolean f10896j;

    /* renamed from: k */
    public C4552j0 f10897k;

    /* renamed from: l */
    public UnitDisplayType f10898l;

    /* renamed from: m */
    public boolean f10899m;

    /* renamed from: n */
    public int f10900n;

    /* renamed from: o */
    public int f10901o;

    /* renamed from: p */
    public C4346z f10902p;

    /* renamed from: q */
    public int f10903q;

    /* renamed from: com.fyber.inneractive.sdk.flow.g$a */
    public class C4413a implements C5396a.C5402f {

        /* renamed from: a */
        public final /* synthetic */ C4479c f10904a;

        public C4413a(C4479c cVar) {
            this.f10904a = cVar;
        }

        /* renamed from: a */
        public void mo24589a(C5396a aVar) {
            boolean unused = C4412g.this.f10892f = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0061  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo24590a(com.fyber.inneractive.sdk.web.C5396a r7, com.fyber.inneractive.sdk.external.InneractiveErrorCode r8) {
            /*
                r6 = this;
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                com.fyber.inneractive.sdk.flow.g r8 = com.fyber.inneractive.sdk.flow.C4412g.this
                java.lang.String r8 = com.fyber.inneractive.sdk.util.IAlog.m16696a((java.lang.Object) r8)
                r7.append(r8)
                java.lang.String r8 = " Fetching companion html failed!"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 0
                java.lang.Object[] r0 = new java.lang.Object[r8]
                com.fyber.inneractive.sdk.util.IAlog.m16699a(r7, r0)
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.C4412g.this
                boolean unused = r7.f10892f = r8
                com.fyber.inneractive.sdk.model.vast.h r7 = com.fyber.inneractive.sdk.model.vast.C4484h.Gif
                com.fyber.inneractive.sdk.model.vast.c r0 = r6.f10904a
                com.fyber.inneractive.sdk.model.vast.h r0 = r0.f11070b
                boolean r7 = r7.equals(r0)
                r0 = 1
                if (r7 == 0) goto L_0x003e
                com.fyber.inneractive.sdk.model.vast.c r7 = r6.f10904a
                java.lang.String r1 = r7.f11074f
                com.fyber.inneractive.sdk.model.vast.h r7 = r7.f11070b
                boolean r7 = com.fyber.inneractive.sdk.util.C5382v0.m16801a(r1, r7)
                if (r7 == 0) goto L_0x003c
                goto L_0x003e
            L_0x003c:
                r7 = r8
                goto L_0x003f
            L_0x003e:
                r7 = r0
            L_0x003f:
                com.fyber.inneractive.sdk.flow.g r1 = com.fyber.inneractive.sdk.flow.C4412g.this
                int r2 = r1.f10903q
                int r3 = r1.f10887a
                if (r2 > r3) goto L_0x005e
                if (r7 == 0) goto L_0x005e
                java.lang.Object[] r7 = new java.lang.Object[r0]
                java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.m16696a((java.lang.Object) r6)
                r7[r8] = r0
                java.lang.String r8 = "%sloadHtmlCompanion retry"
                com.fyber.inneractive.sdk.util.IAlog.m16699a(r8, r7)
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.C4412g.this
                com.fyber.inneractive.sdk.model.vast.c r8 = r6.f10904a
                r7.mo24586a(r8)
                goto L_0x00ad
            L_0x005e:
                r2 = 0
                if (r7 != 0) goto L_0x0075
                com.fyber.inneractive.sdk.network.q$a r7 = new com.fyber.inneractive.sdk.network.q$a
                com.fyber.inneractive.sdk.network.o r3 = com.fyber.inneractive.sdk.network.C4565o.VAST_COMPANION_INCOMPATIBLE_MIMETYPE
                com.fyber.inneractive.sdk.external.InneractiveAdRequest r4 = r1.f10888b
                com.fyber.inneractive.sdk.response.g r1 = r1.f10889c
                r7.<init>(r1)
                r7.f11364b = r3
                r7.f11363a = r4
                r7.f11366d = r2
                r7.mo24768a((java.lang.String) r2)
            L_0x0075:
                com.fyber.inneractive.sdk.network.q$a r7 = new com.fyber.inneractive.sdk.network.q$a
                com.fyber.inneractive.sdk.network.o r1 = com.fyber.inneractive.sdk.network.C4565o.VAST_COMPANION_FAILED_LOADING
                com.fyber.inneractive.sdk.flow.g r3 = com.fyber.inneractive.sdk.flow.C4412g.this
                com.fyber.inneractive.sdk.external.InneractiveAdRequest r4 = r3.f10888b
                com.fyber.inneractive.sdk.response.g r5 = r3.f10889c
                com.fyber.inneractive.sdk.config.global.s r3 = r3.f10890d
                org.json.JSONArray r3 = r3.mo24342c()
                r7.<init>(r5)
                r7.f11364b = r1
                r7.f11363a = r4
                r7.f11366d = r3
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r3 = "companion_data"
                r1[r8] = r3
                com.fyber.inneractive.sdk.model.vast.c r3 = r6.f10904a
                org.json.JSONObject r3 = r3.mo24687a()
                r1[r0] = r3
                r7.mo24767a((java.lang.Object[]) r1)
                r7.mo24768a((java.lang.String) r2)
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.C4412g.this
                boolean unused = r7.f10892f = r8
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.C4412g.this
                r7.mo24585a()
            L_0x00ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C4412g.C4413a.mo24590a(com.fyber.inneractive.sdk.web.a, com.fyber.inneractive.sdk.external.InneractiveErrorCode):void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.g$b */
    public class C4414b implements C4579u<C4552j0.C4553a> {

        /* renamed from: a */
        public final /* synthetic */ C4479c f10906a;

        public C4414b(C4479c cVar) {
            this.f10906a = cVar;
        }

        /* renamed from: a */
        public void mo24228a(Object obj, Exception exc, boolean z) {
            View view;
            C4552j0.C4553a aVar = (C4552j0.C4553a) obj;
            C4412g.this.f10893g = new ImageView(C4412g.this.f10894h);
            C4412g.this.f10893g.setId(C4167R.C4169id.inneractive_vast_endcard_static);
            C4412g.this.f10893g.setContentDescription("inneractive_vast_endcard_static");
            if (exc == null && aVar != null && aVar.f11250b == null) {
                Bitmap bitmap = aVar.f11249a;
                if (bitmap != null && (view = C4412g.this.f10893g) != null) {
                    ((ImageView) view).setImageBitmap(bitmap);
                    boolean unused = C4412g.this.f10892f = true;
                    return;
                }
                return;
            }
            IAlog.m16699a("%s Fetching companion image failed!", IAlog.m16696a((Object) C4412g.this));
            C4479c cVar = this.f10906a;
            boolean a = C5382v0.m16801a(cVar.f11074f, cVar.f11070b);
            if ((aVar == null || (aVar.f11250b != null && ((exc instanceof C4531b) || (exc instanceof UnknownHostException)))) && a) {
                C4412g gVar = C4412g.this;
                if (gVar.f10903q <= gVar.f10887a) {
                    IAlog.m16699a("%sloadStaticCompanion retry", IAlog.m16696a((Object) this));
                    C4412g.this.mo24588b(this.f10906a);
                    return;
                }
            }
            if (!a) {
                C4412g gVar2 = C4412g.this;
                gVar2.getClass();
                new C4569q.C4570a(C4565o.VAST_COMPANION_INCOMPATIBLE_MIMETYPE, gVar2.f10888b, (C5291e) gVar2.f10889c, (JSONArray) null).mo24768a((String) null);
            }
            C4565o oVar = C4565o.VAST_COMPANION_FAILED_LOADING;
            C4412g gVar3 = C4412g.this;
            C4569q.C4570a aVar2 = new C4569q.C4570a(oVar, gVar3.f10888b, (C5291e) gVar3.f10889c, (JSONArray) null);
            JSONObject jSONObject = new JSONObject();
            JSONObject a2 = this.f10906a.mo24687a();
            try {
                jSONObject.put("companion_data", a2);
            } catch (Exception unused2) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "companion_data", a2);
            }
            if (aVar != null && !TextUtils.isEmpty(aVar.f11250b)) {
                String str = aVar.f11250b;
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
                } catch (Exception unused3) {
                    IAlog.m16703e("Got exception adding param to json object: %s, %s", IronSourceConstants.EVENTS_ERROR_REASON, str);
                }
            }
            aVar2.f11368f.put(jSONObject);
            aVar2.mo24768a((String) null);
            C4412g.this.mo24585a();
        }
    }

    public C4412g(Context context, C5293g gVar, InneractiveAdRequest inneractiveAdRequest, C4309s sVar) {
        this.f10891e = gVar.mo26393f();
        this.f10894h = context;
        this.f10889c = gVar;
        this.f10888b = inneractiveAdRequest;
        this.f10890d = sVar;
        this.f10887a = IAConfigManager.m13429b().mo24350a().mo24345a("companion_retry_count", 2, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0110  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24586a(com.fyber.inneractive.sdk.model.vast.C4479c r15) {
        /*
            r14 = this;
            com.fyber.inneractive.sdk.factories.b r0 = com.fyber.inneractive.sdk.factories.C4397b.C4398a.f10858a
            com.fyber.inneractive.sdk.response.a r1 = com.fyber.inneractive.sdk.response.C5287a.RETURNED_ADTYPE_HTML
            java.util.HashMap<com.fyber.inneractive.sdk.response.a, com.fyber.inneractive.sdk.factories.b$b> r0 = r0.f10857a
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            r14.mo24587b()
            int r0 = r14.f10903q
            r1 = 1
            int r0 = r0 + r1
            r14.f10903q = r0
            int r0 = com.fyber.inneractive.sdk.util.IAlog.f14137a
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "COMPANION_TYPE"
            r3 = 0
            r0[r3] = r2
            com.fyber.inneractive.sdk.model.vast.g r2 = r15.f11069a
            java.lang.String r2 = r2.name()
            r0[r1] = r2
            r2 = 0
            java.lang.String r4 = "%s: %s"
            com.fyber.inneractive.sdk.util.IAlog.m16697a(r1, r2, r4, r0)
            com.fyber.inneractive.sdk.player.controller.c r0 = new com.fyber.inneractive.sdk.player.controller.c
            android.content.Context r6 = r14.f10894h
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r7 = r14.f10898l
            boolean r8 = r14.f10899m
            int r9 = r14.f10900n
            int r10 = r14.f10901o
            com.fyber.inneractive.sdk.config.z r11 = r14.f10902p
            com.fyber.inneractive.sdk.model.vast.g r12 = r15.f11069a
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r14.f10895i = r0
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r4 = r0.f11546a
            if (r4 != 0) goto L_0x004a
            r5 = r2
            goto L_0x004c
        L_0x004a:
            com.fyber.inneractive.sdk.web.c r5 = r4.f14280b
        L_0x004c:
            r14.f10893g = r5
            com.fyber.inneractive.sdk.flow.g$a r11 = new com.fyber.inneractive.sdk.flow.g$a
            r11.<init>(r15)
            java.lang.String r5 = r15.f11074f
            com.fyber.inneractive.sdk.model.vast.g r6 = r15.f11069a
            com.fyber.inneractive.sdk.model.vast.g r7 = com.fyber.inneractive.sdk.model.vast.C4483g.Iframe
            java.lang.String r8 = "$__IMGSRC__$"
            if (r6 != r7) goto L_0x0079
            java.lang.String r1 = "fyb_iframe_endcard_tmpl.html"
            java.lang.String r1 = com.fyber.inneractive.sdk.util.C5350l.m16766c((java.lang.String) r1)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x00c7
            java.lang.String r4 = r15.f11074f
            java.lang.String r1 = r1.replace(r8, r4)
            java.lang.String r15 = r15.f11074f
            java.lang.String r4 = "$__SrcIframeUrl__$"
            java.lang.String r15 = r1.replace(r4, r15)
        L_0x0077:
            r8 = r15
            goto L_0x00c8
        L_0x0079:
            com.fyber.inneractive.sdk.model.vast.g r7 = com.fyber.inneractive.sdk.model.vast.C4483g.Static
            if (r6 != r7) goto L_0x00c7
            com.fyber.inneractive.sdk.model.vast.h r6 = r15.f11070b
            com.fyber.inneractive.sdk.model.vast.h r7 = com.fyber.inneractive.sdk.model.vast.C4484h.Gif
            if (r6 != r7) goto L_0x00c7
            if (r4 == 0) goto L_0x009a
            com.fyber.inneractive.sdk.web.c r4 = r4.f14280b
            android.webkit.WebSettings r4 = r4.getSettings()
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 17
            if (r6 < r7) goto L_0x0094
            r4.setMediaPlaybackRequiresUserGesture(r3)
        L_0x0094:
            r4.setLoadWithOverviewMode(r1)
            r4.setUseWideViewPort(r1)
        L_0x009a:
            com.fyber.inneractive.sdk.player.controller.c r1 = r14.f10895i
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r1 = r1.f11546a
            if (r1 == 0) goto L_0x00a2
            r1.f14118Y = r3
        L_0x00a2:
            java.lang.String r1 = "fyb_static_endcard_tmpl.html"
            java.lang.String r1 = com.fyber.inneractive.sdk.util.C5350l.m16766c((java.lang.String) r1)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x00b4
            java.lang.String r4 = r15.f11074f
            java.lang.String r5 = r1.replace(r8, r4)
        L_0x00b4:
            java.lang.String r15 = r15.f11075g
            if (r15 == 0) goto L_0x00c7
            java.lang.String r1 = "\""
            java.lang.String r4 = "\\\""
            java.lang.String r15 = r15.replace(r1, r4)
            java.lang.String r1 = "$__IMGHREF__$"
            java.lang.String r15 = r5.replace(r1, r15)
            goto L_0x0077
        L_0x00c7:
            r8 = r5
        L_0x00c8:
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r15 = r0.f11546a
            if (r15 == 0) goto L_0x0110
            boolean r15 = android.text.TextUtils.isEmpty(r8)
            if (r15 != 0) goto L_0x0110
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r15 = r0.f11546a
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r0.f11548c
            boolean r1 = r1.isFullscreenUnit()
            r15.setAutoplayMRAIDVideos(r1)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r15 = r0.f11546a
            r15.setCenteringTagsRequired(r3)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r6 = r0.f11546a
            java.lang.String r7 = com.fyber.inneractive.sdk.config.C4261a.m13437a()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r15 = r0.f11548c
            boolean r1 = r0.f11550e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r15 == 0) goto L_0x0100
            boolean r15 = r15.isFullscreenUnit()
            if (r15 == 0) goto L_0x0100
            if (r1 != 0) goto L_0x0100
            java.lang.String r15 = "<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>"
            r2.append(r15)
        L_0x0100:
            java.lang.String r9 = r2.toString()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r15 = r0.f11548c
            java.lang.String r10 = com.fyber.inneractive.sdk.flow.C4415h.m13710a(r15)
            r12 = 10000(0x2710, double:4.9407E-320)
            r6.mo26503a(r7, r8, r9, r10, r11, r12)
            goto L_0x0115
        L_0x0110:
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r15 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSPECIFIED
            r11.mo24590a(r2, r15)
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C4412g.mo24586a(com.fyber.inneractive.sdk.model.vast.c):void");
    }

    /* renamed from: b */
    public final void mo24587b() {
        C4567p pVar = C4567p.VAST_COMPANION_LOAD_ATTEMPT;
        InneractiveAdRequest inneractiveAdRequest = this.f10888b;
        C5293g gVar = this.f10889c;
        C4309s sVar = this.f10890d;
        JSONArray c = sVar == null ? null : sVar.mo24342c();
        C4569q.C4570a aVar = new C4569q.C4570a(gVar);
        aVar.f11365c = pVar;
        aVar.f11363a = inneractiveAdRequest;
        aVar.f11366d = c;
        aVar.mo24768a((String) null);
    }

    /* renamed from: b */
    public final void mo24588b(C4479c cVar) {
        mo24587b();
        int i = IAlog.f14137a;
        IAlog.m16697a(1, (Exception) null, "%s: %s", "COMPANION_TYPE", cVar.f11069a.name());
        this.f10903q++;
        C4552j0 j0Var = new C4552j0(new C4414b(cVar), cVar.f11074f);
        this.f10897k = j0Var;
        IAConfigManager.f10525J.f10555t.mo24781c(j0Var);
    }

    /* renamed from: a */
    public void mo24585a() {
        boolean z;
        if (!this.f10892f) {
            IAlog.m16699a("%sloadNextVastCompanion called", IAlog.m16696a((Object) this));
            this.f10896j = false;
            this.f10893g = null;
            if (this.f10891e == null) {
                IAlog.m16699a("%svast data is null! Object must have already been destroyed", IAlog.m16696a((Object) this));
                z = false;
            } else {
                z = true;
            }
            if (this.f10891e.f11065f.size() == 0) {
                IAlog.m16700b("%sgetNextIAvastCompanion - No companion ads found", IAlog.m16696a((Object) this));
                z = false;
            }
            if (!z) {
                IAlog.m16699a("%sno more companion ads available.", IAlog.m16696a((Object) this));
                return;
            }
            C4478b bVar = this.f10891e;
            C4479c poll = bVar.f11065f.poll();
            bVar.f11066g = poll;
            IAlog.m16699a("%sgetNextIAvastCompanion returning: %s", IAlog.m16696a((Object) this), poll);
            this.f10903q = 0;
            if (poll == null) {
                return;
            }
            if (poll.f11069a != C4483g.Static || C4484h.Gif.equals(poll.f11070b)) {
                mo24586a(poll);
            } else {
                mo24588b(poll);
            }
        }
    }
}
