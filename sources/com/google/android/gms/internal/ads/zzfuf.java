package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftr;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
abstract class zzfuf extends zzftr.zzi {
    private static final zzfuc zzaV;
    private static final Logger zzaW;
    private volatile int remaining;
    /* access modifiers changed from: private */
    @CheckForNull
    public volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        zzfuc zzfuc;
        Class<zzfuf> cls = zzfuf.class;
        zzaW = Logger.getLogger(cls.getName());
        try {
            zzfuc = new zzfud(AtomicReferenceFieldUpdater.newUpdater(cls, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(cls, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzfuc = new zzfue((zzfub) null);
            th = th2;
        }
        zzaV = zzfuc;
        if (th != null) {
            zzaW.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzfuf(int i) {
        this.remaining = i;
    }

    static /* synthetic */ int zzA(zzfuf zzfuf) {
        int i = zzfuf.remaining - 1;
        zzfuf.remaining = i;
        return i;
    }

    /* access modifiers changed from: package-private */
    public final int zzB() {
        return zzaV.zza(this);
    }

    /* access modifiers changed from: package-private */
    public final Set zzE() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(newSetFromMap);
        zzaV.zzb(this, (Set) null, newSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        set2.getClass();
        return set2;
    }

    /* access modifiers changed from: package-private */
    public final void zzF() {
        this.seenExceptions = null;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzf(Set set);
}
