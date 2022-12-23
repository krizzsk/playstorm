package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.C3228d;
import com.bytedance.sdk.openadsdk.common.C3238f;
import com.bytedance.sdk.openadsdk.core.C3423b;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.C3645t;
import com.bytedance.sdk.openadsdk.core.C3728w;
import com.bytedance.sdk.openadsdk.core.C3768z;
import com.bytedance.sdk.openadsdk.core.p146b.C3426a;
import com.bytedance.sdk.openadsdk.core.p151e.C3469a;
import com.bytedance.sdk.openadsdk.core.p151e.C3470b;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3500o;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3747b;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3748c;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3749d;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.p130b.C3126a;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3171n;
import com.bytedance.sdk.openadsdk.p168e.C3792d;
import com.bytedance.sdk.openadsdk.utils.C3999i;
import com.bytedance.sdk.openadsdk.utils.C4000j;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class TTLandingPageActivity extends Activity implements C3792d {

    /* renamed from: b */
    private static final String f7086b = TTLandingPageActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f7087A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C3238f f7088B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C3228d f7089C;

    /* renamed from: D */
    private String f7090D = "ダウンロード";

    /* renamed from: a */
    C3171n f7091a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SSWebView f7092c;

    /* renamed from: d */
    private ImageView f7093d;

    /* renamed from: e */
    private ImageView f7094e;

    /* renamed from: f */
    private TextView f7095f;

    /* renamed from: g */
    private Context f7096g;

    /* renamed from: h */
    private int f7097h;

    /* renamed from: i */
    private ViewStub f7098i;

    /* renamed from: j */
    private ViewStub f7099j;

    /* renamed from: k */
    private ViewStub f7100k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Button f7101l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ProgressBar f7102m;

    /* renamed from: n */
    private String f7103n;

    /* renamed from: o */
    private String f7104o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C3728w f7105p;

    /* renamed from: q */
    private int f7106q;

    /* renamed from: r */
    private String f7107r;

    /* renamed from: s */
    private C3498n f7108s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C4026c f7109t;

    /* renamed from: u */
    private String f7110u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public AtomicBoolean f7111v = new AtomicBoolean(true);

    /* renamed from: w */
    private JSONArray f7112w = null;

    /* renamed from: x */
    private String f7113x;

    /* renamed from: y */
    private int f7114y = 0;

    /* renamed from: z */
    private int f7115z = 0;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        try {
            C3578m.m11233a(this);
        } catch (Throwable unused) {
        }
        setContentView(C2984t.m8433f(this, "tt_activity_ttlandingpage"));
        Intent intent = getIntent();
        this.f7097h = intent.getIntExtra("sdk_version", 1);
        this.f7103n = intent.getStringExtra("adid");
        this.f7104o = intent.getStringExtra("log_extra");
        this.f7106q = intent.getIntExtra("source", -1);
        String stringExtra = intent.getStringExtra("url");
        this.f7110u = stringExtra;
        m8803a(4);
        String stringExtra2 = intent.getStringExtra("web_title");
        intent.getStringExtra(CampaignEx.JSON_KEY_ICON_URL);
        this.f7107r = intent.getStringExtra("event_tag");
        this.f7113x = intent.getStringExtra("gecko_id");
        if (C3953b.m12901c()) {
            String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
            if (stringExtra3 != null) {
                try {
                    this.f7108s = C3423b.m10208a(new JSONObject(stringExtra3));
                } catch (Exception e) {
                    C2975l.m8388c(f7086b, "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                }
            }
        } else {
            this.f7108s = C3645t.m11590a().mo20225c();
            C3645t.m11590a().mo20230h();
        }
        if (this.f7108s == null) {
            finish();
            return;
        }
        this.f7087A = C3578m.m11241h().mo19944g();
        m8811c();
        this.f7096g = this;
        if (this.f7092c != null) {
            C3747b.m12300a((Context) this).mo20536a(false).mo20538b(false).mo20537a(this.f7092c.getWebView());
        }
        SSWebView sSWebView = this.f7092c;
        if (!(sSWebView == null || sSWebView.getWebView() == null)) {
            this.f7091a = new C3171n(this, this.f7108s, this.f7092c.getWebView()).mo18777a(true);
        }
        m8813d();
        this.f7092c.setLandingPage(true);
        this.f7092c.setTag("landingpage");
        this.f7092c.setMaterialMeta(this.f7108s.mo19649aC());
        this.f7092c.setWebViewClient(new C3749d(this.f7096g, this.f7105p, this.f7103n, this.f7091a, true) {
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTLandingPageActivity.this.f7102m != null && !TTLandingPageActivity.this.isFinishing()) {
                        TTLandingPageActivity.this.f7102m.setVisibility(8);
                    }
                } catch (Throwable unused) {
                }
            }

            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                return super.shouldInterceptRequest(webView, str);
            }
        });
        SSWebView sSWebView2 = this.f7092c;
        if (sSWebView2 != null) {
            sSWebView2.setUserAgentString(C3999i.m13113a(sSWebView2.getWebView(), this.f7097h));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f7092c.setMixedContentMode(0);
        }
        C3156e.m9165a(this.f7096g, this.f7108s);
        C4000j.m13115a(this.f7092c, stringExtra);
        this.f7092c.setWebChromeClient(new C3748c(this.f7105p, this.f7091a) {
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTLandingPageActivity.this.f7087A) {
                    if (TTLandingPageActivity.this.f7088B != null) {
                        TTLandingPageActivity.this.f7088B.mo18900a(webView, i);
                    }
                    if (TTLandingPageActivity.this.f7089C != null && i == 100) {
                        TTLandingPageActivity.this.f7089C.mo18886a(webView);
                    }
                } else if (TTLandingPageActivity.this.f7102m != null && !TTLandingPageActivity.this.isFinishing()) {
                    if (i != 100 || !TTLandingPageActivity.this.f7102m.isShown()) {
                        TTLandingPageActivity.this.f7102m.setProgress(i);
                    } else {
                        TTLandingPageActivity.this.f7102m.setVisibility(8);
                    }
                }
            }
        });
        if (this.f7087A) {
            this.f7092c.getWebView().setOnTouchListener(new View.OnTouchListener() {

                /* renamed from: a */
                float f7118a = 0.0f;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        this.f7118a = motionEvent.getY();
                    }
                    if (motionEvent.getAction() == 2) {
                        float y = motionEvent.getY();
                        float f = this.f7118a;
                        if (y - f > 8.0f) {
                            if (TTLandingPageActivity.this.f7088B != null) {
                                TTLandingPageActivity.this.f7088B.mo18899a();
                            }
                            if (TTLandingPageActivity.this.f7089C != null) {
                                TTLandingPageActivity.this.f7089C.mo18885a();
                            }
                            return false;
                        } else if (y - f < -8.0f) {
                            if (TTLandingPageActivity.this.f7088B != null) {
                                TTLandingPageActivity.this.f7088B.mo18901b();
                            }
                            if (TTLandingPageActivity.this.f7089C != null) {
                                TTLandingPageActivity.this.f7089C.mo18887b();
                            }
                        }
                    }
                    return false;
                }
            });
        }
        this.f7092c.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                if (TTLandingPageActivity.this.f7109t != null) {
                    TTLandingPageActivity.this.f7109t.mo20934d();
                }
            }
        });
        TextView textView = this.f7095f;
        if (textView != null) {
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = C2984t.m8425a(this, "tt_web_title_default");
            }
            textView.setText(stringExtra2);
        }
        m8802a();
    }

    /* renamed from: a */
    private void m8802a() {
        C3498n nVar = this.f7108s;
        if (nVar != null && nVar.mo19609L() == 4) {
            ViewStub viewStub = this.f7100k;
            if (viewStub != null) {
                viewStub.setVisibility(0);
            }
            Button button = (Button) findViewById(C2984t.m8432e(this, "tt_browser_download_btn"));
            this.f7101l = button;
            if (button != null) {
                m8805a(m8807b());
                if (this.f7109t == null) {
                    this.f7109t = C4027d.m13342a(this, this.f7108s, TextUtils.isEmpty(this.f7107r) ? C4014u.m13181a(this.f7106q) : this.f7107r);
                }
                C3426a aVar = new C3426a(this, this.f7108s, this.f7107r, this.f7106q);
                aVar.mo19387a(false);
                this.f7101l.setOnClickListener(aVar);
                this.f7101l.setOnTouchListener(aVar);
                aVar.mo19391c(true);
                aVar.mo19402a(this.f7109t);
            }
        }
    }

    /* renamed from: b */
    private String m8807b() {
        C3498n nVar = this.f7108s;
        if (nVar != null && !TextUtils.isEmpty(nVar.mo19620W())) {
            this.f7090D = this.f7108s.mo19620W();
        }
        return this.f7090D;
    }

    /* renamed from: a */
    private void m8805a(final String str) {
        Button button;
        if (!TextUtils.isEmpty(str) && (button = this.f7101l) != null) {
            button.post(new Runnable() {
                public void run() {
                    if (TTLandingPageActivity.this.f7101l != null && !TTLandingPageActivity.this.isFinishing()) {
                        TTLandingPageActivity.this.f7101l.setText(str);
                    }
                }
            });
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m8802a();
    }

    /* renamed from: c */
    private void m8811c() {
        ViewStub viewStub;
        this.f7092c = (SSWebView) findViewById(C2984t.m8432e(this, "tt_browser_webview"));
        this.f7100k = (ViewStub) findViewById(C2984t.m8432e(this, "tt_browser_download_btn_stub"));
        this.f7098i = (ViewStub) findViewById(C2984t.m8432e(this, "tt_browser_titlebar_view_stub"));
        this.f7099j = (ViewStub) findViewById(C2984t.m8432e(this, "tt_browser_titlebar_dark_view_stub"));
        if (this.f7087A) {
            ((ViewStub) findViewById(C2984t.m8432e(this, "tt_browser_new_title_bar_view_stub"))).setVisibility(0);
            ((ViewStub) findViewById(C2984t.m8432e(this, "tt_browser_new_bottom_bar_view_stub"))).setVisibility(0);
            C3238f fVar = new C3238f(this, (RelativeLayout) findViewById(C2984t.m8432e(this, "tt_title_bar")), this.f7108s);
            this.f7088B = fVar;
            ImageView c = fVar.mo18902c();
            this.f7094e = c;
            c.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
            this.f7089C = new C3228d(this, (LinearLayout) findViewById(C2984t.m8432e(this, "tt_bottom_bar")), this.f7092c, this.f7108s, "landingpage");
            return;
        }
        int o = C3524h.m10852d().mo19865o();
        if (o == 0) {
            ViewStub viewStub2 = this.f7098i;
            if (viewStub2 != null) {
                viewStub2.setVisibility(0);
            }
        } else if (o == 1 && (viewStub = this.f7099j) != null) {
            viewStub.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(C2984t.m8432e(this, "tt_titlebar_back"));
        this.f7093d = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.f7092c == null) {
                        return;
                    }
                    if (TTLandingPageActivity.this.f7092c.mo17936e()) {
                        TTLandingPageActivity.this.f7092c.mo17937f();
                    } else if (TTLandingPageActivity.this.m8815e()) {
                        TTLandingPageActivity.this.onBackPressed();
                    } else {
                        TTLandingPageActivity.this.finish();
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(C2984t.m8432e(this, "tt_titlebar_close"));
        this.f7094e = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.f7095f = (TextView) findViewById(C2984t.m8432e(this, "tt_titlebar_title"));
        ProgressBar progressBar = (ProgressBar) findViewById(C2984t.m8432e(this, "tt_browser_progress"));
        this.f7102m = progressBar;
        progressBar.setVisibility(0);
    }

    /* renamed from: d */
    private void m8813d() {
        C3728w wVar = new C3728w(this);
        this.f7105p = wVar;
        wVar.mo20443b(this.f7092c).mo20453d(this.f7103n).mo20457e(this.f7104o).mo20426a(this.f7108s).mo20442b(this.f7106q).mo20420a(this.f7108s.mo19603F()).mo20459f(C4014u.m13239i(this.f7108s)).mo20423a(this.f7092c).mo20449c("landingpage").mo20428a((C3792d) this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C3728w wVar = this.f7105p;
        if (wVar != null) {
            wVar.mo20466l();
        }
        C3171n nVar = this.f7091a;
        if (nVar != null) {
            nVar.mo18790d();
        }
        m8817f();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C3171n nVar = this.f7091a;
        if (nVar != null) {
            nVar.mo18791e();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C3645t.m11590a().mo20223b(true);
        C3728w wVar = this.f7105p;
        if (wVar != null) {
            wVar.mo20467m();
        }
    }

    public void onBackPressed() {
        if (!m8815e() || this.f7111v.getAndSet(true)) {
            super.onBackPressed();
            return;
        }
        m8806a(true);
        m8803a(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m8815e() {
        return !TextUtils.isEmpty(this.f7110u) && this.f7110u.contains("__luban_sdk");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8803a(int i) {
        if (this.f7094e != null && m8815e()) {
            C4020v.m13282a((View) this.f7094e, i);
        }
    }

    /* renamed from: a */
    private void m8806a(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", z);
            this.f7105p.mo20439a("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private void m8817f() {
        if (this.f7108s != null) {
            JSONArray b = m8808b(this.f7110u);
            int f = C4014u.m13223f(this.f7108s);
            int e = C4014u.m13219e(this.f7108s);
            C3581n<C3126a> f2 = C3578m.m11239f();
            if (b != null && f2 != null && f > 0 && e > 0) {
                C3500o oVar = new C3500o();
                oVar.f8659e = b;
                AdSlot x = this.f7108s.mo19754x();
                if (x != null) {
                    x.setAdCount(6);
                    f2.mo20073a(x, oVar, e, new C3581n.C3582a() {
                        /* renamed from: a */
                        public void mo18544a(int i, String str) {
                            TTLandingPageActivity.this.m8803a(0);
                        }

                        /* renamed from: a */
                        public void mo18545a(C3469a aVar, C3470b bVar) {
                            if (aVar != null) {
                                try {
                                    TTLandingPageActivity.this.f7111v.set(false);
                                    TTLandingPageActivity.this.f7105p.mo20444b(new JSONObject(aVar.mo19479c()));
                                } catch (Exception unused) {
                                    TTLandingPageActivity.this.m8803a(0);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    private JSONArray m8808b(String str) {
        int i;
        JSONArray jSONArray = this.f7112w;
        if (jSONArray != null && jSONArray.length() > 0) {
            return this.f7112w;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?id=");
        int indexOf2 = str.indexOf("&");
        if (indexOf == -1 || indexOf2 == -1 || (i = indexOf + 4) >= indexOf2) {
            return null;
        }
        String substring = str.substring(i, indexOf2);
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(substring);
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        SSWebView sSWebView;
        super.onDestroy();
        C3171n nVar = this.f7091a;
        if (!(nVar == null || (sSWebView = this.f7092c) == null)) {
            nVar.mo18785a(sSWebView);
        }
        try {
            if (!(getWindow() == null || (viewGroup = (ViewGroup) getWindow().getDecorView()) == null)) {
                viewGroup.removeAllViews();
            }
        } catch (Throwable unused) {
        }
        SSWebView sSWebView2 = this.f7092c;
        if (sSWebView2 != null) {
            C3768z.m12384a(this.f7096g, sSWebView2.getWebView());
            C3768z.m12385a(this.f7092c.getWebView());
        }
        this.f7092c = null;
        C3728w wVar = this.f7105p;
        if (wVar != null) {
            wVar.mo20468n();
        }
        C3171n nVar2 = this.f7091a;
        if (nVar2 != null) {
            nVar2.mo18792f();
        }
    }

    /* renamed from: a */
    public void mo18527a(boolean z, JSONArray jSONArray) {
        if (z && jSONArray != null && jSONArray.length() > 0) {
            this.f7112w = jSONArray;
            m8817f();
        }
    }
}
