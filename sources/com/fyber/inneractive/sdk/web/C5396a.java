package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.measurement.C4459a;
import com.fyber.inneractive.sdk.measurement.C4463d;
import com.fyber.inneractive.sdk.p192ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C5320d0;
import com.fyber.inneractive.sdk.util.C5328f0;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.C5368r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5405c;
import com.fyber.inneractive.sdk.web.C5407d;
import com.fyber.inneractive.sdk.web.C5429o;
import com.fyber.inneractive.sdk.web.C5436u;
import com.iab.omid.library.fyber.ScriptInjector;

/* renamed from: com.fyber.inneractive.sdk.web.a */
public abstract class C5396a<L extends C5436u> implements C5404b, C5328f0.C5333e, C5405c.C5406a, C5429o.C5430a {

    /* renamed from: a */
    public boolean f14279a = false;

    /* renamed from: b */
    public C5405c f14280b;

    /* renamed from: c */
    public C5427m f14281c;

    /* renamed from: d */
    public C5428n f14282d;

    /* renamed from: e */
    public boolean f14283e;

    /* renamed from: f */
    public C5402f f14284f;

    /* renamed from: g */
    public L f14285g;

    /* renamed from: h */
    public float f14286h = 0.0f;

    /* renamed from: i */
    public Rect f14287i = new Rect();

    /* renamed from: j */
    public boolean f14288j;

    /* renamed from: k */
    public boolean f14289k;

    /* renamed from: l */
    public C5401e f14290l;

    /* renamed from: m */
    public final Runnable f14291m;

    /* renamed from: n */
    public final Runnable f14292n;

    /* renamed from: o */
    public Runnable f14293o;

    /* renamed from: p */
    public long f14294p;

    /* renamed from: q */
    public long f14295q;

    /* renamed from: r */
    public AsyncTask<Void, Void, String> f14296r;

    /* renamed from: s */
    public String f14297s;

    /* renamed from: t */
    public String f14298t;

    /* renamed from: u */
    public InneractiveAdRequest f14299u;

    /* renamed from: v */
    public C4419j f14300v;

    /* renamed from: com.fyber.inneractive.sdk.web.a$a */
    public class C5397a implements Runnable {
        public C5397a() {
        }

