package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzei> CREATOR = new zzej();
    private final int zza;
    private final int zzb;
    private final String zzc;

    public zzei() {
        this(ModuleDescriptor.MODULE_VERSION, 221310000, "21.0.0");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public zzei(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }
}
