package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzekf implements zzeey {
    private final Context zza;
    private final zzcwr zzb;
    private final zzbit zzc;
    private final zzfvk zzd;
    private final zzfge zze;

    public zzekf(Context context, zzcwr zzcwr, zzfge zzfge, zzfvk zzfvk, zzbit zzbit) {
        this.zza = context;
        this.zzb = zzcwr;
        this.zze = zzfge;
        this.zzd = zzfvk;
        this.zzc = zzbit;
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg) {
        zzcvv zza2 = this.zzb.zza(new zzcyl(zzfbs, zzfbg, (String) null), new zzekd(this, new View(this.zza), (zzcli) null, zzekb.zza, (zzfbh) zzfbg.zzv.get(0)));
        zzeke zzk = zza2.zzk();
        zzfbl zzfbl = zzfbg.zzt;
        zzbio zzbio = new zzbio(zzk, zzfbl.zzb, zzfbl.zza);
        zzfge zzfge = this.zze;
        return zzffo.zzd(new zzekc(this, zzbio), this.zzd, zzffy.CUSTOM_RENDER_SYN, zzfge).zzb(zzffy.CUSTOM_RENDER_ACK).zzd(zzfva.zzi(zza2.zza())).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzt;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzfbs r1, com.google.android.gms.internal.ads.zzfbg r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbit r1 = r0.zzc
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.zzfbl r1 = r2.zzt
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekf.zzb(com.google.android.gms.internal.ads.zzfbs, com.google.android.gms.internal.ads.zzfbg):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbio zzbio) throws Exception {
        this.zzc.zze(zzbio);
    }
}
