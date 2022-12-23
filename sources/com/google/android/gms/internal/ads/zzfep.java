package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfep {
    private final zzfei zza;
    private final zzfvj zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfep(zzfdn zzfdn, zzfeh zzfeh, zzfei zzfei) {
        this.zza = zzfei;
        this.zzb = zzfva.zzg(zzfva.zzn(zzfeh.zza(zzfei), new zzfen(this, zzfeh, zzfdn, zzfei), zzfei.zzb()), Exception.class, new zzfeo(this, zzfeh), zzfei.zzb());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzfvj zza(com.google.android.gms.internal.ads.zzfei r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzd     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2.zzc     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0033
        L_0x000b:
            com.google.android.gms.internal.ads.zzfei r0 = r2.zza     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfdx r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzfdx r0 = r3.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzfei r0 = r2.zza     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfdx r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfdx r3 = r3.zza()     // Catch:{ all -> 0x0035 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0035 }
            if (r3 != 0) goto L_0x002a
            goto L_0x0031
        L_0x002a:
            r3 = 1
            r2.zzc = r3     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfvj r3 = r2.zzb     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            return r3
        L_0x0031:
            monitor-exit(r2)
            return r1
        L_0x0033:
            monitor-exit(r2)
            return r1
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfep.zza(com.google.android.gms.internal.ads.zzfei):com.google.android.gms.internal.ads.zzfvj");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzb(zzfeh zzfeh, zzfdn zzfdn, zzfei zzfei, zzfdw zzfdw) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfeh.zzb(zzfdw);
            if (!this.zzc) {
                zzfdn.zzd(zzfei.zza(), zzfdw);
                zzfvj zzi = zzfva.zzi((Object) null);
                return zzi;
            }
            zzfvj zzi2 = zzfva.zzi(new zzfeg(zzfdw, zzfei));
            return zzi2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(zzfeh zzfeh, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzfuw zzfuw) {
        zzfva.zzr(zzfva.zzn(this.zzb, zzfem.zza, this.zza.zzb()), zzfuw, this.zza.zzb());
    }
}
