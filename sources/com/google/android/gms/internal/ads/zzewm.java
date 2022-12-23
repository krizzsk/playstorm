package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzewm implements zzems {
    protected final zzcnf zza;
    private final Context zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public final zzexc zzd;
    /* access modifiers changed from: private */
    public final zzeyv zze;
    private final zzcfo zzf;
    private final ViewGroup zzg;
    /* access modifiers changed from: private */
    public final zzfhs zzh;
    private final zzfbw zzi;
    /* access modifiers changed from: private */
    @Nullable
    public zzfvj zzj;

    protected zzewm(Context context, Executor executor, zzcnf zzcnf, zzeyv zzeyv, zzexc zzexc, zzfbw zzfbw, zzcfo zzcfo) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcnf;
        this.zze = zzeyv;
        this.zzd = zzexc;
        this.zzi = zzfbw;
        this.zzf = zzcfo;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcnf.zzy();
    }

    /* access modifiers changed from: private */
    public final synchronized zzdba zzm(zzeyt zzeyt) {
        zzewl zzewl = (zzewl) zzeyt;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzgM)).booleanValue()) {
            zzcvr zzcvr = new zzcvr(this.zzg);
            zzdbc zzdbc = new zzdbc();
            zzdbc.zzc(this.zzb);
            zzdbc.zzf(zzewl.zza);
            zzdbe zzg2 = zzdbc.zzg();
            zzdhc zzdhc = new zzdhc();
            zzdhc.zzc(this.zzd, this.zzc);
            zzdhc.zzl(this.zzd, this.zzc);
            return zzc(zzcvr, zzg2, zzdhc.zzn());
        }
        zzexc zzi2 = zzexc.zzi(this.zzd);
        zzdhc zzdhc2 = new zzdhc();
        zzdhc2.zzb(zzi2, this.zzc);
        zzdhc2.zzg(zzi2, this.zzc);
        zzdhc2.zzh(zzi2, this.zzc);
        zzdhc2.zzi(zzi2, this.zzc);
        zzdhc2.zzc(zzi2, this.zzc);
        zzdhc2.zzl(zzi2, this.zzc);
        zzdhc2.zzm(zzi2);
        zzcvr zzcvr2 = new zzcvr(this.zzg);
        zzdbc zzdbc2 = new zzdbc();
        zzdbc2.zzc(this.zzb);
        zzdbc2.zzf(zzewl.zza);
        return zzc(zzcvr2, zzdbc2.zzg(), zzdhc2.zzn());
    }

    public final boolean zza() {
        zzfvj zzfvj = this.zzj;
        return zzfvj != null && !zzfvj.isDone();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d A[SYNTHETIC, Splitter:B:16:0x005d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl r9, java.lang.String r10, com.google.android.gms.internal.ads.zzemq r11, com.google.android.gms.internal.ads.zzemr r12) throws android.os.RemoteException {
        /*
            r8 = this;
            monitor-enter(r8)
            android.content.Context r11 = r8.zzb     // Catch:{ all -> 0x00f0 }
            r0 = 7
            com.google.android.gms.internal.ads.zzfhg r5 = com.google.android.gms.internal.ads.zzfhf.zzb(r11, r0, r0, r9)     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzbja r11 = com.google.android.gms.internal.ads.zzbjm.zzd     // Catch:{ all -> 0x00f0 }
            java.lang.Object r11 = r11.zze()     // Catch:{ all -> 0x00f0 }
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x00f0 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x00f0 }
            r7 = 1
            r1 = 0
            if (r11 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzbhq r11 = com.google.android.gms.internal.ads.zzbhy.zziq     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x00f0 }
            java.lang.Object r11 = r2.zzb(r11)     // Catch:{ all -> 0x00f0 }
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x00f0 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x00f0 }
            if (r11 == 0) goto L_0x002c
            r11 = r7
            goto L_0x002d
        L_0x002c:
            r11 = r1
        L_0x002d:
            com.google.android.gms.internal.ads.zzcfo r2 = r8.zzf     // Catch:{ all -> 0x00f0 }
            int r2 = r2.zzc     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzbhq r3 = com.google.android.gms.internal.ads.zzbhy.zzir     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzbhw r4 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x00f0 }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x00f0 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00f0 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00f0 }
            if (r2 < r3) goto L_0x0045
            if (r11 != 0) goto L_0x004a
        L_0x0045:
            java.lang.String r11 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r11)     // Catch:{ all -> 0x00f0 }
        L_0x004a:
            if (r10 != 0) goto L_0x005d
            java.lang.String r9 = "Ad unit ID should not be null for app open ad."
            com.google.android.gms.ads.internal.util.zze.zzg(r9)     // Catch:{ all -> 0x00f0 }
            java.util.concurrent.Executor r9 = r8.zzc     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzewg r10 = new com.google.android.gms.internal.ads.zzewg     // Catch:{ all -> 0x00f0 }
            r10.<init>(r8)     // Catch:{ all -> 0x00f0 }
            r9.execute(r10)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r8)
            return r1
        L_0x005d:
            com.google.android.gms.internal.ads.zzfvj r11 = r8.zzj     // Catch:{ all -> 0x00f0 }
            if (r11 == 0) goto L_0x0063
            monitor-exit(r8)
            return r1
        L_0x0063:
            com.google.android.gms.internal.ads.zzbja r11 = com.google.android.gms.internal.ads.zzbjh.zzc     // Catch:{ all -> 0x00f0 }
            java.lang.Object r11 = r11.zze()     // Catch:{ all -> 0x00f0 }
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x00f0 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x00f0 }
            r1 = 0
            if (r11 == 0) goto L_0x008e
            com.google.android.gms.internal.ads.zzeyv r11 = r8.zze     // Catch:{ all -> 0x00f0 }
            java.lang.Object r2 = r11.zzd()     // Catch:{ all -> 0x00f0 }
            if (r2 == 0) goto L_0x008e
            java.lang.Object r11 = r11.zzd()     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzcvc r11 = (com.google.android.gms.internal.ads.zzcvc) r11     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzfhq r11 = r11.zzh()     // Catch:{ all -> 0x00f0 }
            r11.zzh(r0)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = r9.zzp     // Catch:{ all -> 0x00f0 }
            r11.zzb(r0)     // Catch:{ all -> 0x00f0 }
            r4 = r11
            goto L_0x008f
        L_0x008e:
            r4 = r1
        L_0x008f:
            android.content.Context r11 = r8.zzb     // Catch:{ all -> 0x00f0 }
            boolean r0 = r9.zzf     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzfcs.zza(r11, r0)     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzbhq r11 = com.google.android.gms.internal.ads.zzbhy.zzhr     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzbhw r0 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x00f0 }
            java.lang.Object r11 = r0.zzb(r11)     // Catch:{ all -> 0x00f0 }
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x00f0 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x00f0 }
            if (r11 == 0) goto L_0x00b5
            boolean r11 = r9.zzf     // Catch:{ all -> 0x00f0 }
            if (r11 == 0) goto L_0x00b5
            com.google.android.gms.internal.ads.zzcnf r11 = r8.zza     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzdza r11 = r11.zzk()     // Catch:{ all -> 0x00f0 }
            r11.zzl(r7)     // Catch:{ all -> 0x00f0 }
        L_0x00b5:
            com.google.android.gms.internal.ads.zzfbw r11 = r8.zzi     // Catch:{ all -> 0x00f0 }
            r11.zzs(r10)     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.ads.internal.client.zzq r10 = com.google.android.gms.ads.internal.client.zzq.zzb()     // Catch:{ all -> 0x00f0 }
            r11.zzr(r10)     // Catch:{ all -> 0x00f0 }
            r11.zzE(r9)     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzfby r9 = r11.zzG()     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzewl r6 = new com.google.android.gms.internal.ads.zzewl     // Catch:{ all -> 0x00f0 }
            r6.<init>(r1)     // Catch:{ all -> 0x00f0 }
            r6.zza = r9     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzeyv r9 = r8.zze     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzeyw r10 = new com.google.android.gms.internal.ads.zzeyw     // Catch:{ all -> 0x00f0 }
            r10.<init>(r6, r1)     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzewh r11 = new com.google.android.gms.internal.ads.zzewh     // Catch:{ all -> 0x00f0 }
            r11.<init>(r8)     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzfvj r9 = r9.zzc(r10, r11, r1)     // Catch:{ all -> 0x00f0 }
            r8.zzj = r9     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzewj r10 = new com.google.android.gms.internal.ads.zzewj     // Catch:{ all -> 0x00f0 }
            r1 = r10
            r2 = r8
            r3 = r12
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00f0 }
            java.util.concurrent.Executor r11 = r8.zzc     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.internal.ads.zzfva.zzr(r9, r10, r11)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r8)
            return r7
        L_0x00f0:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewm.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzemq, com.google.android.gms.internal.ads.zzemr):boolean");
    }

    /* access modifiers changed from: protected */
    public abstract zzdba zzc(zzcvr zzcvr, zzdbe zzdbe, zzdhe zzdhe);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        this.zzd.zza(zzfcx.zzd(6, (String) null, (zze) null));
    }

    public final void zzl(zzw zzw) {
        this.zzi.zzt(zzw);
    }
}
