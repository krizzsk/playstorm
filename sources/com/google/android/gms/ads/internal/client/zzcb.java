package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzbpf;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcdz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public abstract class zzcb extends zzaqw implements zzcc {
    public zzcb() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                zzbtz zzf = zzbty.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzaqx.zzc(parcel);
                zzbs zzd = zzd(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzaqx.zza(parcel, zzq.CREATOR), readString, zzf, readInt);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzd);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzbtz zzf2 = zzbty.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzbs zze = zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzaqx.zza(parcel, zzq.CREATOR), readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbtz zzf3 = zzbty.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzbo zzb = zzb(asInterface, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, (IInterface) null);
                return true;
            case 5:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzble zzh = zzh(asInterface2, asInterface3);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzh);
                return true;
            case 6:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtz zzf4 = zzbty.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzcan zzm = zzm(asInterface4, zzf4, readInt4);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzm);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, (IInterface) null);
                return true;
            case 8:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzbxu zzl = zzl(asInterface5);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzl);
                return true;
            case 9:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzcm zzg = zzg(asInterface6, readInt5);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzg);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzbs zzf5 = zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzaqx.zza(parcel, zzq.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzblk zzi = zzi(asInterface7, asInterface8, asInterface9);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzi);
                return true;
            case 12:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbtz zzf6 = zzbty.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzcbd zzn = zzn(asInterface10, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzn);
                return true;
            case 13:
                String readString6 = parcel.readString();
                zzbtz zzf7 = zzbty.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzbs zzc = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzaqx.zza(parcel, zzq.CREATOR), readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtz zzf8 = zzbty.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzcdz zzo = zzo(asInterface11, zzf8, readInt9);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzo);
                return true;
            case 15:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtz zzf9 = zzbty.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzbxk zzk = zzk(asInterface12, zzf9, readInt10);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzk);
                return true;
            case 16:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtz zzf10 = zzbty.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbpg zzc2 = zzbpf.zzc(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzbpj zzj = zzj(asInterface13, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzj);
                return true;
            default:
                return false;
        }
    }
}
