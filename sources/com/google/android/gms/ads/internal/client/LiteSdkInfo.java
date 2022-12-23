package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbtz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public class LiteSdkInfo extends zzci {
    public LiteSdkInfo(Context context) {
    }

    public zzbtz getAdapterCreator() {
        return new zzbtw();
    }

    public zzei getLiteSdkVersion() {
        return new zzei(ModuleDescriptor.MODULE_VERSION, 221310000, "21.0.0");
    }
}
