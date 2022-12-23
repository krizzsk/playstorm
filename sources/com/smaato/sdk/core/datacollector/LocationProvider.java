package com.smaato.sdk.core.datacollector;

import android.location.Location;
import com.smaato.sdk.core.util.Clock;
import com.smaato.sdk.core.util.Objects;

public final class LocationProvider {
    private final Clock clock;
    private DetectedLocation lastKnownLocation;
    private final LocationDetector locationDetector;
    private long locationRefreshTimeMillis;

    LocationProvider(LocationDetector locationDetector2, Clock clock2, long j) {
        this.locationDetector = (LocationDetector) Objects.requireNonNull(locationDetector2);
        this.clock = (Clock) Objects.requireNonNull(clock2);
        this.locationRefreshTimeMillis = j;
    }

    /* access modifiers changed from: package-private */
    public DetectedLocation getLocationData() {
        if (isLocationFresh()) {
            return this.lastKnownLocation;
        }
        DetectedLocation detectLocation = detectLocation();
        this.lastKnownLocation = detectLocation;
        return detectLocation;
    }

    private DetectedLocation detectLocation() {
        DetectedLocation gpsProvidedLocation = getGpsProvidedLocation();
        return gpsProvidedLocation != null ? gpsProvidedLocation : getNetworkProvidedLocation();
    }

    private DetectedLocation getGpsProvidedLocation() {
        Location gpsProvidedLocation = this.locationDetector.getGpsProvidedLocation();
        if (gpsProvidedLocation == null) {
            return null;
        }
        return new DetectedLocation(gpsProvidedLocation, DetectedLocation.TYPE.GPS, this.clock.elapsedRealtime());
    }

    private DetectedLocation getNetworkProvidedLocation() {
        Location networkProvidedLocation = this.locationDetector.getNetworkProvidedLocation();
        if (networkProvidedLocation == null) {
            return null;
        }
        return new DetectedLocation(networkProvidedLocation, DetectedLocation.TYPE.NETWORK, this.clock.elapsedRealtime());
    }

    private boolean isLocationFresh() {
        if (this.lastKnownLocation != null && this.clock.elapsedRealtime() - this.lastKnownLocation.lastUpdatedMillis <= this.locationRefreshTimeMillis) {
            return true;
        }
        return false;
    }

    public static final class DetectedLocation {
        /* access modifiers changed from: private */
        public final long lastUpdatedMillis;
        final Location location;
        private final TYPE type;

        public enum TYPE {
            GPS,
            NETWORK
        }

        private DetectedLocation(Location location2, TYPE type2, long j) {
            this.location = location2;
            this.type = type2;
            this.lastUpdatedMillis = j;
        }

        public double getLatitude() {
            return this.location.getLatitude();
        }

        public double getLongitude() {
            return this.location.getLongitude();
        }

        public float getAccuracy() {
            return this.location.getAccuracy();
        }

        public TYPE getType() {
            return this.type;
        }

        public long getLastUpdatedMillis() {
            return this.lastUpdatedMillis;
        }
    }
}
