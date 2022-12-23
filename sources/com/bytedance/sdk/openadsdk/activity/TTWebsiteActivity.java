package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2959b;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.C3234e;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3640q;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;

public class TTWebsiteActivity extends Activity {

    /* renamed from: a */
    private String f7298a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3234e f7299b;

    /* renamed from: a */
    public static void m8985a(Context context, C3498n nVar, String str) {
        if (context != null) {
            C3156e.m9192b(context, nVar, str, "open_policy");
            if (!TextUtils.isEmpty(C3578m.m11241h().mo19969s())) {
                String jSONObject = nVar != null ? nVar.mo19674ar().toString() : "";
                Intent intent = new Intent(context, TTWebsiteActivity.class);
                intent.putExtra("metaString", jSONObject);
                C2959b.m8339a(context, intent, (C2959b.C2960a) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        final String stringExtra = getIntent().getStringExtra("metaString");
        setContentView(C2984t.m8433f(this, "tt_activity_website"));
        final WebView webView = (WebView) findViewById(C2984t.m8432e(this, "tt_ad_website"));
        final ImageView imageView = (ImageView) findViewById(C2984t.m8432e(this, "tt_titlebar_close"));
        final ProgressBar progressBar = (ProgressBar) findViewById(C2984t.m8432e(this, "tt_titlebar_browser_progress"));
        ((ImageView) findViewById(C2984t.m8432e(this, "tt_titlebar_back"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (webView.canGoBack()) {
                    webView.goBack();
                } else {
                    TTWebsiteActivity.this.finish();
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.this.finish();
            }
        });
        imageView.setVisibility(4);
        imageView.setClickable(false);
        ((TextView) findViewById(C2984t.m8432e(this, "tt_titlebar_title"))).setText(C2984t.m8425a(this, "tt_privacy_title"));
        ((ImageView) findViewById(C2984t.m8432e(this, "tt_titlebar_go_to_webview"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                String url = webView.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    intent.setData(Uri.parse(url));
                    C2959b.m8339a(TTWebsiteActivity.this, intent, (C2959b.C2960a) null);
                }
            }
        });
        ((ImageView) findViewById(C2984t.m8432e(this, "tt_titlebar_debug_info"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TTWebsiteActivity.this.f7299b == null) {
                    C3234e unused = TTWebsiteActivity.this.f7299b = new C3234e(TTWebsiteActivity.this);
                    TTWebsiteActivity.this.f7299b.mo18893a(stringExtra);
                    TTWebsiteActivity.this.f7299b.setCanceledOnTouchOutside(false);
                }
                TTWebsiteActivity.this.f7299b.show();
            }
        });
        if (C3578m.m11241h() != null) {
            this.f7298a = C3578m.m11241h().mo19969s();
        }
        C2975l.m8391e("TTWebsiteActivity", "mWebsiteUrl=" + this.f7298a);
        if (this.f7298a != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                webView.getSettings().setMixedContentMode(0);
            }
            try {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setSavePassword(false);
                webView.getSettings().setAllowFileAccess(false);
            } catch (Throwable unused) {
            }
            HashMap hashMap = new HashMap();
            hashMap.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
            try {
                webView.loadUrl(this.f7298a, hashMap);
            } catch (Throwable unused2) {
                webView.loadUrl(this.f7298a);
            }
            webView.setWebChromeClient(new WebChromeClient() {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (progressBar != null && !TTWebsiteActivity.this.isFinishing()) {
                        if (i == 100) {
                            progressBar.setVisibility(8);
                            if (webView.canGoBack()) {
                                imageView.setVisibility(0);
                                imageView.setClickable(true);
                                return;
                            }
                            imageView.setVisibility(4);
                            imageView.setClickable(false);
                            return;
                        }
                        progressBar.setVisibility(0);
                        progressBar.setProgress(i);
                    }
                }
            });
            webView.setWebViewClient(new SSWebView.C2992a() {
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    C2975l.m8391e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....view=" + webView + ",request=" + webResourceRequest);
                    if (webView == null || webResourceRequest == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        webView.loadUrl(webResourceRequest.getUrl().toString());
                        C2975l.m8391e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....url1=" + webResourceRequest.getUrl().toString());
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.toString());
                    C2975l.m8391e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....url2=" + webResourceRequest.toString());
                    return true;
                }

                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    C2975l.m8391e("TTWebsiteActivity", "onPageFinished invoke....url=" + str);
                }

                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    C2975l.m8391e("TTWebsiteActivity", "onReceivedHttpError invoke....errorResponse=" + webResourceResponse);
                }

                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    C2975l.m8391e("TTWebsiteActivity", "onReceivedError invoke....onReceivedError=" + webResourceError.getErrorCode());
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    C2975l.m8391e("TTWebsiteActivity", "onReceivedError invoke....description=" + str + ",failingUrl=" + str2);
                }
            });
            C3640q.m11576a(webView);
            return;
        }
        finish();
    }
}
