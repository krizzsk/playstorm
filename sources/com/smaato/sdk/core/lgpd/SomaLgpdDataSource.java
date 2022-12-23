package com.smaato.sdk.core.lgpd;

import com.smaato.sdk.core.locationaware.LocationAware;

public class SomaLgpdDataSource {
    private final LocationAware locationAware;

    public SomaLgpdDataSource(LocationAware locationAware2) {
        this.locationAware = locationAware2;
    }

    public SomaLgpdData getSomaLgpdData() {
        return new SomaLgpdV2Utils(this.locationAware).createSomaLgpdData();
    }
}
