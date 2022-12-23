package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfiu {
    private final String zza;
    private final String zzb;

    private zzfiu(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfiu zza(String str, String str2) {
        zzfjt.zza(str, "Name is null or empty");
        zzfjt.zza(str2, "Version is null or empty");
        return new zzfiu(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
