package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
abstract class zzfua extends zzfuf {
    private static final Logger zza = Logger.getLogger(zzfua.class.getName());
    @CheckForNull
    private zzfrc zzb;
    private final boolean zzc;
    private final boolean zze;

    zzfua(zzfrc zzfrc, boolean z, boolean z2) {
        super(zzfrc.size());
        if (zzfrc != null) {
            this.zzb = zzfrc;
            this.zzc = z;
            this.zze = z2;
            return;
        }
        throw null;
    }

    private final void zzG(int i, Future future) {
        try {
            zzg(i, zzfva.zzp(future));
        } catch (ExecutionException e) {
            zzI(e.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzH */
    public final void zzy(@CheckForNull zzfrc zzfrc) {
        int zzB = zzB();
        int i = 0;
        zzfos.zzi(zzB >= 0, "Less than 0 remaining futures");
        if (zzB == 0) {
            if (zzfrc != null) {
                zzftg zze2 = zzfrc.iterator();
                while (zze2.hasNext()) {
                    Future future = (Future) zze2.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzv();
            zzz(2);
        }
    }

    private final void zzI(Throwable th) {
        if (th == null) {
            throw null;
        } else if (this.zzc && !zze(th) && zzK(zzE(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final String zza() {
        zzfrc zzfrc = this.zzb;
        if (zzfrc != null) {
            return "futures=".concat(zzfrc.toString());
        }
        return super.zza();
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzfrc zzfrc = this.zzb;
        boolean z = true;
        zzz(1);
        boolean isCancelled = isCancelled();
        if (zzfrc == null) {
            z = false;
        }
        if (z && isCancelled) {
            boolean zzu = zzu();
            zzftg zze2 = zzfrc.iterator();
            while (zze2.hasNext()) {
                ((Future) zze2.next()).cancel(zzu);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzf(Set set) {
        if (set == null) {
            throw null;
        } else if (!isCancelled()) {
            Throwable zzp = zzp();
            zzp.getClass();
            zzK(set, zzp);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void zzg(int i, Object obj);

    /* access modifiers changed from: package-private */
    public abstract void zzv();

    /* access modifiers changed from: package-private */
    public final void zzw() {
        zzfrc zzfrc = this.zzb;
        zzfrc.getClass();
        if (zzfrc.isEmpty()) {
            zzv();
        } else if (this.zzc) {
            zzftg zze2 = this.zzb.iterator();
            int i = 0;
            while (zze2.hasNext()) {
                zzfvj zzfvj = (zzfvj) zze2.next();
                zzfvj.zzc(new zzfty(this, zzfvj, i), zzfuo.INSTANCE);
                i++;
            }
        } else {
            zzftz zzftz = new zzftz(this, this.zze ? this.zzb : null);
            zzftg zze3 = this.zzb.iterator();
            while (zze3.hasNext()) {
                ((zzfvj) zze3.next()).zzc(zzftz, zzfuo.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzx(zzfvj zzfvj, int i) {
        try {
            if (zzfvj.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, zzfvj);
            }
        } finally {
            zzy((zzfrc) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void zzz(int i) {
        this.zzb = null;
    }
}
