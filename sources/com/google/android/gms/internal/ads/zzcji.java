package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.ads.internal.util.zze;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcji implements zzbol {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                zzaw.zzb();
                i = zzcfb.zzv(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zze.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (zze.zzc()) {
            zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    private static void zzc(zzchf zzchf, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzchf.zzA(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zze.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            zzchf.zzz(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzchf.zzx(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzchf.zzy(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzchf.zzC(Integer.parseInt(str5));
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i;
        int i2;
        zzchr zzchr = (zzchr) obj;
        String str = (String) map.get("action");
        if (str == null) {
            zze.zzj("Action missing from video GMSG.");
            return;
        }
        if (zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zze.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zze.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzchr.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                zze.zzj("Invalid color parameter in background video GMSG.");
            }
        } else if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                zze.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzchr.zzD(Color.parseColor(str3));
            } catch (IllegalArgumentException unused2) {
                zze.zzj("Invalid color parameter in playerBackground video GMSG.");
            }
        } else {
            int i3 = 0;
            if ("decoderProps".equals(str)) {
                String str4 = (String) map.get("mimeTypes");
                if (str4 == null) {
                    zze.zzj("No MIME types specified for decoder properties inspection.");
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "decoderProps");
                    hashMap.put("error", "missingMimeTypes");
                    zzchr.zzd("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                String[] split = str4.split(",");
                int length = split.length;
                while (i3 < length) {
                    String str5 = split[i3];
                    hashMap2.put(str5, zzch.zza(str5.trim()));
                    i3++;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                zzchr.zzd("onVideoEvent", hashMap3);
                return;
            }
            zzchg zzbp = zzchr.zzbp();
            if (zzbp == null) {
                zze.zzj("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str);
            boolean equals2 = "position".equals(str);
            if (equals || equals2) {
                Context context = zzchr.getContext();
                int zzb = zzb(context, map, "x", 0);
                int zzb2 = zzb(context, map, "y", 0);
                int zzb3 = zzb(context, map, "w", -1);
                if (!((Boolean) zzay.zzc().zzb(zzbhy.zzcT)).booleanValue()) {
                    if (zze.zzc()) {
                        zze.zza("Calculate width with original width " + zzb3 + ", videoHost.getVideoBoundingWidth() " + zzchr.zzj() + ", x " + zzb + ".");
                    }
                    i = Math.min(zzb3, zzchr.zzj() - zzb);
                } else if (zzb3 == -1) {
                    i = zzchr.zzj();
                } else {
                    i = Math.min(zzb3, zzchr.zzj());
                }
                int i4 = i;
                int zzb4 = zzb(context, map, "h", -1);
                if (!((Boolean) zzay.zzc().zzb(zzbhy.zzcT)).booleanValue()) {
                    if (zze.zzc()) {
                        zze.zza("Calculate height with original height " + zzb4 + ", videoHost.getVideoBoundingHeight() " + zzchr.zzi() + ", y " + zzb2 + ".");
                    }
                    i2 = Math.min(zzb4, zzchr.zzi() - zzb2);
                } else if (zzb4 == -1) {
                    i2 = zzchr.zzi();
                } else {
                    i2 = Math.min(zzb4, zzchr.zzi());
                }
                int i5 = i2;
                try {
                    i3 = Integer.parseInt((String) map.get("player"));
                } catch (NumberFormatException unused3) {
                }
                int i6 = i3;
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                if (!equals || zzbp.zza() != null) {
                    zzbp.zzb(zzb, zzb2, i4, i5);
                    return;
                }
                zzbp.zzc(zzb, zzb2, i4, i5, i6, parseBoolean, new zzchq((String) map.get("flags")));
                zzchf zza2 = zzbp.zza();
                if (zza2 != null) {
                    zzc(zza2, map);
                    return;
                }
                return;
            }
            zzcme zzs = zzchr.zzs();
            if (zzs != null) {
                if ("timeupdate".equals(str)) {
                    String str6 = (String) map.get(TJAdUnitConstants.String.VIDEO_CURRENT_TIME);
                    if (str6 == null) {
                        zze.zzj("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        zzs.zzt(Float.parseFloat(str6));
                        return;
                    } catch (NumberFormatException unused4) {
                        zze.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                        return;
                    }
                } else if ("skip".equals(str)) {
                    zzs.zzu();
                    return;
                }
            }
            zzchf zza3 = zzbp.zza();
            if (zza3 == null) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("event", "no_video_view");
                zzchr.zzd("onVideoEvent", hashMap4);
            } else if ("click".equals(str)) {
                Context context2 = zzchr.getContext();
                int zzb5 = zzb(context2, map, "x", 0);
                int zzb6 = zzb(context2, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) zzb5, (float) zzb6, 0);
                zza3.zzw(obtain);
                obtain.recycle();
            } else if (TJAdUnitConstants.String.VIDEO_CURRENT_TIME.equals(str)) {
                String str7 = (String) map.get("time");
                if (str7 == null) {
                    zze.zzj("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    zza3.zzv((int) (Float.parseFloat(str7) * 1000.0f));
                } catch (NumberFormatException unused5) {
                    zze.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                }
            } else if ("hide".equals(str)) {
                zza3.setVisibility(4);
            } else if ("load".equals(str)) {
                zza3.zzq();
            } else if ("loadControl".equals(str)) {
                zzc(zza3, map);
            } else if ("muted".equals(str)) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    zza3.zzr();
                } else {
                    zza3.zzH();
                }
            } else if (CampaignEx.JSON_NATIVE_VIDEO_PAUSE.equals(str)) {
                zza3.zzt();
            } else if ("play".equals(str)) {
                zza3.zzu();
            } else if (TJAdUnitConstants.String.BEACON_SHOW_PATH.equals(str)) {
                zza3.setVisibility(0);
            } else if ("src".equals(str)) {
                String str8 = (String) map.get("src");
                Integer num = null;
                if (map.containsKey("periodicReportIntervalMs")) {
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                    } catch (NumberFormatException unused6) {
                        zze.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                    }
                }
                String[] strArr = {str8};
                String str9 = (String) map.get("demuxed");
                if (str9 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str9);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                            strArr2[i7] = jSONArray.getString(i7);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused7) {
                        zze.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                        strArr = new String[]{str8};
                    }
                }
                if (num != null) {
                    zzchr.zzC(num.intValue());
                }
                zza3.zzD(str8, strArr);
            } else if ("touchMove".equals(str)) {
                Context context3 = zzchr.getContext();
                zza3.zzG((float) zzb(context3, map, "dx", 0), (float) zzb(context3, map, "dy", 0));
                if (!this.zza) {
                    zzchr.zzw();
                    this.zza = true;
                }
            } else if (TapjoyConstants.TJC_VOLUME.equals(str)) {
                String str10 = (String) map.get(TapjoyConstants.TJC_VOLUME);
                if (str10 == null) {
                    zze.zzj("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    zza3.zzF(Float.parseFloat(str10));
                } catch (NumberFormatException unused8) {
                    zze.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
                }
            } else if ("watermark".equals(str)) {
                zza3.zzm();
            } else {
                zze.zzj("Unknown video action: ".concat(str));
            }
        }
    }
}
