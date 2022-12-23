package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzclv implements Runnable {
    public final /* synthetic */ IObjectWrapper zza;

    public /* synthetic */ zzclv(IObjectWrapper iObjectWrapper) {
        this.zza = iObjectWrapper;
    }

    public final void run() {
        IObjectWrapper iObjectWrapper = this.zza;
        zzt.zzh();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzea)).booleanValue() && zzfij.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfil) {
                ((zzfil) unwrap).zzc();
            }
        }
    }
}
