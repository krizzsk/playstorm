package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfue extends zzfuc {
    private zzfue() {
        super((zzfub) null);
    }

    /* synthetic */ zzfue(zzfub zzfub) {
        super((zzfub) null);
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzfuf zzfuf) {
        int zzA;
        synchronized (zzfuf) {
            zzA = zzfuf.zzA(zzfuf);
        }
        return zzA;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzfuf zzfuf, @CheckForNull Set set, Set set2) {
        synchronized (zzfuf) {
            if (zzfuf.seenExceptions == null) {
                Set unused = zzfuf.seenExceptions = set2;
            }
        }
    }
}
