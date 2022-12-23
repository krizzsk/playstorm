package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzahg implements zzagz {
    final /* synthetic */ zzahi zza;
    private final zzdx zzb = new zzdx(new byte[4], 4);

    public zzahg(zzahi zzahi) {
        this.zza = zzahi;
    }

    public final void zza(zzdy zzdy) {
        if (zzdy.zzk() == 0 && (zzdy.zzk() & 128) != 0) {
            zzdy.zzG(6);
            int zza2 = zzdy.zza() / 4;
            for (int i = 0; i < zza2; i++) {
                zzdy.zzA(this.zzb, 4);
                int zzc = this.zzb.zzc(16);
                this.zzb.zzj(3);
                if (zzc == 0) {
                    this.zzb.zzj(13);
                } else {
                    int zzc2 = this.zzb.zzc(13);
                    if (this.zza.zzf.get(zzc2) == null) {
                        zzahi zzahi = this.zza;
                        zzahi.zzf.put(zzc2, new zzaha(new zzahh(zzahi, zzc2)));
                        zzahi zzahi2 = this.zza;
                        zzahi2.zzl = zzahi2.zzl + 1;
                    }
                }
            }
            this.zza.zzf.remove(0);
        }
    }

    public final void zzb(zzee zzee, zzyv zzyv, zzahm zzahm) {
    }
}
