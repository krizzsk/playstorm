package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzkg {
    private final PowerManager zza;

    public zzkg(Context context) {
        this.zza = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
