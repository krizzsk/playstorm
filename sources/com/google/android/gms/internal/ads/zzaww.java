package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaww implements zzaxa, zzawz {
    private final Uri zza;
    private final zzayh zzb;
    private final zzatx zzc;
    private final int zzd;
    private final Handler zze;
    private final zzawv zzf;
    private final zzasb zzg = new zzasb();
    private final int zzh;
    private zzawz zzi;
    private zzasd zzj;
    private boolean zzk;

    public zzaww(Uri uri, zzayh zzayh, zzatx zzatx, int i, Handler handler, zzawv zzawv, String str, int i2) {
        this.zza = uri;
        this.zzb = zzayh;
        this.zzc = zzatx;
        this.zzd = i;
        this.zze = handler;
        this.zzf = zzawv;
        this.zzh = i2;
    }

    public final void zza() throws IOException {
    }

    public final void zzb(zzari zzari, boolean z, zzawz zzawz) {
        this.zzi = zzawz;
        zzaxn zzaxn = new zzaxn(-9223372036854775807L, false);
        this.zzj = zzaxn;
        zzawz.zzg(zzaxn, (Object) null);
    }

    public final void zzc(zzawy zzawy) {
        ((zzawu) zzawy).zzx();
    }

    public final void zzd() {
        this.zzi = null;
    }

    public final zzawy zze(int i, zzayl zzayl) {
        zzayy.zzc(i == 0);
        return new zzawu(this.zza, this.zzb.zza(), this.zzc.zza(), this.zzd, this.zze, this.zzf, this, zzayl, (String) null, this.zzh, (byte[]) null);
    }

    public final void zzg(zzasd zzasd, Object obj) {
        zzasb zzasb = this.zzg;
        boolean z = false;
        zzasd.zzd(0, zzasb, false);
        if (zzasb.zzc != -9223372036854775807L) {
            z = true;
        }
        if (!this.zzk || z) {
            this.zzj = zzasd;
            this.zzk = z;
            this.zzi.zzg(zzasd, (Object) null);
        }
    }
}
