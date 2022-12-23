package com.bytedance.sdk.openadsdk.component.reward.p143a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.p110d.C2898j;
import com.bytedance.sdk.component.p110d.C2902n;
import com.bytedance.sdk.component.p110d.C2908t;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p146b.C3432e;
import com.bytedance.sdk.openadsdk.core.p146b.C3434g;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p156j.C3539a;
import com.bytedance.sdk.openadsdk.core.p156j.C3557c;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p167d.C3769a;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.g */
/* compiled from: VastEndCardManager */
public class C3313g {

    /* renamed from: a */
    private final Activity f7902a;

    /* renamed from: b */
    private C3498n f7903b;

    /* renamed from: c */
    private FrameLayout f7904c;

    /* renamed from: d */
    private SSWebView f7905d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ImageView f7906e;

    /* renamed from: f */
    private boolean f7907f;

    /* renamed from: g */
    private C3434g f7908g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3299e f7909h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f7910i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f7911j;

    public C3313g(Activity activity) {
        this.f7902a = activity;
    }

    /* renamed from: a */
    public void mo19149a(C3498n nVar) {
        C3557c c;
        Activity activity = this.f7902a;
        if (activity != null) {
            this.f7903b = nVar;
            this.f7904c = (FrameLayout) activity.findViewById(C2984t.m8432e(activity, "tt_reward_full_endcard_vast"));
            if (this.f7903b.mo19680ax() != null && (c = this.f7903b.mo19680ax().mo19985c()) != null) {
                if (c.mo20029e() != null) {
                    this.f7907f = true;
                    Activity activity2 = this.f7902a;
                    this.f7906e = (ImageView) activity2.findViewById(C2984t.m8432e(activity2, "tt_reward_full_endcard_vast_image"));
                    m9827a(c.mo20025b(), c.mo20027c(), this.f7903b.mo19680ax());
                    C3769a.m12388a(c.mo20029e()).mo17716a(C2908t.BITMAP).mo17711a((C2902n) new C2902n<Bitmap>() {
                        /* renamed from: a */
                        public void mo17257a(C2898j<Bitmap> jVar) {
                            if (C3313g.this.f7906e != null && jVar != null) {
                                Bitmap b = jVar.mo17725b();
                                if (b == null) {
                                    C3313g.this.m9826a(-1);
                                    return;
                                }
                                C3313g.this.f7906e.setImageBitmap(b);
                                boolean unused = C3313g.this.f7911j = true;
                            }
                        }

                        /* renamed from: a */
                        public void mo17256a(int i, String str, Throwable th) {
                            if (C3313g.this.f7906e != null) {
                                C3313g.this.f7906e.setVisibility(8);
                            }
                            C3313g.this.m9826a(-2);
                        }
                    });
                    return;
                }
                Activity activity3 = this.f7902a;
                this.f7905d = (SSWebView) activity3.findViewById(C2984t.m8432e(activity3, "tt_reward_full_endcard_vast_web"));
                m9832b();
                String d = c.mo20028d();
                if (d != null) {
                    this.f7907f = true;
                    if (d.startsWith("http")) {
                        this.f7905d.mo17925a(d);
                        return;
                    }
                    this.f7905d.setDefaultTextEncodingName("UTF -8");
                    this.f7905d.mo17927a((String) null, d, "text/html", "UTF-8", (String) null);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9826a(int i) {
        m9828a(i, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9828a(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", i);
            if (str != null) {
                jSONObject.put("url", str);
            }
            String str2 = "";
            if (this.f7903b.mo19680ax() != null) {
                str2 = this.f7903b.mo19680ax().mo19997k();
            }
            C3156e.m9195b(C3578m.m11231a(), this.f7903b, str2, "load_vast_endcard_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m9832b() {
        this.f7905d.setWebViewClient(new SSWebView.C2992a() {
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest != null && webResourceRequest.isForMainFrame() && !C3313g.this.f7910i && webResourceError != null) {
                    String str = null;
                    if (webResourceRequest.getUrl() != null) {
                        str = webResourceRequest.getUrl().toString();
                    }
                    C3313g.this.m9828a(webResourceError.getErrorCode(), str);
                    boolean unused = C3313g.this.f7910i = true;
                }
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                if (Build.VERSION.SDK_INT < 23 && !C3313g.this.f7910i) {
                    C3313g.this.m9828a(i, str2);
                    boolean unused = C3313g.this.f7910i = true;
                }
            }
        });
    }

    /* renamed from: a */
    private void m9827a(int i, int i2, final C3539a aVar) {
        Activity activity;
        if (i != 0 && i2 != 0 && this.f7906e != null && (activity = this.f7902a) != null) {
            int c = C4020v.m13306c((Context) activity);
            int d = C4020v.m13310d((Context) this.f7902a);
            float f = ((float) i) / ((float) i2);
            float f2 = (float) c;
            if (f <= f2 / ((float) d)) {
                c = (int) Math.ceil((double) (f2 * f));
            } else {
                d = (int) Math.ceil((double) (f2 / f));
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7906e.getLayoutParams();
            layoutParams.width = c;
            layoutParams.height = d;
            this.f7906e.setLayoutParams(layoutParams);
            C33163 r4 = new C3434g("VAST_END_CARD", aVar) {
                /* renamed from: a */
                public void mo19153a() {
                    if (aVar.mo19985c() != null) {
                        aVar.mo19985c().mo20023a(C3313g.this.f7909h != null ? C3313g.this.f7909h.mo19088s() : -1);
                    }
                }
            };
            this.f7908g = r4;
            this.f7906e.setOnClickListener(r4);
            this.f7906e.setOnTouchListener(this.f7908g);
        }
    }

    /* renamed from: a */
    public void mo19147a() {
        C4020v.m13282a((View) this.f7904c, 8);
    }

    /* renamed from: a */
    public boolean mo19150a(C3299e eVar) {
        C3557c c;
        if (!this.f7907f) {
            return false;
        }
        this.f7909h = eVar;
        ImageView imageView = this.f7906e;
        if (imageView == null || !this.f7911j) {
            SSWebView sSWebView = this.f7905d;
            if (sSWebView != null) {
                sSWebView.setVisibility(0);
            }
        } else {
            imageView.setVisibility(0);
        }
        C4020v.m13282a((View) this.f7904c, 0);
        C3498n nVar = this.f7903b;
        if (nVar == null || nVar.mo19680ax() == null || (c = this.f7903b.mo19680ax().mo19985c()) == null) {
            return true;
        }
        C3299e eVar2 = this.f7909h;
        c.mo20026b(eVar2 != null ? eVar2.mo19088s() : -1);
        return true;
    }

    /* renamed from: a */
    public void mo19148a(C3432e eVar) {
        C3434g gVar = this.f7908g;
        if (gVar != null) {
            gVar.mo19418a(eVar);
        }
    }
}
