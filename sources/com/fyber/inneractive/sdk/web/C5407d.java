package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.config.global.features.C4286d;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.measurement.C4459a;
import com.fyber.inneractive.sdk.mraid.C4501a;
import com.fyber.inneractive.sdk.mraid.C4502a0;
import com.fyber.inneractive.sdk.mraid.C4508f;
import com.fyber.inneractive.sdk.mraid.C4521s;
import com.fyber.inneractive.sdk.mraid.C4522t;
import com.fyber.inneractive.sdk.mraid.C4523u;
import com.fyber.inneractive.sdk.mraid.C4524v;
import com.fyber.inneractive.sdk.mraid.C4526x;
import com.fyber.inneractive.sdk.mraid.C4527y;
import com.fyber.inneractive.sdk.network.C4550i0;
import com.fyber.inneractive.sdk.network.C4559m0;
import com.fyber.inneractive.sdk.network.C4579u;
import com.fyber.inneractive.sdk.p192ui.IAcloseButton;
import com.fyber.inneractive.sdk.p192ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C5328f0;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.C5368r;
import com.fyber.inneractive.sdk.util.C5369r0;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5396a;
import com.fyber.inneractive.sdk.web.C5407d.C5413f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.web.d */
public abstract class C5407d<T extends C5413f> extends C5396a<T> {

