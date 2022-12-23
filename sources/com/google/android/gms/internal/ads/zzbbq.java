package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbbq {
    private final int zza;
    private final zzbbn zzb = new zzbbs();

    public zzbbq(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append(10);
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzbbp zzbbp = new zzbbp();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzbbo(this));
        for (String zzb2 : split) {
            String[] zzb3 = zzbbr.zzb(zzb2, false);
            if (zzb3.length != 0) {
                zzbbv.zzc(zzb3, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbbp.zzb.write(this.zzb.zzb(((zzbbu) it.next()).zzb));
            } catch (IOException e) {
                zze.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzbbp.toString();
    }
}
