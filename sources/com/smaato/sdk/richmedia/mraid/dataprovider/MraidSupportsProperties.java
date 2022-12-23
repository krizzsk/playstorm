package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.content.Context;
import android.webkit.WebView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.gdpr.PiiParam;
import com.smaato.sdk.core.gdpr.SomaGdprData;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.lgpd.SomaLgpdData;
import com.smaato.sdk.core.lgpd.SomaLgpdDataSource;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.util.DeviceUtils;
import java.util.ArrayList;
import java.util.List;

public final class MraidSupportsProperties {
    private final AppMetaData appMetaData;
    private final SdkConfiguration sdkConfiguration;
    private final SomaGdprDataSource somaGdprDataSource;
    private final SomaLgpdDataSource somaLgpdDataSource;

    public MraidSupportsProperties(AppMetaData appMetaData2, SdkConfiguration sdkConfiguration2, SomaGdprDataSource somaGdprDataSource2, SomaLgpdDataSource somaLgpdDataSource2) {
        this.appMetaData = (AppMetaData) Objects.requireNonNull(appMetaData2);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration2);
        this.somaGdprDataSource = (SomaGdprDataSource) Objects.requireNonNull(somaGdprDataSource2);
        this.somaLgpdDataSource = (SomaLgpdDataSource) Objects.requireNonNull(somaLgpdDataSource2);
    }

    public List<String> getSupportedFeatures(Context context, WebView webView) {
        ArrayList arrayList = new ArrayList();
        if (DeviceUtils.isSmsAvailable(context)) {
            arrayList.add("sms");
        }
        if (DeviceUtils.isTelAvailable(context)) {
            arrayList.add("tel");
        }
        if (DeviceUtils.isInlineVideoSupported(context, webView)) {
            arrayList.add("inlineVideo");
        }
        SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
        SomaLgpdData somaLgpdData = this.somaLgpdDataSource.getSomaLgpdData();
        if (DeviceUtils.isLocationAvailable(this.appMetaData) && this.sdkConfiguration.isGpsEnabled() && !this.sdkConfiguration.isCoppaEnabled() && somaGdprData.isUsageAllowedFor(PiiParam.GPS) && (!somaLgpdData.isLgpdEnabled() || somaLgpdData.isUsageAllowedFor())) {
            arrayList.add(FirebaseAnalytics.Param.LOCATION);
        }
        return arrayList;
    }

    public String[] getAllMraidFeatures() {
        return new String[]{"sms", "tel", "calendar", "storePicture", "inlineVideo", FirebaseAnalytics.Param.LOCATION, "vpaid"};
    }
}
