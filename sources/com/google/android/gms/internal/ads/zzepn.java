package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzepn implements zzetb {
    private final zzfvk zza;
    private final zzdug zzb;
    private final String zzc;
    private final zzfby zzd;

    public zzepn(zzfvk zzfvk, zzdug zzdug, zzfby zzfby, String str) {
        this.zza = zzfvk;
        this.zzb = zzdug;
        this.zzd = zzfby;
        this.zzc = str;
    }

    public final int zza() {
        return 17;
    }

    public final zzfvj zzb() {
        return this.zza.zzb(new zzepm(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzepo zzc() throws Exception {
        return new zzepo(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zza());
    }
}
