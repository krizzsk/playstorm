package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdsp implements zzbpa {
    private final zzdcz zza;
    private final zzcaw zzb;
    private final String zzc;
    private final String zzd;

    public zzdsp(zzdcz zzdcz, zzfbg zzfbg) {
        this.zza = zzdcz;
        this.zzb = zzfbg.zzm;
        this.zzc = zzfbg.zzk;
        this.zzd = zzfbg.zzl;
    }

    @ParametersAreNonnullByDefault
    public final void zza(zzcaw zzcaw) {
        int i;
        String str;
        zzcaw zzcaw2 = this.zzb;
        if (zzcaw2 != null) {
            zzcaw = zzcaw2;
        }
        if (zzcaw != null) {
            str = zzcaw.zza;
            i = zzcaw.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzcah(str, i), this.zzc, this.zzd);
    }

    public final void zzb() {
        this.zza.zze();
    }

    public final void zzc() {
        this.zza.zzf();
    }
}
