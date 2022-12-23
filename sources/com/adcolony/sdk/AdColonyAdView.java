package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.adcolony.sdk.C0817e0;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.io.File;

public class AdColonyAdView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0752c f89a;

    /* renamed from: b */
    private AdColonyAdViewListener f90b;

    /* renamed from: c */
    private AdColonyAdSize f91c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f92d;

    /* renamed from: e */
    private String f93e;

    /* renamed from: f */
    private String f94f;

    /* renamed from: g */
    private String f95g;

    /* renamed from: h */
    private ImageView f96h;

    /* renamed from: i */
    private C0930p0 f97i;

    /* renamed from: j */
    private C0841h0 f98j;

    /* renamed from: k */
    private boolean f99k;

    /* renamed from: l */
    private boolean f100l;

    /* renamed from: m */
    private boolean f101m;

    /* renamed from: n */
    private boolean f102n;

    /* renamed from: o */
    private boolean f103o;

    /* renamed from: p */
    private boolean f104p = true;

    /* renamed from: q */
    private int f105q;

    /* renamed from: r */
    private int f106r;

    /* renamed from: s */
    private int f107s;

    /* renamed from: t */
    private int f108t;

    /* renamed from: u */
    private int f109u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C0705c f110v;

    /* renamed from: com.adcolony.sdk.AdColonyAdView$a */
    class C0703a implements Runnable {
        C0703a() {
        }

        public void run() {
            Context a = C0714a.m129a();
            if (a instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) a).mo10297b();
            }
            C0781d c = C0714a.m136b().mo10827c();
            c.mo10645a(AdColonyAdView.this.f92d);
            c.mo10649a(AdColonyAdView.this.f89a);
            C0823f1 b = C0764c0.m322b();
            C0764c0.m319a(b, "id", AdColonyAdView.this.f92d);
            new C0841h0("AdSession.on_ad_view_destroyed", 1, b).mo10776c();
            if (AdColonyAdView.this.f110v != null) {
                AdColonyAdView.this.f110v.mo10296a();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyAdView$b */
    class C0704b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f112a;

        C0704b(AdColonyAdView adColonyAdView, Context context) {
            this.f112a = context;
        }

        public void onClick(View view) {
            Context context = this.f112a;
            if (context instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) context).mo10297b();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyAdView$c */
    interface C0705c {
        /* renamed from: a */
        void mo10296a();
    }

    AdColonyAdView(Context context, C0841h0 h0Var, AdColonyAdViewListener adColonyAdViewListener) throws RuntimeException {
        super(context);
        this.f90b = adColonyAdViewListener;
        this.f93e = adColonyAdViewListener.mo10311c();
        C0823f1 a = h0Var.mo10772a();
        this.f92d = C0764c0.m336h(a, "id");
        this.f94f = C0764c0.m336h(a, "close_button_filepath");
        this.f99k = C0764c0.m325b(a, "trusted_demand_source");
        this.f103o = C0764c0.m325b(a, "close_button_snap_to_webview");
        this.f108t = C0764c0.m332d(a, "close_button_width");
        this.f109u = C0764c0.m332d(a, "close_button_height");
        C0752c cVar = C0714a.m136b().mo10827c().mo10656c().get(this.f92d);
        this.f89a = cVar;
        if (cVar != null) {
            this.f91c = adColonyAdViewListener.mo10306a();
            setLayoutParams(new FrameLayout.LayoutParams(this.f89a.mo10575d(), this.f89a.mo10569b()));
            setBackgroundColor(0);
            addView(this.f89a);
            return;
        }
        throw new RuntimeException("AdColonyAdView container cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo10271d() {
        return this.f100l;
    }

    public boolean destroy() {
        if (this.f100l) {
            new C0817e0.C0818a().mo10684a("Ignoring duplicate call to destroy().").mo10685a(C0817e0.f431f);
            return false;
        }
        this.f100l = true;
        C0930p0 p0Var = this.f97i;
        if (!(p0Var == null || p0Var.mo10943c() == null)) {
            this.f97i.mo10942b();
        }
        C1038z0.m1202b((Runnable) new C0703a());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10273e() {
        C0733b1 webView = getWebView();
        if (this.f97i != null && webView != null) {
            webView.mo10507f();
        }
    }

    public AdColonyAdSize getAdSize() {
        return this.f91c;
    }

    /* access modifiers changed from: package-private */
    public String getClickOverride() {
        return this.f95g;
    }

    /* access modifiers changed from: package-private */
    public C0752c getContainer() {
        return this.f89a;
    }

    public AdColonyAdViewListener getListener() {
        return this.f90b;
    }

    /* access modifiers changed from: package-private */
    public C0930p0 getOmidManager() {
        return this.f97i;
    }

    /* access modifiers changed from: package-private */
    public int getOrientation() {
        return this.f105q;
    }

    /* access modifiers changed from: package-private */
    public boolean getTrustedDemandSource() {
        return this.f99k;
    }

    /* access modifiers changed from: package-private */
    public C0733b1 getWebView() {
        C0752c cVar = this.f89a;
        if (cVar == null) {
            return null;
        }
        return cVar.mo10594n().get(2);
    }

    public String getZoneId() {
        return this.f93e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f104p && !this.f100l) {
            this.f104p = false;
            AdColonyAdViewListener adColonyAdViewListener = this.f90b;
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onShow(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setClickOverride(String str) {
        this.f95g = str;
    }

    /* access modifiers changed from: package-private */
    public void setExpandMessage(C0841h0 h0Var) {
        this.f98j = h0Var;
    }

    /* access modifiers changed from: package-private */
    public void setExpandedHeight(int i) {
        this.f107s = (int) (((float) i) * C0714a.m136b().mo10843n().mo10996s());
    }

    /* access modifiers changed from: package-private */
    public void setExpandedWidth(int i) {
        this.f106r = (int) (((float) i) * C0714a.m136b().mo10843n().mo10996s());
    }

    public void setListener(AdColonyAdViewListener adColonyAdViewListener) {
        this.f90b = adColonyAdViewListener;
    }

    /* access modifiers changed from: package-private */
    public void setNoCloseButton(boolean z) {
        this.f101m = this.f99k && z;
    }

    /* access modifiers changed from: package-private */
    public void setOmidManager(C0930p0 p0Var) {
        this.f97i = p0Var;
    }

    /* access modifiers changed from: package-private */
    public void setOnDestroyListenerOrCall(C0705c cVar) {
        if (this.f100l) {
            cVar.mo10296a();
        } else {
            this.f110v = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public void setOrientation(int i) {
        this.f105q = i;
    }

    /* access modifiers changed from: package-private */
    public void setUserInteraction(boolean z) {
        this.f102n = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10268a() {
        if (this.f99k || this.f102n) {
            float s = C0714a.m136b().mo10843n().mo10996s();
            this.f89a.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) this.f91c.getWidth()) * s), (int) (((float) this.f91c.getHeight()) * s)));
            C0733b1 webView = getWebView();
            if (webView != null) {
                C0841h0 h0Var = new C0841h0("WebView.set_bounds", 0);
                C0823f1 b = C0764c0.m322b();
                C0764c0.m326b(b, "x", webView.getInitialX());
                C0764c0.m326b(b, "y", webView.getInitialY());
                C0764c0.m326b(b, "width", webView.getInitialWidth());
                C0764c0.m326b(b, "height", webView.getInitialHeight());
                h0Var.mo10775b(b);
                webView.mo10501a(h0Var);
                C0823f1 b2 = C0764c0.m322b();
                C0764c0.m319a(b2, "ad_session_id", this.f92d);
                new C0841h0("MRAID.on_close", this.f89a.mo10591k(), b2).mo10776c();
            }
            ImageView imageView = this.f96h;
            if (imageView != null) {
                this.f89a.removeView(imageView);
                this.f89a.mo10565a((View) this.f96h);
            }
            addView(this.f89a);
            AdColonyAdViewListener adColonyAdViewListener = this.f90b;
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onClosed(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10269b() {
        int i;
        if (this.f99k || this.f102n) {
            C0934q n = C0714a.m136b().mo10843n();
            Rect w = n.mo11000w();
            int i2 = this.f106r;
            if (i2 <= 0) {
                i2 = w.width();
            }
            int i3 = this.f107s;
            if (i3 <= 0) {
                i3 = w.height();
            }
            int width = (w.width() - i2) / 2;
            int height = (w.height() - i3) / 2;
            this.f89a.setLayoutParams(new FrameLayout.LayoutParams(w.width(), w.height()));
            C0733b1 webView = getWebView();
            if (webView != null) {
                C0841h0 h0Var = new C0841h0("WebView.set_bounds", 0);
                C0823f1 b = C0764c0.m322b();
                C0764c0.m326b(b, "x", width);
                C0764c0.m326b(b, "y", height);
                C0764c0.m326b(b, "width", i2);
                C0764c0.m326b(b, "height", i3);
                h0Var.mo10775b(b);
                webView.mo10501a(h0Var);
                float s = n.mo10996s();
                C0823f1 b2 = C0764c0.m322b();
                C0764c0.m326b(b2, "app_orientation", C1038z0.m1209d(C1038z0.m1216f()));
                C0764c0.m326b(b2, "width", (int) (((float) i2) / s));
                C0764c0.m326b(b2, "height", (int) (((float) i3) / s));
                C0764c0.m326b(b2, "x", C1038z0.m1173a((View) webView));
                C0764c0.m326b(b2, "y", C1038z0.m1192b((View) webView));
                C0764c0.m319a(b2, "ad_session_id", this.f92d);
                new C0841h0("MRAID.on_size_change", this.f89a.mo10591k(), b2).mo10776c();
            }
            ImageView imageView = this.f96h;
            if (imageView != null) {
                this.f89a.removeView(imageView);
            }
            Context a = C0714a.m129a();
            if (!(a == null || this.f101m || webView == null)) {
                float s2 = C0714a.m136b().mo10843n().mo10996s();
                int i4 = (int) (((float) this.f108t) * s2);
                int i5 = (int) (((float) this.f109u) * s2);
                if (this.f103o) {
                    i = webView.getCurrentX() + webView.getCurrentWidth();
                } else {
                    i = w.width();
                }
                int currentY = this.f103o ? webView.getCurrentY() : 0;
                ImageView imageView2 = new ImageView(a.getApplicationContext());
                this.f96h = imageView2;
                imageView2.setImageURI(Uri.fromFile(new File(this.f94f)));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
                layoutParams.setMargins(i - i4, currentY, 0, 0);
                this.f96h.setOnClickListener(new C0704b(this, a));
                this.f89a.addView(this.f96h, layoutParams);
                this.f89a.mo10566a((View) this.f96h, FriendlyObstructionPurpose.CLOSE_AD);
            }
            if (this.f98j != null) {
                C0823f1 b3 = C0764c0.m322b();
                C0764c0.m328b(b3, "success", true);
                this.f98j.mo10773a(b3).mo10776c();
                this.f98j = null;
            }
            return true;
        }
        if (this.f98j != null) {
            C0823f1 b4 = C0764c0.m322b();
            C0764c0.m328b(b4, "success", false);
            this.f98j.mo10773a(b4).mo10776c();
            this.f98j = null;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10270c() {
        return this.f102n;
    }
}
