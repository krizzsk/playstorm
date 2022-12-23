package com.mbridge.msdk.mbbanner.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.mbridge.msdk.click.p058b.C2312a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbbanner.common.p323b.C8670a;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.base.C8794b;
import com.mbridge.msdk.p054c.p056b.C2284a;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbbanner.view.a */
/* compiled from: BannerWebViewClient */
public final class C8715a extends C8794b {

    /* renamed from: a */
    String f21137a;

    /* renamed from: b */
    List<CampaignEx> f21138b;

    /* renamed from: c */
    C8670a f21139c;

    /* renamed from: d */
    private final String f21140d = "BannerWebViewClient";

    public C8715a(String str, List<CampaignEx> list, C8670a aVar) {
        this.f21137a = str;
        this.f21138b = list;
        this.f21139c = aVar;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            StringBuilder sb = new StringBuilder("javascript:");
            sb.append(C2284a.m5293a().mo15574b());
            if (Build.VERSION.SDK_INT <= 19) {
                webView.loadUrl(sb.toString());
            } else {
                webView.evaluateJavascript(sb.toString(), new ValueCallback<String>() {
                    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                        String str = (String) obj;
                    }
                });
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerWebViewClient", "onPageStarted", th);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            BaseWebView baseWebView = (BaseWebView) webView;
            if (System.currentTimeMillis() - baseWebView.lastTouchTime > ((long) C2312a.f4769c) && C2312a.m5453a(this.f21138b.get(0), baseWebView.getUrl(), C2312a.f4768b)) {
                return false;
            }
            if (this.f21138b.size() > 1) {
                C2350a.m5601e().mo15792g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            if (this.f21139c != null) {
                this.f21139c.mo57992a(false, str);
            }
            return true;
        } catch (Throwable th) {
            C8608u.m24881a("BannerWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }
}
