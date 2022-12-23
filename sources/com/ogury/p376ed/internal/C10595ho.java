package com.ogury.p376ed.internal;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.ogury.ed.internal.ho */
public final class C10595ho {

    /* renamed from: a */
    public static final C10596a f26725a = new C10596a((byte) 0);

    /* renamed from: b */
    private final C10483eb f26726b;

    /* renamed from: c */
    private final Map<String, C10660jh> f26727c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map<String, C10611hx> f26728d;

    /* renamed from: e */
    private final C10593hm f26729e;

    /* renamed from: f */
    private final C10598hp f26730f;

    /* renamed from: g */
    private final C10615ia f26731g;

    /* renamed from: h */
    private final C10445di f26732h;

    /* renamed from: i */
    private final C10643iv f26733i;

    /* renamed from: j */
    private final C10612hy f26734j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C10599hq f26735k;

    /* renamed from: l */
    private final Pattern f26736l;

    public /* synthetic */ C10595ho(C10483eb ebVar, Map map, Map map2, C10593hm hmVar, C10598hp hpVar, C10615ia iaVar, C10445di diVar, C10643iv ivVar, C10612hy hyVar, byte b) {
        this(ebVar, map, map2, hmVar, hpVar, iaVar, diVar, ivVar, hyVar);
    }

    private C10595ho(C10483eb ebVar, Map<String, C10660jh> map, Map<String, C10611hx> map2, C10593hm hmVar, C10598hp hpVar, C10615ia iaVar, C10445di diVar, C10643iv ivVar, C10612hy hyVar) {
        this.f26726b = ebVar;
        this.f26727c = map;
        this.f26728d = map2;
        this.f26729e = hmVar;
        this.f26730f = hpVar;
        this.f26731g = iaVar;
        this.f26732h = diVar;
        this.f26733i = ivVar;
        this.f26734j = hyVar;
        this.f26736l = Pattern.compile(ebVar.mo67241i());
    }

    /* renamed from: com.ogury.ed.internal.ho$a */
    public static final class C10596a {
        public /* synthetic */ C10596a(byte b) {
            this();
        }

        private C10596a() {
        }

        /* renamed from: a */
        public static C10595ho m32254a(Context context, C10483eb ebVar, FrameLayout frameLayout, C10643iv ivVar) {
            C10765mq.m32773b(context, "context");
            C10765mq.m32773b(ebVar, "ad");
            C10765mq.m32773b(frameLayout, "activityRoot");
            C10765mq.m32773b(ivVar, "mraidHandlersFactory");
            Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
            C10765mq.m32770a((Object) synchronizedMap, "synchronizedMap(mutableMapOf())");
            Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
            C10765mq.m32770a((Object) synchronizedMap2, "synchronizedMap(mutableMapOf())");
            C10593hm hmVar = new C10593hm(context, frameLayout, ebVar);
            C10598hp hpVar = new C10598hp(synchronizedMap, synchronizedMap2);
            C10483eb ebVar2 = ebVar;
            C10598hp hpVar2 = hpVar;
            C10595ho hoVar = new C10595ho(ebVar2, synchronizedMap, synchronizedMap2, hmVar, hpVar2, new C10615ia(context, hpVar), C10445di.f26411a, ivVar, new C10612hy(context, hpVar), (byte) 0);
            hoVar.f26735k = new C10599hq(hoVar, hpVar);
            return hoVar;
        }
    }

    /* renamed from: a */
    public final void mo67549a(C10729lj<C10684ke> ljVar) {
        C10765mq.m32773b(ljVar, "newWebViewCreatedCallback");
        C10599hq hqVar = this.f26735k;
        if (hqVar == null) {
            C10765mq.m32771a("multiWebViewUrlHandler");
            hqVar = null;
        }
        hqVar.mo67568a(ljVar);
    }

    /* renamed from: b */
    public final void mo67553b(C10729lj<C10684ke> ljVar) {
        C10765mq.m32773b(ljVar, "newForceCloseCallback");
        if (C10494el.m31816b(this.f26726b)) {
            C10599hq hqVar = this.f26735k;
            if (hqVar == null) {
                C10765mq.m32771a("multiWebViewUrlHandler");
                hqVar = null;
            }
            hqVar.mo67569b(ljVar);
        }
    }

