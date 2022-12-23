package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzeom implements zzfoi {
    public static final /* synthetic */ zzeom zza = new zzeom();

    private /* synthetic */ zzeom() {
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzeon(arrayList);
    }
}
