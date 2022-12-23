package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzaut {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzazg zzf;
    private final zzazg zzg;
    private int zzh;
    private int zzi;

    public zzaut(zzazg zzazg, zzazg zzazg2, boolean z) {
        this.zzg = zzazg;
        this.zzf = zzazg2;
        this.zze = z;
        zzazg2.zzv(12);
        this.zza = zzazg2.zzi();
        zzazg.zzv(12);
        this.zzi = zzazg.zzi();
        zzayy.zzf(zzazg.zze() != 1 ? false : true, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long j;
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        if (this.zze) {
            j = this.zzf.zzn();
        } else {
            j = this.zzf.zzm();
        }
        this.zzd = j;
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzi();
            this.zzg.zzw(4);
            int i2 = -1;
            int i3 = this.zzi - 1;
            this.zzi = i3;
            if (i3 > 0) {
                i2 = -1 + this.zzg.zzi();
            }
            this.zzh = i2;
        }
        return true;
    }
}
