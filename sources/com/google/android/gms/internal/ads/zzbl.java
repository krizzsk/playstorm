package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbl implements Parcelable {
    public static final Parcelable.Creator<zzbl> CREATOR = new zzbj();
    private final zzbk[] zza;

    zzbl(Parcel parcel) {
        this.zza = new zzbk[parcel.readInt()];
        int i = 0;
        while (true) {
            zzbk[] zzbkArr = this.zza;
            if (i < zzbkArr.length) {
                zzbkArr[i] = (zzbk) parcel.readParcelable(zzbk.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public zzbl(zzbk... zzbkArr) {
        this.zza = zzbkArr;
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
        return Arrays.equals(this.zza, ((zzbl) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return "entries=".concat(String.valueOf(Arrays.toString(this.zza)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.length);
        for (zzbk writeParcelable : this.zza) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzbk zzb(int i) {
        return this.zza[i];
    }

    public final zzbl zzc(zzbk... zzbkArr) {
        if (zzbkArr.length == 0) {
            return this;
        }
        return new zzbl((zzbk[]) zzeg.zzac(this.zza, zzbkArr));
    }

    public final zzbl zzd(zzbl zzbl) {
        return zzbl == null ? this : zzc(zzbl.zza);
    }

    public zzbl(List list) {
        this.zza = (zzbk[]) list.toArray(new zzbk[0]);
    }
}
