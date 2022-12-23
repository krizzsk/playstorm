package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaqb extends zzaqm {
    public zzaqb(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "v5TMaM3BNNU2Gsu0TzQsNfceDLIy/IB8059Kr/DXJTJFRNwA+BBaEnm0xJDjetlP", "18t2+sVmBFWOR34FTgk9oqx1qcZI0NwZV8Dtcvfe5eY=", zzali, i, 73);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()})).booleanValue();
            zzali zzali = this.zze;
            if (true == booleanValue) {
                i = 2;
            }
            zzali.zzab(i);
        } catch (InvocationTargetException unused) {
            this.zze.zzab(3);
        }
    }
}
