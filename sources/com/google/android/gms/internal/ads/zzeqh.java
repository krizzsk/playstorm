package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzf;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeqh implements zzetb {
    private final zzfvk zza;
    private final zzfby zzb;

    zzeqh(zzfvk zzfvk, zzfby zzfby) {
        this.zza = zzfvk;
        this.zzb = zzfby;
    }

    public final int zza() {
        return 21;
    }

    public final zzfvj zzb() {
        return this.zza.zzb(new zzeqg(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeqi zzc() throws Exception {
        return new zzeqi("requester_type_2".equals(zzf.zzb(this.zzb.zzd)));
    }
}
