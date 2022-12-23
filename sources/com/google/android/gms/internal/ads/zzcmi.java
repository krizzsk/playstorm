package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcmi {
    private final zzcmj zza;
    private final zzcmh zzb;

    public zzcmi(zzcmj zzcmj, zzcmh zzcmh, byte[] bArr) {
        this.zzb = zzcmh;
        this.zza = zzcmj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcmj, com.google.android.gms.internal.ads.zzcmq] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ? r0 = this.zza;
        zzaoc zzK = r0.zzK();
        if (zzK == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzany zzc = zzK.zzc();
        if (zzc == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (r0.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.zza.getContext();
            zzcmj zzcmj = this.zza;
            return zzc.zzf(context, str, (View) zzcmj, zzcmj.zzk());
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcmj, com.google.android.gms.internal.ads.zzcmq] */
    @JavascriptInterface
    public String getViewSignals() {
        ? r0 = this.zza;
        zzaoc zzK = r0.zzK();
        if (zzK == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzany zzc = zzK.zzc();
        if (zzc == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (r0.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.zza.getContext();
            zzcmj zzcmj = this.zza;
            return zzc.zzh(context, (View) zzcmj, zzcmj.zzk());
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zzj("URL is empty, ignoring message");
        } else {
            zzs.zza.post(new zzcmg(this, str));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        zzcmh zzcmh = this.zzb;
        Uri parse = Uri.parse(str);
        zzclp zzaL = ((zzcmb) zzcmh.zza).zzaL();
        if (zzaL == null) {
            zze.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaL.zzi(parse);
        }
    }
}
