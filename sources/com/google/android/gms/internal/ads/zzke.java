package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzke extends BroadcastReceiver {
    final /* synthetic */ zzkf zza;

    /* synthetic */ zzke(zzkf zzkf, zzkd zzkd) {
        this.zza = zzkf;
    }

    public final void onReceive(Context context, Intent intent) {
        zzkf zzkf = this.zza;
        zzkf.zzb.post(new zzkc(zzkf));
    }
}
