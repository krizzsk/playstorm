package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzclm implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzccj zza;
    final /* synthetic */ zzclp zzb;

    zzclm(zzclp zzclp, zzccj zzccj) {
        this.zzb = zzclp;
        this.zza = zzccj;
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzQ(view, this.zza, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
