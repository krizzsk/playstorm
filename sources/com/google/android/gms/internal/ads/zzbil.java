package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbil {
    private final Map zza = new HashMap();
    private final zzbin zzb;

    public zzbil(zzbin zzbin) {
        this.zzb = zzbin;
    }

    public final zzbin zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbik zzbik) {
        this.zza.put(str, zzbik);
    }

    public final void zzc(String str, String str2, long j) {
        zzbin zzbin = this.zzb;
        zzbik zzbik = (zzbik) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbik != null) {
            zzbin.zze(zzbik, j, strArr);
        }
        this.zza.put(str, new zzbik(j, (String) null, (zzbik) null));
    }
}
