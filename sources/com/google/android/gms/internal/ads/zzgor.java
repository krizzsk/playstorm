package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgor extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgor zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzgjg zzh = zzgjg.zzb;

    static {
        zzgor zzgor = new zzgor();
        zzb = zzgor;
        zzgko.zzaN(zzgor.class, zzgor);
    }

    private zzgor() {
    }

    public static zzgop zza() {
        return (zzgop) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzgor zzgor, String str) {
        zzgor.zze |= 2;
        zzgor.zzg = "image/png";
    }

    static /* synthetic */ void zze(zzgor zzgor, zzgjg zzgjg) {
        zzgjg.getClass();
        zzgor.zze |= 4;
        zzgor.zzh = zzgjg;
    }

    static /* synthetic */ void zzf(zzgor zzgor, int i) {
        zzgor.zzf = 1;
        zzgor.zze = 1 | zzgor.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", zzgoq.zza, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgor();
        } else {
            if (i2 == 4) {
                return new zzgop((zzgoa) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
