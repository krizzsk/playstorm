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
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbua extends zzaqv implements zzbuc {
    zzbua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void zzA(zzl zzl, String str, String str2) throws RemoteException {
        throw null;
    }

    public final void zzB(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbuf zzbuf) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzl);
        zza.writeString(str);
        zzaqx.zzg(zza, zzbuf);
        zzbl(32, zza);
    }

    public final void zzC(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(21, zza);
    }

    public final void zzD() throws RemoteException {
        zzbl(8, zza());
    }

    public final void zzE() throws RemoteException {
        zzbl(9, zza());
    }

    public final void zzF(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzd(zza, z);
        zzbl(25, zza);
    }

    public final void zzG() throws RemoteException {
        zzbl(4, zza());
    }

    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(37, zza);
    }

    public final void zzI(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(30, zza);
    }

    public final void zzJ() throws RemoteException {
        zzbl(12, zza());
    }

    public final boolean zzK() throws RemoteException {
        Parcel zzbk = zzbk(22, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzL() throws RemoteException {
        Parcel zzbk = zzbk(13, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbuk zzM() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 15
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbuk
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbuk r1 = (com.google.android.gms.internal.ads.zzbuk) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbuk r2 = new com.google.android.gms.internal.ads.zzbuk
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbua.zzM():com.google.android.gms.internal.ads.zzbuk");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbul zzN() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 16
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbul
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbul r1 = (com.google.android.gms.internal.ads.zzbul) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbul r2 = new com.google.android.gms.internal.ads.zzbul
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbua.zzN():com.google.android.gms.internal.ads.zzbul");
    }

    public final Bundle zze() throws RemoteException {
        throw null;
    }

    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    public final zzdk zzh() throws RemoteException {
        Parcel zzbk = zzbk(26, zza());
        zzdk zzb = zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final zzblu zzi() throws RemoteException {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbui zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 36
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbui
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbui r1 = (com.google.android.gms.internal.ads.zzbui) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbug r2 = new com.google.android.gms.internal.ads.zzbug
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbua.zzj():com.google.android.gms.internal.ads.zzbui");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbuo zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 27
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbuo
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbuo r1 = (com.google.android.gms.internal.ads.zzbuo) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbum r2 = new com.google.android.gms.internal.ads.zzbum
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbua.zzk():com.google.android.gms.internal.ads.zzbuo");
    }

    public final zzbwf zzl() throws RemoteException {
        Parcel zzbk = zzbk(33, zza());
        zzbwf zzbwf = (zzbwf) zzaqx.zza(zzbk, zzbwf.CREATOR);
        zzbk.recycle();
        return zzbwf;
    }

    public final zzbwf zzm() throws RemoteException {
        Parcel zzbk = zzbk(34, zza());
        zzbwf zzbwf = (zzbwf) zzaqx.zza(zzbk, zzbwf.CREATOR);
        zzbk.recycle();
        return zzbwf;
    }

    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    public final void zzo() throws RemoteException {
        zzbl(5, zza());
    }

    public final void zzp(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzcav zzcav, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzl);
        zza.writeString((String) null);
        zzaqx.zzg(zza, zzcav);
        zza.writeString(str2);
        zzbl(10, zza);
    }

    public final void zzq(IObjectWrapper iObjectWrapper, zzbqj zzbqj, List list) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbqj);
        zza.writeTypedList(list);
        zzbl(31, zza);
    }

    public final void zzr(IObjectWrapper iObjectWrapper, zzcav zzcav, List list) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzcav);
        zza.writeStringList(list);
        zzbl(23, zza);
    }

    public final void zzs(zzl zzl, String str) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzl);
        zza.writeString(str);
        zzbl(11, zza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, zzbuf zzbuf) throws RemoteException {
        throw null;
    }

    public final void zzu(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbuf zzbuf) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzq);
        zzaqx.zze(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zzg(zza, zzbuf);
        zzbl(6, zza);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbuf zzbuf) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzq);
        zzaqx.zze(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zzg(zza, zzbuf);
        zzbl(35, zza);
    }

    public final void zzw(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbuf zzbuf) throws RemoteException {
        throw null;
    }

    public final void zzx(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbuf zzbuf) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zzg(zza, zzbuf);
        zzbl(7, zza);
    }

    public final void zzy(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbuf zzbuf, zzbko zzbko, List list) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zzg(zza, zzbuf);
        zzaqx.zze(zza, zzbko);
        zza.writeStringList(list);
        zzbl(14, zza);
    }

    public final void zzz(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbuf zzbuf) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzl);
        zza.writeString(str);
        zzaqx.zzg(zza, zzbuf);
        zzbl(28, zza);
    }
}
