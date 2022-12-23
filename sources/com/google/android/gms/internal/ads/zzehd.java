package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzehd implements zzdlf {
    private final zzfbg zza;
    private final zzbvs zzb;
    private final boolean zzc;
    private zzdck zzd = null;

    zzehd(zzfbg zzfbg, zzbvs zzbvs, boolean z) {
        this.zza = zzfbg;
        this.zzb = zzbvs;
        this.zzc = z;
    }

    public final void zza(boolean z, Context context, zzdcf zzdcf) throws zzdle {
        boolean z2;
        try {
            if (this.zzc) {
                z2 = this.zzb.zzr(ObjectWrapper.wrap(context));
            } else {
                z2 = this.zzb.zzq(ObjectWrapper.wrap(context));
            }
            if (!z2) {
                throw new zzdle("Adapter failed to show.");
            } else if (this.zzd != null) {
                if (!((Boolean) zzay.zzc().zzb(zzbhy.zzbp)).booleanValue() && this.zza.zzZ == 2) {
                    this.zzd.zza();
                }
            }
        } catch (Throwable th) {
            throw new zzdle(th);
        }
    }

    public final void zzb(zzdck zzdck) {
        this.zzd = zzdck;
    }
}
