package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdor {
    private final zzdto zza;
    private final zzdsd zzb;
    private final zzcum zzc;
    private final zzdno zzd;

    public zzdor(zzdto zzdto, zzdsd zzdsd, zzcum zzcum, zzdno zzdno) {
        this.zza = zzdto;
        this.zzb = zzdsd;
        this.zzc = zzcum;
        this.zzd = zzdno;
    }

    public final View zza() throws zzclt {
        zzcli zza2 = this.zza.zza(zzq.zzc(), (zzfbg) null, (zzfbj) null);
        View view = (View) zza2;
        view.setVisibility(8);
        zza2.zzaf("/sendMessageToSdk", new zzdol(this));
        zza2.zzaf("/adMuted", new zzdom(this));
        this.zzb.zzj(new WeakReference(zza2), "/loadHtml", new zzdon(this));
        this.zzb.zzj(new WeakReference(zza2), "/showOverlay", new zzdoo(this));
        this.zzb.zzj(new WeakReference(zza2), "/hideOverlay", new zzdop(this));
        return view;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcli zzcli, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcli zzcli, Map map) {
        this.zzd.zzf();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcli zzcli, Map map) {
        zze.zzi("Showing native ads overlay.");
        zzcli.zzH().setVisibility(0);
        this.zzc.zze(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcli zzcli, Map map) {
        zze.zzi("Hiding native ads overlay.");
        zzcli.zzH().setVisibility(8);
        this.zzc.zze(false);
    }
}
