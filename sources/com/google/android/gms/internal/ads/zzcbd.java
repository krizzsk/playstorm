package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public interface zzcbd extends IInterface {
    Bundle zzb() throws RemoteException;

    zzdh zzc() throws RemoteException;

    zzcba zzd() throws RemoteException;

    String zze() throws RemoteException;

    void zzf(zzl zzl, zzcbk zzcbk) throws RemoteException;

    void zzg(zzl zzl, zzcbk zzcbk) throws RemoteException;

    void zzh(boolean z) throws RemoteException;

    void zzi(zzdb zzdb) throws RemoteException;

    void zzj(zzde zzde) throws RemoteException;

    void zzk(zzcbg zzcbg) throws RemoteException;

    void zzl(zzcbr zzcbr) throws RemoteException;

    void zzm(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    boolean zzo() throws RemoteException;

    void zzp(zzcbl zzcbl) throws RemoteException;
}
