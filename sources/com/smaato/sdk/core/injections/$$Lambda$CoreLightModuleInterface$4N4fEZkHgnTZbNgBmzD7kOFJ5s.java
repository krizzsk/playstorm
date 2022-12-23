package com.smaato.sdk.core.injections;

import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.interceptors.LoggingInterceptor;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;

/* renamed from: com.smaato.sdk.core.injections.-$$Lambda$CoreLightModuleInterface$4N4fEZkHgn-TZbNgBmzD7kOFJ5s  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CoreLightModuleInterface$4N4fEZkHgnTZbNgBmzD7kOFJ5s implements ClassFactory {
    public static final /* synthetic */ $$Lambda$CoreLightModuleInterface$4N4fEZkHgnTZbNgBmzD7kOFJ5s INSTANCE = new $$Lambda$CoreLightModuleInterface$4N4fEZkHgnTZbNgBmzD7kOFJ5s();

    private /* synthetic */ $$Lambda$CoreLightModuleInterface$4N4fEZkHgnTZbNgBmzD7kOFJ5s() {
    }

    public final Object get(DiConstructor diConstructor) {
        return HttpClient.builder().addInterceptor((Interceptor) diConstructor.get(LoggingInterceptor.class)).build();
    }
}
