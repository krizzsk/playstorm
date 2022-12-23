package com.smaato.sdk.core.network;

import android.app.Application;
import android.net.ConnectivityManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.smaato.sdk.core.api.ApiParams;
import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.trackers.BeaconTracker;
import com.smaato.sdk.core.network.trackers.BeaconTrackerAdQualityViolationUtils;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Optional;
import com.smaato.sdk.core.violationreporter.AdQualityViolationReporter;
import java.util.concurrent.ExecutorService;

public final class DiNetworkLayer {
    private DiNetworkLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiNetworkLayer$aUkbKqSNeKrhaxU0GmmDaAcsg.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$6(DiRegistry diRegistry) {
        diRegistry.registerFactory(UrlCreator.class, $$Lambda$DiNetworkLayer$lEafROjnYS3zmYoZAzMmjxA128M.INSTANCE);
        diRegistry.registerSingletonFactory("network", ExecutorService.class, $$Lambda$DiNetworkLayer$podpdnUqhrZj9fdiZz9YbEQhUH0.INSTANCE);
        diRegistry.registerSingletonFactory(NetworkStateMonitor.class, $$Lambda$DiNetworkLayer$8EdyKeR0zpXJBP8e1Ve73RF2Peg.INSTANCE);
        diRegistry.registerSingletonFactory(ConnectionStatusWatcher.class, $$Lambda$DiNetworkLayer$IJrE31QyNymAIOHq3cHiahqDt10.INSTANCE);
        diRegistry.registerFactory("network", ConnectivityManager.class, $$Lambda$DiNetworkLayer$TtcjmGlp8ukIeEenlUu_OFd4uPA.INSTANCE);
        diRegistry.registerSingletonFactory("network", BeaconTracker.class, $$Lambda$DiNetworkLayer$m4CHX5FnzOg4eqb9k4M7PxPWAVE.INSTANCE);
        diRegistry.registerSingletonFactory(BeaconTrackerAdQualityViolationUtils.class, $$Lambda$DiNetworkLayer$gbikGH0p76kSwbYnReNqaS2tU3c.INSTANCE);
        registerSecurityPolicies(diRegistry);
    }

    static /* synthetic */ UrlCreator lambda$createRegistry$0(DiConstructor diConstructor) {
        return new UrlCreator();
    }

    static /* synthetic */ NetworkStateMonitor lambda$createRegistry$2(DiConstructor diConstructor) {
        return new NetworkStateMonitor((ConnectivityManager) diConstructor.get("network", ConnectivityManager.class), (ConnectionStatusWatcher) diConstructor.get(ConnectionStatusWatcher.class));
    }

    static /* synthetic */ ConnectivityManager lambda$createRegistry$3(DiConstructor diConstructor) {
        return (ConnectivityManager) Objects.requireNonNull((ConnectivityManager) ((Application) diConstructor.get(Application.class)).getSystemService("connectivity"));
    }

    static /* synthetic */ BeaconTracker lambda$createRegistry$4(DiConstructor diConstructor) {
        return new BeaconTracker(DiLogLayer.getLoggerFrom(diConstructor), CoreLightModuleInterface.getHttpClientWithStatusToException(diConstructor));
    }

    static /* synthetic */ BeaconTrackerAdQualityViolationUtils lambda$createRegistry$5(DiConstructor diConstructor) {
        return new BeaconTrackerAdQualityViolationUtils((AdQualityViolationReporter) diConstructor.get(AdQualityViolationReporter.class), (ApiParams) diConstructor.get(ApiParams.class));
    }

    /* access modifiers changed from: private */
    public static ConnectionStatusWatcher createConnectionStatusWatcher(DiConstructor diConstructor) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new PieConnectionStatusWatcher((ConnectivityManager) diConstructor.get("network", ConnectivityManager.class));
        }
        return new BaseConnectionStatusWatcher((Application) diConstructor.get(Application.class));
    }

    private static void registerSecurityPolicies(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory("networkSecurityPolicy", Optional.class, $$Lambda$DiNetworkLayer$gQ7xgorwAYu81UU_1NAuf72YPH4.INSTANCE);
    }

    static /* synthetic */ Optional lambda$registerSecurityPolicies$7(DiConstructor diConstructor) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Optional.m32963of(NetworkSecurityPolicy.getInstance());
        }
        return Optional.empty();
    }

    public static ExecutorService getNetworkingExecutorServiceFrom(DiConstructor diConstructor) {
        return (ExecutorService) diConstructor.get("network", ExecutorService.class);
    }

    public static BeaconTracker getBeaconTrackerFrom(DiConstructor diConstructor) {
        return (BeaconTracker) diConstructor.get("network", BeaconTracker.class);
    }

    public static NetworkStateMonitor getNetworkStateMonitorFrom(DiConstructor diConstructor) {
        return (NetworkStateMonitor) diConstructor.get(NetworkStateMonitor.class);
    }

    public static Optional<NetworkSecurityPolicy> getNetworkSecurityPolicyOptional(DiConstructor diConstructor) {
        return (Optional) diConstructor.get("networkSecurityPolicy", Optional.class);
    }
}
