package com.smaato.sdk.core.datacollector;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.location.LocationManager;
import android.telephony.TelephonyManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkStateMonitor;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Clock;
import com.smaato.sdk.core.util.Objects;
import java.util.concurrent.ExecutorService;

public final class DiDataCollectorLayer {
    private DiDataCollectorLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiDataCollectorLayer$1dVx2efY0k764If19b8FUmo_IcY.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$10(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory("DATA_COLLECTION_EXECUTOR_SERVICE", ExecutorService.class, $$Lambda$DiDataCollectorLayer$3nhTStGv_iTs2N0D2OWHRjC0TiE.INSTANCE);
        diRegistry.registerSingletonFactory(DataCollector.class, $$Lambda$DiDataCollectorLayer$oEdxX1H7tlJu9JprC3ChZL9Doac.INSTANCE);
        diRegistry.registerSingletonFactory(TelephonyManager.class, $$Lambda$DiDataCollectorLayer$fhlUx79Lz5lpkuCB5_2Hhm3CWsQ.INSTANCE);
        diRegistry.registerSingletonFactory(ContentResolver.class, $$Lambda$DiDataCollectorLayer$Jp8XYdeksmfmplgbvD2d6V2bHLU.INSTANCE);
        diRegistry.registerSingletonFactory(SystemInfoProvider.class, $$Lambda$DiDataCollectorLayer$FF2ic5XEP54qeIeRmwrSs4BAXl0.INSTANCE);
        diRegistry.registerSingletonFactory(LocationProvider.class, $$Lambda$DiDataCollectorLayer$2jR4NFhkFg14mSTKtwC5VuXv8mw.INSTANCE);
        diRegistry.registerFactory(Clock.class, $$Lambda$DiDataCollectorLayer$hkhyicA3_6sKkN0m8GohYqLe8A.INSTANCE);
        diRegistry.registerFactory(LocationDetector.class, $$Lambda$DiDataCollectorLayer$Vv1aBdQ51WH8tXsvA6AoIFwGVA.INSTANCE);
        diRegistry.registerFactory(LocationManager.class, $$Lambda$DiDataCollectorLayer$gZbP_uIODnTYiiR_mYPNKquADpM.INSTANCE);
        diRegistry.registerFactory(UserAgentProvider.class, $$Lambda$DiDataCollectorLayer$2Qn18rtk_5JYZz9jgITFSghdlE.INSTANCE);
    }

    static /* synthetic */ DataCollector lambda$createRegistry$1(DiConstructor diConstructor) {
        return new DataCollector((SystemInfoProvider) diConstructor.get(SystemInfoProvider.class), (LocationProvider) diConstructor.get(LocationProvider.class));
    }

    static /* synthetic */ TelephonyManager lambda$createRegistry$2(DiConstructor diConstructor) {
        return (TelephonyManager) Objects.requireNonNull((TelephonyManager) ((Application) diConstructor.get(Application.class)).getSystemService("phone"));
    }

    static /* synthetic */ ContentResolver lambda$createRegistry$3(DiConstructor diConstructor) {
        return (ContentResolver) Objects.requireNonNull(((Application) diConstructor.get(Application.class)).getContentResolver());
    }

    static /* synthetic */ SystemInfoProvider lambda$createRegistry$4(DiConstructor diConstructor) {
        return new SystemInfoProvider((Logger) diConstructor.get(Logger.class), (Context) diConstructor.get(Application.class), (NetworkStateMonitor) diConstructor.get(NetworkStateMonitor.class), (TelephonyManager) diConstructor.get(TelephonyManager.class), (UserAgentProvider) diConstructor.get(UserAgentProvider.class));
    }

    static /* synthetic */ LocationProvider lambda$createRegistry$5(DiConstructor diConstructor) {
        return new LocationProvider((LocationDetector) diConstructor.get(LocationDetector.class), (Clock) diConstructor.get(Clock.class), 1200000);
    }

    static /* synthetic */ Clock lambda$createRegistry$6(DiConstructor diConstructor) {
        return new Clock();
    }

    static /* synthetic */ LocationDetector lambda$createRegistry$7(DiConstructor diConstructor) {
        return new LocationDetector((LocationManager) diConstructor.get(LocationManager.class), (AppMetaData) diConstructor.get(AppMetaData.class));
    }

    static /* synthetic */ LocationManager lambda$createRegistry$8(DiConstructor diConstructor) {
        return (LocationManager) Objects.requireNonNull(((Application) diConstructor.get(Application.class)).getSystemService(FirebaseAnalytics.Param.LOCATION));
    }

    static /* synthetic */ UserAgentProvider lambda$createRegistry$9(DiConstructor diConstructor) {
        return new UserAgentProvider((Context) diConstructor.get(Application.class));
    }
}
