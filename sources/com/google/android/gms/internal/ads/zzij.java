package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzij implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzxr, zznl, zzub, zzrb, zzgj, zzgf, zzkb, zzgv {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzin zza;

    /* synthetic */ zzij(zzin zzin, zzii zzii) {
        this.zza = zzin;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzin.zzN(this.zza, surfaceTexture);
        this.zza.zzap(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzas((Object) null);
        this.zza.zzap(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzap(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzap(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzap(0, 0);
    }

    public final /* synthetic */ void zza(boolean z) {
    }

    public final void zzb(boolean z) {
        this.zza.zzaw();
    }

    public final void zzc(Exception exc) {
        this.zza.zzr.zzy(exc);
    }

    public final void zzd(String str, long j, long j2) {
        this.zza.zzr.zzz(str, j, j2);
    }

    public final void zze(String str) {
        this.zza.zzr.zzA(str);
    }

    public final void zzf(zzgm zzgm) {
        this.zza.zzr.zzB(zzgm);
        this.zza.zzM = null;
        this.zza.zzU = null;
    }

    public final void zzg(zzgm zzgm) {
        this.zza.zzU = zzgm;
        this.zza.zzr.zzC(zzgm);
    }

    public final void zzh(zzad zzad, zzgn zzgn) {
        this.zza.zzM = zzad;
        this.zza.zzr.zzD(zzad, zzgn);
    }

    public final void zzi(long j) {
        this.zza.zzr.zzE(j);
    }

    public final void zzj(Exception exc) {
        this.zza.zzr.zzF(exc);
    }

    public final void zzk(int i, long j, long j2) {
        this.zza.zzr.zzG(i, j, j2);
    }

    public final void zzl(int i, long j) {
        this.zza.zzr.zzH(i, j);
    }

    public final void zzm(Object obj, long j) {
        this.zza.zzr.zzI(obj, j);
        zzin zzin = this.zza;
        if (zzin.zzO == obj) {
            zzdm zzz = zzin.zzl;
            zzz.zzd(26, zzid.zza);
            zzz.zzc();
        }
    }

    public final void zzn(boolean z) {
        zzin zzin = this.zza;
        if (zzin.zzY != z) {
            zzin.zzY = z;
            zzdm zzz = this.zza.zzl;
            zzz.zzd(23, new zzig(z));
            zzz.zzc();
        }
    }

    public final void zzo(Exception exc) {
        this.zza.zzr.zzJ(exc);
    }

    public final void zzp(String str, long j, long j2) {
        this.zza.zzr.zzK(str, j, j2);
    }

    public final void zzq(String str) {
        this.zza.zzr.zzL(str);
    }

    public final void zzr(zzgm zzgm) {
        this.zza.zzr.zzM(zzgm);
        this.zza.zzL = null;
        this.zza.zzT = null;
    }

    public final void zzs(zzgm zzgm) {
        this.zza.zzT = zzgm;
        this.zza.zzr.zzN(zzgm);
    }

    public final void zzt(long j, int i) {
        this.zza.zzr.zzO(j, i);
    }

    public final void zzu(zzad zzad, zzgn zzgn) {
        this.zza.zzL = zzad;
        this.zza.zzr.zzP(zzad, zzgn);
    }

    public final void zzv(zzcv zzcv) {
        this.zza.zzad = zzcv;
        zzdm zzz = this.zza.zzl;
        zzz.zzd(25, new zzih(zzcv));
        zzz.zzc();
    }
}
