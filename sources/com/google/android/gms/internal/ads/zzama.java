package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzama extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzama zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private zzgkt zzi = zzaE();
    private long zzj;

    static {
        zzama zzama = new zzama();
        zzb = zzama;
        zzgko.zzaN(zzama.class, zzama);
    }

    private zzama() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzama();
        } else {
            if (i2 == 4) {
                return new zzalz((zzalh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
