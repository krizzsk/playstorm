package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfs implements zzer {
    private final zzer zza;
    private long zzb;
    private Uri zzc;
    private Map zzd;

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int zza2 = this.zza.zza(bArr, i, i2);
        if (zza2 != -1) {
            this.zzb += (long) zza2;
        }
        return zza2;
    }

    public final long zzb(zzew zzew) throws IOException {
        this.zzc = zzew.zza;
        this.zzd = Collections.emptyMap();
        long zzb2 = this.zza.zzb(zzew);
        Uri zzc2 = zzc();
        if (zzc2 != null) {
            this.zzc = zzc2;
            this.zzd = zze();
            return zzb2;
        }
        throw null;
    }

    public final Uri zzc() {
        return this.zza.zzc();
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final Map zze() {
        return this.zza.zze();
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }

    public zzfs(zzer zzer) {
        if (zzer != null) {
            this.zza = zzer;
            this.zzc = Uri.EMPTY;
            this.zzd = Collections.emptyMap();
            return;
        }
        throw null;
    }

    public final void zzf(zzft zzft) {
        if (zzft != null) {
            this.zza.zzf(zzft);
            return;
        }
        throw null;
    }
}
