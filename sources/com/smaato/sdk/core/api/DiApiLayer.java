package com.smaato.sdk.core.api;

import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p379di.CoreDiNames;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.CurrentTimeProvider;

public final class DiApiLayer {
    private DiApiLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiApiLayer$B4uI3udrLOus0CTPWfs7SfA6UDQ.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$5(DiRegistry diRegistry) {
        diRegistry.registerFactory(ApiConnector.class, $$Lambda$DiApiLayer$6_DQ94JbrYCAzNxqk83n53Eexs.INSTANCE);
        diRegistry.registerFactory(ApiRequestMapper.class, $$Lambda$DiApiLayer$LT4j5UwZu6KIJGy5ASktV7mpLzw.INSTANCE);
        diRegistry.registerFactory(CurrentTimeProvider.class, $$Lambda$DiApiLayer$98_jXx2Vv1yCDGvVg_X2n2P0MI.INSTANCE);
        diRegistry.registerFactory(ExpirationTimestampFactory.class, $$Lambda$DiApiLayer$T0atbfeprVEuuho4dYflmBEs5pw.INSTANCE);
        diRegistry.registerFactory(ApiResponseMapper.class, $$Lambda$DiApiLayer$0jehWPWAm_7nCYN4NIxB_yxP7sc.INSTANCE);
    }

    static /* synthetic */ ApiConnector lambda$createRegistry$0(DiConstructor diConstructor) {
        return new ApiConnector((ApiRequestMapper) diConstructor.get(ApiRequestMapper.class), (ApiResponseMapper) diConstructor.get(ApiResponseMapper.class), CoreLightModuleInterface.getSomaHttpClient(diConstructor));
    }

    static /* synthetic */ ApiRequestMapper lambda$createRegistry$1(DiConstructor diConstructor) {
        return new ApiRequestMapper((String) diConstructor.get(CoreDiNames.SOMA_API_URL, String.class));
    }

    static /* synthetic */ CurrentTimeProvider lambda$createRegistry$2(DiConstructor diConstructor) {
        return new CurrentTimeProvider();
    }

    static /* synthetic */ ExpirationTimestampFactory lambda$createRegistry$3(DiConstructor diConstructor) {
        return new ExpirationTimestampFactory((CurrentTimeProvider) diConstructor.get(CurrentTimeProvider.class));
    }

    static /* synthetic */ ApiResponseMapper lambda$createRegistry$4(DiConstructor diConstructor) {
        return new ApiResponseMapper(DiLogLayer.getLoggerFrom(diConstructor), (ExpirationTimestampFactory) diConstructor.get(ExpirationTimestampFactory.class));
    }
}
