package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzawr implements zzayu {
    final /* synthetic */ zzawu zza;
    private final Uri zzb;
    private final zzayi zzc;
    private final zzaws zzd;
    private final zzaza zze;
    private final zzaua zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private long zzi;
    /* access modifiers changed from: private */
    public long zzj;

    public zzawr(zzawu zzawu, Uri uri, zzayi zzayi, zzaws zzaws, zzaza zzaza) {
        this.zza = zzawu;
        if (uri != null) {
            this.zzb = uri;
            if (zzayi != null) {
                this.zzc = zzayi;
                if (zzaws != null) {
                    this.zzd = zzaws;
                    this.zze = zzaza;
                    this.zzf = new zzaua();
                    this.zzh = true;
                    this.zzj = -1;
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void zzb() {
        this.zzg = true;
    }

    public final void zzc() throws IOException, InterruptedException {
        zzatu zzatu;
        long j;
        while (!this.zzg) {
            int i = 0;
            try {
                long j2 = this.zzf.zza;
                zzayi zzayi = this.zzc;
                zzayk zzayk = r4;
                long j3 = j2;
                zzayk zzayk2 = new zzayk(this.zzb, (byte[]) null, j2, j2, -1, (String) null, 0);
                long zzb2 = zzayi.zzb(zzayk);
                this.zzj = zzb2;
                if (zzb2 != -1) {
                    j = j3;
                    zzb2 += j;
                    this.zzj = zzb2;
                } else {
                    j = j3;
                }
                zzatu = new zzatu(this.zzc, j, zzb2);
                try {
                    zzatv zzb3 = this.zzd.zzb(zzatu, this.zzc.zzc());
                    if (this.zzh) {
                        zzb3.zze(j, this.zzi);
                        this.zzh = false;
                    }
                    int i2 = 0;
                    long j4 = j;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.zzg) {
                                i2 = 0;
                                break;
                            }
                            this.zze.zza();
                            i2 = zzb3.zzf(zzatu, this.zzf);
                            if (zzatu.zzd() > this.zza.zzg + j4) {
                                j4 = zzatu.zzd();
                                this.zze.zzb();
                                zzawu zzawu = this.zza;
                                zzawu.zzm.post(zzawu.zzl);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (!(i == 1 || zzatu == null)) {
                                this.zzf.zza = zzatu.zzd();
                            }
                            zzazn.zzm(this.zzc);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.zzf.zza = zzatu.zzd();
                        i = i2;
                    }
                    zzazn.zzm(this.zzc);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.zzf.zza = zzatu.zzd();
                    zzazn.zzm(this.zzc);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                zzatu = null;
                this.zzf.zza = zzatu.zzd();
                zzazn.zzm(this.zzc);
                throw th;
            }
        }
    }

    public final void zzd(long j, long j2) {
        this.zzf.zza = j;
        this.zzi = j2;
        this.zzh = true;
    }

    public final boolean zze() {
        return this.zzg;
    }
}
