package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbwt extends zzbwu implements zzbol {
    DisplayMetrics zza;
    int zzb = -1;
    int zzc = -1;
    int zzd = -1;
    int zze = -1;
    int zzf = -1;
    int zzg = -1;
    private final zzcli zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbhi zzk;
    private float zzl;
    private int zzm;

    public zzbwt(zzcli zzcli, Context context, zzbhi zzbhi) {
        super(zzcli, "");
        this.zzh = zzcli;
        this.zzi = context;
        this.zzk = zzbhi;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObject;
        zzcli zzcli = (zzcli) obj;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        zzaw.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzcfb.zzt(displayMetrics, displayMetrics.widthPixels);
        zzaw.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzcfb.zzt(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzk2 = this.zzh.zzk();
        if (zzk2 == null || zzk2.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            zzt.zzp();
            int[] zzM = zzs.zzM(zzk2);
            zzaw.zzb();
            this.zzd = zzcfb.zzt(this.zza, zzM[0]);
            zzaw.zzb();
            this.zze = zzcfb.zzt(this.zza, zzM[1]);
        }
        if (this.zzh.zzQ().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbws zzbws = new zzbws();
        zzbhi zzbhi = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbws.zze(zzbhi.zza(intent));
        zzbhi zzbhi2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbws.zzc(zzbhi2.zza(intent2));
        zzbws.zza(this.zzk.zzb());
        zzbws.zzd(this.zzk.zzc());
        zzbws.zzb(true);
        boolean zzh2 = zzbws.zza;
        boolean zzj2 = zzbws.zzb;
        boolean zzf2 = zzbws.zzc;
        boolean zzi2 = zzbws.zzd;
        boolean zzg2 = zzbws.zze;
        zzcli zzcli2 = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", zzh2).put("tel", zzj2).put("calendar", zzf2).put("storePicture", zzi2).put("inlineVideo", zzg2);
        } catch (JSONException e) {
            zze.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzcli2.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(zzaw.zzb().zzb(this.zzi, iArr[0]), zzaw.zzb().zzb(this.zzi, iArr[1]));
        if (zze.zzm(2)) {
            zze.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzp().zza);
    }

    public final void zzb(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.zzi instanceof Activity) {
            zzt.zzp();
            i3 = zzs.zzN((Activity) this.zzi)[0];
        } else {
            i3 = 0;
        }
        if (this.zzh.zzQ() == null || !this.zzh.zzQ().zzi()) {
            int width = this.zzh.getWidth();
            int height = this.zzh.getHeight();
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzP)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzQ() != null ? this.zzh.zzQ().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzQ() != null) {
                        i4 = this.zzh.zzQ().zza;
                    }
                    this.zzf = zzaw.zzb().zzb(this.zzi, width);
                    this.zzg = zzaw.zzb().zzb(this.zzi, i4);
                }
            }
            i4 = height;
            this.zzf = zzaw.zzb().zzb(this.zzi, width);
            this.zzg = zzaw.zzb().zzb(this.zzi, i4);
        }
        zzf(i, i2 - i3, this.zzf, this.zzg);
        this.zzh.zzP().zzA(i, i2);
    }
}
