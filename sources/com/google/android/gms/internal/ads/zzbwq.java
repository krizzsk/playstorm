package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbwq implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwr zza;

    zzbwq(zzbwr zzbwr) {
        this.zza = zzbwr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}
