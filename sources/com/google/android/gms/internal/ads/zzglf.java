package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzglf extends zzgiq implements RandomAccess, zzglg {
    public static final zzglg zza = zzb;
    private static final zzglf zzb;
    private final List zzc;

    static {
        zzglf zzglf = new zzglf(10);
        zzb = zzglf;
        zzglf.zzb();
    }

    public zzglf() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgjg) {
            return ((zzgjg) obj).zzA(zzgky.zzb);
        }
        return zzgky.zzh((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbM();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        zzbM();
        if (collection instanceof zzglg) {
            collection = ((zzglg) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzbM();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbM();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzj(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbM();
        return zzj(this.zzc.set(i, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* bridge */ /* synthetic */ zzgkx zzd(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzglf(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final zzglg zze() {
        return zzc() ? new zzgnn(this) : this;
    }

    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    /* renamed from: zzg */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgjg) {
            zzgjg zzgjg = (zzgjg) obj;
            String zzA = zzgjg.zzA(zzgky.zzb);
            if (zzgjg.zzp()) {
                this.zzc.set(i, zzA);
            }
            return zzA;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzgky.zzh(bArr);
        if (zzgky.zzi(bArr)) {
            this.zzc.set(i, zzh);
        }
        return zzh;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final void zzi(zzgjg zzgjg) {
        zzbM();
        this.zzc.add(zzgjg);
        this.modCount++;
    }

    public zzglf(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzglf(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
