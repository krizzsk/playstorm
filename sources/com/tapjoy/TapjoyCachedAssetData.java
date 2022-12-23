package com.tapjoy;

import com.vungle.warren.model.Advertisement;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class TapjoyCachedAssetData implements Serializable {

    /* renamed from: a */
    private long f27505a;

    /* renamed from: b */
    private long f27506b;

    /* renamed from: c */
    private String f27507c;

    /* renamed from: d */
    private String f27508d;

    /* renamed from: e */
    private String f27509e;

    /* renamed from: f */
    private long f27510f;

    /* renamed from: g */
    private String f27511g;

    /* renamed from: h */
    private String f27512h;

    public TapjoyCachedAssetData(String str, String str2, long j) {
        this(str, str2, j, System.currentTimeMillis() / 1000);
    }

    public TapjoyCachedAssetData(String str, String str2, long j, long j2) {
        setAssetURL(str);
        setLocalFilePath(str2);
        this.f27506b = j;
        this.f27505a = j2;
        this.f27510f = j2 + j;
    }

    public void setAssetURL(String str) {
        this.f27507c = str;
        this.f27511g = TapjoyUtil.determineMimeType(str);
    }

    public void setLocalFilePath(String str) {
        this.f27508d = str;
        this.f27509e = Advertisement.FILE_SCHEME.concat(String.valueOf(str));
    }

    public void resetTimeToLive(long j) {
        this.f27506b = j;
        this.f27510f = (System.currentTimeMillis() / 1000) + j;
    }

    public void setOfferID(String str) {
        this.f27512h = str;
    }

    public long getTimestampInSeconds() {
        return this.f27505a;
    }

    public long getTimeToLiveInSeconds() {
        return this.f27506b;
    }

    public long getTimeOfDeathInSeconds() {
        return this.f27510f;
    }

    public String getAssetURL() {
        return this.f27507c;
    }

    public String getLocalFilePath() {
        return this.f27508d;
    }

    public String getLocalURL() {
        return this.f27509e;
    }

    public String getMimeType() {
        return this.f27511g;
    }

    public String getOfferId() {
        return this.f27512h;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", getTimestampInSeconds());
            jSONObject.put(TapjoyConstants.TJC_TIME_TO_LIVE, getTimeToLiveInSeconds());
            jSONObject.put("assetURL", getAssetURL());
            jSONObject.put("localFilePath", getLocalFilePath());
            jSONObject.put("offerID", getOfferId());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toRawJSONString() {
        return toJSON().toString();
    }

    public static TapjoyCachedAssetData fromRawJSONString(String str) {
        try {
            return fromJSONObject(new JSONObject(str));
        } catch (JSONException unused) {
            TapjoyLog.m33197i("TapjoyCachedAssetData", "Can not build TapjoyVideoObject -- error reading json string");
            return null;
        }
    }

    public static TapjoyCachedAssetData fromJSONObject(JSONObject jSONObject) {
        TapjoyCachedAssetData tapjoyCachedAssetData;
        try {
            tapjoyCachedAssetData = new TapjoyCachedAssetData(jSONObject.getString("assetURL"), jSONObject.getString("localFilePath"), jSONObject.getLong(TapjoyConstants.TJC_TIME_TO_LIVE), jSONObject.getLong("timestamp"));
            try {
                tapjoyCachedAssetData.setOfferID(jSONObject.optString("offerID"));
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            tapjoyCachedAssetData = null;
            TapjoyLog.m33197i("TapjoyCachedAssetData", "Can not build TapjoyVideoObject -- not enough data.");
            return tapjoyCachedAssetData;
        }
        return tapjoyCachedAssetData;
    }

    public String toString() {
        return "\nURL=" + this.f27509e + "\n" + "AssetURL=" + this.f27507c + "\n" + "MimeType=" + this.f27511g + "\n" + "Timestamp=" + getTimestampInSeconds() + "\n" + "TimeOfDeath=" + this.f27510f + "\n" + "TimeToLive=" + this.f27506b + "\n";
    }
}
