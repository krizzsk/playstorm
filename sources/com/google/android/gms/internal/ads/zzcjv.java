package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcjv implements zzbol {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zze.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcju zzcju;
        zzcjm zzcjm;
        Map map2 = map;
        zzchr zzchr = (zzchr) obj;
        if (zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            zze.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcjn zzy = zzt.zzy();
        if (!map2.containsKey("abort")) {
            String str = (String) map2.get("src");
            Integer zzb = zzb(map2, "periodicReportIntervalMs");
            Integer zzb2 = zzb(map2, "exoPlayerRenderingIntervalMs");
            Integer zzb3 = zzb(map2, "exoPlayerIdleIntervalMs");
            zzchq zzchq = new zzchq((String) map2.get("flags"));
            boolean z = zzchq.zzn;
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map2.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr2[i] = jSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        zze.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (z) {
                    Iterator it = zzy.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzcjm = null;
                            break;
                        }
                        zzcjm zzcjm2 = (zzcjm) it.next();
                        if (zzcjm2.zza == zzchr && str.equals(zzcjm2.zze())) {
                            zzcjm = zzcjm2;
                            break;
                        }
                    }
                } else {
                    zzcjm = zzy.zza(zzchr);
                }
                if (zzcjm != null) {
                    zze.zzj("Precache task is already running.");
                    return;
                } else if (zzchr.zzm() == null) {
                    zze.zzj("Precache requires a dependency provider.");
                    return;
                } else {
                    Integer zzb4 = zzb(map2, "player");
                    if (zzb4 == null) {
                        zzb4 = 0;
                    }
                    if (zzb != null) {
                        zzchr.zzC(zzb.intValue());
                    }
                    if (zzb2 != null) {
                        zzchr.zzA(zzb2.intValue());
                    }
                    if (zzb3 != null) {
                        zzchr.zzz(zzb3.intValue());
                    }
                    int intValue = zzb4.intValue();
                    zzcjg zzcjg = zzchr.zzm().zzc;
                    if (intValue > 0) {
                        int zzu = zzchi.zzu();
                        if (zzu < zzchq.zzh) {
                            zzcju = new zzckd(zzchr, zzchq);
                        } else if (zzu < zzchq.zzb) {
                            zzcju = new zzcka(zzchr, zzchq);
                        } else {
                            zzcju = new zzcjy(zzchr);
                        }
                    } else {
                        zzcju = new zzcjx(zzchr);
                    }
                    new zzcjm(zzchr, zzcju, str, strArr).zzb();
                }
            } else {
                zzcjm zza = zzy.zza(zzchr);
                if (zza != null) {
                    zzcju = zza.zzb;
                } else {
                    zze.zzj("Precache must specify a source.");
                    return;
                }
            }
            Integer zzb5 = zzb(map2, "minBufferMs");
            if (zzb5 != null) {
                zzcju.zzp(zzb5.intValue());
            }
            Integer zzb6 = zzb(map2, "maxBufferMs");
            if (zzb6 != null) {
                zzcju.zzo(zzb6.intValue());
            }
            Integer zzb7 = zzb(map2, "bufferForPlaybackMs");
            if (zzb7 != null) {
                zzcju.zzh(zzb7.intValue());
            }
            Integer zzb8 = zzb(map2, "bufferForPlaybackAfterRebufferMs");
            if (zzb8 != null) {
                zzcju.zzn(zzb8.intValue());
            }
        } else if (!zzy.zzd(zzchr)) {
            zze.zzj("Precache abort but no precache task running.");
        }
    }
}
