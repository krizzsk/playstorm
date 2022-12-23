package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgpa extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgpa zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzgoe zzk;
    private zzgkx zzl = zzaH();
    private String zzm = "";
    private zzgor zzn;
    private boolean zzo;
    private zzgkx zzp = zzgko.zzaH();
    private String zzq = "";
    private boolean zzr;
    private boolean zzs;
    private zzgjg zzt = zzgjg.zzb;
    private zzgoz zzu;
    private zzgkx zzv = zzgko.zzaH();
    private zzgkx zzw = zzgko.zzaH();
    private byte zzx = 2;

    static {
        zzgpa zzgpa = new zzgpa();
        zzb = zzgpa;
        zzgko.zzaN(zzgpa.class, zzgpa);
    }

    private zzgpa() {
    }

    public static zzgoc zza() {
        return (zzgoc) zzb.zzaw();
    }

    static /* synthetic */ void zzg(zzgpa zzgpa, String str) {
        str.getClass();
        zzgpa.zze |= 4;
        zzgpa.zzh = str;
    }

    static /* synthetic */ void zzh(zzgpa zzgpa, String str) {
        str.getClass();
        zzgpa.zze |= 8;
        zzgpa.zzi = str;
    }

    static /* synthetic */ void zzi(zzgpa zzgpa, zzgoe zzgoe) {
        zzgoe.getClass();
        zzgpa.zzk = zzgoe;
        zzgpa.zze |= 32;
    }

    static /* synthetic */ void zzj(zzgpa zzgpa, zzgox zzgox) {
        zzgox.getClass();
        zzgkx zzgkx = zzgpa.zzl;
        if (!zzgkx.zzc()) {
            zzgpa.zzl = zzgko.zzaI(zzgkx);
        }
        zzgpa.zzl.add(zzgox);
    }

    static /* synthetic */ void zzk(zzgpa zzgpa, String str) {
        zzgpa.zze |= 64;
        zzgpa.zzm = str;
    }

    static /* synthetic */ void zzl(zzgpa zzgpa) {
        zzgpa.zze &= -65;
        zzgpa.zzm = zzb.zzm;
    }

    static /* synthetic */ void zzm(zzgpa zzgpa, zzgor zzgor) {
        zzgor.getClass();
        zzgpa.zzn = zzgor;
        zzgpa.zze |= 128;
    }

    static /* synthetic */ void zzn(zzgpa zzgpa, zzgoz zzgoz) {
        zzgoz.getClass();
        zzgpa.zzu = zzgoz;
        zzgpa.zze |= 8192;
    }

    static /* synthetic */ void zzo(zzgpa zzgpa, Iterable iterable) {
        zzgkx zzgkx = zzgpa.zzv;
        if (!zzgkx.zzc()) {
            zzgpa.zzv = zzgko.zzaI(zzgkx);
        }
        zzgip.zzar(iterable, zzgpa.zzv);
    }

    static /* synthetic */ void zzp(zzgpa zzgpa, Iterable iterable) {
        zzgkx zzgkx = zzgpa.zzw;
        if (!zzgkx.zzc()) {
            zzgpa.zzw = zzgko.zzaI(zzgkx);
        }
        zzgip.zzar(iterable, zzgpa.zzw);
    }

    static /* synthetic */ void zzq(zzgpa zzgpa, int i) {
        zzgpa.zzf = i - 1;
        zzgpa.zze |= 1;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzh;
    }

    public final List zzf() {
        return this.zzl;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzx);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", zzgox.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzf", zzgos.zza, "zzg", zzgob.zza, "zzk", "zzm", "zzn", "zzt", "zzu", "zzv", "zzw"});
        } else if (i2 == 3) {
            return new zzgpa();
        } else {
            if (i2 == 4) {
                return new zzgoc((zzgoa) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzx = b;
            return null;
        }
    }
}
