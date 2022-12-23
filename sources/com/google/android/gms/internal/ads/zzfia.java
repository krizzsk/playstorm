package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfia extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzfia zzb;
    /* access modifiers changed from: private */
    public zzgkx zze = zzaH();

    static {
        zzfia zzfia = new zzfia();
        zzb = zzfia;
        zzgko.zzaN(zzfia.class, zzfia);
    }

    private zzfia() {
    }

    public static zzfhx zzc() {
        return (zzfhx) zzb.zzaw();
    }

    static /* synthetic */ void zzf(zzfia zzfia, zzfhz zzfhz) {
        zzfhz.getClass();
        zzgkx zzgkx = zzfia.zze;
        if (!zzgkx.zzc()) {
            zzfia.zze = zzgko.zzaI(zzgkx);
        }
        zzfia.zze.add(zzfhz);
    }

    public final int zza() {
        return this.zze.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzfhz.class});
        } else if (i2 == 3) {
            return new zzfia();
        } else {
            if (i2 == 4) {
                return new zzfhx((zzfhw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
