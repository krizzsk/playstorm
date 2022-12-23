package com.smaato.sdk.core.network;

import com.tapjoy.TapjoyConstants;

public enum NetworkConnectionType {
    CARRIER_2G("2g"),
    CARRIER_3G("3g"),
    CARRIER_4G("4g"),
    CARRIER_UNKNOWN("carrier"),
    WIFI(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI),
    ETHERNET("ethernet"),
    OTHER("other");
    
    private final String type;

    private NetworkConnectionType(String str) {
        this.type = str;
    }

    public String toString() {
        return this.type;
    }
}
