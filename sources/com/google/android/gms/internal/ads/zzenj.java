package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzenj implements zzeta {
    final zzfby zza;
    private final long zzb;

    public zzenj(zzfby zzfby, long j) {
        Preconditions.checkNotNull(zzfby, "the targeting must not be null");
        this.zza = zzfby;
        this.zzb = j;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzl zzl = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzl.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i = this.zza.zzo.zza;
        int i2 = i - 1;
        if (i != 0) {
            boolean z = true;
            if (i2 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i2 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            zzfcj.zzg(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzl.zzb)), zzl.zzb != -1);
            zzfcj.zzb(bundle, "extras", zzl.zzc);
            zzfcj.zzf(bundle, "cust_gender", Integer.valueOf(zzl.zzd), zzl.zzd != -1);
            zzfcj.zzd(bundle, "kw", zzl.zze);
            zzfcj.zzf(bundle, "tag_for_child_directed_treatment", Integer.valueOf(zzl.zzg), zzl.zzg != -1);
            if (zzl.zzf) {
                bundle.putBoolean("test_request", true);
            }
            zzfcj.zzf(bundle, "d_imp_hdr", 1, zzl.zza >= 2 && zzl.zzh);
            String str = zzl.zzi;
            zzfcj.zzg(bundle, "ppid", str, zzl.zza >= 2 && !TextUtils.isEmpty(str));
            Location location = zzl.zzk;
            if (location != null) {
                Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(location.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", valueOf.floatValue());
                bundle2.putLong("lat", valueOf3.longValue());
                bundle2.putLong(Constants.LONG, valueOf4.longValue());
                bundle2.putLong("time", valueOf2.longValue());
                bundle.putBundle("uule", bundle2);
            }
            zzfcj.zzc(bundle, "url", zzl.zzl);
            zzfcj.zzd(bundle, "neighboring_content_urls", zzl.zzv);
            zzfcj.zzb(bundle, "custom_targeting", zzl.zzn);
            zzfcj.zzd(bundle, "category_exclusions", zzl.zzo);
            zzfcj.zzc(bundle, "request_agent", zzl.zzp);
            zzfcj.zzc(bundle, "request_pkg", zzl.zzq);
            zzfcj.zze(bundle, "is_designed_for_families", Boolean.valueOf(zzl.zzr), zzl.zza >= 7);
            if (zzl.zza >= 8) {
                Integer valueOf5 = Integer.valueOf(zzl.zzt);
                if (zzl.zzt == -1) {
                    z = false;
                }
                zzfcj.zzf(bundle, "tag_for_under_age_of_consent", valueOf5, z);
                zzfcj.zzc(bundle, "max_ad_content_rating", zzl.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}
