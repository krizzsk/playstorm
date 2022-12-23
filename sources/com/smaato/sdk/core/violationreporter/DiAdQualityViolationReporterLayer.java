package com.smaato.sdk.core.violationreporter;

import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.simplehttp.SimpleHttpClient;
import com.smaato.sdk.core.p379di.CoreDiNames;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.HeaderUtils;
import java.util.concurrent.ExecutorService;

public final class DiAdQualityViolationReporterLayer {
    private DiAdQualityViolationReporterLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of(C11044x47be8b.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$4(DiRegistry diRegistry) {
        diRegistry.registerFactory(CoreDiNames.SOMA_VIOLATIONS_AGGREGATOR_URL, String.class, C11046x60aa0ded.INSTANCE);
        diRegistry.registerSingletonFactory("ad_quality_violation_reporter", ExecutorService.class, C11047x9fce309d.INSTANCE);
        diRegistry.registerFactory(AdQualityViolationReportMapper.class, C11048x32e14d2d.INSTANCE);
        diRegistry.registerSingletonFactory(AdQualityViolationReporter.class, C11045xc5e38870.INSTANCE);
    }

    static /* synthetic */ AdQualityViolationReportMapper lambda$createRegistry$2(DiConstructor diConstructor) {
        return new AdQualityViolationReportMapper(DiLogLayer.getLoggerFrom(diConstructor), (HeaderUtils) diConstructor.get(HeaderUtils.class));
    }

    static /* synthetic */ AdQualityViolationReporter lambda$createRegistry$3(DiConstructor diConstructor) {
        return new AdQualityViolationReporter(DiLogLayer.getLoggerFrom(diConstructor), (SimpleHttpClient) diConstructor.get(SimpleHttpClient.class), (AdQualityViolationReportMapper) diConstructor.get(AdQualityViolationReportMapper.class), (String) diConstructor.get(CoreDiNames.SOMA_VIOLATIONS_AGGREGATOR_URL, String.class));
    }
}
