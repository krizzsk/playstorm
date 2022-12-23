package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzcfm {
    public static Context zza(Context context) throws zzcfl {
        return zzc(context).getModuleContext();
    }

    public static Object zzb(Context context, String str, zzcfk zzcfk) throws zzcfl {
        try {
            return zzcfk.zza(zzc(context).instantiate(str));
        } catch (Exception e) {
            throw new zzcfl(e);
        }
    }

    private static DynamiteModule zzc(Context context) throws zzcfl {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzcfl(e);
        }
    }
}
