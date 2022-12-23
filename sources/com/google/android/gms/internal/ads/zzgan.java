package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgan {
    private final zzfwd zza;
    private final zzfwj zzb;

    public zzgan(zzfwd zzfwd) {
        this.zza = zzfwd;
        this.zzb = null;
    }

    public zzgan(zzfwj zzfwj) {
        this.zza = null;
        this.zzb = zzfwj;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzfwd zzfwd = this.zza;
        if (zzfwd != null) {
            return zzfwd.zzb(bArr, bArr2);
        }
        return this.zzb.zza(bArr, bArr2);
    }
}
