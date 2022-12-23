package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzin extends zzk implements zzhf {
    public static final /* synthetic */ int zzd = 0;
    private final zzkg zzA;
    private final zzkh zzB;
    private final long zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private int zzG;
    private zzjx zzH;
    private zzbx zzI;
    private zzbh zzJ;
    private zzbh zzK;
    /* access modifiers changed from: private */
    public zzad zzL;
    /* access modifiers changed from: private */
    public zzad zzM;
    private AudioTrack zzN;
    /* access modifiers changed from: private */
    public Object zzO;
    private Surface zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    /* access modifiers changed from: private */
    public zzgm zzT;
    /* access modifiers changed from: private */
    public zzgm zzU;
    private int zzV;
    private zzi zzW;
    private float zzX;
    /* access modifiers changed from: private */
    public boolean zzY;
    private List zzZ;
    private boolean zzaa;
    private boolean zzab;
    /* access modifiers changed from: private */
    public zzr zzac;
    /* access modifiers changed from: private */
    public zzcv zzad;
    private zzbh zzae;
    private zzjo zzaf;
    private int zzag;
    private long zzah;
    private final zzhq zzai;
    private zztu zzaj;
    final zzvo zzb;
    final zzbx zzc;
    private final zzcz zze = new zzcz(zzcx.zza);
    private final Context zzf;
    private final zzcb zzg;
    private final zzju[] zzh;
    private final zzvn zzi;
    private final zzdg zzj;
    private final zzix zzk;
    /* access modifiers changed from: private */
    public final zzdm zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcf zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzsa zzq;
    /* access modifiers changed from: private */
    public final zzki zzr;
    private final Looper zzs;
    private final zzvv zzt;
    private final zzcx zzu;
    private final zzij zzv;
    private final zzil zzw;
    private final zzgg zzx;
    private final zzgk zzy;
    /* access modifiers changed from: private */
    public final zzkf zzz;

    static {
        zzbc.zzb("media3.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [com.google.android.gms.internal.ads.zzki, java.lang.Object] */
    public zzin(zzhe zzhe, zzcb zzcb) {
        zzmv zza;
        zzhe zzhe2 = zzhe;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzeg.zze;
            Log.i("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.0.0-alpha03] [" + str + "]");
            this.zzf = zzhe2.zza.getApplicationContext();
            this.zzr = zzhe2.zzh.apply(zzhe2.zzb);
            this.zzW = zzhe2.zzj;
            this.zzQ = 1;
            this.zzY = false;
            this.zzC = 2000;
            this.zzv = new zzij(this, (zzii) null);
            this.zzw = new zzil((zzik) null);
            Handler handler = new Handler(zzhe2.zzi);
            zzckr zzckr = ((zzgy) zzhe2.zzc).zza;
            zzij zzij = this.zzv;
            zzju[] zza2 = zzckr.zza(handler, zzij, zzij, zzij, zzij);
            this.zzh = zza2;
            int length = zza2.length;
            this.zzi = (zzvn) zzhe2.zze.zza();
            this.zzq = zzhe.zza(((zzgz) zzhe2.zzd).zza);
            this.zzt = zzvz.zzg(((zzhc) zzhe2.zzg).zza);
            this.zzp = true;
            this.zzH = zzhe2.zzk;
            this.zzs = zzhe2.zzi;
            this.zzu = zzhe2.zzb;
            this.zzg = zzcb;
            this.zzl = new zzdm(this.zzs, this.zzu, new zzhp(this));
            this.zzm = new CopyOnWriteArraySet();
            this.zzo = new ArrayList();
            this.zzaj = new zztu(0);
            int length2 = this.zzh.length;
            this.zzb = new zzvo(new zzjw[2], new zzvh[2], zzct.zza, (Object) null);
            this.zzn = new zzcf();
            zzbv zzbv = new zzbv();
            zzbv.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            this.zzi.zzh();
            zzbv.zzd(29, true);
            this.zzc = zzbv.zze();
            zzbv zzbv2 = new zzbv();
            zzbv2.zzb(this.zzc);
            zzbv2.zza(4);
            zzbv2.zza(10);
            this.zzI = zzbv2.zze();
            this.zzj = this.zzu.zzb(this.zzs, (Handler.Callback) null);
            this.zzai = new zzhq(this);
            this.zzaf = zzjo.zzh(this.zzb);
            this.zzr.zzS(this.zzg, this.zzs);
            if (zzeg.zza < 31) {
                zza = new zzmv();
            } else {
                zza = zzic.zza(this.zzf, this, true);
            }
            zzmv zzmv = zza;
            zzju[] zzjuArr = this.zzh;
            zzvn zzvn = this.zzi;
            zzvo zzvo = this.zzb;
            zzju[] zzjuArr2 = zzjuArr;
            zzvn zzvn2 = zzvn;
            zzvo zzvo2 = zzvo;
            this.zzk = new zzix(zzjuArr2, zzvn2, zzvo2, (zzjb) zzhe2.zzf.zza(), this.zzt, 0, false, this.zzr, this.zzH, zzhe2.zzm, 500, false, this.zzs, this.zzu, this.zzai, zzmv, (byte[]) null);
            this.zzX = 1.0f;
            zzbh zzbh = zzbh.zza;
            this.zzJ = zzbh;
            this.zzK = zzbh;
            this.zzae = zzbh;
            this.zzag = -1;
            if (zzeg.zza < 21) {
                AudioTrack audioTrack = this.zzN;
                if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                    this.zzN.release();
                    this.zzN = null;
                }
                if (this.zzN == null) {
                    this.zzN = new AudioTrack(3, TTAdSdk.INIT_LOCAL_FAIL_CODE, 4, 2, 2, 0, 0);
                }
                this.zzV = this.zzN.getAudioSessionId();
            } else {
                this.zzV = zzeg.zzi(this.zzf);
            }
            this.zzZ = zzfrh.zzo();
            this.zzaa = true;
            zzki zzki = this.zzr;
            if (zzki != null) {
                this.zzl.zzb(zzki);
                this.zzt.zze(new Handler(this.zzs), this.zzr);
                this.zzm.add(this.zzv);
                this.zzx = new zzgg(zzhe2.zza, handler, this.zzv);
                this.zzy = new zzgk(zzhe2.zza, handler, this.zzv);
                zzeg.zzS((Object) null, (Object) null);
                zzkf zzkf = new zzkf(zzhe2.zza, handler, this.zzv);
                this.zzz = zzkf;
                int i = this.zzW.zzc;
                zzkf.zzf(3);
                this.zzA = new zzkg(zzhe2.zza);
                this.zzB = new zzkh(zzhe2.zza);
                this.zzac = zzam(this.zzz);
                this.zzad = zzcv.zza;
                zzaq(1, 10, Integer.valueOf(this.zzV));
                zzaq(2, 10, Integer.valueOf(this.zzV));
                zzaq(1, 3, this.zzW);
                zzaq(2, 4, Integer.valueOf(this.zzQ));
                zzaq(2, 5, 0);
                zzaq(1, 9, Boolean.valueOf(this.zzY));
                zzaq(2, 7, this.zzw);
                zzaq(6, 8, this.zzw);
                return;
            }
            throw null;
        } finally {
            this.zze.zze();
        }
    }

    static /* bridge */ /* synthetic */ void zzN(zzin zzin, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzin.zzas(surface);
        zzin.zzP = surface;
    }

    private final int zzag() {
        if (this.zzaf.zza.zzo()) {
            return this.zzag;
        }
        zzjo zzjo = this.zzaf;
        return zzjo.zza.zzn(zzjo.zzb.zza, this.zzn).zzd;
    }

    /* access modifiers changed from: private */
    public static int zzah(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzai(zzjo zzjo) {
        if (zzjo.zza.zzo()) {
            return zzeg.zzv(this.zzah);
        }
        if (zzjo.zzb.zzb()) {
            return zzjo.zzs;
        }
        zzci zzci = zzjo.zza;
        zzsb zzsb = zzjo.zzb;
        long j = zzjo.zzs;
        zzak(zzci, zzsb, j);
        return j;
    }

    private static long zzaj(zzjo zzjo) {
        zzch zzch = new zzch();
        zzcf zzcf = new zzcf();
        zzjo.zza.zzn(zzjo.zzb.zza, zzcf);
        long j = zzjo.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzjo.zza.zze(zzcf.zzd, zzch, 0).zzm;
        return 0;
    }

    private final long zzak(zzci zzci, zzsb zzsb, long j) {
        zzci.zzn(zzsb.zza, this.zzn);
        return j;
    }

    private final Pair zzal(zzci zzci, int i, long j) {
        if (zzci.zzo()) {
            this.zzag = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzah = j;
            return null;
        }
        if (i == -1 || i >= zzci.zzc()) {
            i = zzci.zzg(false);
            long j2 = zzci.zze(i, this.zza, 0).zzm;
            j = zzeg.zzz(0);
        }
        return zzci.zzl(this.zza, this.zzn, i, zzeg.zzv(j));
    }

    /* access modifiers changed from: private */
    public static zzr zzam(zzkf zzkf) {
        return new zzr(0, zzkf.zzb(), zzkf.zza());
    }

    private final zzjo zzan(zzjo zzjo, zzci zzci, Pair pair) {
        zztz zztz;
        zzvo zzvo;
        zzsb zzsb;
        List list;
        int i;
        zzjo zzjo2;
        long j;
        zzci zzci2 = zzci;
        Pair pair2 = pair;
        zzcw.zzd(zzci.zzo() || pair2 != null);
        zzci zzci3 = zzjo.zza;
        zzjo zzg2 = zzjo.zzg(zzci);
        if (zzci.zzo()) {
            zzsb zzi2 = zzjo.zzi();
            long zzv2 = zzeg.zzv(this.zzah);
            zzjo zza = zzg2.zzb(zzi2, zzv2, zzv2, zzv2, 0, zztz.zza, this.zzb, zzfrh.zzo()).zza(zzi2);
            zza.zzq = zza.zzs;
            return zza;
        }
        Object obj = zzg2.zzb.zza;
        int i2 = zzeg.zza;
        boolean z = !obj.equals(pair2.first);
        zzsb zzsb2 = z ? new zzsb(pair2.first) : zzg2.zzb;
        long longValue = ((Long) pair2.second).longValue();
        long zzv3 = zzeg.zzv(zzk());
        if (!zzci3.zzo()) {
            zzci3.zzn(obj, this.zzn);
        }
        if (z || longValue < zzv3) {
            zzsb zzsb3 = zzsb2;
            zzcw.zzf(!zzsb3.zzb());
            if (z) {
                zztz = zztz.zza;
            } else {
                zztz = zzg2.zzh;
            }
            zztz zztz2 = zztz;
            if (z) {
                zzsb = zzsb3;
                zzvo = this.zzb;
            } else {
                zzsb = zzsb3;
                zzvo = zzg2.zzi;
            }
            zzvo zzvo2 = zzvo;
            if (z) {
                list = zzfrh.zzo();
            } else {
                list = zzg2.zzj;
            }
            zzjo zza2 = zzg2.zzb(zzsb, longValue, longValue, longValue, 0, zztz2, zzvo2, list).zza(zzsb);
            zza2.zzq = longValue;
            return zza2;
        }
        if (i == 0) {
            int zza3 = zzci2.zza(zzg2.zzk.zza);
            if (zza3 != -1 && zzci2.zzd(zza3, this.zzn, false).zzd == zzci2.zzn(zzsb2.zza, this.zzn).zzd) {
                return zzg2;
            }
            zzci2.zzn(zzsb2.zza, this.zzn);
            if (zzsb2.zzb()) {
                j = this.zzn.zzg(zzsb2.zzb, zzsb2.zzc);
            } else {
                j = this.zzn.zze;
            }
            zzjo2 = zzg2.zzb(zzsb2, zzg2.zzs, zzg2.zzs, zzg2.zzd, j - zzg2.zzs, zzg2.zzh, zzg2.zzi, zzg2.zzj).zza(zzsb2);
            zzjo2.zzq = j;
        } else {
            zzsb zzsb4 = zzsb2;
            zzcw.zzf(!zzsb4.zzb());
            long max = Math.max(0, zzg2.zzr - (longValue - zzv3));
            long j2 = zzg2.zzq;
            if (zzg2.zzk.equals(zzg2.zzb)) {
                j2 = longValue + max;
            }
            zzjo2 = zzg2.zzb(zzsb4, longValue, longValue, longValue, max, zzg2.zzh, zzg2.zzi, zzg2.zzj);
            zzjo2.zzq = j2;
        }
        return zzjo2;
    }

    private final zzjr zzao(zzjq zzjq) {
        int zzag2 = zzag();
        zzix zzix = this.zzk;
        zzci zzci = this.zzaf.zza;
        if (zzag2 == -1) {
            zzag2 = 0;
        }
        return new zzjr(zzix, zzjq, zzci, zzag2, this.zzu, zzix.zzb());
    }

    /* access modifiers changed from: private */
    public final void zzap(int i, int i2) {
        if (i != this.zzR || i2 != this.zzS) {
            this.zzR = i;
            this.zzS = i2;
            zzdm zzdm = this.zzl;
            zzdm.zzd(24, new zzht(i, i2));
            zzdm.zzc();
        }
    }

    private final void zzaq(int i, int i2, Object obj) {
        zzju[] zzjuArr = this.zzh;
        int length = zzjuArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzju zzju = zzjuArr[i3];
            if (zzju.zzb() == i) {
                zzjr zzao = zzao(zzju);
                zzao.zzf(i2);
                zzao.zze(obj);
                zzao.zzd();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzar() {
        zzaq(1, 2, Float.valueOf(this.zzX * this.zzy.zza()));
    }

    /* access modifiers changed from: private */
    public final void zzas(Object obj) {
        boolean z;
        ArrayList<zzjr> arrayList = new ArrayList<>();
        zzju[] zzjuArr = this.zzh;
        int length = zzjuArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            zzju zzju = zzjuArr[i];
            if (zzju.zzb() == 2) {
                zzjr zzao = zzao(zzju);
                zzao.zzf(1);
                zzao.zze(obj);
                zzao.zzd();
                arrayList.add(zzao);
            }
            i++;
        }
        Object obj2 = this.zzO;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (zzjr zzi2 : arrayList) {
                    zzi2.zzi(this.zzC);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (z) {
            zzat(false, zzgu.zzd(new zziz(3), 1003));
        }
    }

    private final void zzat(boolean z, zzgu zzgu) {
        zzjo zzjo = this.zzaf;
        zzjo zza = zzjo.zza(zzjo.zzb);
        zza.zzq = zza.zzs;
        zza.zzr = 0;
        zzjo zzf2 = zza.zzf(1);
        if (zzgu != null) {
            zzf2 = zzf2.zze(zzgu);
        }
        zzjo zzjo2 = zzf2;
        this.zzD++;
        this.zzk.zzo();
        zzav(zzjo2, 0, 1, false, zzjo2.zza.zzo() && !this.zzaf.zza.zzo(), 4, zzai(zzjo2), -1);
    }

    /* access modifiers changed from: private */
    public final void zzau(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzjo zzjo = this.zzaf;
        if (zzjo.zzl != z2 || zzjo.zzm != i3) {
            this.zzD++;
            zzjo zzd2 = zzjo.zzd(z2, i3);
            this.zzk.zzn(z2, i3);
            zzav(zzd2, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzav(com.google.android.gms.internal.ads.zzjo r44, int r45, int r46, boolean r47, boolean r48, int r49, long r50, int r52) {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            r2 = r49
            com.google.android.gms.internal.ads.zzjo r3 = r0.zzaf
            r0.zzaf = r1
            com.google.android.gms.internal.ads.zzci r4 = r3.zza
            com.google.android.gms.internal.ads.zzci r5 = r1.zza
            boolean r4 = r4.equals(r5)
            r5 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            r4 = r4 ^ r5
            com.google.android.gms.internal.ads.zzci r7 = r3.zza
            com.google.android.gms.internal.ads.zzci r8 = r1.zza
            boolean r9 = r8.zzo()
            r11 = 3
            r12 = 0
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r12)
            r14 = 0
            r10 = -1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            if (r9 == 0) goto L_0x003c
            boolean r9 = r7.zzo()
            if (r9 == 0) goto L_0x003c
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r13, r12)
            goto L_0x00bf
        L_0x003c:
            boolean r9 = r8.zzo()
            boolean r10 = r7.zzo()
            if (r9 == r10) goto L_0x0051
            android.util.Pair r4 = new android.util.Pair
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r4.<init>(r6, r7)
            goto L_0x00bf
        L_0x0051:
            com.google.android.gms.internal.ads.zzsb r9 = r3.zzb
            java.lang.Object r9 = r9.zza
            com.google.android.gms.internal.ads.zzcf r10 = r0.zzn
            com.google.android.gms.internal.ads.zzcf r9 = r7.zzn(r9, r10)
            int r9 = r9.zzd
            com.google.android.gms.internal.ads.zzch r10 = r0.zza
            com.google.android.gms.internal.ads.zzch r7 = r7.zze(r9, r10, r14)
            java.lang.Object r7 = r7.zzc
            com.google.android.gms.internal.ads.zzsb r9 = r1.zzb
            java.lang.Object r9 = r9.zza
            com.google.android.gms.internal.ads.zzcf r10 = r0.zzn
            com.google.android.gms.internal.ads.zzcf r9 = r8.zzn(r9, r10)
            int r9 = r9.zzd
            com.google.android.gms.internal.ads.zzch r10 = r0.zza
            com.google.android.gms.internal.ads.zzch r8 = r8.zze(r9, r10, r14)
            java.lang.Object r8 = r8.zzc
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x009f
            if (r48 == 0) goto L_0x0085
            if (r2 != 0) goto L_0x0085
            r4 = r5
            goto L_0x008e
        L_0x0085:
            if (r48 == 0) goto L_0x008b
            if (r2 != r5) goto L_0x008b
            r4 = 2
            goto L_0x008e
        L_0x008b:
            if (r4 == 0) goto L_0x0099
            r4 = r11
        L_0x008e:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.<init>(r6, r4)
            r4 = r7
            goto L_0x00bf
        L_0x0099:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x009f:
            if (r48 == 0) goto L_0x00ba
            if (r2 != 0) goto L_0x00ba
            com.google.android.gms.internal.ads.zzsb r4 = r3.zzb
            long r7 = r4.zzd
            com.google.android.gms.internal.ads.zzsb r4 = r1.zzb
            long r9 = r4.zzd
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ba
            android.util.Pair r4 = new android.util.Pair
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r4.<init>(r6, r8)
            goto L_0x00bf
        L_0x00ba:
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r13, r12)
        L_0x00bf:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.zzbh r7 = r0.zzJ
            if (r6 == 0) goto L_0x00fa
            com.google.android.gms.internal.ads.zzci r9 = r1.zza
            boolean r9 = r9.zzo()
            if (r9 != 0) goto L_0x00f4
            com.google.android.gms.internal.ads.zzci r9 = r1.zza
            com.google.android.gms.internal.ads.zzsb r10 = r1.zzb
            java.lang.Object r10 = r10.zza
            com.google.android.gms.internal.ads.zzcf r12 = r0.zzn
            com.google.android.gms.internal.ads.zzcf r9 = r9.zzn(r10, r12)
            int r9 = r9.zzd
            com.google.android.gms.internal.ads.zzci r10 = r1.zza
            com.google.android.gms.internal.ads.zzch r12 = r0.zza
            com.google.android.gms.internal.ads.zzch r9 = r10.zze(r9, r12, r14)
            com.google.android.gms.internal.ads.zzbb r9 = r9.zzd
            goto L_0x00f5
        L_0x00f4:
            r9 = 0
        L_0x00f5:
            com.google.android.gms.internal.ads.zzbh r10 = com.google.android.gms.internal.ads.zzbh.zza
            r0.zzae = r10
            goto L_0x00fb
        L_0x00fa:
            r9 = 0
        L_0x00fb:
            if (r6 != 0) goto L_0x0107
            java.util.List r10 = r3.zzj
            java.util.List r12 = r1.zzj
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x015f
        L_0x0107:
            com.google.android.gms.internal.ads.zzbh r7 = r0.zzae
            com.google.android.gms.internal.ads.zzbf r7 = r7.zza()
            java.util.List r10 = r1.zzj
            r12 = 0
        L_0x0110:
            int r13 = r10.size()
            if (r12 >= r13) goto L_0x0131
            java.lang.Object r13 = r10.get(r12)
            com.google.android.gms.internal.ads.zzbl r13 = (com.google.android.gms.internal.ads.zzbl) r13
            r8 = 0
        L_0x011d:
            int r11 = r13.zza()
            if (r8 >= r11) goto L_0x012d
            com.google.android.gms.internal.ads.zzbk r11 = r13.zzb(r8)
            r11.zza(r7)
            int r8 = r8 + 1
            goto L_0x011d
        L_0x012d:
            int r12 = r12 + 1
            r11 = 3
            goto L_0x0110
        L_0x0131:
            com.google.android.gms.internal.ads.zzbh r7 = r7.zzv()
            r0.zzae = r7
            com.google.android.gms.internal.ads.zzci r7 = r43.zzn()
            boolean r8 = r7.zzo()
            if (r8 == 0) goto L_0x0144
            com.google.android.gms.internal.ads.zzbh r7 = r0.zzae
            goto L_0x015f
        L_0x0144:
            int r8 = r43.zzf()
            com.google.android.gms.internal.ads.zzch r10 = r0.zza
            com.google.android.gms.internal.ads.zzch r7 = r7.zze(r8, r10, r14)
            com.google.android.gms.internal.ads.zzbb r7 = r7.zzd
            com.google.android.gms.internal.ads.zzbh r8 = r0.zzae
            com.google.android.gms.internal.ads.zzbf r8 = r8.zza()
            com.google.android.gms.internal.ads.zzbh r7 = r7.zzg
            r8.zzb(r7)
            com.google.android.gms.internal.ads.zzbh r7 = r8.zzv()
        L_0x015f:
            com.google.android.gms.internal.ads.zzbh r8 = r0.zzJ
            boolean r8 = r7.equals(r8)
            r8 = r8 ^ r5
            r0.zzJ = r7
            boolean r7 = r3.zzl
            boolean r10 = r1.zzl
            int r11 = r3.zze
            int r12 = r1.zze
            if (r11 != r12) goto L_0x0174
            if (r7 == r10) goto L_0x0177
        L_0x0174:
            r43.zzaw()
        L_0x0177:
            boolean r13 = r3.zzg
            boolean r5 = r1.zzg
            com.google.android.gms.internal.ads.zzci r14 = r3.zza
            com.google.android.gms.internal.ads.zzci r15 = r1.zza
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0195
            com.google.android.gms.internal.ads.zzdm r14 = r0.zzl
            com.google.android.gms.internal.ads.zzhv r15 = new com.google.android.gms.internal.ads.zzhv
            r18 = r7
            r7 = r45
            r15.<init>(r1, r7)
            r7 = 0
            r14.zzd(r7, r15)
            goto L_0x0197
        L_0x0195:
            r18 = r7
        L_0x0197:
            if (r48 == 0) goto L_0x02ca
            com.google.android.gms.internal.ads.zzcf r7 = new com.google.android.gms.internal.ads.zzcf
            r7.<init>()
            com.google.android.gms.internal.ads.zzci r14 = r3.zza
            boolean r14 = r14.zzo()
            if (r14 != 0) goto L_0x01dc
            com.google.android.gms.internal.ads.zzsb r14 = r3.zzb
            java.lang.Object r14 = r14.zza
            com.google.android.gms.internal.ads.zzci r15 = r3.zza
            r15.zzn(r14, r7)
            int r15 = r7.zzd
            r16 = r10
            com.google.android.gms.internal.ads.zzci r10 = r3.zza
            int r10 = r10.zza(r14)
            r45 = r10
            com.google.android.gms.internal.ads.zzci r10 = r3.zza
            r48 = r14
            com.google.android.gms.internal.ads.zzch r14 = r0.zza
            r19 = r11
            r20 = r12
            r11 = 0
            com.google.android.gms.internal.ads.zzch r10 = r10.zze(r15, r14, r11)
            java.lang.Object r10 = r10.zzc
            com.google.android.gms.internal.ads.zzch r11 = r0.zza
            com.google.android.gms.internal.ads.zzbb r11 = r11.zzd
            r26 = r45
            r25 = r48
            r22 = r10
            r24 = r11
            r23 = r15
            goto L_0x01ec
        L_0x01dc:
            r16 = r10
            r19 = r11
            r20 = r12
            r23 = r52
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = -1
        L_0x01ec:
            if (r2 != 0) goto L_0x0216
            com.google.android.gms.internal.ads.zzsb r10 = r3.zzb
            boolean r10 = r10.zzb()
            if (r10 == 0) goto L_0x0205
            com.google.android.gms.internal.ads.zzsb r10 = r3.zzb
            int r11 = r10.zzb
            int r10 = r10.zzc
            long r10 = r7.zzg(r11, r10)
            long r14 = zzaj(r3)
            goto L_0x0228
        L_0x0205:
            com.google.android.gms.internal.ads.zzsb r10 = r3.zzb
            int r10 = r10.zze
            r11 = -1
            if (r10 == r11) goto L_0x0213
            com.google.android.gms.internal.ads.zzjo r7 = r0.zzaf
            long r10 = zzaj(r7)
            goto L_0x0227
        L_0x0213:
            long r10 = r7.zze
            goto L_0x0227
        L_0x0216:
            com.google.android.gms.internal.ads.zzsb r7 = r3.zzb
            boolean r7 = r7.zzb()
            if (r7 == 0) goto L_0x0225
            long r10 = r3.zzs
            long r14 = zzaj(r3)
            goto L_0x0228
        L_0x0225:
            long r10 = r3.zzs
        L_0x0227:
            r14 = r10
        L_0x0228:
            com.google.android.gms.internal.ads.zzca r7 = new com.google.android.gms.internal.ads.zzca
            long r27 = com.google.android.gms.internal.ads.zzeg.zzz(r10)
            com.google.android.gms.internal.ads.zzsb r10 = r3.zzb
            long r29 = com.google.android.gms.internal.ads.zzeg.zzz(r14)
            int r11 = r10.zzb
            int r10 = r10.zzc
            r21 = r7
            r31 = r11
            r32 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r29, r31, r32)
            int r10 = r43.zzf()
            com.google.android.gms.internal.ads.zzjo r11 = r0.zzaf
            com.google.android.gms.internal.ads.zzci r11 = r11.zza
            boolean r11 = r11.zzo()
            if (r11 != 0) goto L_0x0283
            com.google.android.gms.internal.ads.zzjo r11 = r0.zzaf
            com.google.android.gms.internal.ads.zzsb r12 = r11.zzb
            java.lang.Object r12 = r12.zza
            com.google.android.gms.internal.ads.zzci r11 = r11.zza
            com.google.android.gms.internal.ads.zzcf r14 = r0.zzn
            r11.zzn(r12, r14)
            com.google.android.gms.internal.ads.zzjo r11 = r0.zzaf
            com.google.android.gms.internal.ads.zzci r11 = r11.zza
            int r11 = r11.zza(r12)
            com.google.android.gms.internal.ads.zzjo r14 = r0.zzaf
            com.google.android.gms.internal.ads.zzci r14 = r14.zza
            com.google.android.gms.internal.ads.zzch r15 = r0.zza
            r45 = r11
            r17 = r12
            r11 = 0
            com.google.android.gms.internal.ads.zzch r11 = r14.zze(r10, r15, r11)
            java.lang.Object r11 = r11.zzc
            com.google.android.gms.internal.ads.zzch r12 = r0.zza
            com.google.android.gms.internal.ads.zzbb r12 = r12.zzd
            r36 = r45
            r32 = r11
            r34 = r12
            r35 = r17
            goto L_0x028b
        L_0x0283:
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = -1
        L_0x028b:
            long r37 = com.google.android.gms.internal.ads.zzeg.zzz(r50)
            com.google.android.gms.internal.ads.zzca r11 = new com.google.android.gms.internal.ads.zzca
            com.google.android.gms.internal.ads.zzjo r12 = r0.zzaf
            com.google.android.gms.internal.ads.zzsb r12 = r12.zzb
            boolean r12 = r12.zzb()
            if (r12 == 0) goto L_0x02a8
            com.google.android.gms.internal.ads.zzjo r12 = r0.zzaf
            long r14 = zzaj(r12)
            long r14 = com.google.android.gms.internal.ads.zzeg.zzz(r14)
            r39 = r14
            goto L_0x02aa
        L_0x02a8:
            r39 = r37
        L_0x02aa:
            com.google.android.gms.internal.ads.zzjo r12 = r0.zzaf
            com.google.android.gms.internal.ads.zzsb r12 = r12.zzb
            int r14 = r12.zzb
            int r12 = r12.zzc
            r31 = r11
            r33 = r10
            r41 = r14
            r42 = r12
            r31.<init>(r32, r33, r34, r35, r36, r37, r39, r41, r42)
            com.google.android.gms.internal.ads.zzdm r10 = r0.zzl
            com.google.android.gms.internal.ads.zzib r12 = new com.google.android.gms.internal.ads.zzib
            r12.<init>(r2, r7, r11)
            r2 = 11
            r10.zzd(r2, r12)
            goto L_0x02d0
        L_0x02ca:
            r16 = r10
            r19 = r11
            r20 = r12
        L_0x02d0:
            if (r6 == 0) goto L_0x02dd
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhg r6 = new com.google.android.gms.internal.ads.zzhg
            r6.<init>(r9, r4)
            r4 = 1
            r2.zzd(r4, r6)
        L_0x02dd:
            com.google.android.gms.internal.ads.zzgu r2 = r3.zzf
            com.google.android.gms.internal.ads.zzgu r4 = r1.zzf
            if (r2 == r4) goto L_0x02fd
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhh r4 = new com.google.android.gms.internal.ads.zzhh
            r4.<init>(r1)
            r6 = 10
            r2.zzd(r6, r4)
            com.google.android.gms.internal.ads.zzgu r2 = r1.zzf
            if (r2 == 0) goto L_0x02fd
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhi r4 = new com.google.android.gms.internal.ads.zzhi
            r4.<init>(r1)
            r2.zzd(r6, r4)
        L_0x02fd:
            com.google.android.gms.internal.ads.zzvo r2 = r3.zzi
            com.google.android.gms.internal.ads.zzvo r4 = r1.zzi
            if (r2 == r4) goto L_0x0315
            com.google.android.gms.internal.ads.zzvn r2 = r0.zzi
            java.lang.Object r4 = r4.zze
            r2.zzk(r4)
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhj r4 = new com.google.android.gms.internal.ads.zzhj
            r4.<init>(r1)
            r6 = 2
            r2.zzd(r6, r4)
        L_0x0315:
            if (r8 == 0) goto L_0x0325
            com.google.android.gms.internal.ads.zzbh r2 = r0.zzJ
            com.google.android.gms.internal.ads.zzdm r4 = r0.zzl
            com.google.android.gms.internal.ads.zzhk r6 = new com.google.android.gms.internal.ads.zzhk
            r6.<init>(r2)
            r2 = 14
            r4.zzd(r2, r6)
        L_0x0325:
            if (r13 == r5) goto L_0x0332
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhl r4 = new com.google.android.gms.internal.ads.zzhl
            r4.<init>(r1)
            r5 = 3
            r2.zzd(r5, r4)
        L_0x0332:
            r2 = r19
            r4 = r20
            r6 = r16
            r5 = r18
            if (r2 != r4) goto L_0x033e
            if (r5 == r6) goto L_0x0349
        L_0x033e:
            com.google.android.gms.internal.ads.zzdm r7 = r0.zzl
            com.google.android.gms.internal.ads.zzhm r8 = new com.google.android.gms.internal.ads.zzhm
            r8.<init>(r1)
            r9 = -1
            r7.zzd(r9, r8)
        L_0x0349:
            if (r2 == r4) goto L_0x0356
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhn r4 = new com.google.android.gms.internal.ads.zzhn
            r4.<init>(r1)
            r7 = 4
            r2.zzd(r7, r4)
        L_0x0356:
            if (r5 == r6) goto L_0x0365
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhw r4 = new com.google.android.gms.internal.ads.zzhw
            r5 = r46
            r4.<init>(r1, r5)
            r5 = 5
            r2.zzd(r5, r4)
        L_0x0365:
            int r2 = r3.zzm
            int r4 = r1.zzm
            if (r2 == r4) goto L_0x0376
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhx r4 = new com.google.android.gms.internal.ads.zzhx
            r4.<init>(r1)
            r5 = 6
            r2.zzd(r5, r4)
        L_0x0376:
            boolean r2 = zzay(r3)
            boolean r4 = zzay(r44)
            if (r2 == r4) goto L_0x038b
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhy r4 = new com.google.android.gms.internal.ads.zzhy
            r4.<init>(r1)
            r5 = 7
            r2.zzd(r5, r4)
        L_0x038b:
            com.google.android.gms.internal.ads.zzbt r2 = r3.zzn
            com.google.android.gms.internal.ads.zzbt r4 = r1.zzn
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x03a1
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhz r4 = new com.google.android.gms.internal.ads.zzhz
            r4.<init>(r1)
            r5 = 12
            r2.zzd(r5, r4)
        L_0x03a1:
            if (r47 == 0) goto L_0x03ab
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzia r4 = com.google.android.gms.internal.ads.zzia.zza
            r5 = -1
            r2.zzd(r5, r4)
        L_0x03ab:
            com.google.android.gms.internal.ads.zzbx r2 = r0.zzI
            com.google.android.gms.internal.ads.zzcb r4 = r0.zzg
            com.google.android.gms.internal.ads.zzbx r5 = r0.zzc
            com.google.android.gms.internal.ads.zzbx r4 = com.google.android.gms.internal.ads.zzeg.zzF(r4, r5)
            r0.zzI = r4
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03c9
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzho r4 = new com.google.android.gms.internal.ads.zzho
            r4.<init>(r0)
            r5 = 13
            r2.zzd(r5, r4)
        L_0x03c9:
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            r2.zzc()
            boolean r2 = r3.zzo
            boolean r4 = r1.zzo
            if (r2 == r4) goto L_0x03ec
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.zzm
            java.util.Iterator r2 = r2.iterator()
        L_0x03da:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03ec
            java.lang.Object r4 = r2.next()
            com.google.android.gms.internal.ads.zzgv r4 = (com.google.android.gms.internal.ads.zzgv) r4
            boolean r5 = r1.zzo
            r4.zza(r5)
            goto L_0x03da
        L_0x03ec:
            boolean r2 = r3.zzp
            boolean r3 = r1.zzp
            if (r2 == r3) goto L_0x040a
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.zzm
            java.util.Iterator r2 = r2.iterator()
        L_0x03f8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x040a
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.zzgv r3 = (com.google.android.gms.internal.ads.zzgv) r3
            boolean r4 = r1.zzp
            r3.zzb(r4)
            goto L_0x03f8
        L_0x040a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzin.zzav(com.google.android.gms.internal.ads.zzjo, int, int, boolean, boolean, int, long, int):void");
    }

    /* access modifiers changed from: private */
    public final void zzaw() {
        int zzh2 = zzh();
        if (zzh2 == 2 || zzh2 == 3) {
            zzax();
            boolean z = this.zzaf.zzp;
            zzq();
            zzq();
        }
    }

    private final void zzax() {
        IllegalStateException illegalStateException;
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String zzH2 = zzeg.zzH("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (!this.zzaa) {
                if (this.zzab) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzdn.zzb("ExoPlayerImpl", zzH2, illegalStateException);
                this.zzab = true;
                return;
            }
            throw new IllegalStateException(zzH2);
        }
    }

    private static boolean zzay(zzjo zzjo) {
        return zzjo.zze == 3 && zzjo.zzl && zzjo.zzm == 0;
    }

    public final zzgu zzA() {
        zzax();
        return this.zzaf.zzf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzS(zziv zziv) {
        long j;
        boolean z;
        long j2;
        int i = this.zzD - zziv.zzb;
        this.zzD = i;
        boolean z2 = true;
        if (zziv.zzc) {
            this.zzE = zziv.zzd;
            this.zzF = true;
        }
        if (zziv.zze) {
            this.zzG = zziv.zzf;
        }
        if (i == 0) {
            zzci zzci = zziv.zza.zza;
            if (!this.zzaf.zza.zzo() && zzci.zzo()) {
                this.zzag = -1;
                this.zzah = 0;
            }
            if (!zzci.zzo()) {
                List zzw2 = ((zzjs) zzci).zzw();
                zzcw.zzf(zzw2.size() == this.zzo.size());
                for (int i2 = 0; i2 < zzw2.size(); i2++) {
                    ((zzim) this.zzo.get(i2)).zzb = (zzci) zzw2.get(i2);
                }
            }
            if (this.zzF) {
                if (zziv.zza.zzb.equals(this.zzaf.zzb) && zziv.zza.zzd == this.zzaf.zzs) {
                    z2 = false;
                }
                if (z2) {
                    if (zzci.zzo() || zziv.zza.zzb.zzb()) {
                        j2 = zziv.zza.zzd;
                    } else {
                        zzjo zzjo = zziv.zza;
                        zzsb zzsb = zzjo.zzb;
                        j2 = zzjo.zzd;
                        zzak(zzci, zzsb, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzF = false;
            zzav(zziv.zza, 1, this.zzG, false, z, this.zzE, j, -1);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzT(zziv zziv) {
        this.zzj.zzg(new zzhr(this, zziv));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzU(zzby zzby) {
        zzby.zza(this.zzI);
    }

    public final void zzW() {
        zzax();
        boolean zzq2 = zzq();
        int i = 2;
        int zzb2 = this.zzy.zzb(zzq2, 2);
        zzau(zzq2, zzb2, zzah(zzq2, zzb2));
        zzjo zzjo = this.zzaf;
        if (zzjo.zze == 1) {
            zzjo zze2 = zzjo.zze((zzgu) null);
            if (true == zze2.zza.zzo()) {
                i = 4;
            }
            zzjo zzf2 = zze2.zzf(i);
            this.zzD++;
            this.zzk.zzk();
            zzav(zzf2, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public final void zzX() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzeg.zze;
        String zza = zzbc.zza();
        Log.i("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.0.0-alpha03] [" + str + "] [" + zza + "]");
        zzax();
        if (zzeg.zza < 21 && (audioTrack = this.zzN) != null) {
            audioTrack.release();
            this.zzN = null;
        }
        this.zzz.zze();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzdm zzdm = this.zzl;
            zzdm.zzd(10, zzhs.zza);
            zzdm.zzc();
        }
        this.zzl.zze();
        this.zzj.zzd((Object) null);
        this.zzt.zzf(this.zzr);
        zzjo zzf2 = this.zzaf.zzf(1);
        this.zzaf = zzf2;
        zzjo zza2 = zzf2.zza(zzf2.zzb);
        this.zzaf = zza2;
        zza2.zzq = zza2.zzs;
        this.zzaf.zzr = 0;
        this.zzr.zzQ();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        this.zzZ = zzfrh.zzo();
    }

    public final void zzY(zzkl zzkl) {
        this.zzr.zzR(zzkl);
    }

    public final void zzZ(zzsd zzsd) {
        zzax();
        List singletonList = Collections.singletonList(zzsd);
        zzax();
        zzax();
        zzag();
        zzl();
        this.zzD++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzaj = this.zzaj.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzjl zzjl = new zzjl((zzsd) singletonList.get(i2), this.zzp);
            arrayList.add(zzjl);
            this.zzo.add(i2, new zzim(zzjl.zzb, zzjl.zza.zzA()));
        }
        this.zzaj = this.zzaj.zzg(0, arrayList.size());
        zzjs zzjs = new zzjs(this.zzo, this.zzaj, (byte[]) null);
        if (zzjs.zzo() || zzjs.zzc() >= 0) {
            int zzg2 = zzjs.zzg(false);
            zzjo zzan = zzan(this.zzaf, zzjs, zzal(zzjs, zzg2, -9223372036854775807L));
            int i3 = zzan.zze;
            if (!(zzg2 == -1 || i3 == 1)) {
                i3 = (zzjs.zzo() || zzg2 >= zzjs.zzc()) ? 4 : 2;
            }
            zzjo zzf2 = zzan.zzf(i3);
            this.zzk.zzq(arrayList, zzg2, zzeg.zzv(-9223372036854775807L), this.zzaj);
            zzav(zzf2, 0, 1, false, !this.zzaf.zzb.zza.equals(zzf2.zzb.zza) && !this.zzaf.zza.zzo(), 4, zzai(zzf2), -1);
            return;
        }
        throw new zzae(zzjs, -1, -9223372036854775807L);
    }

    public final void zzaa(boolean z) {
        zzax();
        int zzb2 = this.zzy.zzb(z, zzh());
        zzau(z, zzb2, zzah(z, zzb2));
    }

    /* access modifiers changed from: package-private */
    public final void zzab(boolean z) {
        this.zzaa = false;
    }

    public final void zzac(Surface surface) {
        zzax();
        zzas(surface);
        int i = surface == null ? 0 : -1;
        zzap(i, i);
    }

    public final void zzad(float f) {
        zzax();
        float zza = zzeg.zza(f, 0.0f, 1.0f);
        if (this.zzX != zza) {
            this.zzX = zza;
            zzar();
            zzdm zzdm = this.zzl;
            zzdm.zzd(22, new zzhu(zza));
            zzdm.zzc();
        }
    }

    public final void zzae() {
        zzax();
        zzax();
        this.zzy.zzb(zzq(), 1);
        zzat(false, (zzgu) null);
        this.zzZ = zzfrh.zzo();
    }

    public final int zzd() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzb;
        }
        return -1;
    }

    public final int zze() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzc;
        }
        return -1;
    }

    public final int zzf() {
        zzax();
        int zzag2 = zzag();
        if (zzag2 == -1) {
            return 0;
        }
        return zzag2;
    }

    public final int zzg() {
        zzax();
        if (this.zzaf.zza.zzo()) {
            return 0;
        }
        zzjo zzjo = this.zzaf;
        return zzjo.zza.zza(zzjo.zzb.zza);
    }

    public final int zzh() {
        zzax();
        return this.zzaf.zze;
    }

    public final int zzi() {
        zzax();
        return this.zzaf.zzm;
    }

    public final int zzj() {
        zzax();
        return 0;
    }

    public final long zzk() {
        zzax();
        if (!zzs()) {
            return zzl();
        }
        zzjo zzjo = this.zzaf;
        zzjo.zza.zzn(zzjo.zzb.zza, this.zzn);
        zzjo zzjo2 = this.zzaf;
        if (zzjo2.zzc != -9223372036854775807L) {
            return zzeg.zzz(0) + zzeg.zzz(this.zzaf.zzc);
        }
        long j = zzjo2.zza.zze(zzf(), this.zza, 0).zzm;
        return zzeg.zzz(0);
    }

    public final long zzl() {
        zzax();
        return zzeg.zzz(zzai(this.zzaf));
    }

    public final long zzm() {
        zzax();
        return zzeg.zzz(this.zzaf.zzr);
    }

    public final zzci zzn() {
        zzax();
        return this.zzaf.zza;
    }

    public final zzct zzo() {
        zzax();
        return this.zzaf.zzi.zzd;
    }

    public final void zzp(int i, long j) {
        int i2 = i;
        long j2 = j;
        zzax();
        this.zzr.zzx();
        zzci zzci = this.zzaf.zza;
        if (i2 < 0 || (!zzci.zzo() && i2 >= zzci.zzc())) {
            throw new zzae(zzci, i, j2);
        }
        int i3 = 1;
        this.zzD++;
        if (zzs()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zziv zziv = new zziv(this.zzaf);
            zziv.zza(1);
            this.zzai.zza.zzT(zziv);
            return;
        }
        if (zzh() != 1) {
            i3 = 2;
        }
        int zzf2 = zzf();
        zzjo zzan = zzan(this.zzaf.zzf(i3), zzci, zzal(zzci, i, j2));
        this.zzk.zzl(zzci, i, zzeg.zzv(j));
        zzav(zzan, 0, 1, true, true, 1, zzai(zzan), zzf2);
    }

    public final boolean zzq() {
        zzax();
        return this.zzaf.zzl;
    }

    public final boolean zzr() {
        zzax();
        return false;
    }

    public final boolean zzs() {
        zzax();
        return this.zzaf.zzb.zzb();
    }

    public final int zzu() {
        zzax();
        int length = this.zzh.length;
        return 2;
    }

    public final long zzv() {
        zzax();
        if (zzs()) {
            zzjo zzjo = this.zzaf;
            if (zzjo.zzk.equals(zzjo.zzb)) {
                return zzeg.zzz(this.zzaf.zzq);
            }
            return zzw();
        }
        zzax();
        if (this.zzaf.zza.zzo()) {
            return this.zzah;
        }
        zzjo zzjo2 = this.zzaf;
        long j = 0;
        if (zzjo2.zzk.zzd != zzjo2.zzb.zzd) {
            return zzeg.zzz(zzjo2.zza.zze(zzf(), this.zza, 0).zzn);
        }
        long j2 = zzjo2.zzq;
        if (this.zzaf.zzk.zzb()) {
            zzjo zzjo3 = this.zzaf;
            zzjo3.zza.zzn(zzjo3.zzk.zza, this.zzn).zzh(this.zzaf.zzk.zzb);
        } else {
            j = j2;
        }
        zzjo zzjo4 = this.zzaf;
        zzak(zzjo4.zza, zzjo4.zzk, j);
        return zzeg.zzz(j);
    }

    public final long zzw() {
        zzax();
        if (!zzs()) {
            zzci zzn2 = zzn();
            if (zzn2.zzo()) {
                return -9223372036854775807L;
            }
            return zzeg.zzz(zzn2.zze(zzf(), this.zza, 0).zzn);
        }
        zzjo zzjo = this.zzaf;
        zzsb zzsb = zzjo.zzb;
        zzjo.zza.zzn(zzsb.zza, this.zzn);
        return zzeg.zzz(this.zzn.zzg(zzsb.zzb, zzsb.zzc));
    }

    public final void zzR(zzkl zzkl) {
        if (zzkl != null) {
            this.zzr.zzw(zzkl);
            return;
        }
        throw null;
    }
}
