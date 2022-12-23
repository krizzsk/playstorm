package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzauq extends zzaus {
    public final long zza;
    public final List zzb = new ArrayList();
    public final List zzc = new ArrayList();

    public zzauq(int i, long j) {
        super(i);
        this.zza = j;
    }

    public final String toString() {
        String zzg = zzg(this.zzaR);
        String arrays = Arrays.toString(this.zzb.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        return zzg + " leaves: " + arrays + " containers: " + arrays2;
    }

    public final zzauq zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzauq zzauq = (zzauq) this.zzc.get(i2);
            if (zzauq.zzaR == i) {
                return zzauq;
            }
        }
        return null;
    }

    public final zzaur zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaur zzaur = (zzaur) this.zzb.get(i2);
            if (zzaur.zzaR == i) {
                return zzaur;
            }
        }
        return null;
    }

    public final void zzc(zzauq zzauq) {
        this.zzc.add(zzauq);
    }

    public final void zzd(zzaur zzaur) {
        this.zzb.add(zzaur);
    }
}
