package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbed extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbed zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbed zzbed = new zzbed();
        zzb = zzbed;
        zzgko.zzaN(zzbed.class, zzbed);
    }

    private zzbed() {
    }

    public static zzbec zza() {
        return (zzbec) zzb.zzaw();
    }

    public static zzbed zzd() {
        return zzb;
    }

    static /* synthetic */ void zze(zzbed zzbed, boolean z) {
        zzbed.zze |= 1;
        zzbed.zzf = z;
    }

    static /* synthetic */ void zzf(zzbed zzbed, int i) {
        zzbed.zze |= 2;
        zzbed.zzg = i;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzbed();
        } else {
            if (i2 == 4) {
                return new zzbec((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
