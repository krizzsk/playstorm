package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzfi implements zzfot {
    public static final /* synthetic */ zzfi zza = new zzfi();

    private /* synthetic */ zzfi() {
    }

    public final boolean zza(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return false;
        }
        String zza2 = zzfoa.zza(str);
        if (!TextUtils.isEmpty(zza2)) {
            return (!zza2.contains("text") || zza2.contains("text/vtt")) && !zza2.contains(TJAdUnitConstants.String.HTML) && !zza2.contains("xml");
        }
        return false;
    }
}
