package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgfa extends zzgkk implements zzglz {
    private zzgfa() {
        super(zzgfb.zzb);
    }

    public final zzgfa zza(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfb) this.zza).zzg = zzgjg;
        return this;
    }

    public final zzgfa zzb(zzgfe zzgfe) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgfb.zzi((zzgfb) this.zza, zzgfe);
        return this;
    }

    public final zzgfa zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfb) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgfa(zzgez zzgez) {
        super(zzgfb.zzb);
    }
}
