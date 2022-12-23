package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdbl extends zzdg {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final List zzd;
    private final long zze;
    private final String zzf;
    private final zzefd zzg;
    private final Bundle zzh;

    public zzdbl(zzfbg zzfbg, String str, zzefd zzefd, zzfbj zzfbj) {
        String str2;
        String str3;
        String str4 = null;
        if (zzfbg == null) {
            str2 = null;
        } else {
            str2 = zzfbg.zzac;
        }
        this.zzb = str2;
        if (zzfbj == null) {
            str3 = null;
        } else {
            str3 = zzfbj.zzb;
        }
        this.zzc = str3;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str4 = zzfbg.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str4 != null ? str4 : str;
        this.zzd = zzefd.zzc();
        this.zzg = zzefd;
        this.zze = zzt.zzA().currentTimeMillis() / 1000;
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzfM)).booleanValue() || zzfbj == null) {
            this.zzh = new Bundle();
        } else {
            this.zzh = zzfbj.zzj;
        }
        this.zzf = (!((Boolean) zzay.zzc().zzb(zzbhy.zzhI)).booleanValue() || zzfbj == null || TextUtils.isEmpty(zzfbj.zzh)) ? "" : zzfbj.zzh;
    }

    public final long zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final Bundle zze() {
        return this.zzh;
    }

    public final zzu zzf() {
        zzefd zzefd = this.zzg;
        if (zzefd != null) {
            return zzefd.zza();
        }
        return null;
    }

    public final String zzg() {
        return this.zza;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final String zzj() {
        return this.zzc;
    }
}
