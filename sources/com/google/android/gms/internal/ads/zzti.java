package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzti extends zzrc implements zzsz {
    private final zzbb zza;
    private final zzaw zzb;
    private final zzeq zzc;
    private final zzpj zzd;
    private final int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;
    private zzft zzj;
    private final zztf zzk;
    private final zzwa zzl;

    /* synthetic */ zzti(zzbb zzbb, zzeq zzeq, zztf zztf, zzpj zzpj, zzwa zzwa, int i, zzth zzth, byte[] bArr) {
        zzaw zzaw = zzbb.zzd;
        if (zzaw != null) {
            this.zzb = zzaw;
            this.zza = zzbb;
            this.zzc = zzeq;
            this.zzk = zztf;
            this.zzd = zzpj;
            this.zzl = zzwa;
            this.zze = i;
            this.zzf = true;
            this.zzg = -9223372036854775807L;
            return;
        }
        throw null;
    }

    private final void zzv() {
        long j = this.zzg;
        boolean z = this.zzh;
        boolean z2 = this.zzi;
        zzbb zzbb = this.zza;
        zztv zztv = r1;
        zztv zztv2 = new zztv(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0, 0, z, false, false, (Object) null, zzbb, z2 ? zzbb.zzf : null);
        zzo(this.zzf ? new zzte(this, zztv) : zztv);
    }

    public final void zzB(zzrz zzrz) {
        ((zztd) zzrz).zzK();
    }

    public final zzrz zzD(zzsb zzsb, zzvw zzvw, long j) {
        zzer zza2 = this.zzc.zza();
        zzft zzft = this.zzj;
        if (zzft != null) {
            zza2.zzf(zzft);
        }
        Uri uri = this.zzb.zza;
        zztf zztf = this.zzk;
        zzb();
        zzre zzre = new zzre(zztf.zza);
        zzpj zzpj = this.zzd;
        zzpd zzc2 = zzc(zzsb);
        zzwa zzwa = this.zzl;
        zzsk zze2 = zze(zzsb);
        String str = this.zzb.zzf;
        return new zztd(uri, zza2, zzre, zzpj, zzc2, zzwa, zze2, this, zzvw, (String) null, this.zze, (byte[]) null);
    }

    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zzg;
        }
        if (this.zzf || this.zzg != j || this.zzh != z || this.zzi != z2) {
            this.zzg = j;
            this.zzh = z;
            this.zzi = z2;
            this.zzf = false;
            zzv();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzft zzft) {
        this.zzj = zzft;
        if (Looper.myLooper() != null) {
            zzb();
            zzv();
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
    }

    public final void zzw() {
    }

    public final zzbb zzz() {
        return this.zza;
    }
}
