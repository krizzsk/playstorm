package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzawl extends zzawj {
    public static final Parcelable.Creator<zzawl> CREATOR = new zzawk();
    public final String zza;
    public final String zzb;

    zzawl(Parcel parcel) {
        super(parcel.readString());
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzawl zzawl = (zzawl) obj;
            return this.zze.equals(zzawl.zze) && zzazn.zzo(this.zza, zzawl.zza) && zzazn.zzo(this.zzb, zzawl.zzb);
        }
    }

    public final int hashCode() {
        int hashCode = (this.zze.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.zza;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zze);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzawl(String str, String str2, String str3) {
        super(str);
        this.zza = null;
        this.zzb = str3;
    }
}
