package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzdof implements zzbkn {
    final /* synthetic */ zzdpb zza;
    final /* synthetic */ ViewGroup zzb;

    zzdof(zzdpb zzdpb, ViewGroup viewGroup) {
        this.zza = zzdpb;
        this.zzb = viewGroup;
    }

    public final JSONObject zza() {
        return this.zza.zzo();
    }

    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    public final void zzc() {
        zzdpb zzdpb = this.zza;
        zzfrh zzfrh = zzdoc.zza;
        Map zzm = zzdpb.zzm();
        if (zzm != null) {
            int size = zzfrh.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (zzm.get((String) zzfrh.get(i)) == null) {
                    i = i2;
                } else {
                    this.zza.onClick(this.zzb);
                    return;
                }
            }
        }
    }

    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch((View) null, motionEvent);
    }
}
