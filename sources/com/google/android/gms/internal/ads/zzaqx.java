package com.google.android.gms.internal.ads;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-base@@21.0.0 */
public final class zzaqx {
    private static final ClassLoader zza = zzaqx.class.getClassLoader();

    private zzaqx() {
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static ArrayList zzb(Parcel parcel) {
        return parcel.readArrayList(zza);
    }

    public static void zzc(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Parcel data not fully consumed, unread size: ");
            sb.append(dataAvail);
            throw new BadParcelableException(sb.toString());
        }
    }

    public static void zzd(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void zze(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void zzf(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    public static void zzg(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static boolean zzh(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
