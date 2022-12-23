package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdsd {
    /* access modifiers changed from: private */
    public final zzdrx zza = new zzdrx((zzdrw) null);
    private final zza zzb;
    private final zzclu zzc;
    private final Context zzd;
    private final zzdwg zze;
    private final zzfgo zzf;
    private final Executor zzg;
    private final zzaoc zzh;
    private final zzcfo zzi;
    private final zzboz zzj;
    private final zzeen zzk;
    private final zzfig zzl;
    private zzfvj zzm;

    zzdsd(zzdsa zzdsa) {
        this.zzd = zzdsa.zzc;
        this.zzg = zzdsa.zzg;
        this.zzh = zzdsa.zzh;
        this.zzi = zzdsa.zzi;
        this.zzb = zzdsa.zza;
        this.zzc = zzdsa.zzb;
        this.zzj = new zzboz();
        this.zzk = zzdsa.zzf;
        this.zzl = zzdsa.zzj;
        this.zze = zzdsa.zzd;
        this.zzf = zzdsa.zze;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcli zza(zzcli zzcli) {
        zzcli zzcli2 = zzcli;
        zzcli2.zzaf("/result", this.zzj);
        zzcmv zzP = zzcli.zzP();
        zzdrx zzdrx = this.zza;
        zzb zzb2 = r2;
        zzb zzb3 = new zzb(this.zzd, (zzccj) null, (zzbzi) null);
        zzP.zzL((com.google.android.gms.ads.internal.client.zza) null, zzdrx, zzdrx, zzdrx, zzdrx, false, (zzboo) null, zzb2, (zzbwv) null, (zzccj) null, this.zzk, this.zzl, this.zze, this.zzf, (zzbom) null, (zzdjf) null);
        return zzcli2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(String str, JSONObject jSONObject, zzcli zzcli) throws Exception {
        return this.zzj.zzb(zzcli, str, jSONObject);
    }

    public final synchronized zzfvj zzd(String str, JSONObject jSONObject) {
        zzfvj zzfvj = this.zzm;
        if (zzfvj == null) {
            return zzfva.zzi((Object) null);
        }
        return zzfva.zzn(zzfvj, new zzdrp(this, str, jSONObject), this.zzg);
    }

    public final synchronized void zze(zzfbg zzfbg, zzfbj zzfbj) {
        zzfvj zzfvj = this.zzm;
        if (zzfvj != null) {
            zzfva.zzr(zzfvj, new zzdrv(this, zzfbg, zzfbj), this.zzg);
        }
    }

    public final synchronized void zzf() {
        zzfvj zzfvj = this.zzm;
        if (zzfvj != null) {
            zzfva.zzr(zzfvj, new zzdrr(this), this.zzg);
            this.zzm = null;
        }
    }

    public final synchronized void zzg(String str, Map map) {
        zzfvj zzfvj = this.zzm;
        if (zzfvj != null) {
            zzfva.zzr(zzfvj, new zzdru(this, "sendMessageToNativeJs", map), this.zzg);
        }
    }

    public final synchronized void zzh() {
        Context context = this.zzd;
        zzcfo zzcfo = this.zzi;
        zzbhq zzbhq = zzbhy.zzcM;
        zzfvj zzm2 = zzfva.zzm(zzfva.zzl(new zzclr(context, this.zzh, zzcfo, this.zzb, (String) zzay.zzc().zzb(zzbhq)), zzcfv.zze), new zzdrq(this), this.zzg);
        this.zzm = zzm2;
        zzcfy.zza(zzm2, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbol zzbol) {
        zzfvj zzfvj = this.zzm;
        if (zzfvj != null) {
            zzfva.zzr(zzfvj, new zzdrs(this, str, zzbol), this.zzg);
        }
    }

    public final void zzj(WeakReference weakReference, String str, zzbol zzbol) {
        zzi(str, new zzdsc(this, weakReference, str, zzbol, (zzdsb) null));
    }

    public final synchronized void zzk(String str, zzbol zzbol) {
        zzfvj zzfvj = this.zzm;
        if (zzfvj != null) {
            zzfva.zzr(zzfvj, new zzdrt(this, str, zzbol), this.zzg);
        }
    }
}
