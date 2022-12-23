package com.smaato.sdk.video.framework;

import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.framework.VisibilityPrivateConfig;
import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.network.UrlCreator;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoaderPlugin;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p378ad.DiAdLayer;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p378ad.RewardedAdPresenter;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.CoreDiNames;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.resourceloader.DiResourceLoaderLayer;
import com.smaato.sdk.core.resourceloader.PersistingStrategy;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.resourceloader.ResourceTransformer;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.NullableFunction;
import com.smaato.sdk.core.webview.BaseWebChromeClient;
import com.smaato.sdk.core.webview.BaseWebViewClient;
import com.smaato.sdk.video.p389ad.DiVideoAdLayer;
import com.smaato.sdk.video.p389ad.MediaFileResourceLoaderListenerCreator;
import com.smaato.sdk.video.p389ad.VastErrorTrackerCreator;
import com.smaato.sdk.video.p389ad.VideoAdLoaderPlugin;
import com.smaato.sdk.video.p389ad.VideoStateMachineFactory;
import com.smaato.sdk.video.resourceloader.VideoNetworkResourceStreamPreparationStrategy;
import com.smaato.sdk.video.resourceloader.VideoPersistingStrategy;
import com.smaato.sdk.video.resourceloader.VideoResourceTransformer;
import com.smaato.sdk.video.vast.browser.VastWebComponentSecurityPolicy;
import com.smaato.sdk.video.vast.build.InLineAdContainerPicker;
import com.smaato.sdk.video.vast.build.InLineChecker;
import com.smaato.sdk.video.vast.build.VastCompanionPicker;
import com.smaato.sdk.video.vast.build.VastCompanionScenarioMapper;
import com.smaato.sdk.video.vast.build.VastCompanionScenarioMerger;
import com.smaato.sdk.video.vast.build.VastIconScenarioMapper;
import com.smaato.sdk.video.vast.build.VastIconScenarioPicker;
import com.smaato.sdk.video.vast.build.VastLinearMediaFilePicker;
import com.smaato.sdk.video.vast.build.VastMediaFileScenarioMapper;
import com.smaato.sdk.video.vast.build.VastMediaFileScenarioMerger;
import com.smaato.sdk.video.vast.build.VastMediaFileScenarioWrapperMapper;
import com.smaato.sdk.video.vast.build.VastScenarioCreativeDataMapper;
import com.smaato.sdk.video.vast.build.VastScenarioMapper;
import com.smaato.sdk.video.vast.build.VastScenarioPicker;
import com.smaato.sdk.video.vast.build.VastScenarioWrapperMapper;
import com.smaato.sdk.video.vast.build.VastScenarioWrapperMerger;
import com.smaato.sdk.video.vast.build.VastTreeBuilder;
import com.smaato.sdk.video.vast.build.VastWrapperCompanionScenarioPicker;
import com.smaato.sdk.video.vast.build.VideoClicksMerger;
import com.smaato.sdk.video.vast.build.ViewableImpressionMerger;
import com.smaato.sdk.video.vast.build.WrapperAdContainerPicker;
import com.smaato.sdk.video.vast.build.WrapperLoader;
import com.smaato.sdk.video.vast.build.WrapperResolver;
import com.smaato.sdk.video.vast.config.DefaultWrapperResolverConfig;
import com.smaato.sdk.video.vast.config.WrapperResolverConfig;
import com.smaato.sdk.video.vast.parser.RegistryXmlParser;
import com.smaato.sdk.video.vast.parser.RegistryXmlParserFactory;
import com.smaato.sdk.video.vast.parser.VastResponseParser;
import com.smaato.sdk.video.vast.player.DiPlayerLayer;
import com.smaato.sdk.video.vast.tracking.macro.DiMacros;
import com.smaato.sdk.video.vast.tracking.macro.MacrosInjectorProviderFunction;
import java.util.concurrent.ExecutorService;
import org.xmlpull.v1.XmlPullParser;

public class VideoModuleInterface implements AdPresenterModuleInterface {
    public String moduleDiName() {
        return VideoDiNames.MODULE_DI_NAME;
    }

    public String version() {
        return "21.8.3";
    }

    private static DiRegistry buildDefaultConfigs() {
        return DiRegistry.m32956of($$Lambda$VideoModuleInterface$mH2WFDgHk7VKY8A587xvJdaIzMU.INSTANCE);
    }

