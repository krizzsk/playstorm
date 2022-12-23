package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.IronSource;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.model.a */
public final class C6691a {

    /* renamed from: a */
    public NetworkSettings f17477a;

    /* renamed from: b */
    public JSONObject f17478b;

    /* renamed from: c */
    public boolean f17479c;

    /* renamed from: d */
    public int f17480d;

    /* renamed from: e */
    public int f17481e;

    /* renamed from: f */
    public IronSource.AD_UNIT f17482f;

    public C6691a(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f17477a = networkSettings;
        this.f17478b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f17480d = optInt;
        this.f17479c = optInt == 2;
        this.f17481e = jSONObject.optInt("maxAdsPerSession", 99);
        this.f17482f = ad_unit;
    }
}
