package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbvq extends zzaqv implements zzbvs {
    zzbvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final zzdk zze() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        zzdk zzb = zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final zzbwf zzf() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        zzbwf zzbwf = (zzbwf) zzaqx.zza(zzbk, zzbwf.CREATOR);
        zzbk.recycle();
        return zzbwf;
    }

    public final zzbwf zzg() throws RemoteException {
        Parcel zzbk = zzbk(3, zza());
        zzbwf zzbwf = (zzbwf) zzaqx.zza(zzbk, zzbwf.CREATOR);
        zzbk.recycle();
        return zzbwf;
    }

    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzq zzq, zzbvv zzbvv) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzaqx.zze(zza, bundle);
        zzaqx.zze(zza, bundle2);
        zzaqx.zze(zza, zzq);
        zzaqx.zzg(zza, zzbvv);
        zzbl(1, zza);
    }

    public final void zzi(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvg zzbvg, zzbuf zzbuf, zzq zzq) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzl);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvg);
        zzaqx.zzg(zza, zzbuf);
        zzaqx.zze(zza, zzq);
        zzbl(13, zza);
    }

    public final void zzj(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvg zzbvg, zzbuf zzbuf, zzq zzq) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzl);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvg);
        zzaqx.zzg(zza, zzbuf);
        zzaqx.zze(zza, zzq);
        zzbl(21, zza);
    }

    public final void zzk(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvj zzbvj, zzbuf zzbuf) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzl);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvj);
        zzaqx.zzg(zza, zzbuf);
        zzbl(14, zza);
    }

    public final void zzl(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvm zzbvm, zzbuf zzbuf) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzl);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvm);
        zzaqx.zzg(zza, zzbuf);
        zzbl(18, zza);
    }

    public final void zzm(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvm zzbvm, zzbuf zzbuf, zzbko zzbko) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzl);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvm);
        zzaqx.zzg(zza, zzbuf);
        zzaqx.zze(zza, zzbko);
        zzbl(22, zza);
    }

    public final void zzn(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvp zzbvp, zzbuf zzbuf) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzl);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvp);
        zzaqx.zzg(zza, zzbuf);
        zzbl(20, zza);
    }

    public final void zzo(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbvp zzbvp, zzbuf zzbuf) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzl);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvp);
        zzaqx.zzg(zza, zzbuf);
        zzbl(16, zza);
    }

    public final void zzp(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(19, zza);
    }

    public final boolean zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(15, zza);
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(17, zza);
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
