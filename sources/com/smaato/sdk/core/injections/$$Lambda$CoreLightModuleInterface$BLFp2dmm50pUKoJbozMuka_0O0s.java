package com.smaato.sdk.core.injections;

import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.interceptors.ApiCallInterceptor;
import com.smaato.sdk.core.network.interceptors.HttpStatusToExceptionInterceptor;
import com.smaato.sdk.core.network.interceptors.LoggingInterceptor;
import com.smaato.sdk.core.network.interceptors.SomaKpiDataInterceptor;
import com.smaato.sdk.core.network.interceptors.UserAgentInterceptor;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;

/* renamed from: com.smaato.sdk.core.injections.-$$Lambda$CoreLightModuleInterface$BLFp2dmm50pUKoJbozMuka_0O0s  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CoreLightModuleInterface$BLFp2dmm50pUKoJbozMuka_0O0s implements ClassFactory {
    public static final /* synthetic */ $$Lambda$CoreLightModuleInterface$BLFp2dmm50pUKoJbozMuka_0O0s INSTANCE = new $$Lambda$CoreLightModuleInterface$BLFp2dmm50pUKoJbozMuka_0O0s();

    private /* synthetic */ $$Lambda$CoreLightModuleInterface$BLFp2dmm50pUKoJbozMuka_0O0s() {
    }

    public final Object get(DiConstructor diConstructor) {
        return HttpClient.builder().addInterceptor((Interceptor) diConstructor.get(UserAgentInterceptor.class)).addInterceptor((Interceptor) diConstructor.get(ApiCallInterceptor.class)).addInterceptor((Interceptor) diConstructor.get(SomaKpiDataInterceptor.class)).addInterceptor((Interceptor) diConstructor.get(LoggingInterceptor.class)).addInterceptor((Interceptor) diConstructor.get(HttpStatusToExceptionInterceptor.class)).build();
    }
}
