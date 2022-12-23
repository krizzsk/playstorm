package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfwu {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzfwt zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzfwt zzfwt = (zzfwt) it.next();
            if (zzfwt.zza()) {
                return zzfwt;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
