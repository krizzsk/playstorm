package com.amazon.device.ads;

import java.util.HashMap;

public class DTBAdNetworkInfo {
    private static final String LOGTAG = DTBAdNetworkInfo.class.getSimpleName();
    private final String adNetworkName;
    private final HashMap<String, String> adNetworkProperties = new HashMap<>();

    public DTBAdNetworkInfo(DTBAdNetwork dTBAdNetwork) {
        this.adNetworkName = dTBAdNetwork.toString();
    }

    public String getAdNetworkName() {
        return this.adNetworkName;
    }

    public DTBAdNetworkInfo setAdNetworkProperties(String str, String str2) {
        this.adNetworkProperties.put(str, str2);
        return this;
    }

    public String getAdNetworkProperties(String str) {
        if (this.adNetworkProperties.containsKey(str)) {
            return this.adNetworkProperties.get(str);
        }
        DtbLog.error(LOGTAG, "DTB Ad NetworkProperties not found");
        return null;
    }
}
