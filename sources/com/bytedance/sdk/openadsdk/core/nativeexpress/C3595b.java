package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.adexpress.p095b.C2623d;
import com.bytedance.sdk.component.adexpress.p095b.C2626f;
import com.bytedance.sdk.component.adexpress.p095b.C2635m;
import com.bytedance.sdk.component.adexpress.p095b.C2636n;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.C3766y;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView;
import com.bytedance.sdk.openadsdk.core.p151e.C3476g;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.dislike.C3778b;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p186a.C4025b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b */
/* compiled from: BrandBannerController */
public class C3595b {

    /* renamed from: a */
    public static final Set<String> f9102a = new HashSet<String>() {
        {
            add(".jpeg");
            add(".png");
            add(".bmp");
            add(".gif");
            add(".jpg");
            add(".webp");
        }
    };

    /* renamed from: b */
    private final Context f9103b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3599b f9104c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2636n f9105d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public NativeExpressView f9106e;

    /* renamed from: f */
    private int f9107f;

    /* renamed from: g */
    private int f9108g;

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b$c */
    /* compiled from: BrandBannerController */
    interface C3604c {
        /* renamed from: a */
        void mo20162a(int i, int i2);

        /* renamed from: b */
        void mo20167b(String str);

        /* renamed from: c */
        void mo20168c(String str);
    }

    public C3595b(Context context, NativeExpressView nativeExpressView, C3498n nVar) {
        this.f9103b = context;
        this.f9106e = nativeExpressView;
        m11346a(nativeExpressView);
        this.f9104c = new C3599b(context, nVar, this.f9107f, this.f9108g);
    }

    /* renamed from: a */
    private void m11346a(NativeExpressView nativeExpressView) {
        C3618k a = BannerExpressBackupView.m10284a(nativeExpressView.getExpectExpressWidth(), nativeExpressView.getExpectExpressHeight());
        if (nativeExpressView.getExpectExpressWidth() <= 0 || nativeExpressView.getExpectExpressHeight() <= 0) {
            int c = C4020v.m13306c(this.f9103b);
            this.f9107f = c;
            this.f9108g = Float.valueOf(((float) c) / a.f9165b).intValue();
        } else {
            this.f9107f = C4020v.m13315e(this.f9103b, (float) nativeExpressView.getExpectExpressWidth());
            this.f9108g = C4020v.m13315e(this.f9103b, (float) nativeExpressView.getExpectExpressHeight());
        }
        int i = this.f9107f;
        if (i > 0 && i > C4020v.m13306c(this.f9103b)) {
            float c2 = ((float) C4020v.m13306c(this.f9103b)) / ((float) this.f9107f);
            this.f9107f = C4020v.m13306c(this.f9103b);
            this.f9108g = Float.valueOf(((float) this.f9108g) * c2).intValue();
        }
    }

    /* renamed from: a */
    public void mo20152a(C2636n nVar) {
        this.f9105d = nVar;
    }

    /* renamed from: a */
    public void mo20151a() {
        C3599b bVar = this.f9104c;
        if (bVar != null) {
            bVar.mo16719a((C2626f) new C2626f() {
                /* renamed from: a */
                public void mo16717a(View view, C2635m mVar) {
                    if (C3595b.this.f9106e != null && view != null) {
                        C3595b.this.f9106e.removeView(view);
                        if (view.getParent() != null) {
                            ((ViewGroup) view.getParent()).removeView(view);
                        }
                        C3595b.this.f9106e.addView(view, new ViewGroup.LayoutParams(-1, -1));
                        if (C3595b.this.f9105d != null) {
                            C3595b.this.f9105d.mo16808a(C3595b.this.f9104c, mVar);
                        }
                    } else if (C3595b.this.f9105d != null) {
                        C3595b.this.f9105d.mo16809a_(106);
                    }
                }

                /* renamed from: a */
                public void mo16716a(int i) {
                    if (C3595b.this.f9105d != null) {
                        C3595b.this.f9105d.mo16809a_(106);
                    }
                }
            });
            return;
        }
        C2636n nVar = this.f9105d;
        if (nVar != null) {
            nVar.mo16809a_(106);
        }
    }

