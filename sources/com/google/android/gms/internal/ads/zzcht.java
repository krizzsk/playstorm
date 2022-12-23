package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcht implements Runnable {
    private final zzchf zza;
    private boolean zzb = false;

    zzcht(zzchf zzchf) {
        this.zza = zzchf;
    }

    private final void zzc() {
        zzs.zza.removeCallbacks(this);
        zzs.zza.postDelayed(this, 250);
    }

    public final void run() {
        if (!this.zzb) {
            this.zza.zzs();
            zzc();
        }
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzs();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
