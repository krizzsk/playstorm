package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public class zzbja {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbja(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbja zza(String str, double d) {
        return new zzbja(str, Double.valueOf(d), 3);
    }

    public static zzbja zzb(String str, long j) {
        return new zzbja(str, Long.valueOf(j), 2);
    }

    public static zzbja zzc(String str, String str2) {
        return new zzbja(str, str2, 4);
    }

    public static zzbja zzd(String str, boolean z) {
        return new zzbja(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbkd zza2 = zzbkf.zza();
        if (zza2 == null) {
            if (zzbkf.zzb() != null) {
                zzbkf.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i == 0) {
            return zza2.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i == 1) {
            return zza2.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        if (i != 2) {
            return zza2.zzd(this.zza, (String) this.zzb);
        }
        return zza2.zzb(this.zza, ((Double) this.zzb).doubleValue());
    }
}
