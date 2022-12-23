package com.smaato.sdk.core.datacollector;

import com.smaato.sdk.core.datacollector.LocationProvider;
import com.smaato.sdk.core.util.Objects;

public class DataCollector {
    private final LocationProvider locationProvider;
    private final SystemInfoProvider systemInfoProvider;

    DataCollector(SystemInfoProvider systemInfoProvider2, LocationProvider locationProvider2) {
        this.systemInfoProvider = (SystemInfoProvider) Objects.requireNonNull(systemInfoProvider2, "Parameter systemInfoProvider cannot be null for DataCollector::new");
        this.locationProvider = (LocationProvider) Objects.requireNonNull(locationProvider2, "Parameter locationProvider cannot be null for DataCollector::new");
    }

    public SystemInfo getSystemInfo() {
        return this.systemInfoProvider.getSystemInfoSnapshot();
    }

    public LocationProvider.DetectedLocation getLocationData() {
        return this.locationProvider.getLocationData();
    }
}
