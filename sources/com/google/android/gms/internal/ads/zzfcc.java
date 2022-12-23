package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfcc {
    public static zzq zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfbh zzfbh = (zzfbh) it.next();
            if (zzfbh.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfbh.zza, zzfbh.zzb));
            }
        }
        return new zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfbh zzb(List list, zzfbh zzfbh) {
        return (zzfbh) list.get(0);
    }

    public static zzfbh zzc(zzq zzq) {
        return zzq.zzi ? new zzfbh(-3, 0, true) : new zzfbh(zzq.zze, zzq.zzb, false);
    }
}
