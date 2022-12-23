package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzet extends zzcl {
    private zzbqm zza;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        zzbqm zzbqm = this.zza;
        if (zzbqm != null) {
            try {
                zzbqm.zzb(Collections.emptyList());
            } catch (RemoteException e) {
                zzcfi.zzk("Could not notify onComplete event.", e);
            }
        }
    }

    public final float zze() throws RemoteException {
        return 1.0f;
    }

    public final String zzf() {
        return "";
    }

    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    public final void zzh(String str) throws RemoteException {
    }

    public final void zzi() {
    }

    public final void zzj() throws RemoteException {
        zzcfi.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzcfb.zza.post(new zzes(this));
    }

    public final void zzk(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzl(zzcy zzcy) {
    }

    public final void zzm(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    public final void zzn(zzbtz zzbtz) throws RemoteException {
    }

    public final void zzo(boolean z) throws RemoteException {
    }

    public final void zzp(float f) throws RemoteException {
    }

    public final void zzq(String str) throws RemoteException {
    }

    public final void zzr(zzbqm zzbqm) throws RemoteException {
        this.zza = zzbqm;
    }

    public final void zzs(zzfa zzfa) throws RemoteException {
    }

    public final boolean zzt() throws RemoteException {
        return false;
    }
}
