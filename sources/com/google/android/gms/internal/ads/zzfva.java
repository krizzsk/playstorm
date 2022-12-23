package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfva extends zzfvc {
    public static zzfuz zza(Iterable iterable) {
        return new zzfuz(false, zzfrh.zzl(iterable), (zzfux) null);
    }

    @SafeVarargs
    public static zzfuz zzb(zzfvj... zzfvjArr) {
        return new zzfuz(false, zzfrh.zzn(zzfvjArr), (zzfux) null);
    }

    public static zzfuz zzc(Iterable iterable) {
        return new zzfuz(true, zzfrh.zzl(iterable), (zzfux) null);
    }

    @SafeVarargs
    public static zzfuz zzd(zzfvj... zzfvjArr) {
        return new zzfuz(true, zzfrh.zzn(zzfvjArr), (zzfux) null);
    }

    public static zzfvj zze(Iterable iterable) {
        return new zzfui(zzfrh.zzl(iterable), true);
    }

    public static zzfvj zzf(zzfvj zzfvj, Class cls, zzfoi zzfoi, Executor executor) {
        zzftp zzftp = new zzftp(zzfvj, cls, zzfoi);
        zzfvj.zzc(zzftp, zzfvq.zzc(executor, zzftp));
        return zzftp;
    }

    public static zzfvj zzg(zzfvj zzfvj, Class cls, zzfuh zzfuh, Executor executor) {
        zzfto zzfto = new zzfto(zzfvj, cls, zzfuh);
        zzfvj.zzc(zzfto, zzfvq.zzc(executor, zzfto));
        return zzfto;
    }

    public static zzfvj zzh(Throwable th) {
        if (th != null) {
            return new zzfvd(th);
        }
        throw null;
    }

    public static zzfvj zzi(Object obj) {
        if (obj == null) {
            return zzfve.zza;
        }
        return new zzfve(obj);
    }

    public static zzfvj zzj() {
        return zzfve.zza;
    }

    public static zzfvj zzk(Callable callable, Executor executor) {
        zzfvy zzfvy = new zzfvy(callable);
        executor.execute(zzfvy);
        return zzfvy;
    }

    public static zzfvj zzl(zzfug zzfug, Executor executor) {
        zzfvy zzfvy = new zzfvy(zzfug);
        executor.execute(zzfvy);
        return zzfvy;
    }

    public static zzfvj zzm(zzfvj zzfvj, zzfoi zzfoi, Executor executor) {
        int i = zzftx.zzc;
        if (zzfoi != null) {
            zzftw zzftw = new zzftw(zzfvj, zzfoi);
            zzfvj.zzc(zzftw, zzfvq.zzc(executor, zzftw));
            return zzftw;
        }
        throw null;
    }

    public static zzfvj zzn(zzfvj zzfvj, zzfuh zzfuh, Executor executor) {
        int i = zzftx.zzc;
        if (executor != null) {
            zzftv zzftv = new zzftv(zzfvj, zzfuh);
            zzfvj.zzc(zzftv, zzfvq.zzc(executor, zzftv));
            return zzftv;
        }
        throw null;
    }

    public static zzfvj zzo(zzfvj zzfvj, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (zzfvj.isDone()) {
            return zzfvj;
        }
        return zzfvv.zzg(zzfvj, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzfwa.zza(future);
        }
        throw new IllegalStateException(zzfpg.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzfwa.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzfup((Error) cause);
            }
            throw new zzfvz(cause);
        }
    }

    public static void zzr(zzfvj zzfvj, zzfuw zzfuw, Executor executor) {
        if (zzfuw != null) {
            zzfvj.zzc(new zzfuy(zzfvj, zzfuw), executor);
            return;
        }
        throw null;
    }
}
