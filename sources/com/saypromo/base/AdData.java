package com.saypromo.base;

import com.inmobi.media.C5849bb;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdData {
    public String creativeId;
    public ArrayList<CreativeData> creatives;
    public Boolean debug;
    public String requestId;
    public String resultUrl;
    public String status;
    public String storeId;
    public String trackClickUrl;
    public String trackCloseUrl;
    public String trackErrorUrl;
    public String trackEventUrl;
    public String trackImpressionUrl;
    public String trackLoadUrl;

    public void parseJson(String str) throws JSONException {
        if (str.length() > 0) {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(C5849bb.KEY_REQUEST_ID)) {
                this.requestId = jSONObject.getString(C5849bb.KEY_REQUEST_ID);
            }
            if (jSONObject.has("status")) {
                this.status = jSONObject.getString("status");
            }
            if (jSONObject.has("creativeId")) {
                this.creativeId = jSONObject.getString("creativeId");
            }
            if (jSONObject.has("trackLoadUrl")) {
                this.trackLoadUrl = jSONObject.getString("trackLoadUrl");
            }
            if (jSONObject.has("trackImpressionUrl")) {
                this.trackImpressionUrl = jSONObject.getString("trackImpressionUrl");
            }
            if (jSONObject.has("trackClickUrl")) {
                this.trackClickUrl = jSONObject.getString("trackClickUrl");
            }
            if (jSONObject.has("trackCloseUrl")) {
                this.trackCloseUrl = jSONObject.getString("trackCloseUrl");
            }
            if (jSONObject.has("trackErrorUrl")) {
                this.trackErrorUrl = jSONObject.getString("trackErrorUrl");
            }
            if (jSONObject.has("trackEventUrl")) {
                this.trackEventUrl = jSONObject.getString("trackEventUrl");
            }
            if (jSONObject.has("resultUrl")) {
                this.resultUrl = jSONObject.getString("resultUrl");
            }
            if (jSONObject.has("storeId")) {
                this.storeId = jSONObject.getString("storeId");
            }
            if (jSONObject.has(TapjoyConstants.TJC_DEBUG)) {
                this.debug = Boolean.valueOf(jSONObject.getBoolean(TapjoyConstants.TJC_DEBUG));
            }
            if (jSONObject.has("creatives")) {
                JSONArray jSONArray = jSONObject.getJSONArray("creatives");
                this.creatives = new ArrayList<>();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    CreativeData creativeData = new CreativeData();
                    if (jSONObject2.has("url")) {
                        creativeData.url = jSONObject2.getString("url");
                    }
                    if (jSONObject2.has("clickableAfter")) {
                        creativeData.clickableAfter = Integer.valueOf(jSONObject2.getInt("clickableAfter"));
                    }
                    if (jSONObject2.has("clickBehaviour")) {
                        creativeData.clickBehaviour = Integer.valueOf(jSONObject2.getInt("clickBehaviour"));
                    }
                    if (jSONObject2.has(SessionDescription.ATTR_LENGTH)) {
                        creativeData.length = Integer.valueOf(jSONObject2.getInt(SessionDescription.ATTR_LENGTH));
                    }
                    if (jSONObject2.has("skipAfter")) {
                        creativeData.skipAfter = Integer.valueOf(jSONObject2.getInt("skipAfter"));
                    }
                    if (jSONObject2.has("type")) {
                        creativeData.type = jSONObject2.getString("type");
                    }
                    if (jSONObject2.has("showTimer")) {
                        creativeData.showTimer = jSONObject2.getBoolean("showTimer");
                    }
                    if (jSONObject2.has("closePosition")) {
                        creativeData.closePosition = jSONObject2.getString("closePosition");
                    }
                    if (jSONObject2.has("sayPosition")) {
                        creativeData.sayPosition = jSONObject2.getString("sayPosition");
                    }
                    if (jSONObject2.has("showProgressBar")) {
                        creativeData.showProgressBar = jSONObject2.getBoolean("showProgressBar");
                    }
                    if (jSONObject2.has("height")) {
                        creativeData.height = jSONObject2.getDouble("height");
                    }
                    if (jSONObject2.has("width")) {
                        creativeData.width = jSONObject2.getDouble("width");
                    }
                    this.creatives.add(creativeData);
                }
            }
        }
    }
}
