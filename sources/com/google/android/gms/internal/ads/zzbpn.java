package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.p196h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbpn {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzbpj zzc;

    public zzbpn(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(Build.VERSION.SDK_INT >= 21, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbhy.zzc(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzhO)).booleanValue()) {
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.length() > ((Integer) zzay.zzc().zzb(zzbhy.zzhQ)).intValue()) {
            zzcfi.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"gmsg".equals(parse.getScheme()) || !"mobileads.google.com".equals(parse.getHost()) || !"/h5ads".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    private final void zzd() {
        if (this.zzc == null) {
            this.zzc = zzaw.zza().zzk(this.zza, new zzbtw(), this.zzb);
        }
    }

    public final void zza() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhO)).booleanValue()) {
            zzd();
            zzbpj zzbpj = this.zzc;
            if (zzbpj != null) {
                try {
                    zzbpj.zze();
                } catch (RemoteException e) {
                    zzcfi.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzbpj zzbpj = this.zzc;
        if (zzbpj == null) {
            return false;
        }
        try {
            zzbpj.zzf(str);
            return true;
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            return true;
        }
    }
}
