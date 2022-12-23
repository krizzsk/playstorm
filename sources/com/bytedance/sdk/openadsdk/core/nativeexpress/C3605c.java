package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.graphics.Paint;
import android.os.Build;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.c */
/* compiled from: BrandBannerWebViewPool */
public class C3605c {

    /* renamed from: b */
    private static int f9133b;

    /* renamed from: c */
    private static volatile C3605c f9134c;

    /* renamed from: a */
    private final List<SSWebView> f9135a = new ArrayList();

    /* renamed from: a */
    public static C3605c m11383a() {
        if (f9134c == null) {
            synchronized (C3605c.class) {
                if (f9134c == null) {
                    f9134c = new C3605c();
                }
            }
        }
        return f9134c;
    }

    /* renamed from: b */
    public SSWebView mo20175b() {
        SSWebView remove;
        if (mo20177c() > 0 && (remove = this.f9135a.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    /* renamed from: a */
    public void mo20174a(SSWebView sSWebView) {
        if (sSWebView != null) {
            mo20176b(sSWebView);
        }
    }

    /* renamed from: b */
    public void mo20176b(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        if (this.f9135a.size() >= f9133b) {
            sSWebView.mo17952l();
        } else if (!this.f9135a.contains(sSWebView)) {
            mo20178c(sSWebView);
            this.f9135a.add(sSWebView);
        }
    }

    /* renamed from: c */
    public int mo20177c() {
        return this.f9135a.size();
    }

    /* renamed from: c */
    public void mo20178c(SSWebView sSWebView) {
        if (sSWebView != null && sSWebView.getWebView() != null) {
            if (sSWebView.getParent() != null) {
                ((ViewGroup) sSWebView.getParent()).removeView(sSWebView);
            }
            try {
                sSWebView.removeAllViews();
                sSWebView.mo17932c();
                sSWebView.setWebChromeClient((WebChromeClient) null);
                sSWebView.setWebViewClient((WebViewClient) null);
                sSWebView.setDownloadListener((DownloadListener) null);
                sSWebView.setDefaultTextEncodingName("UTF-8");
                sSWebView.setJavaScriptEnabled(true);
                sSWebView.setDomStorageEnabled(true);
                sSWebView.setAppCacheEnabled(true);
                sSWebView.setDomStorageEnabled(true);
                sSWebView.setDatabaseEnabled(true);
                sSWebView.setSupportZoom(false);
                sSWebView.getWebView().setLayerType(0, (Paint) null);
                sSWebView.setBackgroundColor(0);
                sSWebView.getWebView().setHorizontalScrollBarEnabled(false);
                sSWebView.getWebView().setHorizontalScrollbarOverlay(false);
                sSWebView.getWebView().setVerticalScrollBarEnabled(false);
                sSWebView.getWebView().setVerticalScrollbarOverlay(false);
                sSWebView.mo17929a(true);
                sSWebView.mo17950j();
                if (Build.VERSION.SDK_INT >= 21) {
                    sSWebView.setMixedContentMode(0);
                }
            } catch (Exception unused) {
            }
        }
    }
}
