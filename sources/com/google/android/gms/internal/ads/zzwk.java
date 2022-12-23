package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzwk {
    public static final zzwe zza = new zzwe(0, -9223372036854775807L, (zzwd) null);
    public static final zzwe zzb = new zzwe(1, -9223372036854775807L, (zzwd) null);
    public static final zzwe zzc = new zzwe(2, -9223372036854775807L, (zzwd) null);
    public static final zzwe zzd = new zzwe(3, -9223372036854775807L, (zzwd) null);
    /* access modifiers changed from: private */
    public final ExecutorService zze = zzeg.zzP("ExoPlayer:Loader:ProgressiveMediaPeriod");
    /* access modifiers changed from: private */
    public zzwf zzf;
    /* access modifiers changed from: private */
    public IOException zzg;

    public zzwk(String str) {
    }

    public static zzwe zzb(boolean z, long j) {
        return new zzwe(z ? 1 : 0, j, (zzwd) null);
    }

    public final long zza(zzwg zzwg, zzwc zzwc, int i) {
        Looper myLooper = Looper.myLooper();
        zzcw.zzb(myLooper);
        this.zzg = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzwf(this, myLooper, zzwg, zzwc, i, elapsedRealtime).zzc(0);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzwf zzwf = this.zzf;
        zzcw.zzb(zzwf);
        zzwf.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zzg;
        if (iOException == null) {
            zzwf zzwf = this.zzf;
            if (zzwf != null) {
                zzwf.zzb(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzj(zzwh zzwh) {
        zzwf zzwf = this.zzf;
        if (zzwf != null) {
            zzwf.zza(true);
        }
        this.zze.execute(new zzwi(zzwh));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
