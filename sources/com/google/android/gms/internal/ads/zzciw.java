package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzciw implements Runnable {
    public final /* synthetic */ zzchr zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzciw(zzchr zzchr, Map map) {
        this.zza = zzchr;
        this.zzb = map;
    }

    public final void run() {
        zzchr zzchr = this.zza;
        Map map = this.zzb;
        int i = zzciz.zzc;
        zzchr.zzd("onGcacheInfoEvent", map);
    }
}
