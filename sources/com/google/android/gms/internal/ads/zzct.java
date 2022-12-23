package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzct {
    public static final zzct zza = new zzct(zzfrh.zzo());
    public static final zzl zzb = zzcq.zza;
    private final zzfrh zzc;

    public zzct(List list) {
        this.zzc = zzfrh.zzm(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzc.equals(((zzct) obj).zzc);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final zzfrh zza() {
        return this.zzc;
    }

    public final boolean zzb(int i) {
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            zzcs zzcs = (zzcs) this.zzc.get(i2);
            if (zzcs.zzc() && zzcs.zza() == i) {
                return true;
            }
        }
        return false;
    }
}
