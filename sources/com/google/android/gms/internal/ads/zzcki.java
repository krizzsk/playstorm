package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcki extends zzek {
    private final Context zza;
    private final zzer zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze = ((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue();
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbcx zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = false;
    private boolean zzm = false;
    private long zzn = 0;
    private zzfvj zzo = null;
    private final AtomicLong zzp = new AtomicLong(-1);
    private final zzckl zzq;

    public zzcki(Context context, zzer zzer, String str, int i, zzft zzft, zzckl zzckl, byte[] bArr) {
        super(false);
        this.zza = context;
        this.zzb = zzer;
        this.zzq = zzckl;
        this.zzc = str;
        this.zzd = i;
        zzf(zzft);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzdr)).booleanValue() && !this.zzl) {
            return true;
        }
        return ((Boolean) zzay.zzc().zzb(zzbhy.zzds)).booleanValue() && !this.zzm;
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.zzb.zza(bArr, i, i2);
            }
            if (!this.zze || this.zzf != null) {
                zzg(i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0130=Splitter:B:39:0x0130, B:34:0x010d=Splitter:B:34:0x010d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzb(com.google.android.gms.internal.ads.zzew r14) throws java.io.IOException {
        /*
            r13 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r13.zzg
            if (r2 != 0) goto L_0x020c
            r2 = 1
            r13.zzg = r2
            android.net.Uri r3 = r14.zza
            r13.zzh = r3
            boolean r3 = r13.zze
            if (r3 != 0) goto L_0x0016
            r13.zzj(r14)
        L_0x0016:
            android.net.Uri r3 = r14.zza
            com.google.android.gms.internal.ads.zzbcx r3 = com.google.android.gms.internal.ads.zzbcx.zza(r3)
            r13.zzi = r3
            com.google.android.gms.internal.ads.zzbhq r3 = com.google.android.gms.internal.ads.zzbhy.zzdo
            com.google.android.gms.internal.ads.zzbhw r4 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r3 = r4.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x0186
            com.google.android.gms.internal.ads.zzbcx r3 = r13.zzi
            if (r3 == 0) goto L_0x01e2
            com.google.android.gms.internal.ads.zzbcx r3 = r13.zzi
            long r7 = r14.zzf
            r3.zzh = r7
            com.google.android.gms.internal.ads.zzbcx r3 = r13.zzi
            java.lang.String r7 = r13.zzc
            java.lang.String r7 = com.google.android.gms.internal.ads.zzfpg.zzc(r7)
            r3.zzi = r7
            com.google.android.gms.internal.ads.zzbcx r3 = r13.zzi
            int r7 = r13.zzd
            r3.zzj = r7
            com.google.android.gms.internal.ads.zzbcx r3 = r13.zzi
            boolean r3 = r3.zzg
            if (r3 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.zzbhq r3 = com.google.android.gms.internal.ads.zzbhy.zzdq
            com.google.android.gms.internal.ads.zzbhw r7 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r3 = r7.zzb(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            goto L_0x006c
        L_0x0060:
            com.google.android.gms.internal.ads.zzbhq r3 = com.google.android.gms.internal.ads.zzbhy.zzdp
            com.google.android.gms.internal.ads.zzbhw r7 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r3 = r7.zzb(r3)
            java.lang.Long r3 = (java.lang.Long) r3
        L_0x006c:
            long r7 = r3.longValue()
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.zzA()
            long r9 = r3.elapsedRealtime()
            com.google.android.gms.ads.internal.zzt.zzd()
            android.content.Context r3 = r13.zza
            com.google.android.gms.internal.ads.zzbcx r11 = r13.zzi
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.zzbdi.zza(r3, r11)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            java.lang.Object r7 = r3.get(r7, r11)     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            com.google.android.gms.internal.ads.zzbdj r7 = (com.google.android.gms.internal.ads.zzbdj) r7     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            boolean r8 = r7.zzd()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.zzj = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r7.zzf()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.zzl = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r7.zze()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.zzm = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            long r11 = r7.zza()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.zzn = r11     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r13.zzr()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            if (r8 != 0) goto L_0x00de
            java.io.InputStream r7 = r7.zzc()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.zzf = r7     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r7 = r13.zze     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            if (r7 == 0) goto L_0x00b6
            r13.zzj(r14)     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
        L_0x00b6:
            com.google.android.gms.common.util.Clock r14 = com.google.android.gms.ads.internal.zzt.zzA()
            long r6 = r14.elapsedRealtime()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.zzckl r14 = r13.zzq
            com.google.android.gms.internal.ads.zzckv r14 = r14.zza
            r14.zzX(r2, r6)
            r13.zzk = r2
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r1)
            r14.append(r6)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r14)
            return r4
        L_0x00de:
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.zzA()
            long r3 = r3.elapsedRealtime()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.zzckl r5 = r13.zzq
            com.google.android.gms.internal.ads.zzckv r5 = r5.zza
            r5.zzX(r2, r3)
            r13.zzk = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0157
        L_0x0103:
            r14 = move-exception
            goto L_0x015e
        L_0x0105:
            r4 = r2
            goto L_0x010d
        L_0x0107:
            r4 = r2
            goto L_0x0130
        L_0x0109:
            r14 = move-exception
            r2 = r6
            goto L_0x015e
        L_0x010c:
            r4 = r6
        L_0x010d:
            r3.cancel(r2)     // Catch:{ all -> 0x015c }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x015c }
            r2.interrupt()     // Catch:{ all -> 0x015c }
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzt.zzA()
            long r2 = r2.elapsedRealtime()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.zzckl r5 = r13.zzq
            com.google.android.gms.internal.ads.zzckv r5 = r5.zza
            r5.zzX(r4, r2)
            r13.zzk = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x014a
        L_0x012f:
            r4 = r6
        L_0x0130:
            r3.cancel(r2)     // Catch:{ all -> 0x015c }
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzt.zzA()
            long r2 = r2.elapsedRealtime()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.zzckl r5 = r13.zzq
            com.google.android.gms.internal.ads.zzckv r5 = r5.zza
            r5.zzX(r4, r2)
            r13.zzk = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x014a:
            r4.append(r1)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x0157:
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            goto L_0x01e2
        L_0x015c:
            r14 = move-exception
            r2 = r4
        L_0x015e:
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.zzA()
            long r3 = r3.elapsedRealtime()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.zzckl r5 = r13.zzq
            com.google.android.gms.internal.ads.zzckv r5 = r5.zza
            r5.zzX(r2, r3)
            r13.zzk = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            throw r14
        L_0x0186:
            com.google.android.gms.internal.ads.zzbcx r0 = r13.zzi
            if (r0 == 0) goto L_0x01ab
            com.google.android.gms.internal.ads.zzbcx r0 = r13.zzi
            long r7 = r14.zzf
            r0.zzh = r7
            com.google.android.gms.internal.ads.zzbcx r0 = r13.zzi
            java.lang.String r1 = r13.zzc
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfpg.zzc(r1)
            r0.zzi = r1
            com.google.android.gms.internal.ads.zzbcx r0 = r13.zzi
            int r1 = r13.zzd
            r0.zzj = r1
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.zzt.zzc()
            com.google.android.gms.internal.ads.zzbcx r1 = r13.zzi
            com.google.android.gms.internal.ads.zzbcu r0 = r0.zzb(r1)
            goto L_0x01ac
        L_0x01ab:
            r0 = 0
        L_0x01ac:
            if (r0 == 0) goto L_0x01e2
            boolean r1 = r0.zze()
            if (r1 == 0) goto L_0x01e2
            boolean r1 = r0.zzd()
            r13.zzj = r1
            boolean r1 = r0.zzg()
            r13.zzl = r1
            boolean r1 = r0.zzf()
            r13.zzm = r1
            long r7 = r0.zza()
            r13.zzn = r7
            r13.zzk = r2
            boolean r1 = r13.zzr()
            if (r1 != 0) goto L_0x01e2
            java.io.InputStream r0 = r0.zzc()
            r13.zzf = r0
            boolean r0 = r13.zze
            if (r0 == 0) goto L_0x01e1
            r13.zzj(r14)
        L_0x01e1:
            return r4
        L_0x01e2:
            r13.zzk = r6
            com.google.android.gms.internal.ads.zzbcx r0 = r13.zzi
            if (r0 == 0) goto L_0x0205
            com.google.android.gms.internal.ads.zzew r0 = new com.google.android.gms.internal.ads.zzew
            com.google.android.gms.internal.ads.zzbcx r1 = r13.zzi
            java.lang.String r1 = r1.zza
            android.net.Uri r2 = android.net.Uri.parse(r1)
            byte[] r1 = r14.zzc
            long r4 = r14.zze
            long r6 = r14.zzf
            long r8 = r14.zzg
            java.lang.String r1 = r14.zzh
            r3 = 0
            r10 = 0
            int r11 = r14.zzi
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r10, r11)
            r14 = r0
        L_0x0205:
            com.google.android.gms.internal.ads.zzer r0 = r13.zzb
            long r0 = r0.zzb(r14)
            return r0
        L_0x020c:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open GcacheDataSource."
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcki.zzb(com.google.android.gms.internal.ads.zzew):long");
    }

    public final Uri zzc() {
        return this.zzh;
    }

    public final void zzd() throws IOException {
        if (this.zzg) {
            boolean z = false;
            this.zzg = false;
            this.zzh = null;
            if (!this.zze || this.zzf != null) {
                z = true;
            }
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                IOUtils.closeQuietly((Closeable) inputStream);
                this.zzf = null;
            } else {
                this.zzb.zzd();
            }
            if (z) {
                zzh();
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if (this.zzi == null) {
            return -1;
        }
        if (this.zzp.get() != -1) {
            return this.zzp.get();
        }
        synchronized (this) {
            if (this.zzo == null) {
                this.zzo = zzcfv.zza.zzb(new zzckh(this));
            }
        }
        if (!this.zzo.isDone()) {
            return -1;
        }
        try {
            this.zzp.compareAndSet(-1, ((Long) this.zzo.get()).longValue());
            return this.zzp.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Long zzm() throws Exception {
        return Long.valueOf(zzt.zzc().zza(this.zzi));
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
