package com.smaato.sdk.core.injections;

import android.app.Application;
import android.content.Context;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.api.ApiParams;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.framework.SimpleModuleInterface;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.kpi.KpiDBHelper;
import com.smaato.sdk.core.lgpd.SomaLgpdDataSource;
import com.smaato.sdk.core.linkhandler.ActivityQueries;
import com.smaato.sdk.core.linkhandler.IntentLauncher;
import com.smaato.sdk.core.linkhandler.LinkHandler;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.interceptors.ApiCallInterceptor;
import com.smaato.sdk.core.network.interceptors.HttpStatusToExceptionInterceptor;
import com.smaato.sdk.core.network.interceptors.LoggingInterceptor;
import com.smaato.sdk.core.network.interceptors.SomaKpiDataInterceptor;
import com.smaato.sdk.core.network.interceptors.UserAgentInterceptor;
import com.smaato.sdk.core.network.simplehttp.SimpleHttpClient;
import com.smaato.sdk.core.p378ad.RequestInfoProvider;
import com.smaato.sdk.core.p379di.CoreDiNames;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;

public class CoreLightModuleInterface implements SimpleModuleInterface {
    public static final String NAME_DEFAULT_HTTP_HANDLER = "default";
    public static final String NAME_HTTP_HANDLER_WITH_STATUS_TO_EXCEPTION = "status_to_exception";
    public static final String NAME_SOMA_HTTP_HANDLER = "soma";

    public String moduleDiName() {
        return "CoreLightInterface";
    }

    public String version() {
        return "21.8.3";
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m32956of($$Lambda$CoreLightModuleInterface$m3o_o1oF5GPI0rRhxWcpn4pIX8.INSTANCE);
    }

    static /* synthetic */ void lambda$moduleDiRegistry$13(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(SimpleHttpClient.class, $$Lambda$CoreLightModuleInterface$JoU7sUZrsrp0LCxPPqGewArQqw.INSTANCE);
        diRegistry.registerSingletonFactory("default", HttpClient.class, $$Lambda$CoreLightModuleInterface$4N4fEZkHgnTZbNgBmzD7kOFJ5s.INSTANCE);
        diRegistry.registerSingletonFactory(NAME_HTTP_HANDLER_WITH_STATUS_TO_EXCEPTION, HttpClient.class, $$Lambda$CoreLightModuleInterface$E6u9tSwlIREbKQZPjxEeQN9VAO0.INSTANCE);
        diRegistry.registerSingletonFactory(NAME_SOMA_HTTP_HANDLER, HttpClient.class, $$Lambda$CoreLightModuleInterface$BLFp2dmm50pUKoJbozMuka_0O0s.INSTANCE);
        diRegistry.registerSingletonFactory(IntentLauncher.class, $$Lambda$CoreLightModuleInterface$lUadE8MRcEeGZm4paPT23ECHL_M.INSTANCE);
        diRegistry.registerSingletonFactory(ActivityQueries.class, $$Lambda$CoreLightModuleInterface$XvUDoqij6k2mYXDUq1l_F4iSQU.INSTANCE);
        diRegistry.registerSingletonFactory(ApiParams.class, $$Lambda$CoreLightModuleInterface$2Lb9t0X6L26fyFaPeDJ2F6bKoMk.INSTANCE);
        diRegistry.registerSingletonFactory(LinkHandler.class, $$Lambda$CoreLightModuleInterface$hYTUQeS3ACHU_9tLlXCIItbAHgA.INSTANCE);
        diRegistry.registerSingletonFactory(ApiCallInterceptor.class, $$Lambda$CoreLightModuleInterface$ZzN8QgTlFyPiMFY6AP5RTMngcI.INSTANCE);
        diRegistry.registerSingletonFactory(SomaKpiDataInterceptor.class, $$Lambda$CoreLightModuleInterface$DZJ2hNd22DgerIXxImatjx953o.INSTANCE);
        diRegistry.registerSingletonFactory(HttpStatusToExceptionInterceptor.class, $$Lambda$CoreLightModuleInterface$jsiM0M1vGL2tNWGUN0ubG8xAkc.INSTANCE);
        diRegistry.registerSingletonFactory(UserAgentInterceptor.class, $$Lambda$CoreLightModuleInterface$ZceBMNnYGeZILwgWIxH6Sw8QZI.INSTANCE);
        diRegistry.registerSingletonFactory(LoggingInterceptor.class, $$Lambda$CoreLightModuleInterface$nt6HdXMASj04ZEbTuFyg2Ji1jI.INSTANCE);
    }

