package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.p374my.tracker.ads.AdFormat;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeri implements zzetb {
    private final zzfvk zza;
    private final Context zzb;
    private final Set zzc;

    public zzeri(zzfvk zzfvk, Context context, Set set) {
        this.zza = zzfvk;
        this.zzb = context;
        this.zzc = set;
    }

    public final int zza() {
        return 27;
    }

    public final zzfvj zzb() {
        return this.zza.zzb(new zzerh(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzerj zzc() throws Exception {
        String str = null;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzea)).booleanValue()) {
            Set set = this.zzc;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains(AdFormat.BANNER)) {
                zzt.zzh();
                if (true == ((Boolean) zzay.zzc().zzb(zzbhy.zzea)).booleanValue()) {
                    str = "a.1.3.3-google_20200416";
                }
                return new zzerj(str);
            }
        }
        return new zzerj((String) null);
    }
}
