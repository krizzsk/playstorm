package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
final class zzbnc extends zzbmd {
    final /* synthetic */ zzbnf zza;

    /* synthetic */ zzbnc(zzbnf zzbnf, zzbnb zzbnb) {
        this.zza = zzbnf;
    }

    public final void zze(zzblu zzblu, String str) {
        zzbnf zzbnf = this.zza;
        if (zzbnf.zzb != null) {
            zzbnf.zzb.onCustomClick(zzbnf.zzf(zzblu), str);
        }
    }
}
