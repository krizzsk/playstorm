package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeox implements zzetb {
    private static final Object zza = new Object();
    private final String zzb;
    private final String zzc;
    private final zzczj zzd;
    private final zzfdd zze;
    private final zzfby zzf;
    private final zzg zzg = zzt.zzo().zzh();

    public zzeox(String str, String str2, zzczj zzczj, zzfdd zzfdd, zzfby zzfby) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzczj;
        this.zze = zzfdd;
        this.zzf = zzfby;
    }

    public final int zza() {
        return 12;
    }

    public final zzfvj zzb() {
        Bundle bundle = new Bundle();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzeA)).booleanValue()) {
            this.zzd.zzg(this.zzf.zzd);
            bundle.putAll(this.zze.zzb());
        }
        return zzfva.zzi(new zzeow(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzeA)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzez)).booleanValue()) {
                synchronized (zza) {
                    this.zzd.zzg(this.zzf.zzd);
                    bundle2.putBundle("quality_signals", this.zze.zzb());
                }
            } else {
                this.zzd.zzg(this.zzf.zzd);
                bundle2.putBundle("quality_signals", this.zze.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzb);
        if (!this.zzg.zzP()) {
            bundle2.putString("session_id", this.zzc);
        }
    }
}
