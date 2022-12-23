package com.bytedance.sdk.openadsdk.core.widget.p166a;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C2975l;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.a.b */
/* compiled from: SSWebSettings */
public class C3747b {

    /* renamed from: a */
    private WeakReference<Context> f9727a;

    /* renamed from: b */
    private boolean f9728b = true;

    /* renamed from: c */
    private boolean f9729c = true;

    /* renamed from: d */
    private boolean f9730d = true;

    /* renamed from: e */
    private boolean f9731e = true;

    /* renamed from: f */
    private boolean f9732f = false;

    /* renamed from: g */
    private boolean f9733g = true;

    /* renamed from: h */
    private boolean f9734h = true;

    /* renamed from: a */
    public static C3747b m12300a(Context context) {
        return new C3747b(context);
    }

    private C3747b(Context context) {
        this.f9727a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public C3747b mo20536a(boolean z) {
        this.f9734h = z;
        return this;
    }

    /* renamed from: b */
    public C3747b mo20538b(boolean z) {
        this.f9729c = z;
        return this;
    }

    /* renamed from: a */
    public void mo20537a(WebView webView) {
        if (webView != null && this.f9727a.get() != null) {
            m12302b(webView);
            WebSettings settings = webView.getSettings();
            m12301a(settings);
            if (settings != null) {
                try {
                    settings.setJavaScriptEnabled(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    if (this.f9729c) {
                        settings.setSupportZoom(true);
                        settings.setBuiltInZoomControls(true);
                    } else {
                        settings.setSupportZoom(false);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(this.f9730d);
                settings.setDomStorageEnabled(this.f9731e);
                settings.setAllowFileAccess(this.f9732f);
                settings.setBlockNetworkImage(true ^ this.f9733g);
                settings.setSavePassword(false);
                try {
                    if (Build.VERSION.SDK_INT >= 11 && !this.f9734h) {
                        webView.setLayerType(0, (Paint) null);
                    } else if (Build.VERSION.SDK_INT >= 16 && this.f9734h) {
                        webView.setLayerType(2, (Paint) null);
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    private void m12302b(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            C2975l.m8383b(th.toString());
        }
    }

    /* renamed from: a */
    private void m12301a(WebSettings webSettings) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                webSettings.setMediaPlaybackRequiresUserGesture(false);
            }
        } catch (Throwable th) {
            C2975l.m8383b(th.toString());
        }
    }
}
