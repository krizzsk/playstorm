package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcsy implements zzcso {
    private final Context zza;
    private final zzg zzb = zzt.zzo().zzh();

    public zzcsy(Context context) {
        this.zza = context;
    }

    public final void zza(Map map) {
        if (!map.isEmpty()) {
            String str = (String) map.get("gad_idless");
            if (str != null) {
                boolean parseBoolean = Boolean.parseBoolean(str);
                map.remove("gad_idless");
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzar)).booleanValue()) {
                    this.zzb.zzH(parseBoolean);
                    if (((Boolean) zzay.zzc().zzb(zzbhy.zzff)).booleanValue() && parseBoolean) {
                        this.zza.deleteDatabase("OfflineUpload.db");
                    }
                }
            }
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzam)).booleanValue()) {
                zzt.zzn().zzr(bundle);
            }
        }
    }
}
