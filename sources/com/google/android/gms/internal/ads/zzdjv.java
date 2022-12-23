package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdjv extends zzdhb {
    private boolean zzb;

    protected zzdjv(Set set) {
        super(set);
    }

    public final void zza() {
        zzo(zzdjr.zza);
    }

    public final void zzb() {
        zzo(zzdjt.zza);
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzo(zzdjs.zza);
            this.zzb = true;
        }
        zzo(zzdju.zza);
    }

    public final synchronized void zzd() {
        zzo(zzdjs.zza);
        this.zzb = true;
    }
}
