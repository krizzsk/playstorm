package com.inmobi.ads.listeners;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.C5900bs;
import java.util.Map;

public abstract class NativeAdEventListener extends C5900bs<InMobiNative> {
    public void onAdClicked(InMobiNative inMobiNative) {
    }

    public void onAdFullScreenDismissed(InMobiNative inMobiNative) {
    }

    public void onAdFullScreenDisplayed(InMobiNative inMobiNative) {
    }

    public void onAdFullScreenWillDisplay(InMobiNative inMobiNative) {
    }

    public void onAdImpressed(InMobiNative inMobiNative) {
    }

    @Deprecated
    public void onAdReceived(InMobiNative inMobiNative) {
    }

    public void onAdStatusChanged(InMobiNative inMobiNative) {
    }

    public void onUserWillLeaveApplication(InMobiNative inMobiNative) {
    }

    public /* bridge */ /* synthetic */ void onAdClicked(Object obj, Map map) {
        super.onAdClicked(obj, map);
    }

    public /* bridge */ /* synthetic */ void onAdFetchSuccessful(Object obj, AdMetaInfo adMetaInfo) {
        super.onAdFetchSuccessful(obj, adMetaInfo);
    }

    public /* bridge */ /* synthetic */ void onAdLoadFailed(Object obj, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onAdLoadFailed(obj, inMobiAdRequestStatus);
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void onAdLoadSucceeded(Object obj) {
        super.onAdLoadSucceeded(obj);
    }

    public /* bridge */ /* synthetic */ void onAdLoadSucceeded(Object obj, AdMetaInfo adMetaInfo) {
        super.onAdLoadSucceeded(obj, adMetaInfo);
    }

    public /* bridge */ /* synthetic */ void onRequestPayloadCreated(byte[] bArr) {
        super.onRequestPayloadCreated(bArr);
    }

    public /* bridge */ /* synthetic */ void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }
}
