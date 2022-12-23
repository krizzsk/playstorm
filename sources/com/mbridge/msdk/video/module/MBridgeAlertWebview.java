package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.mbsignalcommon.p338b.C8790b;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.video.signal.factory.C9529b;
import com.mbridge.msdk.videocommon.download.C9563g;
import com.mbridge.msdk.videocommon.download.C9572h;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import com.mbridge.msdk.videocommon.p373d.C9551c;

public class MBridgeAlertWebview extends MBridgeH5EndCardView {
    /* access modifiers changed from: private */

    /* renamed from: x */
    public String f22691x;

    public MBridgeAlertWebview(Context context) {
        super(context);
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo62558a() {
        if (TextUtils.isEmpty(this.f22784u)) {
            return "";
        }
        C9549b.m27299a().mo63124a(C2350a.m5601e().mo15793h(), this.f22784u, false);
        String str = C9551c.f23420a;
        this.f22691x = str;
        return !TextUtils.isEmpty(str) ? C9563g.m27460a().mo63242b(this.f22691x) : "";
    }

    public void preLoadData(C9529b bVar) {
        String a = mo62558a();
        if (!this.f22698f || this.f22694b == null || TextUtils.isEmpty(a)) {
            this.f22697e.mo62252a(101, "");
            return;
        }
        BrowserView.MBDownloadListener mBDownloadListener = new BrowserView.MBDownloadListener(this.f22694b);
        mBDownloadListener.setTitle(this.f22694b.getAppName());
        this.f22779p.setDownloadListener(mBDownloadListener);
        this.f22779p.setCampaignId(this.f22694b.getId());
        setCloseVisible(8);
        this.f22779p.setApiManagerJSFactory(bVar);
        this.f22779p.setWebViewListener(new C8790b() {
            /* renamed from: a */
            public final void mo57902a(WebView webView, String str) {
                super.mo57902a(webView, str);
                C8608u.m24884d("MBridgeAlertWebview", "finish+" + str);
                C8824g.m25670a().mo58310a(webView, "onSignalCommunication", "");
            }

            /* renamed from: a */
            public final void mo57900a(WebView webView, int i, String str, String str2) {
                super.mo57900a(webView, i, str, str2);
                C8608u.m24884d("MBridgeAlertWebview", "onReceivedError");
                if (!MBridgeAlertWebview.this.f22783t) {
                    C8608u.m24880a(MBridgeBaseView.TAG, "onReceivedError,url:" + str2);
                    C8542e.m24699a(MBridgeAlertWebview.this.f22693a, MBridgeAlertWebview.this.f22694b, MBridgeAlertWebview.this.f22691x, MBridgeAlertWebview.this.f22784u, 2, str);
                    MBridgeAlertWebview.this.f22783t = true;
                }
            }

            /* renamed from: a */
            public final void mo57899a(WebView webView, int i) {
                String str;
                super.mo57899a(webView, i);
                C8608u.m24884d("MBridgeAlertWebview", "readyState  :  " + i);
                if (!MBridgeAlertWebview.this.f22783t) {
                    MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
                    boolean z = true;
                    if (i != 1) {
                        z = false;
                    }
                    mBridgeAlertWebview.f22782s = z;
                    if (MBridgeAlertWebview.this.f22782s) {
                        str = "readyState state is " + i;
                    } else {
                        str = "";
                    }
                    C8542e.m24699a(MBridgeAlertWebview.this.f22693a, MBridgeAlertWebview.this.f22694b, MBridgeAlertWebview.this.f22691x, MBridgeAlertWebview.this.f22784u, i, str);
                }
            }
        });
        setHtmlSource(C9572h.m27477a().mo63246b(a));
        this.f22782s = false;
        if (TextUtils.isEmpty(this.f22781r)) {
            C8608u.m24880a(MBridgeBaseView.TAG, "load url:" + a);
            this.f22779p.loadUrl(a);
        } else {
            C8608u.m24880a(MBridgeBaseView.TAG, "load html...");
            this.f22779p.loadDataWithBaseURL(a, this.f22781r, "text/html", "UTF-8", (String) null);
        }
        this.f22779p.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    public void webviewshow() {
        if (this.f22777n != null) {
            this.f22777n.setBackgroundColor(0);
        }
        super.webviewshow();
        C8542e.m24697a(this.f22693a, this.f22694b, this.f22691x, this.f22784u, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final RelativeLayout.LayoutParams mo62559b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }
}
