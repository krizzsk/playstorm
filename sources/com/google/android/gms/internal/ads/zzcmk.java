package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcmk extends zzcml {
    public zzcmk(zzcli zzcli, zzbdl zzbdl, boolean z) {
        super(zzcli, zzbdl, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzM(webView, str, (Map) null);
    }
}
