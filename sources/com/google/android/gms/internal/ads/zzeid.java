package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzeid implements zzeey {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg) {
        zzfbg zzfbg2 = zzfbg;
        String optString = zzfbg2.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfby zzfby = zzfbs.zza.zza;
        zzfbw zzfbw = new zzfbw();
        zzfbw.zzp(zzfby);
        zzfbw.zzs(optString);
        Bundle zzd = zzd(zzfby.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzfbg2.zzw.optString("mad_hac", (String) null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzfbg2.zzw.optString("adJson", (String) null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfbg2.zzE.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfbg2.zzE.optString(next, (String) null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        zzl zzl = zzfby.zzd;
        zzl zzl2 = r5;
        zzl zzl3 = new zzl(zzl.zza, zzl.zzb, zzd2, zzl.zzd, zzl.zze, zzl.zzf, zzl.zzg, zzl.zzh, zzl.zzi, zzl.zzj, zzl.zzk, zzl.zzl, zzd, zzl.zzn, zzl.zzo, zzl.zzp, zzl.zzq, zzl.zzr, zzl.zzs, zzl.zzt, zzl.zzu, zzl.zzv, zzl.zzw, zzl.zzx);
        zzfbw.zzE(zzl2);
        zzfby zzG = zzfbw.zzG();
        Bundle bundle = new Bundle();
        zzfbs zzfbs2 = zzfbs;
        zzfbj zzfbj = zzfbs2.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(zzfbj.zza));
        bundle2.putInt("refresh_interval", zzfbj.zzc);
        bundle2.putString("gws_query_id", zzfbj.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfbs2.zza.zza.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        zzfbg zzfbg3 = zzfbg;
        bundle3.putString("allocation_id", zzfbg3.zzx);
        bundle3.putStringArrayList("click_urls", new ArrayList(zzfbg3.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList(zzfbg3.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(zzfbg3.zzq));
        bundle3.putStringArrayList("fill_urls", new ArrayList(zzfbg3.zzn));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(zzfbg3.zzh));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(zzfbg3.zzi));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(zzfbg3.zzj));
        bundle3.putString("transaction_id", zzfbg3.zzk);
        bundle3.putString("valid_from_timestamp", zzfbg3.zzl);
        bundle3.putBoolean("is_closable_area_disabled", zzfbg3.zzQ);
        if (zzfbg3.zzm != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzfbg3.zzm.zzb);
            bundle4.putString("rb_type", zzfbg3.zzm.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzG, bundle);
    }

    public final boolean zzb(zzfbs zzfbs, zzfbg zzfbg) {
        return !TextUtils.isEmpty(zzfbg.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    /* access modifiers changed from: protected */
    public abstract zzfvj zzc(zzfby zzfby, Bundle bundle);
}
