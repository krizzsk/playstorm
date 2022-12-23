package com.smaato.sdk.video.p389ad;

import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.trackers.BeaconTracker;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.build.VastScenarioResult;
import com.smaato.sdk.video.vast.tracking.VastErrorTracker;
import com.smaato.sdk.video.vast.tracking.macro.MacroInjector;
import com.smaato.sdk.video.vast.tracking.macro.MacrosInjectorProviderFunction;

/* renamed from: com.smaato.sdk.video.ad.VastErrorTrackerCreator */
public class VastErrorTrackerCreator {
    private final BeaconTracker beaconTracker;
    private final Logger logger;
    private final MacrosInjectorProviderFunction macroInjectorProvider;

    public VastErrorTrackerCreator(Logger logger2, BeaconTracker beaconTracker2, MacrosInjectorProviderFunction macrosInjectorProviderFunction) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.beaconTracker = (BeaconTracker) Objects.requireNonNull(beaconTracker2);
        this.macroInjectorProvider = (MacrosInjectorProviderFunction) Objects.requireNonNull(macrosInjectorProviderFunction);
    }

    /* access modifiers changed from: package-private */
    public VastErrorTracker create(SomaApiContext somaApiContext, VastScenarioResult vastScenarioResult) {
        Objects.requireNonNull(somaApiContext);
        Objects.requireNonNull(vastScenarioResult);
        return new VastErrorTracker(this.logger, this.beaconTracker, somaApiContext, (MacroInjector) this.macroInjectorProvider.apply(vastScenarioResult.vastScenario), vastScenarioResult.errorUrls);
    }
}
