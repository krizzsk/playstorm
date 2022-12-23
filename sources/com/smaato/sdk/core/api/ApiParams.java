package com.smaato.sdk.core.api;

import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.network.NetworkConnectionType;
import com.smaato.sdk.core.p378ad.RequestInfoProvider;

public class ApiParams {
    private final DataCollector dataCollector;
    private final RequestInfoProvider requestInfoProvider;

    public ApiParams(DataCollector dataCollector2, RequestInfoProvider requestInfoProvider2) {
        this.dataCollector = dataCollector2;
        this.requestInfoProvider = requestInfoProvider2;
    }

    public String getClient() {
        if (!SmaatoSdk.getUnityVersion().isEmpty()) {
            return "sdkandroid_" + SmaatoSdk.getVersion() + "_unity_" + SmaatoSdk.getUnityVersion();
        }
        return "sdkandroid_" + SmaatoSdk.getVersion();
    }

    public String getBundle() {
        return this.dataCollector.getSystemInfo().getPackageName();
    }

    public String getGoogleAdId() {
        return this.requestInfoProvider.getGoogleAdId();
    }

    public Boolean getGoogleDnt() {
        return this.dataCollector.getSystemInfo().isGoogleLimitAdTrackingEnabled();
    }

    public int getCoppa() {
        return SmaatoSdk.getCoppa() ? 1 : 0;
    }

    public String getConnectionType() {
        NetworkConnectionType networkConnectionType = this.dataCollector.getSystemInfo().getNetworkConnectionType();
        if (networkConnectionType != null) {
            return networkConnectionType.toString();
        }
        return null;
    }
}
