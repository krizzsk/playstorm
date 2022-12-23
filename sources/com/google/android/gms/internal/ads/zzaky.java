package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaky extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzaky zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private long zzk;
    private long zzl;
    private String zzm = "";
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private zzgkx zzq = zzaH();
    private int zzr;

    static {
        zzaky zzaky = new zzaky();
        zzb = zzaky;
        zzgko.zzaN(zzaky.class, zzaky);
    }

    private zzaky() {
    }

    public static zzaku zza() {
        return (zzaku) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzaky zzaky, long j) {
        zzaky.zze |= 2;
        zzaky.zzg = j;
    }

    static /* synthetic */ void zze(zzaky zzaky, String str) {
        str.getClass();
        zzaky.zze |= 4;
        zzaky.zzh = str;
    }

    static /* synthetic */ void zzf(zzaky zzaky, String str) {
        str.getClass();
        zzaky.zze |= 8;
        zzaky.zzi = str;
    }

    static /* synthetic */ void zzg(zzaky zzaky, String str) {
        zzaky.zze |= 16;
        zzaky.zzj = str;
    }

    static /* synthetic */ void zzh(zzaky zzaky, String str) {
        zzaky.zze |= 1024;
        zzaky.zzp = str;
    }

    static /* synthetic */ void zzi(zzaky zzaky, String str) {
        str.getClass();
        zzaky.zze |= 1;
        zzaky.zzf = str;
    }

    static /* synthetic */ void zzj(zzaky zzaky, int i) {
        zzaky.zzr = i - 1;
        zzaky.zze |= 2048;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", zzakw.class, "zzr", zzakx.zza});
        } else if (i2 == 3) {
            return new zzaky();
        } else {
            if (i2 == 4) {
                return new zzaku((zzakt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
