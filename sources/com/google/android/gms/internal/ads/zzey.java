package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzey implements zzer {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzer zzc;
    private zzer zzd;
    private zzer zze;
    private zzer zzf;
    private zzer zzg;
    private zzer zzh;
    private zzer zzi;
    private zzer zzj;
    private zzer zzk;

    public zzey(Context context, zzer zzer) {
        this.zza = context.getApplicationContext();
        this.zzc = zzer;
    }

    private final zzer zzg() {
        if (this.zze == null) {
            zzej zzej = new zzej(this.zza);
            this.zze = zzej;
            zzh(zzej);
        }
        return this.zze;
    }

    private final void zzh(zzer zzer) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzer.zzf((zzft) this.zzb.get(i));
        }
    }

    private static final void zzi(zzer zzer, zzft zzft) {
        if (zzer != null) {
            zzer.zzf(zzft);
        }
    }

    public final long zzb(zzew zzew) throws IOException {
        zzer zzer;
        zzcw.zzf(this.zzk == null);
        String scheme = zzew.zza.getScheme();
        if (zzeg.zzV(zzew.zza)) {
            String path = zzew.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzfh zzfh = new zzfh();
                    this.zzd = zzfh;
                    zzh(zzfh);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzeo zzeo = new zzeo(this.zza);
                this.zzf = zzeo;
                zzh(zzeo);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzer zzer2 = (zzer) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzer2;
                    zzh(zzer2);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzfv zzfv = new zzfv(2000);
                this.zzh = zzfv;
                zzh(zzfv);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzep zzep = new zzep();
                this.zzi = zzep;
                zzh(zzep);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzfr zzfr = new zzfr(this.zza);
                    this.zzj = zzfr;
                    zzh(zzfr);
                }
                zzer = this.zzj;
            } else {
                zzer = this.zzc;
            }
            this.zzk = zzer;
        }
        return this.zzk.zzb(zzew);
    }

    public final Uri zzc() {
        zzer zzer = this.zzk;
        if (zzer == null) {
            return null;
        }
        return zzer.zzc();
    }

    public final void zzd() throws IOException {
        zzer zzer = this.zzk;
        if (zzer != null) {
            try {
                zzer.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    public final Map zze() {
        zzer zzer = this.zzk;
        return zzer == null ? Collections.emptyMap() : zzer.zze();
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzer zzer = this.zzk;
        if (zzer != null) {
            return zzer.zza(bArr, i, i2);
        }
        throw null;
    }

    public final void zzf(zzft zzft) {
        if (zzft != null) {
            this.zzc.zzf(zzft);
            this.zzb.add(zzft);
            zzi(this.zzd, zzft);
            zzi(this.zze, zzft);
            zzi(this.zzf, zzft);
            zzi(this.zzg, zzft);
            zzi(this.zzh, zzft);
            zzi(this.zzi, zzft);
            zzi(this.zzj, zzft);
            return;
        }
        throw null;
    }
}
