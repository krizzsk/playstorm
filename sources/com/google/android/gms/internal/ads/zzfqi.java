package com.google.android.gms.internal.ads;

import java.util.Collection;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfqi {
    static boolean zza(Collection collection, @CheckForNull Object obj) {
        if (collection != null) {
            try {
                return collection.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        } else {
            throw null;
        }
    }
}
