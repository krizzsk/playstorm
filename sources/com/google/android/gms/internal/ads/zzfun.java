package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfun extends zzfua {
    /* access modifiers changed from: private */
    @CheckForNull
    public zzfum zza;

    zzfun(zzfrc zzfrc, boolean z, Executor executor, Callable callable) {
        super(zzfrc, z, false);
        this.zza = new zzful(this, callable, executor);
        zzw();
    }

    /* access modifiers changed from: package-private */
    public final void zzg(int i, @CheckForNull Object obj) {
    }

    /* access modifiers changed from: protected */
    public final void zzr() {
        zzfum zzfum = this.zza;
        if (zzfum != null) {
            zzfum.zzh();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzv() {
        zzfum zzfum = this.zza;
        if (zzfum != null) {
            zzfum.zzf();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzz(int i) {
        super.zzz(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
