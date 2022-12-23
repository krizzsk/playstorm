package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzum implements zzva {
    public final /* synthetic */ zzuu zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzum(zzuu zzuu, String str) {
        this.zza = zzuu;
        this.zzb = str;
    }

    public final List zza(int i, zzck zzck, int[] iArr) {
        zzuu zzuu = this.zza;
        String str = this.zzb;
        int i2 = zzvf.zza;
        zzfre zzi = zzfrh.zzi();
        int i3 = 0;
        while (true) {
            int i4 = zzck.zzb;
            if (i3 > 0) {
                return zzi.zzg();
            }
            zzi.zze(new zzuz(i, zzck, i3, zzuu, iArr[i3], str));
            i3++;
        }
    }
}
