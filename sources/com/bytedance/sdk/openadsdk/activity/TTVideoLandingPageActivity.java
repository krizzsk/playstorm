package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2523a;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2524b;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.component.adexpress.p096c.C2641a;
import com.bytedance.sdk.component.p110d.C2898j;
import com.bytedance.sdk.component.p110d.C2902n;
import com.bytedance.sdk.component.p110d.C2908t;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.C3728w;
import com.bytedance.sdk.openadsdk.core.C3768z;
import com.bytedance.sdk.openadsdk.core.p146b.C3426a;
import com.bytedance.sdk.openadsdk.core.p151e.C3469a;
import com.bytedance.sdk.openadsdk.core.p151e.C3470b;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3500o;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3695b;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.RoundImageView;
import com.bytedance.sdk.openadsdk.multipro.p183b.C3954a;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;
import com.bytedance.sdk.openadsdk.p130b.C3126a;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import com.bytedance.sdk.openadsdk.p130b.C3171n;
import com.bytedance.sdk.openadsdk.p167d.C3769a;
import com.bytedance.sdk.openadsdk.p168e.C3792d;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class TTVideoLandingPageActivity extends Activity implements C3792d {

    /* renamed from: A */
    protected ViewStub f7211A;

    /* renamed from: B */
    protected Button f7212B;

    /* renamed from: C */
    protected ProgressBar f7213C;

    /* renamed from: D */
    protected C4026c f7214D;

    /* renamed from: E */
    protected boolean f7215E = false;

    /* renamed from: F */
    protected String f7216F;

    /* renamed from: G */
    protected boolean f7217G = false;

    /* renamed from: H */
    protected boolean f7218H = true;

    /* renamed from: I */
    protected boolean f7219I = false;

    /* renamed from: J */
    protected String f7220J = null;

    /* renamed from: K */
    protected int f7221K;

    /* renamed from: L */
    protected C3954a f7222L;

    /* renamed from: M */
    protected C3171n f7223M;

    /* renamed from: N */
    protected AtomicBoolean f7224N = new AtomicBoolean(true);

    /* renamed from: O */
    protected JSONArray f7225O = null;

    /* renamed from: P */
    protected String f7226P;

    /* renamed from: Q */
    protected C3426a f7227Q = null;

    /* renamed from: R */
    private final C2526c.C2528b f7228R = new C2526c.C2528b() {
        /* renamed from: a */
        public void mo16466a(boolean z) {
            TTVideoLandingPageActivity.this.f7215E = z;
            if (TTVideoLandingPageActivity.this.isFinishing()) {
                return;
            }
            if (z) {
                C4020v.m13282a((View) TTVideoLandingPageActivity.this.f7231a, 8);
                C4020v.m13282a((View) TTVideoLandingPageActivity.this.f7241k, 8);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f7242l.getLayoutParams();
                TTVideoLandingPageActivity.this.f7248r = marginLayoutParams.leftMargin;
                TTVideoLandingPageActivity.this.f7247q = marginLayoutParams.topMargin;
                TTVideoLandingPageActivity.this.f7249s = marginLayoutParams.width;
                TTVideoLandingPageActivity.this.f7250t = marginLayoutParams.height;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.leftMargin = 0;
                TTVideoLandingPageActivity.this.f7242l.setLayoutParams(marginLayoutParams);
                return;
            }
            C4020v.m13282a((View) TTVideoLandingPageActivity.this.f7231a, 0);
            C4020v.m13282a((View) TTVideoLandingPageActivity.this.f7241k, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f7242l.getLayoutParams();
            marginLayoutParams2.width = TTVideoLandingPageActivity.this.f7249s;
            marginLayoutParams2.height = TTVideoLandingPageActivity.this.f7250t;
            marginLayoutParams2.leftMargin = TTVideoLandingPageActivity.this.f7248r;
            marginLayoutParams2.topMargin = TTVideoLandingPageActivity.this.f7247q;
            TTVideoLandingPageActivity.this.f7242l.setLayoutParams(marginLayoutParams2);
        }
    };

    /* renamed from: S */
    private boolean f7229S = false;

    /* renamed from: T */
    private final BroadcastReceiver f7230T = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                int i = 0;
                if (!intent.getBooleanExtra("noConnectivity", false)) {
                    NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                    if (networkInfo != null) {
                        int type = networkInfo.getType();
                        if (type == 1) {
                            i = 4;
                        } else if (type == 0) {
                            i = 1;
                        }
                    } else {
                        i = C2979o.m8409c(context);
                    }
                }
                if (!(TTVideoLandingPageActivity.this.f7221K != 0 || i == 0 || TTVideoLandingPageActivity.this.f7231a == null || TTVideoLandingPageActivity.this.f7220J == null)) {
                    TTVideoLandingPageActivity.this.f7231a.mo17925a(TTVideoLandingPageActivity.this.f7220J);
                }
                if (!(TTVideoLandingPageActivity.this.f7244n == null || TTVideoLandingPageActivity.this.f7244n.getNativeVideoController() == null || TTVideoLandingPageActivity.this.f7217G || TTVideoLandingPageActivity.this.f7221K == i)) {
                    ((C3695b) TTVideoLandingPageActivity.this.f7244n.getNativeVideoController()).mo20331a(context, i);
                }
                TTVideoLandingPageActivity.this.f7221K = i;
            }
        }
    };

    /* renamed from: a */
    protected SSWebView f7231a;

    /* renamed from: b */
    protected ImageView f7232b;

    /* renamed from: c */
    protected ImageView f7233c;

    /* renamed from: d */
    protected TextView f7234d;

    /* renamed from: e */
    protected Context f7235e;

    /* renamed from: f */
    protected int f7236f;

    /* renamed from: g */
    protected String f7237g;

    /* renamed from: h */
    protected String f7238h;

    /* renamed from: i */
    protected C3728w f7239i;

    /* renamed from: j */
    protected int f7240j;

    /* renamed from: k */
    protected RelativeLayout f7241k;

    /* renamed from: l */
    protected FrameLayout f7242l;

    /* renamed from: m */
    protected int f7243m = -1;

    /* renamed from: n */
    protected NativeVideoTsView f7244n;

    /* renamed from: o */
    protected long f7245o;

    /* renamed from: p */
    protected C3498n f7246p;

    /* renamed from: q */
    protected int f7247q = 0;

    /* renamed from: r */
    protected int f7248r = 0;

    /* renamed from: s */
    protected int f7249s = 0;

    /* renamed from: t */
    protected int f7250t = 0;

    /* renamed from: u */
    protected String f7251u = "ダウンロード";

    /* renamed from: v */
    protected RelativeLayout f7252v;

    /* renamed from: w */
    protected TextView f7253w;

    /* renamed from: x */
    protected RoundImageView f7254x;

    /* renamed from: y */
    protected TextView f7255y;

    /* renamed from: z */
    protected TextView f7256z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo18588a() {
        return "tt_activity_videolandingpage";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo18590c() {
        return "tt_titlebar_close";
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            boolean r0 = com.bytedance.sdk.openadsdk.TTAdSdk.isInitSuccess()
            if (r0 != 0) goto L_0x000c
            r12.finish()
        L_0x000c:
            android.view.Window r0 = r12.getWindow()     // Catch:{ all -> 0x0015 }
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.addFlags(r1)     // Catch:{ all -> 0x0015 }
        L_0x0015:
            com.bytedance.sdk.openadsdk.core.C3578m.m11233a(r12)     // Catch:{ all -> 0x0018 }
        L_0x0018:
            android.content.Context r0 = r12.getApplicationContext()
            int r0 = com.bytedance.sdk.component.utils.C2979o.m8409c(r0)
            r12.f7221K = r0
            java.lang.String r0 = r12.mo18588a()
            int r0 = com.bytedance.sdk.component.utils.C2984t.m8433f(r12, r0)
            r12.setContentView(r0)
            r12.f7235e = r12
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r1 = "sdk_version"
            r2 = 1
            int r1 = r0.getIntExtra(r1, r2)
            r12.f7236f = r1
            java.lang.String r1 = "adid"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.f7237g = r1
            java.lang.String r1 = "log_extra"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.f7238h = r1
            r1 = -1
            java.lang.String r3 = "source"
            int r1 = r0.getIntExtra(r3, r1)
            r12.f7240j = r1
            java.lang.String r1 = "url"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.f7220J = r1
            java.lang.String r1 = "web_title"
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r3 = "event_tag"
            java.lang.String r3 = r0.getStringExtra(r3)
            r12.f7216F = r3
            java.lang.String r3 = "gecko_id"
            java.lang.String r3 = r0.getStringExtra(r3)
            r12.f7226P = r3
            java.lang.String r3 = "video_is_auto_play"
            boolean r3 = r0.getBooleanExtra(r3, r2)
            r12.f7219I = r3
            r3 = 0
            java.lang.String r5 = "video_play_position"
            if (r13 == 0) goto L_0x008f
            long r6 = r13.getLong(r5)
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x008f
            long r6 = r13.getLong(r5, r3)
            r12.f7245o = r6
        L_0x008f:
            java.lang.String r6 = "multi_process_data"
            java.lang.String r6 = r0.getStringExtra(r6)
            boolean r7 = com.bytedance.sdk.openadsdk.multipro.C3953b.m12901c()
            if (r7 == 0) goto L_0x00b9
            java.lang.String r7 = "multi_process_materialmeta"
            java.lang.String r0 = r0.getStringExtra(r7)
            if (r0 == 0) goto L_0x00ae
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ae }
            r7.<init>(r0)     // Catch:{ Exception -> 0x00ae }
            com.bytedance.sdk.openadsdk.core.e.n r0 = com.bytedance.sdk.openadsdk.core.C3423b.m10208a((org.json.JSONObject) r7)     // Catch:{ Exception -> 0x00ae }
            r12.f7246p = r0     // Catch:{ Exception -> 0x00ae }
        L_0x00ae:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f7246p
            if (r0 == 0) goto L_0x00d2
            int r0 = r0.mo19660ad()
            r12.f7243m = r0
            goto L_0x00d2
        L_0x00b9:
            com.bytedance.sdk.openadsdk.core.t r0 = com.bytedance.sdk.openadsdk.core.C3645t.m11590a()
            com.bytedance.sdk.openadsdk.core.e.n r0 = r0.mo20225c()
            r12.f7246p = r0
            if (r0 == 0) goto L_0x00cb
            int r0 = r0.mo19660ad()
            r12.f7243m = r0
        L_0x00cb:
            com.bytedance.sdk.openadsdk.core.t r0 = com.bytedance.sdk.openadsdk.core.C3645t.m11590a()
            r0.mo20230h()
        L_0x00d2:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f7246p
            if (r0 != 0) goto L_0x00da
            r12.finish()
            return
        L_0x00da:
            if (r6 == 0) goto L_0x00ef
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e7 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x00e7 }
            com.bytedance.sdk.openadsdk.multipro.b.a r0 = com.bytedance.sdk.openadsdk.multipro.p183b.C3954a.m12902a((org.json.JSONObject) r0)     // Catch:{ Exception -> 0x00e7 }
            r12.f7222L = r0     // Catch:{ Exception -> 0x00e7 }
        L_0x00e7:
            com.bytedance.sdk.openadsdk.multipro.b.a r0 = r12.f7222L
            if (r0 == 0) goto L_0x00ef
            long r6 = r0.f10174g
            r12.f7245o = r6
        L_0x00ef:
            if (r13 == 0) goto L_0x0115
            java.lang.String r0 = "material_meta"
            java.lang.String r0 = r13.getString(r0)
            com.bytedance.sdk.openadsdk.core.e.n r6 = r12.f7246p
            if (r6 != 0) goto L_0x0106
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x0106 }
            r6.<init>(r0)     // Catch:{ all -> 0x0106 }
            com.bytedance.sdk.openadsdk.core.e.n r0 = com.bytedance.sdk.openadsdk.core.C3423b.m10208a((org.json.JSONObject) r6)     // Catch:{ all -> 0x0106 }
            r12.f7246p = r0     // Catch:{ all -> 0x0106 }
        L_0x0106:
            long r5 = r13.getLong(r5)
            java.lang.String r0 = "is_complete"
            r13.getBoolean(r0)
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x0115
            r12.f7245o = r5
        L_0x0115:
            r12.mo18591d()
            r12.mo18597j()
            r12.m8929n()
            r13 = 4
            r12.m8921a((int) r13)
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            r3 = 0
            if (r13 < r0) goto L_0x012b
            r13 = r2
            goto L_0x012c
        L_0x012b:
            r13 = r3
        L_0x012c:
            com.bytedance.sdk.component.widget.SSWebView r0 = r12.f7231a
            java.lang.String r4 = "landingpage_split_screen"
            if (r0 == 0) goto L_0x015f
            android.content.Context r0 = r12.f7235e
            com.bytedance.sdk.openadsdk.core.widget.a.b r0 = com.bytedance.sdk.openadsdk.core.widget.p166a.C3747b.m12300a((android.content.Context) r0)
            com.bytedance.sdk.openadsdk.core.widget.a.b r13 = r0.mo20536a((boolean) r13)
            com.bytedance.sdk.openadsdk.core.widget.a.b r13 = r13.mo20538b((boolean) r3)
            com.bytedance.sdk.component.widget.SSWebView r0 = r12.f7231a
            android.webkit.WebView r0 = r0.getWebView()
            r13.mo20537a((android.webkit.WebView) r0)
            com.bytedance.sdk.openadsdk.b.n r13 = new com.bytedance.sdk.openadsdk.b.n
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f7246p
            com.bytedance.sdk.component.widget.SSWebView r5 = r12.f7231a
            android.webkit.WebView r5 = r5.getWebView()
            r13.<init>(r12, r0, r5)
            com.bytedance.sdk.openadsdk.b.n r13 = r13.mo18777a((boolean) r2)
            r12.f7223M = r13
            r13.mo18787a((java.lang.String) r4)
        L_0x015f:
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7231a
            r13.setLandingPage(r2)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7231a
            r13.setTag(r4)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7231a
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f7246p
            com.bytedance.sdk.component.widget.b.a r0 = r0.mo19649aC()
            r13.setMaterialMeta(r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7231a
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$1 r0 = new com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$1
            android.content.Context r7 = r12.f7235e
            com.bytedance.sdk.openadsdk.core.w r8 = r12.f7239i
            java.lang.String r9 = r12.f7237g
            com.bytedance.sdk.openadsdk.b.n r10 = r12.f7223M
            r11 = 1
            r5 = r0
            r6 = r12
            r5.<init>(r7, r8, r9, r10, r11)
            r13.setWebViewClient(r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7231a
            if (r13 == 0) goto L_0x019a
            android.webkit.WebView r0 = r13.getWebView()
            int r2 = r12.f7236f
            java.lang.String r0 = com.bytedance.sdk.openadsdk.utils.C3999i.m13113a((android.webkit.WebView) r0, (int) r2)
            r13.setUserAgentString(r0)
        L_0x019a:
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r13 < r0) goto L_0x01a5
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7231a
            r13.setMixedContentMode(r3)
        L_0x01a5:
            android.content.Context r13 = r12.f7235e
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f7246p
            com.bytedance.sdk.openadsdk.p130b.C3156e.m9166a((android.content.Context) r13, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r0, (java.lang.String) r4)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7231a
            java.lang.String r0 = r12.f7220J
            com.bytedance.sdk.openadsdk.utils.C4000j.m13115a(r13, r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7231a
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$3 r0 = new com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$3
            com.bytedance.sdk.openadsdk.core.w r2 = r12.f7239i
            com.bytedance.sdk.openadsdk.b.n r3 = r12.f7223M
            r0.<init>(r2, r3)
            r13.setWebChromeClient(r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7231a
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$4 r0 = new com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$4
            r0.<init>()
            r13.setDownloadListener(r0)
            android.widget.TextView r13 = r12.f7234d
            if (r13 == 0) goto L_0x01de
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x01db
            java.lang.String r0 = "tt_web_title_default"
            java.lang.String r1 = com.bytedance.sdk.component.utils.C2984t.m8425a(r12, r0)
        L_0x01db:
            r13.setText(r1)
        L_0x01de:
            r12.mo18598k()
            r12.mo18592e()
            r12.m8928m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: m */
    private void m8928m() {
        C3498n nVar = this.f7246p;
        if (nVar != null && nVar.mo19609L() == 4) {
            this.f7211A.setVisibility(0);
            Button button = (Button) findViewById(C2984t.m8432e(this, "tt_browser_download_btn"));
            this.f7212B = button;
            if (button != null) {
                m8924a(mo18589b());
                this.f7212B.setOnClickListener(this.f7227Q);
                this.f7212B.setOnTouchListener(this.f7227Q);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo18589b() {
        C3498n nVar = this.f7246p;
        if (nVar != null && !TextUtils.isEmpty(nVar.mo19620W())) {
            this.f7251u = this.f7246p.mo19620W();
        }
        return this.f7251u;
    }

    /* renamed from: a */
    private void m8924a(final String str) {
        Button button;
        if (!TextUtils.isEmpty(str) && (button = this.f7212B) != null) {
            button.post(new Runnable() {
                public void run() {
                    if (TTVideoLandingPageActivity.this.f7212B != null && !TTVideoLandingPageActivity.this.isFinishing()) {
                        TTVideoLandingPageActivity.this.f7212B.setText(str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18591d() {
        this.f7213C = (ProgressBar) findViewById(C2984t.m8432e(this, "tt_browser_progress"));
        this.f7211A = (ViewStub) findViewById(C2984t.m8432e(this, "tt_browser_download_btn_stub"));
        this.f7231a = (SSWebView) findViewById(C2984t.m8432e(this, "tt_browser_webview"));
        ImageView imageView = (ImageView) findViewById(C2984t.m8432e(this, "tt_titlebar_back"));
        this.f7232b = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTVideoLandingPageActivity.this.f7231a == null) {
                        return;
                    }
                    if (TTVideoLandingPageActivity.this.f7231a.mo17936e()) {
                        TTVideoLandingPageActivity.this.f7231a.mo17937f();
                    } else if (TTVideoLandingPageActivity.this.m8933r()) {
                        TTVideoLandingPageActivity.this.onBackPressed();
                    } else {
                        Map<String, Object> map = null;
                        if (!(TTVideoLandingPageActivity.this.f7244n == null || TTVideoLandingPageActivity.this.f7244n.getNativeVideoController() == null)) {
                            map = C4014u.m13186a(TTVideoLandingPageActivity.this.f7246p, TTVideoLandingPageActivity.this.f7244n.getNativeVideoController().mo16450h(), TTVideoLandingPageActivity.this.f7244n.getNativeVideoController().mo16456n());
                        }
                        TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                        C3156e.m9170a((Context) tTVideoLandingPageActivity, tTVideoLandingPageActivity.f7246p, "embeded_ad", "detail_back", TTVideoLandingPageActivity.this.mo18594g(), TTVideoLandingPageActivity.this.mo18595h(), map, (C3167j) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        NativeVideoTsView nativeVideoTsView = this.f7244n;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.setIsAutoPlay(this.f7219I);
        }
        ImageView imageView2 = (ImageView) findViewById(C2984t.m8432e(this, mo18590c()));
        this.f7233c = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTVideoLandingPageActivity.this.f7244n != null) {
                        Map<String, Object> map = null;
                        if (TTVideoLandingPageActivity.this.f7244n.getNativeVideoController() != null) {
                            map = C4014u.m13186a(TTVideoLandingPageActivity.this.f7246p, TTVideoLandingPageActivity.this.f7244n.getNativeVideoController().mo16450h(), TTVideoLandingPageActivity.this.f7244n.getNativeVideoController().mo16456n());
                        }
                        TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                        C3156e.m9170a((Context) tTVideoLandingPageActivity, tTVideoLandingPageActivity.f7246p, "embeded_ad", "detail_skip", TTVideoLandingPageActivity.this.mo18594g(), TTVideoLandingPageActivity.this.mo18595h(), map, (C3167j) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.f7234d = (TextView) findViewById(C2984t.m8432e(this, "tt_titlebar_title"));
        this.f7242l = (FrameLayout) findViewById(C2984t.m8432e(this, "tt_native_video_container"));
        this.f7241k = (RelativeLayout) findViewById(C2984t.m8432e(this, "tt_native_video_titlebar"));
        this.f7252v = (RelativeLayout) findViewById(C2984t.m8432e(this, "tt_rl_download"));
        this.f7253w = (TextView) findViewById(C2984t.m8432e(this, "tt_video_btn_ad_image_tv"));
        this.f7255y = (TextView) findViewById(C2984t.m8432e(this, "tt_video_ad_name"));
        this.f7256z = (TextView) findViewById(C2984t.m8432e(this, "tt_video_ad_button"));
        this.f7254x = (RoundImageView) findViewById(C2984t.m8432e(this, "tt_video_ad_logo_image"));
        mo18596i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m8928m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo18592e() {
        if (mo18593f()) {
            try {
                NativeVideoTsView nativeVideoTsView = new NativeVideoTsView(this.f7235e, this.f7246p, true, (C3167j) null);
                this.f7244n = nativeVideoTsView;
                if (nativeVideoTsView.getNativeVideoController() != null) {
                    this.f7244n.getNativeVideoController().mo16434a(false);
                }
                if (this.f7217G) {
                    this.f7242l.setVisibility(0);
                    this.f7242l.removeAllViews();
                    this.f7242l.addView(this.f7244n);
                    this.f7244n.mo20297b(true);
                } else {
                    if (!this.f7219I) {
                        this.f7245o = 0;
                    }
                    if (!(this.f7222L == null || this.f7244n.getNativeVideoController() == null)) {
                        this.f7244n.getNativeVideoController().mo16438b(this.f7222L.f10174g);
                        this.f7244n.getNativeVideoController().mo16442c(this.f7222L.f10172e);
                        this.f7244n.setIsQuiet(C3578m.m11241h().mo19927a(C4014u.m13223f(this.f7246p)));
                    }
                    if (this.f7244n.mo20296a(this.f7245o, this.f7218H, this.f7217G)) {
                        this.f7242l.setVisibility(0);
                        this.f7242l.removeAllViews();
                        this.f7242l.addView(this.f7244n);
                    }
                    if (this.f7244n.getNativeVideoController() != null) {
                        this.f7244n.getNativeVideoController().mo16434a(false);
                        this.f7244n.getNativeVideoController().mo16431a(this.f7228R);
                    }
                }
                C3769a.m12389a().mo17677a(this.f7246p.mo19613P().get(0).mo19559a()).mo17716a(C2908t.BITMAP).mo17711a((C2902n) new C2902n<Bitmap>() {
                    /* renamed from: a */
                    public void mo17256a(int i, String str, Throwable th) {
                    }

                    /* renamed from: a */
                    public void mo17257a(C2898j<Bitmap> jVar) {
                        try {
                            Bitmap b = jVar.mo17725b();
                            if (Build.VERSION.SDK_INT >= 17) {
                                new C3107a(b, TTVideoLandingPageActivity.this.f7244n.getNativeVideoController().mo16457o()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                this.f7244n.findViewById(C2984t.m8432e(this.f7235e, "tt_root_view")).setOnTouchListener((View.OnTouchListener) null);
                this.f7244n.findViewById(C2984t.m8432e(this.f7235e, "tt_root_view")).setOnClickListener((View.OnClickListener) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.f7221K == 0) {
                try {
                    Toast.makeText(this, C2984t.m8428b(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo18593f() {
        return this.f7243m == 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public long mo18594g() {
        NativeVideoTsView nativeVideoTsView = this.f7244n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0;
        }
        return this.f7244n.getNativeVideoController().mo16452j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo18595h() {
        NativeVideoTsView nativeVideoTsView = this.f7244n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0;
        }
        return this.f7244n.getNativeVideoController().mo16454l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo18596i() {
        String str;
        C3498n nVar = this.f7246p;
        if (nVar != null && nVar.mo19609L() == 4) {
            C4020v.m13282a((View) this.f7252v, 0);
            if (!TextUtils.isEmpty(this.f7246p.mo19618U())) {
                str = this.f7246p.mo19618U();
            } else if (!TextUtils.isEmpty(this.f7246p.mo19619V())) {
                str = this.f7246p.mo19619V();
            } else {
                str = !TextUtils.isEmpty(this.f7246p.mo19608K()) ? this.f7246p.mo19608K() : "";
            }
            if (this.f7246p.mo19610M() != null && this.f7246p.mo19610M().mo19559a() != null) {
                C4020v.m13282a((View) this.f7254x, 0);
                C4020v.m13282a((View) this.f7253w, 4);
                C3854d.m12660a().mo20703a(this.f7246p.mo19610M(), (ImageView) this.f7254x);
            } else if (!TextUtils.isEmpty(str)) {
                C4020v.m13282a((View) this.f7254x, 4);
                C4020v.m13282a((View) this.f7253w, 0);
                this.f7253w.setText(str.substring(0, 1));
            }
            if (!TextUtils.isEmpty(this.f7246p.mo19620W())) {
                this.f7256z.setText(this.f7246p.mo19620W());
            }
            if (!TextUtils.isEmpty(str)) {
                this.f7255y.setText(str);
            }
            C4020v.m13282a((View) this.f7255y, 0);
            C4020v.m13282a((View) this.f7256z, 0);
        }
    }

    /* renamed from: j */
    public void mo18597j() {
        C3498n nVar = this.f7246p;
        if (nVar != null) {
            this.f7214D = C4027d.m13342a(this, nVar, this.f7216F);
            C3426a aVar = new C3426a(this, this.f7246p, this.f7216F, this.f7240j);
            this.f7227Q = aVar;
            aVar.mo19387a(false);
            this.f7227Q.mo19391c(true);
            this.f7256z.setOnClickListener(this.f7227Q);
            this.f7256z.setOnTouchListener(this.f7227Q);
            this.f7227Q.mo19402a(this.f7214D);
        }
    }

    /* renamed from: n */
    private void m8929n() {
        C3728w wVar = new C3728w(this);
        this.f7239i = wVar;
        wVar.mo20443b(this.f7231a).mo20453d(this.f7237g).mo20457e(this.f7238h).mo20442b(this.f7240j).mo20426a(this.f7246p).mo20420a(this.f7246p.mo19603F()).mo20423a(this.f7231a).mo20449c("landingpage_split_screen").mo20459f(C4014u.m13239i(this.f7246p));
    }

    public void onBackPressed() {
        NativeVideoTsView nativeVideoTsView;
        if (this.f7215E && (nativeVideoTsView = this.f7244n) != null && nativeVideoTsView.getNativeVideoController() != null) {
            ((C2523a) this.f7244n.getNativeVideoController()).mo16421e((C2524b) null, (View) null);
            this.f7215E = false;
        } else if (!m8933r() || this.f7224N.getAndSet(true)) {
            super.onBackPressed();
        } else {
            m8925a(true);
            m8921a(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        C3498n nVar = this.f7246p;
        bundle.putString("material_meta", nVar != null ? nVar.mo19674ar().toString() : null);
        bundle.putLong("video_play_position", this.f7245o);
        bundle.putBoolean("is_complete", this.f7217G);
        long j = this.f7245o;
        NativeVideoTsView nativeVideoTsView = this.f7244n;
        if (!(nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null)) {
            j = this.f7244n.getNativeVideoController().mo16449g();
        }
        bundle.putLong("video_play_position", j);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f7218H) {
            m8930o();
        }
        this.f7218H = false;
        C3728w wVar = this.f7239i;
        if (wVar != null) {
            wVar.mo20466l();
        }
        C3171n nVar = this.f7223M;
        if (nVar != null) {
            nVar.mo18790d();
        }
        m8934s();
    }

    /* renamed from: o */
    private void m8930o() {
        NativeVideoTsView nativeVideoTsView = this.f7244n;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null && !m8932q()) {
            this.f7244n.mo20306l();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        NativeVideoTsView nativeVideoTsView;
        NativeVideoTsView nativeVideoTsView2;
        super.onPause();
        C3728w wVar = this.f7239i;
        if (wVar != null) {
            wVar.mo20467m();
        }
        m8931p();
        if (this.f7217G || !((nativeVideoTsView2 = this.f7244n) == null || nativeVideoTsView2.getNativeVideoController() == null || !this.f7244n.getNativeVideoController().mo16459q())) {
            this.f7217G = true;
            C3966a.m12967a("sp_multi_native_video_data", "key_video_is_update_flag", (Boolean) true);
            C3966a.m12967a("sp_multi_native_video_data", "key_native_video_complete", (Boolean) true);
            C3966a.m12967a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", (Boolean) true);
        }
        if (!this.f7217G && (nativeVideoTsView = this.f7244n) != null && nativeVideoTsView.getNativeVideoController() != null) {
            m8922a(this.f7244n.getNativeVideoController());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C3171n nVar = this.f7223M;
        if (nVar != null) {
            nVar.mo18791e();
        }
    }

    /* renamed from: a */
    private void m8922a(C2526c cVar) {
        C3966a.m12967a("sp_multi_native_video_data", "key_video_is_update_flag", (Boolean) true);
        C3966a.m12967a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", (Boolean) true);
        C3966a.m12967a("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(cVar.mo16459q()));
        C3966a.m12970a("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(cVar.mo16449g()));
        C3966a.m12970a("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(cVar.mo16452j() + cVar.mo16450h()));
        C3966a.m12970a("sp_multi_native_video_data", "key_video_duration", Long.valueOf(cVar.mo16452j()));
    }

    /* renamed from: p */
    private void m8931p() {
        if (this.f7244n != null && !m8932q()) {
            this.f7244n.mo20306l();
        }
    }

    /* renamed from: q */
    private boolean m8932q() {
        NativeVideoTsView nativeVideoTsView = this.f7244n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return true;
        }
        return this.f7244n.getNativeVideoController().mo16459q();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        mo18599l();
        try {
            if (!(getWindow() == null || (viewGroup = (ViewGroup) getWindow().getDecorView()) == null)) {
                viewGroup.removeAllViews();
            }
            this.f7246p.mo19646a(false);
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.f7231a;
        if (sSWebView != null) {
            C3768z.m12384a(this.f7235e, sSWebView.getWebView());
            C3768z.m12385a(this.f7231a.getWebView());
        }
        this.f7231a = null;
        C3728w wVar = this.f7239i;
        if (wVar != null) {
            wVar.mo20468n();
        }
        NativeVideoTsView nativeVideoTsView = this.f7244n;
        if (!(nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null)) {
            this.f7244n.getNativeVideoController().mo16448f();
        }
        this.f7244n = null;
        this.f7246p = null;
        C3171n nVar = this.f7223M;
        if (nVar != null) {
            nVar.mo18792f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo18598k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            this.f7235e.registerReceiver(this.f7230T, intentFilter);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo18599l() {
        try {
            this.f7235e.unregisterReceiver(this.f7230T);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public boolean m8933r() {
        return !TextUtils.isEmpty(this.f7220J) && this.f7220J.contains("__luban_sdk");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8921a(int i) {
        if (this.f7233c != null && m8933r()) {
            C4020v.m13282a((View) this.f7233c, i);
        }
    }

    /* renamed from: a */
    private void m8925a(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", z);
            this.f7239i.mo20439a("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: s */
    private void m8934s() {
        if (this.f7246p != null) {
            JSONArray b = m8927b(this.f7220J);
            int f = C4014u.m13223f(this.f7246p);
            int e = C4014u.m13219e(this.f7246p);
            C3581n<C3126a> f2 = C3578m.m11239f();
            if (b != null && f2 != null && f > 0 && e > 0) {
                C3500o oVar = new C3500o();
                oVar.f8659e = b;
                AdSlot x = this.f7246p.mo19754x();
                if (x != null) {
                    x.setAdCount(6);
                    f2.mo20073a(x, oVar, e, new C3581n.C3582a() {
                        /* renamed from: a */
                        public void mo18544a(int i, String str) {
                            TTVideoLandingPageActivity.this.m8921a(0);
                        }

                        /* renamed from: a */
                        public void mo18545a(C3469a aVar, C3470b bVar) {
                            if (aVar != null) {
                                try {
                                    TTVideoLandingPageActivity.this.f7224N.set(false);
                                    TTVideoLandingPageActivity.this.f7239i.mo20444b(new JSONObject(aVar.mo19479c()));
                                } catch (Exception unused) {
                                    TTVideoLandingPageActivity.this.m8921a(0);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    private JSONArray m8927b(String str) {
        int i;
        JSONArray jSONArray = this.f7225O;
        if (jSONArray != null && jSONArray.length() > 0) {
            return this.f7225O;
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

    /* renamed from: a */
    public void mo18527a(boolean z, JSONArray jSONArray) {
        if (z && jSONArray != null && jSONArray.length() > 0) {
            this.f7225O = jSONArray;
            m8934s();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$a */
    private static class C3107a extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: a */
        private Bitmap f7268a;

        /* renamed from: b */
        private WeakReference<C2524b> f7269b;

        private C3107a(Bitmap bitmap, C2524b bVar) {
            this.f7268a = bitmap;
            this.f7269b = new WeakReference<>(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap a = C2641a.m6893a(C3578m.m11231a(), this.f7268a, 25);
                if (a == null) {
                    return null;
                }
                return new BitmapDrawable(C3578m.m11231a().getResources(), a);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Drawable drawable) {
            WeakReference<C2524b> weakReference;
            if (drawable != null && (weakReference = this.f7269b) != null && weakReference.get() != null) {
                ((C2524b) this.f7269b.get()).mo16424a(drawable);
            }
        }
    }
}
