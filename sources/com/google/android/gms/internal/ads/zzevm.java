package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzevm implements zzgpu {
    public static zzete zza(Context context, zzcef zzcef, zzceg zzceg, Object obj, zzetw zzetw, zzeuz zzeuz, zzgpo zzgpo, zzgpo zzgpo2, zzgpo zzgpo3, zzgpo zzgpo4, zzgpo zzgpo5, zzgpo zzgpo6, zzgpo zzgpo7, zzgpo zzgpo8, zzgpo zzgpo9, Executor executor, zzfhq zzfhq, zzdwg zzdwg) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzeus) obj);
        zzetw zzetw2 = zzetw;
        hashSet.add(zzetw);
        zzeuz zzeuz2 = zzeuz;
        hashSet.add(zzeuz);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzeH)).booleanValue()) {
            hashSet.add((zzetb) zzgpo.zzb());
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzeI)).booleanValue()) {
            hashSet.add((zzetb) zzgpo2.zzb());
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzeJ)).booleanValue()) {
            hashSet.add((zzetb) zzgpo3.zzb());
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzeK)).booleanValue()) {
            hashSet.add((zzetb) zzgpo4.zzb());
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzeO)).booleanValue()) {
            hashSet.add((zzetb) zzgpo6.zzb());
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzeP)).booleanValue()) {
            hashSet.add((zzetb) zzgpo7.zzb());
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzcp)).booleanValue()) {
            hashSet.add((zzetb) zzgpo9.zzb());
        }
        return new zzete(context, executor, hashSet, zzfhq, zzdwg);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
