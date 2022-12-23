package com.smaato.sdk.core.injections;

import android.app.Application;
import com.smaato.sdk.core.api.DiApiLayer;
import com.smaato.sdk.core.browser.DiBrowserLayer;
import com.smaato.sdk.core.config.DiConfiguration;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.framework.CoreModuleLoaderInterface;
import com.smaato.sdk.core.framework.ModuleInterface;
import com.smaato.sdk.core.framework.ServiceModuleInterface;
import com.smaato.sdk.core.init.AdPresenterModuleInterfaceUtils;
import com.smaato.sdk.core.init.BaseDiRegistryUtils;
import com.smaato.sdk.core.init.BaseModuleValidationUtils;
import com.smaato.sdk.core.init.ModuleInterfaceUtils;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.openmeasurement.DiOMLayer;
import com.smaato.sdk.core.p378ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p378ad.DiAdLayer;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.p380ub.DiUnifiedBidding;
import com.smaato.sdk.core.rawresourceloader.DiRawResourceLoader;
import com.smaato.sdk.core.repository.DiAdRepository;
import com.smaato.sdk.core.resourceloader.DiResourceLoaderLayer;
import com.smaato.sdk.core.util.memory.DiLeakProtection;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.webview.DiWebViewLayer;
import java.util.List;
import java.util.ServiceLoader;

public class CoreModuleLoader implements CoreModuleLoaderInterface {
    private Application application;

    private static String getVersion() {
        return "21.8.3";
    }

    static /* synthetic */ AdPresenterNameShaper lambda$getRegistryOfModules$0(AdPresenterNameShaper adPresenterNameShaper, DiConstructor diConstructor) {
        return adPresenterNameShaper;
    }

    public String moduleDiName() {
        return "CoreModuleLoader";
    }

    public String version() {
        return "21.8.3";
    }

    public void setApplication(Application application2) {
        this.application = application2;
    }

    public DiRegistry moduleDiRegistry() {
        ClassLoader classLoader = this.application.getClassLoader();
        List<ModuleInterface> validInitialisedModuleInterfaces = ModuleInterfaceUtils.getValidInitialisedModuleInterfaces(this.application.getClassLoader(), ServiceLoader.load(ModuleInterface.class, classLoader));
        List<T> validModuleInterfaces = BaseModuleValidationUtils.getValidModuleInterfaces(getVersion(), ServiceLoader.load(AdPresenterModuleInterface.class, classLoader));
        List<T> validModuleInterfaces2 = BaseModuleValidationUtils.getValidModuleInterfaces(getVersion(), ServiceLoader.load(ServiceModuleInterface.class, classLoader));
        for (T init : validModuleInterfaces2) {
            init.init(validInitialisedModuleInterfaces);
        }
        DiRegistry registryOfModules = getRegistryOfModules(validInitialisedModuleInterfaces, validModuleInterfaces, validModuleInterfaces2);
        registryOfModules.addFrom(DiAdLayer.createRegistry());
        registryOfModules.addFrom(DiApiLayer.createRegistry());
        registryOfModules.addFrom(DiNetworkLayer.createRegistry());
        registryOfModules.addFrom(DiBrowserLayer.createRegistry());
        registryOfModules.addFrom(DiWebViewLayer.createRegistry());
        registryOfModules.addFrom(DiResourceLoaderLayer.createRegistry());
        registryOfModules.addFrom(DiLeakProtection.createRegistry());
        registryOfModules.addFrom(DiAdRepository.createRegistry());
        registryOfModules.addFrom(DiConfiguration.createRegistry());
        registryOfModules.addFrom(DiOMLayer.createRegistry(this.application));
        registryOfModules.addFrom(DiRawResourceLoader.createRegistry());
        registryOfModules.addFrom(DiUnifiedBidding.createRegistry());
        return registryOfModules;
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return ModuleInterfaceUtils.getExpectedManifestEntriesFromModules(ModuleInterfaceUtils.getValidInitialisedModuleInterfaces(this.application.getClassLoader(), ServiceLoader.load(ModuleInterface.class, this.application.getClassLoader())));
    }

    private static DiRegistry getRegistryOfModules(List<ModuleInterface> list, List<AdPresenterModuleInterface> list2, List<ServiceModuleInterface> list3) {
        AdPresenterNameShaper adPresenterNameShaper = new AdPresenterNameShaper();
        DiRegistry of = DiRegistry.m32956of(new Consumer() {
            public final void accept(Object obj) {
                ((DiRegistry) obj).registerSingletonFactory(AdPresenterNameShaper.class, new ClassFactory() {
                    public final Object get(DiConstructor diConstructor) {
                        return CoreModuleLoader.lambda$getRegistryOfModules$0(AdPresenterNameShaper.this, diConstructor);
                    }
                });
            }
        });
        for (DiRegistry addFrom : ModuleInterfaceUtils.getDiOfModules(list)) {
            of.addFrom(addFrom);
        }
        for (DiRegistry addFrom2 : BaseDiRegistryUtils.getDiOfModules(list3)) {
            of.addFrom(addFrom2);
        }
        for (DiRegistry addFrom3 : AdPresenterModuleInterfaceUtils.getDiOfModules(adPresenterNameShaper, list2)) {
            of.addFrom(addFrom3);
        }
        return of;
    }
}
