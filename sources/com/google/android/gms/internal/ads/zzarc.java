package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzarc implements zzarx, zzary {
    private final int zza;
    private zzarz zzb;
    private int zzc;
    private int zzd;
    private zzaxk zze;
    private long zzf;
    private boolean zzg = true;
    private boolean zzh;

    public zzarc(int i) {
        this.zza = i;
    }

    public final boolean zzA() {
        return this.zzg;
    }

    public final boolean zzB() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final boolean zzC() {
        return this.zzg ? this.zzh : this.zze.zze();
    }

    /* access modifiers changed from: protected */
    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final int zzd(zzart zzart, zzatn zzatn, boolean z) {
        zzart zzart2 = zzart;
        zzatn zzatn2 = zzatn;
        int zzb2 = this.zze.zzb(zzart2, zzatn2, z);
        if (zzb2 == -4) {
            if (zzatn.zzf()) {
                this.zzg = true;
                return this.zzh ? -4 : -3;
            }
            zzatn2.zzc += this.zzf;
        } else if (zzb2 == -5) {
            zzars zzars = zzart2.zza;
            long j = zzars.zzw;
            if (j != Long.MAX_VALUE) {
                zzart2.zza = new zzars(zzars.zza, zzars.zze, zzars.zzf, zzars.zzc, zzars.zzb, zzars.zzg, zzars.zzj, zzars.zzk, zzars.zzl, zzars.zzm, zzars.zzn, zzars.zzp, zzars.zzo, zzars.zzq, zzars.zzr, zzars.zzs, zzars.zzt, zzars.zzu, zzars.zzv, zzars.zzx, zzars.zzy, zzars.zzz, j + this.zzf, zzars.zzh, zzars.zzi, zzars.zzd);
                return -5;
            }
        }
        return zzb2;
    }

    public int zze() throws zzare {
        throw null;
    }

    public final zzary zzf() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final zzarz zzg() {
        return this.zzb;
    }

    public final zzaxk zzh() {
        return this.zze;
    }

    public zzazc zzi() {
        return null;
    }

    public final void zzj() {
        boolean z = true;
        if (this.zzd != 1) {
            z = false;
        }
        zzayy.zze(z);
        this.zzd = 0;
        this.zze = null;
        this.zzh = false;
        zzn();
    }

    public final void zzk(zzarz zzarz, zzars[] zzarsArr, zzaxk zzaxk, long j, boolean z, long j2) throws zzare {
        zzayy.zze(this.zzd == 0);
        this.zzb = zzarz;
        this.zzd = 1;
        zzo(z);
        zzt(zzarsArr, zzaxk, j2);
        zzp(j, z);
    }

    public void zzl(int i, Object obj) throws zzare {
    }

    public final void zzm() throws IOException {
        this.zze.zzc();
    }

    /* access modifiers changed from: protected */
    public void zzn() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzo(boolean z) throws zzare {
    }

    /* access modifiers changed from: protected */
    public void zzp(long j, boolean z) throws zzare {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzq() throws zzare {
    }

    /* access modifiers changed from: protected */
    public void zzr() throws zzare {
    }

    /* access modifiers changed from: protected */
    public void zzs(zzars[] zzarsArr, long j) throws zzare {
    }

    public final void zzt(zzars[] zzarsArr, zzaxk zzaxk, long j) throws zzare {
        zzayy.zze(!this.zzh);
        this.zze = zzaxk;
        this.zzg = false;
        this.zzf = j;
        zzs(zzarsArr, j);
    }

    public final void zzu(long j) throws zzare {
        this.zzh = false;
        this.zzg = false;
        zzp(j, false);
    }

    public final void zzv() {
        this.zzh = true;
    }

    public final void zzw(int i) {
        this.zzc = i;
    }

    /* access modifiers changed from: protected */
    public final void zzx(long j) {
        this.zze.zzd(j - this.zzf);
    }

    public final void zzy() throws zzare {
        boolean z = true;
        if (this.zzd != 1) {
            z = false;
        }
        zzayy.zze(z);
        this.zzd = 2;
        zzq();
    }

    public final void zzz() throws zzare {
        zzayy.zze(this.zzd == 2);
        this.zzd = 1;
        zzr();
    }
}