    static /* synthetic */ SimpleHttpClient lambda$moduleDiRegistry$0(DiConstructor diConstructor) {
        return new SimpleHttpClient((HttpClient) diConstructor.get("default", HttpClient.class), (Logger) diConstructor.get(Logger.class));
    }

    static /* synthetic */ IntentLauncher lambda$moduleDiRegistry$4(DiConstructor diConstructor) {
        return new IntentLauncher((Application) diConstructor.get(Application.class));
    }

    static /* synthetic */ ActivityQueries lambda$moduleDiRegistry$5(DiConstructor diConstructor) {
        return new ActivityQueries((Context) diConstructor.get(Application.class));
    }

    static /* synthetic */ ApiParams lambda$moduleDiRegistry$6(DiConstructor diConstructor) {
        return new ApiParams((DataCollector) diConstructor.get(DataCollector.class), (RequestInfoProvider) diConstructor.get(RequestInfoProvider.class));
    }

    static /* synthetic */ LinkHandler lambda$moduleDiRegistry$7(DiConstructor diConstructor) {
        return new LinkHandler((Application) diConstructor.get(Application.class), (HttpClient) diConstructor.get("default", HttpClient.class), (SimpleHttpClient) diConstructor.get(SimpleHttpClient.class), (IntentLauncher) diConstructor.get(IntentLauncher.class), (ActivityQueries) diConstructor.get(ActivityQueries.class));
    }

    static /* synthetic */ ApiCallInterceptor lambda$moduleDiRegistry$8(DiConstructor diConstructor) {
        return new ApiCallInterceptor((SomaGdprDataSource) diConstructor.get(SomaGdprDataSource.class), (SomaLgpdDataSource) diConstructor.get(SomaLgpdDataSource.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class), (RequestInfoProvider) diConstructor.get(RequestInfoProvider.class), (DataCollector) diConstructor.get(DataCollector.class), ((Boolean) diConstructor.get(CoreDiNames.NAME_HTTPS_ONLY, Boolean.class)).booleanValue(), (Logger) diConstructor.get(Logger.class), (ApiParams) diConstructor.get(ApiParams.class));
    }

    static /* synthetic */ SomaKpiDataInterceptor lambda$moduleDiRegistry$9(DiConstructor diConstructor) {
        return new SomaKpiDataInterceptor((KpiDBHelper) diConstructor.get(KpiDBHelper.class));
    }

    static /* synthetic */ HttpStatusToExceptionInterceptor lambda$moduleDiRegistry$10(DiConstructor diConstructor) {
        return new HttpStatusToExceptionInterceptor();
    }

    static /* synthetic */ UserAgentInterceptor lambda$moduleDiRegistry$11(DiConstructor diConstructor) {
        return new UserAgentInterceptor((Application) diConstructor.get(Application.class));
    }

    static /* synthetic */ LoggingInterceptor lambda$moduleDiRegistry$12(DiConstructor diConstructor) {
        return new LoggingInterceptor((Boolean) diConstructor.get(CoreDiNames.NAME_IS_LOGGING_ENABLED, Boolean.class), (Logger) diConstructor.get(Logger.class));
    }

    public static HttpClient getSomaHttpClient(DiConstructor diConstructor) {
        return (HttpClient) diConstructor.get(NAME_SOMA_HTTP_HANDLER, HttpClient.class);
    }

    public static HttpClient getHttpClientWithStatusToException(DiConstructor diConstructor) {
        return (HttpClient) diConstructor.get(NAME_HTTP_HANDLER_WITH_STATUS_TO_EXCEPTION, HttpClient.class);
    }

    public static HttpClient getDefaultHttpClient(DiConstructor diConstructor) {
        return (HttpClient) diConstructor.get("default", HttpClient.class);
    }
}