    /* renamed from: a */
    public final C10589hj mo67547a() {
        C10599hq hqVar = this.f26735k;
        if (hqVar == null) {
            C10765mq.m32771a("multiWebViewUrlHandler");
            hqVar = null;
        }
        return hqVar;
    }

    /* renamed from: b */
    public final boolean mo67555b() {
        return this.f26730f.mo67567d();
    }

    /* renamed from: a */
    public final void mo67548a(C10608hv hvVar) {
        C10765mq.m32773b(hvVar, "webViewArgs");
        C10660jh a = this.f26729e.mo67545a(hvVar);
        if (a != null) {
            this.f26727c.put(hvVar.mo67585c(), a);
            this.f26728d.put(hvVar.mo67585c(), new C10611hx(hvVar.mo67594h(), hvVar.mo67595i(), hvVar.mo67577a(), false, 56));
            m32239a(a);
            WebView webView = a;
            C10566gr.m32110d(webView);
            if (hvVar.mo67596j()) {
                C10566gr.m32105a(webView);
                a.getSettings().setCacheMode(1);
            }
            m32238a(hvVar, webView);
        }
    }

    /* renamed from: a */
    private final void m32238a(C10608hv hvVar, WebView webView) {
        if (hvVar.mo67577a().length() > 0) {
            webView.loadUrl(hvVar.mo67577a());
        } else {
            webView.loadDataWithBaseURL(this.f26726b.mo67239h(), hvVar.mo67581b(), "text/html", "UTF-8", (String) null);
        }
    }

    /* renamed from: a */
    public final void mo67551a(String str, C10660jh jhVar, boolean z) {
        C10765mq.m32773b(str, "webViewName");
        C10765mq.m32773b(jhVar, "webView");
        jhVar.setTag(str);
        this.f26727c.put(str, jhVar);
        this.f26728d.put(str, new C10611hx(false, z, "", true, 48));
    }

