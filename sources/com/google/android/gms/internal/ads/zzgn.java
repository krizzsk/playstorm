package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgn {
    public final String zza;
    public final zzad zzb;
    public final zzad zzc;
    public final int zzd;
    public final int zze;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzgn(java.lang.String r3, com.google.android.gms.internal.ads.zzad r4, com.google.android.gms.internal.ads.zzad r5, int r6, int r7) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x000a
            if (r7 != 0) goto L_0x000b
            r7 = r0
        L_0x000a:
            r0 = r1
        L_0x000b:
            com.google.android.gms.internal.ads.zzcw.zzd(r0)
            com.google.android.gms.internal.ads.zzcw.zzc(r3)
            r2.zza = r3
            r3 = 0
            if (r4 == 0) goto L_0x0022
            r2.zzb = r4
            if (r5 == 0) goto L_0x0021
            r2.zzc = r5
            r2.zzd = r6
            r2.zze = r7
            return
        L_0x0021:
            throw r3
        L_0x0022:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgn.<init>(java.lang.String, com.google.android.gms.internal.ads.zzad, com.google.android.gms.internal.ads.zzad, int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzgn zzgn = (zzgn) obj;
            return this.zzd == zzgn.zzd && this.zze == zzgn.zze && this.zza.equals(zzgn.zza) && this.zzb.equals(zzgn.zzb) && this.zzc.equals(zzgn.zzc);
        }
    }

    public final int hashCode() {
        return ((((((((this.zzd + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
