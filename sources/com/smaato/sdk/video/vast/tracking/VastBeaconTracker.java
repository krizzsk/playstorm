package com.smaato.sdk.video.vast.tracking;

import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.trackers.BeaconTracker;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.model.VastBeaconEvent;
import com.smaato.sdk.video.vast.tracking.macro.MacroInjector;
import com.smaato.sdk.video.vast.tracking.macro.PlayerState;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public class VastBeaconTracker {
    private final BeaconTracker beaconTracker;
    private final ExecutorService executorService;
    private final Logger logger;
    private final MacroInjector macroInjector;
    private final SomaApiContext somaApiContext;
    private final VastTrackingBeaconsManager vastTrackingBeaconsManager;

    VastBeaconTracker(Logger logger2, SomaApiContext somaApiContext2, BeaconTracker beaconTracker2, MacroInjector macroInjector2, VastTrackingBeaconsManager vastTrackingBeaconsManager2, ExecutorService executorService2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.beaconTracker = (BeaconTracker) Objects.requireNonNull(beaconTracker2);
        this.macroInjector = (MacroInjector) Objects.requireNonNull(macroInjector2);
        this.vastTrackingBeaconsManager = (VastTrackingBeaconsManager) Objects.requireNonNull(vastTrackingBeaconsManager2);
        this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
        this.executorService = (ExecutorService) Objects.requireNonNull(executorService2);
    }

    public void trigger(VastBeaconEvent vastBeaconEvent, PlayerState playerState) {
        if (!this.vastTrackingBeaconsManager.isTracked(vastBeaconEvent)) {
            if (this.executorService.isShutdown()) {
                this.logger.error(LogDomain.VAST, "Attempt to trigger event: %s on a already shutdown beacon tracker", vastBeaconEvent);
                return;
            }
            this.executorService.execute(new Runnable(vastBeaconEvent, playerState) {
                public final /* synthetic */ VastBeaconEvent f$1;
                public final /* synthetic */ PlayerState f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    VastBeaconTracker.this.lambda$trigger$0$VastBeaconTracker(this.f$1, this.f$2);
                }
            });
        }
    }

    public /* synthetic */ void lambda$trigger$0$VastBeaconTracker(VastBeaconEvent vastBeaconEvent, PlayerState playerState) {
        Set<String> urlsToTrack = getUrlsToTrack(vastBeaconEvent, playerState);
        if (!urlsToTrack.isEmpty()) {
            trackBeaconUrls(vastBeaconEvent, urlsToTrack);
        }
    }

    private Set<String> getUrlsToTrack(VastBeaconEvent vastBeaconEvent, PlayerState playerState) {
        Set<String> notSentBeaconUrls = this.vastTrackingBeaconsManager.getNotSentBeaconUrls(vastBeaconEvent);
        if (!notSentBeaconUrls.isEmpty()) {
            return Collections.unmodifiableSet(this.macroInjector.injectMacros((Collection<String>) notSentBeaconUrls, playerState));
        }
        return Collections.emptySet();
    }

    private void trackBeaconUrls(VastBeaconEvent vastBeaconEvent, Set<String> set) {
        this.vastTrackingBeaconsManager.markAsTracked(vastBeaconEvent);
        this.beaconTracker.trackBeaconUrls(set, new Consumer(vastBeaconEvent) {
            public final /* synthetic */ VastBeaconEvent f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                VastBeaconTracker.this.lambda$trackBeaconUrls$1$VastBeaconTracker(this.f$1, (Exception) obj);
            }
        });
    }

    public /* synthetic */ void lambda$trackBeaconUrls$1$VastBeaconTracker(VastBeaconEvent vastBeaconEvent, Exception exc) {
        this.logger.error(LogDomain.VAST, exc, "Tracking Vast beacon failed with exception: %s", vastBeaconEvent);
    }
}
