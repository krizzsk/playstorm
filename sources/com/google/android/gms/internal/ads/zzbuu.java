package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
final class zzbuu implements MediationAdLoadCallback {
    final /* synthetic */ zzbuf zza;
    final /* synthetic */ zzbuy zzb;

    zzbuu(zzbuy zzbuy, zzbuf zzbuf) {
        this.zzb = zzbuy;
        this.zza = zzbuf;
    }

    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.zza.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            zzcfi.zze(canonicalName + "failed to loaded mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            this.zza.zzh(adError.zza());
            this.zza.zzi(adError.getCode(), adError.getMessage());
            this.zza.zzg(adError.getCode());
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zze = ((MediationBannerAd) obj).getView();
            this.zza.zzo();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
        return new zzbuq(this.zza);
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
