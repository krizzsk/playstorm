package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfin {
    private final zzfiu zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzfio zzg;

    private zzfin(zzfiu zzfiu, WebView webView, String str, List list, String str2, String str3, zzfio zzfio) {
        this.zza = zzfiu;
        this.zzb = webView;
        this.zzg = zzfio;
        this.zzf = str2;
        this.zze = "";
    }

    public static zzfin zzb(zzfiu zzfiu, WebView webView, String str, String str2) {
        return new zzfin(zzfiu, webView, (String) null, (List) null, str, "", zzfio.HTML);
    }

    public static zzfin zzc(zzfiu zzfiu, WebView webView, String str, String str2) {
        return new zzfin(zzfiu, webView, (String) null, (List) null, str, "", zzfio.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfio zzd() {
        return this.zzg;
    }

    public final zzfiu zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
