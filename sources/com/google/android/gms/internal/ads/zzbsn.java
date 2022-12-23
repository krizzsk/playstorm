package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbsn implements zzbre, zzbsm {
    private final zzbsm zza;
    private final HashSet zzb = new HashSet();

    public zzbsn(zzbsm zzbsm) {
        this.zza = zzbsm;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbrd.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbol) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbol) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbrd.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbrd.zzb(this, str, jSONObject);
    }

    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbrd.zzd(this, str, jSONObject);
    }

    public final void zzq(String str, zzbol zzbol) {
        this.zza.zzq(str, zzbol);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbol));
    }

    public final void zzr(String str, zzbol zzbol) {
        this.zza.zzr(str, zzbol);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbol));
    }
}
