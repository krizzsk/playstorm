package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdnp {
    zzbmb zza;
    zzbly zzb;
    zzbmo zzc;
    zzbml zzd;
    zzbra zze;
    final SimpleArrayMap zzf = new SimpleArrayMap();
    final SimpleArrayMap zzg = new SimpleArrayMap();

    public final zzdnp zza(zzbly zzbly) {
        this.zzb = zzbly;
        return this;
    }

    public final zzdnp zzb(zzbmb zzbmb) {
        this.zza = zzbmb;
        return this;
    }

    public final zzdnp zzc(String str, zzbmh zzbmh, zzbme zzbme) {
        this.zzf.put(str, zzbmh);
        if (zzbme != null) {
            this.zzg.put(str, zzbme);
        }
        return this;
    }

    public final zzdnp zzd(zzbra zzbra) {
        this.zze = zzbra;
        return this;
    }

    public final zzdnp zze(zzbml zzbml) {
        this.zzd = zzbml;
        return this;
    }

    public final zzdnp zzf(zzbmo zzbmo) {
        this.zzc = zzbmo;
        return this;
    }

    public final zzdnr zzg() {
        return new zzdnr(this);
    }
}
