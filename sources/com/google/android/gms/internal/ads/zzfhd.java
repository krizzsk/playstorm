package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfhd implements zzdip, zzdci, zzdit {
    private final zzfhq zza;
    private final zzfhg zzb;

    zzfhd(Context context, zzfhq zzfhq) {
        this.zza = zzfhq;
        this.zzb = zzfhf.zza(context, 13);
    }

    public final void zza() {
    }

    public final void zzb() {
        if (((Boolean) zzbjh.zzd.zze()).booleanValue()) {
            zzfhq zzfhq = this.zza;
            zzfhg zzfhg = this.zzb;
            zzfhg.zze(true);
            zzfhq.zza(zzfhg);
        }
    }

    public final void zze() {
    }

    public final void zzf() {
        if (((Boolean) zzbjh.zzd.zze()).booleanValue()) {
            this.zzb.zzf();
        }
    }

    public final void zzk(zze zze) {
        if (((Boolean) zzbjh.zzd.zze()).booleanValue()) {
            zzfhq zzfhq = this.zza;
            zzfhg zzfhg = this.zzb;
            zzfhg.zze(false);
            zzfhq.zza(zzfhg);
        }
    }
}
