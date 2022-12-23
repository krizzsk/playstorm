package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzuj implements Comparator {
    public static final /* synthetic */ zzuj zza = new zzuj();

    private /* synthetic */ zzuj() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((zzuq) Collections.max((List) obj)).compareTo((zzuq) Collections.max((List) obj2));
    }
}