    static /* synthetic */ WrapperResolverConfig lambda$buildDefaultConfigs$0(DiConstructor diConstructor) {
        return new DefaultWrapperResolverConfig();
    }

    private DiRegistry buildUtilityRegistry() {
        return DiRegistry.m32956of(new Consumer() {
            public final void accept(Object obj) {
                VideoModuleInterface.this.lambda$buildUtilityRegistry$2$VideoModuleInterface((DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$buildUtilityRegistry$2$VideoModuleInterface(DiRegistry diRegistry) {
        diRegistry.addFrom(buildVisibilityConfigBuilderRegistry());
        diRegistry.addFrom(buildResourceLoaderRegistry());
        diRegistry.registerFactory(moduleDiName(), StateMachine.class, new VideoStateMachineFactory(AdStateMachine.State.INIT));
    }

    private DiRegistry buildVastWebComponentRegistry() {
        return DiRegistry.m32956of(new Consumer() {
            public final void accept(Object obj) {
                VideoModuleInterface.this.lambda$buildVastWebComponentRegistry$6$VideoModuleInterface((DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$buildVastWebComponentRegistry$6$VideoModuleInterface(DiRegistry diRegistry) {
        diRegistry.registerFactory(VastWebComponentSecurityPolicy.class, $$Lambda$VideoModuleInterface$nYRSkUbpsTOQwXdDzrk34olaCw.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), BaseWebViewClient.class, $$Lambda$VideoModuleInterface$l8ugyCCtaA8I3_xJaieQJV2sQs.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), BaseWebChromeClient.class, $$Lambda$VideoModuleInterface$ZCCHpO6V4X2mL1E9JnINi6co8.INSTANCE);
    }

    static /* synthetic */ VastWebComponentSecurityPolicy lambda$buildVastWebComponentRegistry$3(DiConstructor diConstructor) {
        return new VastWebComponentSecurityPolicy((Logger) diConstructor.get(Logger.class), CoreDiNames.SOMA_API_URL, (UrlCreator) diConstructor.get(UrlCreator.class), (Boolean) diConstructor.get(CoreDiNames.NAME_HTTPS_ONLY, Boolean.class));
    }

    static /* synthetic */ BaseWebViewClient lambda$buildVastWebComponentRegistry$4(DiConstructor diConstructor) {
        return new BaseWebViewClient();
    }

    static /* synthetic */ BaseWebChromeClient lambda$buildVastWebComponentRegistry$5(DiConstructor diConstructor) {
        return new BaseWebChromeClient();
    }

    private DiRegistry buildVisibilityConfigBuilderRegistry() {
        return DiRegistry.m32956of(new Consumer() {
            public final void accept(Object obj) {
                VideoModuleInterface.this.mo70774x381fb9ce((DiRegistry) obj);
            }
        });
    }

    /* renamed from: lambda$buildVisibilityConfigBuilderRegistry$9$VideoModuleInterface */
    public /* synthetic */ void mo70774x381fb9ce(DiRegistry diRegistry) {
        diRegistry.registerFactory(moduleDiName(), VisibilityPrivateConfig.class, $$Lambda$VideoModuleInterface$ZUmAuTocubXzLqSuyT4auWLcz8.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), VisibilityTrackerCreator.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return VideoModuleInterface.this.mo70773xb199ff2f(diConstructor);
            }
        });
    }

    /* renamed from: lambda$buildVisibilityConfigBuilderRegistry$8$VideoModuleInterface */
    public /* synthetic */ VisibilityTrackerCreator mo70773xb199ff2f(DiConstructor diConstructor) {
        VisibilityPrivateConfig visibilityPrivateConfig = (VisibilityPrivateConfig) diConstructor.get(moduleDiName(), VisibilityPrivateConfig.class);
        return new VisibilityTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), visibilityPrivateConfig.getVisibilityRatio(), visibilityPrivateConfig.getVisibilityTimeMillis(), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), moduleDiName());
    }

    private DiRegistry buildVastMediaFilesMapperRegistry() {
        return DiRegistry.m32956of($$Lambda$VideoModuleInterface$UKWM78qihKH2xjSwZe2yZdg_LmE.INSTANCE);
    }

    static /* synthetic */ void lambda$buildVastMediaFilesMapperRegistry$26(DiRegistry diRegistry) {
        diRegistry.registerFactory(VideoClicksMerger.class, $$Lambda$VideoModuleInterface$AaR6ApgZfnDWX5I5GuaeuWvEAHU.INSTANCE);
        diRegistry.registerFactory(VastMediaFileScenarioMerger.class, $$Lambda$VideoModuleInterface$SwEYUOdEsiFPZlSppJjNOBlX3L8.INSTANCE);
        diRegistry.registerFactory(VastWrapperCompanionScenarioPicker.class, $$Lambda$VideoModuleInterface$4tNzJI4bI2jDEQhgo0EZ8elm21g.INSTANCE);
        diRegistry.registerFactory(ViewableImpressionMerger.class, $$Lambda$VideoModuleInterface$_YsvTjgpl1sR_1MBADgaQjTYY.INSTANCE);
        diRegistry.registerFactory(VastCompanionScenarioMerger.class, $$Lambda$VideoModuleInterface$rdUda4RZ9HlETsPKBfJ2ljufdE.INSTANCE);
        diRegistry.registerFactory(VastScenarioWrapperMerger.class, $$Lambda$VideoModuleInterface$RVJZD8Y6gZtyVa6SoeqVuLkyDA.INSTANCE);
        diRegistry.registerFactory(VastLinearMediaFilePicker.class, $$Lambda$VideoModuleInterface$KRBlV0cmyRT75R5CxPxlIjkmxmQ.INSTANCE);
        diRegistry.registerFactory(VastCompanionPicker.class, $$Lambda$VideoModuleInterface$N9TcjUrqqDrzXaQFmEtbp7Ke5uU.INSTANCE);
        diRegistry.registerFactory(VastCompanionScenarioMapper.class, $$Lambda$VideoModuleInterface$mmvdAUL9zeAOMNHs8J3R1OnhEPg.INSTANCE);
        diRegistry.registerFactory(VastIconScenarioMapper.class, $$Lambda$VideoModuleInterface$nd8E1Si6Qjt6nsGz82FRg_Jcvk.INSTANCE);
        diRegistry.registerFactory(VastIconScenarioPicker.class, $$Lambda$VideoModuleInterface$yW0dyAQJGdGC_xk3JtDDXgj5q0.INSTANCE);
        diRegistry.registerFactory(VastMediaFileScenarioMapper.class, $$Lambda$VideoModuleInterface$PQ_7yezUBilhW1MF2XCPRqZPsYg.INSTANCE);
        diRegistry.registerFactory(VastScenarioCreativeDataMapper.class, $$Lambda$VideoModuleInterface$XcLqPYj0gvIb5HYZ_7e7jujp4.INSTANCE);
        diRegistry.registerFactory(VastScenarioMapper.class, $$Lambda$VideoModuleInterface$DbHRuUTcTH4tSJIZ1Vlf3yQ53f4.INSTANCE);
        diRegistry.registerFactory(VastMediaFileScenarioWrapperMapper.class, $$Lambda$VideoModuleInterface$x6TFQhRiYbMPfvt6gLv20uhs5XE.INSTANCE);
        diRegistry.registerFactory(VastScenarioWrapperMapper.class, $$Lambda$VideoModuleInterface$jiTME8__8l0Gjr6Rbk3I5c9AA.INSTANCE);
    }

    static /* synthetic */ VideoClicksMerger lambda$buildVastMediaFilesMapperRegistry$10(DiConstructor diConstructor) {
        return new VideoClicksMerger();
    }

    static /* synthetic */ VastMediaFileScenarioMerger lambda$buildVastMediaFilesMapperRegistry$11(DiConstructor diConstructor) {
        return new VastMediaFileScenarioMerger((VideoClicksMerger) diConstructor.get(VideoClicksMerger.class));
    }

    static /* synthetic */ VastWrapperCompanionScenarioPicker lambda$buildVastMediaFilesMapperRegistry$12(DiConstructor diConstructor) {
        return new VastWrapperCompanionScenarioPicker();
    }

    static /* synthetic */ ViewableImpressionMerger lambda$buildVastMediaFilesMapperRegistry$13(DiConstructor diConstructor) {
        return new ViewableImpressionMerger();
    }

    static /* synthetic */ VastCompanionScenarioMerger lambda$buildVastMediaFilesMapperRegistry$14(DiConstructor diConstructor) {
        return new VastCompanionScenarioMerger();
    }

    static /* synthetic */ VastScenarioWrapperMerger lambda$buildVastMediaFilesMapperRegistry$15(DiConstructor diConstructor) {
        return new VastScenarioWrapperMerger((VastMediaFileScenarioMerger) diConstructor.get(VastMediaFileScenarioMerger.class), (VastWrapperCompanionScenarioPicker) diConstructor.get(VastWrapperCompanionScenarioPicker.class), (VastCompanionScenarioMerger) diConstructor.get(VastCompanionScenarioMerger.class), (ViewableImpressionMerger) diConstructor.get(ViewableImpressionMerger.class));
    }

    static /* synthetic */ VastLinearMediaFilePicker lambda$buildVastMediaFilesMapperRegistry$16(DiConstructor diConstructor) {
        return new VastLinearMediaFilePicker();
    }

    static /* synthetic */ VastCompanionPicker lambda$buildVastMediaFilesMapperRegistry$17(DiConstructor diConstructor) {
        return new VastCompanionPicker();
    }

    static /* synthetic */ VastCompanionScenarioMapper lambda$buildVastMediaFilesMapperRegistry$18(DiConstructor diConstructor) {
        return new VastCompanionScenarioMapper();
    }

    static /* synthetic */ VastIconScenarioMapper lambda$buildVastMediaFilesMapperRegistry$19(DiConstructor diConstructor) {
        return new VastIconScenarioMapper();
    }

    static /* synthetic */ VastIconScenarioPicker lambda$buildVastMediaFilesMapperRegistry$20(DiConstructor diConstructor) {
        return new VastIconScenarioPicker((VastIconScenarioMapper) diConstructor.get(VastIconScenarioMapper.class));
    }

    static /* synthetic */ VastMediaFileScenarioMapper lambda$buildVastMediaFilesMapperRegistry$21(DiConstructor diConstructor) {
        return new VastMediaFileScenarioMapper((VastIconScenarioPicker) diConstructor.get(VastIconScenarioPicker.class));
    }

    static /* synthetic */ VastScenarioCreativeDataMapper lambda$buildVastMediaFilesMapperRegistry$22(DiConstructor diConstructor) {
        return new VastScenarioCreativeDataMapper();
    }

    static /* synthetic */ VastScenarioMapper lambda$buildVastMediaFilesMapperRegistry$23(DiConstructor diConstructor) {
        return new VastScenarioMapper((VastLinearMediaFilePicker) diConstructor.get(VastLinearMediaFilePicker.class), (VastCompanionPicker) diConstructor.get(VastCompanionPicker.class), (VastCompanionScenarioMapper) diConstructor.get(VastCompanionScenarioMapper.class), (VastMediaFileScenarioMapper) diConstructor.get(VastMediaFileScenarioMapper.class), (VastScenarioCreativeDataMapper) diConstructor.get(VastScenarioCreativeDataMapper.class));
    }

    static /* synthetic */ VastMediaFileScenarioWrapperMapper lambda$buildVastMediaFilesMapperRegistry$24(DiConstructor diConstructor) {
        return new VastMediaFileScenarioWrapperMapper((VastIconScenarioPicker) diConstructor.get(VastIconScenarioPicker.class));
    }

    static /* synthetic */ VastScenarioWrapperMapper lambda$buildVastMediaFilesMapperRegistry$25(DiConstructor diConstructor) {
        return new VastScenarioWrapperMapper((VastCompanionPicker) diConstructor.get(VastCompanionPicker.class), (VastCompanionScenarioMapper) diConstructor.get(VastCompanionScenarioMapper.class), (VastMediaFileScenarioWrapperMapper) diConstructor.get(VastMediaFileScenarioWrapperMapper.class), (VastScenarioCreativeDataMapper) diConstructor.get(VastScenarioCreativeDataMapper.class));
    }

    private DiRegistry buildVastScenarioPickerRegistry() {
        return DiRegistry.m32956of($$Lambda$VideoModuleInterface$mqjWHr3E6_wvYcF10FbnYWIStmQ.INSTANCE);
    }

    static /* synthetic */ void lambda$buildVastScenarioPickerRegistry$30(DiRegistry diRegistry) {
        diRegistry.registerFactory(InLineAdContainerPicker.class, $$Lambda$VideoModuleInterface$p08OgWAdb3pZZLfSTDL23_Rtow.INSTANCE);
        diRegistry.registerFactory(WrapperAdContainerPicker.class, $$Lambda$VideoModuleInterface$6tZYufDqByeI2dWgB8Ix0kVD8.INSTANCE);
        diRegistry.registerFactory(VastScenarioPicker.class, $$Lambda$VideoModuleInterface$tAqx3ciVKH3QWzXnGTMNRJYp8g8.INSTANCE);
    }

    static /* synthetic */ InLineAdContainerPicker lambda$buildVastScenarioPickerRegistry$27(DiConstructor diConstructor) {
        return new InLineAdContainerPicker();
    }

    static /* synthetic */ WrapperAdContainerPicker lambda$buildVastScenarioPickerRegistry$28(DiConstructor diConstructor) {
        return new WrapperAdContainerPicker();
    }

    static /* synthetic */ VastScenarioPicker lambda$buildVastScenarioPickerRegistry$29(DiConstructor diConstructor) {
        return new VastScenarioPicker((InLineAdContainerPicker) diConstructor.get(InLineAdContainerPicker.class), (WrapperAdContainerPicker) diConstructor.get(WrapperAdContainerPicker.class), (VastScenarioWrapperMerger) diConstructor.get(VastScenarioWrapperMerger.class), (VastScenarioMapper) diConstructor.get(VastScenarioMapper.class), (VastScenarioWrapperMapper) diConstructor.get(VastScenarioWrapperMapper.class));
    }

    private DiRegistry buildVastTreeResultBuilderRegistry() {
        return DiRegistry.m32956of(new Consumer() {
            public final void accept(Object obj) {
                VideoModuleInterface.this.mo70771x4baaa8d2((DiRegistry) obj);
            }
        });
    }

    /* renamed from: lambda$buildVastTreeResultBuilderRegistry$33$VideoModuleInterface */
    public /* synthetic */ void mo70771x4baaa8d2(DiRegistry diRegistry) {
        diRegistry.registerFactory(VastTreeBuilder.class, $$Lambda$VideoModuleInterface$L6gKV0YC4fzyJ4oKyiyeHXlNBU.INSTANCE);
        diRegistry.registerFactory(VastResponseParser.class, $$Lambda$VideoModuleInterface$Ct7cpvWkiEOWman24VcL_lNVgM0.INSTANCE);
        diRegistry.addFrom(buildWrapperResolverRegistry());
    }

    static /* synthetic */ VastTreeBuilder lambda$buildVastTreeResultBuilderRegistry$31(DiConstructor diConstructor) {
        return new VastTreeBuilder((VastResponseParser) diConstructor.get(VastResponseParser.class), (WrapperResolver) diConstructor.get(WrapperResolver.class));
    }

    static /* synthetic */ VastResponseParser lambda$buildVastTreeResultBuilderRegistry$32(DiConstructor diConstructor) {
        return new VastResponseParser((RegistryXmlParser) diConstructor.get(RegistryXmlParser.class));
    }

    private DiRegistry buildWrapperResolverRegistry() {
        return DiRegistry.m32956of($$Lambda$VideoModuleInterface$DOrEv7C8O7XvYcZRlC7ZljmCrEg.INSTANCE);
    }

    static /* synthetic */ void lambda$buildWrapperResolverRegistry$37(DiRegistry diRegistry) {
        diRegistry.registerFactory(WrapperResolver.class, $$Lambda$VideoModuleInterface$quCpKxdzI_CKlqgV_RczYeEcjNQ.INSTANCE);
        diRegistry.registerFactory(WrapperLoader.class, $$Lambda$VideoModuleInterface$RtuiIsd05PT_3NFHIenAcb2fqnE.INSTANCE);
        diRegistry.registerFactory(InLineChecker.class, $$Lambda$VideoModuleInterface$MkQPos5DtcllpY0HgXX5c45GBKc.INSTANCE);
    }

    static /* synthetic */ WrapperResolver lambda$buildWrapperResolverRegistry$34(DiConstructor diConstructor) {
        return new WrapperResolver(((WrapperResolverConfig) diConstructor.get("WRAPPER_RESOLVER_CONFIG", WrapperResolverConfig.class)).getMaxDepth(), (WrapperLoader) diConstructor.get(WrapperLoader.class), (InLineChecker) diConstructor.get(InLineChecker.class), (WrapperAdContainerPicker) diConstructor.get(WrapperAdContainerPicker.class));
    }

    static /* synthetic */ WrapperLoader lambda$buildWrapperResolverRegistry$35(DiConstructor diConstructor) {
        return new WrapperLoader((VastResponseParser) diConstructor.get(VastResponseParser.class), CoreLightModuleInterface.getDefaultHttpClient(diConstructor));
    }

    static /* synthetic */ InLineChecker lambda$buildWrapperResolverRegistry$36(DiConstructor diConstructor) {
        return new InLineChecker();
    }

    private DiRegistry buildResourceLoaderRegistry() {
        return DiRegistry.m32956of($$Lambda$VideoModuleInterface$czwWuxukWXculiLTVlX3AjeSU.INSTANCE);
    }

    static /* synthetic */ void lambda$buildResourceLoaderRegistry$44(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(VideoDiNames.VIDEO_RESOURCE_LOADER_DI_NAME, ResourceLoader.class, $$Lambda$VideoModuleInterface$TtgUpEpRorMWPiZRPjH1YLDwAuI.INSTANCE);
        diRegistry.registerSingletonFactory("VideoModuleInterfaceVIDEO_RESOURCE_LOADING_DEVICE_LOCAL_EXECUTOR", ExecutorService.class, $$Lambda$VideoModuleInterface$eIm5ptp_nxEwfWfBLklkNV666k.INSTANCE);
        diRegistry.registerSingletonFactory("VideoModuleInterfaceVIDEO_RESOURCE_LOADING_NETWORK_EXECUTOR", ExecutorService.class, $$Lambda$VideoModuleInterface$PkCJyjSkG9vxW26RJ2pB5aHC1lQ.INSTANCE);
        diRegistry.registerFactory(VideoNetworkResourceStreamPreparationStrategy.class, $$Lambda$VideoModuleInterface$3ta5JbHM__5H_oJxxjrUgEUd9xg.INSTANCE);
        diRegistry.registerFactory(VideoPersistingStrategy.class, $$Lambda$VideoModuleInterface$lVzlk4Hcijr1tkF5OPYilnic5Pg.INSTANCE);
        diRegistry.registerFactory(VideoResourceTransformer.class, $$Lambda$VideoModuleInterface$bIuQxZnbspb7N7b3DSXkfQN8pQ.INSTANCE);
    }

    static /* synthetic */ ResourceLoader lambda$buildResourceLoaderRegistry$38(DiConstructor diConstructor) {
        return new ResourceLoader(DiLogLayer.getLoggerFrom(diConstructor), CoreLightModuleInterface.getHttpClientWithStatusToException(diConstructor), (PersistingStrategy) diConstructor.get(VideoPersistingStrategy.class), (ResourceTransformer) diConstructor.get(VideoResourceTransformer.class));
    }

    static /* synthetic */ VideoNetworkResourceStreamPreparationStrategy lambda$buildResourceLoaderRegistry$41(DiConstructor diConstructor) {
        return new VideoNetworkResourceStreamPreparationStrategy();
    }

    static /* synthetic */ VideoPersistingStrategy lambda$buildResourceLoaderRegistry$42(DiConstructor diConstructor) {
        return new VideoPersistingStrategy(DiLogLayer.getLoggerFrom(diConstructor), "video/vast", DiResourceLoaderLayer.getBaseStoragePersistingStrategyFileUtils(diConstructor), DiResourceLoaderLayer.getMd5Digester(diConstructor));
    }

    static /* synthetic */ VideoResourceTransformer lambda$buildResourceLoaderRegistry$43(DiConstructor diConstructor) {
        return new VideoResourceTransformer();
    }

    private DiRegistry buildVastDiRegistry() {
        return DiRegistry.m32956of(new Consumer() {
            public final void accept(Object obj) {
                VideoModuleInterface.this.lambda$buildVastDiRegistry$45$VideoModuleInterface((DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$buildVastDiRegistry$45$VideoModuleInterface(DiRegistry diRegistry) {
        diRegistry.addFrom(buildVastWebComponentRegistry());
        diRegistry.addFrom(buildVastMediaFilesMapperRegistry());
        diRegistry.addFrom(buildVastScenarioPickerRegistry());
        diRegistry.addFrom(buildVastTreeResultBuilderRegistry());
    }

    public boolean isFormatSupported(AdFormat adFormat, Class<? extends AdPresenter> cls) {
        return adFormat == AdFormat.VIDEO && (RewardedAdPresenter.class.isAssignableFrom(cls) || InterstitialAdPresenter.class.isAssignableFrom(cls));
    }

    static /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$47(DiConstructor diConstructor) {
        return new VideoAdLoaderPlugin((AdPresenterNameShaper) diConstructor.get(AdPresenterNameShaper.class), new NullableFunction() {
            public final Object apply(Object obj) {
                return VideoModuleInterface.lambda$getAdLoaderPluginFactory$46(DiConstructor.this, (String) obj);
            }
        });
    }

    public ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return $$Lambda$VideoModuleInterface$G1O8WaNjtTdAlbqcUgCb91qvU.INSTANCE;
    }

    static /* synthetic */ AdPresenterBuilder lambda$getAdLoaderPluginFactory$46(DiConstructor diConstructor, String str) {
        return (AdPresenterBuilder) DiAdLayer.tryGetOrNull(diConstructor, str, AdPresenterBuilder.class);
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m32956of(new Consumer() {
            public final void accept(Object obj) {
                VideoModuleInterface.this.lambda$moduleDiRegistry$49$VideoModuleInterface((DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$moduleDiRegistry$49$VideoModuleInterface(DiRegistry diRegistry) {
        diRegistry.addFrom(buildDefaultConfigs());
        diRegistry.registerFactory(moduleDiName(), XmlPullParser.class, $$Lambda$VideoModuleInterface$naoK4sWGz41wCoUVOtMMCUB_Nc.INSTANCE);
        diRegistry.registerSingletonFactory(RegistryXmlParser.class, new RegistryXmlParserFactory());
        diRegistry.addFrom(buildUtilityRegistry());
        diRegistry.addFrom(buildVastDiRegistry());
        diRegistry.addFrom(DiPlayerLayer.createRegistry());
        diRegistry.addFrom(DiMacros.createRegistry());
    }

    public DiRegistry moduleAdPresenterDiRegistry(AdPresenterNameShaper adPresenterNameShaper) {
        return DiRegistry.m32956of(new Consumer(adPresenterNameShaper) {
            public final /* synthetic */ AdPresenterNameShaper f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                VideoModuleInterface.this.lambda$moduleAdPresenterDiRegistry$52$VideoModuleInterface(this.f$1, (DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$moduleAdPresenterDiRegistry$52$VideoModuleInterface(AdPresenterNameShaper adPresenterNameShaper, DiRegistry diRegistry) {
        diRegistry.registerFactory(VastErrorTrackerCreator.class, $$Lambda$VideoModuleInterface$Jb7RqvKUNp0tD95Us_yBUMWM5I.INSTANCE);
        diRegistry.registerFactory(MediaFileResourceLoaderListenerCreator.class, $$Lambda$VideoModuleInterface$eNNCsQyKLFioQmNst9qv5_ZkRQ.INSTANCE);
        diRegistry.addFrom(DiVideoAdLayer.createRegistry(adPresenterNameShaper, moduleDiName()));
    }

    static /* synthetic */ VastErrorTrackerCreator lambda$moduleAdPresenterDiRegistry$50(DiConstructor diConstructor) {
        return new VastErrorTrackerCreator((Logger) diConstructor.get(Logger.class), DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (MacrosInjectorProviderFunction) diConstructor.get(MacrosInjectorProviderFunction.class));
    }

    static /* synthetic */ MediaFileResourceLoaderListenerCreator lambda$moduleAdPresenterDiRegistry$51(DiConstructor diConstructor) {
        return new MediaFileResourceLoaderListenerCreator();
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return ExpectedManifestEntries.EMPTY;
    }

    public String toString() {
        return "VideoModuleInterface{supportedFormat: " + AdFormat.VIDEO + "}";
    }
}
