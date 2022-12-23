package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzckv extends zzchi implements zzft, zzkl {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzckg zze;
    private final zzvf zzf;
    private final zzchq zzg;
    private final WeakReference zzh;
    private final zztg zzi;
    private zzjz zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private zzchh zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private final String zzq;
    private final int zzr;
    private final Object zzs = new Object();
    private final ArrayList zzt;
    private volatile zzcki zzu;
    private final Set zzv = new HashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00fd, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbhy.zzbB)).booleanValue() == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0103, code lost:
        if (r4.zzg.zzj == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0105, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0106, code lost:
        r7 = r4.zzg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010a, code lost:
        if (r7.zzo == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010c, code lost:
        r7 = new com.google.android.gms.internal.ads.zzckm(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0114, code lost:
        if (r7.zzi <= 0) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0116, code lost:
        r7 = new com.google.android.gms.internal.ads.zzckn(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011c, code lost:
        r7 = new com.google.android.gms.internal.ads.zzcko(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0125, code lost:
        if (r4.zzg.zzj == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0127, code lost:
        r6 = new com.google.android.gms.internal.ads.zzckp(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x012e, code lost:
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012f, code lost:
        r5 = r4.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0131, code lost:
        if (r5 == null) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0137, code lost:
        if (r5.limit() <= 0) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0139, code lost:
        r5 = new byte[r4.zzk.limit()];
        r4.zzk.get(r5);
        r6 = new com.google.android.gms.internal.ads.zzckq(r6, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzckv(android.content.Context r5, com.google.android.gms.internal.ads.zzchq r6, com.google.android.gms.internal.ads.zzchr r7) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.zzs = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.zzv = r0
            r4.zzd = r5
            r4.zzg = r6
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r7)
            r4.zzh = r6
            com.google.android.gms.internal.ads.zzckg r6 = new com.google.android.gms.internal.ads.zzckg
            r6.<init>()
            r4.zze = r6
            com.google.android.gms.internal.ads.zzvf r6 = new com.google.android.gms.internal.ads.zzvf
            android.content.Context r0 = r4.zzd
            r6.<init>(r0)
            r4.zzf = r6
            boolean r6 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r6 == 0) goto L_0x003f
            java.lang.String r6 = r4.toString()
            java.lang.String r0 = "OfficialSimpleExoPlayerAdapter initialize "
            java.lang.String r6 = r0.concat(r6)
            com.google.android.gms.ads.internal.util.zze.zza(r6)
        L_0x003f:
            java.util.concurrent.atomic.AtomicInteger r6 = zza
            r6.incrementAndGet()
            com.google.android.gms.internal.ads.zzjy r6 = new com.google.android.gms.internal.ads.zzjy
            android.content.Context r0 = r4.zzd
            com.google.android.gms.internal.ads.zzckr r1 = new com.google.android.gms.internal.ads.zzckr
            r1.<init>(r4)
            r2 = 0
            r6.<init>(r0, r1, r2)
            com.google.android.gms.internal.ads.zzvf r0 = r4.zzf
            r6.zzb(r0)
            com.google.android.gms.internal.ads.zzckg r0 = r4.zze
            r6.zza(r0)
            com.google.android.gms.internal.ads.zzjz r6 = r6.zzc()
            r4.zzj = r6
            com.google.android.gms.internal.ads.zzbhq r6 = com.google.android.gms.internal.ads.zzbhy.zzbI
            com.google.android.gms.internal.ads.zzbhw r0 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r6 = r0.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0078
            com.google.android.gms.internal.ads.zzjz r6 = r4.zzj
            com.google.android.gms.internal.ads.zziy.zza(r6)
        L_0x0078:
            com.google.android.gms.internal.ads.zzjz r6 = r4.zzj
            r6.zzx(r4)
            r6 = 0
            r4.zzn = r6
            r0 = 0
            r4.zzp = r0
            r4.zzo = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.zzt = r0
            r4.zzu = r2
            if (r7 == 0) goto L_0x009c
            java.lang.String r0 = r7.zzt()
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r7.zzt()
            goto L_0x009e
        L_0x009c:
            java.lang.String r0 = ""
        L_0x009e:
            r4.zzq = r0
            if (r7 == 0) goto L_0x00a7
            int r0 = r7.zzh()
            goto L_0x00a8
        L_0x00a7:
            r0 = r6
        L_0x00a8:
            r4.zzr = r0
            com.google.android.gms.internal.ads.zztg r0 = new com.google.android.gms.internal.ads.zztg
            com.google.android.gms.ads.internal.util.zzs r1 = com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.internal.ads.zzcfo r7 = r7.zzp()
            java.lang.String r7 = r7.zza
            java.lang.String r5 = r1.zzc(r5, r7)
            boolean r7 = r4.zzl
            if (r7 == 0) goto L_0x00da
            java.nio.ByteBuffer r7 = r4.zzk
            int r7 = r7.limit()
            if (r7 <= 0) goto L_0x00da
            java.nio.ByteBuffer r5 = r4.zzk
            int r5 = r5.limit()
            byte[] r5 = new byte[r5]
            java.nio.ByteBuffer r6 = r4.zzk
            r6.get(r5)
            com.google.android.gms.internal.ads.zzckk r6 = new com.google.android.gms.internal.ads.zzckk
            r6.<init>(r5)
            goto L_0x014c
        L_0x00da:
            com.google.android.gms.internal.ads.zzbhq r7 = com.google.android.gms.internal.ads.zzbhy.zzbK
            com.google.android.gms.internal.ads.zzbhw r1 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r7 = r1.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r1 = 1
            if (r7 == 0) goto L_0x00ff
            com.google.android.gms.internal.ads.zzbhq r7 = com.google.android.gms.internal.ads.zzbhy.zzbB
            com.google.android.gms.internal.ads.zzbhw r3 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r7 = r3.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x0105
        L_0x00ff:
            com.google.android.gms.internal.ads.zzchq r7 = r4.zzg
            boolean r7 = r7.zzj
            if (r7 != 0) goto L_0x0106
        L_0x0105:
            r6 = r1
        L_0x0106:
            com.google.android.gms.internal.ads.zzchq r7 = r4.zzg
            boolean r1 = r7.zzo
            if (r1 == 0) goto L_0x0112
            com.google.android.gms.internal.ads.zzckm r7 = new com.google.android.gms.internal.ads.zzckm
            r7.<init>(r4, r5, r6)
            goto L_0x0121
        L_0x0112:
            int r7 = r7.zzi
            if (r7 <= 0) goto L_0x011c
            com.google.android.gms.internal.ads.zzckn r7 = new com.google.android.gms.internal.ads.zzckn
            r7.<init>(r4, r5, r6)
            goto L_0x0121
        L_0x011c:
            com.google.android.gms.internal.ads.zzcko r7 = new com.google.android.gms.internal.ads.zzcko
            r7.<init>(r4, r5, r6)
        L_0x0121:
            com.google.android.gms.internal.ads.zzchq r5 = r4.zzg
            boolean r5 = r5.zzj
            if (r5 == 0) goto L_0x012e
            com.google.android.gms.internal.ads.zzckp r5 = new com.google.android.gms.internal.ads.zzckp
            r5.<init>(r4, r7)
            r6 = r5
            goto L_0x012f
        L_0x012e:
            r6 = r7
        L_0x012f:
            java.nio.ByteBuffer r5 = r4.zzk
            if (r5 == 0) goto L_0x014c
            int r5 = r5.limit()
            if (r5 <= 0) goto L_0x014c
            java.nio.ByteBuffer r5 = r4.zzk
            int r5 = r5.limit()
            byte[] r5 = new byte[r5]
            java.nio.ByteBuffer r7 = r4.zzk
            r7.get(r5)
            com.google.android.gms.internal.ads.zzckq r7 = new com.google.android.gms.internal.ads.zzckq
            r7.<init>(r6, r5)
            r6 = r7
        L_0x014c:
            com.google.android.gms.internal.ads.zzbhq r5 = com.google.android.gms.internal.ads.zzbhy.zzm
            com.google.android.gms.internal.ads.zzbhw r7 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r5 = r7.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0161
            com.google.android.gms.internal.ads.zzckt r5 = com.google.android.gms.internal.ads.zzckt.zza
            goto L_0x0163
        L_0x0161:
            com.google.android.gms.internal.ads.zzcku r5 = com.google.android.gms.internal.ads.zzcku.zza
        L_0x0163:
            com.google.android.gms.internal.ads.zztf r7 = new com.google.android.gms.internal.ads.zztf
            r7.<init>(r5)
            r0.<init>(r6, r7, r2)
            r4.zzi = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzckv.<init>(android.content.Context, com.google.android.gms.internal.ads.zzchq, com.google.android.gms.internal.ads.zzchr):void");
    }

    private final boolean zzZ() {
        return this.zzu != null && this.zzu.zzq();
    }

    public final void finalize() {
        zza.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    public final long zzA() {
        if (!zzZ()) {
            return (long) this.zzn;
        }
        return 0;
    }

    public final long zzB() {
        if (zzZ()) {
            return this.zzu.zzl();
        }
        synchronized (this.zzs) {
            while (!this.zzt.isEmpty()) {
                long j = this.zzp;
                Map zze2 = ((zzfo) this.zzt.remove(0)).zze();
                long j2 = 0;
                if (zze2 != null) {
                    Iterator it = zze2.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (!(entry.getKey() == null || !zzfoa.zzc("content-length", (CharSequence) entry.getKey()) || entry.getValue() == null || ((List) entry.getValue()).get(0) == null)) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzp = j + j2;
            }
        }
        return this.zzp;
    }

    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zzE() {
        zzjz zzjz = this.zzj;
        if (zzjz != null) {
            zzjz.zzA(this);
            this.zzj.zzz();
            this.zzj = null;
            zzb.decrementAndGet();
        }
    }

    public final void zzF(long j) {
        zzjz zzjz = this.zzj;
        zzjz.zzp(zzjz.zzf(), j);
    }

    public final void zzG(int i) {
        this.zze.zzk(i);
    }

    public final void zzH(int i) {
        this.zze.zzl(i);
    }

    public final void zzI(zzchh zzchh) {
        this.zzm = zzchh;
    }

    public final void zzJ(int i) {
        this.zze.zzm(i);
    }

    public final void zzK(int i) {
        this.zze.zzn(i);
    }

    public final void zzL(boolean z) {
        this.zzj.zzC(z);
    }

    public final void zzM(boolean z) {
        if (this.zzj != null) {
            int i = 0;
            while (true) {
                this.zzj.zzt();
                if (i < 2) {
                    zzvf zzvf = this.zzf;
                    zzuw zzd2 = zzvf.zzc().zzd();
                    zzd2.zzo(i, !z);
                    zzvf.zzg(zzd2);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzN(int i) {
        for (WeakReference weakReference : this.zzv) {
            zzckf zzckf = (zzckf) weakReference.get();
            if (zzckf != null) {
                zzckf.zzm(i);
            }
        }
    }

    public final void zzO(Surface surface, boolean z) {
        zzjz zzjz = this.zzj;
        if (zzjz != null) {
            zzjz.zzE(surface);
        }
    }

    public final void zzP(float f, boolean z) {
        zzjz zzjz = this.zzj;
        if (zzjz != null) {
            zzjz.zzF(f);
        }
    }

    public final void zzQ() {
        this.zzj.zzG();
    }

    public final boolean zzR() {
        return this.zzj != null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzer zzS(String str, boolean z) {
        zzckv zzckv = true != z ? null : this;
        zzchq zzchq = this.zzg;
        return new zzcky(str, zzckv, zzchq.zzd, zzchq.zzf, zzchq.zzp, zzchq.zzq);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzer zzT(String str, boolean z) {
        zzckv zzckv = true != z ? null : this;
        zzchq zzchq = this.zzg;
        zzckf zzckf = new zzckf(str, zzckv, zzchq.zzd, zzchq.zzf, zzchq.zzi);
        this.zzv.add(new WeakReference(zzckf));
        return zzckf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzer zzU(String str, boolean z) {
        zzez zzez = new zzez();
        zzez.zzf(str);
        zzez.zze(true != z ? null : this);
        zzez.zzc(this.zzg.zzd);
        zzez.zzd(this.zzg.zzf);
        zzez.zzb(true);
        return zzez.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzer zzV(zzeq zzeq) {
        return new zzcki(this.zzd, zzeq.zza(), this.zzq, this.zzr, this, new zzckl(this), (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    public final zzsd zzW(Uri uri) {
        zzah zzah = new zzah();
        zzah.zzb(uri);
        zzbb zzc2 = zzah.zzc();
        zztg zztg = this.zzi;
        zztg.zza(this.zzg.zzg);
        return zztg.zzb(zzc2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzX(boolean z, long j) {
        zzchh zzchh = this.zzm;
        if (zzchh != null) {
            zzchh.zzi(z, j);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzju[] zzY(Handler handler, zzxr zzxr, zznl zznl, zzub zzub, zzrb zzrb) {
        Context context = this.zzd;
        zzql zzql = zzql.zzb;
        zzmw zzmw = zzmw.zza;
        zzmz[] zzmzArr = new zzmz[0];
        zzob zzob = new zzob();
        zzmw zzmw2 = zzmw.zza;
        if (zzmw == null) {
            if (zzmw2 != null) {
                zzmw = zzmw2;
            } else {
                throw new NullPointerException("Both parameters are null");
            }
        }
        zzob.zzb(zzmw);
        zzob.zzc(zzmzArr);
        return new zzju[]{new zzot(context, zzqd.zza, zzql, false, handler, zznl, zzob.zzd()), new zzwx(this.zzd, zzqd.zza, zzql.zzb, 0, false, handler, zzxr, -1, 30.0f)};
    }

    public final void zza(zzer zzer, zzew zzew, boolean z, int i) {
        this.zzn += i;
    }

    public final void zzb(zzer zzer, zzew zzew, boolean z) {
    }

    public final void zzc(zzer zzer, zzew zzew, boolean z) {
    }

    public final void zzd(zzer zzer, zzew zzew, boolean z) {
        if (zzer instanceof zzfo) {
            synchronized (this.zzs) {
                this.zzt.add((zzfo) zzer);
            }
        } else if (zzer instanceof zzcki) {
            this.zzu = (zzcki) zzer;
            zzchr zzchr = (zzchr) this.zzh.get();
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() && zzchr != null && this.zzu.zzn()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzu.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzu.zzo()));
                zzs.zza.post(new zzcks(zzchr, hashMap));
            }
        }
    }

    public final void zze(zzkj zzkj, zzad zzad, zzgn zzgn) {
        zzchr zzchr = (zzchr) this.zzh.get();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() && zzchr != null && zzad != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", zzad.zzl);
            hashMap.put("audioSampleMime", zzad.zzm);
            hashMap.put("audioCodec", zzad.zzj);
            zzchr.zzd("onMetadataEvent", hashMap);
        }
    }

    public final /* synthetic */ void zzf(zzkj zzkj, int i, long j, long j2) {
    }

    public final /* synthetic */ void zzg(zzkj zzkj, zzrx zzrx) {
    }

    public final void zzh(zzkj zzkj, int i, long j) {
        this.zzo += i;
    }

    public final /* synthetic */ void zzi(zzcb zzcb, zzkk zzkk) {
    }

    public final void zzj(zzkj zzkj, zzrs zzrs, zzrx zzrx, IOException iOException, boolean z) {
        zzchh zzchh = this.zzm;
        if (zzchh == null) {
            return;
        }
        if (this.zzg.zzl) {
            zzchh.zzl("onLoadException", iOException);
        } else {
            zzchh.zzk("onLoadError", iOException);
        }
    }

    public final void zzk(zzkj zzkj, int i) {
        zzchh zzchh = this.zzm;
        if (zzchh != null) {
            zzchh.zzm(i);
        }
    }

    public final void zzl(zzkj zzkj, zzbr zzbr) {
        zzchh zzchh = this.zzm;
        if (zzchh != null) {
            zzchh.zzk("onPlayerError", zzbr);
        }
    }

    public final /* synthetic */ void zzm(zzkj zzkj, zzca zzca, zzca zzca2, int i) {
    }

    public final void zzn(zzkj zzkj, Object obj, long j) {
        zzchh zzchh = this.zzm;
        if (zzchh != null) {
            zzchh.zzv();
        }
    }

    public final /* synthetic */ void zzo(zzkj zzkj, zzgm zzgm) {
    }

    public final void zzp(zzkj zzkj, zzad zzad, zzgn zzgn) {
        zzchr zzchr = (zzchr) this.zzh.get();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() && zzchr != null && zzad != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzad.zzt));
            hashMap.put("bitRate", String.valueOf(zzad.zzi));
            int i = zzad.zzr;
            int i2 = zzad.zzs;
            hashMap.put("resolution", i + "x" + i2);
            hashMap.put("videoMime", zzad.zzl);
            hashMap.put("videoSampleMime", zzad.zzm);
            hashMap.put("videoCodec", zzad.zzj);
            zzchr.zzd("onMetadataEvent", hashMap);
        }
    }

    public final void zzq(zzkj zzkj, zzcv zzcv) {
        zzchh zzchh = this.zzm;
        if (zzchh != null) {
            zzchh.zzC(zzcv.zzc, zzcv.zzd);
        }
    }

    public final int zzr() {
        return this.zzo;
    }

    public final int zzt() {
        return this.zzj.zzh();
    }

    public final long zzv() {
        return this.zzj.zzu();
    }

    public final long zzw() {
        return (long) this.zzn;
    }

    public final long zzx() {
        if (zzZ() && this.zzu.zzp()) {
            return Math.min((long) this.zzn, this.zzu.zzk());
        }
        return 0;
    }

    public final long zzy() {
        return this.zzj.zzl();
    }

    public final long zzz() {
        return this.zzj.zzv();
    }

    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzsd zzsd;
        if (this.zzj != null) {
            this.zzk = byteBuffer;
            this.zzl = z;
            int length = uriArr.length;
            if (length == 1) {
                zzsd = zzW(uriArr[0]);
            } else {
                zzsd[] zzsdArr = new zzsd[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzsdArr[i] = zzW(uriArr[i]);
                }
                zzsd = new zzst(false, false, zzsdArr);
            }
            this.zzj.zzB(zzsd);
            this.zzj.zzy();
            zzb.incrementAndGet();
        }
    }
}
