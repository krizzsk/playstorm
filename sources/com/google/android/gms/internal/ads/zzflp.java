package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzflp extends zzgko implements zzglz {
    private static final zzgku zzb = new zzflm();
    /* access modifiers changed from: private */
    public static final zzflp zze;
    private int zzf;
    private zzgkt zzg = zzaE();
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzflp zzflp = new zzflp();
        zze = zzflp;
        zzgko.zzaN(zzflp.class, zzflp);
    }

    private zzflp() {
    }

    public static zzflo zza() {
        return (zzflo) zze.zzaw();
    }

    static /* synthetic */ void zzd(zzflp zzflp, String str) {
        str.getClass();
        zzflp.zzf |= 1;
        zzflp.zzh = str;
    }

    static /* synthetic */ void zze(zzflp zzflp, int i) {
        zzgkt zzgkt = zzflp.zzg;
        if (!zzgkt.zzc()) {
            zzflp.zzg = zzgko.zzaF(zzgkt);
        }
        zzflp.zzg.zzh(2);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", zzfln.zza, "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzflp();
        } else {
            if (i2 == 4) {
                return new zzflo((zzflm) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
