package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzuh implements zzvh {
    protected final zzck zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzad[] zzd;
    private int zze;

    public zzuh(zzck zzck, int[] iArr, int i) {
        int length = iArr.length;
        zzcw.zzf(length > 0);
        if (zzck != null) {
            this.zza = zzck;
            this.zzb = length;
            this.zzd = new zzad[length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.zzd[i2] = zzck.zzb(iArr[i2]);
            }
            Arrays.sort(this.zzd, zzug.zza);
            this.zzc = new int[this.zzb];
            for (int i3 = 0; i3 < this.zzb; i3++) {
                this.zzc[i3] = zzck.zza(this.zzd[i3]);
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
            zzuh zzuh = (zzuh) obj;
            return this.zza == zzuh.zza && Arrays.equals(this.zzc, zzuh.zzc);
        }
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = identityHashCode;
        return identityHashCode;
    }

    public final int zza(int i) {
        return this.zzc[0];
    }

    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int zzc() {
        return this.zzc.length;
    }

    public final zzad zzd(int i) {
        return this.zzd[i];
    }

    public final zzck zze() {
        return this.zza;
    }
}
