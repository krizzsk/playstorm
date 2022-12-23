package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgnn extends AbstractList implements RandomAccess, zzglg {
    /* access modifiers changed from: private */
    public final zzglg zza;

    public zzgnn(zzglg zzglg) {
        this.zza = zzglg;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzglf) this.zza).get(i);
    }

    public final Iterator iterator() {
        return new zzgnm(this);
    }

    public final ListIterator listIterator(int i) {
        return new zzgnl(this, i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzglg zze() {
        return this;
    }

    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    public final List zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zzgjg zzgjg) {
        throw new UnsupportedOperationException();
    }
}
