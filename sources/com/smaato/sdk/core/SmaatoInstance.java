package com.smaato.sdk.core;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.ccpa.CcpaDataStorage;
import com.smaato.sdk.core.configcheck.AppConfigChecker;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.datacollector.DiDataCollectorLayer;
import com.smaato.sdk.core.dns.DiDns;
import com.smaato.sdk.core.flow.Schedulers;
import com.smaato.sdk.core.flow.SdkSchedulers;
import com.smaato.sdk.core.kpi.DiKpiDBHelper;
import com.smaato.sdk.core.locationaware.DiLocationAware;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.CoreDiNames;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.HeaderUtils;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkConfigHintBuilder;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.violationreporter.DiAdQualityViolationReporterLayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SmaatoInstance {
    private AdContentRating adContentRating;
    private Integer age;
    private boolean coppa = false;
    private DiConstructor diConstructor;
    private final List<ExtensionConfiguration> extensionConfigurations;
    private Gender gender;
    private boolean isCompanionAdSkippable = false;
    private boolean isGPSEnabled = false;
    private Boolean isLgpdConsentEnabled;
    private boolean isWatermarkEnabled = false;
    private String keywords;
    private String language;
    private LatLng latLng;
    private String mUnityVersion;
    private final String publisherId;
    private String region;
    private String searchQuery;
    private String zip;

    static /* synthetic */ Application lambda$createCoreOfCoreRegistry$2(Application application, DiConstructor diConstructor2) {
        return application;
    }

    SmaatoInstance(Application application, Config config, List<DiRegistry> list, List<ExpectedManifestEntries> list2, String str) {
        this.publisherId = (String) Objects.requireNonNull(str, "Parameter PublisherId cannot be null for SmaatoInstance::new");
        this.adContentRating = ((Config) Objects.requireNonNull(config, "Parameter config cannot be null for SmaatoInstance::new")).getAdContentRating();
        this.mUnityVersion = ((Config) Objects.requireNonNull(config, "Parameter config cannot be null for SmaatoInstance::new")).getUnityVersion();
        this.extensionConfigurations = ((Config) Objects.requireNonNull(config, "Parameter config cannot be null for SmaatoInstance::new")).getExtensionConfigurations();
        this.diConstructor = initDi((Application) Objects.requireNonNull(application, "Parameter application cannot be null for SmaatoInstance::new"), config, (List) Objects.requireNonNull(list, "Parameter diRegistriesOfModules cannot be null for SmaatoInstance::new"), mergeExpectedManifestEntries(list2));
    }

    /* access modifiers changed from: package-private */
    public DiConstructor getDiConstructor() {
        return this.diConstructor;
    }

    private DiConstructor initDi(Application application, Config config, List<DiRegistry> list, ExpectedManifestEntries expectedManifestEntries) {
        HashSet hashSet = new HashSet(list);
        Collections.addAll(hashSet, new DiRegistry[]{createCoreOfCoreRegistry(application, expectedManifestEntries, isHttpsOnly(config), config.loggingEnabled()), DiLogLayer.createRegistry(config.loggingEnabled(), config.getConsoleLogLevel()), DiKpiDBHelper.createRegistry(application.getApplicationContext(), config.sessionTrackingDisabled()), DiDataCollectorLayer.createRegistry(), DiAdQualityViolationReporterLayer.createRegistry(), DiDns.createRegistry(), DiLocationAware.createRegistry()});
        return DiConstructor.create((Set<DiRegistry>) hashSet);
    }

    private boolean isHttpsOnly(Config config) {
        boolean isHttpsOnly = config.isHttpsOnly();
        if (isHttpsOnly) {
            return isHttpsOnly;
        }
        if (Build.VERSION.SDK_INT >= 23 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : true) {
            return isHttpsOnly;
        }
        Log.w(LogDomain.CORE.name(), "`httpsOnly` value overridden to TRUE, due to Network Security Configuration settings.");
        return true;
    }

    private DiRegistry createCoreOfCoreRegistry(Application application, ExpectedManifestEntries expectedManifestEntries, boolean z, boolean z2) {
        return DiRegistry.m32956of(new Consumer(z, z2, application, expectedManifestEntries) {
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ Application f$2;
            public final /* synthetic */ ExpectedManifestEntries f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void accept(Object obj) {
                SmaatoInstance.lambda$createCoreOfCoreRegistry$11(this.f$0, this.f$1, this.f$2, this.f$3, (DiRegistry) obj);
            }
        });
    }

    static /* synthetic */ void lambda$createCoreOfCoreRegistry$11(boolean z, boolean z2, Application application, ExpectedManifestEntries expectedManifestEntries, DiRegistry diRegistry) {
        diRegistry.registerFactory(CoreDiNames.NAME_HTTPS_ONLY, Boolean.class, new ClassFactory(z) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return Boolean.valueOf(this.f$0);
            }
        });
        diRegistry.registerFactory(CoreDiNames.NAME_IS_LOGGING_ENABLED, Boolean.class, new ClassFactory(z2) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return Boolean.valueOf(this.f$0);
            }
        });
        diRegistry.registerFactory(Application.class, new ClassFactory(application) {
            public final /* synthetic */ Application f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return SmaatoInstance.lambda$createCoreOfCoreRegistry$2(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory(CoreDiNames.SOMA_API_URL, String.class, $$Lambda$SmaatoInstance$JteCNuvi0kXCxuCWurDVm1_kwcc.INSTANCE);
        diRegistry.registerSingletonFactory(AppMetaData.class, $$Lambda$SmaatoInstance$vlzwlkQTMTpMhxIWYzPi7fnJUsw.INSTANCE);
        diRegistry.registerSingletonFactory(SdkConfigHintBuilder.class, $$Lambda$SmaatoInstance$9eOS9yoEPDgAmrN_u_VhZeepObE.INSTANCE);
        diRegistry.registerSingletonFactory(AppConfigChecker.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return SmaatoInstance.lambda$createCoreOfCoreRegistry$6(ExpectedManifestEntries.this, diConstructor);
            }
        });
        diRegistry.registerSingletonFactory(AppBackgroundDetector.class, $$Lambda$SmaatoInstance$mJYaTOBvTlsg5O9fwGNBlPrgCFM.INSTANCE);
        diRegistry.registerSingletonFactory(HeaderUtils.class, $$Lambda$SmaatoInstance$WuQI1uH0qLtoE9__5GTUFngCK5U.INSTANCE);
        diRegistry.registerSingletonFactory(Schedulers.class, $$Lambda$SmaatoInstance$WYyVYVZB4l1Ynnjtm7nW8pSHXRA.INSTANCE);
        diRegistry.registerSingletonFactory(SdkConfiguration.class, $$Lambda$SmaatoInstance$b58PGKxK3jZU69EvPYMgCtuPjtU.INSTANCE);
    }

    static /* synthetic */ AppMetaData lambda$createCoreOfCoreRegistry$4(DiConstructor diConstructor2) {
        return new AppMetaData((Context) diConstructor2.get(Application.class), DiLogLayer.getLoggerFrom(diConstructor2));
    }

    static /* synthetic */ SdkConfigHintBuilder lambda$createCoreOfCoreRegistry$5(DiConstructor diConstructor2) {
        return new SdkConfigHintBuilder();
    }

    static /* synthetic */ AppConfigChecker lambda$createCoreOfCoreRegistry$6(ExpectedManifestEntries expectedManifestEntries, DiConstructor diConstructor2) {
        return new AppConfigChecker(DiLogLayer.getLoggerFrom(diConstructor2), expectedManifestEntries, (AppMetaData) diConstructor2.get(AppMetaData.class));
    }

    static /* synthetic */ AppBackgroundDetector lambda$createCoreOfCoreRegistry$7(DiConstructor diConstructor2) {
        return new AppBackgroundDetector(DiLogLayer.getLoggerFrom(diConstructor2));
    }

    static /* synthetic */ HeaderUtils lambda$createCoreOfCoreRegistry$8(DiConstructor diConstructor2) {
        return new HeaderUtils();
    }

    static /* synthetic */ Schedulers lambda$createCoreOfCoreRegistry$9(DiConstructor diConstructor2) {
        return new SdkSchedulers();
    }

    static /* synthetic */ SdkConfiguration lambda$createCoreOfCoreRegistry$10(DiConstructor diConstructor2) {
        return new SdkConfiguration();
    }

    /* access modifiers changed from: package-private */
    public String getKeywords() {
        return this.keywords;
    }

    /* access modifiers changed from: package-private */
    public void setKeywords(String str) {
        this.keywords = str;
    }

    /* access modifiers changed from: package-private */
    public String getSearchQuery() {
        return this.searchQuery;
    }

    /* access modifiers changed from: package-private */
    public void setSearchQuery(String str) {
        this.searchQuery = str;
    }

    /* access modifiers changed from: package-private */
    public Gender getGender() {
        return this.gender;
    }

    /* access modifiers changed from: package-private */
    public void setGender(Gender gender2) {
        this.gender = gender2;
    }

    /* access modifiers changed from: package-private */
    public Integer getAge() {
        return this.age;
    }

    /* access modifiers changed from: package-private */
    public void setAge(Integer num) {
        this.age = num;
    }

    /* access modifiers changed from: package-private */
    public LatLng getLatLng() {
        return this.latLng;
    }

    /* access modifiers changed from: package-private */
    public void setLatLng(LatLng latLng2) {
        this.latLng = latLng2;
    }

    /* access modifiers changed from: package-private */
    public String getRegion() {
        return this.region;
    }

    /* access modifiers changed from: package-private */
    public void setRegion(String str) {
        this.region = str;
    }

    /* access modifiers changed from: package-private */
    public String getZip() {
        return this.zip;
    }

    /* access modifiers changed from: package-private */
    public void setZip(String str) {
        this.zip = str;
    }

    public void setUnityVersion(String str) {
        this.mUnityVersion = str;
    }

    /* access modifiers changed from: package-private */
    public String getLanguage() {
        return this.language;
    }

    /* access modifiers changed from: package-private */
    public void setLanguage(String str) {
        this.language = str;
    }

    /* access modifiers changed from: package-private */
    public boolean getCoppa() {
        return this.coppa;
    }

    /* access modifiers changed from: package-private */
    public void setCoppa(boolean z) {
        this.coppa = z;
    }

    /* access modifiers changed from: package-private */
    public String getPublisherId() {
        return this.publisherId;
    }

    /* access modifiers changed from: package-private */
    public boolean isGPSEnabled() {
        return this.isGPSEnabled;
    }

    /* access modifiers changed from: package-private */
    public void setGPSEnabled(boolean z) {
        this.isGPSEnabled = z;
    }

    /* access modifiers changed from: package-private */
    public Boolean isLgpdConsentEnabled() {
        return this.isLgpdConsentEnabled;
    }

    public void setLgpdConsentEnabled(Boolean bool) {
        this.isLgpdConsentEnabled = bool;
    }

    /* access modifiers changed from: package-private */
    public boolean isWatermarkEnabled() {
        return this.isWatermarkEnabled;
    }

    /* access modifiers changed from: package-private */
    public void setWatermarkEnabled(boolean z) {
        this.isWatermarkEnabled = z;
    }

    /* access modifiers changed from: package-private */
    public List<ExtensionConfiguration> getExtensionConfigurations() {
        return new ArrayList(this.extensionConfigurations);
    }

    /* access modifiers changed from: package-private */
    public boolean isCompanionAdSkippable() {
        return this.isCompanionAdSkippable;
    }

    /* access modifiers changed from: package-private */
    public void setIsCompanionAdSkippable(boolean z) {
        this.isCompanionAdSkippable = z;
    }

    /* access modifiers changed from: package-private */
    public String getUsPrivacyString() {
        return ((CcpaDataStorage) this.diConstructor.get(CcpaDataStorage.class)).getUsPrivacyString();
    }

    /* access modifiers changed from: package-private */
    public AdContentRating getAdContentRating() {
        return this.adContentRating;
    }

    /* access modifiers changed from: package-private */
    public void setAdContentRating(AdContentRating adContentRating2) {
        this.adContentRating = adContentRating2;
    }

    public String getUnityVersion() {
        return this.mUnityVersion;
    }

    private ExpectedManifestEntries mergeExpectedManifestEntries(List<ExpectedManifestEntries> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ExpectedManifestEntries next : list) {
            hashSet.addAll(next.getPermissionsMandatory());
            hashSet2.addAll(next.getActivities());
        }
        return new ExpectedManifestEntries(hashSet, hashSet2);
    }
}
