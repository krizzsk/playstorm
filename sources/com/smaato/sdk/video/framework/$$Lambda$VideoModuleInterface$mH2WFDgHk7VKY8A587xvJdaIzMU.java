package com.smaato.sdk.video.framework;

import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.config.WrapperResolverConfig;

/* renamed from: com.smaato.sdk.video.framework.-$$Lambda$VideoModuleInterface$mH2WFDgHk7VKY8A587xvJdaIzMU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$VideoModuleInterface$mH2WFDgHk7VKY8A587xvJdaIzMU implements Consumer {
    public static final /* synthetic */ $$Lambda$VideoModuleInterface$mH2WFDgHk7VKY8A587xvJdaIzMU INSTANCE = new $$Lambda$VideoModuleInterface$mH2WFDgHk7VKY8A587xvJdaIzMU();

    private /* synthetic */ $$Lambda$VideoModuleInterface$mH2WFDgHk7VKY8A587xvJdaIzMU() {
    }

    public final void accept(Object obj) {
        ((DiRegistry) obj).registerFactory("WRAPPER_RESOLVER_CONFIG", WrapperResolverConfig.class, $$Lambda$VideoModuleInterface$LpzctaEgId7G3JBCjco0DAISwXw.INSTANCE);
    }
}
