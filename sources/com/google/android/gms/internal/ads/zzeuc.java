package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzeuc implements zzfuh {
    public static final /* synthetic */ zzeuc zza = new zzeuc();

    private /* synthetic */ zzeuc() {
    }

    public final zzfvj zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        if (appSetIdInfo == null) {
            return zzfva.zzi(new zzeuf((String) null, -1));
        }
        return zzfva.zzi(new zzeuf(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
