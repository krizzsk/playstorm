package com.amazon.device.ads;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;

class DtbGeoLocation {
    private static final String LOG_TAG = DtbGeoLocation.class.getSimpleName();
    private static final float THRESHOLD_DISTANCE_IN_KILOMETERS = 3.0f;

    DtbGeoLocation() {
        if (AdRegistration.getContext() == null) {
            DtbLog.debugError("unable to initialize DtbGeoLocation without setting app context");
            throw new IllegalArgumentException("unable to initialize DtbGeoLocation without setting app context");
        }
    }

    public String getLocationParam() {
        Location location = getLocation();
        if (location == null) {
            return null;
        }
        long currentTimeMillis = (System.currentTimeMillis() - location.getTime()) / 1000;
        if (currentTimeMillis > 86400) {
            return null;
        }
        return location.getLatitude() + "," + location.getLongitude() + "," + location.getAccuracy() + "," + currentTimeMillis;
    }

    /* access modifiers changed from: package-private */
    public Location getLocation() {
        Context context = AdRegistration.getContext();
        if (!hasLocationPermission(context)) {
            return null;
        }
        Location lastLocation = getLastLocation(context, "gps");
        Location lastLocation2 = getLastLocation(context, "network");
        if (lastLocation == null || lastLocation2 == null) {
            if (lastLocation != null) {
                DtbLog.debug("Setting location using gps, network not available");
            } else if (lastLocation2 == null) {
                return null;
            } else {
                DtbLog.debug("Setting location using network, gps not available");
                return lastLocation2;
            }
        } else if (lastLocation.distanceTo(lastLocation2) / 1000.0f <= THRESHOLD_DISTANCE_IN_KILOMETERS) {
            float f = Float.MAX_VALUE;
            float accuracy = lastLocation.hasAccuracy() ? lastLocation.getAccuracy() : Float.MAX_VALUE;
            if (lastLocation2.hasAccuracy()) {
                f = lastLocation2.getAccuracy();
            }
            if (accuracy < f) {
                DtbLog.debug("Setting location using GPS determined by accuracy");
            } else {
                DtbLog.debug("Setting location using network determined by accuracy");
                lastLocation = lastLocation2;
            }
        } else if (lastLocation.getTime() > lastLocation2.getTime()) {
            DtbLog.debug("Setting location using GPS determined by time");
        } else {
            DtbLog.debug("Setting location using network determined by time");
            return lastLocation2;
        }
        return lastLocation;
    }

    /* access modifiers changed from: package-private */
    public Location getLastLocation(Context context, String str) {
        LocationManager locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        if (locationManager == null) {
            return null;
        }
        try {
            return locationManager.getLastKnownLocation(str);
        } catch (SecurityException unused) {
            DtbLog.warn("Failed to retrieve location: No permissions to access " + str);
            return null;
        } catch (IllegalArgumentException unused2) {
            DtbLog.warn("Failed to retrieve location: " + str + "not found");
            return null;
        }
    }

    private boolean hasLocationPermission(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }
}
