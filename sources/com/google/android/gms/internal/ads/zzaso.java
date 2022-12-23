package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaso {
    private final Handler zza;
    /* access modifiers changed from: private */
    public final zzasp zzb;

    public zzaso(Handler handler, zzasp zzasp) {
        if (handler != null) {
            this.zza = handler;
            this.zzb = zzasp;
            return;
        }
        throw null;
    }

    public final void zzb(int i) {
        this.zza.post(new zzasn(this, i));
    }

    public final void zzc(int i, long j, long j2) {
        this.zza.post(new zzasl(this, i, j, j2));
    }

    public final void zzd(String str, long j, long j2) {
        this.zza.post(new zzasj(this, str, j, j2));
    }

    public final void zze(zzatm zzatm) {
        this.zza.post(new zzasm(this, zzatm));
    }

    public final void zzf(zzatm zzatm) {
        this.zza.post(new zzasi(this, zzatm));
    }

    public final void zzg(zzars zzars) {
        this.zza.post(new zzask(this, zzars));
    }
}
