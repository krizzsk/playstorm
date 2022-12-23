package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzena implements zzetb {
    private final Context zza;

    zzena(Context context) {
        this.zza = context;
    }

    public final int zza() {
        return 2;
    }

    public final zzfvj zzb() {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzcq)).booleanValue()) {
            return zzfva.zzi((Object) null);
        }
        return zzfva.zzi(new zzenb(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
