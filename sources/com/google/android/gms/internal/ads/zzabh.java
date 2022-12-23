package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzabh implements zzbk {
    public static final Parcelable.Creator<zzabh> CREATOR = new zzabg();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzabh(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    zzabh(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public static zzabh zzb(zzdy zzdy) {
        int zze2 = zzdy.zze();
        String zzx = zzdy.zzx(zzdy.zze(), zzfog.zza);
        String zzx2 = zzdy.zzx(zzdy.zze(), zzfog.zzc);
        int zze3 = zzdy.zze();
        int zze4 = zzdy.zze();
        int zze5 = zzdy.zze();
        int zze6 = zzdy.zze();
        int zze7 = zzdy.zze();
        byte[] bArr = new byte[zze7];
        zzdy.zzB(bArr, 0, zze7);
        return new zzabh(zze2, zzx, zzx2, zze3, zze4, zze5, zze6, bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzabh zzabh = (zzabh) obj;
            return this.zza == zzabh.zza && this.zzb.equals(zzabh.zzb) && this.zzc.equals(zzabh.zzc) && this.zzd == zzabh.zzd && this.zze == zzabh.zze && this.zzf == zzabh.zzf && this.zzg == zzabh.zzg && Arrays.equals(this.zzh, zzabh.zzh);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zzc;
        return "Picture: mimeType=" + str + ", description=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    public final void zza(zzbf zzbf) {
        zzbf.zza(this.zzh, this.zza);
    }
}
