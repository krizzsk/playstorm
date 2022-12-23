package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzek implements zzer {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzew zzd;

    protected zzek(boolean z) {
        this.zza = z;
    }

    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    public final void zzf(zzft zzft) {
        if (zzft == null) {
            throw null;
        } else if (!this.zzb.contains(zzft)) {
            this.zzb.add(zzft);
            this.zzc++;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzg(int i) {
        zzew zzew = this.zzd;
        int i2 = zzeg.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzft) this.zzb.get(i3)).zza(this, zzew, this.zza, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzh() {
        zzew zzew = this.zzd;
        int i = zzeg.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzft) this.zzb.get(i2)).zzb(this, zzew, this.zza);
        }
        this.zzd = null;
    }

    /* access modifiers changed from: protected */
    public final void zzi(zzew zzew) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzft) this.zzb.get(i)).zzc(this, zzew, this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzj(zzew zzew) {
        this.zzd = zzew;
        for (int i = 0; i < this.zzc; i++) {
            ((zzft) this.zzb.get(i)).zzd(this, zzew, this.zza);
        }
    }
}
