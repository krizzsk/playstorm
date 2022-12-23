package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgfu extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgfu zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgkx zzf = zzaH();

    static {
        zzgfu zzgfu = new zzgfu();
        zzb = zzgfu;
        zzgko.zzaN(zzgfu.class, zzgfu);
    }

    private zzgfu() {
    }

    public static zzgfr zzd() {
        return (zzgfr) zzb.zzaw();
    }

    public static zzgfu zzf(InputStream inputStream, zzgka zzgka) throws IOException {
        return (zzgfu) zzgko.zzaC(zzb, inputStream, zzgka);
    }

    public static zzgfu zzg(byte[] bArr, zzgka zzgka) throws zzgla {
        return (zzgfu) zzgko.zzaD(zzb, bArr, zzgka);
    }

    static /* synthetic */ void zzj(zzgfu zzgfu, zzgft zzgft) {
        zzgft.getClass();
        zzgkx zzgkx = zzgfu.zzf;
        if (!zzgkx.zzc()) {
            zzgfu.zzf = zzgko.zzaI(zzgkx);
        }
        zzgfu.zzf.add(zzgft);
    }

    public final int zza() {
        return this.zzf.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgft.class});
        } else if (i2 == 3) {
            return new zzgfu();
        } else {
            if (i2 == 4) {
                return new zzgfr((zzgfq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zzc() {
        return this.zze;
    }

    public final List zzh() {
        return this.zzf;
    }
}
