package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
abstract class zzfuk extends zzfua {
    @CheckForNull
    private List zza;

    zzfuk(zzfrc zzfrc, boolean z) {
        super(zzfrc, true, true);
        List list;
        if (zzfrc.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = zzfrv.zza(zzfrc.size());
        }
        for (int i = 0; i < zzfrc.size(); i++) {
            list.add((Object) null);
        }
        this.zza = list;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zzG(List list);

    /* access modifiers changed from: package-private */
    public final void zzg(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzfuj(obj));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzG(list));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzz(int i) {
        super.zzz(i);
        this.zza = null;
    }
}
