package com.applovin.impl.mediation;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import org.json.JSONObject;

public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {

    /* renamed from: a */
    private final JSONObject f2013a;

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this.f2013a = jSONObject;
    }

    public String getAdapterClassName() {
        return JsonUtils.getString(this.f2013a, "class", "");
    }

    public String getAdapterVersion() {
        return JsonUtils.getString(this.f2013a, "version", "");
    }

    public String getName() {
        return JsonUtils.getString(this.f2013a, "name", "");
    }

    public String getSdkVersion() {
        return JsonUtils.getString(this.f2013a, "sdk_version", "");
    }

    public String toString() {
        return "MaxMediatedNetworkInfo{name=" + getName() + ", adapterClassName=" + getAdapterClassName() + ", adapterVersion=" + getAdapterVersion() + ", sdkVersion=" + getSdkVersion() + '}';
    }
}
