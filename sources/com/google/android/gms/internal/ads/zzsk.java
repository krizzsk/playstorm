package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzsk {
    public final int zza;
    public final zzsb zzb;
    private final CopyOnWriteArrayList zzc;

    public zzsk() {
        this(new CopyOnWriteArrayList(), 0, (zzsb) null, 0);
    }

    private zzsk(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzsb zzsb, long j) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzsb;
    }

    private static final long zzn(long j) {
        long zzz = zzeg.zzz(j);
        if (zzz == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzz;
    }

    public final zzsk zza(int i, zzsb zzsb, long j) {
        return new zzsk(this.zzc, i, zzsb, 0);
    }

    public final void zzc(zzrx zzrx) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsj zzsj = (zzsj) it.next();
            zzeg.zzX(zzsj.zza, new zzse(this, zzsj.zzb, zzrx));
        }
    }

    public final void zzd(int i, zzad zzad, int i2, Object obj, long j) {
        zzc(new zzrx(1, i, zzad, 0, (Object) null, zzn(j), -9223372036854775807L));
    }

    public final void zze(zzrs zzrs, zzrx zzrx) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsj zzsj = (zzsj) it.next();
            zzeg.zzX(zzsj.zza, new zzsf(this, zzsj.zzb, zzrs, zzrx));
        }
    }

    public final void zzf(zzrs zzrs, int i, int i2, zzad zzad, int i3, Object obj, long j, long j2) {
        zzrs zzrs2 = zzrs;
        zze(zzrs, new zzrx(1, -1, (zzad) null, 0, (Object) null, zzn(j), zzn(j2)));
    }

    public final void zzg(zzrs zzrs, zzrx zzrx) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsj zzsj = (zzsj) it.next();
            zzeg.zzX(zzsj.zza, new zzsi(this, zzsj.zzb, zzrs, zzrx));
        }
    }

    public final void zzh(zzrs zzrs, int i, int i2, zzad zzad, int i3, Object obj, long j, long j2) {
        zzrs zzrs2 = zzrs;
        zzg(zzrs, new zzrx(1, -1, (zzad) null, 0, (Object) null, zzn(j), zzn(j2)));
    }

    public final void zzi(zzrs zzrs, zzrx zzrx, IOException iOException, boolean z) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsj zzsj = (zzsj) it.next();
            zzeg.zzX(zzsj.zza, new zzsg(this, zzsj.zzb, zzrs, zzrx, iOException, z));
        }
    }

    public final void zzj(zzrs zzrs, int i, int i2, zzad zzad, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        zzrs zzrs2 = zzrs;
        zzi(zzrs, new zzrx(1, -1, (zzad) null, 0, (Object) null, zzn(j), zzn(j2)), iOException, z);
    }

    public final void zzk(zzrs zzrs, zzrx zzrx) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsj zzsj = (zzsj) it.next();
            zzeg.zzX(zzsj.zza, new zzsh(this, zzsj.zzb, zzrs, zzrx));
        }
    }

    public final void zzl(zzrs zzrs, int i, int i2, zzad zzad, int i3, Object obj, long j, long j2) {
        zzrs zzrs2 = zzrs;
        zzk(zzrs, new zzrx(1, -1, (zzad) null, 0, (Object) null, zzn(j), zzn(j2)));
    }

    public final void zzm(zzsl zzsl) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsj zzsj = (zzsj) it.next();
            if (zzsj.zzb == zzsl) {
                this.zzc.remove(zzsj);
            }
        }
    }

    public final void zzb(Handler handler, zzsl zzsl) {
        if (zzsl != null) {
            this.zzc.add(new zzsj(handler, zzsl));
            return;
        }
        throw null;
    }
}
