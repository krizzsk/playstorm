package com.adcolony.sdk;

import com.mbridge.msdk.foundation.entity.CampaignEx;

public class AdColonyReward {

    /* renamed from: a */
    private int f158a;

    /* renamed from: b */
    private String f159b;

    /* renamed from: c */
    private String f160c;

    /* renamed from: d */
    private boolean f161d;

    AdColonyReward(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        this.f158a = C0764c0.m332d(a, CampaignEx.JSON_KEY_REWARD_AMOUNT);
        this.f159b = C0764c0.m336h(a, CampaignEx.JSON_KEY_REWARD_NAME);
        this.f161d = C0764c0.m325b(a, "success");
        this.f160c = C0764c0.m336h(a, "zone_id");
    }

    public int getRewardAmount() {
        return this.f158a;
    }

    public String getRewardName() {
        return this.f159b;
    }

    public String getZoneID() {
        return this.f160c;
    }

    public boolean success() {
        return this.f161d;
    }
}
