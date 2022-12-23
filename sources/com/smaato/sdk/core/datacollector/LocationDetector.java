package com.smaato.sdk.core.datacollector;

import android.location.Location;
import android.location.LocationManager;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Objects;

final class LocationDetector {
    private final AppMetaData appMetaData;
    private final LocationManager locationManager;

    LocationDetector(LocationManager locationManager2, AppMetaData appMetaData2) {
        this.locationManager = (LocationManager) Objects.requireNonNull(locationManager2);
        this.appMetaData = (AppMetaData) Objects.requireNonNull(appMetaData2);
    }

    /* access modifiers changed from: package-private */
    public Location getGpsProvidedLocation() {
        if (hasPermission("android.permission.ACCESS_FINE_LOCATION") && this.locationManager.isProviderEnabled("gps")) {
            return this.locationManager.getLastKnownLocation("gps");
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Location getNetworkProvidedLocation() {
        if ((hasPermission("android.permission.ACCESS_FINE_LOCATION") || hasPermission("android.permission.ACCESS_COARSE_LOCATION")) && this.locationManager.isProviderEnabled("network")) {
            return this.locationManager.getLastKnownLocation("network");
        }
        return null;
    }

    private boolean hasPermission(String str) {
        return this.appMetaData.isPermissionGranted(str);
    }
}
