package com.smaato.sdk.video.vast.tracking;

import android.text.TextUtils;
import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.trackers.BeaconTracker;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.tracking.macro.MacroInjector;
import com.smaato.sdk.video.vast.tracking.macro.PlayerState;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class VastErrorTracker {
    private final BeaconTracker beaconTracker;
    private final Set<String> errorUrls;
    private final Logger logger;
    private final MacroInjector macroInjector;
    private final SomaApiContext somaApiContext;

    public VastErrorTracker(Logger logger2, BeaconTracker beaconTracker2, SomaApiContext somaApiContext2, MacroInjector macroInjector2, Collection<String> collection) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.beaconTracker = (BeaconTracker) Objects.requireNonNull(beaconTracker2);
        this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
        this.macroInjector = (MacroInjector) Objects.requireNonNull(macroInjector2);
        this.errorUrls = new HashSet((Collection) Objects.requireNonNull(collection));
    }

    public void track(PlayerState playerState) {
        if (this.errorUrls.isEmpty()) {
            this.logger.info(LogDomain.VAST, "Wanted to track VastError [%d], but no beacon URLs available", playerState.errorCode);
            return;
        }
        this.logger.info(LogDomain.VAST, "Tracking VastError [%d]", playerState.errorCode);
        for (String next : this.errorUrls) {
            if (!TextUtils.isEmpty(next)) {
                this.beaconTracker.trackBeaconUrl(this.macroInjector.injectMacros(next, playerState));
            }
        }
    }
}
