package com.p374my.target;

import com.p374my.target.common.CustomParams;

/* renamed from: com.my.target.a */
public final class C9596a {
    public int bannersCount;
    public String bidId;
    public long cachePeriod = 86400000;
    public int cachePolicy = 0;
    public final CustomParams customParams = new CustomParams();
    public volatile String format;
    public boolean mediationEnabled = true;
    public boolean refreshAd = true;
    public int slotId;
    public int videoQuality = 360;

    public C9596a(int i, String str) {
        this.slotId = i;
        this.format = str;
    }

    public static C9596a newConfig(int i, String str) {
        return new C9596a(i, str);
    }

    public int getBannersCount() {
        return this.bannersCount;
    }

    public String getBidId() {
        return this.bidId;
    }

    public long getCachePeriod() {
        return this.cachePeriod;
    }

    public int getCachePolicy() {
        return this.cachePolicy;
    }

    public CustomParams getCustomParams() {
        return this.customParams;
    }

    public String getFormat() {
        return this.format;
    }

    public int getSlotId() {
        return this.slotId;
    }

    public int getVideoQuality() {
        return this.videoQuality;
    }

    public boolean isMediationEnabled() {
        return this.mediationEnabled;
    }

    public boolean isRefreshAd() {
        return this.refreshAd;
    }

    public void setBannersCount(int i) {
        this.bannersCount = i;
    }

    public void setBidId(String str) {
        this.bidId = str;
    }

    public void setCachePeriod(long j) {
        if (j < 0) {
            this.cachePeriod = 0;
        } else {
            this.cachePeriod = j;
        }
    }

    public void setCachePolicy(int i) {
        this.cachePolicy = i;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setMediationEnabled(boolean z) {
        this.mediationEnabled = z;
    }

    public void setRefreshAd(boolean z) {
        this.refreshAd = z;
    }

    public void setSlotId(int i) {
        this.slotId = i;
    }

    public void setVideoQuality(int i) {
        this.videoQuality = i;
    }
}
