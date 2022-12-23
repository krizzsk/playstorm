package com.fyber.marketplace.fairbid.bridge;

import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.p189dv.C4364g;
import java.util.List;
import org.json.JSONObject;

public interface MarketplaceAuctionParameters {
    String getAdvertisingId();

    String getAmazonAdvertisingId();

    String getAppVersion();

    String getBundleId();

    String getCarrier();

    String getDeviceModel();

    C4309s getFeatureProvider(String str);

    int getHeight();

    String getHorizontalAccuracy();

    List<String> getInputLanguages();

    String getLanguage();

    String getLatitudeLongitude();

    JSONObject getMarketplaceEntry();

    String getMobileCountryCode();

    String getMobileNetworkCode();

    String getNetwork();

    List<Integer> getSupportedApis();

    List<String> getSupportedMimes();

    List<Integer> getSupportedProtocols();

    int getSupportedTypesBitwise();

    String getTimeAccuracy();

    String getVerticalAccuracy();

    int getWidth();

    C4364g getWrapperQueryInfo(String str);

    boolean hasAmazonAdvertisingId();

    Boolean isLimitTrackingEnabled();
}
