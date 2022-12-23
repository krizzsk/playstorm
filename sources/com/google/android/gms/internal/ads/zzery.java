package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzery implements Callable {
    public final /* synthetic */ List zza;

    public /* synthetic */ zzery(List list) {
        this.zza = list;
    }

    public final Object call() {
        List<zzfvj> list = this.zza;
        JSONArray jSONArray = new JSONArray();
        for (zzfvj zzfvj : list) {
            if (((JSONObject) zzfvj.get()) != null) {
                jSONArray.put(zzfvj.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzesc(jSONArray.toString());
    }
}
