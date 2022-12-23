package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzalx extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzalx zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;

    static {
        zzalx zzalx = new zzalx();
        zzb = zzalx;
        zzgko.zzaN(zzalx.class, zzalx);
    }

    private zzalx() {
    }

    public static zzalw zza() {
        return (zzalw) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzalx zzalx, long j) {
        zzalx.zze |= 1;
        zzalx.zzf = j;
    }

    static /* synthetic */ void zze(zzalx zzalx, long j) {
        zzalx.zze |= 4;
        zzalx.zzh = j;
    }

    static /* synthetic */ void zzf(zzalx zzalx, long j) {
        zzalx.zze |= 8;
        zzalx.zzi = j;
    }

    static /* synthetic */ void zzg(zzalx zzalx, long j) {
        zzalx.zze |= 16;
        zzalx.zzj = j;
    }

    static /* synthetic */ void zzh(zzalx zzalx, long j) {
        zzalx.zze |= 32;
        zzalx.zzk = j;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new zzalx();
        } else {
            if (i2 == 4) {
                return new zzalw((zzalh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
