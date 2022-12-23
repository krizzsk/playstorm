package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaqu extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzaqu zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        zzaqu zzaqu = new zzaqu();
        zzb = zzaqu;
        zzgko.zzaN(zzaqu.class, zzaqu);
    }

    private zzaqu() {
    }

    public static zzaqt zze() {
        return (zzaqt) zzb.zzaw();
    }

    public static zzaqu zzg() {
        return zzb;
    }

    public static zzaqu zzh(zzgjg zzgjg) throws zzgla {
        return (zzaqu) zzgko.zzaz(zzb, zzgjg);
    }

    public static zzaqu zzi(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzaqu) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzl(zzaqu zzaqu, String str) {
        str.getClass();
        zzaqu.zze |= 1;
        zzaqu.zzf = str;
    }

    static /* synthetic */ void zzm(zzaqu zzaqu, long j) {
        zzaqu.zze |= 16;
        zzaqu.zzj = j;
    }

    static /* synthetic */ void zzn(zzaqu zzaqu, String str) {
        str.getClass();
        zzaqu.zze |= 2;
        zzaqu.zzg = str;
    }

    static /* synthetic */ void zzo(zzaqu zzaqu, long j) {
        zzaqu.zze |= 4;
        zzaqu.zzh = j;
    }

    static /* synthetic */ void zzp(zzaqu zzaqu, long j) {
        zzaqu.zze |= 8;
        zzaqu.zzi = j;
    }

    public final long zza() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzaqu();
        } else {
            if (i2 == 4) {
                return new zzaqt((zzaqs) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final String zzk() {
        return this.zzf;
    }
}