        public void run() {
            IAlog.m16702d("Removing clicked state after timeout", new Object[0]);
            C5396a.this.mo26508d();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$b */
    public class C5398b implements Runnable {
        public C5398b() {
        }

        public void run() {
            C5396a aVar = C5396a.this;
            if (aVar.f14289k) {
                IAlog.m16699a("No user web action detected for : %s blocking.", aVar.f14290l);
                C5396a aVar2 = C5396a.this;
                String c = aVar2.f14290l.mo26520c();
                String a = C5396a.this.f14290l.mo26518a();
                L l = aVar2.f14285g;
                if (l != null) {
                    l.mo24968a(c, a);
                }
                int i = IAlog.f14137a;
                IAlog.m16697a(1, (Exception) null, "AD_AUTO_CLICK_DETECTED", new Object[0]);
                C5396a.this.f14290l.mo26519b();
                C5396a.this.mo26508d();
            } else {
                IAlog.m16699a("User web action detected for: %s", aVar.f14290l);
                C5396a.this.f14290l.mo26521d();
            }
            C5396a.this.f14290l = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$c */
    public class C5399c extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        public final /* synthetic */ String f14303a;

        /* renamed from: b */
        public final /* synthetic */ String f14304b;

        /* renamed from: c */
        public final /* synthetic */ String f14305c;

        /* renamed from: d */
        public final /* synthetic */ String f14306d;

        public C5399c(String str, String str2, String str3, String str4) {
            this.f14303a = str;
            this.f14304b = str2;
            this.f14305c = str3;
            this.f14306d = str4;
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            long currentTimeMillis = System.currentTimeMillis();
            C5396a aVar = C5396a.this;
            String str = this.f14303a;
            String str2 = this.f14304b;
            String str3 = this.f14305c;
            IAmraidWebViewController iAmraidWebViewController = (IAmraidWebViewController) aVar;
            iAmraidWebViewController.getClass();
            System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            String str4 = null;
            if (TextUtils.isEmpty(str)) {
                IAlog.m16699a("loadHtml called with an empty HTML!", new Object[0]);
            } else {
                sb.append("<html><head>");
                sb.append("<link rel=\"icon\" href=\"data:,\">");
                if (iAmraidWebViewController.f14118Y) {
                    String c = C5350l.m16766c("ia_js_load_monitor.txt");
                    if (!TextUtils.isEmpty(c)) {
                        sb.append(c);
                    }
                }
                sb.append("<script> window.iaPreCachedAd = true; </script>");
                IAConfigManager iAConfigManager = IAConfigManager.f10525J;
                boolean a = iAConfigManager.f10557v.f10660b.mo24347a("use_js_inline", false);
                if (!a || iAConfigManager.f10532F.f10486b == null) {
                    sb.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/MRAID-VIDEO.js\"></script>");
                } else {
                    sb.append("<script type=\"text/javascript\">");
                    sb.append(iAConfigManager.f10532F.f10486b);
                    sb.append("</script>");
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                }
                sb.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script>");
                sb.append("</head>");
                sb.append("<style>body{text-align:center !important;margin:0;padding:0;}");
                if (!TextUtils.isEmpty(str3)) {
                    sb.append(str3);
                }
                sb.append("</style>");
                sb.append("<body id=\"iaBody\">");
                if (iAmraidWebViewController.f14122c0) {
                    C5407d.C5414g gVar = iAmraidWebViewController.f14321B;
                    if (gVar != null && gVar.equals(C5407d.C5414g.INTERSTITIAL)) {
                        if (!a || iAConfigManager.f10532F.f10487c == null) {
                            sb.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                        } else {
                            sb.append("<style type=\"text/css\">");
                            sb.append(iAConfigManager.f10532F.f10487c);
                            sb.append("</style>");
                        }
                        if (!a || iAConfigManager.f10532F.f10488d == null) {
                            sb.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                        } else {
                            sb.append("<script type=\"text/javascript\">");
                            sb.append(iAConfigManager.f10532F.f10488d);
                            sb.append("</script>");
                        }
                    }
                }
                String c2 = C5350l.m16766c("ia_mraid_bridge.txt");
                if (!TextUtils.isEmpty(c2)) {
                    sb.append("<div id='iaScriptBr' style='display:none;'>");
                    sb.append(c2);
                    sb.append("</div>");
                    if (IAlog.f14137a >= 2) {
                        sb.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                    }
                }
                sb.append(str);
                sb.append("</body></html>");
                C4459a aVar2 = iAmraidWebViewController.f14343w;
                if (aVar2 != null) {
                    str4 = sb.toString();
                    C4463d dVar = (C4463d) aVar2;
                    if (!TextUtils.isEmpty(dVar.f11004b)) {
                        str4 = ScriptInjector.injectScriptContentIntoHtml(dVar.f11004b, str4);
                    }
                } else {
                    str4 = sb.toString();
                }
            }
            C5396a aVar3 = C5396a.this;
            aVar3.getClass();
            IAlog.m16699a("%sbuild html string took %d msec", IAlog.m16696a((Object) aVar3), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return str4;
        }

        public void onPostExecute(Object obj) {
            String str = (String) obj;
            String str2 = C5368r.m16780a() ? "http://" : "https://";
            if (!TextUtils.isEmpty(str) && !isCancelled()) {
                C5396a.this.f14296r = null;
                if (!TextUtils.isEmpty(this.f14306d)) {
                    C5396a aVar = C5396a.this;
                    aVar.f14297s = str2 + this.f14306d;
                } else {
                    C5396a aVar2 = C5396a.this;
                    aVar2.f14297s = str2 + "wv.inner-active.mobi/";
                }
                C5396a aVar3 = C5396a.this;
                C5405c cVar = aVar3.f14280b;
                if (cVar != null) {
                    cVar.loadDataWithBaseURL(aVar3.f14297s, str, "text/html", "utf-8", (String) null);
                    C5396a.this.f14298t = str;
                    return;
                }
                InneractiveErrorCode inneractiveErrorCode = InneractiveErrorCode.SDK_INTERNAL_ERROR;
                C5402f fVar = aVar3.f14284f;
                if (fVar != null) {
                    fVar.mo24590a(aVar3, inneractiveErrorCode);
                }
                aVar3.mo26504a(true);
            } else if (!isCancelled()) {
                C5396a aVar4 = C5396a.this;
                InneractiveErrorCode inneractiveErrorCode2 = InneractiveErrorCode.SDK_INTERNAL_ERROR;
                C5402f fVar2 = aVar4.f14284f;
                if (fVar2 != null) {
                    fVar2.mo24590a(aVar4, inneractiveErrorCode2);
                }
                aVar4.mo26504a(true);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$d */
    public class C5400d implements Runnable {
        public C5400d() {
        }

        public void run() {
            C5396a aVar = C5396a.this;
            AsyncTask<Void, Void, String> asyncTask = aVar.f14296r;
            if (asyncTask != null) {
                asyncTask.cancel(true);
                aVar.f14296r = null;
            }
            IAlog.m16699a("%sonLoadTimeout after %d msec", IAlog.m16696a((Object) aVar), Long.valueOf(aVar.f14294p));
            aVar.mo26502a(InneractiveErrorCode.LOAD_TIMEOUT);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$e */
    public interface C5401e {
        /* renamed from: a */
        String mo26518a();

        /* renamed from: b */
        void mo26519b();

        /* renamed from: c */
        String mo26520c();

        /* renamed from: d */
        void mo26521d();
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$f */
    public interface C5402f {
        /* renamed from: a */
        void mo24589a(C5396a aVar);

        /* renamed from: a */
        void mo24590a(C5396a aVar, InneractiveErrorCode inneractiveErrorCode);
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$g */
    public class C5403g implements C5401e {

        /* renamed from: a */
        public String f14309a;

        /* renamed from: b */
        public C5364p0 f14310b;

        public C5403g(String str, C5364p0 p0Var) {
            this.f14310b = p0Var;
            this.f14309a = str;
        }

        /* renamed from: a */
        public String mo26518a() {
            return null;
        }

        /* renamed from: b */
        public void mo26519b() {
        }

        /* renamed from: c */
        public String mo26520c() {
            return "open";
        }

        /* renamed from: d */
        public void mo26521d() {
            C5396a aVar = C5396a.this;
            String str = this.f14309a;
            C5364p0 p0Var = this.f14310b;
            L l = aVar.f14285g;
            if (l != null) {
                C5320d0.C5323c cVar = l.mo24961a(str, p0Var).f14158a;
            }
        }

        public String toString() {
            return "action: open url: " + this.f14309a;
        }
    }

    public C5396a(Context context, boolean z, boolean z2) {
        this.f14289k = z;
        this.f14280b = mo26500a(context);
        this.f14283e = z2;
        this.f14292n = new C5397a();
        this.f14291m = new C5398b();
    }

    /* renamed from: a */
    public void mo26503a(String str, String str2, String str3, String str4, C5402f fVar, long j) {
        this.f14284f = fVar;
        this.f14294p = j;
        try {
            mo26506b();
            C5399c cVar = new C5399c(str2, str3, str4, str);
            this.f14296r = cVar;
            cVar.executeOnExecutor(C5357n.f14224a, new Void[0]);
            mo26509e();
        } catch (Throwable unused) {
            mo26502a(InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
    }

    /* renamed from: a */
    public abstract void mo26504a(boolean z);

    /* renamed from: b */
    public abstract void mo26506b();

    /* renamed from: c */
    public void mo26507c() {
        this.f14280b.setTapListener(this);
    }

    /* renamed from: d */
    public void mo26508d() {
        IAlog.m16699a("IAWebViewController resetClick()", new Object[0]);
        Runnable runnable = this.f14292n;
        if (runnable != null) {
            C5357n.f14225b.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f14291m;
        if (runnable2 != null) {
            C5357n.f14225b.removeCallbacks(runnable2);
        }
        this.f14288j = false;
    }

    /* renamed from: e */
    public final void mo26509e() {
        IAlog.m16699a("IAWebViewController: Starting load timeout with %d", Long.valueOf(this.f14294p));
        this.f14295q = System.currentTimeMillis();
        C5400d dVar = new C5400d();
        this.f14293o = dVar;
        C5357n.f14225b.postDelayed(dVar, this.f14294p);
    }

    public void setAdContent(C4419j jVar) {
        this.f14300v = jVar;
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.f14299u = inneractiveAdRequest;
    }

    public void setListener(L l) {
        this.f14285g = l;
    }

    /* renamed from: a */
    public C5405c mo26499a() {
        return this.f14280b;
    }

    /* renamed from: a */
    public void mo26501a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        C5405c cVar = this.f14280b;
        if (cVar != null) {
            if (layoutParams != null) {
                viewGroup.addView(cVar, layoutParams);
            } else {
                viewGroup.addView(cVar);
            }
            C5328f0.C5332d.f14185a.mo26444a(viewGroup.getContext(), (View) this.f14280b, (C5328f0.C5333e) this);
            this.f14280b.setTapListener(this);
        }
    }

    /* renamed from: a */
    public C5405c mo26500a(Context context) {
        return new C5405c(context);
    }

    /* renamed from: a */
    public final void mo26502a(InneractiveErrorCode inneractiveErrorCode) {
        C5402f fVar = this.f14284f;
        if (fVar != null) {
            fVar.mo24590a(this, inneractiveErrorCode);
        }
        mo26504a(true);
    }

    /* renamed from: a */
    public void mo26343a(View view, float f, Rect rect) {
        if (f != this.f14286h || !rect.equals(this.f14287i)) {
            this.f14286h = f;
            this.f14287i.set(rect);
            C5405c cVar = this.f14280b;
            if (cVar != null) {
                cVar.mo26524a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo26505a(C5401e eVar) {
        IAlog.m16702d("IAWebViewController Web view click detected", new Object[0]);
        if (this.f14288j) {
            IAlog.m16702d("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            eVar.mo26521d();
            mo26508d();
            return true;
        }
        if (this.f14289k) {
            IAlog.m16702d("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
            Runnable runnable = this.f14291m;
            if (runnable != null) {
                C5357n.f14225b.removeCallbacks(runnable);
            }
            this.f14290l = null;
            this.f14290l = eVar;
            if (this.f14291m != null) {
                C5357n.f14225b.postDelayed(this.f14291m, (long) IAConfigManager.f10525J.f10557v.f10660b.mo24345a("click_timeout", 1000, 1000));
            }
        } else {
            Runnable runnable2 = this.f14291m;
            if (runnable2 != null) {
                C5357n.f14225b.removeCallbacks(runnable2);
            }
            this.f14290l = null;
            eVar.mo26521d();
        }
        return false;
    }
}
