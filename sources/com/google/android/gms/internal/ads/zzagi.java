package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzagi {
    private final zzzz zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzzr zzd = new zzzr(this.zze, 0, 0);
    private final byte[] zze = new byte[128];
    private int zzf;
    private long zzg;
    private long zzh;
    private final zzagh zzi = new zzagh((zzagg) null);
    private final zzagh zzj = new zzagh((zzagg) null);
    private boolean zzk = false;
    private long zzl;
    private long zzm;
    private boolean zzn;

    public zzagi(zzzz zzzz, boolean z, boolean z2) {
        this.zza = zzzz;
    }

    public final void zza(zzzn zzzn) {
        this.zzc.append(zzzn.zza, zzzn);
    }

    public final void zzb(zzzo zzzo) {
        this.zzb.append(zzzo.zzd, zzzo);
    }

    public final void zzc() {
        this.zzk = false;
    }

    public final void zzd(long j, int i, long j2) {
        this.zzf = i;
        this.zzh = j2;
        this.zzg = j;
    }

    public final boolean zze(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.zzf == 9) {
            if (z && this.zzk) {
                long j2 = this.zzg;
                int i2 = i + ((int) (j - j2));
                long j3 = this.zzm;
                if (j3 != -9223372036854775807L) {
                    this.zza.zzs(j3, this.zzn ? 1 : 0, (int) (j2 - this.zzl), i2, (zzzy) null);
                }
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z4 = this.zzn;
        int i3 = this.zzf;
        if (i3 == 5 || (z2 && i3 == 1)) {
            z3 = true;
        }
        boolean z5 = z4 | z3;
        this.zzn = z5;
        return z5;
    }
}
