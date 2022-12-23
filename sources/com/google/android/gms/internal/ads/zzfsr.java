package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfsr extends zzfrh {
    final /* synthetic */ zzfss zza;

    zzfsr(zzfss zzfss) {
        this.zza = zzfss;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzfos.zza(i, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzfss zzfss = this.zza;
        int i2 = i + i;
        Object obj = zzfss.zzb[i2];
        obj.getClass();
        Object obj2 = zzfss.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }

    public final boolean zzf() {
        return true;
    }
}
