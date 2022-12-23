package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzbri implements Predicate {
    public final /* synthetic */ zzbol zza;

    public /* synthetic */ zzbri(zzbol zzbol) {
        this.zza = zzbol;
    }

    public final boolean apply(Object obj) {
        zzbol zzbol = (zzbol) obj;
        return (zzbol instanceof zzbrn) && zzbrn.zzb((zzbrn) zzbol).equals(this.zza);
    }
}
