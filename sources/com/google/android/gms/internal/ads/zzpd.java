package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzpd {
    public final int zza;
    public final zzsb zzb;
    private final CopyOnWriteArrayList zzc;

    public zzpd() {
        this(new CopyOnWriteArrayList(), 0, (zzsb) null);
    }

    private zzpd(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzsb zzsb) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzsb;
    }

    public final zzpd zza(int i, zzsb zzsb) {
        return new zzpd(this.zzc, i, zzsb);
    }

    public final void zzc(zzpe zzpe) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzpc zzpc = (zzpc) it.next();
            if (zzpc.zzb == zzpe) {
                this.zzc.remove(zzpc);
            }
        }
    }

    public final void zzb(Handler handler, zzpe zzpe) {
        if (zzpe != null) {
            this.zzc.add(new zzpc(handler, zzpe));
            return;
        }
        throw null;
    }
}
