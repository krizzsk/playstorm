package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzaxt {
    protected final zzaxo zza;
    protected final int[] zzb;
    private final zzars[] zzc;
    private int zzd;

    public zzaxt(zzaxo zzaxo, int... iArr) {
        if (zzaxo != null) {
            this.zza = zzaxo;
            this.zzc = new zzars[1];
            for (int i = 0; i <= 0; i++) {
                this.zzc[i] = zzaxo.zzb(iArr[i]);
            }
            Arrays.sort(this.zzc, new zzaxs((zzaxr) null));
            this.zzb = new int[1];
            for (int i2 = 0; i2 <= 0; i2++) {
                this.zzb[i2] = zzaxo.zza(this.zzc[i2]);
            }
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaxt zzaxt = (zzaxt) obj;
            return this.zza == zzaxt.zza && Arrays.equals(this.zzb, zzaxt.zzb);
        }
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzb);
        this.zzd = identityHashCode;
        return identityHashCode;
    }

    public final int zza(int i) {
        return this.zzb[0];
    }

    public final int zzb() {
        int length = this.zzb.length;
        return 1;
    }

    public final zzars zzc(int i) {
        return this.zzc[i];
    }

    public final zzaxo zzd() {
        return this.zza;
    }
}
