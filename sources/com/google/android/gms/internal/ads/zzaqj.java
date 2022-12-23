package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaqj extends zzaqm {
    private final View zzi;

    public zzaqj(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2, View view) {
        super(zzapc, "3NWuanvGeSLpSagLaOAsn/Wjje90r/w2O3UK0Fwg9FAYR9qo+qmBwbA5vWXGCFiO", "Y36p4+OnCZGc4+WeLfFtxuI6ijQbwb2FRBUVzIb1EqM=", zzali, i, 57);
        this.zzi = view;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) zzay.zzc().zzb(zzbhy.zzcA);
            Boolean bool2 = (Boolean) zzay.zzc().zzb(zzbhy.zzil);
            DisplayMetrics displayMetrics = this.zzb.zzb().getResources().getDisplayMetrics();
            zzapg zzapg = new zzapg((String) this.zzf.invoke((Object) null, new Object[]{this.zzi, displayMetrics, bool, bool2}));
            zzalw zza = zzalx.zza();
            zza.zzb(zzapg.zza.longValue());
            zza.zzd(zzapg.zzb.longValue());
            zza.zze(zzapg.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzapg.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzapg.zzd.longValue());
            }
            this.zze.zzV((zzalx) zza.zzaj());
        }
    }
}
