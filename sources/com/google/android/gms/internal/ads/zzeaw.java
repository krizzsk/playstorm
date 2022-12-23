package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzaz;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeaw extends zzbzp {
    final /* synthetic */ zzeax zza;

    protected zzeaw(zzeax zzeax) {
        this.zza = zzeax;
    }

    public final void zze(zzaz zzaz) {
        this.zza.zza.zze(new zzay(zzaz.zza, zzaz.zzb));
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
