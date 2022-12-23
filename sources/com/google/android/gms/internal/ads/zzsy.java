package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzsy implements zzwg, zzrq {
    final /* synthetic */ zztd zza;
    /* access modifiers changed from: private */
    public final long zzb = zzrs.zza();
    private final Uri zzc;
    /* access modifiers changed from: private */
    public final zzfs zzd;
    private final zzsu zze;
    private final zzyv zzf;
    private final zzcz zzg;
    private final zzzs zzh = new zzzs();
    private volatile boolean zzi;
    private boolean zzj = true;
    /* access modifiers changed from: private */
    public long zzk;
    /* access modifiers changed from: private */
    public zzew zzl = zzj(0);
    /* access modifiers changed from: private */
    public long zzm = -1;
    private zzzz zzn;
    private boolean zzo;

    public zzsy(zztd zztd, Uri uri, zzer zzer, zzsu zzsu, zzyv zzyv, zzcz zzcz) {
        this.zza = zztd;
        this.zzc = uri;
        this.zzd = new zzfs(zzer);
        this.zze = zzsu;
        this.zzf = zzyv;
        this.zzg = zzcz;
    }

    static /* bridge */ /* synthetic */ void zzg(zzsy zzsy, long j, long j2) {
        zzsy.zzh.zza = j;
        zzsy.zzk = j2;
        zzsy.zzj = true;
        zzsy.zzo = false;
    }

    private final zzew zzj(long j) {
        zzeu zzeu = new zzeu();
        zzeu.zzd(this.zzc);
        zzeu.zzc(j);
        zzeu.zza(6);
        zzeu.zzb(zztd.zzb);
        return zzeu.zze();
    }

    public final void zzh() {
        this.zzi = true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:58|59) */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        android.util.Log.w("IcyHeaders", "Invalid metadata interval: ".concat(java.lang.String.valueOf(r7)));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0104 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01fe A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c1 A[EDGE_INSN: B:110:0x01c1->B:92:0x01c1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ad A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b7 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c3 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d3 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00df A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0110 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0114 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012f A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014a A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016a A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0173 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0180 A[SYNTHETIC, Splitter:B:77:0x0180] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi() throws java.io.IOException {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "Invalid metadata interval: "
        L_0x0004:
            boolean r2 = r1.zzi
            if (r2 != 0) goto L_0x01fe
            r2 = -1
            r4 = 1
            r5 = 0
            com.google.android.gms.internal.ads.zzzs r6 = r1.zzh     // Catch:{ all -> 0x01e1 }
            long r13 = r6.zza     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzew r6 = r1.zzj(r13)     // Catch:{ all -> 0x01e1 }
            r1.zzl = r6     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzfs r7 = r1.zzd     // Catch:{ all -> 0x01e1 }
            long r6 = r7.zzb(r6)     // Catch:{ all -> 0x01e1 }
            r1.zzm = r6     // Catch:{ all -> 0x01e1 }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0025
            long r6 = r6 + r13
            r1.zzm = r6     // Catch:{ all -> 0x01e1 }
        L_0x0025:
            com.google.android.gms.internal.ads.zztd r6 = r1.zza     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzfs r7 = r1.zzd     // Catch:{ all -> 0x01e1 }
            java.util.Map r7 = r7.zze()     // Catch:{ all -> 0x01e1 }
            java.lang.String r8 = "icy-br"
            java.lang.Object r8 = r7.get(r8)     // Catch:{ all -> 0x01e1 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x01e1 }
            java.lang.String r9 = "IcyHeaders"
            r10 = -1
            if (r8 == 0) goto L_0x0073
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x01e1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01e1 }
            int r11 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0063 }
            int r11 = r11 * 1000
            if (r11 <= 0) goto L_0x004a
            r8 = r4
            goto L_0x0060
        L_0x004a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0064 }
            r12.<init>()     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.String r15 = "Invalid bitrate: "
            r12.append(r15)     // Catch:{ NumberFormatException -> 0x0064 }
            r12.append(r8)     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.String r12 = r12.toString()     // Catch:{ NumberFormatException -> 0x0064 }
            android.util.Log.w(r9, r12)     // Catch:{ NumberFormatException -> 0x0064 }
            r8 = r5
            r11 = r10
        L_0x0060:
            r16 = r11
            goto L_0x0076
        L_0x0063:
            r11 = r10
        L_0x0064:
            java.lang.String r12 = "Invalid bitrate header: "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x01e1 }
            java.lang.String r8 = r12.concat(r8)     // Catch:{ all -> 0x01e1 }
            android.util.Log.w(r9, r8)     // Catch:{ all -> 0x01e1 }
            r8 = r5
            goto L_0x0060
        L_0x0073:
            r8 = r5
            r16 = r10
        L_0x0076:
            java.lang.String r11 = "icy-genre"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x01e1 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x01e1 }
            r12 = 0
            if (r11 == 0) goto L_0x008b
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x01e1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01e1 }
            r17 = r8
            r8 = r4
            goto L_0x008d
        L_0x008b:
            r17 = r12
        L_0x008d:
            java.lang.String r11 = "icy-name"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x01e1 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x01e1 }
            if (r11 == 0) goto L_0x00a1
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x01e1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01e1 }
            r18 = r8
            r8 = r4
            goto L_0x00a3
        L_0x00a1:
            r18 = r12
        L_0x00a3:
            java.lang.String r11 = "icy-url"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x01e1 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x01e1 }
            if (r11 == 0) goto L_0x00b7
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x01e1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01e1 }
            r19 = r8
            r8 = r4
            goto L_0x00b9
        L_0x00b7:
            r19 = r12
        L_0x00b9:
            java.lang.String r11 = "icy-pub"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x01e1 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x01e1 }
            if (r11 == 0) goto L_0x00d3
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x01e1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01e1 }
            java.lang.String r11 = "1"
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x01e1 }
            r20 = r8
            r8 = r4
            goto L_0x00d5
        L_0x00d3:
            r20 = r5
        L_0x00d5:
            java.lang.String r11 = "icy-metaint"
            java.lang.Object r7 = r7.get(r11)     // Catch:{ all -> 0x01e1 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x01e1 }
            if (r7 == 0) goto L_0x0110
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01e1 }
            int r11 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0103 }
            if (r11 <= 0) goto L_0x00ed
            r8 = r4
            goto L_0x0100
        L_0x00ed:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0104 }
            r15.<init>()     // Catch:{ NumberFormatException -> 0x0104 }
            r15.append(r0)     // Catch:{ NumberFormatException -> 0x0104 }
            r15.append(r7)     // Catch:{ NumberFormatException -> 0x0104 }
            java.lang.String r15 = r15.toString()     // Catch:{ NumberFormatException -> 0x0104 }
            android.util.Log.w(r9, r15)     // Catch:{ NumberFormatException -> 0x0104 }
            r11 = r10
        L_0x0100:
            r21 = r11
            goto L_0x0112
        L_0x0103:
            r11 = r10
        L_0x0104:
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = r0.concat(r7)     // Catch:{ all -> 0x01e1 }
            android.util.Log.w(r9, r7)     // Catch:{ all -> 0x01e1 }
            goto L_0x0100
        L_0x0110:
            r21 = r10
        L_0x0112:
            if (r8 == 0) goto L_0x011a
            com.google.android.gms.internal.ads.zzabl r12 = new com.google.android.gms.internal.ads.zzabl     // Catch:{ all -> 0x01e1 }
            r15 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01e1 }
        L_0x011a:
            r6.zzr = r12     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzfs r6 = r1.zzd     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zztd r7 = r1.zza     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzabl r8 = r7.zzr     // Catch:{ all -> 0x01e1 }
            if (r8 == 0) goto L_0x014a
            com.google.android.gms.internal.ads.zzabl r8 = r7.zzr     // Catch:{ all -> 0x01e1 }
            int r8 = r8.zzf     // Catch:{ all -> 0x01e1 }
            if (r8 == r10) goto L_0x014a
            com.google.android.gms.internal.ads.zzrr r8 = new com.google.android.gms.internal.ads.zzrr     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzabl r7 = r7.zzr     // Catch:{ all -> 0x01e1 }
            int r7 = r7.zzf     // Catch:{ all -> 0x01e1 }
            r8.<init>(r6, r7, r1)     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zztd r6 = r1.zza     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzzz r6 = r6.zzu()     // Catch:{ all -> 0x01e1 }
            r1.zzn = r6     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzad r7 = com.google.android.gms.internal.ads.zztd.zzc     // Catch:{ all -> 0x01e1 }
            r6.zzk(r7)     // Catch:{ all -> 0x01e1 }
            goto L_0x014b
        L_0x014a:
            r8 = r6
        L_0x014b:
            com.google.android.gms.internal.ads.zzsu r7 = r1.zze     // Catch:{ all -> 0x01e1 }
            android.net.Uri r9 = r1.zzc     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzfs r6 = r1.zzd     // Catch:{ all -> 0x01e1 }
            java.util.Map r10 = r6.zze()     // Catch:{ all -> 0x01e1 }
            long r11 = r1.zzm     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzyv r15 = r1.zzf     // Catch:{ all -> 0x01e1 }
            r16 = r11
            r11 = r13
            r2 = r13
            r13 = r16
            r7.zzd(r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zztd r6 = r1.zza     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzabl r6 = r6.zzr     // Catch:{ all -> 0x01e1 }
            if (r6 == 0) goto L_0x016f
            com.google.android.gms.internal.ads.zzsu r6 = r1.zze     // Catch:{ all -> 0x01e1 }
            r6.zzc()     // Catch:{ all -> 0x01e1 }
        L_0x016f:
            boolean r6 = r1.zzj     // Catch:{ all -> 0x01e1 }
            if (r6 == 0) goto L_0x017c
            com.google.android.gms.internal.ads.zzsu r6 = r1.zze     // Catch:{ all -> 0x01e1 }
            long r7 = r1.zzk     // Catch:{ all -> 0x01e1 }
            r6.zzf(r2, r7)     // Catch:{ all -> 0x01e1 }
            r1.zzj = r5     // Catch:{ all -> 0x01e1 }
        L_0x017c:
            r13 = r2
            r2 = r5
        L_0x017e:
            if (r2 != 0) goto L_0x01c1
            boolean r3 = r1.zzi     // Catch:{ all -> 0x01be }
            if (r3 != 0) goto L_0x01bc
            com.google.android.gms.internal.ads.zzcz r3 = r1.zzg     // Catch:{ InterruptedException -> 0x01b6 }
            r3.zza()     // Catch:{ InterruptedException -> 0x01b6 }
            com.google.android.gms.internal.ads.zzsu r3 = r1.zze     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.ads.zzzs r6 = r1.zzh     // Catch:{ all -> 0x01be }
            int r2 = r3.zza(r6)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.ads.zzsu r3 = r1.zze     // Catch:{ all -> 0x01be }
            long r6 = r3.zzb()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.ads.zztd r3 = r1.zza     // Catch:{ all -> 0x01be }
            long r8 = r3.zzj     // Catch:{ all -> 0x01be }
            long r8 = r8 + r13
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x017e
            com.google.android.gms.internal.ads.zzcz r3 = r1.zzg     // Catch:{ all -> 0x01be }
            r3.zzc()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.ads.zztd r3 = r1.zza     // Catch:{ all -> 0x01be }
            android.os.Handler r8 = r3.zzp     // Catch:{ all -> 0x01be }
            java.lang.Runnable r3 = r3.zzo     // Catch:{ all -> 0x01be }
            r8.post(r3)     // Catch:{ all -> 0x01be }
            r13 = r6
            goto L_0x017e
        L_0x01b6:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x01be }
            r0.<init>()     // Catch:{ all -> 0x01be }
            throw r0     // Catch:{ all -> 0x01be }
        L_0x01bc:
            r2 = r5
            goto L_0x01c1
        L_0x01be:
            r0 = move-exception
            r5 = r2
            goto L_0x01e2
        L_0x01c1:
            if (r2 != r4) goto L_0x01c4
            goto L_0x01d9
        L_0x01c4:
            com.google.android.gms.internal.ads.zzsu r3 = r1.zze
            long r4 = r3.zzb()
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01d8
            com.google.android.gms.internal.ads.zzzs r4 = r1.zzh
            long r5 = r3.zzb()
            r4.zza = r5
        L_0x01d8:
            r5 = r2
        L_0x01d9:
            com.google.android.gms.internal.ads.zzfs r2 = r1.zzd
            com.google.android.gms.internal.ads.zzet.zza(r2)
            if (r5 == 0) goto L_0x0004
            goto L_0x01fe
        L_0x01e1:
            r0 = move-exception
        L_0x01e2:
            if (r5 == r4) goto L_0x01f8
            com.google.android.gms.internal.ads.zzsu r2 = r1.zze
            long r3 = r2.zzb()
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x01f8
            com.google.android.gms.internal.ads.zzzs r3 = r1.zzh
            long r4 = r2.zzb()
            r3.zza = r4
        L_0x01f8:
            com.google.android.gms.internal.ads.zzfs r2 = r1.zzd
            com.google.android.gms.internal.ads.zzet.zza(r2)
            throw r0
        L_0x01fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsy.zzi():void");
    }

    public final void zza(zzdy zzdy) {
        long j;
        if (!this.zzo) {
            j = this.zzk;
        } else {
            j = Math.max(this.zza.zzO(), this.zzk);
        }
        long j2 = j;
        int zza2 = zzdy.zza();
        zzzz zzzz = this.zzn;
        if (zzzz != null) {
            zzzx.zzb(zzzz, zzdy, zza2);
            zzzz.zzs(j2, 1, zza2, 0, (zzzy) null);
            this.zzo = true;
            return;
        }
        throw null;
    }
}
