package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcvn extends zzcxw {
    private final zzcli zzc;
    private final int zzd;
    private final Context zze;
    private final zzcuv zzf;
    private final zzdlf zzg;
    private final zzdio zzh;
    private final zzdcf zzi;
    private final boolean zzj;
    private boolean zzk = false;

    zzcvn(zzcxv zzcxv, Context context, zzcli zzcli, int i, zzcuv zzcuv, zzdlf zzdlf, zzdio zzdio, zzdcf zzdcf) {
        super(zzcxv);
        this.zzc = zzcli;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcuv;
        this.zzg = zzdlf;
        this.zzh = zzdio;
        this.zzi = zzdcf;
        this.zzj = ((Boolean) zzay.zzc().zzb(zzbhy.zzem)).booleanValue();
    }

    public final void zzV() {
        super.zzV();
        zzcli zzcli = this.zzc;
        if (zzcli != null) {
            zzcli.destroy();
        }
    }

    public final int zza() {
        return this.zzd;
    }

    public final void zzc(zzbbz zzbbz) {
        zzcli zzcli = this.zzc;
        if (zzcli != null) {
            zzcli.zzaj(zzbbz);
        }
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [android.content.Context] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(android.app.Activity r3, com.google.android.gms.internal.ads.zzbcm r4, boolean r5) throws android.os.RemoteException {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0004
            android.content.Context r3 = r2.zze
        L_0x0004:
            boolean r4 = r2.zzj
            if (r4 == 0) goto L_0x000d
            com.google.android.gms.internal.ads.zzdio r4 = r2.zzh
            r4.zzb()
        L_0x000d:
            com.google.android.gms.internal.ads.zzbhq r4 = com.google.android.gms.internal.ads.zzbhy.zzay
            com.google.android.gms.internal.ads.zzbhw r0 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r4 = r0.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0061
            com.google.android.gms.ads.internal.zzt.zzp()
            boolean r4 = com.google.android.gms.ads.internal.util.zzs.zzC(r3)
            if (r4 == 0) goto L_0x0061
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.zze.zzj(r4)
            com.google.android.gms.internal.ads.zzdcf r4 = r2.zzi
            r4.zzb()
            com.google.android.gms.internal.ads.zzbhq r4 = com.google.android.gms.internal.ads.zzbhy.zzaz
            com.google.android.gms.internal.ads.zzbhw r5 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0094
            com.google.android.gms.internal.ads.zzfld r4 = new com.google.android.gms.internal.ads.zzfld
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbv r5 = com.google.android.gms.ads.internal.zzt.zzt()
            android.os.Looper r5 = r5.zzb()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzfbs r3 = r2.zza
            com.google.android.gms.internal.ads.zzfbr r3 = r3.zzb
            com.google.android.gms.internal.ads.zzfbj r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r4.zza(r3)
            return
        L_0x0061:
            boolean r4 = r2.zzk
            if (r4 == 0) goto L_0x0076
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.ads.internal.util.zze.zzj(r4)
            com.google.android.gms.internal.ads.zzdcf r4 = r2.zzi
            r0 = 10
            r1 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfcx.zzd(r0, r1, r1)
            r4.zza(r0)
        L_0x0076:
            boolean r4 = r2.zzk
            if (r4 != 0) goto L_0x0094
            com.google.android.gms.internal.ads.zzdlf r4 = r2.zzg     // Catch:{ zzdle -> 0x008e }
            com.google.android.gms.internal.ads.zzdcf r0 = r2.zzi     // Catch:{ zzdle -> 0x008e }
            r4.zza(r5, r3, r0)     // Catch:{ zzdle -> 0x008e }
            boolean r3 = r2.zzj     // Catch:{ zzdle -> 0x008e }
            if (r3 == 0) goto L_0x008a
            com.google.android.gms.internal.ads.zzdio r3 = r2.zzh     // Catch:{ zzdle -> 0x008e }
            r3.zza()     // Catch:{ zzdle -> 0x008e }
        L_0x008a:
            r3 = 1
            r2.zzk = r3
            return
        L_0x008e:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzdcf r4 = r2.zzi
            r4.zze(r3)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcvn.zzd(android.app.Activity, com.google.android.gms.internal.ads.zzbcm, boolean):void");
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
