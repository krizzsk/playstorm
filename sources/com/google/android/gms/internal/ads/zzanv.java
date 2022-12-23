package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzanv implements zzany {
    private static zzanv zzb;
    volatile long zza = 0;
    private final Context zzc;
    private final zzfmh zzd;
    private final zzfmo zze;
    private final zzfmq zzf;
    private final zzaow zzg;
    /* access modifiers changed from: private */
    public final zzfks zzh;
    private final Executor zzi;
    private final zzfmn zzj;
    private final CountDownLatch zzk;
    private final zzapl zzl;
    /* access modifiers changed from: private */
    public final Object zzm = new Object();
    /* access modifiers changed from: private */
    public volatile boolean zzn;
    private volatile boolean zzo = false;
    private final int zzp;

    zzanv(Context context, zzfks zzfks, zzfmh zzfmh, zzfmo zzfmo, zzfmq zzfmq, zzaow zzaow, Executor executor, zzfkn zzfkn, int i, zzapl zzapl) {
        this.zzc = context;
        this.zzh = zzfks;
        this.zzd = zzfmh;
        this.zze = zzfmo;
        this.zzf = zzfmq;
        this.zzg = zzaow;
        this.zzi = executor;
        this.zzp = i;
        this.zzl = zzapl;
        this.zzk = new CountDownLatch(1);
        this.zzj = new zzant(this, zzfkn);
    }

    public static synchronized zzanv zza(String str, Context context, boolean z, boolean z2) {
        zzanv zzb2;
        synchronized (zzanv.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzanv zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        zzanv zzanv;
        Context context2 = context;
        Executor executor2 = executor;
        synchronized (zzanv.class) {
            if (zzb == null) {
                zzfkt zza2 = zzfku.zza();
                zza2.zza(str);
                zza2.zzc(z);
                zzfku zzd2 = zza2.zzd();
                zzfks zza3 = zzfks.zza(context2, executor2, z2);
                zzaog zzc2 = ((Boolean) zzay.zzc().zzb(zzbhy.zzcy)).booleanValue() ? zzaog.zzc(context) : null;
                zzapl zzd3 = ((Boolean) zzay.zzc().zzb(zzbhy.zzcz)).booleanValue() ? zzapl.zzd(context, executor) : null;
                zzfll zze2 = zzfll.zze(context2, executor2, zza3, zzd2);
                zzaov zzaov = new zzaov(context2);
                zzaow zzaow = new zzaow(zzd2, zze2, new zzapj(context2, zzaov), zzaov, zzc2, zzd3);
                int zzb2 = zzflu.zzb(context2, zza3);
                zzfkn zzfkn = new zzfkn();
                zzanv zzanv2 = new zzanv(context, zza3, new zzfmh(context2, zzb2), new zzfmo(context2, zzb2, new zzans(zza3), ((Boolean) zzay.zzc().zzb(zzbhy.zzbQ)).booleanValue()), new zzfmq(context2, zzaow, zza3, zzfkn), zzaow, executor, zzfkn, zzb2, zzd3);
                zzb = zzanv2;
                zzanv2.zzm();
                zzb.zzo();
            }
            zzanv = zzb;
        }
        return zzanv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r12.zzh.zzd(2030, java.lang.System.currentTimeMillis() - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        r12 = r12.zzk;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x010a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzanv r12) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            com.google.android.gms.internal.ads.zzfmg r3 = r12.zzs(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzaqu r4 = r3.zza()
            java.lang.String r4 = r4.zzk()
            com.google.android.gms.internal.ads.zzaqu r3 = r3.zza()
            java.lang.String r3 = r3.zzj()
            r9 = r3
            r8 = r4
            goto L_0x0021
        L_0x001f:
            r8 = r4
            r9 = r8
        L_0x0021:
            android.content.Context r5 = r12.zzc     // Catch:{ zzgla -> 0x012a }
            r6 = 1
            int r7 = r12.zzp     // Catch:{ zzgla -> 0x012a }
            java.lang.String r10 = "1"
            com.google.android.gms.internal.ads.zzfks r11 = r12.zzh     // Catch:{ zzgla -> 0x012a }
            com.google.android.gms.internal.ads.zzfml r3 = com.google.android.gms.internal.ads.zzflc.zza(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ zzgla -> 0x012a }
            byte[] r4 = r3.zzb     // Catch:{ zzgla -> 0x012a }
            if (r4 == 0) goto L_0x0119
            int r5 = r4.length     // Catch:{ zzgla -> 0x012a }
            if (r5 != 0) goto L_0x0037
            goto L_0x0119
        L_0x0037:
            com.google.android.gms.internal.ads.zzgjg r4 = com.google.android.gms.internal.ads.zzgjg.zzv(r4)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.zzgka r5 = com.google.android.gms.internal.ads.zzgka.zza()     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.zzaqr r4 = com.google.android.gms.internal.ads.zzaqr.zzc(r4, r5)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.zzaqu r5 = r4.zzd()     // Catch:{ zzgla -> 0x012a }
            java.lang.String r5 = r5.zzk()     // Catch:{ zzgla -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgla -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzaqu r5 = r4.zzd()     // Catch:{ zzgla -> 0x012a }
            java.lang.String r5 = r5.zzj()     // Catch:{ zzgla -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgla -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzgjg r5 = r4.zze()     // Catch:{ zzgla -> 0x012a }
            byte[] r5 = r5.zzE()     // Catch:{ zzgla -> 0x012a }
            int r5 = r5.length     // Catch:{ zzgla -> 0x012a }
            if (r5 != 0) goto L_0x006c
            goto L_0x00fb
        L_0x006c:
            com.google.android.gms.internal.ads.zzfmg r5 = r12.zzs(r2)     // Catch:{ zzgla -> 0x012a }
            if (r5 != 0) goto L_0x0073
            goto L_0x009b
        L_0x0073:
            com.google.android.gms.internal.ads.zzaqu r5 = r5.zza()     // Catch:{ zzgla -> 0x012a }
            com.google.android.gms.internal.ads.zzaqu r6 = r4.zzd()     // Catch:{ zzgla -> 0x012a }
            java.lang.String r6 = r6.zzk()     // Catch:{ zzgla -> 0x012a }
            java.lang.String r7 = r5.zzk()     // Catch:{ zzgla -> 0x012a }
            boolean r6 = r6.equals(r7)     // Catch:{ zzgla -> 0x012a }
            if (r6 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.zzaqu r6 = r4.zzd()     // Catch:{ zzgla -> 0x012a }
            java.lang.String r6 = r6.zzj()     // Catch:{ zzgla -> 0x012a }
            java.lang.String r5 = r5.zzj()     // Catch:{ zzgla -> 0x012a }
            boolean r5 = r6.equals(r5)     // Catch:{ zzgla -> 0x012a }
            if (r5 != 0) goto L_0x00fb
        L_0x009b:
            com.google.android.gms.internal.ads.zzfmn r5 = r12.zzj     // Catch:{ zzgla -> 0x012a }
            int r3 = r3.zzc     // Catch:{ zzgla -> 0x012a }
            com.google.android.gms.internal.ads.zzbhq r6 = com.google.android.gms.internal.ads.zzbhy.zzbO     // Catch:{ zzgla -> 0x012a }
            com.google.android.gms.internal.ads.zzbhw r7 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ zzgla -> 0x012a }
            java.lang.Object r6 = r7.zzb(r6)     // Catch:{ zzgla -> 0x012a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ zzgla -> 0x012a }
            boolean r6 = r6.booleanValue()     // Catch:{ zzgla -> 0x012a }
            if (r6 == 0) goto L_0x00c5
            r6 = 3
            if (r3 != r6) goto L_0x00bb
            com.google.android.gms.internal.ads.zzfmo r3 = r12.zze     // Catch:{ zzgla -> 0x012a }
            boolean r3 = r3.zza(r4)     // Catch:{ zzgla -> 0x012a }
            goto L_0x00cb
        L_0x00bb:
            r6 = 4
            if (r3 != r6) goto L_0x00cd
            com.google.android.gms.internal.ads.zzfmo r3 = r12.zze     // Catch:{ zzgla -> 0x012a }
            boolean r3 = r3.zzb(r4, r5)     // Catch:{ zzgla -> 0x012a }
            goto L_0x00cb
        L_0x00c5:
            com.google.android.gms.internal.ads.zzfmh r3 = r12.zzd     // Catch:{ zzgla -> 0x012a }
            boolean r3 = r3.zzb(r4, r5)     // Catch:{ zzgla -> 0x012a }
        L_0x00cb:
            if (r3 != 0) goto L_0x00df
        L_0x00cd:
            com.google.android.gms.internal.ads.zzfks r2 = r12.zzh     // Catch:{ zzgla -> 0x012a }
            r3 = 4009(0xfa9, float:5.618E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgla -> 0x012a }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgla -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
        L_0x00db:
            r12.countDown()
            return
        L_0x00df:
            com.google.android.gms.internal.ads.zzfmg r3 = r12.zzs(r2)     // Catch:{ zzgla -> 0x012a }
            if (r3 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.zzfmq r4 = r12.zzf     // Catch:{ zzgla -> 0x012a }
            boolean r3 = r4.zzc(r3)     // Catch:{ zzgla -> 0x012a }
            if (r3 == 0) goto L_0x00ef
            r12.zzo = r2     // Catch:{ zzgla -> 0x012a }
        L_0x00ef:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ zzgla -> 0x012a }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r12.zza = r2     // Catch:{ zzgla -> 0x012a }
        L_0x00f8:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x00fb:
            com.google.android.gms.internal.ads.zzfks r2 = r12.zzh     // Catch:{ zzgla -> 0x012a }
            r3 = 5010(0x1392, float:7.02E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgla -> 0x012a }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgla -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x010a:
            com.google.android.gms.internal.ads.zzfks r2 = r12.zzh     // Catch:{ zzgla -> 0x012a }
            r3 = 2030(0x7ee, float:2.845E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgla -> 0x012a }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgla -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x0119:
            com.google.android.gms.internal.ads.zzfks r2 = r12.zzh     // Catch:{ zzgla -> 0x012a }
            r3 = 5009(0x1391, float:7.019E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgla -> 0x012a }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgla -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x0128:
            r0 = move-exception
            goto L_0x013a
        L_0x012a:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfks r3 = r12.zzh     // Catch:{ all -> 0x0128 }
            r4 = 4002(0xfa2, float:5.608E-42)
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0128 }
            long r5 = r5 - r0
            r3.zzc(r4, r5, r2)     // Catch:{ all -> 0x0128 }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x013a:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            r12.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanv.zzj(com.google.android.gms.internal.ads.zzanv):void");
    }

    private final void zzr() {
        zzapl zzapl = this.zzl;
        if (zzapl != null) {
            zzapl.zzh();
        }
    }

    private final zzfmg zzs(int i) {
        if (!zzflu.zza(this.zzp)) {
            return null;
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbO)).booleanValue()) {
            return this.zze.zzc(1);
        }
        return this.zzd.zzd(1);
    }

    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, (Activity) null);
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        zzr();
        zzo();
        zzfkv zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza3 = zza2.zza(context, (String) null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza3, (Map) null);
        return zza3;
    }

    public final String zzg(Context context) {
        zzr();
        zzo();
        zzfkv zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc2 = zza2.zzc(context, (String) null);
        this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc2, (Map) null);
        return zzc2;
    }

    public final String zzh(Context context, View view, Activity activity) {
        zzr();
        zzo();
        zzfkv zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb2 = zza2.zzb(context, (String) null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, (Map) null);
        return zzb2;
    }

    public final void zzk(MotionEvent motionEvent) {
        zzfkv zza2 = this.zzf.zza();
        if (zza2 != null) {
            try {
                zza2.zzd((String) null, motionEvent);
            } catch (zzfmp e) {
                this.zzh.zzc(e.zza(), -1, e);
            }
        }
    }

    public final void zzl(int i, int i2, int i3) {
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfmg zzs = zzs(1);
        if (zzs == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zzc(zzs)) {
            this.zzo = true;
            this.zzk.countDown();
        }
    }

    public final void zzn(View view) {
        this.zzg.zzd(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzo() {
        /*
            r5 = this;
            boolean r0 = r5.zzn
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r5.zzm
            monitor-enter(r0)
            boolean r1 = r5.zzn     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r5.zza     // Catch:{ all -> 0x003f }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.zzfmq r1 = r5.zzf     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzfmg r1 = r1.zzb()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.zzd(r3)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
        L_0x002b:
            int r1 = r5.zzp     // Catch:{ all -> 0x003f }
            boolean r1 = com.google.android.gms.internal.ads.zzflu.zza(r1)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            java.util.concurrent.Executor r1 = r5.zzi     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzanu r2 = new com.google.android.gms.internal.ads.zzanu     // Catch:{ all -> 0x003f }
            r2.<init>(r5)     // Catch:{ all -> 0x003f }
            r1.execute(r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanv.zzo():void");
    }

    public final synchronized boolean zzq() {
        return this.zzo;
    }
}
