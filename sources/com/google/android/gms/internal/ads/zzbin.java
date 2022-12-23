package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbin {
    private final List zza = new LinkedList();
    private final Map zzb = new LinkedHashMap();
    private final Object zzc = new Object();

    public zzbin(boolean z, String str, String str2) {
        this.zzb.put("action", "make_wv");
        this.zzb.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    public static final zzbik zzf() {
        return new zzbik(zzt.zzA().elapsedRealtime(), (String) null, (zzbik) null);
    }

    public final zzbim zza() {
        zzbim zzbim;
        boolean booleanValue = ((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbik zzbik : this.zza) {
                long zza2 = zzbik.zza();
                String zzc2 = zzbik.zzc();
                zzbik zzb2 = zzbik.zzb();
                if (zzb2 != null && zza2 > 0) {
                    sb.append(zzc2);
                    sb.append('.');
                    sb.append(zza2 - zzb2.zza());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzb2.zza()))) {
                            hashMap.put(Long.valueOf(zzb2.zza()), new StringBuilder(zzc2));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb2.zza()));
                            sb2.append('+');
                            sb2.append(zzc2);
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(zzt.zzA().currentTimeMillis() + (((Long) entry.getKey()).longValue() - zzt.zzA().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbim = new zzbim(sb.toString(), str);
        }
        return zzbim;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            zzt.zzo().zzf();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbin zzbin) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbid zzf;
        if (!TextUtils.isEmpty(str2) && (zzf = zzt.zzo().zzf()) != null) {
            synchronized (this.zzc) {
                zzbij zza2 = zzf.zza(str);
                Map map = this.zzb;
                map.put(str, zza2.zza((String) map.get(str), str2));
            }
        }
    }

    public final boolean zze(zzbik zzbik, long j, String... strArr) {
        synchronized (this.zzc) {
            for (int i = 0; i <= 0; i++) {
                this.zza.add(new zzbik(j, strArr[i], zzbik));
            }
        }
        return true;
    }
}
