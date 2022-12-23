package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
abstract class zzftb extends AbstractSet {
    zzftb() {
    }

    public boolean removeAll(Collection collection) {
        return zzftc.zzd(this, collection);
    }

    public boolean retainAll(Collection collection) {
        if (collection != null) {
            return super.retainAll(collection);
        }
        throw null;
    }
}
