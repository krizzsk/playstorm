package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzawd implements Parcelable {
    public static final Parcelable.Creator<zzawd> CREATOR = new zzawb();
    private final zzawc[] zza;

    zzawd(Parcel parcel) {
        this.zza = new zzawc[parcel.readInt()];
        int i = 0;
        while (true) {
            zzawc[] zzawcArr = this.zza;
            if (i < zzawcArr.length) {
                zzawcArr[i] = (zzawc) parcel.readParcelable(zzawc.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzawd) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.length);
        for (zzawc writeParcelable : this.zza) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzawc zzb(int i) {
        return this.zza[i];
    }

    public zzawd(List list) {
        zzawc[] zzawcArr = new zzawc[list.size()];
        this.zza = zzawcArr;
        list.toArray(zzawcArr);
    }
}
