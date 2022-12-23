package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.LatLng;
import com.smaato.sdk.core.util.Objects;
import java.util.Locale;

/* renamed from: com.smaato.sdk.core.ad.GeoInfo */
public final class GeoInfo {
    private final GeoType geoType;
    private final LatLng latLng;

    public GeoInfo(LatLng latLng2, GeoType geoType2) {
        this.latLng = (LatLng) Objects.requireNonNull(latLng2);
        this.geoType = (GeoType) Objects.requireNonNull(geoType2);
    }

    public String getFormattedLatitude() {
        return format(this.latLng.getLatitude());
    }

    public String getFormattedLongitude() {
        return format(this.latLng.getLongitude());
    }

    public LatLng getLatLng() {
        return this.latLng;
    }

    public GeoType getGeoType() {
        return this.geoType;
    }

    private String format(double d) {
        return String.format(Locale.US, "%.6f", new Object[]{Double.valueOf(d)});
    }
}
