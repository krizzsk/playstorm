package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzesb implements zzetb {
    final String zza;
    private final zzfvk zzb;
    private final ScheduledExecutorService zzc;
    private final zzekz zzd;
    private final Context zze;
    private final zzfby zzf;
    private final zzekv zzg;
    private final zzdub zzh;

    public zzesb(zzfvk zzfvk, ScheduledExecutorService scheduledExecutorService, String str, zzekz zzekz, Context context, zzfby zzfby, zzekv zzekv, zzdub zzdub) {
        this.zzb = zzfvk;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzekz;
        this.zze = context;
        this.zzf = zzfby;
        this.zzg = zzekv;
        this.zzh = zzdub;
    }

    public static /* synthetic */ zzfvj zzc(zzesb zzesb) {
        Map zza2 = zzesb.zzd.zza(zzesb.zza, ((Boolean) zzay.zzc().zzb(zzbhy.zzii)).booleanValue() ? zzesb.zzf.zzf.toLowerCase(Locale.ROOT) : zzesb.zzf.zzf);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zzfrk) zza2).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = zzesb.zzf.zzd.zzm;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(zzesb.zze(str, list, bundle, true, true));
        }
        for (Map.Entry value : ((zzfrk) zzesb.zzd.zzb()).entrySet()) {
            zzeld zzeld = (zzeld) value.getValue();
            String str2 = zzeld.zza;
            Bundle bundle3 = zzesb.zzf.zzd.zzm;
            arrayList.add(zzesb.zze(str2, Collections.singletonList(zzeld.zzd), bundle3 != null ? bundle3.getBundle(str2) : null, zzeld.zzb, zzeld.zzc));
        }
        return zzfva.zzc(arrayList).zza(new zzery(arrayList), zzesb.zzb);
    }

    private final zzfur zze(String str, List list, Bundle bundle, boolean z, boolean z2) {
        zzfur zzv = zzfur.zzv(zzfva.zzl(new zzerz(this, str, list, bundle, z, z2), this.zzb));
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzbs)).booleanValue()) {
            zzv = (zzfur) zzfva.zzo(zzv, ((Long) zzay.zzc().zzb(zzbhy.zzbl)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfur) zzfva.zzf(zzv, Throwable.class, new zzesa(str), this.zzb);
    }

    public final int zza() {
        return 32;
    }

    public final zzfvj zzb() {
        return zzfva.zzl(new zzerw(this), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzd(String str, List list, Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbvs zzbvs;
        zzbvs zzb2;
        zzcga zzcga = new zzcga();
        if (z2) {
            this.zzg.zzb(str);
            zzb2 = this.zzg.zza(str);
        } else {
            try {
                zzb2 = this.zzh.zzb(str);
            } catch (RemoteException e) {
                zze.zzh("Couldn't create RTB adapter : ", e);
                zzbvs = null;
            }
        }
        zzbvs = zzb2;
        if (zzbvs == null) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzbn)).booleanValue()) {
                zzelc.zzb(str, zzcga);
            } else {
                throw null;
            }
        } else {
            zzelc zzelc = new zzelc(str, zzbvs, zzcga);
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzbs)).booleanValue()) {
                this.zzc.schedule(new zzerx(zzelc), ((Long) zzay.zzc().zzb(zzbhy.zzbl)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                zzbvs.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzelc);
            } else {
                zzelc.zzd();
            }
        }
        return zzcga;
    }
}
