package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzvt {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzvu zzvu) {
        zzc(zzvu);
        this.zza.add(new zzvs(handler, zzvu));
    }

    public final void zzb(int i, long j, long j2) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzvs zzvs = (zzvs) it.next();
            if (!zzvs.zzc) {
                zzvs.zza.post(new zzvr(zzvs, i, j, j2));
            }
        }
    }

    public final void zzc(zzvu zzvu) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzvs zzvs = (zzvs) it.next();
            if (zzvs.zzb == zzvu) {
                zzvs.zzc();
                this.zza.remove(zzvs);
            }
        }
    }
}
