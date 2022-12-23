package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzcdo {
    static zzcdo zza;

    public static synchronized zzcdo zzd(Context context) {
        synchronized (zzcdo.class) {
            zzcdo zzcdo = zza;
            if (zzcdo != null) {
                return zzcdo;
            }
            Context applicationContext = context.getApplicationContext();
            zzbhy.zzc(applicationContext);
            zzg zzh = zzt.zzo().zzh();
            zzh.zzr(applicationContext);
            zzccs zzccs = new zzccs((zzccr) null);
            zzccs.zzb(applicationContext);
            zzccs.zzc(zzt.zzA());
            zzccs.zza(zzh);
            zzccs.zzd(zzt.zzn());
            zzcdo zze = zzccs.zze();
            zza = zze;
            zze.zza().zza();
            zza.zzb().zzc();
            zzcds zzc = zza.zzc();
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzao)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) zzay.zzc().zzb(zzbhy.zzaq));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString = optJSONArray.optString(i);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String zzc2 : hashMap.keySet()) {
                        zzc.zzc(zzc2);
                    }
                    zzc.zzd(new zzcdq(zzc, hashMap));
                } catch (JSONException e) {
                    zze.zzf("Failed to parse listening list", e);
                }
            }
            zzcdo zzcdo2 = zza;
            return zzcdo2;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract zzccl zza();

    /* access modifiers changed from: package-private */
    public abstract zzccp zzb();

    /* access modifiers changed from: package-private */
    public abstract zzcds zzc();
}
