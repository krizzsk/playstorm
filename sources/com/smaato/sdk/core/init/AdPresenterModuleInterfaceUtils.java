package com.smaato.sdk.core.init;

import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.p378ad.AdLoaderPlugin;
import com.smaato.sdk.core.p378ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.NullableFunction;
import java.util.ArrayList;
import java.util.List;

public final class AdPresenterModuleInterfaceUtils {
    private AdPresenterModuleInterfaceUtils() {
    }

    public static List<AdPresenterModuleInterface> getValidModuleInterfaces(String str, Iterable<AdPresenterModuleInterface> iterable) {
        ArrayList arrayList = new ArrayList();
        for (AdPresenterModuleInterface next : iterable) {
            if (next.version().equals(str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static List<DiRegistry> getDiOfModules(AdPresenterNameShaper adPresenterNameShaper, List<AdPresenterModuleInterface> list) {
        Objects.requireNonNull(list);
        return Lists.mapLazy(list, new NullableFunction() {
            public final Object apply(Object obj) {
                return AdPresenterModuleInterfaceUtils.buildModuleRegistry(AdPresenterNameShaper.this, (AdPresenterModuleInterface) Objects.requireNonNull((AdPresenterModuleInterface) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    public static DiRegistry buildModuleRegistry(AdPresenterNameShaper adPresenterNameShaper, AdPresenterModuleInterface adPresenterModuleInterface) {
        Objects.requireNonNull(adPresenterModuleInterface);
        return DiRegistry.m32956of(new Consumer() {
            public final void accept(Object obj) {
                ((DiRegistry) obj).registerFactory(AdPresenterModuleInterface.this.moduleDiName(), AdLoaderPlugin.class, (ClassFactory) Objects.requireNonNull(AdPresenterModuleInterface.this.getAdLoaderPluginFactory()));
            }
        }).addFrom(adPresenterModuleInterface.moduleDiRegistry()).addFrom(adPresenterModuleInterface.moduleAdPresenterDiRegistry(adPresenterNameShaper));
    }
}
