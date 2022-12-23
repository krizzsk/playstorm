package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdro implements zzbol {
    private final zzbme zza;
    private final zzdsd zzb;
    private final zzgpo zzc;

    public zzdro(zzdnr zzdnr, zzdng zzdng, zzdsd zzdsd, zzgpo zzgpo) {
        this.zza = zzdnr.zzc(zzdng.zzy());
        this.zzb = zzdsd;
        this.zzc = zzgpo;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzblu) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            zze.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void zzb() {
        if (this.zza != null) {
            this.zzb.zzi("/nativeAdCustomClick", this);
        }
    }
}
