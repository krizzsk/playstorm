package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcti implements zzdcn {
    private final zzfct zza;

    public zzcti(zzfct zzfct) {
        this.zza = zzfct;
    }

    public final void zzbq(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfcd e) {
            zze.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    public final void zzbs(Context context) {
        try {
            this.zza.zzs();
        } catch (zzfcd e) {
            zze.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    public final void zzbt(Context context) {
        try {
            this.zza.zzt();
            if (context != null) {
                this.zza.zzr(context);
            }
        } catch (zzfcd e) {
            zze.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
