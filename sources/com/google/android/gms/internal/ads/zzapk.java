package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzapk implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzapl zza;

    zzapk(zzapl zzapl) {
        this.zza = zzapl;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        zzapl zzapl = this.zza;
        if (zzapl.zzc > 0 && currentTimeMillis >= zzapl.zzc) {
            zzapl.zzd = currentTimeMillis - zzapl.zzc;
        }
        this.zza.zze = false;
    }
}
