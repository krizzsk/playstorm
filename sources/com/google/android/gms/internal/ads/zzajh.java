package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzajh {
    public final Object zza;
    public final zzaik zzb;
    public final zzajk zzc;
    public boolean zzd;

    private zzajh(zzajk zzajk) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzajk;
    }

    private zzajh(Object obj, zzaik zzaik) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaik;
        this.zzc = null;
    }

    public static zzajh zza(zzajk zzajk) {
        return new zzajh(zzajk);
    }

    public static zzajh zzb(Object obj, zzaik zzaik) {
        return new zzajh(obj, zzaik);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
