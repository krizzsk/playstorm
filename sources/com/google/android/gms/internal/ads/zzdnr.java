package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdnr {
    public static final zzdnr zza = new zzdnr(new zzdnp());
    private final zzbmb zzb;
    private final zzbly zzc;
    private final zzbmo zzd;
    private final zzbml zze;
    private final zzbra zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdnr(zzdnp zzdnp) {
        this.zzb = zzdnp.zza;
        this.zzc = zzdnp.zzb;
        this.zzd = zzdnp.zzc;
        this.zzg = new SimpleArrayMap(zzdnp.zzf);
        this.zzh = new SimpleArrayMap(zzdnp.zzg);
        this.zze = zzdnp.zzd;
        this.zzf = zzdnp.zze;
    }

    public final zzbly zza() {
        return this.zzc;
    }

    public final zzbmb zzb() {
        return this.zzb;
    }

    public final zzbme zzc(String str) {
        return (zzbme) this.zzh.get(str);
    }

    public final zzbmh zzd(String str) {
        return (zzbmh) this.zzg.get(str);
    }

    public final zzbml zze() {
        return this.zze;
    }

    public final zzbmo zzf() {
        return this.zzd;
    }

    public final zzbra zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i = 0; i < this.zzg.size(); i++) {
            arrayList.add((String) this.zzg.keyAt(i));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
