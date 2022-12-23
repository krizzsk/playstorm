package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzayb {
    private int zza;
    private final zzaxt[] zzb;

    public zzayb(zzaxt[] zzaxtArr, byte... bArr) {
        this.zzb = zzaxtArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzayb) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zzb) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        this.zza = hashCode;
        return hashCode;
    }

    public final zzaxt zza(int i) {
        return this.zzb[i];
    }

    public final zzaxt[] zzb() {
        return (zzaxt[]) this.zzb.clone();
    }
}
