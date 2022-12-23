package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzjg {
    private final zzcf zza = new zzcf();
    private final zzch zzb = new zzch();
    private final zzki zzc;
    private final Handler zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjd zzh;
    private zzjd zzi;
    private zzjd zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzjg(zzki zzki, Handler handler) {
        this.zzc = zzki;
        this.zzd = handler;
    }

    private final boolean zzA(zzci zzci, zzsb zzsb) {
        if (!zzC(zzsb)) {
            return false;
        }
        int i = zzci.zzn(zzsb.zza, this.zza).zzd;
        if (zzci.zze(i, this.zzb, 0).zzp == zzci.zza(zzsb.zza)) {
            return true;
        }
        return false;
    }

    private final boolean zzB(zzci zzci) {
        zzjd zzjd = this.zzh;
        if (zzjd == null) {
            return true;
        }
        int zza2 = zzci.zza(zzjd.zzb);
        while (true) {
            zza2 = zzci.zzi(zza2, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzjd.zzg() != null && !zzjd.zzf.zzg) {
                zzjd = zzjd.zzg();
            }
            zzjd zzg2 = zzjd.zzg();
            if (zza2 == -1 || zzg2 == null || zzci.zza(zzg2.zzb) != zza2) {
                boolean zzm2 = zzm(zzjd);
                zzjd.zzf = zzg(zzci, zzjd.zzf);
            } else {
                zzjd = zzg2;
            }
        }
        boolean zzm22 = zzm(zzjd);
        zzjd.zzf = zzg(zzci, zzjd.zzf);
        if (!zzm22) {
            return true;
        }
        return false;
    }

    private static final boolean zzC(zzsb zzsb) {
        return !zzsb.zzb() && zzsb.zze == -1;
    }

    private final long zzs(zzci zzci, Object obj, int i) {
        zzci.zzn(obj, this.zza);
        this.zza.zzh(i);
        this.zza.zzj(i);
        return 0;
    }

    private final zzje zzt(zzci zzci, zzjd zzjd, long j) {
        long j2;
        zzci zzci2 = zzci;
        zzje zzje = zzjd.zzf;
        long zze2 = (zzjd.zze() + zzje.zze) - j;
        if (zzje.zzg) {
            long j3 = 0;
            int zzi2 = zzci.zzi(zzci2.zza(zzje.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi2 == -1) {
                return null;
            }
            int i = zzci2.zzd(zzi2, this.zza, true).zzd;
            Object obj = this.zza.zzc;
            if (obj != null) {
                long j4 = zzje.zza.zzd;
                if (zzci2.zze(i, this.zzb, 0).zzo == zzi2) {
                    Pair zzm2 = zzci.zzm(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0, zze2));
                    if (zzm2 == null) {
                        return null;
                    }
                    obj = zzm2.first;
                    long longValue = ((Long) zzm2.second).longValue();
                    zzjd zzg2 = zzjd.zzg();
                    if (zzg2 == null || !zzg2.zzb.equals(obj)) {
                        j4 = this.zze;
                        this.zze = 1 + j4;
                    } else {
                        j4 = zzg2.zzf.zza.zzd;
                    }
                    j2 = longValue;
                    j3 = -9223372036854775807L;
                } else {
                    j2 = 0;
                }
                zzsb zzx = zzx(zzci, obj, j2, j4, this.zzb, this.zza);
                if (!(j3 == -9223372036854775807L || zzje.zzc == -9223372036854775807L)) {
                    zzci2.zzn(zzje.zza.zza, this.zza).zzb();
                }
                return zzu(zzci, zzx, j3, j2);
            }
            throw null;
        }
        zzsb zzsb = zzje.zza;
        zzci2.zzn(zzsb.zza, this.zza);
        if (zzsb.zzb()) {
            int i2 = zzsb.zzb;
            if (this.zza.zza(i2) == -1) {
                return null;
            }
            int zzf2 = this.zza.zzf(i2, zzsb.zzc);
            if (zzf2 < 0) {
                return zzv(zzci, zzsb.zza, i2, zzf2, zzje.zzc, zzsb.zzd);
            }
            long j5 = zzje.zzc;
            if (j5 == -9223372036854775807L) {
                zzch zzch = this.zzb;
                zzcf zzcf = this.zza;
                Pair zzm3 = zzci.zzm(zzch, zzcf, zzcf.zzd, -9223372036854775807L, Math.max(0, zze2));
                if (zzm3 == null) {
                    return null;
                }
                j5 = ((Long) zzm3.second).longValue();
            }
            zzs(zzci2, zzsb.zza, zzsb.zzb);
            return zzw(zzci, zzsb.zza, Math.max(0, j5), zzje.zzc, zzsb.zzd);
        }
        int zze3 = this.zza.zze(zzsb.zze);
        this.zza.zzl(zzsb.zze);
        if (zze3 != this.zza.zza(zzsb.zze)) {
            return zzv(zzci, zzsb.zza, zzsb.zze, zze3, zzje.zze, zzsb.zzd);
        }
        zzs(zzci2, zzsb.zza, zzsb.zze);
        return zzw(zzci, zzsb.zza, 0, zzje.zze, zzsb.zzd);
    }

    private final zzje zzu(zzci zzci, zzsb zzsb, long j, long j2) {
        zzsb zzsb2 = zzsb;
        zzci zzci2 = zzci;
        zzci.zzn(zzsb2.zza, this.zza);
        if (zzsb.zzb()) {
            return zzv(zzci, zzsb2.zza, zzsb2.zzb, zzsb2.zzc, j, zzsb2.zzd);
        }
        return zzw(zzci, zzsb2.zza, j2, j, zzsb2.zzd);
    }

    private final zzje zzv(zzci zzci, Object obj, int i, int i2, long j, long j2) {
        zzsb zzsb = new zzsb(obj, i, i2, j2);
        long zzg2 = zzci.zzn(zzsb.zza, this.zza).zzg(zzsb.zzb, zzsb.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzi();
        }
        this.zza.zzl(zzsb.zzb);
        return new zzje(zzsb, (zzg2 == -9223372036854775807L || zzg2 > 0) ? 0 : Math.max(0, -1 + zzg2), j, -9223372036854775807L, zzg2, false, false, false, false);
    }

    private final zzje zzw(zzci zzci, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        zzci zzci2 = zzci;
        Object obj2 = obj;
        long j7 = j;
        zzci2.zzn(obj2, this.zza);
        int zzc2 = this.zza.zzc(j7);
        if (zzc2 == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzl(zzc2);
        }
        zzsb zzsb = new zzsb(obj2, j3, zzc2);
        boolean zzC = zzC(zzsb);
        boolean zzA = zzA(zzci2, zzsb);
        boolean zzz = zzz(zzci2, zzsb, zzC);
        if (zzc2 != -1) {
            this.zza.zzl(zzc2);
        }
        if (zzc2 != -1) {
            this.zza.zzh(zzc2);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = this.zza.zze;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0, j5 - 1);
        }
        return new zzje(zzsb, j7, j2, j6, j5, false, zzC, zzA, zzz);
    }

    private static zzsb zzx(zzci zzci, Object obj, long j, long j2, zzch zzch, zzcf zzcf) {
        zzci.zzn(obj, zzcf);
        zzci.zze(zzcf.zzd, zzch, 0);
        zzci.zza(obj);
        if (zzcf.zze == 0) {
            zzcf.zzb();
        }
        zzci.zzn(obj, zzcf);
        int zzd2 = zzcf.zzd(j);
        if (zzd2 == -1) {
            return new zzsb(obj, j2, zzcf.zzc(j));
        }
        return new zzsb(obj, zzd2, zzcf.zze(zzd2), j2);
    }

    private final void zzy() {
        zzsb zzsb;
        zzfre zzi2 = zzfrh.zzi();
        for (zzjd zzjd = this.zzh; zzjd != null; zzjd = zzjd.zzg()) {
            zzi2.zze(zzjd.zzf.zza);
        }
        zzjd zzjd2 = this.zzi;
        if (zzjd2 == null) {
            zzsb = null;
        } else {
            zzsb = zzjd2.zzf.zza;
        }
        this.zzd.post(new zzjf(this, zzi2, zzsb));
    }

    private final boolean zzz(zzci zzci, zzsb zzsb, boolean z) {
        int zza2 = zzci.zza(zzsb.zza);
        if (!zzci.zze(zzci.zzd(zza2, this.zza, false).zzd, this.zzb, 0).zzi) {
            if (zzci.zzi(zza2, this.zza, this.zzb, this.zzf, this.zzg) != -1 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final zzjd zza() {
        zzjd zzjd = this.zzh;
        if (zzjd == null) {
            return null;
        }
        if (zzjd == this.zzi) {
            this.zzi = zzjd.zzg();
        }
        zzjd.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzjd zzjd2 = this.zzh;
            this.zzl = zzjd2.zzb;
            this.zzm = zzjd2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzjd zzb() {
        zzjd zzjd = this.zzi;
        boolean z = false;
        if (!(zzjd == null || zzjd.zzg() == null)) {
            z = true;
        }
        zzcw.zzf(z);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    public final zzjd zzc() {
        return this.zzj;
    }

    public final zzjd zzd() {
        return this.zzh;
    }

    public final zzjd zze() {
        return this.zzi;
    }

    public final zzje zzf(long j, zzjo zzjo) {
        zzjd zzjd = this.zzj;
        if (zzjd != null) {
            return zzt(zzjo.zza, zzjd, j);
        }
        return zzu(zzjo.zza, zzjo.zzb, zzjo.zzc, zzjo.zzs);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzje zzg(com.google.android.gms.internal.ads.zzci r19, com.google.android.gms.internal.ads.zzje r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzsb r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zzsb r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzcf r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0037
            int r1 = r3.zze
            if (r1 != r4) goto L_0x0030
            goto L_0x0037
        L_0x0030:
            com.google.android.gms.internal.ads.zzcf r9 = r0.zza
            r9.zzh(r1)
            r9 = r5
            goto L_0x0038
        L_0x0037:
            r9 = r7
        L_0x0038:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzcf r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzg(r5, r6)
        L_0x0048:
            r7 = r9
            r9 = r5
            goto L_0x0057
        L_0x004b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            r7 = r5
            r9 = r7
            goto L_0x0057
        L_0x0052:
            com.google.android.gms.internal.ads.zzcf r1 = r0.zza
            long r5 = r1.zze
            goto L_0x0048
        L_0x0057:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.zzcf r1 = r0.zza
            int r4 = r3.zzb
            r1.zzl(r4)
            goto L_0x006e
        L_0x0065:
            int r1 = r3.zze
            if (r1 == r4) goto L_0x006e
            com.google.android.gms.internal.ads.zzcf r4 = r0.zza
            r4.zzl(r1)
        L_0x006e:
            com.google.android.gms.internal.ads.zzje r15 = new com.google.android.gms.internal.ads.zzje
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjg.zzg(com.google.android.gms.internal.ads.zzci, com.google.android.gms.internal.ads.zzje):com.google.android.gms.internal.ads.zzje");
    }

    public final zzsb zzh(zzci zzci, Object obj, long j) {
        long j2;
        int zza2;
        int i = zzci.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza2 = zzci.zza(obj2)) == -1 || zzci.zzd(zza2, this.zza, false).zzd != i) {
            zzjd zzjd = this.zzh;
            while (true) {
                if (zzjd == null) {
                    zzjd zzjd2 = this.zzh;
                    while (true) {
                        if (zzjd2 != null) {
                            int zza3 = zzci.zza(zzjd2.zzb);
                            if (zza3 != -1 && zzci.zzd(zza3, this.zza, false).zzd == i) {
                                j2 = zzjd2.zzf.zza.zzd;
                                break;
                            }
                            zzjd2 = zzjd2.zzg();
                        } else {
                            j2 = this.zze;
                            this.zze = 1 + j2;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j2;
                            }
                        }
                    }
                } else if (zzjd.zzb.equals(obj)) {
                    j2 = zzjd.zzf.zza.zzd;
                    break;
                } else {
                    zzjd = zzjd.zzg();
                }
            }
        } else {
            j2 = this.zzm;
        }
        long j3 = j2;
        zzci.zzn(obj, this.zza);
        zzci.zze(this.zza.zzd, this.zzb, 0);
        int zza4 = zzci.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzch zzch = this.zzb;
            if (zza4 < zzch.zzo) {
                return zzx(zzci, obj3, j, j3, zzch, this.zza);
            }
            zzci.zzd(zza4, this.zza, true);
            this.zza.zzb();
            zzcf zzcf = this.zza;
            if (zzcf.zzd(zzcf.zze) == -1 || (obj3 = this.zza.zzc) != null) {
                zza4--;
            } else {
                throw null;
            }
        }
    }

    public final void zzi() {
        if (this.zzk != 0) {
            zzjd zzjd = this.zzh;
            zzcw.zzb(zzjd);
            this.zzl = zzjd.zzb;
            this.zzm = zzjd.zzf.zza.zzd;
            while (zzjd != null) {
                zzjd.zzn();
                zzjd = zzjd.zzg();
            }
            this.zzh = null;
            this.zzj = null;
            this.zzi = null;
            this.zzk = 0;
            zzy();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzfre zzfre, zzsb zzsb) {
        this.zzc.zzT(zzfre.zzg(), zzsb);
    }

    public final void zzk(long j) {
        zzjd zzjd = this.zzj;
        if (zzjd != null) {
            zzjd.zzm(j);
        }
    }

    public final boolean zzl(zzrz zzrz) {
        zzjd zzjd = this.zzj;
        return zzjd != null && zzjd.zza == zzrz;
    }

    public final boolean zzm(zzjd zzjd) {
        boolean z = false;
        zzcw.zzf(zzjd != null);
        if (zzjd.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzjd;
        while (zzjd.zzg() != null) {
            zzjd = zzjd.zzg();
            if (zzjd == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzjd.zzn();
            this.zzk--;
        }
        this.zzj.zzo((zzjd) null);
        zzy();
        return z;
    }

    public final boolean zzn() {
        zzjd zzjd = this.zzj;
        if (zzjd == null) {
            return true;
        }
        if (zzjd.zzf.zzi || !zzjd.zzr() || this.zzj.zzf.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzk < 100;
    }

    public final boolean zzo(zzci zzci, long j, long j2) {
        zzje zzje;
        long j3;
        boolean z;
        zzci zzci2 = zzci;
        zzjd zzjd = this.zzh;
        zzjd zzjd2 = null;
        while (zzjd != null) {
            zzje zzje2 = zzjd.zzf;
            if (zzjd2 == null) {
                zzje = zzg(zzci2, zzje2);
                long j4 = j;
            } else {
                zzje zzt = zzt(zzci2, zzjd2, j);
                if (zzt == null) {
                    return !zzm(zzjd2);
                }
                if (zzje2.zzb != zzt.zzb || !zzje2.zza.equals(zzt.zza)) {
                    return !zzm(zzjd2);
                }
                zzje = zzt;
            }
            zzjd.zzf = zzje.zza(zzje2.zzc);
            long j5 = zzje2.zze;
            long j6 = zzje.zze;
            if (j5 == -9223372036854775807L || j5 == j6) {
                zzjd2 = zzjd;
                zzjd = zzjd.zzg();
            } else {
                zzjd.zzq();
                long j7 = zzje.zze;
                if (j7 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = j7 + zzjd.zze();
                }
                if (zzjd == this.zzi) {
                    boolean z2 = zzjd.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= j3) {
                        z = true;
                        return zzm(zzjd) && !z;
                    }
                }
                z = false;
                if (zzm(zzjd)) {
                }
            }
        }
        return true;
    }

    public final boolean zzp(zzci zzci, int i) {
        this.zzf = i;
        return zzB(zzci);
    }

    public final boolean zzq(zzci zzci, boolean z) {
        this.zzg = z;
        return zzB(zzci);
    }

    public final zzjd zzr(zzjv[] zzjvArr, zzvn zzvn, zzvw zzvw, zzjn zzjn, zzje zzje, zzvo zzvo) {
        long j;
        zzjd zzjd = this.zzj;
        if (zzjd == null) {
            j = 1000000000000L;
            zzje zzje2 = zzje;
        } else {
            j = (zzjd.zze() + zzjd.zzf.zze) - zzje.zzb;
        }
        zzjd zzjd2 = new zzjd(zzjvArr, j, zzvn, zzvw, zzjn, zzje, zzvo, (byte[]) null);
        zzjd zzjd3 = this.zzj;
        if (zzjd3 != null) {
            zzjd3.zzo(zzjd2);
        } else {
            this.zzh = zzjd2;
            this.zzi = zzjd2;
        }
        this.zzl = null;
        this.zzj = zzjd2;
        this.zzk++;
        zzy();
        return zzjd2;
    }
}
