package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbb {
    public static final zzbb zza = new zzah().zzc();
    public static final zzl zzb = zzaf.zza;
    public final String zzc;
    public final zzaw zzd;
    @Deprecated
    public final zzay zze;
    public final zzau zzf;
    public final zzbh zzg;
    public final zzal zzh;
    @Deprecated
    public final zzan zzi;

    /* synthetic */ zzbb(String str, zzan zzan, zzay zzay, zzau zzau, zzbh zzbh, zzba zzba) {
        this.zzc = str;
        this.zzd = zzay;
        this.zze = zzay;
        this.zzf = zzau;
        this.zzg = zzbh;
        this.zzh = zzan;
        this.zzi = zzan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbb)) {
            return false;
        }
        zzbb zzbb = (zzbb) obj;
        return zzeg.zzS(this.zzc, zzbb.zzc) && this.zzh.equals(zzbb.zzh) && zzeg.zzS(this.zzd, zzbb.zzd) && zzeg.zzS(this.zzf, zzbb.zzf) && zzeg.zzS(this.zzg, zzbb.zzg);
    }

    public final int hashCode() {
        int hashCode = this.zzc.hashCode() * 31;
        zzaw zzaw = this.zzd;
        return ((((((hashCode + (zzaw != null ? zzaw.hashCode() : 0)) * 31) + this.zzf.hashCode()) * 31) + this.zzh.hashCode()) * 31) + this.zzg.hashCode();
    }
}
