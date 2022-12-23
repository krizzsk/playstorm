package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaet {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzad zzf;
    public final int zzg;
    public final long[] zzh;
    public final long[] zzi;
    public final int zzj;
    private final zzaeu[] zzk;

    public zzaet(int i, int i2, long j, long j2, long j3, zzad zzad, int i3, zzaeu[] zzaeuArr, int i4, long[] jArr, long[] jArr2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = zzad;
        this.zzg = i3;
        this.zzk = zzaeuArr;
        this.zzj = i4;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    public final zzaeu zza(int i) {
        zzaeu[] zzaeuArr = this.zzk;
        if (zzaeuArr == null) {
            return null;
        }
        return zzaeuArr[i];
    }
}
