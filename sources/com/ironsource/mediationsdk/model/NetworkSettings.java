package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkSettings {

    /* renamed from: a */
    private String f17457a;

    /* renamed from: b */
    private String f17458b;

    /* renamed from: c */
    private JSONObject f17459c;

    /* renamed from: d */
    private JSONObject f17460d;

    /* renamed from: e */
    private JSONObject f17461e;

    /* renamed from: f */
    private JSONObject f17462f;

    /* renamed from: g */
    private String f17463g;

    /* renamed from: h */
    private String f17464h;

    /* renamed from: i */
    private boolean f17465i;

    /* renamed from: j */
    private String f17466j;

    /* renamed from: k */
    private int f17467k;

    /* renamed from: l */
    private int f17468l;

    /* renamed from: m */
    private int f17469m;

    /* renamed from: n */
    private String f17470n;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f17457a = networkSettings.getProviderName();
        this.f17466j = networkSettings.getProviderName();
        this.f17458b = networkSettings.getProviderTypeForReflection();
        this.f17460d = networkSettings.getRewardedVideoSettings();
        this.f17461e = networkSettings.getInterstitialSettings();
        this.f17462f = networkSettings.getBannerSettings();
        this.f17459c = networkSettings.getApplicationSettings();
        this.f17467k = networkSettings.getRewardedVideoPriority();
        this.f17468l = networkSettings.getInterstitialPriority();
        this.f17469m = networkSettings.getBannerPriority();
        this.f17470n = networkSettings.getProviderDefaultInstance();
    }

    public NetworkSettings(String str) {
        this.f17457a = str;
        this.f17466j = str;
        this.f17458b = str;
        this.f17470n = str;
        this.f17460d = new JSONObject();
        this.f17461e = new JSONObject();
        this.f17462f = new JSONObject();
        this.f17459c = new JSONObject();
        this.f17467k = -1;
        this.f17468l = -1;
        this.f17469m = -1;
    }

    public NetworkSettings(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f17457a = str;
        this.f17466j = str;
        this.f17458b = str2;
        this.f17470n = str3;
        this.f17460d = jSONObject2;
        this.f17461e = jSONObject3;
        this.f17462f = jSONObject4;
        this.f17459c = jSONObject;
        this.f17467k = -1;
        this.f17468l = -1;
        this.f17469m = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f17464h;
    }

    public JSONObject getApplicationSettings() {
        return this.f17459c;
    }

    public int getBannerPriority() {
        return this.f17469m;
    }

    public JSONObject getBannerSettings() {
        return this.f17462f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f17459c;
        if (jSONObject != null) {
            return jSONObject.optString(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD);
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit == null && (jSONObject2 = this.f17459c) != null) || ((ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject2 = this.f17460d) != null) || (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject2 = this.f17461e) != null))) {
            return jSONObject2.optString("customNetworkAdapterName");
        }
        if (!ad_unit.equals(IronSource.AD_UNIT.BANNER) || (jSONObject = this.f17462f) == null) {
            return null;
        }
        return jSONObject.optString("customNetworkAdapterName");
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f17459c;
        return jSONObject != null ? jSONObject.optString("customNetworkPackage", "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 1;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.f17468l;
    }

    public JSONObject getInterstitialSettings() {
        return this.f17461e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 99;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("maxAdsPerSession", 99);
    }

    public String getProviderDefaultInstance() {
        return this.f17470n;
    }

    public String getProviderInstanceName() {
        return this.f17466j;
    }

    public String getProviderName() {
        return this.f17457a;
    }

    public String getProviderTypeForReflection() {
        return this.f17458b;
    }

    public int getRewardedVideoPriority() {
        return this.f17467k;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f17460d;
    }

    public String getSubProviderId() {
        return this.f17463g;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        return !isCustomNetwork() && getInstanceType(ad_unit) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
    }

    public boolean isMultipleInstances() {
        return this.f17465i;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f17464h = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f17459c = jSONObject;
    }

    public void setBannerPriority(int i) {
        this.f17469m = i;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f17462f.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f17462f = jSONObject;
    }

    public void setInterstitialPriority(int i) {
        this.f17468l = i;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f17461e.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f17461e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z) {
        this.f17465i = z;
    }

    public void setRewardedVideoPriority(int i) {
        this.f17467k = i;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f17460d.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f17460d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f17463g = str;
    }
}
