package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzcml extends zzclp {
    public zzcml(zzcli zzcli, zzbdl zzbdl, boolean z) {
        super(zzcli, zzbdl, z);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse zzM(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcli)) {
            zze.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcli zzcli = (zzcli) webView;
        zzccj zzccj = this.zza;
        if (zzccj != null) {
            zzccj.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcli.zzP() != null) {
            zzcli.zzP().zzD();
        }
        if (zzcli.zzQ().zzi()) {
            str2 = (String) zzay.zzc().zzb(zzbhy.zzM);
        } else if (zzcli.zzaC()) {
            str2 = (String) zzay.zzc().zzb(zzbhy.zzL);
        } else {
            str2 = (String) zzay.zzc().zzb(zzbhy.zzK);
        }
        zzt.zzp();
        return zzs.zzu(zzcli.getContext(), zzcli.zzp().zza, str2);
    }
}
