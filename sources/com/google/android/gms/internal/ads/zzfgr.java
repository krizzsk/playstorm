package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfgr implements zzfgo {
    private final zzfgo zza;
    private final Queue zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) zzay.zzc().zzb(zzbhy.zzhi)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfgr(zzfgo zzfgo, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfgo;
        long intValue = (long) ((Integer) zzay.zzc().zzb(zzbhy.zzhh)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new zzfgq(this), intValue, intValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void zzc(zzfgr zzfgr) {
        while (!zzfgr.zzb.isEmpty()) {
            zzfgr.zza.zzb((zzfgn) zzfgr.zzb.remove());
        }
    }

    public final String zza(zzfgn zzfgn) {
        return this.zza.zza(zzfgn);
    }

    public final void zzb(zzfgn zzfgn) {
        if (this.zzb.size() < this.zzc) {
            this.zzb.offer(zzfgn);
        } else if (!this.zzd.getAndSet(true)) {
            Queue queue = this.zzb;
            zzfgn zzb2 = zzfgn.zzb("dropped_event");
            Map zzj = zzfgn.zzj();
            if (zzj.containsKey("action")) {
                zzb2.zza("dropped_action", (String) zzj.get("action"));
            }
            queue.offer(zzb2);
        }
    }
}
