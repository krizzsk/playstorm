package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfeb {
    private final HashMap zza = new HashMap();

    public final zzfea zza(zzfdr zzfdr, Context context, zzfdj zzfdj, zzfeh zzfeh) {
        zzfea zzfea = (zzfea) this.zza.get(zzfdr);
        if (zzfea != null) {
            return zzfea;
        }
        zzfdo zzfdo = new zzfdo(zzfdu.zza(zzfdr, context));
        zzfea zzfea2 = new zzfea(zzfdo, new zzfej(zzfdo, zzfdj, zzfeh));
        this.zza.put(zzfdr, zzfea2);
        return zzfea2;
    }
}
