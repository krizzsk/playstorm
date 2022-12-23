package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaiv extends Thread {
    private final BlockingQueue zza;
    private final zzaiu zzb;
    private final zzail zzc;
    private volatile boolean zzd = false;
    private final zzais zze;

    public zzaiv(BlockingQueue blockingQueue, zzaiu zzaiu, zzail zzail, zzais zzais, byte[] bArr) {
        this.zza = blockingQueue;
        this.zzb = zzaiu;
        this.zzc = zzail;
        this.zze = zzais;
    }

    private void zzb() throws InterruptedException {
        zzajb zzajb = (zzajb) this.zza.take();
        SystemClock.elapsedRealtime();
        zzajb.zzt(3);
        try {
            zzajb.zzm("network-queue-take");
            zzajb.zzw();
            TrafficStats.setThreadStatsTag(zzajb.zzc());
            zzaix zza2 = this.zzb.zza(zzajb);
            zzajb.zzm("network-http-complete");
            if (!zza2.zze || !zzajb.zzv()) {
                zzajh zzh = zzajb.zzh(zza2);
                zzajb.zzm("network-parse-complete");
                if (zzh.zzb != null) {
                    this.zzc.zzd(zzajb.zzj(), zzh.zzb);
                    zzajb.zzm("network-cache-written");
                }
                zzajb.zzq();
                this.zze.zzb(zzajb, zzh, (Runnable) null);
                zzajb.zzs(zzh);
                zzajb.zzt(4);
                return;
            }
            zzajb.zzp("not-modified");
            zzajb.zzr();
        } catch (zzajk e) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzajb, e);
            zzajb.zzr();
        } catch (Exception e2) {
            zzajn.zzc(e2, "Unhandled exception %s", e2.toString());
            zzajk zzajk = new zzajk((Throwable) e2);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzajb, zzajk);
            zzajb.zzr();
        } finally {
            zzajb.zzt(4);
        }
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzajn.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
