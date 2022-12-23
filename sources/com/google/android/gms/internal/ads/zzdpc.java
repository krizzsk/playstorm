package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdpc implements zzdcm {
    private final zzdng zza;
    private final zzdnl zzb;

    public zzdpc(zzdng zzdng, zzdnl zzdnl) {
        this.zza = zzdng;
        this.zzb = zzdnl;
    }

    public final void zzl() {
        zzdng zzdng = this.zza;
        if (zzdng.zzu() != null) {
            zzcli zzq = zzdng.zzq();
            zzcli zzr = zzdng.zzr();
            if (zzq == null) {
                zzq = zzr == null ? null : zzr;
            }
            if (this.zzb.zzd() && zzq != null) {
                zzq.zzd("onSdkImpression", new ArrayMap());
            }
        }
    }
}
