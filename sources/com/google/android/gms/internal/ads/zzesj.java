package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzesj implements zzeta {
    private final String zza;

    public zzesj(String str) {
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.zza)) {
            bundle.putString("query_info", this.zza);
        }
    }
}
