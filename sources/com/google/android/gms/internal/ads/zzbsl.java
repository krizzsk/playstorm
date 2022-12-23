package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbsl {
    /* access modifiers changed from: private */
    public final Object zza = new Object();
    private final Context zzb;
    private final String zzc;
    private final zzcfo zzd;
    /* access modifiers changed from: private */
    public final zzfhs zze;
    private final zzbb zzf;
    private final zzbb zzg;
    /* access modifiers changed from: private */
    public zzbsk zzh;
    /* access modifiers changed from: private */
    public int zzi = 1;

    public zzbsl(Context context, zzcfo zzcfo, String str, zzbb zzbb, zzbb zzbb2, zzfhs zzfhs) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzcfo;
        this.zze = zzfhs;
        this.zzf = zzbb;
        this.zzg = zzbb2;
    }

    public final zzbsf zzb(zzaoc zzaoc) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzbsk zzbsk = this.zzh;
                if (zzbsk != null && this.zzi == 0) {
                    zzbsk.zzi(new zzbrq(this), zzbrr.zza);
                }
            }
            zzbsk zzbsk2 = this.zzh;
            if (zzbsk2 != null) {
                if (zzbsk2.zze() != -1) {
                    int i = this.zzi;
                    if (i == 0) {
                        zzbsf zza2 = this.zzh.zza();
                        return zza2;
                    } else if (i == 1) {
                        this.zzi = 2;
                        zzd((zzaoc) null);
                        zzbsf zza3 = this.zzh.zza();
                        return zza3;
                    } else {
                        zzbsf zza4 = this.zzh.zza();
                        return zza4;
                    }
                }
            }
            this.zzi = 2;
            zzbsk zzd2 = zzd((zzaoc) null);
            this.zzh = zzd2;
            zzbsf zza5 = zzd2.zza();
            return zza5;
        }
    }

    /* access modifiers changed from: protected */
    public final zzbsk zzd(zzaoc zzaoc) {
        zzfhg zza2 = zzfhf.zza(this.zzb, 6);
        zza2.zzf();
        zzbsk zzbsk = new zzbsk(this.zzg);
        zzcfv.zze.execute(new zzbrs(this, (zzaoc) null, zzbsk));
        zzbsk.zzi(new zzbsa(this, zzbsk, zza2), new zzbsb(this, zzbsk, zza2));
        return zzbsk;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzbsk r4, com.google.android.gms.internal.ads.zzbrg r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            int r1 = r4.zze()     // Catch:{ all -> 0x0028 }
            r2 = -1
            if (r1 == r2) goto L_0x0026
            int r1 = r4.zze()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            r4.zzg()     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.zzfvk r4 = com.google.android.gms.internal.ads.zzcfv.zze     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.zzbrv r1 = new com.google.android.gms.internal.ads.zzbrv     // Catch:{ all -> 0x0028 }
            r1.<init>(r5)     // Catch:{ all -> 0x0028 }
            r4.execute(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.ads.internal.util.zze.zza(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsl.zzi(com.google.android.gms.internal.ads.zzbsk, com.google.android.gms.internal.ads.zzbrg):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzaoc zzaoc, zzbsk zzbsk) {
        try {
            zzbro zzbro = new zzbro(this.zzb, this.zzd, (zzaoc) null, (zza) null);
            zzbro.zzk(new zzbru(this, zzbsk, zzbro));
            zzbro.zzq("/jsLoaded", new zzbrw(this, zzbsk, zzbro));
            zzca zzca = new zzca();
            zzbrx zzbrx = new zzbrx(this, (zzaoc) null, zzbro, zzca);
            zzca.zzb(zzbrx);
            zzbro.zzq("/requestReload", zzbrx);
            if (this.zzc.endsWith(".js")) {
                zzbro.zzh(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzbro.zzf(this.zzc);
            } else {
                zzbro.zzg(this.zzc);
            }
            zzs.zza.postDelayed(new zzbrz(this, zzbsk, zzbro), 60000);
        } catch (Throwable th) {
            zze.zzh("Error creating webview.", th);
            zzt.zzo().zzt(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbsk.zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzbrg zzbrg) {
        if (zzbrg.zzi()) {
            this.zzi = 1;
        }
    }
}
