package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzyr implements zzzz {
    private final byte[] zza = new byte[4096];

    public final /* synthetic */ int zze(zzp zzp, int i, boolean z) {
        return zzzx.zza(this, zzp, i, true);
    }

    public final int zzf(zzp zzp, int i, boolean z, int i2) throws IOException {
        int zza2 = zzp.zza(this.zza, 0, Math.min(4096, i));
        if (zza2 != -1) {
            return zza2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzk(zzad zzad) {
    }

    public final /* synthetic */ void zzq(zzdy zzdy, int i) {
        zzzx.zzb(this, zzdy, i);
    }

    public final void zzr(zzdy zzdy, int i, int i2) {
        zzdy.zzG(i);
    }

    public final void zzs(long j, int i, int i2, int i3, zzzy zzzy) {
    }
}
