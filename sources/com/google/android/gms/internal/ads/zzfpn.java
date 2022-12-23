package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfpn extends zzfry {
    final /* synthetic */ zzfpp zza;

    zzfpn(zzfpp zzfpp) {
        this.zza = zzfpp;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return zzfqi.zza(this.zza.zza.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new zzfpo(this.zza);
    }

    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzfqc.zzq(this.zza.zzb, entry.getKey());
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Map zza() {
        return this.zza;
    }
}
