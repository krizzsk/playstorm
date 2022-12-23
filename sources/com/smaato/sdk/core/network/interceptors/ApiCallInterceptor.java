package com.smaato.sdk.core.network.interceptors;

import android.net.Uri;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.sdk.InMobiSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.AdContentRating;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.api.ApiParams;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.datacollector.SystemInfo;
import com.smaato.sdk.core.gdpr.PiiParam;
import com.smaato.sdk.core.gdpr.SomaGdprData;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.hooks.Hook1061;
import com.smaato.sdk.core.lgpd.SomaLgpdData;
import com.smaato.sdk.core.lgpd.SomaLgpdDataSource;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.Headers;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.network.SomaException;
import com.smaato.sdk.core.p378ad.GeoInfo;
import com.smaato.sdk.core.p378ad.RequestInfoProvider;
import com.smaato.sdk.core.p378ad.UserInfo;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.Cookie;
import java.io.IOException;

public class ApiCallInterceptor implements Interceptor {
    private final ApiParams apiParams;
    private final DataCollector dataCollector;
    private final boolean isHttpsOnly;
    private final Logger logger;
    private final RequestInfoProvider requestInfoProvider;
    private final SdkConfiguration sdkConfiguration;
    private final SomaGdprDataSource somaGdprDataSource;
    private final SomaLgpdDataSource somaLgpdDataSource;

    public ApiCallInterceptor(SomaGdprDataSource somaGdprDataSource2, SomaLgpdDataSource somaLgpdDataSource2, SdkConfiguration sdkConfiguration2, RequestInfoProvider requestInfoProvider2, DataCollector dataCollector2, boolean z, Logger logger2, ApiParams apiParams2) {
        this.somaGdprDataSource = somaGdprDataSource2;
        this.somaLgpdDataSource = somaLgpdDataSource2;
        this.sdkConfiguration = sdkConfiguration2;
        this.requestInfoProvider = requestInfoProvider2;
        this.dataCollector = dataCollector2;
        this.isHttpsOnly = z;
        this.logger = logger2;
        this.apiParams = apiParams2;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Uri.Builder buildUpon = request.uri().buildUpon();
        Headers.Builder buildUpon2 = request.headers().buildUpon();
        try {
            fillSdkStaticData(request.uri(), buildUpon);
            fillGdprData(buildUpon);
            fillLgpdData(buildUpon);
            fillUserInfoData(buildUpon);
            fillDeviceInfoData(buildUpon, buildUpon2);
        } catch (Exception e) {
            this.logger.error(LogDomain.NETWORK, "ApiCallInterceptor failed: ", e);
        }
        return chain.proceed(request.buildUpon().uri(buildUpon.build()).headers(buildUpon2.build()).build());
    }

    private void fillSdkStaticData(Uri uri, Uri.Builder builder) {
        String publisherId = SmaatoSdk.getPublisherId();
        String queryParameter = uri.getQueryParameter("adspace");
        if (publisherId == null || queryParameter == null) {
            builder.appendQueryParameter("pub", publisherId);
        } else {
            builder.appendQueryParameter("pub", Hook1061.onGetPublisherId(publisherId, queryParameter));
        }
        builder.appendQueryParameter("extensions", CampaignEx.KEY_OMID);
        boolean z = this.isHttpsOnly;
        if (!z && Build.VERSION.SDK_INT >= 23) {
            z = !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            this.logger.warning(LogDomain.NETWORK, "\"`httpsOnly` value overridden to TRUE, due to Network Security Configuration settings.\"", new Object[0]);
        }
        builder.appendQueryParameter("secure", z ? "1" : "0");
        builder.appendQueryParameter(SmaatoSdk.KEY_DEEPLINK, "true");
    }

    private void fillLgpdData(Uri.Builder builder) {
        SomaLgpdData somaLgpdData = this.somaLgpdDataSource.getSomaLgpdData();
        String str = "1";
        builder.appendQueryParameter(SmaatoSdk.KEY_LGPD_APPLICABLE, somaLgpdData.isLgpdEnabled() ? str : "0");
        Boolean isLgpdConsentEnabled = somaLgpdData.isLgpdConsentEnabled();
        if (isLgpdConsentEnabled != null) {
            if (!isLgpdConsentEnabled.booleanValue()) {
                str = "0";
            }
            builder.appendQueryParameter("lgpd_consent", str);
        }
    }

