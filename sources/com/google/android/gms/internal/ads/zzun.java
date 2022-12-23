package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzun implements Comparator {
    public static final /* synthetic */ zzun zza = new zzun();

    private /* synthetic */ zzun() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((zzuz) ((List) obj).get(0)).compareTo((zzuz) ((List) obj2).get(0));
    }
}
