package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzaht implements zzahs {
    private final zzyv zza;
    private final zzzz zzb;
    private final zzahv zzc;
    private final zzad zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaht(zzyv zzyv, zzzz zzzz, zzahv zzahv, String str, int i) throws zzbp {
        this.zza = zzyv;
        this.zzb = zzzz;
        this.zzc = zzahv;
        int i2 = (zzahv.zzb * zzahv.zze) / 8;
        int i3 = zzahv.zzd;
        if (i3 == i2) {
            int i4 = zzahv.zzc * i2;
            int i5 = i4 * 8;
            this.zze = Math.max(i2, i4 / 10);
            zzab zzab = new zzab();
            zzab.zzS(str);
            zzab.zzv(i5);
            zzab.zzO(i5);
            zzab.zzL(this.zze);
            zzab.zzw(zzahv.zzb);
            zzab.zzT(zzahv.zzc);
            zzab.zzN(i);
            this.zzd = zzab.zzY();
            return;
        }
        throw zzbp.zza("Expected block size: " + i2 + "; got: " + i3, (Throwable) null);
    }

    public final void zza(int i, long j) {
        this.zza.zzL(new zzahy(this.zzc, 1, (long) i, j));
        this.zzb.zzk(this.zzd);
    }

    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0;
    }

    public final boolean zzc(zzyt zzyt, long j) throws IOException {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i <= 0 || (i2 = this.zzg) >= (i3 = this.zze)) {
                zzahv zzahv = this.zzc;
                int i4 = zzahv.zzd;
                int i5 = this.zzg / i4;
            } else {
                int zza2 = zzzx.zza(this.zzb, zzyt, (int) Math.min((long) (i3 - i2), j2), true);
                if (zza2 == -1) {
                    j2 = 0;
                } else {
                    this.zzg += zza2;
                    j2 -= (long) zza2;
                }
            }
        }
        zzahv zzahv2 = this.zzc;
        int i42 = zzahv2.zzd;
        int i52 = this.zzg / i42;
        if (i52 > 0) {
            long j3 = this.zzf;
            long zzw = zzeg.zzw(this.zzh, 1000000, (long) zzahv2.zzc);
            int i6 = i52 * i42;
            int i7 = this.zzg - i6;
            this.zzb.zzs(j3 + zzw, 1, i6, i7, (zzzy) null);
            this.zzh += (long) i52;
            this.zzg = i7;
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }
}
