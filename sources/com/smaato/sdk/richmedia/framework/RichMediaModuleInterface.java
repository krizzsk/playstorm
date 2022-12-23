package com.smaato.sdk.richmedia.framework;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.dns.DnsResolver;
import com.smaato.sdk.core.flow.Schedulers;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.framework.VisibilityPrivateConfig;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.lgpd.SomaLgpdDataSource;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoaderPlugin;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p378ad.BannerAdPresenter;
import com.smaato.sdk.core.p378ad.DiAdLayer;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p378ad.RequestInfoMapper;
import com.smaato.sdk.core.p378ad.RequestInfoProvider;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.CoreDiNames;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.rawresourceloader.RawResourceLoader;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.notifier.ChangeSenderUtils;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.NullableFunction;
import com.smaato.sdk.richmedia.mraid.MraidConfigurator;
import com.smaato.sdk.richmedia.mraid.RichMediaWebViewFactory;
import com.smaato.sdk.richmedia.mraid.dataprovider.AudioVolumeContentObserver;
import com.smaato.sdk.richmedia.mraid.dataprovider.AudioVolumeObserver;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidSupportsProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MusicPlaybackVolume;
import com.smaato.sdk.richmedia.p387ad.DiRichMediaAdLayer;
import com.smaato.sdk.richmedia.p387ad.LoadedWebViewCache;
import com.smaato.sdk.richmedia.p387ad.RichMediaAdLoaderPlugin;
import com.smaato.sdk.richmedia.p387ad.RichMediaAdResponseParser;
import com.smaato.sdk.richmedia.p387ad.tracker.RichMediaVisibilityTrackerCreator;
import com.smaato.sdk.richmedia.p388di.DiNames;
import com.smaato.sdk.richmedia.util.HtmlPlayerUtils;
import com.smaato.sdk.richmedia.util.OutstreamAdTemplateResourceCache;
import com.smaato.sdk.richmedia.util.RichMediaHtmlUtils;

public class RichMediaModuleInterface implements AdPresenterModuleInterface {
    public String moduleDiName() {
        return DiNames.RICH_MEDIA_MODULE_DI_NAME;
    }

    public String version() {
        return "21.8.3";
    }

    public boolean isFormatSupported(AdFormat adFormat, Class<? extends AdPresenter> cls) {
        return (adFormat == AdFormat.RICH_MEDIA && (InterstitialAdPresenter.class.isAssignableFrom(cls) || BannerAdPresenter.class.isAssignableFrom(cls))) || (adFormat == AdFormat.VIDEO && BannerAdPresenter.class.isAssignableFrom(cls));
    }

    static /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$1(DiConstructor diConstructor) {
        return new RichMediaAdLoaderPlugin((AdPresenterNameShaper) diConstructor.get(AdPresenterNameShaper.class), new NullableFunction() {
            public final Object apply(Object obj) {
                return RichMediaModuleInterface.lambda$getAdLoaderPluginFactory$0(DiConstructor.this, (String) obj);
            }
        });
    }

