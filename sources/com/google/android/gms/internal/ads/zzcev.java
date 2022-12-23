package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcev implements zzbbf {
    final zzces zza;
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private final Object zzd = new Object();
    private final zzg zze;
    private final zzcet zzf;
    private boolean zzg = false;

    public zzcev(String str, zzg zzg2) {
        this.zza = new zzces(str, zzg2);
        this.zze = zzg2;
        this.zzf = new zzcet();
    }

    public final void zza(boolean z) {
        long currentTimeMillis = zzt.zzA().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.zze.zzd() > ((Long) zzay.zzc().zzb(zzbhy.zzaN)).longValue()) {
                this.zza.zzd = -1;
            } else {
                this.zza.zzd = this.zze.zzc();
            }
            this.zzg = true;
            return;
        }
        this.zze.zzt(currentTimeMillis);
        this.zze.zzJ(this.zza.zzd);
    }

    public final zzcek zzb(Clock clock, String str) {
        return new zzcek(clock, this, this.zzf.zza(), str);
    }

    public final void zzc(zzcek zzcek) {
        synchronized (this.zzd) {
            this.zzb.add(zzcek);
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzh(zzl zzl, long j) {
        synchronized (this.zzd) {
            this.zza.zzf(zzl, j);
        }
    }

    public final void zzi(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzj() {
        return this.zzg;
    }

    public final Bundle zzk(Context context, zzfdd zzfdd) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle(TapjoyConstants.TJC_APP_PLACEMENT, this.zza.zza(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zzcek) it2.next()).zza());
            }
            bundle.putParcelableArrayList(CampaignUnit.JSON_KEY_ADS, arrayList);
            zzfdd.zzc(hashSet);
            return bundle;
        }
        zzceu zzceu = (zzceu) it.next();
        throw null;
    }
}
