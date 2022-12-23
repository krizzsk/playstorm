package com.ironsource.mediationsdk.impressionData;

import com.facebook.appevents.UserDataStore;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

public class ImpressionData {

    /* renamed from: A */
    private String f17353A;

    /* renamed from: B */
    private DecimalFormat f17354B;

    /* renamed from: a */
    private final String f17355a;

    /* renamed from: b */
    private final String f17356b;

    /* renamed from: c */
    private final String f17357c;

    /* renamed from: d */
    private final String f17358d;

    /* renamed from: e */
    private final String f17359e;

    /* renamed from: f */
    private final String f17360f;

    /* renamed from: g */
    private final String f17361g;

    /* renamed from: h */
    private final String f17362h;

    /* renamed from: i */
    private final String f17363i;

    /* renamed from: j */
    private final String f17364j;

    /* renamed from: k */
    private final String f17365k;

    /* renamed from: l */
    private final String f17366l;

    /* renamed from: m */
    private final String f17367m;

    /* renamed from: n */
    private JSONObject f17368n;

    /* renamed from: o */
    private String f17369o;

    /* renamed from: p */
    private String f17370p;

    /* renamed from: q */
    private String f17371q;

    /* renamed from: r */
    private String f17372r;

    /* renamed from: s */
    private String f17373s;

    /* renamed from: t */
    private String f17374t;

    /* renamed from: u */
    private String f17375u;

    /* renamed from: v */
    private String f17376v;

    /* renamed from: w */
    private String f17377w;

    /* renamed from: x */
    private Double f17378x;

    /* renamed from: y */
    private String f17379y;

    /* renamed from: z */
    private Double f17380z;

    public ImpressionData(ImpressionData impressionData) {
        this.f17355a = IronSourceConstants.EVENTS_AUCTION_ID;
        this.f17356b = IronSourceConstants.EVENTS_AD_UNIT;
        this.f17357c = UserDataStore.COUNTRY;
        this.f17358d = "ab";
        this.f17359e = "segmentName";
        this.f17360f = "placement";
        this.f17361g = "adNetwork";
        this.f17362h = "instanceName";
        this.f17363i = "instanceId";
        this.f17364j = "revenue";
        this.f17365k = "precision";
        this.f17366l = "lifetimeRevenue";
        this.f17367m = "encryptedCPM";
        this.f17369o = null;
        this.f17370p = null;
        this.f17371q = null;
        this.f17372r = null;
        this.f17373s = null;
        this.f17374t = null;
        this.f17375u = null;
        this.f17376v = null;
        this.f17377w = null;
        this.f17378x = null;
        this.f17379y = null;
        this.f17380z = null;
        this.f17353A = null;
        this.f17354B = new DecimalFormat("#.#####");
        this.f17368n = impressionData.f17368n;
        this.f17369o = impressionData.f17369o;
        this.f17370p = impressionData.f17370p;
        this.f17371q = impressionData.f17371q;
        this.f17372r = impressionData.f17372r;
        this.f17373s = impressionData.f17373s;
        this.f17374t = impressionData.f17374t;
        this.f17375u = impressionData.f17375u;
        this.f17376v = impressionData.f17376v;
        this.f17377w = impressionData.f17377w;
        this.f17379y = impressionData.f17379y;
        this.f17353A = impressionData.f17353A;
        this.f17380z = impressionData.f17380z;
        this.f17378x = impressionData.f17378x;
    }

