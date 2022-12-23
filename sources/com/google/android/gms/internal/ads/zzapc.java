package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzapc {
    private static final String zzd = zzapc.class.getSimpleName();
    protected final Context zza;
    protected boolean zzb;
    protected boolean zzc;
    private ExecutorService zze;
    private DexClassLoader zzf;
    private zzaoi zzg;
    private byte[] zzh;
    private volatile AdvertisingIdClient zzi = null;
    private volatile boolean zzj;
    private Future zzk;
    private final boolean zzl;
    /* access modifiers changed from: private */
    public volatile zzaly zzm;
    private Future zzn;
    private zzanx zzo;
    private final Map zzp;
    private boolean zzq;
    private zzaov zzr;

    private zzapc(Context context) {
        boolean z = false;
        this.zzj = false;
        this.zzk = null;
        this.zzm = null;
        this.zzn = null;
        this.zzb = false;
        this.zzc = false;
        this.zzq = false;
        Context applicationContext = context.getApplicationContext();
        this.zzl = applicationContext != null ? true : z;
        this.zza = applicationContext != null ? applicationContext : context;
        this.zzp = new HashMap();
        if (this.zzr == null) {
            this.zzr = new zzaov(this.zza);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|(3:27|28|(17:30|(2:32|33)|34|35|36|37|(2:39|(1:41)(2:42|43))|44|(1:46)|47|48|49|50|51|52|53|82)(3:71|72|73))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ zzaot -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086 A[Catch:{ IllegalArgumentException -> 0x0157, zzaoh -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0151 A[SYNTHETIC, Splitter:B:71:0x0151] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzapc zzg(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r11 = "1644353911296"
            com.google.android.gms.internal.ads.zzapc r0 = new com.google.android.gms.internal.ads.zzapc
            r0.<init>(r9)
            com.google.android.gms.internal.ads.zzaoy r9 = new com.google.android.gms.internal.ads.zzaoy     // Catch:{ zzaot -> 0x0165 }
            r9.<init>()     // Catch:{ zzaot -> 0x0165 }
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newCachedThreadPool(r9)     // Catch:{ zzaot -> 0x0165 }
            r0.zze = r9     // Catch:{ zzaot -> 0x0165 }
            r0.zzj = r12     // Catch:{ zzaot -> 0x0165 }
            if (r12 == 0) goto L_0x0025
            java.util.concurrent.ExecutorService r9 = r0.zze     // Catch:{ zzaot -> 0x0165 }
            com.google.android.gms.internal.ads.zzaoz r12 = new com.google.android.gms.internal.ads.zzaoz     // Catch:{ zzaot -> 0x0165 }
            r12.<init>(r0)     // Catch:{ zzaot -> 0x0165 }
            java.util.concurrent.Future r9 = r9.submit(r12)     // Catch:{ zzaot -> 0x0165 }
            r0.zzk = r9     // Catch:{ zzaot -> 0x0165 }
        L_0x0025:
            java.util.concurrent.ExecutorService r9 = r0.zze     // Catch:{ zzaot -> 0x0165 }
            com.google.android.gms.internal.ads.zzapb r12 = new com.google.android.gms.internal.ads.zzapb     // Catch:{ zzaot -> 0x0165 }
            r12.<init>(r0)     // Catch:{ zzaot -> 0x0165 }
            r9.execute(r12)     // Catch:{ zzaot -> 0x0165 }
            r9 = 1
            r12 = 0
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()     // Catch:{ all -> 0x004f }
            android.content.Context r2 = r0.zza     // Catch:{ all -> 0x004f }
            int r2 = r1.getApkVersion(r2)     // Catch:{ all -> 0x004f }
            if (r2 <= 0) goto L_0x003f
            r2 = r9
            goto L_0x0040
        L_0x003f:
            r2 = r12
        L_0x0040:
            r0.zzb = r2     // Catch:{ all -> 0x004f }
            android.content.Context r2 = r0.zza     // Catch:{ all -> 0x004f }
            int r1 = r1.isGooglePlayServicesAvailable(r2)     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x004c
            r1 = r9
            goto L_0x004d
        L_0x004c:
            r1 = r12
        L_0x004d:
            r0.zzc = r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0.zzo(r12, r9)     // Catch:{ zzaot -> 0x0165 }
            boolean r1 = com.google.android.gms.internal.ads.zzapf.zzf()     // Catch:{ zzaot -> 0x0165 }
            if (r1 == 0) goto L_0x0073
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzcu     // Catch:{ zzaot -> 0x0165 }
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ zzaot -> 0x0165 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ zzaot -> 0x0165 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ zzaot -> 0x0165 }
            boolean r1 = r1.booleanValue()     // Catch:{ zzaot -> 0x0165 }
            if (r1 != 0) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ zzaot -> 0x0165 }
            java.lang.String r10 = "Task Context initialization must not be called from the UI thread."
            r9.<init>(r10)     // Catch:{ zzaot -> 0x0165 }
            throw r9     // Catch:{ zzaot -> 0x0165 }
        L_0x0073:
            com.google.android.gms.internal.ads.zzaoi r1 = new com.google.android.gms.internal.ads.zzaoi     // Catch:{ zzaot -> 0x0165 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ zzaot -> 0x0165 }
            r0.zzg = r1     // Catch:{ zzaot -> 0x0165 }
            java.lang.String r3 = "RP5LQuE/2876zTvAb2rVm25QfjxwoRyidjQTLjf0RRc="
            byte[] r3 = com.google.android.gms.internal.ads.zzamn.zzb(r3, r12)     // Catch:{ IllegalArgumentException -> 0x0157 }
            int r4 = r3.length     // Catch:{ IllegalArgumentException -> 0x0157 }
            r5 = 32
            if (r4 != r5) goto L_0x0151
            r4 = 4
            r5 = 16
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3, r4, r5)     // Catch:{ IllegalArgumentException -> 0x0157 }
            byte[] r4 = new byte[r5]     // Catch:{ IllegalArgumentException -> 0x0157 }
            r3.get(r4)     // Catch:{ IllegalArgumentException -> 0x0157 }
            r3 = r12
        L_0x0093:
            if (r3 >= r5) goto L_0x009f
            byte r6 = r4[r3]     // Catch:{ IllegalArgumentException -> 0x0157 }
            r6 = r6 ^ 68
            byte r6 = (byte) r6     // Catch:{ IllegalArgumentException -> 0x0157 }
            r4[r3] = r6     // Catch:{ IllegalArgumentException -> 0x0157 }
            int r3 = r3 + 1
            goto L_0x0093
        L_0x009f:
            r0.zzh = r4     // Catch:{ zzaoh -> 0x015e }
            android.content.Context r1 = r0.zza     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            if (r1 != 0) goto L_0x00ba
            android.content.Context r1 = r0.zza     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.String r3 = "dex"
            java.io.File r1 = r1.getDir(r3, r12)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            if (r1 == 0) goto L_0x00b4
            goto L_0x00ba
        L_0x00b4:
            com.google.android.gms.internal.ads.zzaot r9 = new com.google.android.gms.internal.ads.zzaot     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            throw r9     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
        L_0x00ba:
            java.lang.String r3 = "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"
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r6[r12] = r1     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r6[r9] = r11     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.String r7 = "%s/%s.jar"
            java.lang.String r6 = java.lang.String.format(r7, r6)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r4.<init>(r6)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            boolean r6 = r4.exists()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            if (r6 != 0) goto L_0x00eb
            com.google.android.gms.internal.ads.zzaoi r6 = r0.zzg     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            byte[] r7 = r0.zzh     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            byte[] r3 = r6.zzb(r7, r3)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r4.createNewFile()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r6.<init>(r4)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            int r7 = r3.length     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r6.write(r3, r12, r7)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r6.close()     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
        L_0x00eb:
            r0.zzx(r1, r11)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            dalvik.system.DexClassLoader r3 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x0120 }
            java.lang.String r6 = r4.getAbsolutePath()     // Catch:{ all -> 0x0120 }
            java.lang.String r7 = r1.getAbsolutePath()     // Catch:{ all -> 0x0120 }
            android.content.Context r8 = r0.zza     // Catch:{ all -> 0x0120 }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ all -> 0x0120 }
            r3.<init>(r6, r7, r2, r8)     // Catch:{ all -> 0x0120 }
            r0.zzf = r3     // Catch:{ all -> 0x0120 }
            zzy(r4)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r0.zzw(r1, r11)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r2[r12] = r1     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r2[r9] = r11     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.String r10 = java.lang.String.format(r10, r2)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            zzz(r10)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            com.google.android.gms.internal.ads.zzanx r10 = new com.google.android.gms.internal.ads.zzanx     // Catch:{ zzaot -> 0x0165 }
            r10.<init>(r0)     // Catch:{ zzaot -> 0x0165 }
            r0.zzo = r10     // Catch:{ zzaot -> 0x0165 }
            r0.zzq = r9     // Catch:{ zzaot -> 0x0165 }
            goto L_0x0165
        L_0x0120:
            r2 = move-exception
            zzy(r4)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r0.zzw(r1, r11)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r3[r12] = r1     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            r3[r9] = r11     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            java.lang.String r9 = java.lang.String.format(r10, r3)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            zzz(r9)     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
            throw r2     // Catch:{ FileNotFoundException -> 0x014a, IOException -> 0x0143, zzaoh -> 0x013c, NullPointerException -> 0x0135 }
        L_0x0135:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzaot r10 = new com.google.android.gms.internal.ads.zzaot     // Catch:{ zzaot -> 0x0165 }
            r10.<init>(r9)     // Catch:{ zzaot -> 0x0165 }
            throw r10     // Catch:{ zzaot -> 0x0165 }
        L_0x013c:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzaot r10 = new com.google.android.gms.internal.ads.zzaot     // Catch:{ zzaot -> 0x0165 }
            r10.<init>(r9)     // Catch:{ zzaot -> 0x0165 }
            throw r10     // Catch:{ zzaot -> 0x0165 }
        L_0x0143:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzaot r10 = new com.google.android.gms.internal.ads.zzaot     // Catch:{ zzaot -> 0x0165 }
            r10.<init>(r9)     // Catch:{ zzaot -> 0x0165 }
            throw r10     // Catch:{ zzaot -> 0x0165 }
        L_0x014a:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzaot r10 = new com.google.android.gms.internal.ads.zzaot     // Catch:{ zzaot -> 0x0165 }
            r10.<init>(r9)     // Catch:{ zzaot -> 0x0165 }
            throw r10     // Catch:{ zzaot -> 0x0165 }
        L_0x0151:
            com.google.android.gms.internal.ads.zzaoh r9 = new com.google.android.gms.internal.ads.zzaoh     // Catch:{ IllegalArgumentException -> 0x0157 }
            r9.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0157 }
            throw r9     // Catch:{ IllegalArgumentException -> 0x0157 }
        L_0x0157:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzaoh r10 = new com.google.android.gms.internal.ads.zzaoh     // Catch:{ zzaoh -> 0x015e }
            r10.<init>(r1, r9)     // Catch:{ zzaoh -> 0x015e }
            throw r10     // Catch:{ zzaoh -> 0x015e }
        L_0x015e:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzaot r10 = new com.google.android.gms.internal.ads.zzaot     // Catch:{ zzaot -> 0x0165 }
            r10.<init>(r9)     // Catch:{ zzaot -> 0x0165 }
            throw r10     // Catch:{ zzaot -> 0x0165 }
        L_0x0165:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapc.zzg(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.zzapc");
    }

    /* access modifiers changed from: private */
    public final void zzv() {
        try {
            if (this.zzi == null && this.zzl) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zza);
                advertisingIdClient.start();
                this.zzi = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzi = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00bd */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3 A[SYNTHETIC, Splitter:B:42:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d8 A[SYNTHETIC, Splitter:B:46:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e2 A[SYNTHETIC, Splitter:B:54:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e7 A[SYNTHETIC, Splitter:B:58:0x00e7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzw(java.io.File r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r12 = "test"
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r11
            r4 = 1
            java.lang.String r5 = "1644353911296"
            r2[r4] = r5
            java.lang.String r6 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r6, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x001f
            return
        L_0x001f:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r11
            r1[r4] = r5
            java.lang.String r11 = "%s/%s.dex"
            java.lang.String r11 = java.lang.String.format(r11, r1)
            r2.<init>(r11)
            boolean r11 = r2.exists()
            if (r11 != 0) goto L_0x0037
            return
        L_0x0037:
            long r6 = r2.length()
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 > 0) goto L_0x0042
            return
        L_0x0042:
            int r11 = (int) r6
            byte[] r11 = new byte[r11]
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00ce }
            r4.<init>(r2)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00ce }
            int r6 = r4.read(r11)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            if (r6 > 0) goto L_0x0058
            r4.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            zzy(r2)
            return
        L_0x0058:
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r6.print(r12)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r6.print(r12)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r6.print(r12)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzamb r12 = com.google.android.gms.internal.ads.zzamc.zza()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r6 = r6.getBytes()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzgjg r6 = com.google.android.gms.internal.ads.zzgjg.zzv(r6)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r12.zzc(r6)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r5 = r5.getBytes()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzgjg r5 = com.google.android.gms.internal.ads.zzgjg.zzv(r5)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r12.zzd(r5)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzaoi r5 = r10.zzg     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r6 = r10.zzh     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.lang.String r11 = r5.zza(r6, r11)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r11 = r11.getBytes()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzgjg r5 = com.google.android.gms.internal.ads.zzgjg.zzv(r11)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r12.zza(r5)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r11 = com.google.android.gms.internal.ads.zzamr.zze(r11)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzgjg r11 = com.google.android.gms.internal.ads.zzgjg.zzv(r11)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r12.zzb(r11)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r0.createNewFile()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r11.<init>(r0)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzgko r12 = r12.zzaj()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzamc r12 = (com.google.android.gms.internal.ads.zzamc) r12     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            byte[] r12 = r12.zzau()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            int r0 = r12.length     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            r11.write(r12, r3, r0)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            r11.close()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            r4.close()     // Catch:{ IOException -> 0x00bd }
        L_0x00bd:
            r11.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            zzy(r2)
            return
        L_0x00c4:
            r12 = move-exception
            goto L_0x00c9
        L_0x00c6:
            r11 = move-exception
            r12 = r11
            r11 = r1
        L_0x00c9:
            r1 = r4
            goto L_0x00d1
        L_0x00cb:
            r11 = r1
        L_0x00cc:
            r1 = r4
            goto L_0x00e0
        L_0x00ce:
            r11 = move-exception
            r12 = r11
            r11 = r1
        L_0x00d1:
            if (r1 == 0) goto L_0x00d6
            r1.close()     // Catch:{ IOException -> 0x00d6 }
        L_0x00d6:
            if (r11 == 0) goto L_0x00db
            r11.close()     // Catch:{ IOException -> 0x00db }
        L_0x00db:
            zzy(r2)
            throw r12
        L_0x00df:
            r11 = r1
        L_0x00e0:
            if (r1 == 0) goto L_0x00e5
            r1.close()     // Catch:{ IOException -> 0x00e5 }
        L_0x00e5:
            if (r11 == 0) goto L_0x00ea
            r11.close()     // Catch:{ IOException -> 0x00ea }
        L_0x00ea:
            zzy(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapc.zzw(java.io.File, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:31|32|33|34|35|36|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00df, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00db */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[ExcHandler: zzaoh | IOException | NoSuchAlgorithmException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:12:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ea A[SYNTHETIC, Splitter:B:61:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ef A[SYNTHETIC, Splitter:B:65:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f6 A[SYNTHETIC, Splitter:B:72:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fb A[SYNTHETIC, Splitter:B:76:0x00fb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzx(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r11 = new java.io.File
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r10
            r3 = 1
            java.lang.String r4 = "1644353911296"
            r1[r3] = r4
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r1 = java.lang.String.format(r5, r1)
            r11.<init>(r1)
            boolean r1 = r11.exists()
            if (r1 != 0) goto L_0x001d
            return r2
        L_0x001d:
            java.io.File r1 = new java.io.File
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r10
            r0[r3] = r4
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r0)
            r1.<init>(r10)
            boolean r10 = r1.exists()
            if (r10 != 0) goto L_0x00fe
            r10 = 0
            long r5 = r11.length()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00f3, all -> 0x00e6 }
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0043
            zzy(r11)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00f3, all -> 0x00e6 }
            return r2
        L_0x0043:
            int r0 = (int) r5     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00f3, all -> 0x00e6 }
            byte[] r0 = new byte[r0]     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00f3, all -> 0x00e6 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00f3, all -> 0x00e6 }
            r5.<init>(r11)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00f3, all -> 0x00e6 }
            int r6 = r5.read(r0)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r6 > 0) goto L_0x005f
            java.lang.String r0 = zzd     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r0, r1)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            zzy(r11)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r5.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            return r2
        L_0x005f:
            com.google.android.gms.internal.ads.zzgka r6 = com.google.android.gms.internal.ads.zzgka.zza()     // Catch:{ NullPointerException -> 0x00db, zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3 }
            com.google.android.gms.internal.ads.zzamc r0 = com.google.android.gms.internal.ads.zzamc.zzd(r0, r6)     // Catch:{ NullPointerException -> 0x00db, zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3 }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            com.google.android.gms.internal.ads.zzgjg r7 = r0.zzh()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r7 = r7.zzE()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r6.<init>(r7)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            boolean r4 = r4.equals(r6)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r4 == 0) goto L_0x00d4
            com.google.android.gms.internal.ads.zzgjg r4 = r0.zzf()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r4 = r4.zzE()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            com.google.android.gms.internal.ads.zzgjg r6 = r0.zze()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r6 = r6.zzE()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r6 = com.google.android.gms.internal.ads.zzamr.zze(r6)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            boolean r4 = java.util.Arrays.equals(r4, r6)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r4 == 0) goto L_0x00d4
            com.google.android.gms.internal.ads.zzgjg r4 = r0.zzg()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r4 = r4.zzE()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r6 = r6.getBytes()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            boolean r4 = java.util.Arrays.equals(r4, r6)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r4 != 0) goto L_0x00a9
            goto L_0x00d4
        L_0x00a9:
            com.google.android.gms.internal.ads.zzaoi r11 = r9.zzg     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r4 = r9.zzh     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            com.google.android.gms.internal.ads.zzgjg r0 = r0.zze()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r0 = r0.zzE()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r6.<init>(r0)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r11 = r11.zzb(r4, r6)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r1.createNewFile()     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r0.<init>(r1)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            int r10 = r11.length     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e4, all -> 0x00d1 }
            r0.write(r11, r2, r10)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e4, all -> 0x00d1 }
            r5.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            r0.close()     // Catch:{ IOException -> 0x00d0 }
        L_0x00d0:
            return r3
        L_0x00d1:
            r10 = move-exception
            r11 = r10
            goto L_0x00e1
        L_0x00d4:
            zzy(r11)     // Catch:{ zzaoh | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r5.close()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            return r2
        L_0x00db:
            r5.close()     // Catch:{ IOException -> 0x00de }
        L_0x00de:
            return r2
        L_0x00df:
            r11 = move-exception
            r0 = r10
        L_0x00e1:
            r10 = r5
            goto L_0x00e8
        L_0x00e3:
            r0 = r10
        L_0x00e4:
            r10 = r5
            goto L_0x00f4
        L_0x00e6:
            r11 = move-exception
            r0 = r10
        L_0x00e8:
            if (r10 == 0) goto L_0x00ed
            r10.close()     // Catch:{ IOException -> 0x00ed }
        L_0x00ed:
            if (r0 == 0) goto L_0x00f2
            r0.close()     // Catch:{ IOException -> 0x00f2 }
        L_0x00f2:
            throw r11
        L_0x00f3:
            r0 = r10
        L_0x00f4:
            if (r10 == 0) goto L_0x00f9
            r10.close()     // Catch:{ IOException -> 0x00f9 }
        L_0x00f9:
            if (r0 == 0) goto L_0x00fe
            r0.close()     // Catch:{ IOException -> 0x00fe }
        L_0x00fe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapc.zzx(java.io.File, java.lang.String):boolean");
    }

    private static final void zzy(File file) {
        if (!file.exists()) {
            Log.d(zzd, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    private static final void zzz(String str) {
        zzy(new File(str));
    }

    public final int zza() {
        if (this.zzo != null) {
            return zzanx.zzd();
        }
        return Integer.MIN_VALUE;
    }

    public final Context zzb() {
        return this.zza;
    }

    public final zzaly zzc() {
        return this.zzm;
    }

    public final zzanx zzd() {
        return this.zzo;
    }

    public final zzaoi zze() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final zzaov zzf() {
        return this.zzr;
    }

    public final AdvertisingIdClient zzh() {
        if (!this.zzj) {
            return null;
        }
        if (this.zzi != null) {
            return this.zzi;
        }
        Future future = this.zzk;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.zzk = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.zzk.cancel(true);
            }
        }
        return this.zzi;
    }

    public final DexClassLoader zzi() {
        return this.zzf;
    }

    public final Method zzj(String str, String str2) {
        zzaql zzaql = (zzaql) this.zzp.get(new Pair(str, str2));
        if (zzaql == null) {
            return null;
        }
        return zzaql.zza();
    }

    public final ExecutorService zzk() {
        return this.zze;
    }

    public final Future zzl() {
        return this.zzn;
    }

    /* access modifiers changed from: package-private */
    public final void zzo(int i, boolean z) {
        if (this.zzc) {
            Future<?> submit = this.zze.submit(new zzapa(this, i, true));
            if (i == 0) {
                this.zzn = submit;
            }
        }
    }

    public final boolean zzp() {
        return this.zzc;
    }

    public final boolean zzq() {
        return this.zzb;
    }

    public final boolean zzr() {
        return this.zzq;
    }

    public final boolean zzs() {
        return this.zzr.zza();
    }

    public final boolean zzt(String str, String str2, Class... clsArr) {
        if (this.zzp.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzp.put(new Pair(str, str2), new zzaql(this, str, str2, clsArr));
        return true;
    }

    public final byte[] zzu() {
        return this.zzh;
    }
}
