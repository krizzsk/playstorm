package com.google.android.play.core.splitinstall.testing;

import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zza extends zzs {
    private Integer zza;
    private Map zzb;

    zza() {
    }

    /* access modifiers changed from: package-private */
    public final zzs zza(int i) {
        this.zza = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final zzs zzb(Map map) {
        if (map != null) {
            this.zzb = map;
            return this;
        }
        throw new NullPointerException("Null splitInstallErrorCodeByModule");
    }

    /* access modifiers changed from: package-private */
    public final zzt zzc() {
        if (this.zzb != null) {
            return new zzc(this.zza, this.zzb, (zzb) null);
        }
        throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
    }

    /* access modifiers changed from: package-private */
    public final Map zzd() {
        Map map = this.zzb;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}
