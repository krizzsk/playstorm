package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzeor implements zzfuh {
    public static final /* synthetic */ zzeor zza = new zzeor();

    private /* synthetic */ zzeor() {
    }

    public final zzfvj zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        if (appSetIdInfo == null) {
            return zzfva.zzi(new zzeou((String) null, -1));
        }
        return zzfva.zzi(new zzeou(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
