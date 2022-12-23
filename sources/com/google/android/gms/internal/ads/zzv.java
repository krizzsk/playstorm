package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzv implements Comparator<zzu>, Parcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzs();
    public final String zza;
    public final int zzb;
    private final zzu[] zzc;
    private int zzd;

    zzv(Parcel parcel) {
        this.zza = parcel.readString();
        zzu[] zzuArr = (zzu[]) zzeg.zzG((zzu[]) parcel.createTypedArray(zzu.CREATOR));
        this.zzc = zzuArr;
        this.zzb = zzuArr.length;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzu zzu = (zzu) obj;
        zzu zzu2 = (zzu) obj2;
        if (zzm.zza.equals(zzu.zza)) {
            return !zzm.zza.equals(zzu2.zza) ? 1 : 0;
        }
        return zzu.zza.compareTo(zzu2.zza);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzv zzv = (zzv) obj;
            return zzeg.zzS(this.zza, zzv.zza) && Arrays.equals(this.zzc, zzv.zzc);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzu zza(int i) {
        return this.zzc[i];
    }

    public final zzv zzb(String str) {
        if (zzeg.zzS(this.zza, str)) {
            return this;
        }
        return new zzv(str, false, this.zzc);
    }

    public final int hashCode() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            return i2;
        }
        String str = this.zza;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (i * 31) + Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.gms.internal.ads.zzu[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzv(java.lang.String r1, boolean r2, com.google.android.gms.internal.ads.zzu... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.zza = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.gms.internal.ads.zzu[] r3 = (com.google.android.gms.internal.ads.zzu[]) r3
        L_0x000e:
            r0.zzc = r3
            int r1 = r3.length
            r0.zzb = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzv.<init>(java.lang.String, boolean, com.google.android.gms.internal.ads.zzu[]):void");
    }

    public zzv(String str, zzu... zzuArr) {
        this((String) null, true, zzuArr);
    }

    public zzv(List list) {
        this((String) null, false, (zzu[]) list.toArray(new zzu[0]));
    }
}
