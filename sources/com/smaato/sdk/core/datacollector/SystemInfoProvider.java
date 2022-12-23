package com.smaato.sdk.core.datacollector;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkStateMonitor;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.reflection.Reflections;
import java.util.Locale;

class SystemInfoProvider {
    private final Context context;
    private GoogleAdvertisingClientInfo googleAdvertisingClientInfo;
    private final Logger logger;
    private final NetworkStateMonitor networkStateMonitor;
    private final TelephonyManager telephonyManager;
    private final UserAgentProvider userAgentProvider;

    SystemInfoProvider(Logger logger2, Context context2, NetworkStateMonitor networkStateMonitor2, TelephonyManager telephonyManager2, UserAgentProvider userAgentProvider2) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for SystemInfoProvider::new");
        this.context = (Context) Objects.requireNonNull(context2, "Parameter context cannot be null for SystemInfoProvider::new");
        this.networkStateMonitor = (NetworkStateMonitor) Objects.requireNonNull(networkStateMonitor2, "Parameter networkStateMonitor cannot be null for SystemInfoProvider::new");
        this.telephonyManager = (TelephonyManager) Objects.requireNonNull(telephonyManager2, "Parameter telephonyManager cannot be null for SystemInfoProvider::new");
        this.userAgentProvider = (UserAgentProvider) Objects.requireNonNull(userAgentProvider2, "Parameter userAgentProvider cannot be null for SystemInfoProvider::new");
    }

    public SystemInfo getSystemInfoSnapshot() {
        String simOperatorName = this.telephonyManager.getSimOperatorName();
        String simOperator = this.telephonyManager.getSimOperator();
        GoogleAdvertisingClientInfo googleAdvertisingClientInfo2 = this.googleAdvertisingClientInfo;
        if (googleAdvertisingClientInfo2 == null && isAdMobAvailable()) {
            googleAdvertisingClientInfo2 = getGoogleAdvertisingClientInfo();
            this.googleAdvertisingClientInfo = googleAdvertisingClientInfo2;
        }
        String str = (String) Objects.transformOrNull(googleAdvertisingClientInfo2, $$Lambda$GO_lA4WitxSmPAnr6G0BjX_TVKI.INSTANCE);
        Boolean bool = (Boolean) Objects.transformOrNull(googleAdvertisingClientInfo2, $$Lambda$gVylY46Wvwp1OInI80o4WgpqcIQ.INSTANCE);
        String str2 = Build.MODEL;
        if (str2 == null) {
            str2 = "deviceModel";
        }
        return new SystemInfo(simOperatorName, simOperator, getGoogleAdvertisingIdOrAndroidId(str), bool, str2, this.networkStateMonitor.getNetworkConnectionType(), this.userAgentProvider.get(), this.context.getPackageName(), getLanguage());
    }

    private String getGoogleAdvertisingIdOrAndroidId(String str) {
        return (str == null || !str.matches("[0-]+")) ? str : Settings.Secure.getString(this.context.getContentResolver(), "android_id");
    }

    private GoogleAdvertisingClientInfo getGoogleAdvertisingClientInfo() {
        return new GoogleAdvertisingClientInfo(this.logger, this.context);
    }

    private boolean isAdMobAvailable() {
        return Reflections.isClassInClasspath("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    private String getLanguage() {
        Locale locale;
        if (this.context.getResources() == null) {
            locale = Locale.getDefault();
        } else if (Build.VERSION.SDK_INT >= 24) {
            locale = this.context.getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = this.context.getResources().getConfiguration().locale;
        }
        String language = locale.getLanguage();
        if (!TextUtils.isEmpty(language)) {
            return language;
        }
        return Locale.getDefault().getLanguage();
    }
}
