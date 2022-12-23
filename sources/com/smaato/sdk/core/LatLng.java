package com.smaato.sdk.core;

import android.os.SystemClock;

public final class LatLng {
    private final float accuracy;
    private final double latitude;
    private final double longitude;
    private final long timestamp;

    public LatLng(double d, double d2, float f, long j) {
        this.latitude = d;
        this.longitude = d2;
        this.accuracy = f;
        this.timestamp = j;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public float getLocationAccuracy() {
        return this.accuracy;
    }

    public long getLocationTimestamp() {
        return this.timestamp;
    }

    public float getTimeSinceLastLocationUpdate() {
        return (float) (SystemClock.elapsedRealtime() - this.timestamp);
    }

    public boolean isValid() {
        double d = this.latitude;
        if (d > -90.0d && d < 90.0d) {
            double d2 = this.longitude;
            return d2 > -180.0d && d2 < 180.0d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LatLng.class != obj.getClass()) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.compare(latLng.latitude, this.latitude) != 0 || Double.compare(latLng.longitude, this.longitude) != 0) {
            return false;
        }
        if (Float.compare(latLng.accuracy, this.accuracy) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2))) * 31;
        float f = this.accuracy;
        return i + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public String toString() {
        return "LatLng{latitude=" + this.latitude + ", longitude=" + this.longitude + ", accuracy=" + this.accuracy + ", timestamp=" + this.timestamp + '}';
    }
}