    public ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return $$Lambda$RichMediaModuleInterface$QNLl3GIgP8DouiOrBZ_gmg4JEk.INSTANCE;
    }

    static /* synthetic */ AdPresenterBuilder lambda$getAdLoaderPluginFactory$0(DiConstructor diConstructor, String str) {
        return (AdPresenterBuilder) DiAdLayer.tryGetOrNull(diConstructor, str, AdPresenterBuilder.class);
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m32956of(new Consumer() {
            public final void accept(Object obj) {
                RichMediaModuleInterface.this.lambda$moduleDiRegistry$10$RichMediaModuleInterface((DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$moduleDiRegistry$10$RichMediaModuleInterface(DiRegistry diRegistry) {
        diRegistry.registerFactory(moduleDiName(), RichMediaHtmlUtils.class, $$Lambda$RichMediaModuleInterface$iXtoxJwQBtmYCD7raOJvomACCCI.INSTANCE);
        diRegistry.registerSingletonFactory(HtmlPlayerUtils.class, $$Lambda$RichMediaModuleInterface$GwJ3AjZx7CCOQfnSwJe0PMbNfR8.INSTANCE);
        diRegistry.registerSingletonFactory(OutstreamAdTemplateResourceCache.class, $$Lambda$RichMediaModuleInterface$knqHJEJFlypKENDlqRpfQmIOVMI.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), MraidConfigurator.class, $$Lambda$RichMediaModuleInterface$J72fNGMOd99267SjZYmHh08Juc.INSTANCE);
        diRegistry.registerFactory(MraidStateMachineFactory.class, $$Lambda$RichMediaModuleInterface$JpxFUkw8aVYYtMhbbmRRbBSsT8Y.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), RichMediaAdResponseParser.class, $$Lambda$RichMediaModuleInterface$z5WATZxL7R4H8zU8K_NX1p8yGIw.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), VisibilityPrivateConfig.class, $$Lambda$RichMediaModuleInterface$T1SJ6Exh68RYhlNHYF97dOjZxo.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), RichMediaVisibilityTrackerCreator.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return RichMediaModuleInterface.this.lambda$moduleDiRegistry$9$RichMediaModuleInterface(diConstructor);
            }
        });
        diRegistry.addFrom(provideOrientationChangeWatcher());
        diRegistry.addFrom(provideRichMediaWebViewFactory());
        diRegistry.addFrom(provideMraidSupportsFeature());
        diRegistry.addFrom(provideAudioVolumeObserver());
    }

    static /* synthetic */ RichMediaHtmlUtils lambda$moduleDiRegistry$2(DiConstructor diConstructor) {
        return new RichMediaHtmlUtils((Boolean) diConstructor.get(CoreDiNames.NAME_IS_LOGGING_ENABLED, Boolean.class));
    }

    static /* synthetic */ HtmlPlayerUtils lambda$moduleDiRegistry$3(DiConstructor diConstructor) {
        return new HtmlPlayerUtils((OutstreamAdTemplateResourceCache) diConstructor.get(OutstreamAdTemplateResourceCache.class));
    }

    static /* synthetic */ OutstreamAdTemplateResourceCache lambda$moduleDiRegistry$4(DiConstructor diConstructor) {
        return new OutstreamAdTemplateResourceCache((Application) diConstructor.get(Application.class), (Schedulers) diConstructor.get(Schedulers.class), (DnsResolver) diConstructor.get(DnsResolver.class), (RawResourceLoader) diConstructor.get(RawResourceLoader.class), DiLogLayer.getLoggerFrom(diConstructor));
    }

    static /* synthetic */ MraidConfigurator lambda$moduleDiRegistry$5(DiConstructor diConstructor) {
        return new MraidConfigurator((AppBackgroundAwareHandler) diConstructor.get(AppBackgroundAwareHandler.class), (OrientationChangeWatcher) diConstructor.get(OrientationChangeWatcher.class), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), DiLogLayer.getLoggerFrom(diConstructor), (RequestInfoProvider) diConstructor.get(RequestInfoProvider.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class), (MraidStateMachineFactory) diConstructor.get(MraidStateMachineFactory.class), (RichMediaWebViewFactory) diConstructor.get(RichMediaWebViewFactory.class), (RequestInfoMapper) diConstructor.get(RequestInfoMapper.class), (MraidSupportsProperties) diConstructor.get(MraidSupportsProperties.class), (AudioVolumeObserver) diConstructor.get(AudioVolumeObserver.class), (MusicPlaybackVolume) diConstructor.get(MusicPlaybackVolume.class), (LoadedWebViewCache) diConstructor.get(LoadedWebViewCache.class));
    }

    static /* synthetic */ MraidStateMachineFactory lambda$moduleDiRegistry$6(DiConstructor diConstructor) {
        return new MraidStateMachineFactory(MraidStateMachineFactory.State.LOADING);
    }

    static /* synthetic */ RichMediaAdResponseParser lambda$moduleDiRegistry$7(DiConstructor diConstructor) {
        return new RichMediaAdResponseParser(DiLogLayer.getLoggerFrom(diConstructor));
    }

    public /* synthetic */ RichMediaVisibilityTrackerCreator lambda$moduleDiRegistry$9$RichMediaModuleInterface(DiConstructor diConstructor) {
        VisibilityPrivateConfig visibilityPrivateConfig = (VisibilityPrivateConfig) diConstructor.get(moduleDiName(), VisibilityPrivateConfig.class);
        return new RichMediaVisibilityTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), visibilityPrivateConfig.getVisibilityRatio(), visibilityPrivateConfig.getVisibilityTimeMillis(), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class));
    }

    private DiRegistry provideAudioVolumeObserver() {
        return DiRegistry.m32956of($$Lambda$RichMediaModuleInterface$MQUAcPPi2lO13tanQvncCVk5_6A.INSTANCE);
    }

    static /* synthetic */ void lambda$provideAudioVolumeObserver$14(DiRegistry diRegistry) {
        diRegistry.registerFactory(AudioVolumeContentObserver.class, $$Lambda$RichMediaModuleInterface$pKlTyrNdbsc3a7tlpcoJ8Et9rkI.INSTANCE);
        diRegistry.registerSingletonFactory(AudioVolumeObserver.class, $$Lambda$RichMediaModuleInterface$32ngjauMrk5IBSDGJh3jrxUiow.INSTANCE);
        diRegistry.registerSingletonFactory(MusicPlaybackVolume.class, $$Lambda$RichMediaModuleInterface$XWnlpOr6KqTXxCXZTIUTdPBTB8.INSTANCE);
    }

    static /* synthetic */ AudioVolumeContentObserver lambda$provideAudioVolumeObserver$11(DiConstructor diConstructor) {
        MusicPlaybackVolume musicPlaybackVolume = (MusicPlaybackVolume) diConstructor.get(MusicPlaybackVolume.class);
        return new AudioVolumeContentObserver((Context) diConstructor.get(Application.class), musicPlaybackVolume, ChangeSenderUtils.createUniqueValueChangeSender(Integer.valueOf(musicPlaybackVolume.getCurrentVolume())));
    }

    static /* synthetic */ AudioVolumeObserver lambda$provideAudioVolumeObserver$12(DiConstructor diConstructor) {
        return new AudioVolumeObserver((AudioVolumeContentObserver) diConstructor.get(AudioVolumeContentObserver.class), ((MusicPlaybackVolume) diConstructor.get(MusicPlaybackVolume.class)).getMaxVolume());
    }

    static /* synthetic */ MusicPlaybackVolume lambda$provideAudioVolumeObserver$13(DiConstructor diConstructor) {
        return new MusicPlaybackVolume((AudioManager) ((Application) diConstructor.get(Application.class)).getSystemService("audio"));
    }

    private DiRegistry provideOrientationChangeWatcher() {
        return DiRegistry.m32956of($$Lambda$RichMediaModuleInterface$NVZPFz9wL3epTscG9UqSOpE1Q.INSTANCE);
    }

    static /* synthetic */ void lambda$provideOrientationChangeWatcher$17(DiRegistry diRegistry) {
        diRegistry.registerFactory(OrientationBroadcastReceiver.class, $$Lambda$RichMediaModuleInterface$IXDD_iqAaAT0IQ9CFvy6smw1pQ.INSTANCE);
        diRegistry.registerSingletonFactory(OrientationChangeWatcher.class, $$Lambda$RichMediaModuleInterface$_R4DsHOAe0Yci9YWIYGLXdPpoP4.INSTANCE);
    }

    static /* synthetic */ OrientationBroadcastReceiver lambda$provideOrientationChangeWatcher$15(DiConstructor diConstructor) {
        return new OrientationBroadcastReceiver((Context) diConstructor.get(Application.class), ChangeSenderUtils.createChangeSender(Whatever.INSTANCE));
    }

    static /* synthetic */ OrientationChangeWatcher lambda$provideOrientationChangeWatcher$16(DiConstructor diConstructor) {
        return new OrientationChangeWatcher((OrientationBroadcastReceiver) diConstructor.get(OrientationBroadcastReceiver.class));
    }

    private DiRegistry provideRichMediaWebViewFactory() {
        return DiRegistry.m32956of(new Consumer() {
            public final void accept(Object obj) {
                RichMediaModuleInterface.this.mo70445x246b4372((DiRegistry) obj);
            }
        });
    }

    /* renamed from: lambda$provideRichMediaWebViewFactory$19$RichMediaModuleInterface */
    public /* synthetic */ void mo70445x246b4372(DiRegistry diRegistry) {
        diRegistry.registerFactory(RichMediaWebViewFactory.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return RichMediaModuleInterface.this.mo70444x2291f053(diConstructor);
            }
        });
    }

    /* renamed from: lambda$provideRichMediaWebViewFactory$18$RichMediaModuleInterface */
    public /* synthetic */ RichMediaWebViewFactory mo70444x2291f053(DiConstructor diConstructor) {
        return new RichMediaWebViewFactory(DiLogLayer.getLoggerFrom(diConstructor), (RichMediaHtmlUtils) diConstructor.get(moduleDiName(), RichMediaHtmlUtils.class));
    }

    private DiRegistry provideMraidSupportsFeature() {
        return DiRegistry.m32956of($$Lambda$RichMediaModuleInterface$yB5MOCqlsmgT1xe5DnMsdokEZyI.INSTANCE);
    }

    static /* synthetic */ MraidSupportsProperties lambda$provideMraidSupportsFeature$20(DiConstructor diConstructor) {
        return new MraidSupportsProperties((AppMetaData) diConstructor.get(AppMetaData.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class), (SomaGdprDataSource) diConstructor.get(SomaGdprDataSource.class), (SomaLgpdDataSource) diConstructor.get(SomaLgpdDataSource.class));
    }

    public DiRegistry moduleAdPresenterDiRegistry(AdPresenterNameShaper adPresenterNameShaper) {
        return DiRichMediaAdLayer.createRegistry(adPresenterNameShaper, moduleDiName());
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return ExpectedManifestEntries.EMPTY;
    }

    public String toString() {
        return "RichMediaModuleInterface{supportedFormat: " + AdFormat.RICH_MEDIA + "}";
    }
}
