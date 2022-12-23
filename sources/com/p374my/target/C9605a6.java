package com.p374my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

/* renamed from: com.my.target.a6 */
public class C9605a6 extends FrameLayout {

    /* renamed from: a */
    public WebView f23620a;

    public C9605a6(Context context) {
        super(context);
        try {
            WebView webView = new WebView(m27597a(context));
            this.f23620a = webView;
            webView.clearCache(true);
            addView(this.f23620a);
        } catch (Throwable th) {
            C9672e0.m27883b("Webview cannot be initialized, Ad will not work properly " + th.getMessage());
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static Context m27597a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return (i < 21 || i >= 23) ? context : context.createConfigurationContext(new Configuration());
    }

    /* renamed from: a */
    public static void m27598a(Throwable th) {
        C9672e0.m27883b("WebView fail: " + th.getMessage());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m27599c() {
        WebView webView = this.f23620a;
        if (webView != null) {
            try {
                webView.destroy();
            } catch (Throwable th) {
                m27598a(th);
            }
        }
    }

    /* renamed from: a */
    public void mo63459a(int i) {
        WebView webView = this.f23620a;
        if (webView != null) {
            if (i <= 0) {
                try {
                    webView.destroy();
                } catch (Throwable th) {
                    m27598a(th);
                }
            } else {
                C9693f0.m27980a(new Runnable() {
                    public final void run() {
                        C9605a6.this.m27599c();
                    }
                }, i);
            }
        }
    }

    /* renamed from: a */
    public void mo63460a(String str) {
        WebView webView = this.f23620a;
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                m27598a(th);
            }
        }
    }

    /* renamed from: a */
    public void mo63461a(String str, String str2, String str3, String str4, String str5) {
        WebView webView = this.f23620a;
        if (webView != null) {
            try {
                webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
            } catch (Throwable th) {
                m27598a(th);
            }
        }
    }

    /* renamed from: a */
    public boolean mo63462a() {
        try {
            WebView webView = this.f23620a;
            return webView != null && webView.canGoBack();
        } catch (Throwable th) {
            m27598a(th);
            return false;
        }
    }

    /* renamed from: b */
    public void mo63463b() {
        WebView webView = this.f23620a;
        if (webView != null) {
            try {
                webView.goBack();
            } catch (Throwable th) {
                m27598a(th);
            }
        }
    }

    /* renamed from: d */
    public void mo63464d() {
        WebView webView = this.f23620a;
        if (webView != null) {
            try {
                webView.onPause();
            } catch (Throwable th) {
                m27598a(th);
            }
        }
    }

    /* renamed from: e */
    public void mo63465e() {
        WebView webView = this.f23620a;
        if (webView != null) {
            try {
                webView.onResume();
            } catch (Throwable th) {
                m27598a(th);
            }
        }
    }

    /* renamed from: f */
    public void mo63466f() {
        WebView webView = this.f23620a;
        if (webView != null) {
            try {
                webView.stopLoading();
            } catch (Throwable th) {
                m27598a(th);
            }
        }
    }

    public WebSettings getSettings() {
        try {
            WebView webView = this.f23620a;
            if (webView == null) {
                return null;
            }
            return webView.getSettings();
        } catch (Throwable th) {
            m27598a(th);
            return null;
        }
    }

    public String getUrl() {
        try {
            WebView webView = this.f23620a;
            if (webView == null) {
                return null;
            }
            return webView.getUrl();
        } catch (Throwable th) {
            m27598a(th);
            return null;
        }
    }

    public WebView getWebView() {
        return this.f23620a;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WebView webView = this.f23620a;
        if (webView != null) {
            webView.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onMeasure(int i, int i2) {
        WebView webView = this.f23620a;
        if (webView != null) {
            webView.measure(i, i2);
            setMeasuredDimension(this.f23620a.getMeasuredWidth(), this.f23620a.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public void setHorizontalScrollBarEnabled(boolean z) {
        WebView webView = this.f23620a;
        if (webView != null) {
            webView.setHorizontalScrollBarEnabled(z);
        }
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        WebView webView = this.f23620a;
        if (webView != null) {
            webView.setOnTouchListener(onTouchListener);
        }
    }

    public void setScrollContainer(boolean z) {
        WebView webView = this.f23620a;
        if (webView != null) {
            webView.setScrollContainer(z);
        }
    }

    public void setVerticalScrollBarEnabled(boolean z) {
        WebView webView = this.f23620a;
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(z);
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        WebView webView = this.f23620a;
        if (webView != null) {
            try {
                webView.setWebChromeClient(webChromeClient);
            } catch (Throwable th) {
                m27598a(th);
            }
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        WebView webView = this.f23620a;
        if (webView != null) {
            try {
                webView.setWebViewClient(webViewClient);
            } catch (Throwable th) {
                m27598a(th);
            }
        }
    }
}
