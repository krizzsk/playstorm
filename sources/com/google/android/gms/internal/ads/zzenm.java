package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzenm implements zzetb {
    private final zzfvk zza;
    private final zzfby zzb;
    private final zzfck zzc;

    zzenm(zzfvk zzfvk, zzfby zzfby, zzfck zzfck) {
        this.zza = zzfvk;
        this.zzb = zzfby;
        this.zzc = zzfck;
    }

    public final int zza() {
        return 5;
    }

    public final zzfvj zzb() {
        return this.zza.zzb(new zzenl(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzenn zzc() throws Exception {
        String str = null;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzgf)).booleanValue() && "requester_type_2".equals(zzf.zzb(this.zzb.zzd))) {
            str = zzfck.zza();
        }
        return new zzenn(str);
    }
}