    /* renamed from: b */
    public void mo20156b() {
        C3599b bVar = this.f9104c;
        if (bVar != null) {
            bVar.mo20161a();
            this.f9104c = null;
        }
        this.f9105d = null;
        this.f9106e = null;
    }

    /* renamed from: a */
    public void mo20153a(TTAdDislike tTAdDislike) {
        C3599b bVar = this.f9104c;
        if (bVar != null) {
            bVar.mo20163a(tTAdDislike);
        }
    }

    /* renamed from: a */
    public void mo20154a(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        C3599b bVar = this.f9104c;
        if (bVar != null) {
            bVar.mo20164a(tTDislikeDialogAbstract);
        }
    }

    /* renamed from: a */
    public void mo20155a(String str) {
        C3599b bVar = this.f9104c;
        if (bVar != null) {
            bVar.mo20165a(str);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b$b */
    /* compiled from: BrandBannerController */
    public static class C3599b implements C2623d<View>, C3604c {

        /* renamed from: a */
        AtomicBoolean f9112a = new AtomicBoolean(false);

        /* renamed from: b */
        AtomicBoolean f9113b = new AtomicBoolean(false);

        /* renamed from: c */
        WeakReference<ImageView> f9114c;

        /* renamed from: d */
        private C3778b f9115d;

        /* renamed from: e */
        private TTDislikeDialogAbstract f9116e;

        /* renamed from: f */
        private String f9117f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final Context f9118g;

        /* renamed from: h */
        private final int f9119h;

        /* renamed from: i */
        private final int f9120i;

        /* renamed from: j */
        private FrameLayout f9121j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C3498n f9122k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C3622n f9123l;

        /* renamed from: m */
        private int f9124m;

        /* renamed from: n */
        private SSWebView f9125n;

        /* renamed from: o */
        private C2626f f9126o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f9127p = 0;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public List<String> f9128q;

        /* renamed from: c */
        public int mo16710c() {
            return 5;
        }

        public C3599b(Context context, C3498n nVar, int i, int i2) {
            this.f9118g = context;
            this.f9119h = i;
            this.f9120i = i2;
            this.f9122k = nVar;
            this.f9124m = C4020v.m13315e(context, 3.0f);
            this.f9123l = new C3622n(context);
            m11364f();
        }

        /* renamed from: f */
        private void m11364f() {
            FrameLayout frameLayout = new FrameLayout(this.f9118g);
            this.f9121j = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.f9119h, this.f9120i);
            }
            layoutParams.width = this.f9119h;
            layoutParams.height = this.f9120i;
            layoutParams.gravity = 17;
            this.f9121j.setLayoutParams(layoutParams);
            this.f9121j.addView(m11367i());
            this.f9121j.addView(m11365g());
            ImageView h = m11366h();
            this.f9121j.addView(h);
            this.f9114c = new WeakReference<>(h);
        }

        /* renamed from: a */
        public void mo16719a(C2626f fVar) {
            if (!this.f9112a.get()) {
                this.f9113b.set(false);
                if (this.f9118g == null) {
                    fVar.mo16716a(106);
                    return;
                }
                this.f9127p = 0;
                this.f9126o = fVar;
                this.f9125n.mo17927a((String) null, this.f9122k.mo19682az(), "text/html", "UTF-8", (String) null);
            }
        }

        /* renamed from: g */
        private View m11365g() {
            View inflate = LayoutInflater.from(this.f9118g).inflate(C2984t.m8433f(this.f9118g, "tt_backup_ad1"), (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = this.f9124m;
            layoutParams.leftMargin = this.f9124m;
            inflate.setLayoutParams(layoutParams);
            inflate.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTWebsiteActivity.m8985a(C3599b.this.f9118g, C3599b.this.f9122k, "banner_ad");
                }
            });
            return inflate;
        }

