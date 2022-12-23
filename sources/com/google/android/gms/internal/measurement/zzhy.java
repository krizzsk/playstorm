package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
public abstract class zzhy {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    @Nullable
    private static volatile zzhw zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzia zzh = new zzia(zzhq.zza, (byte[]) null);
    private static final AtomicInteger zzi = new AtomicInteger();
    final zzhv zza;
    final String zzb;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private final boolean zzm;

    /* synthetic */ zzhy(zzhv zzhv, String str, Object obj, boolean z, zzhx zzhx) {
        if (zzhv.zzb != null) {
            this.zza = zzhv;
            this.zzb = str;
            this.zzj = obj;
            this.zzm = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(Context context) {
        if (zze == null) {
            synchronized (zzd) {
                if (zze == null) {
                    synchronized (zzd) {
                        zzhw zzhw = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzhw == null || zzhw.zza() != context) {
                            zzhe.zze();
                            zzhz.zzc();
                            zzhm.zze();
                            zze = new zzhb(context, zzij.zza(new zzhp(context)));
                            zzi.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Object zza(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r2 = r2.zzb(zzc());
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzb() {
        /*
            r6 = this;
            boolean r0 = r6.zzm
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = r6.zzb
            if (r0 == 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "flagName must not be null"
            r0.<init>(r1)
            throw r0
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = zzi
            int r0 = r0.get()
            int r1 = r6.zzk
            if (r1 >= r0) goto L_0x00de
            monitor-enter(r6)
            int r1 = r6.zzk     // Catch:{ all -> 0x00db }
            if (r1 >= r0) goto L_0x00d9
            com.google.android.gms.internal.measurement.zzhw r1 = zze     // Catch:{ all -> 0x00db }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00d3
            com.google.android.gms.internal.measurement.zzhv r2 = r6.zza     // Catch:{ all -> 0x00db }
            boolean r3 = r2.zzf     // Catch:{ all -> 0x00db }
            android.net.Uri r2 = r2.zzb     // Catch:{ all -> 0x00db }
            r3 = 0
            if (r2 == 0) goto L_0x0054
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x00db }
            com.google.android.gms.internal.measurement.zzhv r4 = r6.zza     // Catch:{ all -> 0x00db }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x00db }
            boolean r2 = com.google.android.gms.internal.measurement.zzhn.zza(r2, r4)     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x0052
            com.google.android.gms.internal.measurement.zzhv r2 = r6.zza     // Catch:{ all -> 0x00db }
            boolean r2 = r2.zzh     // Catch:{ all -> 0x00db }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x00db }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x00db }
            com.google.android.gms.internal.measurement.zzhv r4 = r6.zza     // Catch:{ all -> 0x00db }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x00db }
            com.google.android.gms.internal.measurement.zzhe r2 = com.google.android.gms.internal.measurement.zzhe.zza(r2, r4)     // Catch:{ all -> 0x00db }
            goto L_0x0060
        L_0x0052:
            r2 = r3
            goto L_0x0060
        L_0x0054:
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x00db }
            com.google.android.gms.internal.measurement.zzhv r4 = r6.zza     // Catch:{ all -> 0x00db }
            java.lang.String r4 = r4.zza     // Catch:{ all -> 0x00db }
            com.google.android.gms.internal.measurement.zzhz r2 = com.google.android.gms.internal.measurement.zzhz.zza(r2, r3)     // Catch:{ all -> 0x00db }
        L_0x0060:
            if (r2 == 0) goto L_0x0071
            java.lang.String r4 = r6.zzc()     // Catch:{ all -> 0x00db }
            java.lang.Object r2 = r2.zzb(r4)     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x0071
            java.lang.Object r2 = r6.zza(r2)     // Catch:{ all -> 0x00db }
            goto L_0x0072
        L_0x0071:
            r2 = r3
        L_0x0072:
            if (r2 == 0) goto L_0x0075
            goto L_0x00a1
        L_0x0075:
            com.google.android.gms.internal.measurement.zzhv r2 = r6.zza     // Catch:{ all -> 0x00db }
            boolean r4 = r2.zze     // Catch:{ all -> 0x00db }
            if (r4 != 0) goto L_0x009c
            com.google.android.gms.internal.measurement.zzic r2 = r2.zzi     // Catch:{ all -> 0x00db }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x00db }
            com.google.android.gms.internal.measurement.zzhm r2 = com.google.android.gms.internal.measurement.zzhm.zza(r2)     // Catch:{ all -> 0x00db }
            com.google.android.gms.internal.measurement.zzhv r4 = r6.zza     // Catch:{ all -> 0x00db }
            boolean r5 = r4.zze     // Catch:{ all -> 0x00db }
            if (r5 == 0) goto L_0x008d
            r4 = r3
            goto L_0x0091
        L_0x008d:
            java.lang.String r4 = r4.zzc     // Catch:{ all -> 0x00db }
            java.lang.String r4 = r6.zzb     // Catch:{ all -> 0x00db }
        L_0x0091:
            java.lang.String r2 = r2.zzb(r4)     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x009c
            java.lang.Object r2 = r6.zza(r2)     // Catch:{ all -> 0x00db }
            goto L_0x009d
        L_0x009c:
            r2 = r3
        L_0x009d:
            if (r2 != 0) goto L_0x00a1
            java.lang.Object r2 = r6.zzj     // Catch:{ all -> 0x00db }
        L_0x00a1:
            com.google.android.gms.internal.measurement.zzif r1 = r1.zzb()     // Catch:{ all -> 0x00db }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x00db }
            com.google.android.gms.internal.measurement.zzid r1 = (com.google.android.gms.internal.measurement.zzid) r1     // Catch:{ all -> 0x00db }
            boolean r4 = r1.zzb()     // Catch:{ all -> 0x00db }
            if (r4 == 0) goto L_0x00ce
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x00db }
            com.google.android.gms.internal.measurement.zzhg r1 = (com.google.android.gms.internal.measurement.zzhg) r1     // Catch:{ all -> 0x00db }
            com.google.android.gms.internal.measurement.zzhv r2 = r6.zza     // Catch:{ all -> 0x00db }
            android.net.Uri r4 = r2.zzb     // Catch:{ all -> 0x00db }
            java.lang.String r5 = r2.zza     // Catch:{ all -> 0x00db }
            java.lang.String r2 = r2.zzd     // Catch:{ all -> 0x00db }
            java.lang.String r5 = r6.zzb     // Catch:{ all -> 0x00db }
            java.lang.String r1 = r1.zza(r4, r3, r2, r5)     // Catch:{ all -> 0x00db }
            if (r1 != 0) goto L_0x00ca
            java.lang.Object r2 = r6.zzj     // Catch:{ all -> 0x00db }
            goto L_0x00ce
        L_0x00ca:
            java.lang.Object r2 = r6.zza(r1)     // Catch:{ all -> 0x00db }
        L_0x00ce:
            r6.zzl = r2     // Catch:{ all -> 0x00db }
            r6.zzk = r0     // Catch:{ all -> 0x00db }
            goto L_0x00d9
        L_0x00d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00db }
            r0.<init>(r2)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00d9:
            monitor-exit(r6)     // Catch:{ all -> 0x00db }
            goto L_0x00de
        L_0x00db:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00db }
            throw r0
        L_0x00de:
            java.lang.Object r0 = r6.zzl
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhy.zzb():java.lang.Object");
    }

    public final String zzc() {
        String str = this.zza.zzd;
        return this.zzb;
    }
}
