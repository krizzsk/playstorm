package com.inmobi.media;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.inmobi.media.C6200gs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.r */
/* compiled from: RenderViewClient */
final class C6356r extends C5758aa {

    /* renamed from: e */
    private static final String f16153e = C6356r.class.getSimpleName();

    /* renamed from: a */
    short f16154a = -1;

    /* renamed from: f */
    private List<String> f16155f = new ArrayList();

    /* renamed from: g */
    private boolean f16156g = false;

    /* renamed from: h */
    private AtomicBoolean f16157h = new AtomicBoolean(false);

    C6356r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35720a() {
        this.f16155f.clear();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m19118a(webView, webResourceRequest.getUrl().toString());
        }
        return false;
    }

    /* renamed from: a */
    private boolean m19118a(WebView webView, String str) {
        if (!(webView instanceof C6337q)) {
            return false;
        }
        if (this.f16157h.get()) {
            return true;
        }
        C6337q qVar = (C6337q) webView;
        if (qVar.f16111i) {
            webView.loadUrl(str);
            return true;
        } else if (qVar.mo35658i() || qVar.f16105c || "about:blank".equals(str)) {
            qVar.getPlacementType();
            if (1 != qVar.getPlacementType()) {
                return m19119a(qVar, str);
            }
            if (!qVar.f16105c || !C6236hs.m18599a(str)) {
                return m19119a(qVar, str);
            }
            return false;
        } else {
            qVar.mo35616c("redirect");
            return true;
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView instanceof C6337q) {
            C6337q qVar = (C6337q) webView;
            this.f16156g = false;
            if (qVar.getMarkupType().equals("htmlUrl")) {
                qVar.mo35620d(qVar.getMraidJsString());
                this.f16156g = true;
            }
            qVar.setAndUpdateViewState("Loading");
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (webView instanceof C6337q) {
            C6337q qVar = (C6337q) webView;
            if (this.f16155f.contains(str) && !this.f16156g) {
                this.f16156g = true;
                qVar.mo35620d(qVar.getMraidJsString());
            }
            if ("Loading".equals(qVar.getViewState())) {
                qVar.getListener().mo34524e(qVar);
                qVar.mo35620d("window.imaiview.broadcastEvent('ready');");
                qVar.mo35620d("window.mraidview.broadcastEvent('ready');");
                if (qVar.getImpressionType() == 2) {
                    qVar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    qVar.layout(0, 0, qVar.getMeasuredWidth(), qVar.getMeasuredHeight());
                    qVar.setDrawingCacheEnabled(true);
                    qVar.buildDrawingCache();
                }
                qVar.setAndUpdateViewState(qVar.getOriginalRenderView() == null ? "Default" : "Expanded");
            }
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str.matches("(.*)phpserver/db(.*)")) {
            Intent intent = new Intent(C6200gs.C6201a.NETWORK_REQUEST_RESPONSE.toString());
            intent.putExtra("url", str);
            C6200gs.m18446a(intent);
        }
        if (webView instanceof C6337q) {
            C6337q qVar = (C6337q) webView;
            String url = qVar.getUrl();
            if (str != null && url != null && str.contains("/mraid.js") && !"about:blank".equals(url) && !url.startsWith("file:")) {
                if (!this.f16155f.contains(url)) {
                    this.f16155f.add(url);
                }
                if (!this.f16156g) {
                    this.f16156g = true;
                    qVar.mo35620d(qVar.getMraidJsString());
                }
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m19118a(webView, str);
    }

    /* renamed from: a */
    private boolean m19119a(C6337q qVar, String str) {
        if (!qVar.f16105c) {
            qVar.mo35659l();
        }
        boolean a = qVar.getLandingPageHandler().mo35547a((String) null, (String) null, str);
        if (qVar.f16105c && a) {
            mo34425a((View) qVar);
            if (!C6236hs.m18599a(str)) {
                if (qVar.canGoBack()) {
                    qVar.goBack();
                } else {
                    Activity fullScreenActivity = qVar.getFullScreenActivity();
                    if (fullScreenActivity != null) {
                        fullScreenActivity.finish();
                    }
                }
            }
        }
        return a;
    }
}