    /* renamed from: b */
    public final void mo67552b(C10608hv hvVar) {
        C10765mq.m32773b(hvVar, "webViewArgs");
        C10660jh jhVar = this.f26727c.get(hvVar.mo67585c());
        if (jhVar != null) {
            WebView webView = jhVar;
            C10593hm.m32222a(webView, hvVar);
            boolean z = true;
            if (!(hvVar.mo67577a().length() > 0)) {
                if (hvVar.mo67581b().length() <= 0) {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
            m32238a(hvVar, webView);
        }
    }

    /* renamed from: a */
    public final void mo67550a(String str) {
        C10765mq.m32773b(str, "webViewName");
        C10660jh jhVar = this.f26727c.get(str);
        if (jhVar != null) {
            this.f26729e.mo67546a((WebView) jhVar);
        }
        this.f26727c.remove(str);
        this.f26728d.remove(str);
    }

    /* renamed from: a */
    private final void m32239a(C10660jh jhVar) {
        C10589hj[] hjVarArr = new C10589hj[2];
        C10599hq hqVar = this.f26735k;
        if (hqVar == null) {
            C10765mq.m32771a("multiWebViewUrlHandler");
            hqVar = null;
        }
        hjVarArr[0] = hqVar;
        hjVarArr[1] = this.f26733i.mo67656a(jhVar);
        jhVar.setMraidUrlHandler(new C10641iu(hjVarArr));
        jhVar.setClientAdapter(new C10597b(this, jhVar));
    }

    /* renamed from: com.ogury.ed.internal.ho$b */
    public static final class C10597b extends C10661ji {

        /* renamed from: a */
        final /* synthetic */ C10595ho f26737a;

        /* renamed from: b */
        final /* synthetic */ C10660jh f26738b;

        /* renamed from: c */
        private String f26739c = "";

        /* renamed from: d */
        private boolean f26740d;

        /* renamed from: d */
        public final boolean mo67562d(WebView webView, String str) {
            C10765mq.m32773b(webView, "view");
            C10765mq.m32773b(str, "url");
            return false;
        }

        C10597b(C10595ho hoVar, C10660jh jhVar) {
            this.f26737a = hoVar;
            this.f26738b = jhVar;
        }

        /* renamed from: a */
        public final void mo67559a(WebView webView, String str) {
            C10765mq.m32773b(webView, "webView");
            C10765mq.m32773b(str, "url");
            this.f26739c = str;
            this.f26740d = true;
            this.f26737a.m32231a(webView, str);
        }

        /* renamed from: b */
        public final void mo67560b(WebView webView, String str) {
            C10765mq.m32773b(webView, "webView");
            C10765mq.m32773b(str, "url");
            this.f26737a.m32233a(webView, str, this.f26740d);
            this.f26740d = false;
        }

        /* renamed from: c */
        public final void mo67561c(WebView webView, String str) {
            C10765mq.m32773b(webView, "view");
            C10765mq.m32773b(str, "url");
            this.f26737a.m32232a(webView, this.f26739c, str);
        }

        /* renamed from: a */
        public final void mo67079a(WebView webView) {
            C10765mq.m32773b(webView, "webView");
            C10611hx hxVar = (C10611hx) this.f26737a.f26728d.get(C10594hn.m32229b(webView));
            if (hxVar != null) {
                hxVar.mo67601e();
            }
            this.f26738b.mo67690c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m32231a(WebView webView, String str) {
        this.f26730f.mo67564a("started", m32241f(), m32240e(), C10594hn.m32229b(webView), str, "");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m32233a(WebView webView, String str, boolean z) {
        C10598hp hpVar = this.f26730f;
        boolean f = m32241f();
        boolean e = m32240e();
        String b = C10594hn.m32229b(webView);
        String title = webView.getTitle();
        C10765mq.m32770a((Object) title, "webView.title");
        hpVar.mo67564a("finished", f, e, b, str, title);
        C10611hx hxVar = this.f26728d.get(C10594hn.m32229b(webView));
        if (hxVar != null) {
            boolean z2 = true;
            boolean z3 = (!hxVar.mo67602f() || !C10765mq.m32772a((Object) hxVar.mo67599c(), (Object) str)) && hxVar.mo67597a();
            if (z && z3) {
                if (this.f26726b.mo67241i().length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    C10445di.m31608a((C10444dh) new C10443dg(this.f26726b, str, "format", (String) null, (String) null));
                }
            }
            hxVar.mo67603g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m32232a(WebView webView, String str, String str2) {
        C10611hx hxVar = this.f26728d.get(C10594hn.m32229b(webView));
        if (hxVar != null && !hxVar.mo67604h()) {
            if ((this.f26726b.mo67241i().length() > 0) && this.f26736l.matcher(str2).matches()) {
                C10483eb ebVar = this.f26726b;
                C10445di.m31608a((C10444dh) new C10443dg(ebVar, str, "format", ebVar.mo67241i(), str2));
                hxVar.mo67605i();
            }
        }
    }

    /* renamed from: c */
    public final void mo67556c() {
        for (C10660jh next : this.f26727c.values()) {
            if (next.canGoBack()) {
                next.goBack();
            }
        }
    }

    /* renamed from: d */
    public final void mo67558d() {
        this.f26730f.mo67563a();
        this.f26731g.mo67611a();
        this.f26734j.mo67606a();
        C10599hq hqVar = this.f26735k;
        if (hqVar == null) {
            C10765mq.m32771a("multiWebViewUrlHandler");
            hqVar = null;
        }
        hqVar.mo67568a((C10729lj<C10684ke>) null);
    }

    /* renamed from: e */
    private final boolean m32240e() {
        for (C10660jh canGoBack : this.f26727c.values()) {
            if (canGoBack.canGoBack()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private final boolean m32241f() {
        for (C10660jh canGoForward : this.f26727c.values()) {
            if (canGoForward.canGoForward()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo67554b(String str) {
        C10765mq.m32773b(str, "webViewName");
        C10660jh jhVar = this.f26727c.get(str);
        if (jhVar != null && jhVar.canGoBack()) {
            jhVar.goBack();
        }
    }

    /* renamed from: c */
    public final void mo67557c(String str) {
        C10765mq.m32773b(str, "webViewName");
        C10660jh jhVar = this.f26727c.get(str);
        if (jhVar != null && jhVar.canGoForward()) {
            jhVar.goForward();
        }
    }
}