    private void fillGdprData(Uri.Builder builder) throws Exception {
        SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
        if (somaGdprData.isUsageAllowedFor(PiiParam.LOAD_ADS)) {
            Boolean isGdprEnabled = somaGdprData.isGdprEnabled();
            if (isGdprEnabled != null) {
                builder.appendQueryParameter("gdpr", isGdprEnabled.booleanValue() ? "1" : "0");
            }
            if (!somaGdprData.getConsentString().isEmpty()) {
                builder.appendQueryParameter(InMobiSdk.IM_GDPR_CONSENT_IAB, somaGdprData.getConsentString());
            }
            SdkConfiguration sdkConfiguration2 = this.sdkConfiguration;
            if (!sdkConfiguration2.getUsPrivacyString().isEmpty()) {
                builder.appendQueryParameter("us_privacy", sdkConfiguration2.getUsPrivacyString());
                return;
            }
            return;
        }
        throw new SomaException(SomaException.Type.NO_CONTENT, "GDPR permissions do not allow ad loading!");
    }

    private void fillUserInfoData(Uri.Builder builder) {
        UserInfo userInfo = this.sdkConfiguration.getUserInfo();
        builder.appendQueryParameter(Cookie.COPPA_KEY, userInfo.getCoppa() ? "1" : "0");
        if (userInfo.getKeywords() != null) {
            builder.appendQueryParameter("kws", userInfo.getKeywords());
        }
        if (userInfo.getSearchQuery() != null) {
            builder.appendQueryParameter("qs", userInfo.getSearchQuery());
        }
        SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
        SomaLgpdData somaLgpdData = this.somaLgpdDataSource.getSomaLgpdData();
        if (somaGdprData.isUsageAllowedFor(PiiParam.GENDER) && userInfo.getGender() != null) {
            builder.appendQueryParameter(InneractiveMediationDefs.KEY_GENDER, userInfo.getGender().toString());
        }
        if (somaGdprData.isUsageAllowedFor(PiiParam.AGE) && userInfo.getAge() != null) {
            builder.appendQueryParameter("age", userInfo.getAge().toString());
        }
        if (userInfo.getRegion() != null) {
            builder.appendQueryParameter("region", userInfo.getRegion());
        }
        if (somaGdprData.isUsageAllowedFor(PiiParam.ZIP) && userInfo.getZip() != null) {
            builder.appendQueryParameter("zip", userInfo.getZip());
        }
        RequestInfoProvider requestInfoProvider2 = this.requestInfoProvider;
        builder.appendQueryParameter("lang", requestInfoProvider2.getLanguage(userInfo));
        GeoInfo geoInfo = requestInfoProvider2.getGeoInfo(userInfo);
        if (geoInfo != null && (!somaLgpdData.isLgpdEnabled() || somaLgpdData.isUsageAllowedFor())) {
            builder.appendQueryParameter("gps", geoInfo.getFormattedLatitude() + "," + geoInfo.getFormattedLongitude());
            builder.appendQueryParameter("geotype", geoInfo.getGeoType().toString());
        }
        AdContentRating adContentRating = requestInfoProvider2.getAdContentRating();
        if (AdContentRating.MAX_AD_CONTENT_RATING_UNDEFINED != adContentRating) {
            builder.appendQueryParameter("madcr", adContentRating.toString());
        }
    }

    private void fillDeviceInfoData(Uri.Builder builder, Headers.Builder builder2) {
        SystemInfo systemInfo = this.dataCollector.getSystemInfo();
        if (systemInfo.getCarrierName() != null) {
            builder.appendQueryParameter("carrier", systemInfo.getCarrierName());
        }
        if (systemInfo.getCarrierCode() != null) {
            builder.appendQueryParameter("carriercode", systemInfo.getCarrierCode());
        }
        Boolean isGoogleLimitAdTrackingEnabled = systemInfo.isGoogleLimitAdTrackingEnabled();
        if (isGoogleLimitAdTrackingEnabled != null) {
            builder.appendQueryParameter("googlednt", isGoogleLimitAdTrackingEnabled.toString());
        }
        builder.appendQueryParameter("connection", this.apiParams.getConnectionType());
        builder.appendQueryParameter(TJAdUnitConstants.String.BUNDLE, this.apiParams.getBundle());
        builder.appendQueryParameter("client", this.apiParams.getClient());
        builder2.put("X-SMT-Client", "sdk/android/" + SmaatoSdk.getVersion());
        SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
        SomaLgpdData somaLgpdData = this.somaLgpdDataSource.getSomaLgpdData();
        if (somaGdprData.isUsageAllowedFor(PiiParam.DEVICE_MODEL) && systemInfo.getDeviceModelName() != null) {
            builder.appendQueryParameter("devicemodel", systemInfo.getDeviceModelName());
        }
        if (!somaGdprData.isUsageAllowedFor(PiiParam.GOOGLE_AD_ID)) {
            return;
        }
        if ((!somaLgpdData.isLgpdEnabled() || somaLgpdData.isUsageAllowedFor()) && systemInfo.getGoogleAdvertisingId() != null) {
            builder.appendQueryParameter("googleadid", systemInfo.getGoogleAdvertisingId());
        }
    }
}
