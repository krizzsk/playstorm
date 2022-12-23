package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbsf extends zzcgh {
    private final Object zza = new Object();
    /* access modifiers changed from: private */
    public final zzbsk zzb;
    private boolean zzc;

    public zzbsf(zzbsk zzbsk) {
        this.zzb = zzbsk;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (!this.zzc) {
                this.zzc = true;
                zzi(new zzbsc(this), new zzcgd());
                zzi(new zzbsd(this), new zzbse(this));
            }
        }
    }
}
