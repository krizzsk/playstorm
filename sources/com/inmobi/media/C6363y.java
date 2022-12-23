package com.inmobi.media;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import com.inmobi.media.C6145fs;
import com.mbridge.msdk.foundation.entity.CampaignUnit;

/* renamed from: com.inmobi.media.y */
/* compiled from: EmbeddedBrowserWebView */
public final class C6363y extends WebView {

    /* renamed from: a */
    private C5760ab f16168a;

    public C6363y(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT >= 16) {
            setImportantForAccessibility(2);
        }
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        if (Build.VERSION.SDK_INT >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        C5760ab abVar = new C5760ab();
        this.f16168a = abVar;
        abVar.f14520b = ((C6125fq) C6145fs.m18321a(CampaignUnit.JSON_KEY_ADS, C6227ho.m18559f(), (C6145fs.C6148c) null)).rendering.otherNetworkLoadsLimit;
        setWebViewClient(this.f16168a);
    }

    public final void loadUrl(String str) {
        super.loadUrl(str);
        this.f16168a.f14521c = true;
    }

    public final void loadData(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
        this.f16168a.f14521c = true;
    }
}
