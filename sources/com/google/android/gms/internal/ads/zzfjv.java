package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfjv {
    private final zzfjd zza;
    private final ArrayList zzb;

    public zzfjv(zzfjd zzfjd, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfjd;
        arrayList.add(str);
    }

    public final zzfjd zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }
}
