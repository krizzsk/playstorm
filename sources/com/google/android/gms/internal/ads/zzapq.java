package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzapq extends zzaqm {
    public zzapq(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "WlHsOh3wlV0WLQIL1K9rw/fkp4GO6NjuEiNcfL+sOy0Pjb3rqvyOdqvxRQtxMK9a", "4hMU+mzsUU6XYstubXUmZj16dvyex8xOMz7Jpzy9YvA=", zzali, i, 5);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzl(-1);
        this.zze.zzk(-1);
        int[] iArr = (int[]) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()});
        synchronized (this.zze) {
            this.zze.zzl((long) iArr[0]);
            this.zze.zzk((long) iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.zze.zzj((long) i);
            }
        }
    }
}
