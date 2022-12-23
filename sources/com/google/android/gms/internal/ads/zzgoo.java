package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgoo extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgoo zzb;
    private int zze;
    private zzgon zzf;
    private zzgkx zzg = zzaH();
    private zzgjg zzh = zzgjg.zzb;
    private zzgjg zzi;
    private int zzj;
    private zzgjg zzk;
    private byte zzl = 2;

    static {
        zzgoo zzgoo = new zzgoo();
        zzb = zzgoo;
        zzgko.zzaN(zzgoo.class, zzgoo);
    }

    private zzgoo() {
        zzgjg zzgjg = zzgjg.zzb;
        this.zzi = zzgjg;
        this.zzk = zzgjg;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", zzgog.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new zzgoo();
        } else {
            if (i2 == 4) {
                return new zzgol((zzgoa) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzl = b;
            return null;
        }
    }
}
