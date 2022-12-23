package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbec extends zzgkk implements zzglz {
    private zzbec() {
        super(zzbed.zzb);
    }

    public final zzbec zza(boolean z) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbed.zze((zzbed) this.zza, z);
        return this;
    }

    public final zzbec zzb(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbed.zzf((zzbed) this.zza, i);
        return this;
    }

    /* synthetic */ zzbec(zzbds zzbds) {
        super(zzbed.zzb);
    }
}
