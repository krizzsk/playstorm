package com.smaato.sdk.core.injections;

import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.interceptors.HttpStatusToExceptionInterceptor;
import com.smaato.sdk.core.network.interceptors.LoggingInterceptor;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;

/* renamed from: com.smaato.sdk.core.injections.-$$Lambda$CoreLightModuleInterface$E6u9tSwlIREbKQZPjxEeQN9VAO0  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CoreLightModuleInterface$E6u9tSwlIREbKQZPjxEeQN9VAO0 implements ClassFactory {
    public static final /* synthetic */ $$Lambda$CoreLightModuleInterface$E6u9tSwlIREbKQZPjxEeQN9VAO0 INSTANCE = new $$Lambda$CoreLightModuleInterface$E6u9tSwlIREbKQZPjxEeQN9VAO0();

    private /* synthetic */ $$Lambda$CoreLightModuleInterface$E6u9tSwlIREbKQZPjxEeQN9VAO0() {
    }

    public final Object get(DiConstructor diConstructor) {
        return HttpClient.builder().addInterceptor((Interceptor) diConstructor.get(LoggingInterceptor.class)).addInterceptor((Interceptor) diConstructor.get(HttpStatusToExceptionInterceptor.class)).build();
    }
}
