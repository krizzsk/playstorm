package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzfg;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfby {
    public final zzfg zza;
    public final zzbqr zzb;
    public final zzemc zzc;
    public final zzl zzd;
    public final zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbko zzi;
    public final zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final zzbz zzn;
    public final zzfbo zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final zzcd zzr;

    /* synthetic */ zzfby(zzfbw zzfbw, zzfbx zzfbx) {
        zzfg zzfg;
        zzbko zzbko;
        this.zze = zzfbw.zzb;
        this.zzf = zzfbw.zzc;
        this.zzr = zzfbw.zzs;
        int i = zzfbw.zza.zza;
        long j = zzfbw.zza.zzb;
        Bundle bundle = zzfbw.zza.zzc;
        int i2 = zzfbw.zza.zzd;
        List list = zzfbw.zza.zze;
        boolean z = zzfbw.zza.zzf;
        int i3 = zzfbw.zza.zzg;
        boolean z2 = true;
        if (!zzfbw.zza.zzh && !zzfbw.zze) {
            z2 = false;
        }
        this.zzd = new zzl(i, j, bundle, i2, list, z, i3, z2, zzfbw.zza.zzi, zzfbw.zza.zzj, zzfbw.zza.zzk, zzfbw.zza.zzl, zzfbw.zza.zzm, zzfbw.zza.zzn, zzfbw.zza.zzo, zzfbw.zza.zzp, zzfbw.zza.zzq, zzfbw.zza.zzr, zzfbw.zza.zzs, zzfbw.zza.zzt, zzfbw.zza.zzu, zzfbw.zza.zzv, zzs.zza(zzfbw.zza.zzw), zzfbw.zza.zzx);
        if (zzfbw.zzd != null) {
            zzfg = zzfbw.zzd;
        } else {
            zzfg = zzfbw.zzh != null ? zzfbw.zzh.zzf : null;
        }
        this.zza = zzfg;
        this.zzg = zzfbw.zzf;
        this.zzh = zzfbw.zzg;
        if (zzfbw.zzf == null) {
            zzbko = null;
        } else {
            zzbko = zzfbw.zzh == null ? new zzbko(new NativeAdOptions.Builder().build()) : zzfbw.zzh;
        }
        this.zzi = zzbko;
        this.zzj = zzfbw.zzi;
        this.zzk = zzfbw.zzm;
        this.zzl = zzfbw.zzj;
        this.zzm = zzfbw.zzk;
        this.zzn = zzfbw.zzl;
        this.zzb = zzfbw.zzn;
        this.zzo = new zzfbo(zzfbw.zzo, (zzfbn) null);
        this.zzp = zzfbw.zzp;
        this.zzc = zzfbw.zzq;
        this.zzq = zzfbw.zzr;
    }

    public final zzbmr zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.zzb();
        }
        return this.zzl.zza();
    }
}
