package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbnz implements zzbol {
    zzbnz() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcli zzcli = (zzcli) obj;
        zzbkn zzM = zzcli.zzM();
        if (zzM == null || (zza = zzM.zza()) == null) {
            zzcli.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcli.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
