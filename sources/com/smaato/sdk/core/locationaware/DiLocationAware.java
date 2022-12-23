package com.smaato.sdk.core.locationaware;

import android.app.Application;
import android.content.Context;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p379di.CoreDiNames;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;

public final class DiLocationAware {
    private DiLocationAware() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiLocationAware$WICb7otvU7XfDzRhPmzm5U9v4C4.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$5(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(SimInfo.class, $$Lambda$DiLocationAware$IffXbgPn67RKcfAApfrzdQy8J8.INSTANCE);
        diRegistry.registerSingletonFactory(TzSettings.class, $$Lambda$DiLocationAware$kyYZXOWg6pi9VHZFCLYagMxRjA.INSTANCE);
        diRegistry.registerSingletonFactory(DnsLookup.class, $$Lambda$DiLocationAware$TIfXjYOXw1sDRklBpRsstqPP6Q.INSTANCE);
        diRegistry.registerSingletonFactory(CoreDiNames.LOCATION_AWARE_GDPR, LocationAware.class, $$Lambda$DiLocationAware$ZfwXp3obO7onai25r1j0SeFrkFg.INSTANCE);
        diRegistry.registerSingletonFactory(CoreDiNames.LOCATION_AWARE_LGPD, LocationAware.class, $$Lambda$DiLocationAware$XAcY4B4wKd_cXxCPQsMlHJzJJJ0.INSTANCE);
    }

    static /* synthetic */ SimInfo lambda$createRegistry$0(DiConstructor diConstructor) {
        return new SimInfoImpl((Context) diConstructor.get(Application.class));
    }

    static /* synthetic */ TzSettings lambda$createRegistry$1(DiConstructor diConstructor) {
        return new TzSettingsImpl((Context) diConstructor.get(Application.class));
    }

    static /* synthetic */ DnsLookup lambda$createRegistry$2(DiConstructor diConstructor) {
        return new DnsLookupImpl((Logger) diConstructor.get(Logger.class));
    }

    static /* synthetic */ LocationAware lambda$createRegistry$3(DiConstructor diConstructor) {
        return new LocationAwareGdprImpl((Context) diConstructor.get(Application.class), (SimInfo) diConstructor.get(SimInfo.class), (TzSettings) diConstructor.get(TzSettings.class), (DnsLookup) diConstructor.get(DnsLookup.class), (Logger) diConstructor.get(Logger.class));
    }

    static /* synthetic */ LocationAware lambda$createRegistry$4(DiConstructor diConstructor) {
        return new LocationAwareLgpdImpl((Context) diConstructor.get(Application.class), (SimInfo) diConstructor.get(SimInfo.class), (TzSettings) diConstructor.get(TzSettings.class), (DnsLookup) diConstructor.get(DnsLookup.class), (Logger) diConstructor.get(Logger.class));
    }
}
