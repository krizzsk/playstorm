package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.p374my.tracker.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfhq implements Runnable {
    private final List zza = new ArrayList();
    private final zzfhs zzb;
    private String zzc;
    private String zzd;
    private zzfbr zze;
    private zze zzf;
    private Future zzg;
    private int zzh = 2;

    zzfhq(zzfhs zzfhs) {
        this.zzb = zzfhs;
    }

    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfhq zza(zzfhg zzfhg) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfhg.zzg();
            list.add(zzfhg);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzcfv.zzd.schedule(this, (long) ((Integer) zzay.zzc().zzb(zzbhy.zzhm)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfhq zzb(String str) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue() && zzfhp.zzd(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfhq zzc(zze zze2) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            this.zzf = zze2;
        }
        return this;
    }

    public final synchronized zzfhq zzd(ArrayList arrayList) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            if (arrayList.contains(AdFormat.BANNER)) {
                this.zzh = 3;
            } else if (arrayList.contains("interstitial")) {
                this.zzh = 4;
            } else if (arrayList.contains("native")) {
                this.zzh = 8;
            } else if (arrayList.contains("rewarded")) {
                this.zzh = 5;
            } else if (arrayList.contains("app_open_ad")) {
                this.zzh = 7;
            } else if (arrayList.contains("rewarded_interstitial")) {
                this.zzh = 6;
            }
        }
        return this;
    }

    public final synchronized zzfhq zze(String str) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfhq zzf(zzfbr zzfbr) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            this.zze = zzfbr;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfhg zzfhg : this.zza) {
                int i = this.zzh;
                if (i != 2) {
                    zzfhg.zzk(i);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfhg.zzd(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd) && !zzfhg.zzi()) {
                    zzfhg.zzc(this.zzd);
                }
                zzfbr zzfbr = this.zze;
                if (zzfbr != null) {
                    zzfhg.zzb(zzfbr);
                } else {
                    zze zze2 = this.zzf;
                    if (zze2 != null) {
                        zzfhg.zza(zze2);
                    }
                }
                this.zzb.zzb(zzfhg.zzj());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzfhq zzh(int i) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            this.zzh = i;
        }
        return this;
    }
}
