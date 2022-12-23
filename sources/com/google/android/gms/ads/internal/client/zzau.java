package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.p196h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzau {
    /* access modifiers changed from: private */
    public final zzk zza;
    /* access modifiers changed from: private */
    public final zzi zzb;
    /* access modifiers changed from: private */
    public final zzel zzc;
    /* access modifiers changed from: private */
    public final zzbmz zzd;
    private final zzcbp zze;
    /* access modifiers changed from: private */
    public final zzbxr zzf;
    /* access modifiers changed from: private */
    public final zzbna zzg;
    /* access modifiers changed from: private */
    public zzbyz zzh;

    public zzau(zzk zzk, zzi zzi, zzel zzel, zzbmz zzbmz, zzcbp zzcbp, zzbxr zzbxr, zzbna zzbna) {
        this.zza = zzk;
        this.zzb = zzi;
        this.zzc = zzel;
        this.zzd = zzbmz;
        this.zze = zzcbp;
        this.zzf = zzbxr;
        this.zzg = zzbna;
    }

    static /* bridge */ /* synthetic */ void zzs(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzaw.zzb().zzl(context, zzaw.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbo zzc(Context context, String str, zzbtz zzbtz) {
        return (zzbo) new zzam(this, context, str, zzbtz).zzd(context, false);
    }

    public final zzbs zzd(Context context, zzq zzq, String str, zzbtz zzbtz) {
        return (zzbs) new zzai(this, context, zzq, str, zzbtz).zzd(context, false);
    }

    public final zzbs zze(Context context, zzq zzq, String str, zzbtz zzbtz) {
        return (zzbs) new zzak(this, context, zzq, str, zzbtz).zzd(context, false);
    }

    public final zzble zzg(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzble) new zzaq(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzblk zzh(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzblk) new zzas(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzbpj zzk(Context context, zzbtz zzbtz, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbpj) new zzag(this, context, zzbtz, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbxk zzl(Context context, zzbtz zzbtz) {
        return (zzbxk) new zzae(this, context, zzbtz).zzd(context, false);
    }

    public final zzbxu zzn(Activity activity) {
        zzaa zzaa = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzcfi.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbxu) zzaa.zzd(activity, z);
    }

    public final zzcbd zzp(Context context, String str, zzbtz zzbtz) {
        return (zzcbd) new zzat(this, context, str, zzbtz).zzd(context, false);
    }

    public final zzcdz zzq(Context context, zzbtz zzbtz) {
        return (zzcdz) new zzac(this, context, zzbtz).zzd(context, false);
    }
}
