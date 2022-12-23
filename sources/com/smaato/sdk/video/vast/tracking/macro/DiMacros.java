package com.smaato.sdk.video.vast.tracking.macro;

import android.app.Application;
import android.content.Context;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.p378ad.RequestInfoProvider;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.video.utils.DateFormatUtils;
import com.smaato.sdk.video.utils.RandomUtils;
import com.smaato.sdk.video.utils.UriUtils;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.tracking.macro.ClickInfoMacros;
import com.smaato.sdk.video.vast.tracking.macro.PlayerStateInfoMacros;

public final class DiMacros {

    private interface AdBreakInfoMacrosProvider extends NullableArgumentFunction<VastScenario, AdBreakInfoMacros> {
    }

    private interface PlayerStateInfoMacrosProvider extends NullableArgumentFunction<VastScenario, PlayerStateInfoMacros> {
    }

    private DiMacros() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiMacros$IFiSjqlOwyHD6Www3DGbsAmMxqg.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$17(DiRegistry diRegistry) {
        diRegistry.registerFactory(MacrosInjectorProviderFunction.class, $$Lambda$DiMacros$b3o6dy9nwUSOP1rfedFncuNl20.INSTANCE);
        diRegistry.registerFactory(UriUtils.class, $$Lambda$DiMacros$iaYy6XvnlmzeXod59HlpPg5OgLk.INSTANCE);
        diRegistry.registerFactory(DateFormatUtils.class, $$Lambda$DiMacros$VqQmKyhdU4trTumWhm6J6VuNrFI.INSTANCE);
        diRegistry.registerFactory(RandomUtils.class, $$Lambda$DiMacros$7GYy12bqMu9xZRtO56e52qRYXBo.INSTANCE);
        diRegistry.registerFactory(AdBreakInfoMacrosProvider.class, $$Lambda$DiMacros$O_CN_FMBfgZXYOoLEmuSMulgwqA.INSTANCE);
        diRegistry.registerFactory(CapabilitiesInfoMacro.class, $$Lambda$DiMacros$LeofRwVW4H24Ok12U__lfWbEhoc.INSTANCE);
        diRegistry.registerFactory(ClientInfoMacros.class, $$Lambda$DiMacros$V3LE03cYAYS2hSdqlBAWKdY4aYM.INSTANCE);
        diRegistry.registerFactory(GenericMacros.class, $$Lambda$DiMacros$u7N5jqREPth1Wn1yYenf7ycnt7g.INSTANCE);
        diRegistry.registerFactory(PlayerStateInfoMacrosProvider.class, $$Lambda$DiMacros$JCmO4c6zxTAnkC1a7A3iXjzSI3Y.INSTANCE);
        diRegistry.registerFactory(PublisherInfoMacro.class, $$Lambda$DiMacros$SLqm5XZXqAB9yR9j7IyOYS0s9U.INSTANCE);
        diRegistry.registerFactory(RegulationInfoMacros.class, $$Lambda$DiMacros$aa74AeVF5tjjDyX6Py38TP0wLrY.INSTANCE);
        diRegistry.registerFactory(VerificationInfoMacros.class, $$Lambda$DiMacros$DlBHUAEa5Gipt5F7u6hZfZAbhAQ.INSTANCE);
        diRegistry.registerFactory(ErrorInfoMacros.class, $$Lambda$DiMacros$vEfojwG9bhgKdmyjrGfUmGYPEXc.INSTANCE);
        diRegistry.addFrom(provideClientInfoMacros());
    }

    static /* synthetic */ MacroInjector lambda$createRegistry$0(DiConstructor diConstructor, VastScenario vastScenario) {
        return new MacroInjector((UriUtils) diConstructor.get(UriUtils.class), (AdBreakInfoMacros) ((AdBreakInfoMacrosProvider) diConstructor.get(AdBreakInfoMacrosProvider.class)).apply(vastScenario), (CapabilitiesInfoMacro) diConstructor.get(CapabilitiesInfoMacro.class), (ClientInfoMacros) diConstructor.get(ClientInfoMacros.class), (GenericMacros) diConstructor.get(GenericMacros.class), (PlayerStateInfoMacros) ((PlayerStateInfoMacrosProvider) diConstructor.get(PlayerStateInfoMacrosProvider.class)).apply(vastScenario), (PublisherInfoMacro) diConstructor.get(PublisherInfoMacro.class), (RegulationInfoMacros) diConstructor.get(RegulationInfoMacros.class), (VerificationInfoMacros) diConstructor.get(VerificationInfoMacros.class), (ClickInfoMacros) diConstructor.get(ClickInfoMacros.class), (ErrorInfoMacros) diConstructor.get(ErrorInfoMacros.class));
    }

    static /* synthetic */ MacrosInjectorProviderFunction lambda$createRegistry$1(DiConstructor diConstructor) {
        return new MacrosInjectorProviderFunction() {
            public final Object apply(Object obj) {
                return DiMacros.lambda$createRegistry$0(DiConstructor.this, (VastScenario) obj);
            }
        };
    }

