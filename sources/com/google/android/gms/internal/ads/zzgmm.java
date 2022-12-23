package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgmm {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgmm() {
    }

    static /* bridge */ /* synthetic */ zzgjg zza(zzgmm zzgmm, zzgjg zzgjg, zzgjg zzgjg2) {
        zzgmm.zzb(zzgjg);
        zzgmm.zzb(zzgjg2);
        zzgjg zzgjg3 = (zzgjg) zzgmm.zza.pop();
        while (!zzgmm.zza.isEmpty()) {
            zzgjg3 = new zzgmq((zzgjg) zzgmm.zza.pop(), zzgjg3);
        }
        return zzgjg3;
    }

    private final void zzb(zzgjg zzgjg) {
        if (zzgjg.zzh()) {
            int zzc = zzc(zzgjg.zzd());
            int zzc2 = zzgmq.zzc(zzc + 1);
            if (this.zza.isEmpty() || ((zzgjg) this.zza.peek()).zzd() >= zzc2) {
                this.zza.push(zzgjg);
                return;
            }
            int zzc3 = zzgmq.zzc(zzc);
            zzgjg zzgjg2 = (zzgjg) this.zza.pop();
            while (!this.zza.isEmpty() && ((zzgjg) this.zza.peek()).zzd() < zzc3) {
                zzgjg2 = new zzgmq((zzgjg) this.zza.pop(), zzgjg2);
            }
            zzgmq zzgmq = new zzgmq(zzgjg2, zzgjg);
            while (!this.zza.isEmpty() && ((zzgjg) this.zza.peek()).zzd() < zzgmq.zzc(zzc(zzgmq.zzd()) + 1)) {
                zzgmq = new zzgmq((zzgjg) this.zza.pop(), zzgmq);
            }
            this.zza.push(zzgmq);
        } else if (zzgjg instanceof zzgmq) {
            zzgmq zzgmq2 = (zzgmq) zzgjg;
            zzb(zzgmq2.zzd);
            zzb(zzgmq2.zze);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgjg.getClass()))));
        }
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzgmq.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzgmm(zzgml zzgml) {
    }
}
