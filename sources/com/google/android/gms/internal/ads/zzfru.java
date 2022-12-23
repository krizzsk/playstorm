package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfru extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfoi zzb;

    zzfru(List list, zzfoi zzfoi) {
        this.zza = list;
        this.zzb = zzfoi;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final ListIterator listIterator(int i) {
        return new zzfrt(this, this.zza.listIterator(i));
    }

    public final int size() {
        return this.zza.size();
    }
}
