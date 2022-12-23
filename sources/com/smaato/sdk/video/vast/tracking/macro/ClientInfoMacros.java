package com.smaato.sdk.video.vast.tracking.macro;

import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.datacollector.SystemInfo;
import com.smaato.sdk.core.p378ad.GeoInfo;
import com.smaato.sdk.core.p378ad.RequestInfoProvider;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Maps;
import java.util.Map;

final class ClientInfoMacros {
    private final DataCollector dataCollector;
    private final RequestInfoProvider requestInfoProvider;
    private final SdkConfiguration sdkConfiguration;

    ClientInfoMacros(DataCollector dataCollector2, RequestInfoProvider requestInfoProvider2, SdkConfiguration sdkConfiguration2) {
        this.dataCollector = (DataCollector) Objects.requireNonNull(dataCollector2);
        this.requestInfoProvider = (RequestInfoProvider) Objects.requireNonNull(requestInfoProvider2);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration2);
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> toMap() {
        SystemInfo systemInfo = this.dataCollector.getSystemInfo();
        Map.Entry[] entryArr = new Map.Entry[8];
        entryArr[0] = Maps.entryOf("[IFA]", getGoogleAdvertisingId());
        entryArr[1] = Maps.entryOf("[IFATYPE]", "aaid");
        entryArr[2] = Maps.entryOf("[CLIENTUA]", "unknown");
        entryArr[3] = Maps.entryOf("[SERVERUA]", "-1");
        entryArr[4] = Maps.entryOf("[DEVICEUA]", TextUtils.isEmpty(systemInfo.getUserAgent()) ? "-2" : systemInfo.getUserAgent());
        entryArr[5] = Maps.entryOf("[SERVERSIDE]", "0");
        entryArr[6] = Maps.entryOf("[DEVICEIP]", "-1");
        entryArr[7] = Maps.entryOf("[LATLONG]", getLatLng());
        return Maps.mapOf(entryArr);
    }

    private String getGoogleAdvertisingId() {
        String googleAdId = this.requestInfoProvider.getGoogleAdId();
        return TextUtils.isEmpty(googleAdId) ? "-2" : googleAdId;
    }

    private String getLatLng() {
        GeoInfo geoInfo = this.requestInfoProvider.getGeoInfo(this.sdkConfiguration.getUserInfo());
        if (geoInfo == null) {
            return "-2";
        }
        return Joiner.join((CharSequence) ",", geoInfo.getFormattedLatitude(), geoInfo.getFormattedLongitude());
    }
}
