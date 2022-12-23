package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzeun implements Callable {
    public final /* synthetic */ zzeuo zza;

    public /* synthetic */ zzeun(zzeuo zzeuo) {
        this.zza = zzeuo;
    }

    public final Object call() {
        return new zzeup(new JSONObject());
    }
}
