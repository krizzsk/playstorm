package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzxq {
    private final Handler zza;
    private final zzxr zzb;

    public zzxq(Handler handler, zzxr zzxr) {
        this.zza = zzxr == null ? null : handler;
        this.zzb = zzxr;
    }

    public final void zza(String str, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxm(this, str, j, j2));
        }
    }

    public final void zzb(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxp(this, str));
        }
    }

    public final void zzc(zzgm zzgm) {
        zzgm.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxl(this, zzgm));
        }
    }

    public final void zzd(int i, long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxg(this, i, j));
        }
    }

    public final void zze(zzgm zzgm) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxk(this, zzgm));
        }
    }

    public final void zzf(zzad zzad, zzgn zzgn) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxn(this, zzad, zzgn));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(String str, long j, long j2) {
        zzxr zzxr = this.zzb;
        int i = zzeg.zza;
        zzxr.zzp(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str) {
        zzxr zzxr = this.zzb;
        int i = zzeg.zza;
        zzxr.zzq(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzgm zzgm) {
        zzgm.zza();
        zzxr zzxr = this.zzb;
        int i = zzeg.zza;
        zzxr.zzr(zzgm);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(int i, long j) {
        zzxr zzxr = this.zzb;
        int i2 = zzeg.zza;
        zzxr.zzl(i, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzgm zzgm) {
        zzxr zzxr = this.zzb;
        int i = zzeg.zza;
        zzxr.zzs(zzgm);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzad zzad, zzgn zzgn) {
        int i = zzeg.zza;
        this.zzb.zzu(zzad, zzgn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(Object obj, long j) {
        zzxr zzxr = this.zzb;
        int i = zzeg.zza;
        zzxr.zzm(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(long j, int i) {
        zzxr zzxr = this.zzb;
        int i2 = zzeg.zza;
        zzxr.zzt(j, i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Exception exc) {
        zzxr zzxr = this.zzb;
        int i = zzeg.zza;
        zzxr.zzo(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzcv zzcv) {
        zzxr zzxr = this.zzb;
        int i = zzeg.zza;
        zzxr.zzv(zzcv);
    }

    public final void zzq(Object obj) {
        if (this.zza != null) {
            this.zza.post(new zzxh(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    public final void zzr(long j, int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxj(this, j, i));
        }
    }

    public final void zzs(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxi(this, exc));
        }
    }

    public final void zzt(zzcv zzcv) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxo(this, zzcv));
        }
    }
}
