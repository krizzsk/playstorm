package com.smaato.sdk.core.config;

import com.smaato.sdk.core.config.DiConfiguration;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.core.config.-$$Lambda$DiConfiguration$3w9_n0wBCrMQwp3pt9ZpX204uKQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DiConfiguration$3w9_n0wBCrMQwp3pt9ZpX204uKQ implements Consumer {
    public static final /* synthetic */ $$Lambda$DiConfiguration$3w9_n0wBCrMQwp3pt9ZpX204uKQ INSTANCE = new $$Lambda$DiConfiguration$3w9_n0wBCrMQwp3pt9ZpX204uKQ();

    private /* synthetic */ $$Lambda$DiConfiguration$3w9_n0wBCrMQwp3pt9ZpX204uKQ() {
    }

    public final void accept(Object obj) {
        ((DiRegistry) obj).registerFactory(DiConfiguration.Provider.class, $$Lambda$DiConfiguration$YPSQHnRzNlzsp4zSma0R_5gZD0.INSTANCE);
    }
}
