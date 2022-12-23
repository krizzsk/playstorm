package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
final class zzbxb extends zzbmd {
    final /* synthetic */ zzbxe zza;

    /* synthetic */ zzbxb(zzbxe zzbxe, zzbxa zzbxa) {
        this.zza = zzbxe;
    }

    public final void zze(zzblu zzblu, String str) {
        zzbxe zzbxe = this.zza;
        if (zzbxe.zzb != null) {
            zzbxe.zzb.onCustomClick(zzbxe.zzf(zzblu), str);
        }
    }
}
