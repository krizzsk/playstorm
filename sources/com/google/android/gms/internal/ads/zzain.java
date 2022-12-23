package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzain extends Thread {
    private static final boolean zza = zzajn.zzb;
    private final BlockingQueue zzb;
    /* access modifiers changed from: private */
    public final BlockingQueue zzc;
    private final zzail zzd;
    private volatile boolean zze = false;
    private final zzajo zzf;
    private final zzais zzg;

    public zzain(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzail zzail, zzais zzais, byte[] bArr) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzail;
        this.zzg = zzais;
        this.zzf = new zzajo(this, blockingQueue2, zzais, (byte[]) null);
    }

    private void zzc() throws InterruptedException {
        zzajb zzajb = (zzajb) this.zzb.take();
        zzajb.zzm("cache-queue-take");
        zzajb.zzt(1);
        try {
            zzajb.zzw();
            zzaik zza2 = this.zzd.zza(zzajb.zzj());
            if (zza2 == null) {
                zzajb.zzm("cache-miss");
                if (!this.zzf.zzc(zzajb)) {
                    this.zzc.put(zzajb);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza2.zza(currentTimeMillis)) {
                zzajb.zzm("cache-hit-expired");
                zzajb.zze(zza2);
                if (!this.zzf.zzc(zzajb)) {
                    this.zzc.put(zzajb);
                }
                zzajb.zzt(2);
                return;
            }
            zzajb.zzm("cache-hit");
            zzajh zzh = zzajb.zzh(new zzaix(zza2.zza, zza2.zzg));
            zzajb.zzm("cache-hit-parsed");
            if (!zzh.zzc()) {
                zzajb.zzm("cache-parsing-failed");
                this.zzd.zzc(zzajb.zzj(), true);
                zzajb.zze((zzaik) null);
                if (!this.zzf.zzc(zzajb)) {
                    this.zzc.put(zzajb);
                }
                zzajb.zzt(2);
                return;
            }
            if (zza2.zzf < currentTimeMillis) {
                zzajb.zzm("cache-hit-refresh-needed");
                zzajb.zze(zza2);
                zzh.zzd = true;
                if (!this.zzf.zzc(zzajb)) {
                    this.zzg.zzb(zzajb, zzh, new zzaim(this, zzajb));
                } else {
                    this.zzg.zzb(zzajb, zzh, (Runnable) null);
                }
            } else {
                this.zzg.zzb(zzajb, zzh, (Runnable) null);
            }
            zzajb.zzt(2);
        } finally {
            zzajb.zzt(2);
        }
    }

    public final void run() {
        if (zza) {
            zzajn.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzajn.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
