package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzkf {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Handler zzb;
    private final zzkb zzc;
    private final AudioManager zzd;
    private zzke zze;
    private int zzf = 3;
    private int zzg;
    private boolean zzh;

    public zzkf(Context context, Handler handler, zzkb zzkb) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = handler;
        this.zzc = zzkb;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        zzcw.zzb(audioManager);
        this.zzd = audioManager;
        this.zzg = zzg(audioManager, 3);
        this.zzh = zzi(this.zzd, this.zzf);
        zzke zzke = new zzke(this, (zzkd) null);
        try {
            this.zza.registerReceiver(zzke, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.zze = zzke;
        } catch (RuntimeException e) {
            zzdn.zzb("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    private static int zzg(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            zzdn.zzb("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* access modifiers changed from: private */
    public final void zzh() {
        int zzg2 = zzg(this.zzd, this.zzf);
        boolean zzi = zzi(this.zzd, this.zzf);
        if (this.zzg != zzg2 || this.zzh != zzi) {
            this.zzg = zzg2;
            this.zzh = zzi;
            zzdm zzz = ((zzij) this.zzc).zza.zzl;
            zzz.zzd(30, new zzie(zzg2, zzi));
            zzz.zzc();
        }
    }

    private static boolean zzi(AudioManager audioManager, int i) {
        if (zzeg.zza >= 23) {
            return audioManager.isStreamMute(i);
        }
        return zzg(audioManager, i) == 0;
    }

    public final int zza() {
        return this.zzd.getStreamMaxVolume(this.zzf);
    }

    public final int zzb() {
        if (zzeg.zza >= 28) {
            return this.zzd.getStreamMinVolume(this.zzf);
        }
        return 0;
    }

    public final void zze() {
        zzke zzke = this.zze;
        if (zzke != null) {
            try {
                this.zza.unregisterReceiver(zzke);
            } catch (RuntimeException e) {
                zzdn.zzb("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.zze = null;
        }
    }

    public final void zzf(int i) {
        if (this.zzf != 3) {
            this.zzf = 3;
            zzh();
            zzij zzij = (zzij) this.zzc;
            zzr zzy = zzin.zzam(zzij.zza.zzz);
            if (!zzy.equals(zzij.zza.zzac)) {
                zzij.zza.zzac = zzy;
                zzdm zzz = zzij.zza.zzl;
                zzz.zzd(29, new zzif(zzy));
                zzz.zzc();
            }
        }
    }
}
