package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzblb extends NativeAd.Image {
    private final zzbla zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzblb(zzbla zzbla) {
        Drawable drawable;
        double d;
        int i;
        this.zza = zzbla;
        Uri uri = null;
        try {
            IObjectWrapper zzf2 = zzbla.zzf();
            if (zzf2 != null) {
                drawable = (Drawable) ObjectWrapper.unwrap(zzf2);
                this.zzb = drawable;
                uri = this.zza.zze();
                this.zzc = uri;
                d = this.zza.zzb();
                this.zzd = d;
                int i2 = -1;
                i = this.zza.zzd();
                this.zze = i;
                i2 = this.zza.zzc();
                this.zzf = i2;
            }
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
        drawable = null;
        this.zzb = drawable;
        try {
            uri = this.zza.zze();
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
        this.zzc = uri;
        try {
            d = this.zza.zzb();
        } catch (RemoteException e3) {
            zzcfi.zzh("", e3);
            d = 1.0d;
        }
        this.zzd = d;
        int i22 = -1;
        try {
            i = this.zza.zzd();
        } catch (RemoteException e4) {
            zzcfi.zzh("", e4);
            i = -1;
        }
        this.zze = i;
        try {
            i22 = this.zza.zzc();
        } catch (RemoteException e5) {
            zzcfi.zzh("", e5);
        }
        this.zzf = i22;
    }

    public final Drawable getDrawable() {
        return this.zzb;
    }

    public final double getScale() {
        return this.zzd;
    }

    public final Uri getUri() {
        return this.zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zze;
    }
}
