package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzecn extends zzbzl {
    private final Context zza;
    private final Executor zzb;
    private final zzfvk zzc;
    private final zzcaf zzd;
    private final zzcsl zze;
    private final ArrayDeque zzf;
    private final zzfhs zzg;
    private final zzcag zzh;
    private final zzecs zzi;

    public zzecn(Context context, Executor executor, zzfvk zzfvk, zzcag zzcag, zzcsl zzcsl, zzcaf zzcaf, ArrayDeque arrayDeque, zzecs zzecs, zzfhs zzfhs, byte[] bArr) {
        zzbhy.zzc(context);
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfvk;
        this.zzh = zzcag;
        this.zzd = zzcaf;
        this.zze = zzcsl;
        this.zzf = arrayDeque;
        this.zzi = zzecs;
        this.zzg = zzfhs;
    }

    private final synchronized zzeck zzl(String str) {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            zzeck zzeck = (zzeck) it.next();
            if (zzeck.zzd.equals(str)) {
                it.remove();
                return zzeck;
            }
        }
        return null;
    }

    private final synchronized zzeck zzm(String str) {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            zzeck zzeck = (zzeck) it.next();
            if (zzeck.zzc.equals(str)) {
                it.remove();
                return zzeck;
            }
        }
        return null;
    }

    private static zzfvj zzn(zzfvj zzfvj, zzfge zzfge, zzbsz zzbsz, zzfhq zzfhq, zzfhg zzfhg) {
        zzbsp zza2 = zzbsz.zza("AFMA_getAdDictionary", zzbsw.zza, zzece.zza);
        zzfhp.zzc(zzfvj, zzfhg);
        zzffj zza3 = zzfge.zzb(zzffy.BUILD_URL, zzfvj).zzf(zza2).zza();
        zzfhp.zzb(zza3, zzfhq, zzfhg);
        return zza3;
    }

    private static zzfvj zzo(zzbzu zzbzu, zzfge zzfge, zzett zzett) {
        zzeby zzeby = new zzeby(zzett);
        return zzfge.zzb(zzffy.GMS_SIGNALS, zzfva.zzi(zzbzu.zza)).zzf(zzeby).zze(zzebz.zza).zza();
    }

    private final synchronized void zzp(zzeck zzeck) {
        zzq();
        this.zzf.addLast(zzeck);
    }

    private final synchronized void zzq() {
        int intValue = ((Long) zzbju.zzc.zze()).intValue();
        while (this.zzf.size() >= intValue) {
            this.zzf.removeFirst();
        }
    }

    private final void zzr(zzfvj zzfvj, zzbzq zzbzq) {
        zzfva.zzr(zzfva.zzn(zzfvj, new zzech(this), zzcfv.zza), new zzecj(this, zzbzq), zzcfv.zzf);
    }

    public final zzfvj zzb(zzbzu zzbzu, int i) {
        if (!((Boolean) zzbju.zza.zze()).booleanValue()) {
            return zzfva.zzh(new Exception("Split request is disabled."));
        }
        zzfdu zzfdu = zzbzu.zzi;
        if (zzfdu == null) {
            return zzfva.zzh(new Exception("Pool configuration missing from request."));
        }
        if (zzfdu.zzc == 0 || zzfdu.zzd == 0) {
            return zzfva.zzh(new Exception("Caching is disabled."));
        }
        zzbsz zzb2 = zzt.zzf().zzb(this.zza, zzcfo.zza(), this.zzg);
        zzett zzp = this.zze.zzp(zzbzu, i);
        zzfge zzc2 = zzp.zzc();
        zzfvj zzo = zzo(zzbzu, zzc2, zzp);
        zzfhq zzd2 = zzp.zzd();
        zzfhg zza2 = zzfhf.zza(this.zza, 9);
        zzfvj zzn = zzn(zzo, zzc2, zzb2, zzd2, zza2);
        return zzc2.zza(zzffy.GET_URL_AND_CACHE_KEY, zzo, zzn).zza(new zzecd(this, zzn, zzo, zzbzu, zza2)).zza();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzfvj zzc(com.google.android.gms.internal.ads.zzbzu r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzbsq r2 = com.google.android.gms.ads.internal.zzt.zzf()
            android.content.Context r3 = r0.zza
            com.google.android.gms.internal.ads.zzcfo r4 = com.google.android.gms.internal.ads.zzcfo.zza()
            com.google.android.gms.internal.ads.zzfhs r5 = r0.zzg
            com.google.android.gms.internal.ads.zzbsz r2 = r2.zzb(r3, r4, r5)
            com.google.android.gms.internal.ads.zzcsl r3 = r0.zze
            r8 = r18
            com.google.android.gms.internal.ads.zzett r3 = r3.zzp(r1, r8)
            com.google.android.gms.internal.ads.zzbss r4 = com.google.android.gms.internal.ads.zzecm.zza
            com.google.android.gms.internal.ads.zzbsr r5 = com.google.android.gms.internal.ads.zzbsw.zzb
            java.lang.String r6 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.zzbsp r10 = r2.zza(r6, r4, r5)
            com.google.android.gms.internal.ads.zzbja r4 = com.google.android.gms.internal.ads.zzbju.zza
            java.lang.Object r4 = r4.zze()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 0
            if (r4 != 0) goto L_0x0046
            java.lang.String r4 = r1.zzj
            if (r4 == 0) goto L_0x0044
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0044
            java.lang.String r4 = "Request contained a PoolKey but split request is disabled."
            com.google.android.gms.ads.internal.util.zze.zza(r4)
        L_0x0044:
            r11 = r5
            goto L_0x0073
        L_0x0046:
            com.google.android.gms.internal.ads.zzbja r4 = com.google.android.gms.internal.ads.zzbju.zzd
            java.lang.Object r4 = r4.zze()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x005c
            java.lang.String r4 = r1.zzh
            com.google.android.gms.internal.ads.zzeck r4 = r0.zzm(r4)
        L_0x005a:
            r5 = r4
            goto L_0x006b
        L_0x005c:
            java.lang.String r4 = r1.zzj
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x006b
            java.lang.String r4 = r1.zzj
            com.google.android.gms.internal.ads.zzeck r4 = r0.zzl(r4)
            goto L_0x005a
        L_0x006b:
            if (r5 != 0) goto L_0x0044
            java.lang.String r4 = "Request contained a PoolKey but no matching parameters were found."
            com.google.android.gms.ads.internal.util.zze.zza(r4)
            goto L_0x0044
        L_0x0073:
            if (r11 != 0) goto L_0x007e
            android.content.Context r4 = r0.zza
            r5 = 9
            com.google.android.gms.internal.ads.zzfhg r4 = com.google.android.gms.internal.ads.zzfhf.zza(r4, r5)
            goto L_0x0080
        L_0x007e:
            com.google.android.gms.internal.ads.zzfhg r4 = r11.zze
        L_0x0080:
            r12 = r4
            com.google.android.gms.internal.ads.zzfhq r13 = r3.zzd()
            android.os.Bundle r4 = r1.zza
            java.lang.String r5 = "ad_types"
            java.util.ArrayList r4 = r4.getStringArrayList(r5)
            r13.zzd(r4)
            com.google.android.gms.internal.ads.zzecu r14 = new com.google.android.gms.internal.ads.zzecu
            java.lang.String r4 = r1.zzg
            r14.<init>(r4, r13, r12)
            android.content.Context r5 = r0.zza
            com.google.android.gms.internal.ads.zzcfo r4 = r1.zzb
            java.lang.String r6 = r4.zza
            com.google.android.gms.internal.ads.zzcag r7 = r0.zzh
            com.google.android.gms.internal.ads.zzecr r15 = new com.google.android.gms.internal.ads.zzecr
            r9 = 0
            r4 = r15
            r8 = r18
            r4.<init>(r5, r6, r7, r8, r9)
            com.google.android.gms.internal.ads.zzfge r4 = r3.zzc()
            android.content.Context r5 = r0.zza
            r6 = 11
            com.google.android.gms.internal.ads.zzfhg r5 = com.google.android.gms.internal.ads.zzfhf.zza(r5, r6)
            r6 = 10
            r7 = 1
            r8 = 0
            r9 = 2
            if (r11 != 0) goto L_0x011a
            com.google.android.gms.internal.ads.zzfvj r1 = zzo(r1, r4, r3)
            com.google.android.gms.internal.ads.zzfvj r2 = zzn(r1, r4, r2, r13, r12)
            android.content.Context r3 = r0.zza
            com.google.android.gms.internal.ads.zzfhg r3 = com.google.android.gms.internal.ads.zzfhf.zza(r3, r6)
            com.google.android.gms.internal.ads.zzffy r6 = com.google.android.gms.internal.ads.zzffy.HTTP
            com.google.android.gms.internal.ads.zzfvj[] r11 = new com.google.android.gms.internal.ads.zzfvj[r9]
            r11[r8] = r2
            r11[r7] = r1
            com.google.android.gms.internal.ads.zzffm r6 = r4.zza(r6, r11)
            com.google.android.gms.internal.ads.zzecb r11 = new com.google.android.gms.internal.ads.zzecb
            r11.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzffv r6 = r6.zza(r11)
            com.google.android.gms.internal.ads.zzffv r6 = r6.zze(r14)
            com.google.android.gms.internal.ads.zzfhl r11 = new com.google.android.gms.internal.ads.zzfhl
            r11.<init>(r3)
            com.google.android.gms.internal.ads.zzffv r6 = r6.zze(r11)
            com.google.android.gms.internal.ads.zzffv r6 = r6.zze(r15)
            com.google.android.gms.internal.ads.zzffj r6 = r6.zza()
            com.google.android.gms.internal.ads.zzfhp.zza(r6, r13, r3)
            com.google.android.gms.internal.ads.zzfhp.zzc(r6, r5)
            com.google.android.gms.internal.ads.zzffy r3 = com.google.android.gms.internal.ads.zzffy.PRE_PROCESS
            r11 = 3
            com.google.android.gms.internal.ads.zzfvj[] r11 = new com.google.android.gms.internal.ads.zzfvj[r11]
            r11[r8] = r1
            r11[r7] = r2
            r11[r9] = r6
            com.google.android.gms.internal.ads.zzffm r3 = r4.zza(r3, r11)
            com.google.android.gms.internal.ads.zzecc r4 = new com.google.android.gms.internal.ads.zzecc
            r4.<init>(r6, r1, r2)
            com.google.android.gms.internal.ads.zzffv r1 = r3.zza(r4)
            com.google.android.gms.internal.ads.zzffv r1 = r1.zzf(r10)
            com.google.android.gms.internal.ads.zzffj r1 = r1.zza()
            goto L_0x016f
        L_0x011a:
            com.google.android.gms.internal.ads.zzect r1 = new com.google.android.gms.internal.ads.zzect
            org.json.JSONObject r2 = r11.zzb
            com.google.android.gms.internal.ads.zzbzx r3 = r11.zza
            r1.<init>(r2, r3)
            android.content.Context r2 = r0.zza
            com.google.android.gms.internal.ads.zzfhg r2 = com.google.android.gms.internal.ads.zzfhf.zza(r2, r6)
            com.google.android.gms.internal.ads.zzffy r3 = com.google.android.gms.internal.ads.zzffy.HTTP
            com.google.android.gms.internal.ads.zzfvj r1 = com.google.android.gms.internal.ads.zzfva.zzi(r1)
            com.google.android.gms.internal.ads.zzffv r1 = r4.zzb(r3, r1)
            com.google.android.gms.internal.ads.zzffv r1 = r1.zze(r14)
            com.google.android.gms.internal.ads.zzfhl r3 = new com.google.android.gms.internal.ads.zzfhl
            r3.<init>(r2)
            com.google.android.gms.internal.ads.zzffv r1 = r1.zze(r3)
            com.google.android.gms.internal.ads.zzffv r1 = r1.zze(r15)
            com.google.android.gms.internal.ads.zzffj r1 = r1.zza()
            com.google.android.gms.internal.ads.zzfhp.zza(r1, r13, r2)
            com.google.android.gms.internal.ads.zzfvj r2 = com.google.android.gms.internal.ads.zzfva.zzi(r11)
            com.google.android.gms.internal.ads.zzfhp.zzc(r1, r5)
            com.google.android.gms.internal.ads.zzffy r3 = com.google.android.gms.internal.ads.zzffy.PRE_PROCESS
            com.google.android.gms.internal.ads.zzfvj[] r6 = new com.google.android.gms.internal.ads.zzfvj[r9]
            r6[r8] = r1
            r6[r7] = r2
            com.google.android.gms.internal.ads.zzffm r3 = r4.zza(r3, r6)
            com.google.android.gms.internal.ads.zzecg r4 = new com.google.android.gms.internal.ads.zzecg
            r4.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzffv r1 = r3.zza(r4)
            com.google.android.gms.internal.ads.zzffv r1 = r1.zzf(r10)
            com.google.android.gms.internal.ads.zzffj r1 = r1.zza()
        L_0x016f:
            com.google.android.gms.internal.ads.zzfhp.zza(r1, r13, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecn.zzc(com.google.android.gms.internal.ads.zzbzu, int):com.google.android.gms.internal.ads.zzfvj");
    }

    public final zzfvj zzd(zzbzu zzbzu, int i) {
        zzbsz zzb2 = zzt.zzf().zzb(this.zza, zzcfo.zza(), this.zzg);
        if (!((Boolean) zzbjz.zza.zze()).booleanValue()) {
            return zzfva.zzh(new Exception("Signal collection disabled."));
        }
        zzett zzp = this.zze.zzp(zzbzu, i);
        zzete zza2 = zzp.zza();
        return zzp.zzc().zzb(zzffy.GET_SIGNALS, zzfva.zzi(zzbzu.zza)).zzf(new zzecf(zza2)).zzb(zzffy.JS_SIGNALS).zzf(zzb2.zza("google.afma.request.getSignals", zzbsw.zza, zzbsw.zzb)).zza();
    }

    public final void zze(zzbzu zzbzu, zzbzq zzbzq) {
        zzr(zzb(zzbzu, Binder.getCallingUid()), zzbzq);
    }

    public final void zzf(zzbzu zzbzu, zzbzq zzbzq) {
        zzr(zzd(zzbzu, Binder.getCallingUid()), zzbzq);
    }

    public final void zzg(zzbzu zzbzu, zzbzq zzbzq) {
        zzfvj zzc2 = zzc(zzbzu, Binder.getCallingUid());
        zzr(zzc2, zzbzq);
        if (((Boolean) zzbjm.zzg.zze()).booleanValue()) {
            zzc2.zzc(new zzeca(this), this.zzc);
        } else {
            zzc2.zzc(new zzeca(this), this.zzb);
        }
    }

    public final void zzh(String str, zzbzq zzbzq) {
        zzr(zzi(str), zzbzq);
    }

    public final zzfvj zzi(String str) {
        zzeck zzeck;
        if (!((Boolean) zzbju.zza.zze()).booleanValue()) {
            return zzfva.zzh(new Exception("Split request is disabled."));
        }
        zzeci zzeci = new zzeci(this);
        if (((Boolean) zzbju.zzd.zze()).booleanValue()) {
            zzeck = zzm(str);
        } else {
            zzeck = zzl(str);
        }
        if (zzeck == null) {
            return zzfva.zzh(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzfva.zzi(zzeci);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzj(zzfvj zzfvj, zzfvj zzfvj2, zzbzu zzbzu, zzfhg zzfhg) throws Exception {
        String zzc2 = ((zzbzx) zzfvj.get()).zzc();
        String str = zzbzu.zzh;
        zzp(new zzeck((zzbzx) zzfvj.get(), (JSONObject) zzfvj2.get(), str, zzc2, zzfhg));
        return new ByteArrayInputStream(zzc2.getBytes(zzfog.zzc));
    }
}
