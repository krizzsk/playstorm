package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbwl implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwm zza;

    zzbwl(zzbwm zzbwm) {
        this.zza = zzbwm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
