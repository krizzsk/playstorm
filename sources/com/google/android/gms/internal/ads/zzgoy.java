package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgoy extends zzgkk implements zzglz {
    private zzgoy() {
        super(zzgoz.zzb);
    }

    public final zzgoy zza(String str) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgoz.zzd((zzgoz) this.zza, str);
        return this;
    }

    public final zzgoy zzb(long j) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgoz.zze((zzgoz) this.zza, j);
        return this;
    }

    public final zzgoy zzc(boolean z) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgoz.zzf((zzgoz) this.zza, z);
        return this;
    }

    /* synthetic */ zzgoy(zzgoa zzgoa) {
        super(zzgoz.zzb);
    }
}
