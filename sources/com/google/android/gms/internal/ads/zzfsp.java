package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzfsp implements Comparator {
    protected zzfsp() {
    }

    public static zzfsp zzb(Comparator comparator) {
        if (comparator instanceof zzfsp) {
            return (zzfsp) comparator;
        }
        return new zzfqt(comparator);
    }

    public static zzfsp zzc() {
        return zzfsn.zza;
    }

    public abstract int compare(Object obj, Object obj2);

    public zzfsp zza() {
        return new zzfsy(this);
    }
}
