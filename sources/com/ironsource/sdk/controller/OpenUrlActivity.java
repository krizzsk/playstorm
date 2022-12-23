package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.sdk.p289d.C8315b;
import com.ironsource.sdk.utils.C8392b;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.List;

public class OpenUrlActivity extends Activity {

    /* renamed from: a */
    private static final int f19525a = SDKUtils.generateViewId();

    /* renamed from: b */
    private static final int f19526b = SDKUtils.generateViewId();

    /* renamed from: c */
    private WebView f19527c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C8252x f19528d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ProgressBar f19529e;

    /* renamed from: f */
    private boolean f19530f;

    /* renamed from: g */
    private RelativeLayout f19531g;

    /* renamed from: h */
    private String f19532h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f19533i = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f19534j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Runnable f19535k = new Runnable() {
        public final void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f19534j));
        }
    };

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$a */
    class C8184a extends WebViewClient {
        private C8184a() {
        }

        /* synthetic */ C8184a(OpenUrlActivity openUrlActivity, byte b) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f19529e.setVisibility(4);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f19529e.setVisibility(0);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.m24026e("OpenUrlActivity", "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            List<String> b = C8392b.m24037a().mo56914b();
            if (!b.isEmpty()) {
                for (String contains : b) {
                    if (str.contains(contains)) {
                        try {
                            OpenUrlActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            OpenUrlActivity.this.f19528d.mo56627i();
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            if (e instanceof ActivityNotFoundException) {
                                sb.append("no activity to handle url");
                            } else {
                                sb.append("activity failed to open with unspecified reason");
                            }
                            if (OpenUrlActivity.this.f19528d != null) {
                                C8252x d = OpenUrlActivity.this.f19528d;
                                String sb2 = sb.toString();
                                if (TextUtils.isEmpty(str)) {
                                    str = "unknown url";
                                }
                                d.mo56622b(C8252x.m23704b("failedToStartStoreActivity", C8252x.m23688a("errMsg", TextUtils.isEmpty(sb2) ? "activity failed to open with unspecified reason" : sb2, "url", str, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                            }
                        }
                        OpenUrlActivity.this.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public void finish() {
        C8252x xVar;
        if (this.f19530f && (xVar = this.f19528d) != null) {
            xVar.mo56625e("secondaryClose");
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f19527c.stopLoading();
        this.f19527c.clearHistory();
        try {
            this.f19527c.loadUrl(str);
        } catch (Throwable th) {
            Logger.m24026e("OpenUrlActivity", "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    public void onBackPressed() {
        if (this.f19527c.canGoBack()) {
            this.f19527c.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.m24028i("OpenUrlActivity", "onCreate()");
        try {
            this.f19528d = (C8252x) C8315b.m23813a((Context) this).f19914a.f19576a;
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            Bundle extras = getIntent().getExtras();
            this.f19532h = extras.getString(C8252x.f19739c);
            this.f19530f = extras.getBoolean(C8252x.f19740d);
            boolean booleanExtra = getIntent().getBooleanExtra("immersive", false);
            this.f19534j = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                    public final void onSystemUiVisibilityChange(int i) {
                        if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                            OpenUrlActivity.this.f19533i.removeCallbacks(OpenUrlActivity.this.f19535k);
                            OpenUrlActivity.this.f19533i.postDelayed(OpenUrlActivity.this.f19535k, 500);
                        }
                    }
                });
                runOnUiThread(this.f19535k);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f19531g = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f19527c;
        if (webView != null) {
            webView.destroy();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f19534j && (i == 25 || i == 24)) {
            this.f19533i.postDelayed(this.f19535k, 500);
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        C8252x xVar = this.f19528d;
        if (xVar != null) {
            xVar.mo56619a(false, "secondary");
            if (this.f19531g != null && (viewGroup = (ViewGroup) this.f19527c.getParent()) != null) {
                if (viewGroup.findViewById(f19525a) != null) {
                    viewGroup.removeView(this.f19527c);
                }
                if (viewGroup.findViewById(f19526b) != null) {
                    viewGroup.removeView(this.f19529e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f19527c == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f19527c = webView;
            webView.setId(f19525a);
            this.f19527c.getSettings().setJavaScriptEnabled(true);
            this.f19527c.setWebViewClient(new C8184a(this, (byte) 0));
            loadUrl(this.f19532h);
        }
        if (findViewById(f19525a) == null) {
            this.f19531g.addView(this.f19527c, new RelativeLayout.LayoutParams(-1, -1));
        }
        if (this.f19529e == null) {
            this.f19529e = Build.VERSION.SDK_INT >= 11 ? new ProgressBar(new ContextThemeWrapper(this, 16973939)) : new ProgressBar(this);
            this.f19529e.setId(f19526b);
        }
        if (findViewById(f19526b) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f19529e.setLayoutParams(layoutParams);
            this.f19529e.setVisibility(4);
            this.f19531g.addView(this.f19529e);
        }
        C8252x xVar = this.f19528d;
        if (xVar != null) {
            xVar.mo56619a(true, "secondary");
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f19534j && z) {
            runOnUiThread(this.f19535k);
        }
    }
}