    public ImpressionData(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this.f17355a = IronSourceConstants.EVENTS_AUCTION_ID;
        this.f17356b = IronSourceConstants.EVENTS_AD_UNIT;
        this.f17357c = UserDataStore.COUNTRY;
        this.f17358d = "ab";
        this.f17359e = "segmentName";
        this.f17360f = "placement";
        this.f17361g = "adNetwork";
        this.f17362h = "instanceName";
        this.f17363i = "instanceId";
        this.f17364j = "revenue";
        this.f17365k = "precision";
        this.f17366l = "lifetimeRevenue";
        this.f17367m = "encryptedCPM";
        this.f17369o = null;
        this.f17370p = null;
        this.f17371q = null;
        this.f17372r = null;
        this.f17373s = null;
        this.f17374t = null;
        this.f17375u = null;
        this.f17376v = null;
        this.f17377w = null;
        this.f17378x = null;
        this.f17379y = null;
        this.f17380z = null;
        this.f17353A = null;
        String str = "revenue";
        this.f17354B = new DecimalFormat("#.#####");
        if (jSONObject2 != null) {
            try {
                this.f17368n = jSONObject2;
                this.f17369o = jSONObject2.optString(IronSourceConstants.EVENTS_AUCTION_ID, (String) null);
                this.f17370p = jSONObject2.optString(IronSourceConstants.EVENTS_AD_UNIT, (String) null);
                this.f17371q = jSONObject2.optString(UserDataStore.COUNTRY, (String) null);
                this.f17372r = jSONObject2.optString("ab", (String) null);
                this.f17373s = jSONObject2.optString("segmentName", (String) null);
                this.f17374t = jSONObject2.optString("placement", (String) null);
                this.f17375u = jSONObject2.optString("adNetwork", (String) null);
                this.f17376v = jSONObject2.optString("instanceName", (String) null);
                this.f17377w = jSONObject2.optString("instanceId", (String) null);
                this.f17379y = jSONObject2.optString("precision", (String) null);
                this.f17353A = jSONObject2.optString("encryptedCPM", (String) null);
                double optDouble = jSONObject2.optDouble("lifetimeRevenue");
                this.f17380z = Double.isNaN(optDouble) ? null : Double.valueOf(optDouble);
                double optDouble2 = jSONObject2.optDouble(str);
                this.f17378x = Double.isNaN(optDouble2) ? null : Double.valueOf(optDouble2);
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("error parsing impression " + e.getMessage());
            }
        }
    }

    public String getAb() {
        return this.f17372r;
    }

    public String getAdNetwork() {
        return this.f17375u;
    }

    public String getAdUnit() {
        return this.f17370p;
    }

    public JSONObject getAllData() {
        return this.f17368n;
    }

    public String getAuctionId() {
        return this.f17369o;
    }

    public String getCountry() {
        return this.f17371q;
    }

    public String getEncryptedCPM() {
        return this.f17353A;
    }

    public String getInstanceId() {
        return this.f17377w;
    }

    public String getInstanceName() {
        return this.f17376v;
    }

    public Double getLifetimeRevenue() {
        return this.f17380z;
    }

    public String getPlacement() {
        return this.f17374t;
    }

    public String getPrecision() {
        return this.f17379y;
    }

    public Double getRevenue() {
        return this.f17378x;
    }

    public String getSegmentName() {
        return this.f17373s;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) {
        String str3 = this.f17374t;
        if (str3 != null) {
            String replace = str3.replace(str, str2);
            this.f17374t = replace;
            JSONObject jSONObject = this.f17368n;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", replace);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("auctionId: '");
        sb.append(this.f17369o);
        sb.append('\'');
        sb.append(", adUnit: '");
        sb.append(this.f17370p);
        sb.append('\'');
        sb.append(", country: '");
        sb.append(this.f17371q);
        sb.append('\'');
        sb.append(", ab: '");
        sb.append(this.f17372r);
        sb.append('\'');
        sb.append(", segmentName: '");
        sb.append(this.f17373s);
        sb.append('\'');
        sb.append(", placement: '");
        sb.append(this.f17374t);
        sb.append('\'');
        sb.append(", adNetwork: '");
        sb.append(this.f17375u);
        sb.append('\'');
        sb.append(", instanceName: '");
        sb.append(this.f17376v);
        sb.append('\'');
        sb.append(", instanceId: '");
        sb.append(this.f17377w);
        sb.append('\'');
        sb.append(", revenue: ");
        Double d = this.f17378x;
        String str = null;
        sb.append(d == null ? null : this.f17354B.format(d));
        sb.append(", precision: '");
        sb.append(this.f17379y);
        sb.append('\'');
        sb.append(", lifetimeRevenue: ");
        Double d2 = this.f17380z;
        if (d2 != null) {
            str = this.f17354B.format(d2);
        }
        sb.append(str);
        sb.append(", encryptedCPM: '");
        sb.append(this.f17353A);
        return sb.toString();
    }
}
