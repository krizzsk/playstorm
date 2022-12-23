package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgch extends zzgkk implements zzglz {
    private zzgch() {
        super(zzgci.zzb);
    }

    public final zzgch zza(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgci) this.zza).zzf = i;
        return this;
    }

    public final zzgch zzb(zzgcl zzgcl) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgci.zzg((zzgci) this.zza, zzgcl);
        return this;
    }

    /* synthetic */ zzgch(zzgcg zzgcg) {
        super(zzgci.zzb);
    }
}
