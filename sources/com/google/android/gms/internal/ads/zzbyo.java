package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
final class zzbyo extends zzbyi {
    final /* synthetic */ List zza;

    zzbyo(zzbyr zzbyr, List list) {
        this.zza = list;
    }

    public final void zze(String str) {
        zzcfi.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    public final void zzf(List list) {
        zzcfi.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
