package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeu {
    private Uri zza;
    private final int zzb = 1;
    private Map zzc = Collections.emptyMap();
    private long zzd;
    private int zze;

    public final zzeu zza(int i) {
        this.zze = 6;
        return this;
    }

    public final zzeu zzb(Map map) {
        this.zzc = map;
        return this;
    }

    public final zzeu zzc(long j) {
        this.zzd = j;
        return this;
    }

    public final zzeu zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzew zze() {
        if (this.zza != null) {
            return new zzew(this.zza, 0, 1, (byte[]) null, this.zzc, this.zzd, -1, (String) null, this.zze, (Object) null, (zzev) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
