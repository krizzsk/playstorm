package com.smaato.sdk.core.init;

import com.smaato.sdk.core.framework.BaseModuleInterface;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.collections.Lists;
import java.util.List;

public final class BaseDiRegistryUtils {
    private BaseDiRegistryUtils() {
    }

    public static List<DiRegistry> getDiOfModules(List<? extends BaseModuleInterface> list) {
        return Lists.mapLazy(list, $$Lambda$ahZHZ4m1SRovRRyvVoYI0_S0.INSTANCE);
    }
}
