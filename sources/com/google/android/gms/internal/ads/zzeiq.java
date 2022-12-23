package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeiq implements zzfuh {
    private final zzfge zza;
    private final zzdbu zzb;
    private final zzfic zzc;
    private final zzfig zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcxz zzg;
    private final zzeil zzh;
    private final zzefd zzi;
    private final Context zzj;
    private final zzfhq zzk;

    zzeiq(Context context, zzfge zzfge, zzeil zzeil, zzdbu zzdbu, zzfic zzfic, zzfig zzfig, zzcxz zzcxz, Executor executor, ScheduledExecutorService scheduledExecutorService, zzefd zzefd, zzfhq zzfhq) {
        this.zzj = context;
        this.zza = zzfge;
        this.zzh = zzeil;
        this.zzb = zzdbu;
        this.zzc = zzfic;
        this.zzd = zzfig;
        this.zzg = zzcxz;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzefd;
        this.zzk = zzfhq;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfvj zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzfbs r9 = (com.google.android.gms.internal.ads.zzfbs) r9
            com.google.android.gms.internal.ads.zzfbr r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfbj r0 = r0.zzb
            int r0 = r0.zze
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 300(0x12c, float:4.2E-43)
            if (r0 == 0) goto L_0x0042
            if (r0 < r1) goto L_0x0027
            if (r0 >= r2) goto L_0x0027
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zzev
            com.google.android.gms.internal.ads.zzbhw r3 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "No fill."
            goto L_0x0044
        L_0x0027:
            if (r0 < r2) goto L_0x0030
            r3 = 400(0x190, float:5.6E-43)
            if (r0 >= r3) goto L_0x0030
            java.lang.String r0 = "No location header to follow redirect or too many redirects."
            goto L_0x0044
        L_0x0030:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Received error HTTP response code: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x0044
        L_0x0042:
            java.lang.String r0 = "No ad config."
        L_0x0044:
            com.google.android.gms.internal.ads.zzfbr r3 = r9.zzb
            com.google.android.gms.internal.ads.zzfbj r3 = r3.zzb
            com.google.android.gms.internal.ads.zzfbi r4 = r3.zzi
            if (r4 == 0) goto L_0x0050
            java.lang.String r0 = r4.zza()
        L_0x0050:
            com.google.android.gms.internal.ads.zzefd r4 = r8.zzi
            r4.zzg(r3)
            com.google.android.gms.internal.ads.zzbhq r3 = com.google.android.gms.internal.ads.zzbhy.zzgT
            com.google.android.gms.internal.ads.zzbhw r4 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r3 = r4.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 3
            if (r3 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.zzfbr r3 = r9.zzb
            com.google.android.gms.internal.ads.zzfbj r3 = r3.zzb
            int r3 = r3.zze
            if (r3 == 0) goto L_0x007f
            if (r3 < r1) goto L_0x0074
            if (r3 < r2) goto L_0x007f
        L_0x0074:
            com.google.android.gms.internal.ads.zzeio r9 = new com.google.android.gms.internal.ads.zzeio
            r9.<init>(r4, r0)
            com.google.android.gms.internal.ads.zzfvj r9 = com.google.android.gms.internal.ads.zzfva.zzh(r9)
            goto L_0x015d
        L_0x007f:
            com.google.android.gms.internal.ads.zzfge r1 = r8.zza
            com.google.android.gms.internal.ads.zzffy r2 = com.google.android.gms.internal.ads.zzffy.RENDER_CONFIG_INIT
            com.google.android.gms.internal.ads.zzeio r3 = new com.google.android.gms.internal.ads.zzeio
            r3.<init>(r4, r0)
            com.google.android.gms.internal.ads.zzfvj r0 = com.google.android.gms.internal.ads.zzfva.zzh(r3)
            com.google.android.gms.internal.ads.zzffv r0 = com.google.android.gms.internal.ads.zzffo.zzc(r0, r2, r1)
            com.google.android.gms.internal.ads.zzffj r0 = r0.zza()
            com.google.android.gms.internal.ads.zzfbr r1 = r9.zzb
            java.util.List r1 = r1.zza
            java.util.Iterator r1 = r1.iterator()
        L_0x009c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00de
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzfbg r2 = (com.google.android.gms.internal.ads.zzfbg) r2
            com.google.android.gms.internal.ads.zzefd r3 = r8.zzi
            r3.zzd(r2)
            java.util.List r3 = r2.zza
            java.util.Iterator r3 = r3.iterator()
        L_0x00b3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00d0
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.internal.ads.zzcxz r5 = r8.zzg
            int r6 = r2.zzb
            com.google.android.gms.internal.ads.zzeey r4 = r5.zza(r6, r4)
            if (r4 == 0) goto L_0x00b3
            boolean r4 = r4.zzb(r9, r2)
            if (r4 == 0) goto L_0x00b3
            goto L_0x009c
        L_0x00d0:
            com.google.android.gms.internal.ads.zzefd r3 = r8.zzi
            r4 = 0
            r6 = 1
            r7 = 0
            com.google.android.gms.ads.internal.client.zze r6 = com.google.android.gms.internal.ads.zzfcx.zzd(r6, r7, r7)
            r3.zze(r2, r4, r6)
            goto L_0x009c
        L_0x00de:
            com.google.android.gms.internal.ads.zzdbu r1 = r8.zzb
            com.google.android.gms.internal.ads.zzctj r2 = new com.google.android.gms.internal.ads.zzctj
            com.google.android.gms.internal.ads.zzfig r3 = r8.zzd
            com.google.android.gms.internal.ads.zzfic r4 = r8.zzc
            r2.<init>(r9, r3, r4)
            java.util.concurrent.Executor r3 = r8.zze
            r1.zzj(r2, r3)
            com.google.android.gms.internal.ads.zzfbr r1 = r9.zzb
            java.util.List r1 = r1.zza
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x00f7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x015c
            java.lang.Object r3 = r1.next()
            com.google.android.gms.internal.ads.zzfbg r3 = (com.google.android.gms.internal.ads.zzfbg) r3
            java.util.List r4 = r3.zza
            java.util.Iterator r4 = r4.iterator()
        L_0x0109:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0159
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzcxz r6 = r8.zzg
            int r7 = r3.zzb
            com.google.android.gms.internal.ads.zzeey r6 = r6.zza(r7, r5)
            if (r6 == 0) goto L_0x0109
            boolean r7 = r6.zzb(r9, r3)
            if (r7 == 0) goto L_0x0109
            com.google.android.gms.internal.ads.zzfge r4 = r8.zza
            com.google.android.gms.internal.ads.zzffy r7 = com.google.android.gms.internal.ads.zzffy.RENDER_CONFIG_WATERFALL
            com.google.android.gms.internal.ads.zzffv r0 = r4.zzb(r7, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "render-config-"
            r4.append(r7)
            r4.append(r2)
            java.lang.String r7 = "-"
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.ads.zzffv r0 = r0.zzh(r4)
            com.google.android.gms.internal.ads.zzeip r4 = new com.google.android.gms.internal.ads.zzeip
            r4.<init>(r8, r3, r9, r6)
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.zzffv r0 = r0.zzc(r3, r4)
            com.google.android.gms.internal.ads.zzffj r0 = r0.zza()
        L_0x0159:
            int r2 = r2 + 1
            goto L_0x00f7
        L_0x015c:
            r9 = r0
        L_0x015d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeiq.zza(java.lang.Object):com.google.android.gms.internal.ads.zzfvj");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzb(zzfbg zzfbg, zzfbs zzfbs, zzeey zzeey, Throwable th) throws Exception {
        zzfhg zza2 = zzfhf.zza(this.zzj, 12);
        zza2.zzc(zzfbg.zzF);
        zza2.zzf();
        zzeil zzeil = this.zzh;
        zzfvj zzo = zzfva.zzo(zzeey.zza(zzfbs, zzfbg), (long) zzfbg.zzS, TimeUnit.MILLISECONDS, this.zzf);
        zzeil.zze(zzfbs, zzfbg, zzo, this.zzc);
        zzfhp.zza(zzo, this.zzk, zza2);
        return zzo;
    }
}
