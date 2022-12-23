package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbhg extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbhg zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbhg zzbhg = new zzbhg();
        zzb = zzbhg;
        zzgko.zzaN(zzbhg.class, zzbhg);
    }

    private zzbhg() {
    }

    public static zzbhf zza() {
        return (zzbhf) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzbhg zzbhg, boolean z) {
        zzbhg.zze |= 1;
        zzbhg.zzf = z;
    }

    static /* synthetic */ void zze(zzbhg zzbhg, int i) {
        zzbhg.zze |= 2;
        zzbhg.zzg = i;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzbhg();
        } else {
            if (i2 == 4) {
                return new zzbhf((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zzf() {
        return this.zzf;
    }
}
