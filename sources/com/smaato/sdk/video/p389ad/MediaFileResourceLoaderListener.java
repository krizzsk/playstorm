package com.smaato.sdk.video.p389ad;

import android.net.Uri;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.resourceloader.ResourceLoaderException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.VastScenario;

/* renamed from: com.smaato.sdk.video.ad.MediaFileResourceLoaderListener */
public final class MediaFileResourceLoaderListener implements ResourceLoader.Listener<Uri> {
    private final CachingListener listener;
    private final VastScenario vastScenario;

    /* renamed from: com.smaato.sdk.video.ad.MediaFileResourceLoaderListener$CachingListener */
    interface CachingListener {
        void onFailure(Exception exc);

        void onSuccess(VastScenario vastScenario);
    }

    MediaFileResourceLoaderListener(VastScenario vastScenario2, CachingListener cachingListener) {
        this.vastScenario = (VastScenario) Objects.requireNonNull(vastScenario2);
        this.listener = (CachingListener) Objects.requireNonNull(cachingListener);
    }

    public void onResourceLoaded(Uri uri) {
        try {
            this.listener.onSuccess(this.vastScenario.newBuilder().setVastMediaFileScenario(this.vastScenario.vastMediaFileScenario.newBuilder().setMediaFile(this.vastScenario.vastMediaFileScenario.mediaFile.newBuilder().setUrl(uri.toString()).build()).build()).build());
        } catch (VastElementMissingException e) {
            handleError(e);
        }
    }

    public void onFailure(ResourceLoaderException resourceLoaderException) {
        handleError(resourceLoaderException);
    }

    private void handleError(Exception exc) {
        this.listener.onFailure(exc);
    }
}
