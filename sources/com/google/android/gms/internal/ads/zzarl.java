package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzarl implements zzari {
    private final zzarx[] zza;
    private final zzayd zzb;
    private final zzayb zzc;
    private final Handler zzd;
    private final zzarq zze;
    private final CopyOnWriteArraySet zzf;
    private final zzasc zzg;
    private final zzasb zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private zzasd zzo;
    private Object zzp;
    private zzaxp zzq;
    private zzayb zzr;
    private zzarw zzs;
    private zzarn zzt;
    private long zzu;

    public zzarl(zzarx[] zzarxArr, zzayd zzayd, zzcio zzcio, byte[] bArr) {
        zzayd zzayd2 = zzayd;
        String str = zzazn.zze;
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.2 [" + str + "]");
        this.zza = zzarxArr;
        if (zzayd2 != null) {
            this.zzb = zzayd2;
            this.zzj = false;
            this.zzk = 1;
            this.zzf = new CopyOnWriteArraySet();
            this.zzc = new zzayb(new zzaxt[2], (byte[]) null);
            this.zzo = zzasd.zza;
            this.zzg = new zzasc();
            this.zzh = new zzasb();
            this.zzq = zzaxp.zza;
            this.zzr = this.zzc;
            this.zzs = zzarw.zza;
            this.zzd = new zzark(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
            this.zzt = new zzarn(0, 0);
            this.zze = new zzarq(zzarxArr, zzayd, zzcio, this.zzj, 0, this.zzd, this.zzt, this, (byte[]) null);
            return;
        }
        throw null;
    }

    public final int zza() {
        return this.zzk;
    }

    public final long zzb() {
        if (this.zzo.zzh() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzard.zzb(0) + zzard.zzb(this.zzt.zzd);
    }

    public final long zzc() {
        if (this.zzo.zzh() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzard.zzb(0) + zzard.zzb(this.zzt.zzc);
    }

    public final long zzd() {
        if (this.zzo.zzh()) {
            return -9223372036854775807L;
        }
        zzasd zzasd = this.zzo;
        zzs();
        return zzard.zzb(zzasd.zzg(0, this.zzg, false).zza);
    }

    public final void zze(zzarf zzarf) {
        this.zzf.add(zzarf);
    }

    public final void zzf(zzarh... zzarhArr) {
        if (!this.zze.zzr()) {
            this.zze.zza(zzarhArr);
        } else if (!this.zze.zzq(zzarhArr)) {
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarf) it.next()).zzc(zzare.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
            }
        }
    }

    public final void zzg() {
        this.zze.zzb();
    }

    public final void zzh(int i) {
        this.zze.zzc(i);
    }

    public final void zzi() {
        this.zze.zzd();
    }

    public final void zzj(zzaxa zzaxa) {
        if (!this.zzo.zzh() || this.zzp != null) {
            this.zzo = zzasd.zza;
            this.zzp = null;
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarf) it.next()).zzf(this.zzo, this.zzp);
            }
        }
        if (this.zzi) {
            this.zzi = false;
            this.zzq = zzaxp.zza;
            this.zzr = this.zzc;
            this.zzb.zzd((Object) null);
            Iterator it2 = this.zzf.iterator();
            while (it2.hasNext()) {
                ((zzarf) it2.next()).zzg(this.zzq, this.zzr);
            }
        }
        this.zzm++;
        this.zze.zzi(zzaxa, true);
    }

    public final void zzk() {
        if (this.zze.zzr()) {
            if (!this.zze.zzs()) {
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzarf) it.next()).zzc(zzare.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 release timeout"))));
                }
            }
            this.zzd.removeCallbacksAndMessages((Object) null);
            return;
        }
        this.zze.zzj();
        this.zzd.removeCallbacksAndMessages((Object) null);
    }

    public final void zzl(zzarf zzarf) {
        this.zzf.remove(zzarf);
    }

    public final void zzm(long j) {
        zzs();
        if (this.zzo.zzh() || this.zzo.zzc() > 0) {
            this.zzl++;
            if (!this.zzo.zzh()) {
                this.zzo.zzg(0, this.zzg, false);
                long zza2 = zzard.zza(j);
                long j2 = this.zzo.zzd(0, this.zzh, false).zzc;
                if (j2 != -9223372036854775807L) {
                    int i = (zza2 > j2 ? 1 : (zza2 == j2 ? 0 : -1));
                }
            }
            this.zzu = j;
            this.zze.zzk(this.zzo, 0, zzard.zza(j));
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarf) it.next()).zze();
            }
            return;
        }
        throw new zzaru(this.zzo, 0, j);
    }

    public final void zzn(zzarh... zzarhArr) {
        this.zze.zzl(zzarhArr);
    }

    public final void zzo(int i) {
        this.zze.zzm(i);
    }

    public final void zzp(int i) {
        this.zze.zzn(i);
    }

    public final void zzq(boolean z) {
        if (this.zzj != z) {
            this.zzj = z;
            this.zze.zzo(z);
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarf) it.next()).zzd(z, this.zzk);
            }
        }
    }

    public final void zzr() {
        this.zze.zzp();
    }

    public final int zzs() {
        if (!this.zzo.zzh() && this.zzl <= 0) {
            this.zzo.zzd(this.zzt.zza, this.zzh, false);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final void zzt(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.zzm--;
                return;
            case 1:
                this.zzk = message.arg1;
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzarf) it.next()).zzd(this.zzj, this.zzk);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.zzn = z;
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    ((zzarf) it2.next()).zza(this.zzn);
                }
                return;
            case 3:
                if (this.zzm == 0) {
                    zzaye zzaye = (zzaye) message.obj;
                    this.zzi = true;
                    this.zzq = zzaye.zza;
                    this.zzr = zzaye.zzb;
                    this.zzb.zzd(zzaye.zzc);
                    Iterator it3 = this.zzf.iterator();
                    while (it3.hasNext()) {
                        ((zzarf) it3.next()).zzg(this.zzq, this.zzr);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.zzl - 1;
                this.zzl = i;
                if (i == 0) {
                    this.zzt = (zzarn) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.zzf.iterator();
                        while (it4.hasNext()) {
                            ((zzarf) it4.next()).zze();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzl == 0) {
                    this.zzt = (zzarn) message.obj;
                    Iterator it5 = this.zzf.iterator();
                    while (it5.hasNext()) {
                        ((zzarf) it5.next()).zze();
                    }
                    return;
                }
                return;
            case 6:
                zzarp zzarp = (zzarp) message.obj;
                this.zzl -= zzarp.zzd;
                if (this.zzm == 0) {
                    this.zzo = zzarp.zza;
                    this.zzp = zzarp.zzb;
                    this.zzt = zzarp.zzc;
                    Iterator it6 = this.zzf.iterator();
                    while (it6.hasNext()) {
                        ((zzarf) it6.next()).zzf(this.zzo, this.zzp);
                    }
                    return;
                }
                return;
            case 7:
                zzarw zzarw = (zzarw) message.obj;
                if (!this.zzs.equals(zzarw)) {
                    this.zzs = zzarw;
                    Iterator it7 = this.zzf.iterator();
                    while (it7.hasNext()) {
                        ((zzarf) it7.next()).zzb(zzarw);
                    }
                    return;
                }
                return;
            case 8:
                zzare zzare = (zzare) message.obj;
                Iterator it8 = this.zzf.iterator();
                while (it8.hasNext()) {
                    ((zzarf) it8.next()).zzc(zzare);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
