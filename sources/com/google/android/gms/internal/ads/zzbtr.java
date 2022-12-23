package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final /* synthetic */ class zzbtr implements Runnable {
    public final /* synthetic */ zzbts zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzbtr(zzbts zzbts, Context context, String str) {
        this.zza = zzbts;
        this.zzb = context;
        this.zzc = str;
    }

    public final void run() {
        Context context = this.zzb;
        String str = this.zzc;
        zzbhy.zzc(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) zzay.zzc().zzb(zzbhy.zzaf)).booleanValue());
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzam)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        try {
            ((zzcnc) zzcfm.zzb(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzbtq.zza)).zze(ObjectWrapper.wrap(context), new zzbtp(AppMeasurementSdk.getInstance(context, "FA-Ads", "am", str, bundle)));
        } catch (RemoteException | zzcfl | NullPointerException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }
}
