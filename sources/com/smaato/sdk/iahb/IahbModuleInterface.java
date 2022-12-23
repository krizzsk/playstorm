package com.smaato.sdk.iahb;

import com.smaato.sdk.core.api.ExpirationTimestampFactory;
import com.smaato.sdk.core.framework.SimpleModuleInterface;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.p380ub.UbCache;

public class IahbModuleInterface implements SimpleModuleInterface {
    public String moduleDiName() {
        return "IahbModuleInterface";
    }

    public String version() {
        return "21.8.3";
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m32956of($$Lambda$IahbModuleInterface$c2Iq_fGlgfHMjxCYW7bOH1G24s.INSTANCE);
    }

    static /* synthetic */ void lambda$moduleDiRegistry$2(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(IahbJsonAdapter.class, $$Lambda$IahbModuleInterface$7mIpl_1c7YB4pj672C9hqlmR5qw.INSTANCE);
        diRegistry.registerSingletonFactory(IahbInteractor.class, $$Lambda$IahbModuleInterface$NK7Tq845qFywQGVecJ3NNzwooVI.INSTANCE);
    }

    static /* synthetic */ IahbJsonAdapter lambda$moduleDiRegistry$0(DiConstructor diConstructor) {
        return new IahbJsonAdapter((Logger) diConstructor.get(Logger.class));
    }

    static /* synthetic */ IahbInteractor lambda$moduleDiRegistry$1(DiConstructor diConstructor) {
        return new IahbInteractor((UbCache) diConstructor.get(UbCache.class), (IahbJsonAdapter) diConstructor.get(IahbJsonAdapter.class), (ExpirationTimestampFactory) diConstructor.get(ExpirationTimestampFactory.class), (Logger) diConstructor.get(Logger.class));
    }
}
