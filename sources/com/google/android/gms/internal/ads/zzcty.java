package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzt;
import com.tapjoy.TJAdUnitConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcty implements zzbss {
    private final Context zza;
    private final zzbai zzb;
    private final PowerManager zzc;

    public zzcty(Context context, zzbai zzbai) {
        this.zza = context;
        this.zzb = zzbai;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: zza */
    public final JSONObject zzb(zzcub zzcub) throws JSONException {
        JSONObject jSONObject;
        boolean z;
        Integer num;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbal zzbal = zzcub.zzf;
        if (zzbal == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z2 = zzbal.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcub.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false);
            boolean z3 = zzcub.zzc;
            JSONObject put2 = put.put("isStopped", false).put("isPaused", zzcub.zzb).put("isNative", this.zzb.zze());
            if (Build.VERSION.SDK_INT >= 20) {
                z = this.zzc.isInteractive();
            } else {
                z = this.zzc.isScreenOn();
            }
            put2.put("isScreenOn", z).put("appMuted", zzt.zzr().zze()).put("appVolume", (double) zzt.zzr().zza()).put("deviceVolume", (double) zzab.zzb(this.zza.getApplicationContext()));
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzeG)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
                if (audioManager == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(audioManager.getMode());
                }
                if (num != null) {
                    jSONObject3.put("audioMode", num);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzbal.zzb).put("isAttachedToWindow", z2).put("viewBox", new JSONObject().put("top", zzbal.zzc.top).put(TJAdUnitConstants.String.BOTTOM, zzbal.zzc.bottom).put("left", zzbal.zzc.left).put("right", zzbal.zzc.right)).put("adBox", new JSONObject().put("top", zzbal.zzd.top).put(TJAdUnitConstants.String.BOTTOM, zzbal.zzd.bottom).put("left", zzbal.zzd.left).put("right", zzbal.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzbal.zze.top).put(TJAdUnitConstants.String.BOTTOM, zzbal.zze.bottom).put("left", zzbal.zze.left).put("right", zzbal.zze.right)).put("globalVisibleBoxVisible", zzbal.zzf).put("localVisibleBox", new JSONObject().put("top", zzbal.zzg.top).put(TJAdUnitConstants.String.BOTTOM, zzbal.zzg.bottom).put("left", zzbal.zzg.left).put("right", zzbal.zzg.right)).put("localVisibleBoxVisible", zzbal.zzh).put("hitBox", new JSONObject().put("top", zzbal.zzi.top).put(TJAdUnitConstants.String.BOTTOM, zzbal.zzi.bottom).put("left", zzbal.zzi.left).put("right", zzbal.zzi.right)).put("screenDensity", (double) this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcub.zza);
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzbi)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbal.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put(TJAdUnitConstants.String.BOTTOM, rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcub.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
