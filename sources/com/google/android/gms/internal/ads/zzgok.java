package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgok extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgok zzb;
    private int zze;
    private zzgoj zzf;
    private zzgkx zzg = zzaH();
    private zzgjg zzh = zzgjg.zzb;
    private zzgjg zzi = zzgjg.zzb;
    private int zzj;
    private byte zzk = 2;

    static {
        zzgok zzgok = new zzgok();
        zzb = zzgok;
        zzgko.zzaN(zzgok.class, zzgok);
    }

    private zzgok() {
    }

    public static zzgoh zza() {
        return (zzgoh) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzgok zzgok, zzgog zzgog) {
        zzgog.getClass();
        zzgkx zzgkx = zzgok.zzg;
        if (!zzgkx.zzc()) {
            zzgok.zzg = zzgko.zzaI(zzgkx);
        }
        zzgok.zzg.add(zzgog);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", zzgog.class, "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzgok();
        } else {
            if (i2 == 4) {
                return new zzgoh((zzgoa) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzk = b;
            return null;
        }
    }
}