    static /* synthetic */ UriUtils lambda$createRegistry$2(DiConstructor diConstructor) {
        return new UriUtils();
    }

    static /* synthetic */ DateFormatUtils lambda$createRegistry$3(DiConstructor diConstructor) {
        return new DateFormatUtils();
    }

    static /* synthetic */ RandomUtils lambda$createRegistry$4(DiConstructor diConstructor) {
        return new RandomUtils();
    }

    static /* synthetic */ AdBreakInfoMacros lambda$createRegistry$5(DiConstructor diConstructor, VastScenario vastScenario) {
        UniversalAdId universalAdId;
        DateFormatUtils dateFormatUtils = (DateFormatUtils) diConstructor.get(DateFormatUtils.class);
        if (vastScenario == null) {
            universalAdId = null;
        } else {
            universalAdId = vastScenario.vastMediaFileScenario.vastScenarioCreativeData.universalAdId;
        }
        return new AdBreakInfoMacros(dateFormatUtils, vastScenario, universalAdId);
    }

    static /* synthetic */ AdBreakInfoMacrosProvider lambda$createRegistry$6(DiConstructor diConstructor) {
        return new AdBreakInfoMacrosProvider() {
            public final Object apply(Object obj) {
                return DiMacros.lambda$createRegistry$5(DiConstructor.this, (VastScenario) obj);
            }
        };
    }

    static /* synthetic */ CapabilitiesInfoMacro lambda$createRegistry$7(DiConstructor diConstructor) {
        return new CapabilitiesInfoMacro();
    }

    static /* synthetic */ ClientInfoMacros lambda$createRegistry$8(DiConstructor diConstructor) {
        return new ClientInfoMacros((DataCollector) diConstructor.get(DataCollector.class), (RequestInfoProvider) diConstructor.get(RequestInfoProvider.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class));
    }

    static /* synthetic */ GenericMacros lambda$createRegistry$9(DiConstructor diConstructor) {
        return new GenericMacros((DateFormatUtils) diConstructor.get(DateFormatUtils.class), (RandomUtils) diConstructor.get(RandomUtils.class));
    }

    static /* synthetic */ PlayerStateInfoMacros lambda$createRegistry$11(DiConstructor diConstructor, VastScenario vastScenario) {
        String str;
        $$Lambda$DiMacros$eiLMIfsjpCTuo24ze4mQCtWjEeY r1 = new PlayerStateInfoMacros.ScreenSizeProvider() {
            public final Object get() {
                return UIUtils.getDisplaySizeInDp((Context) DiConstructor.this.get(Application.class));
            }
        };
        DateFormatUtils dateFormatUtils = (DateFormatUtils) diConstructor.get(DateFormatUtils.class);
        String str2 = null;
        if (vastScenario == null) {
            str = null;
        } else {
            str = vastScenario.vastMediaFileScenario.mediaFile.url;
        }
        if (vastScenario != null) {
            str2 = vastScenario.adServingId;
        }
        return new PlayerStateInfoMacros(r1, dateFormatUtils, str, str2);
    }

    static /* synthetic */ PlayerStateInfoMacrosProvider lambda$createRegistry$12(DiConstructor diConstructor) {
        return new PlayerStateInfoMacrosProvider() {
            public final Object apply(Object obj) {
                return DiMacros.lambda$createRegistry$11(DiConstructor.this, (VastScenario) obj);
            }
        };
    }

    static /* synthetic */ PublisherInfoMacro lambda$createRegistry$13(DiConstructor diConstructor) {
        return new PublisherInfoMacro((DataCollector) diConstructor.get(DataCollector.class));
    }

    static /* synthetic */ RegulationInfoMacros lambda$createRegistry$14(DiConstructor diConstructor) {
        return new RegulationInfoMacros((SomaGdprDataSource) diConstructor.get(SomaGdprDataSource.class), (DataCollector) diConstructor.get(DataCollector.class), $$Lambda$DiMacros$xheW8tq3xjPPNyy_G1jprmzd1Qo.INSTANCE);
    }

    static /* synthetic */ VerificationInfoMacros lambda$createRegistry$15(DiConstructor diConstructor) {
        return new VerificationInfoMacros();
    }

    static /* synthetic */ ErrorInfoMacros lambda$createRegistry$16(DiConstructor diConstructor) {
        return new ErrorInfoMacros();
    }

    private static DiRegistry provideClientInfoMacros() {
        return DiRegistry.m32956of($$Lambda$DiMacros$iDJ3QUJj0nBnxSRXUrBjg7WC1eE.INSTANCE);
    }

    static /* synthetic */ ClickInfoMacros lambda$provideClientInfoMacros$19(DiConstructor diConstructor) {
        return new ClickInfoMacros(new ClickInfoMacros.PxToDpConverter() {
            public final Object apply(Object obj) {
                return Integer.valueOf(UIUtils.pxToDp((Context) DiConstructor.this.get(Application.class), ((Float) obj).floatValue()));
            }
        });
    }
}
