package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfhv extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzfhv zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public long zzg;
    /* access modifiers changed from: private */
    public int zzh;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    /* access modifiers changed from: private */
    public int zzl;
    private int zzm;
    /* access modifiers changed from: private */
    public int zzn;
    /* access modifiers changed from: private */
    public long zzo;
    private int zzp;
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    /* access modifiers changed from: private */
    public String zzt = "";
    private String zzu = "";

    static {
        zzfhv zzfhv = new zzfhv();
        zzb = zzfhv;
        zzgko.zzaN(zzfhv.class, zzfhv);
    }

    private zzfhv() {
    }

    public static zzfhu zza() {
        return (zzfhu) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzfhv zzfhv, String str) {
        str.getClass();
        zzfhv.zzi = str;
    }

    static /* synthetic */ void zze(zzfhv zzfhv, String str) {
        str.getClass();
        zzfhv.zzj = str;
    }

    static /* synthetic */ void zzf(zzfhv zzfhv, String str) {
        str.getClass();
        zzfhv.zzk = str;
    }

    static /* synthetic */ void zzj(zzfhv zzfhv, String str) {
        str.getClass();
        zzfhv.zzq = str;
    }

    static /* synthetic */ void zzk(zzfhv zzfhv, String str) {
        str.getClass();
        zzfhv.zzr = str;
    }

    static /* synthetic */ void zzl(zzfhv zzfhv, String str) {
        str.getClass();
        zzfhv.zzs = str;
    }

    static /* synthetic */ void zzo(zzfhv zzfhv, String str) {
        str.getClass();
        zzfhv.zzu = str;
    }

    static /* synthetic */ void zzr(zzfhv zzfhv, int i) {
        if (i != 1) {
            zzfhv.zzm = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    static /* synthetic */ void zzs(zzfhv zzfhv, int i) {
        if (i != 1) {
            zzfhv.zzp = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        } else if (i2 == 3) {
            return new zzfhv();
        } else {
            if (i2 == 4) {
                return new zzfhu((zzfht) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
