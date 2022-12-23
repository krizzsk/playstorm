package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcjy extends zzcju {
    public zzcjy(zzchr zzchr) {
        super(zzchr);
    }

    public final void zzb() {
    }

    public final boolean zzq(String str) {
        String zze = zzcfb.zze(str);
        zzchr zzchr = (zzchr) this.zzc.get();
        if (!(zzchr == null || zze == null)) {
            zzchr.zzv(zze, this);
        }
        zze.zzj("VideoStreamNoopCache is doing nothing.");
        zzc(str, zze, "noop", "Noop cache is a noop.");
        return false;
    }
}
