package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfjh {
    private static zzfjh zza;
    private float zzb = 0.0f;
    private final zzfiz zzc;
    private final zzfix zzd;
    private zzfiy zze;
    private zzfja zzf;

    public zzfjh(zzfiz zzfiz, zzfix zzfix) {
        this.zzc = zzfiz;
        this.zzd = zzfix;
    }

    public static zzfjh zzb() {
        if (zza == null) {
            zza = new zzfjh(new zzfiz(), new zzfix());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zze = new zzfiy(new Handler(), context, new zzfiw(), this, (byte[]) null);
    }

    public final void zzd(float f) {
        this.zzb = f;
        if (this.zzf == null) {
            this.zzf = zzfja.zza();
        }
        for (zzfip zzg : this.zzf.zzb()) {
            zzg.zzg().zzh(f);
        }
    }

    public final void zze() {
        zzfjc.zza().zzg(this);
        zzfjc.zza().zzd();
        if (zzfjc.zza().zzf()) {
            zzfkd.zzd().zzi();
        }
        this.zze.zza();
    }

    public final void zzf() {
        zzfkd.zzd().zzj();
        zzfjc.zza().zze();
        this.zze.zzb();
    }
}
