package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgk {
    private final AudioManager zza;
    private final zzgi zzb;
    private zzgj zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzgk(Context context, Handler handler, zzgj zzgj) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            this.zza = audioManager;
            this.zzc = zzgj;
            this.zzb = new zzgi(this, handler);
            this.zzd = 0;
            return;
        }
        throw null;
    }

    private final void zze() {
        if (this.zzd != 0) {
            if (zzeg.zza < 26) {
                this.zza.abandonAudioFocus(this.zzb);
            }
            zzg(0);
        }
    }

    private final void zzf(int i) {
        zzgj zzgj = this.zzc;
        if (zzgj != null) {
            zzij zzij = (zzij) zzgj;
            boolean zzq = zzij.zza.zzq();
            zzij.zza.zzau(zzq, i, zzin.zzah(zzq, i));
        }
    }

    private final void zzg(int i) {
        if (this.zzd != i) {
            this.zzd = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.zze != f) {
                this.zze = f;
                zzgj zzgj = this.zzc;
                if (zzgj != null) {
                    ((zzij) zzgj).zza.zzar();
                }
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        return z ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }

    static /* bridge */ /* synthetic */ void zzc(zzgk zzgk, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzgk.zzg(3);
                return;
            }
            zzgk.zzf(0);
            zzgk.zzg(2);
        } else if (i == -1) {
            zzgk.zzf(-1);
            zzgk.zze();
        } else if (i != 1) {
            Log.w("AudioFocusManager", "Unknown focus change type: " + i);
        } else {
            zzgk.zzg(1);
            zzgk.zzf(1);
        }
    }
}
