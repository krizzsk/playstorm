package com.smaato.sdk.video.vast.player;

import android.text.TextUtils;
import com.smaato.sdk.core.linkhandler.LinkHandler;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.concurrent.atomic.AtomicReference;

class ComponentClickHandler {
    private final LinkHandler linkHandler;
    private final AtomicReference<Boolean> linkHandlingInProgress = new AtomicReference<>(Boolean.FALSE);
    private final Logger logger;
    private final VideoClicks videoClicks;

    ComponentClickHandler(Logger logger2, LinkHandler linkHandler2, VideoClicks videoClicks2) {
        this.linkHandler = (LinkHandler) Objects.requireNonNull(linkHandler2);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.videoClicks = videoClicks2;
    }

    /* access modifiers changed from: package-private */
    public void handleClick(String str, Runnable runnable) {
        if (TextUtils.isEmpty(str)) {
            VideoClicks videoClicks2 = this.videoClicks;
            VastBeacon vastBeacon = videoClicks2 == null ? null : videoClicks2.clickThrough;
            if (vastBeacon == null) {
                str = null;
            } else {
                str = vastBeacon.uri;
            }
        }
        if (TextUtils.isEmpty(str)) {
            this.logger.error(LogDomain.VAST, "Cannot handle click due to a missing URL", new Object[0]);
        } else if (str == null) {
            runnable.run();
        } else if (!this.linkHandlingInProgress.get().booleanValue()) {
            this.linkHandlingInProgress.set(Boolean.TRUE);
            if (this.linkHandler.handleUrl(str)) {
                runnable.run();
            } else {
                this.logger.error(LogDomain.VAST, "Seems to be an invalid URL: " + str, new Object[0]);
            }
            this.linkHandlingInProgress.set(Boolean.FALSE);
        }
    }
}
