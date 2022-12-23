package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzayw {
    /* access modifiers changed from: private */
    public final ExecutorService zza = zzazn.zzl("Loader:ExtractorMediaPeriod");
    /* access modifiers changed from: private */
    public zzayt zzb;
    /* access modifiers changed from: private */
    public IOException zzc;

    public zzayw(String str) {
    }

    public final long zza(zzayu zzayu, zzays zzays, int i) {
        Looper myLooper = Looper.myLooper();
        zzayy.zze(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzayt(this, myLooper, zzayu, zzays, i, elapsedRealtime).zzc(0);
        return elapsedRealtime;
    }

    public final void zzf() {
        this.zzb.zza(false);
    }

    public final void zzg(int i) throws IOException {
        IOException iOException = this.zzc;
        if (iOException == null) {
            zzayt zzayt = this.zzb;
            if (zzayt != null) {
                zzayt.zzb(zzayt.zza);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzh(Runnable runnable) {
        zzayt zzayt = this.zzb;
        if (zzayt != null) {
            zzayt.zza(true);
        }
        this.zza.execute(runnable);
        this.zza.shutdown();
    }

    public final boolean zzi() {
        return this.zzb != null;
    }
}
