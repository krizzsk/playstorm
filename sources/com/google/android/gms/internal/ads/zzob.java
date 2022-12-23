package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzob {
    final zzoa zza = zzoa.zza;
    /* access modifiers changed from: private */
    public zzmw zzb = zzmw.zza;
    /* access modifiers changed from: private */
    public zzod zzc;

    public final zzob zzb(zzmw zzmw) {
        this.zzb = zzmw;
        return this;
    }

    public final zzob zzc(zzmz[] zzmzArr) {
        this.zzc = new zzod(zzmzArr);
        return this;
    }

    public final zzon zzd() {
        if (this.zzc == null) {
            this.zzc = new zzod(new zzmz[0]);
        }
        return new zzon(this, (zzom) null);
    }
}
