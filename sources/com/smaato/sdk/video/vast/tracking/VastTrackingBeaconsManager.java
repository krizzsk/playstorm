package com.smaato.sdk.video.vast.tracking;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.VastBeaconEvent;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class VastTrackingBeaconsManager {
    private final Set<VastBeaconEvent> trackedBeaconEvents = Collections.synchronizedSet(new HashSet());
    private final Map<VastBeaconEvent, Collection<String>> trackingBeaconEvents;

    VastTrackingBeaconsManager(Map<VastBeaconEvent, Collection<String>> map) {
        this.trackingBeaconEvents = new HashMap((Map) Objects.requireNonNull(map));
    }

    /* access modifiers changed from: package-private */
    public Set<String> getNotSentBeaconUrls(VastBeaconEvent vastBeaconEvent) {
        Collection collection;
        if (this.trackedBeaconEvents.contains(vastBeaconEvent)) {
            return Collections.emptySet();
        }
        if (!this.trackingBeaconEvents.containsKey(vastBeaconEvent) || (collection = this.trackingBeaconEvents.get(vastBeaconEvent)) == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(collection));
    }

    /* access modifiers changed from: package-private */
    public void markAsTracked(VastBeaconEvent vastBeaconEvent) {
        this.trackedBeaconEvents.add(vastBeaconEvent);
    }

    /* access modifiers changed from: package-private */
    public boolean isTracked(VastBeaconEvent vastBeaconEvent) {
        return this.trackedBeaconEvents.contains(vastBeaconEvent);
    }
}
