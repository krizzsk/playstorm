package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbsq {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbsz zzc;
    private zzbsz zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbsz zza(Context context, zzcfo zzcfo, zzfhs zzfhs) {
        zzbsz zzbsz;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbsz(zzc(context), zzcfo, (String) zzay.zzc().zzb(zzbhy.zza), zzfhs);
            }
            zzbsz = this.zzc;
        }
        return zzbsz;
    }

    public final zzbsz zzb(Context context, zzcfo zzcfo, zzfhs zzfhs) {
        zzbsz zzbsz;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbsz(zzc(context), zzcfo, (String) zzbjx.zzb.zze(), zzfhs);
            }
            zzbsz = this.zzd;
        }
        return zzbsz;
    }
}
