package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzftc {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfot zzfot) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzfsz) {
                zzfsz zzfsz = (zzfsz) sortedSet;
                return new zzfta((SortedSet) zzfsz.zza, zzfow.zza(zzfsz.zzb, zzfot));
            } else if (sortedSet == null) {
                throw null;
            } else if (zzfot != null) {
                return new zzfta(sortedSet, zzfot);
            } else {
                throw null;
            }
        } else if (set instanceof zzfsz) {
            zzfsz zzfsz2 = (zzfsz) set;
            return new zzfsz(zzfsz2.zza, zzfow.zza(zzfsz2.zzb, zzfot));
        } else if (set == null) {
            throw null;
        } else if (zzfot != null) {
            return new zzfsz(set, zzfot);
        } else {
            throw null;
        }
    }

    static boolean zzc(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    static boolean zzd(Set set, Collection collection) {
        if (collection != null) {
            if (collection instanceof zzfsm) {
                collection = ((zzfsm) collection).zza();
            }
            if (!(collection instanceof Set) || collection.size() <= set.size()) {
                return zze(set, collection.iterator());
            }
            Iterator it = set.iterator();
            if (collection != null) {
                boolean z = false;
                while (it.hasNext()) {
                    if (collection.contains(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
                return z;
            }
            throw null;
        }
        throw null;
    }

    static boolean zze(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
