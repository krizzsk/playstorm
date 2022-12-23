package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdck extends zzdhb {
    private boolean zzb = false;

    public zzdck(Set set) {
        super(set);
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzo(zzdcj.zza);
            this.zzb = true;
        }
    }
}
