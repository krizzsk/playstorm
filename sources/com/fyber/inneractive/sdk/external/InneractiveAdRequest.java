package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.flow.C4404a0;

public class InneractiveAdRequest extends C4404a0 {

    /* renamed from: c */
    public String f10819c;

    /* renamed from: d */
    public C4346z f10820d;

    public InneractiveAdRequest(String str) {
        this.f10819c = str;
    }

    @Deprecated
    public String getKeywords() {
        return InneractiveAdManager.getKeywords();
    }

    @Deprecated
    public boolean getMuteVideo() {
        return InneractiveAdManager.getMuteVideo();
    }

    public C4346z getSelectedUnitConfig() {
        return this.f10820d;
    }

    public String getSpotId() {
        return this.f10819c;
    }

    @Deprecated
    public InneractiveUserConfig getUserParams() {
        return InneractiveAdManager.getUserParams();
    }

    @Deprecated
    public void setKeywords(String str) {
        InneractiveAdManager.setKeywords(str);
    }

    @Deprecated
    public void setMuteVideo(boolean z) {
        InneractiveAdManager.setMuteVideo(z);
    }

    public void setSelectedUnitConfig(C4346z zVar) {
        this.f10820d = zVar;
    }

    @Deprecated
    public void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
    }
}
