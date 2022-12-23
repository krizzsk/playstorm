package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbag {
    private final Handler zza;
    /* access modifiers changed from: private */
    public final zzbah zzb;

    public zzbag(Handler handler, zzbah zzbah) {
        if (handler != null) {
            this.zza = handler;
            this.zzb = zzbah;
            return;
        }
        throw null;
    }

    public final void zzb(String str, long j, long j2) {
        this.zza.post(new zzbaa(this, str, j, j2));
    }

    public final void zzc(zzatm zzatm) {
        this.zza.post(new zzbaf(this, zzatm));
    }

    public final void zzd(int i, long j) {
        this.zza.post(new zzbac(this, i, j));
    }

    public final void zze(zzatm zzatm) {
        this.zza.post(new zzazz(this, zzatm));
    }

    public final void zzf(zzars zzars) {
        this.zza.post(new zzbab(this, zzars));
    }

    public final void zzg(Surface surface) {
        this.zza.post(new zzbae(this, surface));
    }

    public final void zzh(int i, int i2, int i3, float f) {
        this.zza.post(new zzbad(this, i, i2, i3, f));
    }
}
