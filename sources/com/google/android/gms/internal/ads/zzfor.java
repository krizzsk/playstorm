package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
final class zzfor {
    private static final Logger zza = Logger.getLogger(zzfor.class.getName());
    private static final zzfoq zzb = new zzfoq((zzfop) null);

    private zzfor() {
    }

    static String zza(@CheckForNull String str) {
        return str == null ? "" : str;
    }

    static boolean zzb(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }
}
