package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzapi extends BroadcastReceiver {
    final /* synthetic */ zzapj zza;

    zzapi(zzapj zzapj) {
        this.zza = zzapj;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf();
    }
}
