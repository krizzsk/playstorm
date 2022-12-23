package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdon implements zzbol {
    public final /* synthetic */ zzdor zza;

    public /* synthetic */ zzdon(zzdor zzdor) {
        this.zza = zzdor;
    }

    public final void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        zzcli.zzP().zzz(new zzdoq(this.zza, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzcli.loadData(str, "text/html", "UTF-8");
        } else {
            zzcli.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
