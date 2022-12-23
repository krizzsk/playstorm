package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdyv {
    private final zzdyi zza;
    private final zzdty zzb;
    private final Object zzc = new Object();
    private final List zzd;
    private boolean zze;

    zzdyv(zzdyi zzdyi, zzdty zzdty) {
        this.zza = zzdyi;
        this.zzb = zzdty;
        this.zzd = new ArrayList();
    }

    /* access modifiers changed from: private */
    public final void zzd(List list) {
        synchronized (this.zzc) {
            if (!this.zze) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbqf zzbqf = (zzbqf) it.next();
                    List list2 = this.zzd;
                    String str = zzbqf.zza;
                    String zzc2 = this.zzb.zzc(str);
                    boolean z = zzbqf.zzb;
                    list2.add(new zzdyu(str, zzc2, z ? 1 : 0, zzbqf.zzd, zzbqf.zzc));
                }
                this.zze = true;
            }
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                    return jSONArray;
                }
            }
            for (zzdyu zza2 : this.zzd) {
                jSONArray.put(zza2.zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdyt(this));
    }
}
