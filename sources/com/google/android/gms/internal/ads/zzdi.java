package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdi implements Runnable {
    public final /* synthetic */ CopyOnWriteArraySet zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzdj zzc;

    public /* synthetic */ zzdi(CopyOnWriteArraySet copyOnWriteArraySet, int i, zzdj zzdj) {
        this.zza = copyOnWriteArraySet;
        this.zzb = i;
        this.zzc = zzdj;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.zza;
        int i = this.zzb;
        zzdj zzdj = this.zzc;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zzdl) it.next()).zza(i, zzdj);
        }
    }
}
