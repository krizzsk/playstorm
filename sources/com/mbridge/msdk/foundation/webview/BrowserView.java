package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;

public class BrowserView extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f20835a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ProgressBar f20836b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WebView f20837c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ToolBar f20838d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C8621a f20839e;

    /* renamed from: f */
    private CampaignEx f20840f;

    /* renamed from: com.mbridge.msdk.foundation.webview.BrowserView$a */
    public interface C8621a {
        /* renamed from: a */
        void mo15412a();

        /* renamed from: a */
        void mo15413a(WebView webView, String str, Bitmap bitmap);

        /* renamed from: a */
        boolean mo15414a(WebView webView, String str);
    }

    public BrowserView(Context context, CampaignEx campaignEx) {
        super(context);
        this.f20840f = campaignEx;
        init();
    }

    public BrowserView(Context context) {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public void setListener(C8621a aVar) {
        this.f20839e = aVar;
    }

    public void loadUrl(String str) {
        WebView webView = this.f20837c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void setWebView(WebView webView) {
        this.f20837c = webView;
    }

    public void init() {
        WebChromeClient webChromeClient;
        setOrientation(1);
        setGravity(17);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f20836b = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f20837c == null) {
                WebView webView = new WebView(getContext());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setCacheMode(-1);
                webView.setDownloadListener(new MBDownloadListener(this.f20840f));
                webView.setWebViewClient(new WebViewClient() {
                    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                        C8608u.m24882b("BrowserView", "开始! = " + str);
                        String unused = BrowserView.this.f20835a = str;
                        if (BrowserView.this.f20839e != null) {
                            BrowserView.this.f20839e.mo15413a(webView, str, bitmap);
                        }
                        BrowserView.this.f20836b.setVisible(true);
                        BrowserView.this.f20836b.setProgressState(5);
                    }

                    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        C8608u.m24882b("BrowserView", "js大跳! = " + str);
                        BrowserView.this.f20838d.getItem("backward").setEnabled(true);
                        BrowserView.this.f20838d.getItem("forward").setEnabled(false);
                        if (BrowserView.this.f20839e != null) {
                            BrowserView.this.f20839e.mo15414a(webView, str);
                        }
                        return false;
                    }
                });
                if (C8596q.m24834g() <= 10) {
                    webChromeClient = new WebChromeClient() {
                        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                            return true;
                        }

                        public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
                            return true;
                        }

                        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                            return true;
                        }

                        public final void onProgressChanged(WebView webView, int i) {
                            if (i == 100) {
                                BrowserView.this.f20836b.setProgressState(7);
                                new Handler().postDelayed(new Runnable() {
                                    public final void run() {
                                        BrowserView.this.f20836b.setVisible(false);
                                    }
                                }, 200);
                            }
                        }
                    };
                } else {
                    webChromeClient = new WebChromeClient() {
                        public final void onProgressChanged(WebView webView, int i) {
                            if (i == 100) {
                                BrowserView.this.f20836b.setProgressState(7);
                                new Handler().postDelayed(new Runnable() {
                                    public final void run() {
                                        BrowserView.this.f20836b.setVisible(false);
                                    }
                                }, 200);
                            }
                        }
                    };
                }
                webView.setWebChromeClient(webChromeClient);
                this.f20837c = webView;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f20837c.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            C8608u.m24881a("BrowserView", "webview is error", th);
        }
        this.f20838d = new ToolBar(getContext());
        this.f20838d.setLayoutParams(new LinearLayout.LayoutParams(-1, C8613y.m24929b(getContext(), 40.0f)));
        this.f20838d.setBackgroundColor(-1);
        addView(this.f20836b);
        WebView webView2 = this.f20837c;
        if (webView2 != null) {
            addView(webView2);
        }
        addView(this.f20838d);
        this.f20836b.initResource(true);
        this.f20838d.getItem("backward").setEnabled(false);
        this.f20838d.getItem("forward").setEnabled(false);
        this.f20838d.setOnItemClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (BrowserView.this.f20837c != null) {
                    BrowserView.this.f20837c.stopLoading();
                }
                String str = (String) view.getTag();
                boolean z = false;
                if (TextUtils.equals(str, "backward")) {
                    BrowserView.this.f20838d.getItem("forward").setEnabled(true);
                    if (BrowserView.this.f20837c != null && BrowserView.this.f20837c.canGoBack()) {
                        BrowserView.this.f20837c.goBack();
                    }
                    View item = BrowserView.this.f20838d.getItem("backward");
                    if (BrowserView.this.f20837c != null && BrowserView.this.f20837c.canGoBack()) {
                        z = true;
                    }
                    item.setEnabled(z);
                } else if (TextUtils.equals(str, "forward")) {
                    BrowserView.this.f20838d.getItem("backward").setEnabled(true);
                    if (BrowserView.this.f20837c != null && BrowserView.this.f20837c.canGoForward()) {
                        BrowserView.this.f20837c.goForward();
                    }
                    View item2 = BrowserView.this.f20838d.getItem("forward");
                    if (BrowserView.this.f20837c != null && BrowserView.this.f20837c.canGoForward()) {
                        z = true;
                    }
                    item2.setEnabled(z);
                } else if (TextUtils.equals(str, "refresh")) {
                    BrowserView.this.f20838d.getItem("backward").setEnabled(BrowserView.this.f20837c != null && BrowserView.this.f20837c.canGoBack());
                    View item3 = BrowserView.this.f20838d.getItem("forward");
                    if (BrowserView.this.f20837c != null && BrowserView.this.f20837c.canGoForward()) {
                        z = true;
                    }
                    item3.setEnabled(z);
                    if (BrowserView.this.f20837c != null) {
                        BrowserView.this.f20837c.loadUrl(BrowserView.this.f20835a);
                    }
                } else if (TextUtils.equals(str, "exits") && BrowserView.this.f20839e != null) {
                    BrowserView.this.f20839e.mo15412a();
                }
            }
        });
    }

    public static final class MBDownloadListener implements DownloadListener {
        private CampaignEx campaignEx;
        private String title;

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        }

        public MBDownloadListener(CampaignEx campaignEx2) {
            this.campaignEx = campaignEx2;
        }

        public MBDownloadListener() {
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    public void destroy() {
        WebView webView = this.f20837c;
        if (webView != null) {
            webView.stopLoading();
            this.f20837c.setWebViewClient((WebViewClient) null);
            this.f20837c.destroy();
            removeAllViews();
        }
    }
}
