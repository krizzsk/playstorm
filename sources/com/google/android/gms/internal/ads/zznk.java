package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zznk {
    private final Handler zza;
    private final zznl zzb;

    public zznk(Handler handler, zznl zznl) {
        this.zza = zznl == null ? null : handler;
        this.zzb = zznl;
    }

    public final void zza(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzna(this, exc));
        }
    }

    public final void zzb(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzng(this, exc));
        }
    }

    public final void zzc(String str, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznf(this, str, j, j2));
        }
    }

    public final void zzd(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznh(this, str));
        }
    }

    public final void zze(zzgm zzgm) {
        zzgm.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznb(this, zzgm));
        }
    }

    public final void zzf(zzgm zzgm) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznc(this, zzgm));
        }
    }

    public final void zzg(zzad zzad, zzgn zzgn) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzni(this, zzad, zzgn));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Exception exc) {
        zznl zznl = this.zzb;
        int i = zzeg.zza;
        zznl.zzc(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(Exception exc) {
        zznl zznl = this.zzb;
        int i = zzeg.zza;
        zznl.zzj(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(String str, long j, long j2) {
        zznl zznl = this.zzb;
        int i = zzeg.zza;
        zznl.zzd(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(String str) {
        zznl zznl = this.zzb;
        int i = zzeg.zza;
        zznl.zze(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzgm zzgm) {
        zzgm.zza();
        zznl zznl = this.zzb;
        int i = zzeg.zza;
        zznl.zzf(zzgm);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzgm zzgm) {
        zznl zznl = this.zzb;
        int i = zzeg.zza;
        zznl.zzg(zzgm);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(zzad zzad, zzgn zzgn) {
        int i = zzeg.zza;
        this.zzb.zzh(zzad, zzgn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(long j) {
        zznl zznl = this.zzb;
        int i = zzeg.zza;
        zznl.zzi(j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(boolean z) {
        zznl zznl = this.zzb;
        int i = zzeg.zza;
        zznl.zzn(z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(int i, long j, long j2) {
        zznl zznl = this.zzb;
        int i2 = zzeg.zza;
        zznl.zzk(i, j, j2);
    }

    public final void zzr(long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznd(this, j));
        }
    }

    public final void zzs(boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzne(this, z));
        }
    }

    public final void zzt(int i, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznj(this, i, j, j2));
        }
    }
}
