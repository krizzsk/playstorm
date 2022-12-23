package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzclu {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzcli, java.lang.Object] */
    public static final zzcli zza(Context context, zzcmx zzcmx, String str, boolean z, boolean z2, zzaoc zzaoc, zzbix zzbix, zzcfo zzcfo, zzbin zzbin, zzl zzl, zza zza, zzbdl zzbdl, zzfbg zzfbg, zzfbj zzfbj) throws zzclt {
        StrictMode.ThreadPolicy threadPolicy;
        zzbhy.zzc(context);
        try {
            zzclq zzclq = new zzclq(context, zzcmx, str, z, z2, zzaoc, zzbix, zzcfo, (zzbin) null, zzl, zza, zzbdl, zzfbg, zzfbj);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ? zza2 = zzclq.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza2;
        } catch (Throwable th) {
            throw new zzclt("Webview initialization failed.", th);
        }
    }
}
