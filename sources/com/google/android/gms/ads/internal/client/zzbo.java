package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbra;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public interface zzbo extends IInterface {
    zzbl zze() throws RemoteException;

    void zzf(zzbly zzbly) throws RemoteException;

    void zzg(zzbmb zzbmb) throws RemoteException;

    void zzh(String str, zzbmh zzbmh, zzbme zzbme) throws RemoteException;

    void zzi(zzbra zzbra) throws RemoteException;

    void zzj(zzbml zzbml, zzq zzq) throws RemoteException;

    void zzk(zzbmo zzbmo) throws RemoteException;

    void zzl(zzbf zzbf) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbqr zzbqr) throws RemoteException;

    void zzo(zzbko zzbko) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcd zzcd) throws RemoteException;
}
