package com.ironsource.sdk;

import com.ironsource.sdk.p296j.C8360a;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c */
public final class C8165c {

    /* renamed from: a */
    public boolean f19466a = false;

    /* renamed from: b */
    public boolean f19467b = false;

    /* renamed from: c */
    public C8149a f19468c = null;

    /* renamed from: d */
    public Map<String, String> f19469d;

    /* renamed from: e */
    private String f19470e;

    /* renamed from: f */
    private final C8360a f19471f;

    public C8165c(String str, C8360a aVar) {
        this.f19470e = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f19471f = (C8360a) SDKUtils.requireNonNull(aVar, "AdListener name can't be null");
    }

    /* renamed from: a */
    public final C8158b mo56437a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f19470e);
            jSONObject.put("rewarded", this.f19466a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new C8158b(this.f19467b ? C8313d.m23810a() : C8313d.m23812a(jSONObject), this.f19470e, this.f19466a, this.f19467b, this.f19469d, this.f19471f, this.f19468c);
    }
}
