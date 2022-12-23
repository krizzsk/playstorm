package com.p374my.tracker;

import android.content.pm.PackageInfo;
import com.p374my.tracker.config.AntiFraudConfig;
import com.p374my.tracker.obfuscated.C10178v0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import okhttp3.OkHttpClient;

/* renamed from: com.my.tracker.MyTrackerConfig */
public final class MyTrackerConfig {
    private final C10178v0 trackerConfig;

    /* renamed from: com.my.tracker.MyTrackerConfig$InstalledPackagesProvider */
    public interface InstalledPackagesProvider {
        List<PackageInfo> getInstalledPackages();
    }

    /* renamed from: com.my.tracker.MyTrackerConfig$OkHttpClientProvider */
    public interface OkHttpClientProvider {
        OkHttpClient getOkHttpClient();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.my.tracker.MyTrackerConfig$Region */
    public @interface Region {

        /* renamed from: EU */
        public static final int f25075EU = 1;

        /* renamed from: RU */
        public static final int f25076RU = 0;
    }

    private MyTrackerConfig(C10178v0 v0Var) {
        this.trackerConfig = v0Var;
    }

    static MyTrackerConfig newConfig(C10178v0 v0Var) {
        return new MyTrackerConfig(v0Var);
    }

    public AntiFraudConfig getAntiFraudConfig() {
        return this.trackerConfig.mo66396a();
    }

    public int getBufferingPeriod() {
        return this.trackerConfig.mo66413d();
    }

    public int getForcingPeriod() {
        return this.trackerConfig.mo66416e();
    }

    public String getId() {
        return this.trackerConfig.mo66418f();
    }

    public int getLaunchTimeout() {
        return this.trackerConfig.mo66421h();
    }

    @Deprecated
    public String getVendorAppPackage() {
        return this.trackerConfig.mo66425l();
    }

    public boolean isAutotrackingPurchaseEnabled() {
        return this.trackerConfig.mo66426m();
    }

    public boolean isTrackingEnvironmentEnabled() {
        return this.trackerConfig.mo66427n();
    }

    public boolean isTrackingLaunchEnabled() {
        return this.trackerConfig.mo66428o();
    }

    public boolean isTrackingLocationEnabled() {
        return this.trackerConfig.mo66429p();
    }

    public boolean isTrackingPreinstallEnabled() {
        return this.trackerConfig.mo66430q();
    }

    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.trackerConfig.mo66431r();
    }

    public void setAntiFraudConfig(AntiFraudConfig antiFraudConfig) {
        this.trackerConfig.mo66401a(antiFraudConfig);
    }

    public MyTrackerConfig setAutotrackingPurchaseEnabled(boolean z) {
        this.trackerConfig.mo66404a(z);
        return this;
    }

    public MyTrackerConfig setBufferingPeriod(int i) {
        this.trackerConfig.mo66397a(i);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setDefaultVendorAppPackage() {
        this.trackerConfig.mo66432t();
        return this;
    }

    public MyTrackerConfig setForcingPeriod(int i) {
        this.trackerConfig.mo66406b(i);
        return this;
    }

    public MyTrackerConfig setInstalledPackagesProvider(InstalledPackagesProvider installedPackagesProvider) {
        this.trackerConfig.mo66399a(installedPackagesProvider);
        return this;
    }

    public MyTrackerConfig setLaunchTimeout(int i) {
        this.trackerConfig.mo66410c(i);
        return this;
    }

    public MyTrackerConfig setOkHttpClientProvider(OkHttpClientProvider okHttpClientProvider) {
        this.trackerConfig.mo66400a(okHttpClientProvider);
        return this;
    }

    public MyTrackerConfig setProxyHost(String str) {
        this.trackerConfig.mo66407b(str);
        return this;
    }

    public MyTrackerConfig setRegion(int i) {
        this.trackerConfig.mo66414d(i);
        return this;
    }

    public MyTrackerConfig setTrackingEnvironmentEnabled(boolean z) {
        this.trackerConfig.mo66408b(z);
        return this;
    }

    public MyTrackerConfig setTrackingLaunchEnabled(boolean z) {
        this.trackerConfig.mo66412c(z);
        return this;
    }

    public MyTrackerConfig setTrackingLocationEnabled(boolean z) {
        this.trackerConfig.mo66415d(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallEnabled(boolean z) {
        this.trackerConfig.mo66417e(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z) {
        this.trackerConfig.mo66419f(z);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setVendorAppPackage(String str) {
        this.trackerConfig.mo66411c(str);
        return this;
    }
}
