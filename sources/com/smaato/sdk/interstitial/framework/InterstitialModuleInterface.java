package com.smaato.sdk.interstitial.framework;

import com.smaato.sdk.core.api.AdRequestExtrasProvider;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.framework.ModuleInterface;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoaderPlugin;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.DiAdLayer;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.collections.Sets;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.core.util.p382fi.FunctionUtils;
import com.smaato.sdk.core.util.p382fi.NullableFunction;
import com.smaato.sdk.core.util.p382fi.Predicate;
import com.smaato.sdk.interstitial.DiInterstitial;
import com.smaato.sdk.interstitial.InterstitialAdActivity;
import com.smaato.sdk.interstitial.InterstitialServerAdFormatResolvingFunction;
import com.smaato.sdk.interstitial.p385ad.InterstitialAdLoaderPlugin;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;

public class InterstitialModuleInterface implements ModuleInterface {
    private static final List<AdFormat> POSSIBLE_INTERSTITIAL_MODULE_AD_FORMATS = Lists.toImmutableListOf(AdFormat.VIDEO, AdFormat.STATIC_IMAGE, AdFormat.RICH_MEDIA, AdFormat.CSM);
    private boolean atLeastOneInterstitialAdPresenterModuleIsPresent;
    private volatile List<AdPresenterModuleInterface> foundInterfaces;
    private String missingInterstitialAdPresenterModulesMessage;

    public String moduleDiName() {
        return "InterstitialModuleInterface";
    }

    public String version() {
        return "21.8.3";
    }

    public synchronized void init(ClassLoader classLoader) {
        init((Iterable<AdPresenterModuleInterface>) ServiceLoader.load(AdPresenterModuleInterface.class, classLoader));
    }

    public boolean isInitialised() {
        return this.atLeastOneInterstitialAdPresenterModuleIsPresent;
    }

    public Class<? extends AdPresenter> getSupportedAdPresenterInterface() {
        return InterstitialAdPresenter.class;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    synchronized void init(java.lang.Iterable<com.smaato.sdk.core.framework.AdPresenterModuleInterface> r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.smaato.sdk.core.framework.AdPresenterModuleInterface> r0 = r1.foundInterfaces     // Catch:{ all -> 0x001c }
            if (r0 != 0) goto L_0x001a
            monitor-enter(r1)     // Catch:{ all -> 0x001c }
            java.util.List<com.smaato.sdk.core.framework.AdPresenterModuleInterface> r0 = r1.foundInterfaces     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "21.8.3"
            java.util.List r2 = com.smaato.sdk.core.init.AdPresenterModuleInterfaceUtils.getValidModuleInterfaces(r0, r2)     // Catch:{ all -> 0x0017 }
            r1.foundInterfaces = r2     // Catch:{ all -> 0x0017 }
            r1.verifyInterstitialModulesPresence()     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r2     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r1)
            return
        L_0x001c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.interstitial.framework.InterstitialModuleInterface.init(java.lang.Iterable):void");
    }

    private void verifyInterstitialModulesPresence() {
        Map<K, V> mapWithOrder = Maps.toMapWithOrder(POSSIBLE_INTERSTITIAL_MODULE_AD_FORMATS, FunctionUtils.identity(), new Function() {
            public final Object apply(Object obj) {
                return Boolean.valueOf(InterstitialModuleInterface.this.isFormatSupportedByAdPresenterModuleInterfaces((AdFormat) obj));
            }
        });
        boolean atLeastOneInterstitialAdPresenterModuleIsPresent2 = atLeastOneInterstitialAdPresenterModuleIsPresent(mapWithOrder);
        this.atLeastOneInterstitialAdPresenterModuleIsPresent = atLeastOneInterstitialAdPresenterModuleIsPresent2;
        if (!atLeastOneInterstitialAdPresenterModuleIsPresent2) {
            buildMissingInterstitialModulesMessage(mapWithOrder);
        }
    }

    private boolean atLeastOneInterstitialAdPresenterModuleIsPresent(Map<AdFormat, Boolean> map) {
        return Lists.any(map.values(), C11132xed67037d.INSTANCE);
    }

    private void buildMissingInterstitialModulesMessage(Map<AdFormat, Boolean> map) {
        this.missingInterstitialAdPresenterModulesMessage = String.format("In order to show ads of %s format at least one of %s modules should be added to your project configuration. Missing module(s): %s", new Object[]{AdFormat.INTERSTITIAL, POSSIBLE_INTERSTITIAL_MODULE_AD_FORMATS, Maps.filteredKeys(map, C11131xb57e6a6e.INSTANCE)});
    }

    static /* synthetic */ boolean lambda$buildMissingInterstitialModulesMessage$0(Boolean bool) {
        return !bool.booleanValue();
    }

    private List<AdPresenterModuleInterface> foundInterfaces() {
        List<AdPresenterModuleInterface> list = this.foundInterfaces;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("init() method should have been called first for this module: smaato-sdk-interstitial");
    }

    public boolean isFormatSupported(AdFormat adFormat, Logger logger) {
        if (adFormat != AdFormat.INTERSTITIAL) {
            return isFormatSupportedByAdPresenterModuleInterfaces(adFormat);
        }
        if (!this.atLeastOneInterstitialAdPresenterModuleIsPresent) {
            logger.error(LogDomain.FRAMEWORK, this.missingInterstitialAdPresenterModulesMessage, new Object[0]);
        }
        return this.atLeastOneInterstitialAdPresenterModuleIsPresent;
    }

    /* access modifiers changed from: private */
    public boolean isFormatSupportedByAdPresenterModuleInterfaces(AdFormat adFormat) {
        return Lists.any(foundInterfaces(), new Predicate() {
            public final boolean test(Object obj) {
                return ((AdPresenterModuleInterface) obj).isFormatSupported(AdFormat.this, InterstitialAdPresenter.class);
            }
        });
    }

    public ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return InterstitialModuleInterface.this.lambda$getAdLoaderPluginFactory$3$InterstitialModuleInterface(diConstructor);
            }
        };
    }

    public /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$3$InterstitialModuleInterface(DiConstructor diConstructor) {
        List<AdPresenterModuleInterface> foundInterfaces2 = foundInterfaces();
        C11133x7ab963eb r2 = new NullableFunction() {
            public final Object apply(Object obj) {
                return InterstitialModuleInterface.lambda$getAdLoaderPluginFactory$2(DiConstructor.this, (AdPresenterModuleInterface) obj);
            }
        };
        List<AdFormat> list = POSSIBLE_INTERSTITIAL_MODULE_AD_FORMATS;
        return new InterstitialAdLoaderPlugin(foundInterfaces2, r2, new InterstitialServerAdFormatResolvingFunction(list), (AdRequestExtrasProvider) diConstructor.get(moduleDiName(), AdRequestExtrasProvider.class), list, this.missingInterstitialAdPresenterModulesMessage);
    }

    static /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$2(DiConstructor diConstructor, AdPresenterModuleInterface adPresenterModuleInterface) {
        return (AdLoaderPlugin) DiAdLayer.tryGetOrNull(diConstructor, adPresenterModuleInterface.moduleDiName(), AdLoaderPlugin.class);
    }

    public DiRegistry moduleDiRegistry() {
        return DiInterstitial.createRegistry(moduleDiName());
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return new ExpectedManifestEntries(Collections.emptySet(), Sets.toImmutableSetOf(InterstitialAdActivity.class));
    }

    public String toString() {
        return "InterstitialModuleInterface{supportedFormat: " + AdFormat.INTERSTITIAL + "}";
    }
}
