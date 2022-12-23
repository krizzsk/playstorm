package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgkv extends AbstractList {
    private final List zza;
    private final zzgku zzb;

    public zzgkv(List list, zzgku zzgku) {
        this.zza = list;
        this.zzb = zzgku;
    }

    public final Object get(int i) {
        zzbej zzb2 = zzbej.zzb(((Integer) this.zza.get(i)).intValue());
        return zzb2 == null ? zzbej.AD_FORMAT_TYPE_UNSPECIFIED : zzb2;
    }

    public final int size() {
        return this.zza.size();
    }
}
