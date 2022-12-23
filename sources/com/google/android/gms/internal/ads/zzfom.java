package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzfom {
    private final String zza;
    private final zzfol zzb;
    private zzfol zzc;

    /* synthetic */ zzfom(String str, zzfok zzfok) {
        zzfol zzfol = new zzfol((zzfok) null);
        this.zzb = zzfol;
        this.zzc = zzfol;
        if (str != null) {
            this.zza = str;
            return;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfol zzfol = this.zzb.zzb;
        String str = "";
        while (zzfol != null) {
            Object obj = zzfol.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            zzfol = zzfol.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfom zza(@CheckForNull Object obj) {
        zzfol zzfol = new zzfol((zzfok) null);
        this.zzc.zzb = zzfol;
        this.zzc = zzfol;
        zzfol.zza = obj;
        return this;
    }
}
