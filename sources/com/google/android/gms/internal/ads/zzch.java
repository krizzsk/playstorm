package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzch {
    public static final Object zza = new Object();
    public static final zzl zzb = zzcg.zza;
    private static final Object zzq = new Object();
    private static final zzbb zzr;
    public Object zzc = zza;
    public zzbb zzd = zzr;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    @Deprecated
    public boolean zzj;
    public zzau zzk;
    public boolean zzl;
    public long zzm;
    public long zzn;
    public int zzo;
    public int zzp;

    static {
        zzah zzah = new zzah();
        zzah.zza("androidx.media3.common.Timeline");
        zzah.zzb(Uri.EMPTY);
        zzr = zzah.zzc();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            zzch zzch = (zzch) obj;
            return zzeg.zzS(this.zzc, zzch.zzc) && zzeg.zzS(this.zzd, zzch.zzd) && zzeg.zzS((Object) null, (Object) null) && zzeg.zzS(this.zzk, zzch.zzk) && this.zze == zzch.zze && this.zzf == zzch.zzf && this.zzg == zzch.zzg && this.zzh == zzch.zzh && this.zzi == zzch.zzi && this.zzl == zzch.zzl && this.zzn == zzch.zzn && this.zzo == zzch.zzo && this.zzp == zzch.zzp;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.zzc.hashCode() + 217) * 31) + this.zzd.hashCode()) * 961;
        zzau zzau = this.zzk;
        if (zzau == null) {
            i = 0;
        } else {
            i = zzau.hashCode();
        }
        long j = this.zze;
        long j2 = this.zzf;
        long j3 = this.zzg;
        boolean z = this.zzh;
        boolean z2 = this.zzi;
        boolean z3 = this.zzl;
        long j4 = this.zzn;
        return (((((((((((((((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 961) + ((int) ((j4 >>> 32) ^ j4))) * 31) + this.zzo) * 31) + this.zzp) * 31;
    }

    public final zzch zza(Object obj, zzbb zzbb, Object obj2, long j, long j2, long j3, boolean z, boolean z2, zzau zzau, long j4, long j5, int i, int i2, long j6) {
        zzau zzau2 = zzau;
        this.zzc = obj;
        this.zzd = zzbb != null ? zzbb : zzr;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z;
        this.zzi = z2;
        this.zzj = zzau2 != null;
        this.zzk = zzau2;
        this.zzm = 0;
        this.zzn = j5;
        this.zzo = 0;
        this.zzp = 0;
        this.zzl = false;
        return this;
    }

    public final boolean zzb() {
        zzcw.zzf(this.zzj == (this.zzk != null));
        return this.zzk != null;
    }
}
