package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public abstract class zzbue extends zzaqw implements zzbuf {
    public zzbue() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbuf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbuf ? (zzbuf) queryLocalInterface : new zzbud(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzaqx.zzc(parcel);
                zzg(readInt);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzbuj) {
                        zzbuj zzbuj = (zzbuj) queryLocalInterface;
                    }
                }
                zzaqx.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzaqx.zzc(parcel);
                zzq(readString, readString2);
                break;
            case 10:
                zzblt.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzaqx.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                zzaqx.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                zzaqx.zzc(parcel);
                zzs((zzcaw) zzaqx.zza(parcel, zzcaw.CREATOR));
                break;
            case 15:
                zzw();
                break;
            case 16:
                zzcba zzb = zzcaz.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzt(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzj(readInt2);
                break;
            case 18:
                zzu();
                break;
            case 19:
                Bundle bundle = (Bundle) zzaqx.zza(parcel, Bundle.CREATOR);
                zzaqx.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzaqx.zzc(parcel);
                zzl(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzaqx.zzc(parcel);
                zzi(readInt3, readString4);
                break;
            case 23:
                zzaqx.zzc(parcel);
                zzh((zze) zzaqx.zza(parcel, zze.CREATOR));
                break;
            case 24:
                zzaqx.zzc(parcel);
                zzk((zze) zzaqx.zza(parcel, zze.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
