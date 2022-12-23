package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzepa implements zzetb {
    private final zzfvk zza;
    private final Context zzb;

    public zzepa(zzfvk zzfvk, Context context) {
        this.zza = zzfvk;
        this.zzb = context;
    }

    public final int zza() {
        return 13;
    }

    public final zzfvj zzb() {
        return this.zza.zzb(new zzeoz(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzepb zzc() throws Exception {
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        return new zzepb(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzt.zzr().zza(), zzt.zzr().zze());
    }
}
