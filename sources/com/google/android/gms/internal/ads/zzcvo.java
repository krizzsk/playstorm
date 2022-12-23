package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcvo extends zzbce {
    private final zzcvn zza;
    private final zzbs zzb;
    private final zzexc zzc;
    private boolean zzd = false;

    public zzcvo(zzcvn zzcvn, zzbs zzbs, zzexc zzexc) {
        this.zza = zzcvn;
        this.zzb = zzbs;
        this.zzc = zzexc;
    }

    public final zzbs zze() {
        return this.zzb;
    }

    public final zzdh zzf() {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzfJ)).booleanValue()) {
            return null;
        }
        return this.zza.zzl();
    }

    public final void zzg(boolean z) {
        this.zzd = z;
    }

    public final void zzh(zzde zzde) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        zzexc zzexc = this.zzc;
        if (zzexc != null) {
            zzexc.zzp(zzde);
        }
    }

    public final void zzi(IObjectWrapper iObjectWrapper, zzbcm zzbcm) {
        try {
            this.zzc.zzs(zzbcm);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbcm, this.zzd);
        } catch (RemoteException e) {
            zze.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzj(zzbcj zzbcj) {
    }
}
