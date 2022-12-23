package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.C5355m0;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.y */
public class C4345y implements C4346z {

    /* renamed from: a */
    public String f10745a;

    /* renamed from: b */
    public String f10746b;

    /* renamed from: c */
    public C4327r f10747c;

    /* renamed from: d */
    public C4342v f10748d;

    /* renamed from: e */
    public C4343w f10749e;

    /* renamed from: f */
    public C4262a0 f10750f;

    /* renamed from: g */
    public C4269c0 f10751g;

    /* renamed from: a */
    public C4267b0 mo24361a() {
        return this.f10750f;
    }

    /* renamed from: b */
    public C4269c0 mo24362b() {
        return this.f10751g;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        C5355m0.m16771a(jSONObject, "id", this.f10745a);
        C5355m0.m16771a(jSONObject, "spotId", this.f10746b);
        C5355m0.m16771a(jSONObject, "display", this.f10747c);
        C5355m0.m16771a(jSONObject, "monitor", this.f10748d);
        C5355m0.m16771a(jSONObject, "native", this.f10749e);
        C5355m0.m16771a(jSONObject, "video", this.f10750f);
        C5355m0.m16771a(jSONObject, "viewability", this.f10751g);
        return jSONObject.toString();
    }
}
