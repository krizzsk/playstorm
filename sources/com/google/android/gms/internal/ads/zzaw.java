package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzaw {
    public final Uri zza;
    public final String zzb = null;
    public final zzaq zzc = null;
    public final zzag zzd = null;
    public final List zze;
    public final String zzf;
    public final zzfrh zzg;
    @Deprecated
    public final List zzh;
    public final Object zzi;

    /* synthetic */ zzaw(Uri uri, String str, zzaq zzaq, zzag zzag, List list, String str2, zzfrh zzfrh, Object obj, zzav zzav) {
        this.zza = uri;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzfrh;
        zzfre zzi2 = zzfrh.zzi();
        if (zzfrh.size() <= 0) {
            this.zzh = zzi2.zzg();
            this.zzi = null;
            return;
        }
        zzaz zzaz = (zzaz) zzfrh.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        zzaw zzaw = (zzaw) obj;
        if (this.zza.equals(zzaw.zza)) {
            String str = zzaw.zzb;
            if (zzeg.zzS((Object) null, (Object) null)) {
                zzaq zzaq = zzaw.zzc;
                if (zzeg.zzS((Object) null, (Object) null)) {
                    zzag zzag = zzaw.zzd;
                    if (zzeg.zzS((Object) null, (Object) null) && this.zze.equals(zzaw.zze)) {
                        String str2 = zzaw.zzf;
                        if (zzeg.zzS((Object) null, (Object) null) && this.zzg.equals(zzaw.zzg)) {
                            Object obj2 = zzaw.zzi;
                            if (zzeg.zzS((Object) null, (Object) null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31;
    }
}
