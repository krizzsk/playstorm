package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzgl implements zzju, zzjv {
    private final int zza;
    private final zzja zzb = new zzja();
    private zzjw zzc;
    private int zzd;
    private zzmv zze;
    private int zzf;
    private zztr zzg;
    private zzad[] zzh;
    private long zzi;
    private long zzj = Long.MIN_VALUE;
    private boolean zzk;
    private boolean zzl;

    public zzgl(int i) {
        this.zza = i;
    }

    private final void zzP(long j, boolean z) throws zzgu {
        this.zzk = false;
        this.zzj = j;
        zzu(j, z);
    }

    public final void zzA() {
        zzcw.zzf(this.zzf == 0);
        zzja zzja = this.zzb;
        zzja.zzb = null;
        zzja.zza = null;
        zzv();
    }

    public final void zzB(long j) throws zzgu {
        zzP(j, false);
    }

    public final void zzC() {
        this.zzk = true;
    }

    public /* synthetic */ void zzD(float f, float f2) {
    }

    public final void zzE() throws zzgu {
        boolean z = true;
        if (this.zzf != 1) {
            z = false;
        }
        zzcw.zzf(z);
        this.zzf = 2;
        zzw();
    }

    public final void zzF() {
        zzcw.zzf(this.zzf == 2);
        this.zzf = 1;
        zzx();
    }

    public final boolean zzG() {
        return this.zzj == Long.MIN_VALUE;
    }

    public final boolean zzH() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final zzad[] zzJ() {
        zzad[] zzadArr = this.zzh;
        if (zzadArr != null) {
            return zzadArr;
        }
        throw null;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzbe() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final int zzbf(zzja zzja, zzgc zzgc, int i) {
        zztr zztr = this.zzg;
        if (zztr != null) {
            int zza2 = zztr.zza(zzja, zzgc, i);
            if (zza2 == -4) {
                if (zzgc.zzg()) {
                    this.zzj = Long.MIN_VALUE;
                    return this.zzk ? -4 : -3;
                }
                long j = zzgc.zzd + this.zzi;
                zzgc.zzd = j;
                this.zzj = Math.max(this.zzj, j);
            } else if (zza2 == -5) {
                zzad zzad = zzja.zza;
                if (zzad != null) {
                    long j2 = zzad.zzq;
                    if (j2 != Long.MAX_VALUE) {
                        zzab zzb2 = zzad.zzb();
                        zzb2.zzW(j2 + this.zzi);
                        zzja.zza = zzb2.zzY();
                        return -5;
                    }
                } else {
                    throw null;
                }
            }
            return zza2;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final zzgu zzbg(Throwable th, zzad zzad, boolean z, int i) {
        int i2 = 4;
        if (zzad != null && !this.zzl) {
            this.zzl = true;
            try {
                i2 = zzO(zzad) & 7;
            } catch (zzgu unused) {
            } finally {
                this.zzl = false;
            }
        }
        return zzgu.zzb(th, zzK(), this.zzd, zzad, i2, z, i);
    }

    public int zze() throws zzgu {
        return 0;
    }

    public final long zzf() {
        return this.zzj;
    }

    /* access modifiers changed from: protected */
    public final zzja zzh() {
        zzja zzja = this.zzb;
        zzja.zzb = null;
        zzja.zza = null;
        return zzja;
    }

    public zzjc zzi() {
        return null;
    }

    public final zzjv zzj() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final zzjw zzk() {
        zzjw zzjw = this.zzc;
        if (zzjw != null) {
            return zzjw;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final zzmv zzl() {
        zzmv zzmv = this.zze;
        if (zzmv != null) {
            return zzmv;
        }
        throw null;
    }

    public final zztr zzm() {
        return this.zzg;
    }

    public final void zzn() {
        boolean z = true;
        if (this.zzf != 1) {
            z = false;
        }
        zzcw.zzf(z);
        zzja zzja = this.zzb;
        zzja.zzb = null;
        zzja.zza = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = null;
        this.zzk = false;
        zzs();
    }

    public final void zzo(zzjw zzjw, zzad[] zzadArr, zztr zztr, long j, boolean z, boolean z2, long j2, long j3) throws zzgu {
        boolean z3 = z;
        zzcw.zzf(this.zzf == 0);
        this.zzc = zzjw;
        this.zzf = 1;
        zzt(z, z2);
        zzz(zzadArr, zztr, j2, j3);
        long j4 = j;
        zzP(j, z);
    }

    public void zzp(int i, Object obj) throws zzgu {
    }

    public final void zzq(int i, zzmv zzmv) {
        this.zzd = i;
        this.zze = zzmv;
    }

    /* access modifiers changed from: protected */
    public void zzs() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzt(boolean z, boolean z2) throws zzgu {
    }

    /* access modifiers changed from: protected */
    public void zzu(long j, boolean z) throws zzgu {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzv() {
    }

    /* access modifiers changed from: protected */
    public void zzw() throws zzgu {
    }

    /* access modifiers changed from: protected */
    public void zzx() {
    }

    /* access modifiers changed from: protected */
    public void zzy(zzad[] zzadArr, long j, long j2) throws zzgu {
        throw null;
    }

    public final void zzz(zzad[] zzadArr, zztr zztr, long j, long j2) throws zzgu {
        zzcw.zzf(!this.zzk);
        this.zzg = zztr;
        if (this.zzj == Long.MIN_VALUE) {
            this.zzj = j;
        }
        this.zzh = zzadArr;
        this.zzi = j2;
        zzy(zzadArr, j, j2);
    }

    /* access modifiers changed from: protected */
    public final boolean zzI() {
        if (zzG()) {
            return this.zzk;
        }
        zztr zztr = this.zzg;
        if (zztr != null) {
            return zztr.zze();
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final int zzd(long j) {
        zztr zztr = this.zzg;
        if (zztr != null) {
            return zztr.zzb(j - this.zzi);
        }
        throw null;
    }

    public final void zzr() throws IOException {
        zztr zztr = this.zzg;
        if (zztr != null) {
            zztr.zzd();
            return;
        }
        throw null;
    }
}
