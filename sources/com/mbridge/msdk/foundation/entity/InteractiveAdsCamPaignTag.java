package com.mbridge.msdk.foundation.entity;

import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

public class InteractiveAdsCamPaignTag implements NoProGuard, Serializable {
    private long campaignCreateTime;

    /* renamed from: id */
    private String f20185id;
    private int isClick;
    private int resourceType;

    public InteractiveAdsCamPaignTag() {
    }

    public InteractiveAdsCamPaignTag(String str, int i, long j, int i2) {
        this.f20185id = str;
        this.resourceType = i;
        this.campaignCreateTime = j;
        this.isClick = i2;
    }

    public String getId() {
        return this.f20185id;
    }

    public void setId(String str) {
        this.f20185id = str;
    }

    public int getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(int i) {
        this.resourceType = i;
    }

    public long getCampaignCreateTime() {
        return this.campaignCreateTime;
    }

    public void setCampaignCreateTime(long j) {
        this.campaignCreateTime = j;
    }

    public int getIsClick() {
        return this.isClick;
    }

    public void setIsClick(int i) {
        this.isClick = i;
    }
}
