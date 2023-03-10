package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.tapjoy.TJAdUnitConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcjj implements zzbol {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchr zzchr = (zzchr) obj;
        zzcme zzs = zzchr.zzs();
        if (zzs == null) {
            try {
                zzcme zzcme = new zzcme(zzchr, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzchr.zzE(zzcme);
                zzs = zzcme;
            } catch (NullPointerException e) {
                e = e;
                zze.zzh("Unable to parse videoMeta message.", e);
                zzt.zzo().zzt(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                zze.zzh("Unable to parse videoMeta message.", e);
                zzt.zzo().zzt(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get(TJAdUnitConstants.String.VIDEO_CURRENT_TIME));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i = 0;
        if (parseInt >= 0) {
            if (parseInt <= 3) {
                i = parseInt;
            }
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zze.zzm(3)) {
            zze.zze("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + i + " , aspectRatio : " + str);
        }
        zzs.zzc(parseFloat2, parseFloat, i, equals, parseFloat3);
    }
}
