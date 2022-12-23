package com.smaato.sdk.video.vast.tracking;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.trackers.BeaconTracker;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastEvent;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.tracking.macro.MacroInjector;
import com.smaato.sdk.video.vast.tracking.macro.MacrosInjectorProviderFunction;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class VastEventTrackerCreator {
    private final BeaconTracker beaconTracker;
    private final ExecutorService executorService;
    private final Logger logger;
    private final MacrosInjectorProviderFunction macroInjectorProvider;

    public VastEventTrackerCreator(Logger logger2, BeaconTracker beaconTracker2, MacrosInjectorProviderFunction macrosInjectorProviderFunction, ExecutorService executorService2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.beaconTracker = (BeaconTracker) Objects.requireNonNull(beaconTracker2);
        this.macroInjectorProvider = (MacrosInjectorProviderFunction) Objects.requireNonNull(macrosInjectorProviderFunction);
        this.executorService = (ExecutorService) Objects.requireNonNull(executorService2);
    }

    public VastEventTracker createEventTracker(VastScenario vastScenario) {
        Map<VastEvent, List<Tracking>> createTrackingEventsMap = createTrackingEventsMap(vastScenario);
        Logger logger2 = this.logger;
        return new VastEventTracker(logger2, this.beaconTracker, createTrackingEventsMap, OffsetEventsManager.fromTrackingsMap(createTrackingEventsMap, vastScenario.vastMediaFileScenario.duration, logger2), (MacroInjector) this.macroInjectorProvider.apply(vastScenario), this.executorService);
    }

    private Map<VastEvent, List<Tracking>> createTrackingEventsMap(VastScenario vastScenario) {
        HashMap hashMap = new HashMap();
        extractTrackingsToMap(hashMap, vastScenario.vastMediaFileScenario.trackingEvents);
        VastCompanionScenario vastCompanionScenario = vastScenario.vastCompanionScenario;
        if (vastCompanionScenario != null) {
            extractTrackingsToMap(hashMap, vastCompanionScenario.trackingEvents);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private void extractTrackingsToMap(Map<VastEvent, LinkedList<Tracking>> map, List<Tracking> list) {
        for (Tracking next : list) {
            if (!map.containsKey(next.vastEvent)) {
                map.put(next.vastEvent, new LinkedList());
            }
            Objects.onNotNull(map.get(next.vastEvent), new Consumer() {
                public final void accept(Object obj) {
                    ((LinkedList) obj).add(Tracking.this);
                }
            });
        }
    }
}
