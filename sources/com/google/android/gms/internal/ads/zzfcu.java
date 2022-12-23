package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfcu {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzfvk zzc;

    public zzfcu(Callable callable, zzfvk zzfvk) {
        this.zzb = callable;
        this.zzc = zzfvk;
    }

    public final synchronized zzfvj zza() {
        zzc(1);
        return (zzfvj) this.zza.poll();
    }

    public final synchronized void zzb(zzfvj zzfvj) {
        this.zza.addFirst(zzfvj);
    }

    public final synchronized void zzc(int i) {
        int size = i - this.zza.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
