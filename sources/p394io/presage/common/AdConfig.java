package p394io.presage.common;

import com.ogury.p376ed.internal.C10765mq;

@Deprecated
/* renamed from: io.presage.common.AdConfig */
public final class AdConfig {
    private final String adUnitId;
    private String campaignId;
    private String creativeId;

    public AdConfig(String str) {
        C10765mq.m32773b(str, "adUnitId");
        this.adUnitId = str;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }
}
