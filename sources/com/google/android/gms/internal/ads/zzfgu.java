package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfgu implements zzfgo {
    private final zzfgy zza;
    private final zzfgw zzb;
    private final zzfgl zzc;

    public zzfgu(zzfgl zzfgl, zzfgy zzfgy, zzfgw zzfgw, byte[] bArr) {
        this.zzc = zzfgl;
        this.zza = zzfgy;
        this.zzb = zzfgw;
    }

    public final String zza(zzfgn zzfgn) {
        zzfgy zzfgy = this.zza;
        Map zzj = zzfgn.zzj();
        this.zzb.zza(zzj);
        return zzfgy.zza(zzj);
    }

    public final void zzb(zzfgn zzfgn) {
        this.zzc.zzb(zza(zzfgn));
    }
}
