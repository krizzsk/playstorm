package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbbj implements Runnable {
    final ValueCallback zza = new zzbbi(this, this.zzb, this.zzc, this.zzd);
    final /* synthetic */ zzbbb zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbbl zze;

    zzbbj(zzbbl zzbbl, zzbbb zzbbb, WebView webView, boolean z) {
        this.zze = zzbbl;
        this.zzb = zzbbb;
        this.zzc = webView;
        this.zzd = z;
    }

    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