        /* renamed from: h */
        private ImageView m11366h() {
            ImageView imageView = new ImageView(this.f9118g);
            imageView.setImageDrawable(this.f9118g.getResources().getDrawable(C2984t.m8431d(this.f9118g, "tt_dislike_icon2")));
            int e = C4020v.m13315e(this.f9118g, 15.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(e, e);
            layoutParams.gravity = GravityCompat.END;
            layoutParams.rightMargin = this.f9124m;
            layoutParams.topMargin = this.f9124m;
            imageView.setLayoutParams(layoutParams);
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C3599b.this.mo20166b();
                }
            });
            return imageView;
        }

        /* renamed from: i */
        private SSWebView m11367i() {
            SSWebView b = C3605c.m11383a().mo20175b();
            this.f9125n = b;
            if (b == null) {
                this.f9125n = new SSWebView(this.f9118g);
            }
            C3605c.m11383a().mo20178c(this.f9125n);
            this.f9125n.setWebViewClient(new C3598a(this.f9123l, this));
            this.f9125n.setWebChromeClient(new WebChromeClient() {
                public void onProgressChanged(WebView webView, int i) {
                    if (!C3599b.this.f9113b.get()) {
                        super.onProgressChanged(webView, i);
                        if (C3599b.this.f9127p == 0 && i >= 75) {
                            C3599b.this.mo20169d();
                            C3599b.this.f9113b.set(true);
                        }
                        if (i == 100 && C3599b.this.f9128q != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                JSONArray jSONArray = new JSONArray();
                                for (String put : C3599b.this.f9128q) {
                                    jSONArray.put(put);
                                }
                                jSONObject.put("error_url", jSONArray);
                                C3156e.m9195b(C3599b.this.f9118g, C3599b.this.f9122k, "banner_ad", "html_banner_error_url", jSONObject);
                                List unused = C3599b.this.f9128q = null;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            });
            this.f9125n.getWebView().setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    C3599b.this.f9123l.onTouchEvent(motionEvent);
                    return false;
                }
            });
            this.f9125n.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.f9125n;
        }

        /* renamed from: e */
        public View mo16720e() {
            return this.f9121j;
        }

        /* renamed from: a */
        public void mo20161a() {
            this.f9121j = null;
            this.f9115d = null;
            this.f9116e = null;
            this.f9126o = null;
            this.f9122k = null;
            this.f9123l = null;
            if (this.f9125n != null) {
                C3605c.m11383a().mo20174a(this.f9125n);
            }
            this.f9112a.set(true);
            this.f9113b.set(false);
        }

        /* renamed from: a */
        public void mo20163a(TTAdDislike tTAdDislike) {
            if (tTAdDislike instanceof C3778b) {
                this.f9115d = (C3778b) tTAdDislike;
            }
        }

        /* renamed from: a */
        public void mo20164a(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            C3498n nVar;
            if (!(tTDislikeDialogAbstract == null || (nVar = this.f9122k) == null)) {
                tTDislikeDialogAbstract.setMaterialMeta(nVar);
            }
            this.f9116e = tTDislikeDialogAbstract;
        }

        /* renamed from: b */
        public void mo20166b() {
            TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f9116e;
            if (tTDislikeDialogAbstract != null) {
                tTDislikeDialogAbstract.show();
                return;
            }
            C3778b bVar = this.f9115d;
            if (bVar != null) {
                bVar.showDislikeDialog();
            } else {
                TTDelegateActivity.m8755a(this.f9122k, this.f9117f);
            }
        }

        /* renamed from: a */
        public void mo20165a(String str) {
            this.f9117f = str;
        }

        /* renamed from: b */
        public void mo20167b(String str) {
            if (!TextUtils.isEmpty(str)) {
                boolean z = false;
                if (str.contains("play.google.com/store/apps/details?id=")) {
                    z = C4025b.m13330b(this.f9118g, str.substring(str.indexOf("?id=") + 4));
                }
                if (!z) {
                    C3766y.m12379a(this.f9118g, this.f9122k, -1, (TTNativeAd) null, (TTNativeExpressAd) null, "", true, str);
                }
                if (this.f9123l != null) {
                    View view = null;
                    WeakReference<ImageView> weakReference = this.f9114c;
                    if (weakReference != null) {
                        view = (View) weakReference.get();
                    }
                    C3476g a = this.f9123l.mo20189a(this.f9118g, (View) this.f9121j.getParent(), view);
                    HashMap hashMap = new HashMap();
                    int i = 1;
                    hashMap.put("click_scence", 1);
                    Context context = this.f9118g;
                    C3498n nVar = this.f9122k;
                    if (!this.f9123l.mo20191b()) {
                        i = 2;
                    }
                    C3156e.m9177a(context, "click", nVar, a, "banner_ad", true, (Map<String, Object>) hashMap, i);
                }
                C3622n nVar2 = this.f9123l;
                if (nVar2 != null) {
                    nVar2.mo20190a();
                }
            }
        }

        /* renamed from: d */
        public void mo20169d() {
            if (this.f9126o != null) {
                C2635m mVar = new C2635m();
                mVar.mo16785a(true);
                mVar.mo16781a((double) C4020v.m13311d(this.f9118g, (float) this.f9119h));
                mVar.mo16788b((double) C4020v.m13311d(this.f9118g, (float) this.f9120i));
                this.f9126o.mo16717a(this.f9121j, mVar);
            }
        }

        /* renamed from: a */
        public void mo20162a(int i, int i2) {
            this.f9127p = i2;
            C2626f fVar = this.f9126o;
            if (fVar != null) {
                fVar.mo16716a(i);
            }
            C3156e.m9169a(this.f9118g, this.f9122k, "banner_ad", "render_html_fail");
        }

        /* renamed from: c */
        public void mo20168c(String str) {
            if (this.f9128q == null) {
                this.f9128q = new ArrayList();
            }
            this.f9128q.add(str);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b$a */
    /* compiled from: BrandBannerController */
    static class C3598a extends SSWebView.C2992a {

        /* renamed from: a */
        C3622n f9110a;

        /* renamed from: b */
        C3604c f9111b;

        public C3598a(C3622n nVar, C3604c cVar) {
            this.f9110a = nVar;
            this.f9111b = cVar;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C3604c cVar;
            C3622n nVar = this.f9110a;
            if (nVar == null || !nVar.mo20191b() || (cVar = this.f9111b) == null) {
                return false;
            }
            cVar.mo20167b(str);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r1 = r2.getUrl().toString();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceivedHttpError(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, android.webkit.WebResourceResponse r3) {
            /*
                r0 = this;
                super.onReceivedHttpError(r1, r2, r3)
                if (r2 == 0) goto L_0x0040
                if (r3 == 0) goto L_0x0040
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                if (r1 < r3) goto L_0x0040
                boolean r1 = r2.isForMainFrame()
                if (r1 == 0) goto L_0x0040
                android.net.Uri r1 = r2.getUrl()
                if (r1 == 0) goto L_0x0040
                android.net.Uri r1 = r2.getUrl()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "."
                int r2 = r1.lastIndexOf(r2)
                if (r2 <= 0) goto L_0x0040
                java.lang.String r2 = r1.substring(r2)
                java.lang.String r2 = r2.toLowerCase()
                java.util.Set<java.lang.String> r3 = com.bytedance.sdk.openadsdk.core.nativeexpress.C3595b.f9102a
                boolean r2 = r3.contains(r2)
                if (r2 == 0) goto L_0x0040
                com.bytedance.sdk.openadsdk.core.nativeexpress.b$c r2 = r0.f9111b
                if (r2 == 0) goto L_0x0040
                r2.mo20168c(r1)
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.C3595b.C3598a.onReceivedHttpError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (Build.VERSION.SDK_INT >= 23 && webResourceRequest != null && webResourceRequest.isForMainFrame() && webResourceError != null) {
                String str = null;
                if (webResourceRequest.getUrl() != null) {
                    str = webResourceRequest.getUrl().toString();
                }
                m11357a(str, webResourceError.getErrorCode(), webResourceError.getDescription().toString());
            }
        }

        /* renamed from: a */
        private void m11357a(String str, int i, String str2) {
            C3604c cVar = this.f9111b;
            if (cVar != null) {
                cVar.mo20162a(106, i);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (Build.VERSION.SDK_INT < 23) {
                m11357a(str2, i, str);
            }
        }
    }
}
