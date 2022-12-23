package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3640q;
import com.bytedance.sdk.openadsdk.utils.C4020v;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.b */
/* compiled from: PrivacyProtectDialog */
public class C3750b extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f9747a;

    /* renamed from: b */
    private String f9748b;

    /* renamed from: c */
    private String f9749c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3755c f9750d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3754b f9751e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public RelativeLayout f9752f;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.b$b */
    /* compiled from: PrivacyProtectDialog */
    public interface C3754b {
        /* renamed from: a */
        void mo18508a();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.b$c */
    /* compiled from: PrivacyProtectDialog */
    public interface C3755c {
        /* renamed from: a */
        void mo18507a();
    }

    public C3750b(Context context) {
        super(context, C2984t.m8434g(context, "tt_privacy_dialogTheme"));
        this.f9747a = context;
    }

    /* renamed from: a */
    public C3750b mo20547a(String str, C3755c cVar) {
        this.f9748b = str;
        this.f9750d = cVar;
        return this;
    }

    /* renamed from: a */
    public C3750b mo20546a(String str, C3754b bVar) {
        this.f9749c = str;
        this.f9751e = bVar;
        return this;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12310a();
        m12313b();
    }

    /* renamed from: a */
    private void m12310a() {
        View inflate = LayoutInflater.from(this.f9747a).inflate(C2984t.m8433f(this.f9747a, "tt_privacy_dialog"), (ViewGroup) null);
        setContentView(inflate);
        final TTCornersWebView tTCornersWebView = (TTCornersWebView) inflate.findViewById(C2984t.m8432e(this.f9747a, "tt_privacy_webview"));
        Button button = (Button) inflate.findViewById(C2984t.m8432e(this.f9747a, "tt_privacy_accept_btn"));
        TextView textView = (TextView) inflate.findViewById(C2984t.m8432e(this.f9747a, "tt_privacy_reject_btn"));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2984t.m8432e(this.f9747a, "tt_privacy_back_layout"));
        this.f9752f = relativeLayout;
        C4020v.m13282a((View) relativeLayout, 8);
        textView.getPaint().setFlags(8);
        m12311a(tTCornersWebView);
        if (!TextUtils.isEmpty(this.f9748b) && !TextUtils.isEmpty(this.f9749c)) {
            button.setText(this.f9748b);
            textView.setText(this.f9749c);
        }
        button.setOnClickListener(new C3753a());
        textView.setOnClickListener(new C3753a());
        this.f9752f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTCornersWebView tTCornersWebView = tTCornersWebView;
                if (tTCornersWebView != null && tTCornersWebView.canGoBack()) {
                    tTCornersWebView.goBack();
                    if (!tTCornersWebView.canGoBack()) {
                        C4020v.m13282a((View) C3750b.this.f9752f, 8);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m12311a(final TTCornersWebView tTCornersWebView) {
        String t = C3578m.m11241h().mo19970t();
        if (t != null) {
            try {
                tTCornersWebView.getSettings().setJavaScriptEnabled(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                tTCornersWebView.getSettings().setMixedContentMode(0);
            }
            try {
                WebSettings settings = tTCornersWebView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(true);
                settings.setDomStorageEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setBlockNetworkImage(false);
                settings.setSavePassword(false);
                tTCornersWebView.setLayerType(1, (Paint) null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            C3640q.m11576a(tTCornersWebView);
            tTCornersWebView.setWebViewClient(new SSWebView.C2992a() {
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    if (webView == null || webResourceRequest == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        webView.loadUrl(webResourceRequest.getUrl().toString());
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.toString());
                    return true;
                }

                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    TTCornersWebView tTCornersWebView = tTCornersWebView;
                    if (tTCornersWebView != null && tTCornersWebView.canGoBack()) {
                        C4020v.m13282a((View) C3750b.this.f9752f, 0);
                    }
                }
            });
            tTCornersWebView.loadUrl(t);
        }
    }

    /* renamed from: b */
    private void m12313b() {
        WindowManager.LayoutParams attributes;
        setCancelable(false);
        Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.dimAmount = 0.5f;
            attributes.width = (int) (((double) this.f9747a.getResources().getDisplayMetrics().widthPixels) * 0.8d);
            window.setAttributes(attributes);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.b$a */
    /* compiled from: PrivacyProtectDialog */
    private class C3753a implements View.OnClickListener {
        private C3753a() {
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id == C2984t.m8432e(C3750b.this.f9747a, "tt_privacy_accept_btn")) {
                if (C3750b.this.f9750d != null) {
                    C3750b.this.f9750d.mo18507a();
                }
                C3750b.this.dismiss();
            } else if (id == C2984t.m8432e(C3750b.this.f9747a, "tt_privacy_reject_btn")) {
                if (C3750b.this.f9751e != null) {
                    C3750b.this.f9751e.mo18508a();
                }
                C3750b.this.dismiss();
            }
        }
    }
}
