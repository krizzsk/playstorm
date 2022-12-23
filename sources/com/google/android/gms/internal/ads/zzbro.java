package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbro implements zzbrg, zzbre {
    private final zzcli zza;

    public zzbro(Context context, zzcfo zzcfo, zzaoc zzaoc, zza zza2) throws zzclt {
        zzt.zzz();
        zzcli zza3 = zzclu.zza(context, zzcmx.zza(), "", false, false, (zzaoc) null, (zzbix) null, zzcfo, (zzbin) null, (zzl) null, (zza) null, zzbdl.zza(), (zzfbg) null, (zzfbj) null);
        this.zza = zza3;
        ((View) zza3).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        zzaw.zzb();
        if (zzcfb.zzs()) {
            runnable.run();
        } else {
            zzs.zza.post(runnable);
        }
    }

    public final void zza(String str) {
        zzs(new zzbrj(this, str));
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbrd.zzc(this, str, str2);
    }

    public final void zzc() {
        this.zza.destroy();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbrd.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbrd.zzb(this, str, jSONObject);
    }

    public final void zzf(String str) {
        zzs(new zzbrk(this, str));
    }

    public final void zzg(String str) {
        zzs(new zzbrm(this, str));
    }

    public final void zzh(String str) {
        zzs(new zzbrl(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final boolean zzi() {
        return this.zza.zzaB();
    }

    public final zzbsn zzj() {
        return new zzbsn(this);
    }

    public final void zzk(zzbru zzbru) {
        this.zza.zzP().zzF(new zzbrh(zzbru, (byte[]) null));
    }

    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbrd.zzd(this, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final void zzq(String str, zzbol zzbol) {
        this.zza.zzaf(str, new zzbrn(this, zzbol));
    }

    public final void zzr(String str, zzbol zzbol) {
        this.zza.zzax(str, new zzbri(zzbol));
    }
}
