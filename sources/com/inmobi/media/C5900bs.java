package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* renamed from: com.inmobi.media.bs */
/* compiled from: AdEventListener */
public abstract class C5900bs<T> {
    public void onAdClicked(T t, Map<Object, Object> map) {
    }

    public void onAdFetchSuccessful(T t, AdMetaInfo adMetaInfo) {
    }

    public void onAdLoadFailed(T t, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    @Deprecated
    public void onAdLoadSucceeded(T t) {
    }

    public void onAdLoadSucceeded(T t, AdMetaInfo adMetaInfo) {
    }

    public void onRequestPayloadCreated(byte[] bArr) {
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    protected C5900bs() {
    }
}
