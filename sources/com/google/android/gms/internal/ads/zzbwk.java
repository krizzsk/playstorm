package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbwk implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwm zza;

    zzbwk(zzbwm zzbwm) {
        this.zza = zzbwm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent zzb = this.zza.zzb();
        zzt.zzp();
        zzs.zzI(this.zza.zzb, zzb);
    }
}
