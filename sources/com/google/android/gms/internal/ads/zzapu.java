package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzapu implements Callable {
    private final zzapc zza;
    private final zzali zzb;

    public zzapu(zzapc zzapc, zzali zzali) {
        this.zza = zzapc;
        this.zzb = zzali;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzaly zzc = this.zza.zzc();
        if (zzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                zzali zzali = this.zzb;
                byte[] zzau = zzc.zzau();
                zzali.zzai(zzau, 0, zzau.length, zzgka.zza());
            }
            return null;
        } catch (zzgla | NullPointerException unused) {
            return null;
        }
    }
}
