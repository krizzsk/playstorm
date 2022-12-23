package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzcdd implements zzcdm {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcdd(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    public final void zza(zzcmz zzcmz) {
        Context context = this.zza;
        zzcmz.zzs(ObjectWrapper.wrap(context), this.zzb, context.getPackageName());
    }
}
