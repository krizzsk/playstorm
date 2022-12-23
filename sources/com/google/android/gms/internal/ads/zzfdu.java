package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfdu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfdu> CREATOR = new zzfdv();
    @Nullable
    public final Context zza;
    public final zzfdr zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfdr[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfdu(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        this.zzh = zzfdr.values();
        this.zzl = zzfds.zza();
        int[] zza2 = zzfdt.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = this.zzh[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = this.zzl[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    @Nullable
    public static zzfdu zza(zzfdr zzfdr, Context context) {
        if (zzfdr == zzfdr.Rewarded) {
            return new zzfdu(context, zzfdr, ((Integer) zzay.zzc().zzb(zzbhy.zzfp)).intValue(), ((Integer) zzay.zzc().zzb(zzbhy.zzfv)).intValue(), ((Integer) zzay.zzc().zzb(zzbhy.zzfx)).intValue(), (String) zzay.zzc().zzb(zzbhy.zzfz), (String) zzay.zzc().zzb(zzbhy.zzfr), (String) zzay.zzc().zzb(zzbhy.zzft));
        } else if (zzfdr == zzfdr.zzb) {
            return new zzfdu(context, zzfdr, ((Integer) zzay.zzc().zzb(zzbhy.zzfq)).intValue(), ((Integer) zzay.zzc().zzb(zzbhy.zzfw)).intValue(), ((Integer) zzay.zzc().zzb(zzbhy.zzfy)).intValue(), (String) zzay.zzc().zzb(zzbhy.zzfA), (String) zzay.zzc().zzb(zzbhy.zzfs), (String) zzay.zzc().zzb(zzbhy.zzfu));
        } else if (zzfdr != zzfdr.AppOpen) {
            return null;
        } else {
            return new zzfdu(context, zzfdr, ((Integer) zzay.zzc().zzb(zzbhy.zzfD)).intValue(), ((Integer) zzay.zzc().zzb(zzbhy.zzfF)).intValue(), ((Integer) zzay.zzc().zzb(zzbhy.zzfG)).intValue(), (String) zzay.zzc().zzb(zzbhy.zzfB), (String) zzay.zzc().zzb(zzbhy.zzfC), (String) zzay.zzc().zzb(zzbhy.zzfE));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfdu(@Nullable Context context, zzfdr zzfdr, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfdr.values();
        this.zzl = zzfds.zza();
        this.zzm = zzfdt.zza();
        this.zza = context;
        this.zzi = zzfdr.ordinal();
        this.zzb = zzfdr;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
