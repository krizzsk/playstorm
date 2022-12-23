package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzglk extends zzglm {
    private zzglk() {
        super((zzgll) null);
    }

    /* synthetic */ zzglk(zzglj zzglj) {
        super((zzgll) null);
    }

    /* access modifiers changed from: package-private */
    public final List zza(Object obj, long j) {
        zzgkx zzgkx = (zzgkx) zzgns.zzh(obj, j);
        if (zzgkx.zzc()) {
            return zzgkx;
        }
        int size = zzgkx.size();
        zzgkx zzd = zzgkx.zzd(size == 0 ? 10 : size + size);
        zzgns.zzv(obj, j, zzd);
        return zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        ((zzgkx) zzgns.zzh(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj, Object obj2, long j) {
        zzgkx zzgkx = (zzgkx) zzgns.zzh(obj, j);
        zzgkx zzgkx2 = (zzgkx) zzgns.zzh(obj2, j);
        int size = zzgkx.size();
        int size2 = zzgkx2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgkx.zzc()) {
                zzgkx = zzgkx.zzd(size2 + size);
            }
            zzgkx.addAll(zzgkx2);
        }
        if (size > 0) {
            zzgkx2 = zzgkx;
        }
        zzgns.zzv(obj, j, zzgkx2);
    }
}
