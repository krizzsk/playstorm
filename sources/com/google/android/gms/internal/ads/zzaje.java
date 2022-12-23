package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaje {
    private final AtomicInteger zza = new AtomicInteger();
    private final Set zzb = new HashSet();
    private final PriorityBlockingQueue zzc = new PriorityBlockingQueue();
    private final PriorityBlockingQueue zzd = new PriorityBlockingQueue();
    private final zzail zze;
    private final zzaiu zzf;
    private final zzaiv[] zzg;
    private zzain zzh;
    private final List zzi = new ArrayList();
    private final List zzj = new ArrayList();
    private final zzais zzk;

    public zzaje(zzail zzail, zzaiu zzaiu, int i) {
        zzais zzais = new zzais(new Handler(Looper.getMainLooper()));
        this.zze = zzail;
        this.zzf = zzaiu;
        this.zzg = new zzaiv[4];
        this.zzk = zzais;
    }

    public final zzajb zza(zzajb zzajb) {
        zzajb.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzajb);
        }
        zzajb.zzg(this.zza.incrementAndGet());
        zzajb.zzm("add-to-queue");
        zzc(zzajb, 0);
        this.zzc.add(zzajb);
        return zzajb;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzajb zzajb) {
        synchronized (this.zzb) {
            this.zzb.remove(zzajb);
        }
        synchronized (this.zzi) {
            for (zzajd zza2 : this.zzi) {
                zza2.zza();
            }
        }
        zzc(zzajb, 5);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(zzajb zzajb, int i) {
        synchronized (this.zzj) {
            for (zzajc zza2 : this.zzj) {
                zza2.zza();
            }
        }
    }

    public final void zzd() {
        zzain zzain = this.zzh;
        if (zzain != null) {
            zzain.zzb();
        }
        zzaiv[] zzaivArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzaiv zzaiv = zzaivArr[i];
            if (zzaiv != null) {
                zzaiv.zza();
            }
        }
        zzain zzain2 = new zzain(this.zzc, this.zzd, this.zze, this.zzk, (byte[]) null);
        this.zzh = zzain2;
        zzain2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzaiv zzaiv2 = new zzaiv(this.zzd, this.zzf, this.zze, this.zzk, (byte[]) null);
            this.zzg[i2] = zzaiv2;
            zzaiv2.start();
        }
    }
}
