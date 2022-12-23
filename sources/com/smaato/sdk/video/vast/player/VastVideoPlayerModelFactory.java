package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.linkhandler.LinkHandler;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.notifier.ChangeSenderUtils;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.player.VastVideoPlayerModel;
import com.smaato.sdk.video.vast.tracking.VastBeaconTrackerCreator;
import com.smaato.sdk.video.vast.tracking.VastErrorTracker;
import com.smaato.sdk.video.vast.tracking.VastEventTrackerCreator;

class VastVideoPlayerModelFactory {
    private final boolean isInitiallyMuted;
    private final LinkHandler linkHandler;
    private final VastBeaconTrackerCreator vastBeaconTrackerCreator;
    private final VastEventTrackerCreator vastEventTrackerCreator;

    VastVideoPlayerModelFactory(LinkHandler linkHandler2, VastEventTrackerCreator vastEventTrackerCreator2, VastBeaconTrackerCreator vastBeaconTrackerCreator2, boolean z) {
        this.linkHandler = (LinkHandler) Objects.requireNonNull(linkHandler2);
        this.vastEventTrackerCreator = (VastEventTrackerCreator) Objects.requireNonNull(vastEventTrackerCreator2);
        this.vastBeaconTrackerCreator = (VastBeaconTrackerCreator) Objects.requireNonNull(vastBeaconTrackerCreator2);
        this.isInitiallyMuted = z;
    }

    /* access modifiers changed from: package-private */
    public VastVideoPlayerModel createVastVideoPlayerModel(Logger logger, VastScenario vastScenario, SomaApiContext somaApiContext, VastErrorTracker vastErrorTracker, boolean z) {
        ComponentClickHandler componentClickHandler = new ComponentClickHandler(logger, this.linkHandler, vastScenario.vastMediaFileScenario.videoClicks);
        return new VastVideoPlayerModel(vastErrorTracker, this.vastEventTrackerCreator.createEventTracker(vastScenario), this.vastBeaconTrackerCreator.createBeaconTracker(vastScenario, somaApiContext), componentClickHandler, this.isInitiallyMuted, z, ChangeSenderUtils.createUniqueValueChangeSender(VastVideoPlayerModel.Quartile.ZERO));
    }
}
