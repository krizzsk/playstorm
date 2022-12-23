package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdoj implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdsd zzd;
    private final Clock zze;
    private zzbmu zzf;
    private zzbol zzg;

    public zzdoj(zzdsd zzdsd, Clock clock) {
        this.zzd = zzdsd;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.zzc = null;
        }
    }

    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.zza == null || this.zzb == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.zza);
                hashMap.put(SDKConstants.PARAM_A2U_TIME_INTERVAL, String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.zzd.zzg("sendMessageToNativeJs", hashMap);
            }
            zzd();
        }
    }

    public final zzbmu zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf != null && this.zzb != null) {
            zzd();
            try {
                this.zzf.zze();
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzc(zzbmu zzbmu) {
        this.zzf = zzbmu;
        zzbol zzbol = this.zzg;
        if (zzbol != null) {
            this.zzd.zzk("/unconfirmedClick", zzbol);
        }
        zzdoi zzdoi = new zzdoi(this, zzbmu);
        this.zzg = zzdoi;
        this.zzd.zzi("/unconfirmedClick", zzdoi);
    }
}
