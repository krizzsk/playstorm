package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfqe extends AbstractCollection {
    final /* synthetic */ zzfqf zza;

    zzfqe(zzfqf zzfqf) {
        this.zza = zzfqf;
    }

    public final void clear() {
        this.zza.zzr();
    }

    public final boolean contains(@CheckForNull Object obj) {
        for (Collection contains : this.zza.zzu().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Iterator iterator() {
        return this.zza.zzj();
    }

    public final int size() {
        return this.zza.zzh();
    }
}
