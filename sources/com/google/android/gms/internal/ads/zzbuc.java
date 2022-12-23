package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public interface zzbuc extends IInterface {
    void zzA(zzl zzl, String str, String str2) throws RemoteException;

    void zzB(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbuf zzbuf) throws RemoteException;

    void zzC(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzD() throws RemoteException;

    void zzE() throws RemoteException;

    void zzF(boolean z) throws RemoteException;

    void zzG() throws RemoteException;

    void zzH(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzI(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzJ() throws RemoteException;

    boolean zzK() throws RemoteException;

    boolean zzL() throws RemoteException;

    zzbuk zzM() throws RemoteException;

    zzbul zzN() throws RemoteException;

    Bundle zze() throws RemoteException;

    Bundle zzf() throws RemoteException;

    Bundle zzg() throws RemoteException;

    zzdk zzh() throws RemoteException;

    zzblu zzi() throws RemoteException;

    zzbui zzj() throws RemoteException;

    zzbuo zzk() throws RemoteException;

    zzbwf zzl() throws RemoteException;

    zzbwf zzm() throws RemoteException;

    IObjectWrapper zzn() throws RemoteException;

    void zzo() throws RemoteException;

    void zzp(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzcav zzcav, String str2) throws RemoteException;

    void zzq(IObjectWrapper iObjectWrapper, zzbqj zzbqj, List list) throws RemoteException;

    void zzr(IObjectWrapper iObjectWrapper, zzcav zzcav, List list) throws RemoteException;

    void zzs(zzl zzl, String str) throws RemoteException;

    void zzt(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, zzbuf zzbuf) throws RemoteException;

    void zzu(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbuf zzbuf) throws RemoteException;

    void zzv(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbuf zzbuf) throws RemoteException;

    void zzw(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbuf zzbuf) throws RemoteException;

    void zzx(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbuf zzbuf) throws RemoteException;

    void zzy(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbuf zzbuf, zzbko zzbko, List list) throws RemoteException;

    void zzz(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbuf zzbuf) throws RemoteException;
}
