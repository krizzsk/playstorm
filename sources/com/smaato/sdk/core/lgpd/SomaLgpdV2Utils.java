package com.smaato.sdk.core.lgpd;

import com.smaato.sdk.core.locationaware.LocationAware;

public final class SomaLgpdV2Utils implements SomaLgpdUtils {
    private final LocationAware locationAware;

    SomaLgpdV2Utils(LocationAware locationAware2) {
        this.locationAware = locationAware2;
    }

    public SomaLgpdData createSomaLgpdData() {
        return new SomaLgpdData(this.locationAware);
    }
}
