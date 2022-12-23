package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzfpk extends zzftg {
    @CheckForNull
    private Object zza;
    private int zzb = 2;

    protected zzfpk() {
    }

    public final boolean hasNext() {
        zzfos.zzh(this.zzb != 4);
        int i = this.zzb;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return true;
        } else {
            if (i2 != 2) {
                this.zzb = 4;
                this.zza = zza();
                if (this.zzb != 3) {
                    this.zzb = 1;
                    return true;
                }
            }
            return false;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.zzb = 2;
            Object obj = this.zza;
            this.zza = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public abstract Object zza();

    /* access modifiers changed from: protected */
    @CheckForNull
    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
