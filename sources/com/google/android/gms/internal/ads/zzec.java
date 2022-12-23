package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzec implements zzdg {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzec(Handler handler) {
        this.zzb = handler;
    }

    static /* bridge */ /* synthetic */ void zzk(zzeb zzeb) {
        synchronized (zza) {
            if (zza.size() < 50) {
                zza.add(zzeb);
            }
        }
    }

    private static zzeb zzl() {
        zzeb zzeb;
        synchronized (zza) {
            if (zza.isEmpty()) {
                zzeb = new zzeb((zzea) null);
            } else {
                List list = zza;
                zzeb = (zzeb) list.remove(list.size() - 1);
            }
        }
        return zzeb;
    }

    public final zzdf zza(int i) {
        zzeb zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i), this);
        return zzl;
    }

    public final zzdf zzb(int i, Object obj) {
        zzeb zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i, obj), this);
        return zzl;
    }

    public final zzdf zzc(int i, int i2, int i3) {
        zzeb zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(1, i2, i3), this);
        return zzl;
    }

    public final void zzd(Object obj) {
        this.zzb.removeCallbacksAndMessages((Object) null);
    }

    public final void zze(int i) {
        this.zzb.removeMessages(2);
    }

    public final boolean zzf(int i) {
        return this.zzb.hasMessages(0);
    }

    public final boolean zzg(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    public final boolean zzh(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    public final boolean zzi(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    public final boolean zzj(zzdf zzdf) {
        return ((zzeb) zzdf).zzc(this.zzb);
    }
}
