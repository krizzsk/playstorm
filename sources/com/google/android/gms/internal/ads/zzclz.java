package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzclz implements zzbol {
    final /* synthetic */ zzcmb zza;

    zzclz(zzcmb zzcmb) {
        this.zza = zzcmb;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.zza) {
                        zzcmb zzcmb = this.zza;
                        if (zzcmb.zzG != parseInt) {
                            zzcmb.zzG = parseInt;
                            this.zza.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    zze.zzk("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
