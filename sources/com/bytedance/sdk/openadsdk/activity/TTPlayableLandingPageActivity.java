package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.p090a.C2561e;
import com.bytedance.sdk.component.p090a.C2562f;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.utils.C2989x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.C3225a;
import com.bytedance.sdk.openadsdk.core.C3423b;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3645t;
import com.bytedance.sdk.openadsdk.core.C3728w;
import com.bytedance.sdk.openadsdk.core.C3768z;
import com.bytedance.sdk.openadsdk.core.p146b.C3426a;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p146b.C3431d;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3747b;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3748c;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3749d;
import com.bytedance.sdk.openadsdk.dislike.C3778b;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3171n;
import com.bytedance.sdk.openadsdk.p130b.C3185u;
import com.bytedance.sdk.openadsdk.p171g.C3806d;
import com.bytedance.sdk.openadsdk.p171g.C3808f;
import com.bytedance.sdk.openadsdk.p171g.C3809g;
import com.bytedance.sdk.openadsdk.p178j.C3855a;
import com.bytedance.sdk.openadsdk.p178j.C3859c;
import com.bytedance.sdk.openadsdk.p178j.C3888f;
import com.bytedance.sdk.openadsdk.p178j.C3890g;
import com.bytedance.sdk.openadsdk.utils.C3999i;
import com.bytedance.sdk.openadsdk.utils.C4000j;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class TTPlayableLandingPageActivity extends Activity implements C2989x.C2990a, C3431d, C3808f {

    /* renamed from: J */
    private static final C3888f.C3889a f7127J = new C3888f.C3889a() {
        /* renamed from: a */
        public void mo18560a(String str, String str2) {
            C2975l.m8384b(str, str2);
        }

        /* renamed from: a */
        public void mo18561a(String str, String str2, Throwable th) {
            C2975l.m8388c(str, str2, th);
        }
    };

    /* renamed from: A */
    private C4026c f7128A;

    /* renamed from: B */
    private AtomicBoolean f7129B = new AtomicBoolean(false);

    /* renamed from: C */
    private String f7130C;

    /* renamed from: D */
    private int f7131D = 0;

    /* renamed from: E */
    private int f7132E = 0;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C3890g f7133F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f7134G = false;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C3185u f7135H;

    /* renamed from: I */
    private C3171n f7136I;

    /* renamed from: a */
    TTAdDislike f7137a;

    /* renamed from: b */
    protected C3809g f7138b;

    /* renamed from: c */
    protected C3806d f7139c = new C3806d() {
        /* renamed from: a */
        public void mo18489a() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && C3501p.m10765e(TTPlayableLandingPageActivity.this.f7159w) && C3501p.m10767g(TTPlayableLandingPageActivity.this.f7159w)) {
                TTPlayableLandingPageActivity.this.f7160x.removeMessages(2);
                TTPlayableLandingPageActivity.this.f7160x.sendMessage(TTPlayableLandingPageActivity.this.m8825a(1));
            }
        }

        /* renamed from: b */
        public void mo18491b() {
            if (C3501p.m10765e(TTPlayableLandingPageActivity.this.f7159w) && C3501p.m10766f(TTPlayableLandingPageActivity.this.f7159w)) {
                TTPlayableLandingPageActivity.this.f7160x.sendMessageDelayed(TTPlayableLandingPageActivity.this.m8825a(0), 1000);
            }
        }

        /* renamed from: a */
        public void mo18490a(int i) {
            if (C3501p.m10765e(TTPlayableLandingPageActivity.this.f7159w) && TTPlayableLandingPageActivity.this.f7150n != null) {
                TTPlayableLandingPageActivity.this.f7150n.setProgress(i);
            }
        }
    };

    /* renamed from: d */
    private SSWebView f7140d;

    /* renamed from: e */
    private SSWebView f7141e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f7142f = true;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f7143g = true;

    /* renamed from: h */
    private RelativeLayout f7144h;

    /* renamed from: i */
    private View f7145i;

    /* renamed from: j */
    private ImageView f7146j;

    /* renamed from: k */
    private Context f7147k;

    /* renamed from: l */
    private int f7148l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ProgressBar f7149m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public PlayableLoadingView f7150n;

    /* renamed from: o */
    private String f7151o;

    /* renamed from: p */
    private String f7152p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C3728w f7153q;

    /* renamed from: r */
    private C3728w f7154r;

    /* renamed from: s */
    private int f7155s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f7156t;

    /* renamed from: u */
    private String f7157u;

    /* renamed from: v */
    private final String f7158v = "embeded_ad";
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C3498n f7159w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C2989x f7160x = new C2989x(Looper.getMainLooper(), this);
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f7161y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f7162z;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Message m8825a(int i) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.arg1 = i;
        return obtain;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            C3578m.m11233a(this);
        } catch (Throwable unused) {
        }
        m8828a(bundle);
        C3498n nVar = this.f7159w;
        if (nVar != null) {
            int h = C3501p.m10768h(nVar);
            if (h != 0) {
                if (h == 1) {
                    setRequestedOrientation(1);
                } else if (h == 2) {
                    setRequestedOrientation(0);
                }
            } else if (Build.VERSION.SDK_INT >= 18) {
                setRequestedOrientation(14);
            } else {
                setRequestedOrientation(1);
            }
            this.f7147k = this;
            setContentView(C2984t.m8433f(this, "tt_activity_ttlandingpage_playable"));
            m8847h();
            m8841e();
            mo18546a();
            m8855l();
            m8844f();
            m8845g();
            C3185u uVar = this.f7135H;
            if (uVar != null) {
                uVar.mo18828h();
            }
            C3809g gVar = new C3809g(getApplicationContext());
            this.f7138b = gVar;
            gVar.mo20619a((C3808f) this);
        }
    }

    /* renamed from: d */
    private void m8838d() {
        if (this.f7133F == null) {
            if (C3524h.m10852d().mo19869s()) {
                C3888f.m12720a(f7127J);
            }
            C30846 r0 = new C3855a() {
                /* renamed from: a */
                public void mo18569a(JSONObject jSONObject) {
                }

                /* renamed from: b */
                public void mo18570b() {
                }

                /* renamed from: b */
                public void mo18571b(JSONObject jSONObject) {
                }

                /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
                /* JADX WARNING: Removed duplicated region for block: B:41:0x006e  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.bytedance.sdk.openadsdk.p178j.C3860d mo18568a() {
                    /*
                        r7 = this;
                        java.lang.String r0 = com.bytedance.sdk.openadsdk.common.C3225a.m9415f()
                        int r1 = r0.hashCode()
                        r2 = 1653(0x675, float:2.316E-42)
                        r3 = 4
                        r4 = 3
                        r5 = 2
                        r6 = 1
                        if (r1 == r2) goto L_0x004a
                        r2 = 1684(0x694, float:2.36E-42)
                        if (r1 == r2) goto L_0x0040
                        r2 = 1715(0x6b3, float:2.403E-42)
                        if (r1 == r2) goto L_0x0036
                        r2 = 1746(0x6d2, float:2.447E-42)
                        if (r1 == r2) goto L_0x002c
                        r2 = 3649301(0x37af15, float:5.11376E-39)
                        if (r1 == r2) goto L_0x0022
                        goto L_0x0054
                    L_0x0022:
                        java.lang.String r1 = "wifi"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = r3
                        goto L_0x0055
                    L_0x002c:
                        java.lang.String r1 = "5g"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = r4
                        goto L_0x0055
                    L_0x0036:
                        java.lang.String r1 = "4g"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = r5
                        goto L_0x0055
                    L_0x0040:
                        java.lang.String r1 = "3g"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = r6
                        goto L_0x0055
                    L_0x004a:
                        java.lang.String r1 = "2g"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = 0
                        goto L_0x0055
                    L_0x0054:
                        r0 = -1
                    L_0x0055:
                        if (r0 == 0) goto L_0x006e
                        if (r0 == r6) goto L_0x006b
                        if (r0 == r5) goto L_0x0068
                        if (r0 == r4) goto L_0x0065
                        if (r0 == r3) goto L_0x0062
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p178j.C3860d.TYPE_UNKNOWN
                        return r0
                    L_0x0062:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p178j.C3860d.TYPE_WIFI
                        return r0
                    L_0x0065:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p178j.C3860d.TYPE_5G
                        return r0
                    L_0x0068:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p178j.C3860d.TYPE_4G
                        return r0
                    L_0x006b:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p178j.C3860d.TYPE_3G
                        return r0
                    L_0x006e:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p178j.C3860d.TYPE_2G
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.C30846.mo18568a():com.bytedance.sdk.openadsdk.j.d");
                }

                /* renamed from: c */
                public void mo18572c(JSONObject jSONObject) {
                    C3156e.m9195b(TTPlayableLandingPageActivity.this.getApplicationContext(), TTPlayableLandingPageActivity.this.f7159w, "embeded_ad", "playable_track", jSONObject);
                }
            };
            C30857 r1 = new C3859c() {
                /* renamed from: a */
                public void mo18573a(String str, JSONObject jSONObject) {
                    TTPlayableLandingPageActivity.this.f7153q.mo20439a(str, jSONObject);
                }
            };
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(BidResponsedEx.KEY_CID, this.f7151o);
                jSONObject.put("log_extra", this.f7152p);
                this.f7133F = C3890g.m12726a(getApplicationContext(), this.f7140d.getWebView(), r1, r0).mo20752f(this.f7156t).mo20749e(C3225a.m9410a(C3578m.m11231a())).mo20727a(C3225a.m9409a()).mo20729a(jSONObject).mo20736b(C3225a.m9414e()).mo20728a("sdkEdition", C3225a.m9412c()).mo20746d(C3225a.m9413d()).mo20742c(false).mo20730a(this.f7134G).mo20737b(true);
            } catch (Throwable unused) {
            }
            if (!TextUtils.isEmpty(C3501p.m10762b(this.f7159w))) {
                this.f7133F.mo20741c(C3501p.m10762b(this.f7159w));
            }
            Set<String> j = this.f7133F.mo20760j();
            final WeakReference weakReference = new WeakReference(this.f7133F);
            for (String next : j) {
                if (!"subscribe_app_ad".equals(next) && !"adInfo".equals(next) && !"webview_time_track".equals(next) && !"download_app_ad".equals(next)) {
                    this.f7153q.mo20419a().mo16603a(next, (C2561e<?, ?>) new C2561e<JSONObject, JSONObject>() {
                        /* renamed from: a */
                        public JSONObject mo16564a(JSONObject jSONObject, C2562f fVar) throws Exception {
                            try {
                                C3890g gVar = (C3890g) weakReference.get();
                                if (gVar == null) {
                                    return null;
                                }
                                return gVar.mo20744c(mo16549a(), jSONObject);
                            } catch (Throwable unused) {
                                return null;
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: e */
    private void m8841e() {
        if (this.f7159w.mo19609L() == 4) {
            this.f7128A = C4027d.m13342a(this.f7147k, this.f7159w, "interaction");
        }
    }

    /* renamed from: f */
    private void m8844f() {
        int i = C3578m.m11241h().mo19962n(String.valueOf(C4014u.m13223f(this.f7159w))).f8783p;
        if (i >= 0) {
            this.f7160x.sendEmptyMessageDelayed(1, (long) (i * 1000));
        } else {
            C4020v.m13282a((View) this.f7144h, 0);
        }
    }

    /* renamed from: a */
    private void m8828a(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            this.f7148l = intent.getIntExtra("sdk_version", 1);
            this.f7151o = intent.getStringExtra("adid");
            this.f7152p = intent.getStringExtra("log_extra");
            this.f7155s = intent.getIntExtra("source", -1);
            this.f7161y = intent.getBooleanExtra("ad_pending_download", false);
            this.f7156t = intent.getStringExtra("url");
            this.f7130C = intent.getStringExtra("gecko_id");
            this.f7157u = intent.getStringExtra("web_title");
            if (C3953b.m12901c()) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.f7159w = C3423b.m10208a(new JSONObject(stringExtra));
                    } catch (Exception e) {
                        C2975l.m8388c("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                    }
                }
            } else {
                this.f7159w = C3645t.m11590a().mo20225c();
                C3645t.m11590a().mo20230h();
            }
        }
        if (bundle != null) {
            try {
                this.f7148l = bundle.getInt("sdk_version", 1);
                this.f7151o = bundle.getString("adid");
                this.f7152p = bundle.getString("log_extra");
                this.f7155s = bundle.getInt("source", -1);
                this.f7161y = bundle.getBoolean("ad_pending_download", false);
                this.f7156t = bundle.getString("url");
                this.f7157u = bundle.getString("web_title");
                String string = bundle.getString("material_meta", (String) null);
                if (!TextUtils.isEmpty(string)) {
                    this.f7159w = C3423b.m10208a(new JSONObject(string));
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f7159w == null) {
            C2975l.m8391e("TTPWPActivity", "material is null, no data to display");
            finish();
            return;
        }
        try {
            this.f7134G = C3578m.m11241h().mo19929b(Integer.parseInt(this.f7159w.mo19754x().getCodeId()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m8845g() {
        SSWebView sSWebView = this.f7140d;
        if (sSWebView != null) {
            sSWebView.setLandingPage(true);
            this.f7140d.setTag("landingpage");
            this.f7140d.setMaterialMeta(this.f7159w.mo19649aC());
            C3171n a = new C3171n(this, this.f7159w, this.f7140d.getWebView()).mo18777a(true);
            this.f7136I = a;
            a.mo18787a("embeded_ad");
            this.f7136I.mo18786a(this.f7135H);
            this.f7140d.setWebViewClient(new C3749d(this.f7147k, this.f7153q, this.f7151o, this.f7136I, true) {
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (TTPlayableLandingPageActivity.this.f7133F != null) {
                        TTPlayableLandingPageActivity.this.f7133F.mo20755g(str);
                    }
                }

                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0024 */
                /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[Catch:{ all -> 0x0055 }] */
                /* JADX WARNING: Removed duplicated region for block: B:14:0x003f A[Catch:{ all -> 0x0055 }] */
                /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
                    /*
                        r0 = this;
                        super.onPageFinished(r1, r2)
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this
                        boolean r1 = r1.isFinishing()
                        if (r1 == 0) goto L_0x000c
                        return
                    L_0x000c:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this
                        com.bytedance.sdk.openadsdk.j.g r1 = r1.f7133F
                        if (r1 == 0) goto L_0x001d
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this
                        com.bytedance.sdk.openadsdk.j.g r1 = r1.f7133F
                        r1.mo20756h((java.lang.String) r2)
                    L_0x001d:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0024 }
                        com.bytedance.sdk.openadsdk.g.d r1 = r1.f7139c     // Catch:{ all -> 0x0024 }
                        r1.mo18491b()     // Catch:{ all -> 0x0024 }
                    L_0x0024:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        android.widget.ProgressBar r1 = r1.f7149m     // Catch:{ all -> 0x0055 }
                        if (r1 == 0) goto L_0x0037
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        android.widget.ProgressBar r1 = r1.f7149m     // Catch:{ all -> 0x0055 }
                        r2 = 8
                        r1.setVisibility(r2)     // Catch:{ all -> 0x0055 }
                    L_0x0037:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        boolean r1 = r1.f7142f     // Catch:{ all -> 0x0055 }
                        if (r1 == 0) goto L_0x0055
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        r1.m8850i()     // Catch:{ all -> 0x0055 }
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        java.lang.String r2 = "py_loading_success"
                        r1.m8831a((java.lang.String) r2)     // Catch:{ all -> 0x0055 }
                        com.bytedance.sdk.openadsdk.core.w r1 = r0.f9741c     // Catch:{ all -> 0x0055 }
                        if (r1 == 0) goto L_0x0055
                        com.bytedance.sdk.openadsdk.core.w r1 = r0.f9741c     // Catch:{ all -> 0x0055 }
                        r2 = 1
                        r1.mo20445b((boolean) r2)     // Catch:{ all -> 0x0055 }
                    L_0x0055:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.C30879.onPageFinished(android.webkit.WebView, java.lang.String):void");
                }

                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    if (!(TTPlayableLandingPageActivity.this.f7156t == null || webResourceRequest == null || webResourceRequest.getUrl() == null || !TTPlayableLandingPageActivity.this.f7156t.equals(webResourceRequest.getUrl().toString()))) {
                        boolean unused = TTPlayableLandingPageActivity.this.f7142f = false;
                    }
                    if (!(TTPlayableLandingPageActivity.this.f7133F == null || webResourceRequest == null)) {
                        try {
                            TTPlayableLandingPageActivity.this.f7133F.mo20735a(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                        } catch (Throwable unused2) {
                        }
                    }
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }

                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    boolean unused = TTPlayableLandingPageActivity.this.f7142f = false;
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    boolean unused = TTPlayableLandingPageActivity.this.f7142f = false;
                    if (TTPlayableLandingPageActivity.this.f7133F != null) {
                        TTPlayableLandingPageActivity.this.f7133F.mo20732a(i, str, str2);
                    }
                }

                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TTPlayableLandingPageActivity.this.f7133F != null) {
                            TTPlayableLandingPageActivity.this.f7133F.mo20758i(str);
                        }
                    } catch (Exception unused) {
                    }
                    return super.shouldInterceptRequest(webView, str);
                }
            });
            m8829a(this.f7140d);
            m8829a(this.f7141e);
            m8852j();
            C4000j.m13115a(this.f7140d, this.f7156t);
            this.f7140d.setWebChromeClient(new C3748c(this.f7153q, this.f7136I) {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (!TTPlayableLandingPageActivity.this.isFinishing()) {
                        try {
                            TTPlayableLandingPageActivity.this.f7139c.mo18490a(i);
                        } catch (Throwable unused) {
                        }
                        if (TTPlayableLandingPageActivity.this.f7149m == null) {
                            return;
                        }
                        if (i != 100 || !TTPlayableLandingPageActivity.this.f7149m.isShown()) {
                            TTPlayableLandingPageActivity.this.f7149m.setProgress(i);
                            return;
                        }
                        TTPlayableLandingPageActivity.this.f7149m.setVisibility(8);
                        TTPlayableLandingPageActivity.this.m8850i();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putString("material_meta", this.f7159w != null ? this.f7159w.mo19674ar().toString() : null);
            bundle.putInt("sdk_version", this.f7148l);
            bundle.putString("adid", this.f7151o);
            bundle.putString("log_extra", this.f7152p);
            bundle.putInt("source", this.f7155s);
            bundle.putBoolean("ad_pending_download", this.f7161y);
            bundle.putString("url", this.f7156t);
            bundle.putString("web_title", this.f7157u);
            bundle.putString("event_tag", "embeded_ad");
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* renamed from: h */
    private void m8847h() {
        this.f7150n = (PlayableLoadingView) findViewById(C2984t.m8432e(this, "tt_playable_loading"));
        this.f7140d = (SSWebView) findViewById(C2984t.m8432e(this, "tt_browser_webview"));
        this.f7141e = (SSWebView) findViewById(C2984t.m8432e(this, "tt_browser_webview_loading"));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C2984t.m8432e(this, "tt_playable_ad_close_layout"));
        this.f7144h = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.f7135H != null) {
                        TTPlayableLandingPageActivity.this.f7135H.mo18829i();
                    }
                    TTPlayableLandingPageActivity.this.m8831a("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        this.f7149m = (ProgressBar) findViewById(C2984t.m8432e(this, "tt_browser_progress"));
        View findViewById = findViewById(C2984t.m8432e(this, "tt_playable_ad_dislike"));
        this.f7145i = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTPlayableLandingPageActivity.this.mo18548b();
            }
        });
        ImageView imageView = (ImageView) findViewById(C2984t.m8432e(this, "tt_playable_ad_mute"));
        this.f7146j = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                boolean unused = tTPlayableLandingPageActivity.f7134G = !tTPlayableLandingPageActivity.f7134G;
                TTPlayableLandingPageActivity tTPlayableLandingPageActivity2 = TTPlayableLandingPageActivity.this;
                tTPlayableLandingPageActivity2.mo18549b(tTPlayableLandingPageActivity2.f7134G);
                if (TTPlayableLandingPageActivity.this.f7133F != null) {
                    TTPlayableLandingPageActivity.this.f7133F.mo20730a(TTPlayableLandingPageActivity.this.f7134G);
                }
            }
        });
        this.f7140d.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f7141e.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        C4020v.m13282a((View) this.f7140d, 4);
        C4020v.m13282a((View) this.f7141e, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18546a() {
        if (this.f7150n != null) {
            C3498n nVar = this.f7159w;
            if (nVar == null || C3501p.m10765e(nVar)) {
                this.f7150n.mo20476b();
                if (this.f7150n.getPlayView() != null) {
                    C30813 r1 = new C3426a(this, this.f7159w, "embeded_ad", this.f7155s) {
                        /* renamed from: a */
                        public void mo18471a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, boolean z) {
                            if (this.f8263d == null || this.f8263d.mo19715i() != 1 || z) {
                                super.mo18471a(view, f, f2, f3, f4, sparseArray, z);
                                boolean unused = TTPlayableLandingPageActivity.this.f7161y = true;
                                boolean unused2 = TTPlayableLandingPageActivity.this.f7162z = true;
                                HashMap hashMap = new HashMap();
                                hashMap.put("playable_url", TTPlayableLandingPageActivity.this.f7156t);
                                TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                                C3156e.m9202e((Context) tTPlayableLandingPageActivity, tTPlayableLandingPageActivity.f7159w, this.f8264e, "click_playable_download_button_loading", (Map<String, Object>) hashMap);
                            }
                        }
                    };
                    r1.mo19402a(this.f7128A);
                    this.f7150n.getPlayView().setOnClickListener(r1);
                }
                if (C3501p.m10767g(this.f7159w)) {
                    this.f7160x.sendMessageDelayed(m8825a(2), 10000);
                    return;
                }
                return;
            }
            this.f7150n.mo20475a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m8850i() {
        SSWebView sSWebView;
        if (!this.f7129B.getAndSet(true) && (sSWebView = this.f7140d) != null && this.f7141e != null) {
            C4020v.m13282a((View) sSWebView, 0);
            C4020v.m13282a((View) this.f7141e, 8);
        }
    }

    /* renamed from: a */
    private void m8829a(SSWebView sSWebView) {
        if (sSWebView != null) {
            C3747b.m12300a(this.f7147k).mo20536a(false).mo20538b(false).mo20537a(sSWebView.getWebView());
            sSWebView.setUserAgentString(C3999i.m13113a(sSWebView.getWebView(), this.f7148l));
            if (Build.VERSION.SDK_INT >= 21) {
                sSWebView.setMixedContentMode(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8831a(String str) {
        C3156e.m9199c((Context) this, this.f7159w, "embeded_ad", str, (JSONObject) null);
    }

    /* renamed from: j */
    private void m8852j() {
        if (this.f7141e != null) {
            String k = m8853k();
            if (!TextUtils.isEmpty(k)) {
                this.f7141e.setWebViewClient(new C3749d(this.f7147k, this.f7154r, this.f7151o, (C3171n) null, false) {
                    public void onPageFinished(WebView webView, String str) {
                        super.onPageFinished(webView, str);
                        if (TTPlayableLandingPageActivity.this.f7143g) {
                            TTPlayableLandingPageActivity.this.m8831a("loading_h5_success");
                        }
                    }

                    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                        boolean unused = TTPlayableLandingPageActivity.this.f7143g = false;
                    }

                    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                        boolean unused = TTPlayableLandingPageActivity.this.f7143g = false;
                    }

                    public void onReceivedError(WebView webView, int i, String str, String str2) {
                        super.onReceivedError(webView, i, str, str2);
                        boolean unused = TTPlayableLandingPageActivity.this.f7143g = false;
                    }
                });
                this.f7141e.mo17925a(k);
            }
        }
    }

    /* renamed from: k */
    private String m8853k() {
        C3498n nVar;
        String j = C3578m.m11241h().mo19954j();
        if (TextUtils.isEmpty(j) || (nVar = this.f7159w) == null || nVar.mo19657aa() == null) {
            return j;
        }
        String b = this.f7159w.mo19657aa().mo19495b();
        double d = this.f7159w.mo19657aa().mo19500d();
        int e = this.f7159w.mo19657aa().mo19501e();
        String a = (this.f7159w.mo19610M() == null || TextUtils.isEmpty(this.f7159w.mo19610M().mo19559a())) ? "" : this.f7159w.mo19610M().mo19559a();
        String Y = this.f7159w.mo19622Y();
        String c = this.f7159w.mo19657aa().mo19498c();
        String a2 = this.f7159w.mo19657aa().mo19491a();
        String b2 = this.f7159w.mo19657aa().mo19495b();
        StringBuffer stringBuffer = new StringBuffer(j);
        stringBuffer.append("?appname=");
        stringBuffer.append(b);
        stringBuffer.append("&stars=");
        stringBuffer.append(d);
        stringBuffer.append("&comments=");
        stringBuffer.append(e);
        stringBuffer.append("&icon=");
        stringBuffer.append(a);
        stringBuffer.append("&downloading=");
        stringBuffer.append(false);
        stringBuffer.append("&id=");
        stringBuffer.append(Y);
        stringBuffer.append("&pkg_name=");
        stringBuffer.append(c);
        stringBuffer.append("&download_url=");
        stringBuffer.append(a2);
        stringBuffer.append("&name=");
        stringBuffer.append(b2);
        return stringBuffer.toString();
    }

    /* renamed from: l */
    private void m8855l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f7159w);
        this.f7135H = new C3185u(3, "embeded_ad", this.f7159w);
        C3728w wVar = new C3728w(this);
        this.f7153q = wVar;
        wVar.mo20443b(this.f7140d).mo20426a(this.f7159w).mo20434a((List<C3498n>) arrayList).mo20453d(this.f7151o).mo20457e(this.f7152p).mo20449c("embeded_ad").mo20442b(this.f7155s).mo20425a((C3431d) this).mo20424a(this.f7135H).mo20431a(this.f7139c).mo20423a(this.f7140d).mo20459f(C4014u.m13239i(this.f7159w));
        C3728w wVar2 = new C3728w(this);
        this.f7154r = wVar2;
        wVar2.mo20443b(this.f7141e).mo20426a(this.f7159w).mo20453d(this.f7151o).mo20457e(this.f7152p).mo20425a((C3431d) this).mo20442b(this.f7155s).mo20450c(false).mo20424a(this.f7135H).mo20423a(this.f7141e).mo20459f(C4014u.m13239i(this.f7159w));
        m8838d();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C3185u uVar = this.f7135H;
        if (uVar != null) {
            uVar.mo18831k();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C3728w wVar = this.f7153q;
        if (wVar != null) {
            wVar.mo20466l();
            SSWebView sSWebView = this.f7140d;
            if (sSWebView != null) {
                this.f7153q.mo20445b(sSWebView.getVisibility() == 0);
            }
        }
        C3728w wVar2 = this.f7154r;
        if (wVar2 != null) {
            wVar2.mo20466l();
        }
        C3890g gVar = this.f7133F;
        if (gVar != null) {
            gVar.mo20768r();
            this.f7133F.mo20737b(true);
        }
        C3171n nVar = this.f7136I;
        if (nVar != null) {
            nVar.mo18790d();
        }
        C3809g gVar2 = this.f7138b;
        if (gVar2 != null) {
            gVar2.mo20619a((C3808f) this);
            this.f7138b.mo20626e();
            if (this.f7138b.mo20628g() == 0) {
                this.f7134G = true;
            }
            mo18549b(this.f7134G);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C3645t.m11590a().mo20223b(true);
        C3728w wVar = this.f7153q;
        if (wVar != null) {
            wVar.mo20467m();
            this.f7153q.mo20445b(false);
        }
        C3728w wVar2 = this.f7154r;
        if (wVar2 != null) {
            wVar2.mo20467m();
        }
        C3890g gVar = this.f7133F;
        if (gVar != null) {
            gVar.mo20730a(true);
            this.f7133F.mo20767q();
            this.f7133F.mo20737b(false);
        }
        C3809g gVar2 = this.f7138b;
        if (gVar2 != null) {
            gVar2.mo20627f();
            this.f7138b.mo20619a((C3808f) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C3185u uVar = this.f7135H;
        if (uVar != null) {
            uVar.mo18830j();
        }
        C3171n nVar = this.f7136I;
        if (nVar != null) {
            nVar.mo18791e();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        C3185u uVar = this.f7135H;
        if (uVar != null) {
            uVar.mo18829i();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        C3185u uVar = this.f7135H;
        if (uVar != null) {
            uVar.mo18813a(true);
            this.f7135H.mo18833m();
        }
        C2989x xVar = this.f7160x;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages((Object) null);
        }
        try {
            if (!(getWindow() == null || (viewGroup = (ViewGroup) getWindow().getDecorView()) == null)) {
                viewGroup.removeAllViews();
            }
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.f7140d;
        if (sSWebView != null) {
            C3768z.m12384a(this.f7147k, sSWebView.getWebView());
            C3768z.m12385a(this.f7140d.getWebView());
            this.f7140d.mo17952l();
        }
        this.f7140d = null;
        C3728w wVar = this.f7153q;
        if (wVar != null) {
            wVar.mo20468n();
        }
        C3728w wVar2 = this.f7154r;
        if (wVar2 != null) {
            wVar2.mo20468n();
        }
        C3890g gVar = this.f7133F;
        if (gVar != null) {
            gVar.mo20772v();
        }
        C3171n nVar = this.f7136I;
        if (nVar != null) {
            nVar.mo18792f();
        }
        this.f7138b = null;
    }

    /* renamed from: a */
    public void mo17318a(Message message) {
        int i = message.what;
        if (i == 1) {
            C4020v.m13282a((View) this.f7144h, 0);
        } else if (i == 2) {
            C2975l.m8377a("playable hidden loading , type:" + message.arg1);
            HashMap hashMap = new HashMap();
            hashMap.put("remove_loading_page_type", Integer.valueOf(message.arg1));
            hashMap.put("playable_url", this.f7156t);
            C3156e.m9202e((Context) this, this.f7159w, "embeded_ad", "remove_loading_page", (Map<String, Object>) hashMap);
            this.f7160x.removeMessages(2);
            PlayableLoadingView playableLoadingView = this.f7150n;
            if (playableLoadingView != null) {
                playableLoadingView.mo20475a();
            }
        }
    }

    /* renamed from: a */
    public void mo18547a(boolean z) {
        C4026c cVar;
        this.f7161y = true;
        this.f7162z = z;
        if (!z) {
            try {
                Toast.makeText(this.f7147k, C2984t.m8425a(C3578m.m11231a(), "tt_toast_later_download"), 0).show();
            } catch (Throwable unused) {
            }
        }
        if (this.f7162z && (cVar = this.f7128A) != null) {
            cVar.mo20934d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18548b() {
        if (this.f7159w != null && !isFinishing()) {
            if (this.f7137a == null) {
                mo18550c();
            }
            this.f7137a.showDislikeDialog();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo18550c() {
        this.f7137a = new C3778b(this, this.f7159w);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18549b(boolean z) {
        int i;
        try {
            this.f7134G = z;
            if (z) {
                i = C2984t.m8431d(this.f7147k, "tt_mute");
            } else {
                i = C2984t.m8431d(this.f7147k, "tt_unmute");
            }
            this.f7146j.setImageResource(i);
            if (this.f7133F != null) {
                this.f7133F.mo20730a(z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void mo18428b(int i) {
        mo18549b(i <= 0);
    }
}
