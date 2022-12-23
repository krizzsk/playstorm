package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzadu extends zzadw {
    public final long zza;
    public final List zzb = new ArrayList();
    public final List zzc = new ArrayList();

    public zzadu(int i, long j) {
        super(i);
        this.zza = j;
    }

    public final String toString() {
        String zzf = zzf(this.zzd);
        String arrays = Arrays.toString(this.zzb.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        return zzf + " leaves: " + arrays + " containers: " + arrays2;
    }

    public final zzadu zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzadu zzadu = (zzadu) this.zzc.get(i2);
            if (zzadu.zzd == i) {
                return zzadu;
            }
        }
        return null;
    }

    public final zzadv zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzadv zzadv = (zzadv) this.zzb.get(i2);
            if (zzadv.zzd == i) {
                return zzadv;
            }
        }
        return null;
    }

    public final void zzc(zzadu zzadu) {
        this.zzc.add(zzadu);
    }

    public final void zzd(zzadv zzadv) {
        this.zzb.add(zzadv);
    }
}
