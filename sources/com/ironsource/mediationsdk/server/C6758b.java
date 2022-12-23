package com.ironsource.mediationsdk.server;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p217c.C6652b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.server.b */
public class C6758b {

    /* renamed from: a */
    private String f17644a;

    /* renamed from: b */
    private String f17645b;

    /* renamed from: c */
    private String f17646c;

    /* renamed from: d */
    private List<String> f17647d;

    /* renamed from: e */
    private List<String> f17648e;

    /* renamed from: f */
    private List<String> f17649f;

    /* renamed from: g */
    private boolean f17650g;

    /* renamed from: h */
    private ImpressionData f17651h;

    public C6758b(String str) {
        this.f17644a = str;
        this.f17645b = "";
        this.f17646c = "";
        this.f17647d = new ArrayList();
        this.f17648e = new ArrayList();
        this.f17649f = new ArrayList();
        this.f17650g = true;
        this.f17651h = null;
    }

    public C6758b(JSONObject jSONObject) {
        this(jSONObject, (JSONObject) null);
    }

    public C6758b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f17650g = false;
        try {
            if (jSONObject.has("instance")) {
                this.f17644a = jSONObject.getString("instance");
            }
            this.f17645b = jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : jSONObject.has("serverData") ? jSONObject.getJSONObject("serverData").toString() : "";
            this.f17646c = jSONObject.has("price") ? jSONObject.getString("price") : "0";
            this.f17647d = new ArrayList();
            this.f17648e = new ArrayList();
            this.f17649f = new ArrayList();
            if (jSONObject.has("notifications")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("notifications");
                if (optJSONObject.has("burl")) {
                    JSONArray jSONArray = optJSONObject.getJSONArray("burl");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.f17647d.add(jSONArray.getString(i));
                    }
                }
                if (optJSONObject.has("lurl")) {
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("lurl");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        this.f17648e.add(jSONArray2.getString(i2));
                    }
                }
                if (optJSONObject.has("nurl")) {
                    JSONArray jSONArray3 = optJSONObject.getJSONArray("nurl");
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        this.f17649f.add(jSONArray3.getString(i3));
                    }
                }
            }
            this.f17651h = new ImpressionData(C6652b.m20273a(jSONObject2, jSONObject.has("armData") ? jSONObject.optJSONObject("armData") : null));
            this.f17650g = true;
        } catch (Exception e) {
            IronLog.INTERNAL.error("AuctionResponseItem exception " + e.getMessage());
        }
    }

    /* renamed from: a */
    public ImpressionData mo36938a(String str) {
        if (this.f17651h == null) {
            return null;
        }
        ImpressionData impressionData = new ImpressionData(this.f17651h);
        impressionData.replaceMacroForPlacementWithValue("${PLACEMENT_NAME}", str);
        return impressionData;
    }

    /* renamed from: a */
    public String mo36939a() {
        return this.f17644a;
    }

    /* renamed from: b */
    public String mo36940b() {
        return this.f17645b;
    }

    /* renamed from: c */
    public String mo36941c() {
        return this.f17646c;
    }

    /* renamed from: d */
    public List<String> mo36942d() {
        return this.f17647d;
    }

    /* renamed from: e */
    public List<String> mo36943e() {
        return this.f17648e;
    }

    /* renamed from: f */
    public List<String> mo36944f() {
        return this.f17649f;
    }

    /* renamed from: g */
    public boolean mo36945g() {
        return this.f17650g;
    }
}
