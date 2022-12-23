package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import org.json.JSONObject;

public class AdInfo {
    private ImpressionData mImpressionData;

    public AdInfo(ImpressionData impressionData) {
        this.mImpressionData = impressionData;
    }

    public String getAb() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getAb();
        }
        return null;
    }

    public String getAdNetwork() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getAdNetwork();
        }
        return null;
    }

    public String getAdUnit() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getAdUnit();
        }
        return null;
    }

    public JSONObject getAllData() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getAllData();
        }
        return null;
    }

    public String getAuctionId() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getAuctionId();
        }
        return null;
    }

    public String getCountry() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getCountry();
        }
        return null;
    }

    public String getEncryptedCPM() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getEncryptedCPM();
        }
        return null;
    }

    public String getInstanceId() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getInstanceId();
        }
        return null;
    }

    public String getInstanceName() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getInstanceName();
        }
        return null;
    }

    public Double getLifetimeRevenue() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getLifetimeRevenue();
        }
        return null;
    }

    public String getPlacement() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getPlacement();
        }
        return null;
    }

    public String getPrecision() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getPrecision();
        }
        return null;
    }

    public Double getRevenue() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getRevenue();
        }
        return null;
    }

    public String getSegmentName() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null) {
            return impressionData.getSegmentName();
        }
        return null;
    }

    public String toString() {
        return "{ " + this.mImpressionData + " }";
    }
}
