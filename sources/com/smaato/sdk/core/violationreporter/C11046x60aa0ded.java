package com.smaato.sdk.core.violationreporter;

import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core_light.BuildConfig;

/* renamed from: com.smaato.sdk.core.violationreporter.-$$Lambda$DiAdQualityViolationReporterLayer$KLyzn5JQIDlbYxHLCXUWvIjhZXI */
/* compiled from: lambda */
public final /* synthetic */ class C11046x60aa0ded implements ClassFactory {
    public static final /* synthetic */ C11046x60aa0ded INSTANCE = new C11046x60aa0ded();

    private /* synthetic */ C11046x60aa0ded() {
    }

    public final Object get(DiConstructor diConstructor) {
        return BuildConfig.SOMA_VIOLATIONS_AGGREGATOR_URL;
    }
}
