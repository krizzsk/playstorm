package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzekk implements zzeey {
    private final zzbit zza;
    private final zzfvk zzb;
    private final zzfge zzc;
    /* access modifiers changed from: private */
    public final zzekt zzd;

    public zzekk(zzfge zzfge, zzfvk zzfvk, zzbit zzbit, zzekt zzekt, byte[] bArr) {
        this.zzc = zzfge;
        this.zzb = zzfvk;
        this.zza = zzbit;
        this.zzd = zzekt;
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg) {
        zzcga zzcga = new zzcga();
        zzekp zzekp = new zzekp();
        zzekp.zzd(new zzekj(this, zzcga, zzfbs, zzfbg, zzekp));
        zzfbl zzfbl = zzfbg.zzt;
        zzbio zzbio = new zzbio(zzekp, zzfbl.zzb, zzfbl.zza);
        zzfge zzfge = this.zzc;
        return zzffo.zzd(new zzeki(this, zzbio), this.zzb, zzffy.CUSTOM_RENDER_SYN, zzfge).zzb(zzffy.CUSTOM_RENDER_ACK).zzd(zzcga).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzt;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzfbs r1, com.google.android.gms.internal.ads.zzfbg r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbit r1 = r0.zza
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.zzfbl r1 = r2.zzt
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekk.zzb(com.google.android.gms.internal.ads.zzfbs, com.google.android.gms.internal.ads.zzfbg):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbio zzbio) throws Exception {
        this.zza.zze(zzbio);
    }
}
