package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzgpp {
    final LinkedHashMap zza;

    zzgpp(int i) {
        this.zza = zzgpr.zzb(i);
    }

    /* access modifiers changed from: package-private */
    public final zzgpp zza(Object obj, zzgqh zzgqh) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgqc.zza(obj, SDKConstants.PARAM_KEY);
        zzgqc.zza(zzgqh, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMap.put(obj, zzgqh);
        return this;
    }
}
