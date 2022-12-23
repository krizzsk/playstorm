package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdty {
    private final Map zza = new HashMap();

    zzdty() {
    }

    @Nullable
    public final synchronized zzdtx zza(String str) {
        return (zzdtx) this.zza.get(str);
    }

    @Nullable
    public final zzdtx zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdtx zza2 = zza((String) it.next());
            if (zza2 != null) {
                return zza2;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzc(java.lang.String r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzdtx r1 = r0.zza(r1)
            if (r1 == 0) goto L_0x0010
            com.google.android.gms.internal.ads.zzbwf r1 = r1.zzb
            if (r1 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            java.lang.String r1 = r1.toString()
            return r1
        L_0x0010:
            java.lang.String r1 = ""
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdty.zzc(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzd(String str, zzfct zzfct) {
        if (!this.zza.containsKey(str)) {
            try {
                this.zza.put(str, new zzdtx(str, zzfct.zze(), zzfct.zzf()));
            } catch (zzfcd unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zze(String str, zzbvs zzbvs) {
        if (!this.zza.containsKey(str)) {
            try {
                this.zza.put(str, new zzdtx(str, zzbvs.zzf(), zzbvs.zzg()));
            } catch (Throwable unused) {
            }
        }
    }
}
