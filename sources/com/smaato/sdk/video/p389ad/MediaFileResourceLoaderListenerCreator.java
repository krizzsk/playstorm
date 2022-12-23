package com.smaato.sdk.video.p389ad;

import com.smaato.sdk.video.p389ad.MediaFileResourceLoaderListener;
import com.smaato.sdk.video.vast.model.VastScenario;

/* renamed from: com.smaato.sdk.video.ad.MediaFileResourceLoaderListenerCreator */
public final class MediaFileResourceLoaderListenerCreator {
    /* access modifiers changed from: package-private */
    public MediaFileResourceLoaderListener create(VastScenario vastScenario, MediaFileResourceLoaderListener.CachingListener cachingListener) {
        return new MediaFileResourceLoaderListener(vastScenario, cachingListener);
    }
}
