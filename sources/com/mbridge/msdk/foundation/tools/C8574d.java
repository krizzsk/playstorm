package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a;
import com.mbridge.msdk.foundation.same.C8413a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.tools.d */
/* compiled from: DomainDeviceInfo */
public class C8574d {

    /* renamed from: a */
    public String f20714a = C8596q.m24822b();

    /* renamed from: b */
    public String f20715b = C8596q.m24832f();

    /* renamed from: c */
    public String f20716c = "android";

    /* renamed from: d */
    public String f20717d = C8596q.m24839i();

    /* renamed from: e */
    public String f20718e;

    /* renamed from: f */
    public String f20719f;

    /* renamed from: g */
    public String f20720g;

    /* renamed from: h */
    public String f20721h;

    /* renamed from: i */
    public String f20722i;

    /* renamed from: j */
    public String f20723j;

    /* renamed from: k */
    public String f20724k;

    /* renamed from: l */
    public String f20725l;

    /* renamed from: m */
    public String f20726m;

    /* renamed from: n */
    public String f20727n;

    /* renamed from: o */
    public String f20728o;

    public C8574d(Context context) {
        int n = C8596q.m24849n(context);
        this.f20718e = String.valueOf(n);
        this.f20719f = C8596q.m24818a(context, n);
        this.f20720g = C8596q.m24847m(context);
        this.f20721h = C2350a.m5601e().mo15794i();
        this.f20722i = C2350a.m5601e().mo15793h();
        this.f20723j = String.valueOf(C8613y.m24950h(context));
        this.f20724k = String.valueOf(C8613y.m24948g(context));
        this.f20728o = String.valueOf(C8613y.m24941d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f20725l = "landscape";
        } else {
            this.f20725l = "portrait";
        }
        this.f20726m = C8413a.f20329k;
        this.f20727n = C8413a.f20330l;
    }

    /* renamed from: a */
    public JSONObject mo57749a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f20714a);
                jSONObject.put("system_version", this.f20715b);
                jSONObject.put("network_type", this.f20718e);
                jSONObject.put("network_type_str", this.f20719f);
                jSONObject.put("device_ua", this.f20720g);
            }
            jSONObject.put("plantform", this.f20716c);
            if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f20717d);
            }
            jSONObject.put("appkey", this.f20721h);
            jSONObject.put("appId", this.f20722i);
            jSONObject.put("screen_width", this.f20723j);
            jSONObject.put("screen_height", this.f20724k);
            jSONObject.put("orientation", this.f20725l);
            jSONObject.put("scale", this.f20728o);
            jSONObject.put("b", this.f20726m);
            jSONObject.put("c", this.f20727n);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
