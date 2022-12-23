package com.smaato.sdk.interstitial;

import android.app.Application;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.api.AdRequestExtrasProvider;
import com.smaato.sdk.core.api.VideoTypeAdRequestExtrasProvider;
import com.smaato.sdk.core.config.Configuration;
import com.smaato.sdk.core.config.ConfigurationRepository;
import com.smaato.sdk.core.config.DiConfiguration;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p378ad.FullscreenAdDimensionMapper;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p378ad.SharedKeyValuePairsHolder;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.repository.AdLoadersRegistry;
import com.smaato.sdk.core.repository.AdRepository;
import com.smaato.sdk.core.repository.DiAdRepository;
import com.smaato.sdk.core.repository.MultipleAdLoadersRegistry;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.core.util.p382fi.Consumer;

public final class DiInterstitial {
    private static final AdStateMachine.State DEFAULT_IMPRESSION_STATE = AdStateMachine.State.IMPRESSED;

    private DiInterstitial() {
    }

    public static DiRegistry createRegistry(String str) {
        Objects.requireNonNull(str);
        return DiRegistry.m32956of(new Consumer(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                DiInterstitial.lambda$createRegistry$7(this.f$0, (DiRegistry) obj);
            }
        });
    }

    static /* synthetic */ void lambda$createRegistry$7(String str, DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(InterstitialLoader.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiInterstitial.lambda$createRegistry$0(this.f$0, diConstructor);
            }
        });
        diRegistry.registerSingletonFactory(str, SharedKeyValuePairsHolder.class, $$Lambda$DiInterstitial$K9PttMSAIN5LGwoSzL_C_JDSSoQ.INSTANCE);
        diRegistry.registerSingletonFactory(InterstitialAdPresenterStorage.class, $$Lambda$DiInterstitial$Y4WKOQR1yzBDIHFwLL3D_QTkg.INSTANCE);
        diRegistry.registerFactory(str, AdRequestExtrasProvider.class, $$Lambda$DiInterstitial$gfJSoMfqahk8AApmqs5jO74HPVs.INSTANCE);
        diRegistry.registerSingletonFactory(str, AdLoadersRegistry.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiInterstitial.lambda$createRegistry$4(this.f$0, diConstructor);
            }
        });
        diRegistry.registerSingletonFactory(str, ConfigurationRepository.class, $$Lambda$DiInterstitial$KzDWaZm2TynEea64gNPkrYQISuM.INSTANCE);
        diRegistry.registerFactory(new AdPresenterNameShaper().shapeName(AdFormat.INTERSTITIAL, InterstitialAdPresenter.class), Timer.class, $$Lambda$DiInterstitial$bRzBRM4d5Lw63MaslitHRFsi_os.INSTANCE);
    }

    static /* synthetic */ InterstitialLoader lambda$createRegistry$0(String str, DiConstructor diConstructor) {
        return new InterstitialLoader((AdRepository) ((DiAdRepository.Provider) diConstructor.get(DiAdRepository.Provider.class)).apply(str), (InterstitialAdPresenterStorage) diConstructor.get(InterstitialAdPresenterStorage.class), (Application) diConstructor.get(Application.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class), (SharedKeyValuePairsHolder) diConstructor.get(str, SharedKeyValuePairsHolder.class), (FullscreenAdDimensionMapper) diConstructor.get(FullscreenAdDimensionMapper.class), $$Lambda$DiInterstitial$Wd7bUiJ6rzarh6euqzITU7sSM.INSTANCE);
    }

    static /* synthetic */ SharedKeyValuePairsHolder lambda$createRegistry$1(DiConstructor diConstructor) {
        return new SharedKeyValuePairsHolder();
    }

    static /* synthetic */ InterstitialAdPresenterStorage lambda$createRegistry$2(DiConstructor diConstructor) {
        return new InterstitialAdPresenterStorage();
    }

    static /* synthetic */ AdRequestExtrasProvider lambda$createRegistry$3(DiConstructor diConstructor) {
        return new VideoTypeAdRequestExtrasProvider("interstitial");
    }

    static /* synthetic */ AdLoadersRegistry lambda$createRegistry$4(String str, DiConstructor diConstructor) {
        return new MultipleAdLoadersRegistry((ConfigurationRepository) diConstructor.get(str, ConfigurationRepository.class), DiLogLayer.getLoggerFrom(diConstructor));
    }

    static /* synthetic */ ConfigurationRepository lambda$createRegistry$5(DiConstructor diConstructor) {
        return (ConfigurationRepository) ((DiConfiguration.Provider) diConstructor.get(DiConfiguration.Provider.class)).apply(new Configuration(20, DEFAULT_IMPRESSION_STATE));
    }
}
