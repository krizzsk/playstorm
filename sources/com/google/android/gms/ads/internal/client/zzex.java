package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzcba;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzcbl;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzex extends zzcbc {
    private static void zzr(zzcbk zzcbk) {
        zzcfi.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcfb.zza.post(new zzew(zzcbk));
    }

    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    public final zzdh zzc() {
        return null;
    }

    public final zzcba zzd() {
        return null;
    }

    public final String zze() throws RemoteException {
        return "";
    }

    public final void zzf(zzl zzl, zzcbk zzcbk) throws RemoteException {
        zzr(zzcbk);
    }

    public final void zzg(zzl zzl, zzcbk zzcbk) throws RemoteException {
        zzr(zzcbk);
    }

    public final void zzh(boolean z) {
    }

    public final void zzi(zzdb zzdb) throws RemoteException {
    }

    public final void zzj(zzde zzde) {
    }

    public final void zzk(zzcbg zzcbg) throws RemoteException {
    }

    public final void zzl(zzcbr zzcbr) {
    }

    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
    }

    public final boolean zzo() throws RemoteException {
        return false;
    }

    public final void zzp(zzcbl zzcbl) throws RemoteException {
    }
}
