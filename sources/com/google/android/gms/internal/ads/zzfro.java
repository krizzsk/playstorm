package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfro extends zzfpk {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfot zzb;

    zzfro(Iterator it, zzfot zzfot) {
        this.zza = it;
        this.zzb = zzfot;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final Object zza() {
        while (this.zza.hasNext()) {
            Object next = this.zza.next();
            if (this.zzb.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
