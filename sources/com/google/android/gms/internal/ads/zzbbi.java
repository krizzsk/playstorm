package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzbbi implements ValueCallback {
    public final /* synthetic */ zzbbj zza;
    public final /* synthetic */ zzbbb zzb;
    public final /* synthetic */ WebView zzc;
    public final /* synthetic */ boolean zzd;

    public /* synthetic */ zzbbi(zzbbj zzbbj, zzbbb zzbbb, WebView webView, boolean z) {
        this.zza = zzbbj;
        this.zzb = zzbbb;
        this.zzc = webView;
        this.zzd = z;
    }

    public final void onReceiveValue(Object obj) {
        zzbbj zzbbj = this.zza;
        zzbbb zzbbb = this.zzb;
        WebView webView = this.zzc;
        boolean z = this.zzd;
        zzbbj.zze.zzd(zzbbb, webView, (String) obj, z);
    }
}
