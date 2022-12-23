package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public interface zzblu extends IInterface {
    zzdk zze() throws RemoteException;

    zzbla zzf(String str) throws RemoteException;

    IObjectWrapper zzg() throws RemoteException;

    String zzh() throws RemoteException;

    String zzi(String str) throws RemoteException;

    List zzj() throws RemoteException;

    void zzk() throws RemoteException;

    void zzl() throws RemoteException;

    void zzm(String str) throws RemoteException;

    void zzn() throws RemoteException;

    void zzo(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzp() throws RemoteException;

    boolean zzq(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzr() throws RemoteException;
}
