package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzceh implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcga zzb;

    zzceh(zzcei zzcei, Context context, zzcga zzcga) {
        this.zza = context;
        this.zzb = zzcga;
    }

    public final void run() {
        try {
            this.zzb.zzd(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzb.zze(e);
            zzcfi.zzh("Exception while getting advertising Id info", e);
        }
    }
}
