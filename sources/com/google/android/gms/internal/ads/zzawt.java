package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzawt implements zzaxk {
    final /* synthetic */ zzawu zza;
    /* access modifiers changed from: private */
    public final int zzb;

    public zzawt(zzawu zzawu, int i) {
        this.zza = zzawu;
        this.zzb = i;
    }

    public final int zzb(zzart zzart, zzatn zzatn, boolean z) {
        return this.zza.zze(this.zzb, zzart, zzatn, z);
    }

    public final void zzc() throws IOException {
        this.zza.zzr();
    }

    public final void zzd(long j) {
        this.zza.zzy(this.zzb, j);
    }

    public final boolean zze() {
        return this.zza.zzA(this.zzb);
    }
}
