package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.zzb;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzegd implements zzefg {
    private final Context zza;
    private final zzcwr zzb;
    private final Executor zzc;

    public zzegd(Context context, zzcwr zzcwr, Executor executor) {
        this.zza = context;
        this.zzb = zzcwr;
        this.zzc = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfbs r7, com.google.android.gms.internal.ads.zzfbg r8, com.google.android.gms.internal.ads.zzefb r9) throws com.google.android.gms.internal.ads.zzfcd, com.google.android.gms.internal.ads.zzeio {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zzgy
            com.google.android.gms.internal.ads.zzbhw r1 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0077
            boolean r0 = r8.zzai
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfct r0 = (com.google.android.gms.internal.ads.zzfct) r0
            com.google.android.gms.internal.ads.zzbui r0 = r0.zzc()
            if (r0 == 0) goto L_0x0067
            com.google.android.gms.dynamic.IObjectWrapper r2 = r0.zze()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ RemoteException -> 0x0060 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ RemoteException -> 0x0060 }
            boolean r0 = r0.zzf()     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.zzfvj r0 = com.google.android.gms.internal.ads.zzfva.zzi(r1)
            com.google.android.gms.internal.ads.zzegc r3 = new com.google.android.gms.internal.ads.zzegc
            r3.<init>(r6, r2, r8)
            com.google.android.gms.internal.ads.zzfvk r2 = com.google.android.gms.internal.ads.zzcfv.zze
            com.google.android.gms.internal.ads.zzfvj r0 = com.google.android.gms.internal.ads.zzfva.zzn(r0, r3, r2)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            goto L_0x007f
        L_0x004a:
            r7 = move-exception
            goto L_0x004d
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            com.google.android.gms.internal.ads.zzfcd r8 = new com.google.android.gms.internal.ads.zzfcd
            r8.<init>(r7)
            throw r8
        L_0x0053:
            com.google.android.gms.internal.ads.zzfcd r7 = new com.google.android.gms.internal.ads.zzfcd
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "BannerAdapterWrapper interscrollerView should not be null"
            r8.<init>(r9)
            r7.<init>(r8)
            throw r7
        L_0x0060:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzfcd r8 = new com.google.android.gms.internal.ads.zzfcd
            r8.<init>(r7)
            throw r8
        L_0x0067:
            java.lang.String r7 = "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."
            com.google.android.gms.ads.internal.util.zze.zzg(r7)
            com.google.android.gms.internal.ads.zzfcd r8 = new com.google.android.gms.internal.ads.zzfcd
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r7)
            r8.<init>(r9)
            throw r8
        L_0x0077:
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfct r0 = (com.google.android.gms.internal.ads.zzfct) r0
            android.view.View r2 = r0.zza()
        L_0x007f:
            com.google.android.gms.internal.ads.zzcwr r0 = r6.zzb
            com.google.android.gms.internal.ads.zzcyl r3 = new com.google.android.gms.internal.ads.zzcyl
            java.lang.String r4 = r9.zza
            r3.<init>(r7, r8, r4)
            com.google.android.gms.internal.ads.zzcwb r7 = new com.google.android.gms.internal.ads.zzcwb
            java.lang.Object r4 = r9.zzb
            com.google.android.gms.internal.ads.zzfct r4 = (com.google.android.gms.internal.ads.zzfct) r4
            com.google.android.gms.internal.ads.zzegb r5 = new com.google.android.gms.internal.ads.zzegb
            r5.<init>(r4)
            java.util.List r8 = r8.zzv
            r4 = 0
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.zzfbh r8 = (com.google.android.gms.internal.ads.zzfbh) r8
            r7.<init>(r2, r1, r5, r8)
            com.google.android.gms.internal.ads.zzcvv r7 = r0.zza(r3, r7)
            com.google.android.gms.internal.ads.zzdja r8 = r7.zzg()
            r8.zza(r2)
            com.google.android.gms.internal.ads.zzdcr r8 = r7.zzd()
            com.google.android.gms.internal.ads.zzcti r0 = new com.google.android.gms.internal.ads.zzcti
            java.lang.Object r1 = r9.zzb
            com.google.android.gms.internal.ads.zzfct r1 = (com.google.android.gms.internal.ads.zzfct) r1
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r6.zzc
            r8.zzj(r0, r1)
            com.google.android.gms.internal.ads.zzddc r8 = r9.zzc
            com.google.android.gms.internal.ads.zzegu r8 = (com.google.android.gms.internal.ads.zzegu) r8
            com.google.android.gms.internal.ads.zzeka r9 = r7.zzi()
            r8.zzc(r9)
            com.google.android.gms.internal.ads.zzcvu r7 = r7.zza()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegd.zza(com.google.android.gms.internal.ads.zzfbs, com.google.android.gms.internal.ads.zzfbg, com.google.android.gms.internal.ads.zzefb):java.lang.Object");
    }

    public final void zzb(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd {
        zzq zza2;
        zzq zzq = zzfbs.zza.zza.zze;
        if (zzq.zzn) {
            zza2 = new zzq(this.zza, zzb.zzd(zzq.zze, zzq.zzb));
        } else {
            if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgy)).booleanValue() || !zzfbg.zzai) {
                zza2 = zzfcc.zza(this.zza, zzfbg.zzv);
            } else {
                zza2 = new zzq(this.zza, zzb.zze(zzq.zze, zzq.zzb));
            }
        }
        zzq zzq2 = zza2;
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgy)).booleanValue() || !zzfbg.zzai) {
            ((zzfct) zzefb.zzb).zzl(this.zza, zzq2, zzfbs.zza.zza.zzd, zzfbg.zzw.toString(), zzbu.zzl(zzfbg.zzt), (zzbuf) zzefb.zzc);
        } else {
            ((zzfct) zzefb.zzb).zzm(this.zza, zzq2, zzfbs.zza.zza.zzd, zzfbg.zzw.toString(), zzbu.zzl(zzfbg.zzt), (zzbuf) zzefb.zzc);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(View view, zzfbg zzfbg, Object obj) throws Exception {
        return zzfva.zzi(zzcxi.zza(this.zza, view, zzfbg));
    }
}
