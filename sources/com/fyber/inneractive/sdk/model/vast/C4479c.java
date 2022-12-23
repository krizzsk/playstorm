package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.response.C5295i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.model.vast.c */
public class C4479c implements C5295i {

    /* renamed from: a */
    public C4483g f11069a;

    /* renamed from: b */
    public C4484h f11070b;

    /* renamed from: c */
    public int f11071c;

    /* renamed from: d */
    public int f11072d;

    /* renamed from: e */
    public String f11073e;

    /* renamed from: f */
    public String f11074f;

    /* renamed from: g */
    public String f11075g;

    /* renamed from: h */
    public Map<C4493q, List<String>> f11076h = new HashMap();

    public C4479c(C4483g gVar, int i, int i2, String str) {
        this.f11069a = gVar;
        this.f11071c = i;
        this.f11072d = i2;
        this.f11073e = str;
    }

    /* renamed from: a */
    public void mo24688a(C4493q qVar, String str) {
        List list = this.f11076h.get(qVar);
        if (list == null) {
            list = new ArrayList();
            this.f11076h.put(qVar, list);
        }
        list.add(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Companion: ");
        sb.append(" w:");
        sb.append(this.f11071c);
        sb.append(" h:");
        sb.append(this.f11072d);
        sb.append(" type:");
        sb.append(this.f11069a.toString());
        sb.append(" creativeType: ");
        C4484h hVar = this.f11070b;
        sb.append(hVar != null ? hVar.f11101a : "none");
        sb.append(" ctr:");
        sb.append(this.f11075g);
        sb.append(" events:");
        sb.append(this.f11076h);
        return sb.toString();
    }

    /* renamed from: a */
    public List<String> mo24664a(C4493q qVar) {
        Map<C4493q, List<String>> map = this.f11076h;
        if (map == null) {
            return null;
        }
        return map.get(qVar);
    }

    /* renamed from: a */
    public JSONObject mo24687a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.f11071c);
            jSONObject.put("h", this.f11072d);
            jSONObject.put("type", this.f11069a.toString());
            C4484h hVar = this.f11070b;
            jSONObject.put(StaticResource.CREATIVE_TYPE, hVar != null ? hVar.f11101a : "none");
            jSONObject.put("content", this.f11074f);
        } catch (JSONException e) {
            IAlog.m16699a("Vast Parser: Failed creating Companion json object: %s", e.getMessage());
        }
        return jSONObject;
    }
}
