package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgoz extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgoz zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private boolean zzh;

    static {
        zzgoz zzgoz = new zzgoz();
        zzb = zzgoz;
        zzgko.zzaN(zzgoz.class, zzgoz);
    }

    private zzgoz() {
    }

    public static zzgoy zza() {
        return (zzgoy) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzgoz zzgoz, String str) {
        zzgoz.zze |= 1;
        zzgoz.zzf = str;
    }

    static /* synthetic */ void zze(zzgoz zzgoz, long j) {
        zzgoz.zze |= 2;
        zzgoz.zzg = j;
    }

    static /* synthetic */ void zzf(zzgoz zzgoz, boolean z) {
        zzgoz.zze |= 4;
        zzgoz.zzh = z;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgoz();
        } else {
            if (i2 == 4) {
                return new zzgoy((zzgoa) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
