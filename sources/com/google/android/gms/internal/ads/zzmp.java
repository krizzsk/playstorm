package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzmp implements zzmt {
    public static final zzfph zza = zzmn.zza;
    private static final Random zzb = new Random();
    /* access modifiers changed from: private */
    public final zzch zzc;
    /* access modifiers changed from: private */
    public final zzcf zzd;
    private final HashMap zze;
    private final zzfph zzf;
    private zzms zzg;
    private zzci zzh;
    private String zzi;

    public zzmp() {
        throw null;
    }

    private final zzmo zzk(int i, zzsb zzsb) {
        int i2;
        zzmo zzmo = null;
        long j = Long.MAX_VALUE;
        for (zzmo zzmo2 : this.zze.values()) {
            zzmo2.zzg(i, zzsb);
            if (zzmo2.zzj(i, zzsb)) {
                long zzb2 = zzmo2.zzd;
                if (zzb2 == -1 || zzb2 < j) {
                    zzmo = zzmo2;
                    j = zzb2;
                } else if (i2 == 0) {
                    int i3 = zzeg.zza;
                    if (!(zzmo.zze == null || zzmo2.zze == null)) {
                        zzmo = zzmo2;
                    }
                }
            }
        }
        if (zzmo != null) {
            return zzmo;
        }
        String zzl = zzl();
        zzmo zzmo3 = new zzmo(this, zzl, i, zzsb);
        this.zze.put(zzl, zzmo3);
        return zzmo3;
    }

    /* access modifiers changed from: private */
    public static String zzl() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @RequiresNonNull({"listener"})
    private final void zzm(zzkj zzkj) {
        if (zzkj.zzb.zzo()) {
            this.zzi = null;
            return;
        }
        zzmo zzmo = (zzmo) this.zze.get(this.zzi);
        zzmo zzk = zzk(zzkj.zzc, zzkj.zzd);
        this.zzi = zzk.zzb;
        zzh(zzkj);
        zzsb zzsb = zzkj.zzd;
        if (zzsb != null && zzsb.zzb()) {
            if (zzmo == null || zzmo.zzd != zzkj.zzd.zzd || zzmo.zze == null || zzmo.zze.zzb != zzkj.zzd.zzb || zzmo.zze.zzc != zzkj.zzd.zzc) {
                zzsb zzsb2 = zzkj.zzd;
                String unused = zzk(zzkj.zzc, new zzsb(zzsb2.zza, zzsb2.zzd)).zzb;
                String unused2 = zzk.zzb;
            }
        }
    }

    public final synchronized String zzd() {
        return this.zzi;
    }

    public final synchronized String zze(zzci zzci, zzsb zzsb) {
        return zzk(zzci.zzn(zzsb.zza, this.zzd).zzd, zzsb).zzb;
    }

    public final synchronized void zzf(zzkj zzkj) {
        zzms zzms;
        this.zzi = null;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmo zzmo = (zzmo) it.next();
            it.remove();
            if (zzmo.zzf && (zzms = this.zzg) != null) {
                zzms.zzd(zzkj, zzmo.zzb, false);
            }
        }
    }

    public final void zzg(zzms zzms) {
        this.zzg = zzms;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r10.zzd.zzd < r0.zzd) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzh(com.google.android.gms.internal.ads.zzkj r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzms r0 = r9.zzg     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00ca
            com.google.android.gms.internal.ads.zzci r0 = r10.zzb     // Catch:{ all -> 0x00cc }
            boolean r0 = r0.zzo()     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r9)
            return
        L_0x000f:
            java.util.HashMap r0 = r9.zze     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = r9.zzi     // Catch:{ all -> 0x00cc }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzmo r0 = (com.google.android.gms.internal.ads.zzmo) r0     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzsb r1 = r10.zzd     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x0040
            if (r0 == 0) goto L_0x0040
            long r1 = r0.zzd     // Catch:{ all -> 0x00cc }
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0032
            int r0 = r0.zzc     // Catch:{ all -> 0x00cc }
            int r1 = r10.zzc     // Catch:{ all -> 0x00cc }
            if (r0 != r1) goto L_0x003e
            goto L_0x0040
        L_0x0032:
            com.google.android.gms.internal.ads.zzsb r1 = r10.zzd     // Catch:{ all -> 0x00cc }
            long r1 = r1.zzd     // Catch:{ all -> 0x00cc }
            long r3 = r0.zzd     // Catch:{ all -> 0x00cc }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
        L_0x003e:
            monitor-exit(r9)
            return
        L_0x0040:
            int r0 = r10.zzc     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzsb r1 = r10.zzd     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzmo r0 = r9.zzk(r0, r1)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = r9.zzi     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x0052
            java.lang.String r1 = r0.zzb     // Catch:{ all -> 0x00cc }
            r9.zzi = r1     // Catch:{ all -> 0x00cc }
        L_0x0052:
            com.google.android.gms.internal.ads.zzsb r1 = r10.zzd     // Catch:{ all -> 0x00cc }
            r2 = 1
            if (r1 == 0) goto L_0x009c
            boolean r3 = r1.zzb()     // Catch:{ all -> 0x00cc }
            if (r3 == 0) goto L_0x009c
            com.google.android.gms.internal.ads.zzsb r3 = new com.google.android.gms.internal.ads.zzsb     // Catch:{ all -> 0x00cc }
            java.lang.Object r4 = r1.zza     // Catch:{ all -> 0x00cc }
            long r5 = r1.zzd     // Catch:{ all -> 0x00cc }
            int r1 = r1.zzb     // Catch:{ all -> 0x00cc }
            r3.<init>(r4, r5, r1)     // Catch:{ all -> 0x00cc }
            int r1 = r10.zzc     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzmo r1 = r9.zzk(r1, r3)     // Catch:{ all -> 0x00cc }
            boolean r3 = r1.zzf     // Catch:{ all -> 0x00cc }
            if (r3 != 0) goto L_0x009c
            r1.zzf = true     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzci r3 = r10.zzb     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzsb r4 = r10.zzd     // Catch:{ all -> 0x00cc }
            java.lang.Object r4 = r4.zza     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzcf r5 = r9.zzd     // Catch:{ all -> 0x00cc }
            r3.zzn(r4, r5)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzcf r3 = r9.zzd     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzsb r4 = r10.zzd     // Catch:{ all -> 0x00cc }
            int r4 = r4.zzb     // Catch:{ all -> 0x00cc }
            r3.zzh(r4)     // Catch:{ all -> 0x00cc }
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzeg.zzz(r3)     // Catch:{ all -> 0x00cc }
            long r7 = com.google.android.gms.internal.ads.zzeg.zzz(r3)     // Catch:{ all -> 0x00cc }
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x00cc }
            java.lang.String unused = r1.zzb     // Catch:{ all -> 0x00cc }
        L_0x009c:
            boolean r1 = r0.zzf     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x00a8
            r0.zzf = true     // Catch:{ all -> 0x00cc }
            java.lang.String unused = r0.zzb     // Catch:{ all -> 0x00cc }
        L_0x00a8:
            java.lang.String r1 = r0.zzb     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = r9.zzi     // Catch:{ all -> 0x00cc }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r0.zzg     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x00c8
            r0.zzg = true     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzms r1 = r9.zzg     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = r0.zzb     // Catch:{ all -> 0x00cc }
            r1.zzc(r10, r0)     // Catch:{ all -> 0x00cc }
            monitor-exit(r9)
            return
        L_0x00c8:
            monitor-exit(r9)
            return
        L_0x00ca:
            r10 = 0
            throw r10     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmp.zzh(com.google.android.gms.internal.ads.zzkj):void");
    }

    public final synchronized void zzi(zzkj zzkj, int i) {
        if (this.zzg != null) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzmo zzmo = (zzmo) it.next();
                if (zzmo.zzk(zzkj)) {
                    it.remove();
                    if (zzmo.zzf) {
                        boolean equals = zzmo.zzb.equals(this.zzi);
                        boolean z = false;
                        if (i == 0 && equals && zzmo.zzg) {
                            z = true;
                        }
                        if (equals) {
                            this.zzi = null;
                        }
                        this.zzg.zzd(zzkj, zzmo.zzb, z);
                    }
                }
            }
            zzm(zzkj);
        } else {
            throw null;
        }
    }

    public final synchronized void zzj(zzkj zzkj) {
        if (this.zzg != null) {
            zzci zzci = this.zzh;
            this.zzh = zzkj.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzmo zzmo = (zzmo) it.next();
                if (!zzmo.zzl(zzci, this.zzh) || zzmo.zzk(zzkj)) {
                    it.remove();
                    if (zzmo.zzf) {
                        if (zzmo.zzb.equals(this.zzi)) {
                            this.zzi = null;
                        }
                        this.zzg.zzd(zzkj, zzmo.zzb, false);
                    }
                }
            }
            zzm(zzkj);
        } else {
            throw null;
        }
    }

    public zzmp(zzfph zzfph) {
        this.zzf = zzfph;
        this.zzc = new zzch();
        this.zzd = new zzcf();
        this.zze = new HashMap();
        this.zzh = zzci.zza;
    }
}
