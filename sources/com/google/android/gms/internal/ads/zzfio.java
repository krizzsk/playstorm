package com.google.android.gms.internal.ads;

import com.tapjoy.TJAdUnitConstants;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public enum zzfio {
    HTML(TJAdUnitConstants.String.HTML),
    NATIVE("native"),
    JAVASCRIPT("javascript");
    
    private final String zze;

    private zzfio(String str) {
        this.zze = str;
    }

    public final String toString() {
        return this.zze;
    }
}
