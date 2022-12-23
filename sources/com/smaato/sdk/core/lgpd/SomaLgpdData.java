package com.smaato.sdk.core.lgpd;

import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.locationaware.LocationAware;

public class SomaLgpdData {
    private final LocationAware locationAware;

    SomaLgpdData(LocationAware locationAware2) {
        this.locationAware = locationAware2;
    }

    public boolean isLgpdEnabled() {
        return this.locationAware.isConsentCountry();
    }

    public Boolean isLgpdConsentEnabled() {
        return SmaatoSdk.isLGPDConsentEnabled();
    }

    public boolean isUsageAllowedFor() {
        Boolean isLGPDConsentEnabled = SmaatoSdk.isLGPDConsentEnabled();
        if (isLGPDConsentEnabled != null) {
            return isLGPDConsentEnabled.booleanValue();
        }
        return true;
    }
}
