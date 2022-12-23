package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.util.C5355m0;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.c0 */
public class C4269c0 implements C5355m0.C5356a {

    /* renamed from: a */
    public Integer f10591a = 50;

    /* renamed from: b */
    public Integer f10592b = 50;

    /* renamed from: c */
    public Set<Vendor> f10593c = null;

    /* renamed from: a */
    public JSONObject mo24263a() {
        JSONObject jSONObject = new JSONObject();
        C5355m0.m16771a(jSONObject, "pausePct", this.f10591a);
        C5355m0.m16771a(jSONObject, "playPct", this.f10592b);
        JSONArray jSONArray = new JSONArray();
        Set<Vendor> set = this.f10593c;
        if (set != null) {
            for (Vendor next : set) {
                if (next != null) {
                    jSONArray.put(next);
                }
            }
        }
        C5355m0.m16771a(jSONObject, Verification.VENDOR, jSONArray);
        return jSONObject;
    }

    /* renamed from: b */
    public Integer mo24277b() {
        return this.f10592b;
    }

    /* renamed from: c */
    public Set<Vendor> mo24278c() {
        return this.f10593c;
    }
}
