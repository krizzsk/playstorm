package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcij extends zzcgx implements TextureView.SurfaceTextureListener, zzchh {
    private final zzchr zzc;
    private final zzchs zzd;
    private final zzchq zze;
    private zzcgw zzf;
    private Surface zzg;
    private zzchi zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl = 1;
    private zzchp zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcij(Context context, zzchs zzchs, zzchr zzchr, boolean z, boolean z2, zzchq zzchq) {
        super(context);
        this.zzc = zzchr;
        this.zzd = zzchs;
        this.zzn = z;
        this.zze = zzchq;
        setSurfaceTextureListener(this);
        this.zzd.zza(this);
    }

    private static String zzS(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + CertificateUtil.DELIMITER + message;
    }

    private final void zzT() {
        zzchi zzchi = this.zzh;
        if (zzchi != null) {
            zzchi.zzM(true);
        }
    }

    private final void zzU() {
        if (!this.zzo) {
            this.zzo = true;
            zzs.zza.post(new zzcid(this));
            zzn();
            this.zzd.zzb();
            if (this.zzp) {
                zzp();
            }
        }
    }

    private final void zzV(boolean z) {
        zzchi zzchi = this.zzh;
        if ((zzchi == null || z) && this.zzi != null && this.zzg != null) {
            if (z) {
                if (zzad()) {
                    zzchi.zzQ();
                    zzX();
                } else {
                    zze.zzj("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.zzi.startsWith("cache:")) {
                zzcju zzr2 = this.zzc.zzr(this.zzi);
                if (zzr2 instanceof zzckd) {
                    zzchi zzj2 = ((zzckd) zzr2).zzj();
                    this.zzh = zzj2;
                    if (!zzj2.zzR()) {
                        zze.zzj("Precached video player has been released.");
                        return;
                    }
                } else if (zzr2 instanceof zzcka) {
                    zzcka zzcka = (zzcka) zzr2;
                    String zzE = zzE();
                    ByteBuffer zzl2 = zzcka.zzl();
                    boolean zzm2 = zzcka.zzm();
                    String zzi2 = zzcka.zzi();
                    if (zzi2 == null) {
                        zze.zzj("Stream cache URL is null.");
                        return;
                    }
                    zzchi zzD = zzD();
                    this.zzh = zzD;
                    zzD.zzD(new Uri[]{Uri.parse(zzi2)}, zzE, zzl2, zzm2);
                } else {
                    zze.zzj("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                    return;
                }
            } else {
                this.zzh = zzD();
                String zzE2 = zzE();
                Uri[] uriArr = new Uri[this.zzj.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.zzj;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.zzh.zzC(uriArr, zzE2);
            }
            this.zzh.zzI(this);
            zzZ(this.zzg, false);
            if (this.zzh.zzR()) {
                int zzt = this.zzh.zzt();
                this.zzl = zzt;
                if (zzt == 3) {
                    zzU();
                }
            }
        }
    }

    private final void zzW() {
        zzchi zzchi = this.zzh;
        if (zzchi != null) {
            zzchi.zzM(false);
        }
    }

    private final void zzX() {
        if (this.zzh != null) {
            zzZ((Surface) null, true);
            zzchi zzchi = this.zzh;
            if (zzchi != null) {
                zzchi.zzI((zzchh) null);
                this.zzh.zzE();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzY(float f, boolean z) {
        zzchi zzchi = this.zzh;
        if (zzchi != null) {
            try {
                zzchi.zzP(f, false);
            } catch (IOException e) {
                zzcfi.zzk("", e);
            }
        } else {
            zze.zzj("Trying to set volume before player is initialized.");
        }
    }

    private final void zzZ(Surface surface, boolean z) {
        zzchi zzchi = this.zzh;
        if (zzchi != null) {
            try {
                zzchi.zzO(surface, z);
            } catch (IOException e) {
                zzcfi.zzk("", e);
            }
        } else {
            zze.zzj("Trying to set surface before player is initialized.");
        }
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i, int i2) {
        float f = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.zzs != f) {
            this.zzs = f;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzchi zzchi = this.zzh;
        return zzchi != null && zzchi.zzR() && !this.zzk;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzs;
        if (f != 0.0f && this.zzm == null) {
            float f2 = (float) measuredWidth;
            float f3 = f2 / ((float) measuredHeight);
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (((float) measuredHeight) * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzchp zzchp = this.zzm;
        if (zzchp != null) {
            zzchp.zzc(measuredWidth, measuredHeight);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzn) {
            zzchp zzchp = new zzchp(getContext());
            this.zzm = zzchp;
            zzchp.zzd(surfaceTexture, i, i2);
            this.zzm.start();
            SurfaceTexture zzb = this.zzm.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzV(false);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzT();
            }
        }
        if (this.zzq == 0 || this.zzr == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        zzs.zza.post(new zzcie(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzchp zzchp = this.zzm;
        if (zzchp != null) {
            zzchp.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzW();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ((Surface) null, true);
        }
        zzs.zza.post(new zzcih(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzchp zzchp = this.zzm;
        if (zzchp != null) {
            zzchp.zzc(i, i2);
        }
        zzs.zza.post(new zzcig(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        zzs.zza.post(new zzcif(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final void zzA(int i) {
        zzchi zzchi = this.zzh;
        if (zzchi != null) {
            zzchi.zzN(i);
        }
    }

    public final void zzC(int i, int i2) {
        this.zzq = i;
        this.zzr = i2;
        zzaa();
    }

    /* access modifiers changed from: package-private */
    public final zzchi zzD() {
        if (this.zze.zzm) {
            return new zzckv(this.zzc.getContext(), this.zze, this.zzc);
        }
        return new zzciz(this.zzc.getContext(), this.zze, this.zzc);
    }

    /* access modifiers changed from: package-private */
    public final String zzE() {
        return zzt.zzp().zzc(this.zzc.getContext(), this.zzc.zzp().zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzF(String str) {
        zzcgw zzcgw = this.zzf;
        if (zzcgw != null) {
            zzcgw.zzb("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzG() {
        zzcgw zzcgw = this.zzf;
        if (zzcgw != null) {
            zzcgw.zza();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzH() {
        zzcgw zzcgw = this.zzf;
        if (zzcgw != null) {
            zzcgw.zzf();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzI(boolean z, long j) {
        this.zzc.zzx(z, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(String str) {
        zzcgw zzcgw = this.zzf;
        if (zzcgw != null) {
            zzcgw.zzc("ExoPlayerAdapter exception", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzK() {
        zzcgw zzcgw = this.zzf;
        if (zzcgw != null) {
            zzcgw.zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzL() {
        zzcgw zzcgw = this.zzf;
        if (zzcgw != null) {
            zzcgw.zzh();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzM() {
        zzcgw zzcgw = this.zzf;
        if (zzcgw != null) {
            zzcgw.zzi();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzN(int i, int i2) {
        zzcgw zzcgw = this.zzf;
        if (zzcgw != null) {
            zzcgw.zzj(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzO() {
        zzY(this.zzb.zza(), false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzP(int i) {
        zzcgw zzcgw = this.zzf;
        if (zzcgw != null) {
            zzcgw.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzQ() {
        zzcgw zzcgw = this.zzf;
        if (zzcgw != null) {
            zzcgw.zzd();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzR() {
        zzcgw zzcgw = this.zzf;
        if (zzcgw != null) {
            zzcgw.zze();
        }
    }

    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    public final int zzb() {
        zzchi zzchi = this.zzh;
        if (zzchi != null) {
            return zzchi.zzr();
        }
        return -1;
    }

    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    public final int zzd() {
        return this.zzr;
    }

    public final int zze() {
        return this.zzq;
    }

    public final long zzf() {
        zzchi zzchi = this.zzh;
        if (zzchi != null) {
            return zzchi.zzx();
        }
        return -1;
    }

    public final long zzg() {
        zzchi zzchi = this.zzh;
        if (zzchi != null) {
            return zzchi.zzA();
        }
        return -1;
    }

    public final long zzh() {
        zzchi zzchi = this.zzh;
        if (zzchi != null) {
            return zzchi.zzB();
        }
        return -1;
    }

    public final void zzi(boolean z, long j) {
        if (this.zzc != null) {
            zzcfv.zze.execute(new zzchw(this, z, j));
        }
    }

    public final String zzj() {
        return "ExoPlayer/3".concat(true != this.zzn ? "" : " spherical");
    }

    public final void zzk(String str, Exception exc) {
        String zzS = zzS(str, exc);
        zze.zzj("ExoPlayerAdapter error: ".concat(zzS));
        this.zzk = true;
        if (this.zze.zza) {
            zzW();
        }
        zzs.zza.post(new zzchz(this, zzS));
        zzt.zzo().zzs(exc, "AdExoPlayerView.onError");
    }

    public final void zzl(String str, Exception exc) {
        String zzS = zzS("onLoadException", exc);
        zze.zzj("ExoPlayerAdapter exception: ".concat(zzS));
        zzt.zzo().zzs(exc, "AdExoPlayerView.onException");
        zzs.zza.post(new zzchy(this, zzS));
    }

    public final void zzm(int i) {
        if (this.zzl != i) {
            this.zzl = i;
            if (i == 3) {
                zzU();
            } else if (i == 4) {
                if (this.zze.zza) {
                    zzW();
                }
                this.zzd.zze();
                this.zzb.zzc();
                zzs.zza.post(new zzchx(this));
            }
        }
    }

    public final void zzn() {
        if (this.zze.zzm) {
            zzs.zza.post(new zzcib(this));
        } else {
            zzY(this.zzb.zza(), false);
        }
    }

    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzW();
            }
            this.zzh.zzL(false);
            this.zzd.zze();
            this.zzb.zzc();
            zzs.zza.post(new zzcic(this));
        }
    }

    public final void zzp() {
        if (zzac()) {
            if (this.zze.zza) {
                zzT();
            }
            this.zzh.zzL(true);
            this.zzd.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            zzs.zza.post(new zzcii(this));
            return;
        }
        this.zzp = true;
    }

    public final void zzq(int i) {
        if (zzac()) {
            this.zzh.zzF((long) i);
        }
    }

    public final void zzr(zzcgw zzcgw) {
        this.zzf = zzcgw;
    }

    public final void zzs(String str) {
        if (str != null) {
            zzB(str, (String[]) null);
        }
    }

    public final void zzt() {
        if (zzad()) {
            this.zzh.zzQ();
            zzX();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    public final void zzu(float f, float f2) {
        zzchp zzchp = this.zzm;
        if (zzchp != null) {
            zzchp.zzf(f, f2);
        }
    }

    public final void zzv() {
        zzs.zza.post(new zzcia(this));
    }

    public final void zzw(int i) {
        zzchi zzchi = this.zzh;
        if (zzchi != null) {
            zzchi.zzG(i);
        }
    }

    public final void zzx(int i) {
        zzchi zzchi = this.zzh;
        if (zzchi != null) {
            zzchi.zzH(i);
        }
    }

    public final void zzy(int i) {
        zzchi zzchi = this.zzh;
        if (zzchi != null) {
            zzchi.zzJ(i);
        }
    }

    public final void zzz(int i) {
        zzchi zzchi = this.zzh;
        if (zzchi != null) {
            zzchi.zzK(i);
        }
    }

    public final void zzB(String str, String[] strArr) {
        if (str != null) {
            boolean z = true;
            if (strArr == null) {
                this.zzj = new String[]{str};
            } else {
                this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            String str2 = this.zzi;
            if (!this.zze.zzn || str2 == null || str.equals(str2) || this.zzl != 4) {
                z = false;
            }
            this.zzi = str;
            zzV(z);
        }
    }
}
