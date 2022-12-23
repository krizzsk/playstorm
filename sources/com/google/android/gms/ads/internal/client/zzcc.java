package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcdz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public interface zzcc extends IInterface {
    zzbo zzb(IObjectWrapper iObjectWrapper, String str, zzbtz zzbtz, int i) throws RemoteException;

    zzbs zzc(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbtz zzbtz, int i) throws RemoteException;

    zzbs zzd(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbtz zzbtz, int i) throws RemoteException;

    zzbs zze(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbtz zzbtz, int i) throws RemoteException;

    zzbs zzf(IObjectWrapper iObjectWrapper, zzq zzq, String str, int i) throws RemoteException;

    zzcm zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException;

    zzble zzh(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;

    zzblk zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    zzbpj zzj(IObjectWrapper iObjectWrapper, zzbtz zzbtz, int i, zzbpg zzbpg) throws RemoteException;

    zzbxk zzk(IObjectWrapper iObjectWrapper, zzbtz zzbtz, int i) throws RemoteException;

    zzbxu zzl(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzcan zzm(IObjectWrapper iObjectWrapper, zzbtz zzbtz, int i) throws RemoteException;

    zzcbd zzn(IObjectWrapper iObjectWrapper, String str, zzbtz zzbtz, int i) throws RemoteException;

    zzcdz zzo(IObjectWrapper iObjectWrapper, zzbtz zzbtz, int i) throws RemoteException;
}
