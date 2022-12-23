package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.util.C5355m0;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.v */
public class C4342v implements C5355m0.C5356a {

    /* renamed from: a */
    public Set<Track> f10741a = null;

    /* renamed from: a */
    public JSONObject mo24263a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Set<Track> set = this.f10741a;
        if (set != null) {
            for (Track put : set) {
                jSONArray.put(put);
            }
        }
        C5355m0.m16771a(jSONObject, "track", jSONArray);
        return jSONObject;
    }
}
