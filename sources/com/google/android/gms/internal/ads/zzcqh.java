package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcqh implements zzezl {
    private final zzcrb zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    /* synthetic */ zzcqh(zzcrb zzcrb, zzcqg zzcqg) {
        this.zza = zzcrb;
    }

    public final /* synthetic */ zzezl zza(zzq zzq) {
        if (zzq != null) {
            this.zzd = zzq;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzezl zzb(String str) {
        if (str != null) {
            this.zzc = str;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzezl zzc(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzezm zzd() {
        zzgqc.zzc(this.zzb, Context.class);
        zzgqc.zzc(this.zzc, String.class);
        zzgqc.zzc(this.zzd, zzq.class);
        return new zzcqj(this.zza, this.zzb, this.zzc, this.zzd, (zzcqi) null);
    }
}
