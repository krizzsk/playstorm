package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfka implements Runnable {
    zzfka() {
    }

    public final void run() {
        if (zzfkd.zzc != null) {
            zzfkd.zzc.post(zzfkd.zzd);
            zzfkd.zzc.postDelayed(zzfkd.zze, 200);
        }
    }
}
