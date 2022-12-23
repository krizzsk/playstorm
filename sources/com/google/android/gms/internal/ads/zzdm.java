package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdm {
    private final zzcx zza;
    private final zzdg zzb;
    private final zzdk zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private boolean zzg;

    public zzdm(Looper looper, zzcx zzcx, zzdk zzdk) {
        this(new CopyOnWriteArraySet(), looper, zzcx, zzdk);
    }

    public static /* synthetic */ boolean zzg(zzdm zzdm, Message message) {
        Iterator it = zzdm.zzd.iterator();
        while (it.hasNext()) {
            ((zzdl) it.next()).zzb(zzdm.zzc);
            if (zzdm.zzb.zzf(0)) {
                return true;
            }
        }
        return true;
    }

    public final zzdm zza(Looper looper, zzdk zzdk) {
        return new zzdm(this.zzd, looper, this.zza, zzdk);
    }

    public final void zzb(Object obj) {
        if (!this.zzg) {
            this.zzd.add(new zzdl(obj));
        }
    }

    public final void zzc() {
        if (!this.zzf.isEmpty()) {
            if (!this.zzb.zzf(0)) {
                zzdg zzdg = this.zzb;
                zzdg.zzj(zzdg.zza(0));
            }
            boolean isEmpty = this.zze.isEmpty();
            this.zze.addAll(this.zzf);
            this.zzf.clear();
            if (!(!isEmpty)) {
                while (!this.zze.isEmpty()) {
                    ((Runnable) this.zze.peekFirst()).run();
                    this.zze.removeFirst();
                }
            }
        }
    }

    public final void zzd(int i, zzdj zzdj) {
        this.zzf.add(new zzdi(new CopyOnWriteArraySet(this.zzd), i, zzdj));
    }

    public final void zze() {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzdl) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
        this.zzg = true;
    }

    public final void zzf(Object obj) {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzdl zzdl = (zzdl) it.next();
            if (zzdl.zza.equals(obj)) {
                zzdl.zzc(this.zzc);
                this.zzd.remove(zzdl);
            }
        }
    }

    private zzdm(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzcx zzcx, zzdk zzdk) {
        this.zza = zzcx;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdk;
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzcx.zzb(looper, new zzdh(this));
    }
}
