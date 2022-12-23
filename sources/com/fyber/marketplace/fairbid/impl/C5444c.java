package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.response.C5287a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.marketplace.fairbid.impl.c */
public class C5444c {

    /* renamed from: a */
    public String f14441a;

    /* renamed from: b */
    public final C5287a f14442b;

    /* renamed from: c */
    public final Map<String, String> f14443c;

    public C5444c(JSONObject jSONObject, C5287a aVar, Map<String, String> map) {
        try {
            this.f14441a = jSONObject.getJSONObject("ad").optString("markup");
        } catch (JSONException e) {
            IAlog.m16698a("Failed extracting markup", e, new Object[0]);
        }
        this.f14442b = aVar;
        this.f14443c = map;
    }
}
