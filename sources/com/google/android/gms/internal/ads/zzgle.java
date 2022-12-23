package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzgle {
    private static final zzgka zzb = zzgka.zza();
    protected volatile zzgly zza;
    private volatile zzgjg zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgle)) {
            return false;
        }
        zzgle zzgle = (zzgle) obj;
        zzgly zzgly = this.zza;
        zzgly zzgly2 = zzgle.zza;
        if (zzgly == null && zzgly2 == null) {
            return zzb().equals(zzgle.zzb());
        }
        if (zzgly != null && zzgly2 != null) {
            return zzgly.equals(zzgly2);
        }
        if (zzgly != null) {
            zzgle.zzc(zzgly.zzbh());
            return zzgly.equals(zzgle.zza);
        }
        zzc(zzgly2.zzbh());
        return this.zza.equals(zzgly2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgjc) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzav();
        }
        return 0;
    }

    public final zzgjg zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zzgjg zzgjg = this.zzc;
                return zzgjg;
            }
            if (this.zza == null) {
                this.zzc = zzgjg.zzb;
            } else {
                this.zzc = this.zza.zzaq();
            }
            zzgjg zzgjg2 = this.zzc;
            return zzgjg2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(com.google.android.gms.internal.ads.zzgly r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzgly r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzgly r0 = r1.zza     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.zza = r2     // Catch:{ zzgla -> 0x0011 }
            com.google.android.gms.internal.ads.zzgjg r0 = com.google.android.gms.internal.ads.zzgjg.zzb     // Catch:{ zzgla -> 0x0011 }
            r1.zzc = r0     // Catch:{ zzgla -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.zza = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzgjg r2 = com.google.android.gms.internal.ads.zzgjg.zzb     // Catch:{ all -> 0x001b }
            r1.zzc = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgle.zzc(com.google.android.gms.internal.ads.zzgly):void");
    }
}
