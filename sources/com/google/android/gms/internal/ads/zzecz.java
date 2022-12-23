package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzecz implements zzdil {
    private boolean zza = false;
    private boolean zzb = false;
    private final String zzc;
    private final zzfgo zzd;
    private final zzg zze;

    public zzecz(String str, zzfgo zzfgo) {
        this.zzc = str;
        this.zzd = zzfgo;
        this.zze = zzt.zzo().zzh();
    }

    private final zzfgn zzg(String str) {
        String str2;
        if (this.zze.zzP()) {
            str2 = "";
        } else {
            str2 = this.zzc;
        }
        zzfgn zzb2 = zzfgn.zzb(str);
        zzb2.zza("tms", Long.toString(zzt.zzA().elapsedRealtime(), 10));
        zzb2.zza("tid", str2);
        return zzb2;
    }

    public final void zza(String str) {
        zzfgo zzfgo = this.zzd;
        zzfgn zzg = zzg("aaia");
        zzg.zza("aair", "MalformedJson");
        zzfgo.zzb(zzg);
    }

    public final void zzb(String str, String str2) {
        zzfgo zzfgo = this.zzd;
        zzfgn zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzg.zza("rqe", str2);
        zzfgo.zzb(zzg);
    }

    public final void zzc(String str) {
        zzfgo zzfgo = this.zzd;
        zzfgn zzg = zzg("adapter_init_started");
        zzg.zza("ancn", str);
        zzfgo.zzb(zzg);
    }

    public final void zzd(String str) {
        zzfgo zzfgo = this.zzd;
        zzfgn zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzfgo.zzb(zzg);
    }

    public final synchronized void zze() {
        if (!this.zzb) {
            this.zzd.zzb(zzg("init_finished"));
            this.zzb = true;
        }
    }

    public final synchronized void zzf() {
        if (!this.zza) {
            this.zzd.zzb(zzg("init_started"));
            this.zza = true;
        }
    }
}
