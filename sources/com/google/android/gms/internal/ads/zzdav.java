package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzdav implements zzddg, zzdcn {
    private final Context zza;
    private final zzfbg zzb;
    private final zzbxz zzc;

    public zzdav(Context context, zzfbg zzfbg, zzbxz zzbxz, byte[] bArr) {
        this.zza = context;
        this.zzb = zzfbg;
        this.zzc = zzbxz;
    }

    public final void zzbq(Context context) {
    }

    public final void zzbs(Context context) {
    }

    public final void zzbt(Context context) {
    }

    public final void zzn() {
        zzbya zzbya = this.zzb.zzae;
        if (zzbya != null && zzbya.zza) {
            ArrayList arrayList = new ArrayList();
            if (!this.zzb.zzae.zzb.isEmpty()) {
                arrayList.add(this.zzb.zzae.zzb);
            }
        }
    }
}
