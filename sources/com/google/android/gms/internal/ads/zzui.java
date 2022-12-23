package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzui implements zzva {
    public final /* synthetic */ zzuu zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzui(zzuu zzuu, boolean z) {
        this.zza = zzuu;
        this.zzb = z;
    }

    public final List zza(int i, zzck zzck, int[] iArr) {
        zzuu zzuu = this.zza;
        boolean z = this.zzb;
        int i2 = zzvf.zza;
        zzfre zzi = zzfrh.zzi();
        int i3 = 0;
        while (true) {
            int i4 = zzck.zzb;
            if (i3 > 0) {
                return zzi.zzg();
            }
            zzi.zze(new zzuq(i, zzck, i3, zzuu, iArr[i3], z));
            i3++;
        }
    }
}
