package com.smaato.sdk.rewarded.framework;

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
import com.smaato.sdk.core.p378ad.RewardedAdPresenter;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p382fi.NullableFunction;
import com.smaato.sdk.core.util.p382fi.Predicate;
import java.util.List;
import java.util.ServiceLoader;

public class RewardedAdModuleInterface implements ModuleInterface {
    private static final String MISSING_VIDEO_SUB_MODULES_MESSAGE = String.format("In order to show ads of %1$s format at least one of %1$s modules should be added to your project configuration.", new Object[]{AdFormat.VIDEO});
    public static final String MODULE_DI_NAME = "RewardedAdModuleInterface";
    private boolean atLeastOneRewardedModuleIsPresent;
    private volatile List<AdPresenterModuleInterface> foundInterfaces;

    public String moduleDiName() {
        return MODULE_DI_NAME;
    }

    public String version() {
        return "21.8.3";
    }

    public void init(ClassLoader classLoader) {
        init((Iterable<AdPresenterModuleInterface>) ServiceLoader.load(AdPresenterModuleInterface.class, classLoader));
    }

    public boolean isInitialised() {
        return this.atLeastOneRewardedModuleIsPresent;
    }

    public Class<? extends AdPresenter> getSupportedAdPresenterInterface() {
        return RewardedAdPresenter.class;
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
    synchronized void init(java.lang.Iterable<com.smaato.sdk.core.framework.AdPresenterModuleInterface> r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.List<com.smaato.sdk.core.framework.AdPresenterModuleInterface> r0 = r4.foundInterfaces     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x003e
            monitor-enter(r4)     // Catch:{ all -> 0x0040 }
            java.util.List<com.smaato.sdk.core.framework.AdPresenterModuleInterface> r0 = r4.foundInterfaces     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0039
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x003b }
            r0.<init>()     // Catch:{ all -> 0x003b }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x003b }
        L_0x0013:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x003b }
            com.smaato.sdk.core.framework.AdPresenterModuleInterface r1 = (com.smaato.sdk.core.framework.AdPresenterModuleInterface) r1     // Catch:{ all -> 0x003b }
            java.lang.String r2 = r1.version()     // Catch:{ all -> 0x003b }
            java.lang.String r3 = "21.8.3"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0013
            r0.add(r1)     // Catch:{ all -> 0x003b }
            goto L_0x0013
        L_0x002f:
            r4.foundInterfaces = r0     // Catch:{ all -> 0x003b }
            com.smaato.sdk.core.ad.AdFormat r5 = com.smaato.sdk.core.p378ad.AdFormat.VIDEO     // Catch:{ all -> 0x003b }
            boolean r5 = r4.isFormatSupportedByFoundInterfaces(r5)     // Catch:{ all -> 0x003b }
            r4.atLeastOneRewardedModuleIsPresent = r5     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            goto L_0x003e
        L_0x003b:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            throw r5     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r4)
            return
        L_0x0040:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.rewarded.framework.RewardedAdModuleInterface.init(java.lang.Iterable):void");
    }

    private List<AdPresenterModuleInterface> getFoundInterfaces() {
        List<AdPresenterModuleInterface> list = this.foundInterfaces;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("init() method should have been called first for this module: smaato-sdk-rewarded-ads");
    }

    public boolean isFormatSupported(AdFormat adFormat, Logger logger) {
        if (adFormat != AdFormat.VIDEO) {
            return isFormatSupportedByFoundInterfaces(adFormat);
        }
        if (!this.atLeastOneRewardedModuleIsPresent) {
            logger.error(LogDomain.FRAMEWORK, MISSING_VIDEO_SUB_MODULES_MESSAGE, new Object[0]);
        }
        return this.atLeastOneRewardedModuleIsPresent;
    }

    private boolean isFormatSupportedByFoundInterfaces(AdFormat adFormat) {
        return Lists.any(getFoundInterfaces(), new Predicate() {
            public final boolean test(Object obj) {
                return ((AdPresenterModuleInterface) obj).isFormatSupported(AdFormat.this, RewardedAdPresenter.class);
            }
        });
    }

    public ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return RewardedAdModuleInterface.this.lambda$getAdLoaderPluginFactory$2$RewardedAdModuleInterface(diConstructor);
            }
        };
    }

    public /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$2$RewardedAdModuleInterface(DiConstructor diConstructor) {
        return new RewardedAdLoaderPlugin(getFoundInterfaces(), new NullableFunction() {
            public final Object apply(Object obj) {
                return RewardedAdModuleInterface.lambda$getAdLoaderPluginFactory$1(DiConstructor.this, (AdPresenterModuleInterface) obj);
            }
        }, (AdRequestExtrasProvider) diConstructor.get(moduleDiName(), AdRequestExtrasProvider.class), MISSING_VIDEO_SUB_MODULES_MESSAGE);
    }

    static /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$1(DiConstructor diConstructor, AdPresenterModuleInterface adPresenterModuleInterface) {
        if (adPresenterModuleInterface == null) {
            return null;
        }
        return (AdLoaderPlugin) DiAdLayer.tryGetOrNull(diConstructor, adPresenterModuleInterface.moduleDiName(), AdLoaderPlugin.class);
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m32956of($$Lambda$RewardedAdModuleInterface$_t0iIcZSYDLiTixGbH0BFbVI_cQ.INSTANCE);
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return new ExpectedManifestEntries(RewardedExpectedManifestEntries.PERMISSIONS_MANDATORY, RewardedExpectedManifestEntries.ACTIVITIES);
    }

    public String toString() {
        return "RewardedAdModuleInterface{supportedFormat: " + AdFormat.VIDEO + "}";
    }
}