    /* renamed from: X */
    public static final String[] f14319X = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};

    /* renamed from: A */
    public final C5415h f14320A;

    /* renamed from: B */
    public C5414g f14321B;

    /* renamed from: C */
    public ViewGroup f14322C;

    /* renamed from: D */
    public C5405c f14323D;

    /* renamed from: E */
    public boolean f14324E = false;

    /* renamed from: F */
    public int f14325F;

    /* renamed from: G */
    public C5407d<T>.i f14326G;

    /* renamed from: H */
    public IAcloseButton f14327H;

    /* renamed from: I */
    public boolean f14328I;

    /* renamed from: J */
    public float f14329J;

    /* renamed from: K */
    public int f14330K = -1;

    /* renamed from: L */
    public int f14331L = -1;

    /* renamed from: M */
    public int f14332M = -1;

    /* renamed from: N */
    public int f14333N = -1;

    /* renamed from: O */
    public int f14334O = -1;

    /* renamed from: P */
    public int f14335P = -1;

    /* renamed from: Q */
    public Orientation f14336Q = Orientation.NONE;

    /* renamed from: R */
    public int f14337R;

    /* renamed from: S */
    public FrameLayout f14338S;

    /* renamed from: T */
    public FrameLayout f14339T;

    /* renamed from: U */
    public RelativeLayout f14340U;

    /* renamed from: V */
    public int f14341V;

    /* renamed from: W */
    public int f14342W;

    /* renamed from: w */
    public final C4459a f14343w;

    /* renamed from: x */
    public C4459a.C4460a f14344x = null;

    /* renamed from: y */
    public C4502a0 f14345y = C4502a0.HIDDEN;

    /* renamed from: z */
    public final C5411d f14346z;

    /* renamed from: com.fyber.inneractive.sdk.web.d$a */
    public class C5408a implements View.OnClickListener {
        public C5408a() {
        }

        public void onClick(View view) {
            C5407d.this.mo26553f();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$b */
    public class C5409b implements View.OnKeyListener {
        public C5409b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 4 || !C5407d.this.mo26555h()) {
                return false;
            }
            IAlog.m16702d("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
            C5407d.this.mo26553f();
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$c */
    public class C5410c implements C4579u<String> {
        public C5410c() {
        }

        /* renamed from: a */
        public void mo24228a(Object obj, Exception exc, boolean z) {
            String str = (String) obj;
            if (exc != null || TextUtils.isEmpty(str)) {
                C5357n.f14225b.post(new C5424j(this));
                return;
            }
            C5407d dVar = C5407d.this;
            if (dVar.mo26554g() != null) {
                C5412e eVar = new C5412e(dVar, str, (String) null);
                MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(dVar.mo26554g().getApplicationContext(), eVar);
                eVar.f14354b = mediaScannerConnection;
                mediaScannerConnection.connect();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$d */
    public enum C5411d {
        ENABLED,
        DISABLED
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$e */
    public class C5412e implements MediaScannerConnection.MediaScannerConnectionClient {

        /* renamed from: a */
        public final String f14353a;

        /* renamed from: b */
        public MediaScannerConnection f14354b;

        public C5412e(C5407d dVar, String str, String str2) {
            this.f14353a = str;
        }

        public void onMediaScannerConnected() {
            MediaScannerConnection mediaScannerConnection = this.f14354b;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.scanFile(this.f14353a, (String) null);
            }
        }

        public void onScanCompleted(String str, Uri uri) {
            MediaScannerConnection mediaScannerConnection = this.f14354b;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.disconnect();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$f */
    public interface C5413f extends C5436u {
        /* renamed from: a */
        void mo24963a(InneractiveUnitController.AdDisplayError adDisplayError);

        /* renamed from: a */
        void mo24964a(C5407d dVar);

        /* renamed from: a */
        void mo24965a(C5407d dVar, C4502a0 a0Var);

        /* renamed from: a */
        void mo24966a(C5407d dVar, boolean z);

        /* renamed from: a */
        void mo24967a(C5407d dVar, boolean z, Orientation orientation);

        /* renamed from: a */
        boolean mo24969a(String str);

        /* renamed from: b */
        void mo24970b();

        /* renamed from: b */
        void mo24971b(C5407d dVar);
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$g */
    public enum C5414g {
        INLINE,
        INTERSTITIAL
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$h */
    public enum C5415h {
        ALWAYS_VISIBLE,
        ALWAYS_HIDDEN,
        AD_CONTROLLED
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$i */
    public class C5416i extends BroadcastReceiver {

        /* renamed from: a */
        public Context f14362a;

        /* renamed from: b */
        public int f14363b = -1;

        public C5416i() {
        }

        /* renamed from: a */
        public void mo26566a() {
            try {
                C5407d dVar = C5407d.this;
                dVar.getClass();
                IAlog.m16699a("%sunregister screen broadcast receiver called", IAlog.m16696a((Object) dVar));
                if (this.f14362a != null) {
                    C5407d dVar2 = C5407d.this;
                    dVar2.getClass();
                    IAlog.m16699a("%sunregistering broadcast receiver", IAlog.m16696a((Object) dVar2));
                    this.f14362a.unregisterReceiver(this);
                    this.f14362a = null;
                }
            } catch (Throwable unused) {
            }
        }

        public void onReceive(Context context, Intent intent) {
            int rotation;
            if ((this.f14362a != null) && "android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) && (rotation = ((WindowManager) C5350l.f14216a.getSystemService("window")).getDefaultDisplay().getRotation()) != this.f14363b) {
                this.f14363b = rotation;
                C5407d dVar = C5407d.this;
                C5405c cVar = dVar.f14280b;
                if (cVar != null) {
                    cVar.getViewTreeObserver().addOnPreDrawListener(new C5419e(dVar, context));
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$j */
    public class C5417j implements C5396a.C5401e {

        /* renamed from: a */
        public C4501a f14365a;

        public C5417j(C5407d dVar, C4501a aVar, C5364p0 p0Var) {
            this.f14365a = aVar;
        }

        /* renamed from: a */
        public String mo26518a() {
            return this.f14365a.mo24707c();
        }

        /* renamed from: b */
        public void mo26519b() {
            C4501a aVar = this.f14365a;
            if (aVar != null) {
                aVar.mo24708d();
            }
        }

        /* renamed from: c */
        public String mo26520c() {
            return this.f14365a.f11162a;
        }

        /* renamed from: d */
        public void mo26521d() {
            this.f14365a.mo24710a();
        }

        public String toString() {
            return "action = " + this.f14365a.f11162a + " url = " + this.f14365a.mo24707c();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$k */
    public static abstract class C5418k implements C5413f {
        /* renamed from: a */
        public void mo26330a(boolean z) {
        }
    }

    public C5407d(Context context, boolean z, boolean z2, C5414g gVar, C5411d dVar, C5415h hVar, C4459a aVar) {
        super(context, z, z2);
        this.f14343w = aVar;
        this.f14321B = gVar;
        this.f14346z = dVar;
        this.f14320A = hVar;
    }

    /* renamed from: a */
    public void mo26545a(C4508f fVar, String str) {
        String str2 = fVar.f11177a;
        C5405c cVar = this.f14280b;
        if (cVar != null) {
            cVar.mo26523a("window.mraidbridge.fireErrorEvent('" + str2 + "', '" + str + "');");
        }
    }

    /* renamed from: a */
    public abstract boolean mo26418a(String str, C5364p0 p0Var);

    /* renamed from: b */
    public void mo26506b() {
        int i;
        int i2;
        int i3;
        boolean z;
        C4309s sVar;
        C4286d dVar;
        WebSettings settings = this.f14280b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        int i4 = 2;
        if (!IAConfigManager.f10525J.f10553r && C5368r.m16780a() && Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        if (this.f14283e && Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        C5405c cVar = this.f14280b;
        cVar.setHorizontalScrollBarEnabled(false);
        cVar.setHorizontalScrollbarOverlay(false);
        cVar.setVerticalScrollBarEnabled(false);
        cVar.setVerticalScrollbarOverlay(false);
        cVar.getSettings().setSupportZoom(false);
        C5405c cVar2 = this.f14280b;
        cVar2.getClass();
        if (Build.VERSION.SDK_INT < 18) {
            try {
                cVar2.getSettings().setPluginState(WebSettings.PluginState.ON);
            } catch (Exception unused) {
                IAlog.m16699a("Failed to modify WebView plugin state.", new Object[0]);
            }
        }
        this.f14280b.setFocusable(true);
        this.f14280b.setBackgroundColor(0);
        C5427m mVar = new C5427m();
        this.f14281c = mVar;
        this.f14280b.setWebChromeClient(mVar);
        C4419j jVar = this.f14300v;
        int i5 = 500;
        if (jVar == null || (sVar = jVar.f10915c) == null || (dVar = (C4286d) sVar.mo24338a(C4286d.class)) == null) {
            i3 = 500;
            i2 = 500;
            i = 2;
            z = false;
        } else {
            boolean a = dVar.mo24313a("agg_res", false);
            Integer b = dVar.mo24314b("agg_res_ct");
            int max = Math.max(b != null ? b.intValue() : 500, 50);
            Integer b2 = dVar.mo24314b("agg_res_rt");
            if (b2 != null) {
                i5 = b2.intValue();
            }
            int max2 = Math.max(i5, 50);
            Integer b3 = dVar.mo24314b("agg_res_retries");
            if (b3 != null) {
                i4 = b3.intValue();
            }
            i2 = max2;
            i = Math.max(i4, 1);
            z = a;
            i3 = max;
        }
        C5428n nVar = new C5428n(this, z, i3, i2, i);
        this.f14282d = nVar;
        this.f14280b.setWebViewClient(nVar);
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        } catch (Exception unused2) {
            IAlog.m16699a("Could not set web contents debugging flag", new Object[0]);
        }
        this.f14280b.setListener(this);
        this.f14345y = C4502a0.LOADING;
        Context g = mo26554g();
        this.f14325F = g instanceof Activity ? ((Activity) g).getRequestedOrientation() : -1;
        this.f14339T = new FrameLayout(mo26554g());
        this.f14340U = new RelativeLayout(mo26554g());
        FrameLayout frameLayout = new FrameLayout(mo26554g());
        frameLayout.setBackgroundColor(-858993460);
        this.f14338S = frameLayout;
        mo26544a(g, false);
        this.f14280b.setOnKeyListener(new C5409b());
    }

    /* renamed from: c */
    public final Date mo26550c(String str) {
        Date date = null;
        int i = 0;
        while (true) {
            String[] strArr = f14319X;
            if (i >= strArr.length) {
                break;
            }
            try {
                date = new SimpleDateFormat(strArr[i], Locale.getDefault()).parse(str);
                if (date != null) {
                    break;
                }
                i++;
            } catch (ParseException unused) {
            }
        }
        return date;
    }

    /* renamed from: d */
    public final void mo26552d(boolean z) {
        try {
            Activity activity = (Activity) mo26554g();
            if (activity == null) {
                return;
            }
            if (!z || activity.getResources() == null || activity.getResources().getConfiguration() == null) {
                activity.setRequestedOrientation(this.f14325F);
            } else {
                activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
            }
        } catch (Exception unused) {
            IAlog.m16699a("Failed to modify the device orientation.", new Object[0]);
        }
    }

    /* renamed from: f */
    public void mo26553f() {
        this.f14324E = false;
        C4502a0 a0Var = this.f14345y;
        C4502a0 a0Var2 = C4502a0.EXPANDED;
        if (a0Var == a0Var2 || a0Var == C4502a0.RESIZED) {
            mo26551c(false);
            C5405c cVar = this.f14280b;
            if (cVar != null) {
                C4502a0 a0Var3 = this.f14345y;
                if (a0Var3 == a0Var2) {
                    mo26557j();
                    ViewGroup viewGroup = (ViewGroup) this.f14338S.getParent();
                    if (viewGroup != null) {
                        viewGroup.addView(this.f14280b, this.f14337R, new FrameLayout.LayoutParams(this.f14341V, this.f14342W, 17));
                        viewGroup.removeView(this.f14338S);
                        viewGroup.invalidate();
                        this.f14280b.requestLayout();
                    }
                    this.f14334O = this.f14341V;
                    this.f14335P = this.f14342W;
                } else if (a0Var3 == C4502a0.RESIZED) {
                    this.f14334O = this.f14341V;
                    this.f14335P = this.f14342W;
                    cVar.setLayoutParams(new FrameLayout.LayoutParams(this.f14341V, this.f14342W, 17));
                }
            }
            this.f14345y = C4502a0.DEFAULT;
            mo26552d(false);
            mo26546a((C4522t) new C4527y(this.f14345y));
        } else if (a0Var == C4502a0.DEFAULT) {
            C5405c cVar2 = this.f14280b;
            if (cVar2 != null) {
                cVar2.setVisibility(4);
            }
            C4502a0 a0Var4 = C4502a0.HIDDEN;
            this.f14345y = a0Var4;
            mo26546a((C4522t) new C4527y(a0Var4));
        }
        L l = this.f14285g;
        if (l != null) {
            ((C5413f) l).mo24965a(this, this.f14345y);
        }
    }

    /* renamed from: g */
    public final Context mo26554g() {
        C5405c cVar = this.f14280b;
        if (cVar != null) {
            return cVar.getContext();
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo26555h() {
        return this.f14345y == C4502a0.EXPANDED;
    }

    /* renamed from: i */
    public boolean mo26556i() {
        return this.f14345y == C4502a0.RESIZED;
    }

    /* renamed from: j */
    public final void mo26557j() {
        FrameLayout frameLayout = this.f14339T;
        if (frameLayout != null && this.f14340U != null) {
            frameLayout.removeAllViewsInLayout();
            this.f14340U.removeAllViewsInLayout();
            ViewGroup viewGroup = this.f14322C;
            if (viewGroup != null) {
                viewGroup.removeView(this.f14340U);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (com.fyber.inneractive.sdk.measurement.C4465f) r0;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26558k() {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.measurement.a$a r0 = r5.f14344x
            if (r0 == 0) goto L_0x0023
            com.fyber.inneractive.sdk.measurement.f r0 = (com.fyber.inneractive.sdk.measurement.C4465f) r0
            com.iab.omid.library.fyber.adsession.AdSession r1 = r0.f11008b
            if (r1 == 0) goto L_0x0023
            r1.finish()     // Catch:{ all -> 0x000e }
            goto L_0x0012
        L_0x000e:
            r1 = move-exception
            r0.mo24661a(r1)
        L_0x0012:
            android.os.Handler r1 = com.fyber.inneractive.sdk.util.C5357n.f14225b
            com.fyber.inneractive.sdk.measurement.e r2 = new com.fyber.inneractive.sdk.measurement.e
            r2.<init>(r0)
            r3 = 2000(0x7d0, double:9.88E-321)
            r1.postDelayed(r2, r3)
            r1 = 0
            r0.f11008b = r1
            r0.f11009c = r1
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.C5407d.mo26558k():void");
    }

    public void setAdDefaultSize(int i, int i2) {
        this.f14341V = i;
        this.f14342W = i2;
        this.f14334O = i;
        this.f14335P = i2;
    }

    public void setOrientationProperties(boolean z, String str) {
        if ("portrait".equals(str)) {
            this.f14336Q = Orientation.PORTRAIT;
        } else if ("landscape".equals(str)) {
            this.f14336Q = Orientation.LANDSCAPE;
        } else {
            this.f14336Q = Orientation.NONE;
        }
        L l = this.f14285g;
        if (l != null) {
            ((C5413f) l).mo24967a(this, z, this.f14336Q);
        }
    }

    public void setResizeProperties() {
    }

    /* renamed from: a */
    public void mo26504a(boolean z) {
        Handler handler = C5357n.f14225b;
        handler.post(new C5421g(this));
        C5405c cVar = this.f14323D;
        if (!(cVar == null || cVar.getParent() == null || !(this.f14323D.getParent() instanceof ViewGroup))) {
            ((ViewGroup) this.f14323D.getParent()).removeView(this.f14323D);
            this.f14323D = null;
        }
        mo26557j();
        this.f14279a = false;
        AsyncTask<Void, Void, String> asyncTask = this.f14296r;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        C5405c cVar2 = this.f14280b;
        if (cVar2 != null) {
            C5328f0.C5332d.f14185a.mo26446a(cVar2);
            C5370s.m16789a((View) this.f14280b);
            this.f14280b.setWebChromeClient((WebChromeClient) null);
            this.f14280b.setWebViewClient((WebViewClient) null);
            if (((IAmraidWebViewController) this).f14344x == null) {
                this.f14280b.destroy();
            }
        }
        C5428n nVar = this.f14282d;
        if (nVar != null) {
            nVar.f14379e = null;
        }
        Runnable runnable = this.f14292n;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f14291m;
        if (runnable2 != null) {
            handler.removeCallbacks(runnable2);
        }
        this.f14285g = null;
        if (!z) {
            this.f14284f = null;
        }
        this.f14280b = null;
        this.f14281c = null;
        this.f14282d = null;
        this.f14300v = null;
        this.f14299u = null;
    }

    /* renamed from: c */
    public void mo26551c(boolean z) {
        if (this.f14322C != null) {
            if (z) {
                int b = C5350l.m16760b(35);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, b);
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.rightMargin = C5350l.m16760b(10);
                layoutParams.topMargin = C5350l.m16760b(10);
                if (this.f14327H == null) {
                    IAcloseButton iAcloseButton = new IAcloseButton(mo26554g(), b, true);
                    this.f14327H = iAcloseButton;
                    iAcloseButton.setOnClickListener(new C5408a());
                }
                C5370s.m16789a((View) this.f14327H);
                this.f14340U.addView(this.f14327H, layoutParams);
            } else {
                this.f14340U.removeView(this.f14327H);
            }
            L l = this.f14285g;
            if (l != null) {
                ((C5413f) l).mo24966a(this, z);
            }
            this.f14328I = !z;
        }
    }

    /* renamed from: a */
    public boolean mo26417a(WebView webView, String str) {
        C5364p0 p0Var;
        C5405c cVar;
        IAlog.m16699a("%shandle url for: %s webView = %s", IAlog.m16696a((Object) this), str, webView);
        C4502a0 a0Var = this.f14345y;
        C4502a0 a0Var2 = C4502a0.EXPANDED;
        if (a0Var != a0Var2 || TextUtils.isEmpty(str) || !webView.equals(this.f14323D) || this.f14324E) {
            IAlog.m16699a("%shandleUrl called with: %s", IAlog.m16696a((Object) this), str);
            if (this.f14280b == null) {
                IAlog.m16699a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
                return false;
            }
            if (C5369r0.m16782a(str)) {
                this.f14280b.loadUrl("chrome://crash");
            } else {
                if (this.f14345y != a0Var2 || (cVar = this.f14323D) == null) {
                    C5405c cVar2 = this.f14280b;
                    p0Var = cVar2 != null ? cVar2.getLastClickedLocation() : C5364p0.m16776a();
                } else {
                    p0Var = cVar.getLastClickedLocation();
                }
                if (!mo26418a(str, p0Var)) {
                    mo26505a((C5396a.C5401e) new C5396a.C5403g(str, p0Var));
                }
            }
            return true;
        }
        this.f14324E = true;
        return false;
    }

    /* renamed from: a */
    public final void mo26544a(Context context, boolean z) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        this.f14329J = displayMetrics.density;
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i2 = rect.top;
            i = window.findViewById(16908290).getTop() - i2;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        double d = (double) i3;
        double d2 = 160.0d / ((double) displayMetrics.densityDpi);
        int i5 = (int) (d * d2);
        int i6 = (int) (((double) i4) * d2);
        int i7 = (i4 - i2) - i;
        if (this.f14280b.getScaleX() == 1.0f || this.f14280b.getScaleY() == 1.0f) {
            double d3 = 160.0d / ((double) displayMetrics.densityDpi);
            this.f14332M = (int) (d * d3);
            this.f14333N = (int) (((double) i7) * d3);
        } else {
            i5 = this.f14280b.getWidthDp();
            i6 = this.f14280b.getHeightDp();
            int b = (C5350l.m16760b(this.f14280b.getHeightDp()) - i2) - i;
            this.f14332M = this.f14330K;
            this.f14333N = (int) (((double) b) * (160.0d / ((double) displayMetrics.densityDpi)));
        }
        if (this.f14330K != i5 || this.f14331L != i6) {
            this.f14330K = i5;
            this.f14331L = i6;
            if (z) {
                mo26546a((C4522t) new C4526x(i5, i6));
                mo26546a((C4522t) new C4524v(this.f14332M, this.f14333N));
                mo26546a((C4522t) new C4523u(0, 0, this.f14332M, this.f14333N));
                int i8 = this.f14334O;
                if (i8 <= 0 || this.f14335P <= 0) {
                    C5405c cVar = this.f14280b;
                    if (cVar != null && cVar.getWidth() > 0 && this.f14280b.getHeight() > 0) {
                        mo26546a((C4522t) new C4521s(C5350l.m16765c(this.f14280b.getWidth()), C5350l.m16765c(this.f14280b.getHeight())));
                        return;
                    }
                    return;
                }
                mo26546a((C4522t) new C4521s(C5350l.m16765c(i8), C5350l.m16765c(this.f14335P)));
            }
        }
    }

    /* renamed from: b */
    public void mo26549b(boolean z) {
        this.f14328I = z;
        L l = this.f14285g;
        if (l != null) {
            ((C5413f) l).mo24966a(this, z);
        }
    }

    /* renamed from: b */
    public void mo26548b(String str) {
        C5405c cVar = this.f14280b;
        if (cVar != null) {
            cVar.mo26523a("window.mraidbridge.nativeCallComplete('" + str + "');");
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo26543a(Map<String, String> map) throws Exception {
        String str;
        HashMap hashMap = new HashMap();
        if (!map.containsKey("description") || !map.containsKey("start")) {
            throw new IllegalArgumentException("Missing start and description fields");
        }
        hashMap.put("title", map.get("description"));
        if (!map.containsKey("start") || map.get("start") == null) {
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        Date c = mo26550c(map.get("start"));
        if (c != null) {
            hashMap.put("beginTime", Long.valueOf(c.getTime()));
            if (map.containsKey("end") && map.get("end") != null) {
                Date c2 = mo26550c(map.get("end"));
                if (c2 != null) {
                    hashMap.put(SDKConstants.PARAM_END_TIME, Long.valueOf(c2.getTime()));
                } else {
                    throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                }
            }
            if (map.containsKey(FirebaseAnalytics.Param.LOCATION)) {
                hashMap.put("eventLocation", map.get(FirebaseAnalytics.Param.LOCATION));
            }
            if (map.containsKey("summary")) {
                hashMap.put("description", map.get("summary"));
            }
            if (map.containsKey("transparency")) {
                hashMap.put("availability", Integer.valueOf(TJAdUnitConstants.String.TRANSPARENT.equals(map.get("transparency")) ? 1 : 0));
            }
            StringBuilder sb = new StringBuilder();
            if (map.containsKey("frequency")) {
                String str2 = map.get("frequency");
                int parseInt = map.containsKey(TJAdUnitConstants.String.INTERVAL) ? Integer.parseInt(map.get(TJAdUnitConstants.String.INTERVAL)) : -1;
                if ("daily".equals(str2)) {
                    sb.append("FREQ=DAILY;");
                    if (parseInt != -1) {
                        sb.append("INTERVAL=" + parseInt + ";");
                    }
                } else {
                    if ("weekly".equals(str2)) {
                        sb.append("FREQ=WEEKLY;");
                        if (parseInt != -1) {
                            sb.append("INTERVAL=" + parseInt + ";");
                        }
                        if (map.containsKey("daysInWeek")) {
                            StringBuilder sb2 = new StringBuilder();
                            boolean[] zArr = new boolean[7];
                            String[] split = map.get("daysInWeek").split(",");
                            for (String parseInt2 : split) {
                                int parseInt3 = Integer.parseInt(parseInt2);
                                if (parseInt3 == 7) {
                                    parseInt3 = 0;
                                }
                                if (!zArr[parseInt3]) {
                                    StringBuilder sb3 = new StringBuilder();
                                    switch (parseInt3) {
                                        case 0:
                                            str = "SU";
                                            break;
                                        case 1:
                                            str = "MO";
                                            break;
                                        case 2:
                                            str = "TU";
                                            break;
                                        case 3:
                                            str = "WE";
                                            break;
                                        case 4:
                                            str = "TH";
                                            break;
                                        case 5:
                                            str = "FR";
                                            break;
                                        case 6:
                                            str = "SA";
                                            break;
                                        default:
                                            throw new IllegalArgumentException("invalid day of week " + parseInt3);
                                    }
                                    sb3.append(str);
                                    sb3.append(",");
                                    sb2.append(sb3.toString());
                                    zArr[parseInt3] = true;
                                }
                            }
                            if (split.length != 0) {
                                sb2.deleteCharAt(sb2.length() - 1);
                                String sb4 = sb2.toString();
                                if (sb4 != null) {
                                    sb.append("BYDAY=" + sb4 + ";");
                                } else {
                                    throw new IllegalArgumentException("invalid ");
                                }
                            } else {
                                throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
                            }
                        }
                    } else if ("monthly".equals(str2)) {
                        sb.append("FREQ=MONTHLY;");
                        if (parseInt != -1) {
                            sb.append("INTERVAL=" + parseInt + ";");
                        }
                        if (map.containsKey("daysInMonth")) {
                            StringBuilder sb5 = new StringBuilder();
                            boolean[] zArr2 = new boolean[63];
                            String[] split2 = map.get("daysInMonth").split(",");
                            for (String parseInt4 : split2) {
                                int parseInt5 = Integer.parseInt(parseInt4);
                                int i = parseInt5 + 31;
                                if (!zArr2[i]) {
                                    StringBuilder sb6 = new StringBuilder();
                                    if (parseInt5 == 0 || parseInt5 < -31 || parseInt5 > 31) {
                                        throw new IllegalArgumentException("invalid day of month " + parseInt5);
                                    }
                                    sb6.append("" + parseInt5);
                                    sb6.append(",");
                                    sb5.append(sb6.toString());
                                    zArr2[i] = true;
                                }
                            }
                            if (split2.length != 0) {
                                sb5.deleteCharAt(sb5.length() - 1);
                                String sb7 = sb5.toString();
                                if (sb7 != null) {
                                    sb.append("BYMONTHDAY=" + sb7 + ";");
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                    }
                }
            }
            String sb8 = sb.toString();
            if (!TextUtils.isEmpty(sb8)) {
                hashMap.put("rrule", sb8);
            }
            return hashMap;
        }
        throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
    }

    /* renamed from: a */
    public final void mo26547a(String str) {
        new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
        C4550i0 i0Var = new C4550i0(new C5410c(), str);
        IAConfigManager.f10525J.f10555t.f11387a.offer(i0Var);
        i0Var.mo24717a(C4559m0.QUEUED);
    }

    /* renamed from: a */
    public void mo26546a(C4522t tVar) {
        if (this.f14280b != null) {
            String str = "{" + tVar.toString() + "}";
            this.f14280b.mo26523a("window.mraidbridge.fireChangeEvent(" + str + ");");
            IAlog.m16702d("Fire changes: %s", str);
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo26542a(URI uri) throws UnsupportedEncodingException {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            for (String str : rawQuery.split("&")) {
                int indexOf = str.indexOf("=");
                linkedHashMap.put(indexOf > 0 ? URLDecoder.decode(str.substring(0, indexOf), "UTF-8") : str, (indexOf <= 0 || str.length() <= (i = indexOf + 1)) ? null : URLDecoder.decode(str.substring(i), "UTF-8"));
            }
        }
        return linkedHashMap;
    }
}
