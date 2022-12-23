package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbes extends zzgkk implements zzglz {
    private zzbes() {
        super(zzbet.zzb);
    }

    public final zzbes zza(String str) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbet.zzd((zzbet) this.zza, str);
        return this;
    }

    public final zzbes zzb(zzbgl zzbgl) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbet.zze((zzbet) this.zza, zzbgl);
        return this;
    }

    /* synthetic */ zzbes(zzbds zzbds) {
        super(zzbet.zzb);
    }
}
