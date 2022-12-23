package com.smaato.sdk.nativead.injections;

import android.app.Application;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.UbErrorReporting;
import com.smaato.sdk.core.framework.SimpleModuleInterface;
import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import com.smaato.sdk.core.linkhandler.LinkHandler;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.simplehttp.SimpleHttpClient;
import com.smaato.sdk.core.openmeasurement.OMImageViewabilityTracker;
import com.smaato.sdk.core.p379di.CoreDiNames;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.p380ub.UbCache;
import com.smaato.sdk.nativead.model.omTracking.OMTrackingRemoteSource;
import com.smaato.sdk.nativead.model.p386ub.UBRemoteSource;
import com.smaato.sdk.nativead.model.soma.SomaRemoteSource;
import com.smaato.sdk.nativead.model.utils.IconImagesLoader;
import com.smaato.sdk.nativead.model.utils.VastTagConverter;
import com.smaato.sdk.nativead.repository.NativeAdRepository;
import com.smaato.sdk.richmedia.util.HtmlPlayerUtils;

public class NativeModuleInterface implements SimpleModuleInterface {
    public String moduleDiName() {
        return "NativeModuleInterface";
    }

    public String version() {
        return "21.8.3";
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m32956of($$Lambda$NativeModuleInterface$PRg6HKD5Y_NOkp8ONn7wZtQPA.INSTANCE);
    }

    static /* synthetic */ void lambda$moduleDiRegistry$6(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(NativeAdRepository.class, $$Lambda$NativeModuleInterface$W2MzvD818jwYZ87hETLxJATMoM0.INSTANCE);
        diRegistry.registerSingletonFactory(OMTrackingRemoteSource.class, $$Lambda$NativeModuleInterface$jwjJFaRc5QycE8kwwiTTErPpslc.INSTANCE);
        diRegistry.registerSingletonFactory(SomaRemoteSource.class, $$Lambda$NativeModuleInterface$PQzUtj49PJPTXt1PCOdPUBkWT70.INSTANCE);
        diRegistry.registerSingletonFactory(UBRemoteSource.class, $$Lambda$NativeModuleInterface$W8JeOgODajdI8oI1kuHSyWULm4.INSTANCE);
        diRegistry.registerSingletonFactory(IconImagesLoader.class, $$Lambda$NativeModuleInterface$8jshwuKhHV24zEfH9V_NKtQma0k.INSTANCE);
        diRegistry.registerSingletonFactory(VastTagConverter.class, $$Lambda$NativeModuleInterface$t75YZyW7AnYw6Gcrz9ICXIXE2k0.INSTANCE);
    }

    static /* synthetic */ NativeAdRepository lambda$moduleDiRegistry$0(DiConstructor diConstructor) {
        return new NativeAdRepository((SomaRemoteSource) diConstructor.get(SomaRemoteSource.class), (SimpleHttpClient) diConstructor.get(SimpleHttpClient.class), (LinkHandler) diConstructor.get(LinkHandler.class), (OMTrackingRemoteSource) diConstructor.get(OMTrackingRemoteSource.class), (UBRemoteSource) diConstructor.get(UBRemoteSource.class), (Logger) diConstructor.get(Logger.class), (VastTagConverter) diConstructor.get(VastTagConverter.class));
    }

    static /* synthetic */ OMTrackingRemoteSource lambda$moduleDiRegistry$1(DiConstructor diConstructor) {
        return new OMTrackingRemoteSource((OMImageViewabilityTracker) diConstructor.get(OMImageViewabilityTracker.class));
    }

    static /* synthetic */ SomaRemoteSource lambda$moduleDiRegistry$2(DiConstructor diConstructor) {
        return new SomaRemoteSource((HttpClient) diConstructor.get(CoreLightModuleInterface.NAME_SOMA_HTTP_HANDLER, HttpClient.class), (String) diConstructor.get(CoreDiNames.SOMA_API_URL, String.class), (IconImagesLoader) diConstructor.get(IconImagesLoader.class), (Logger) diConstructor.get(Logger.class));
    }

    static /* synthetic */ UBRemoteSource lambda$moduleDiRegistry$3(DiConstructor diConstructor) {
        return new UBRemoteSource((UbCache) diConstructor.get(UbCache.class), (UbErrorReporting) diConstructor.getOrNull(UbErrorReporting.class), (IconImagesLoader) diConstructor.get(IconImagesLoader.class), (Logger) diConstructor.get(Logger.class), SmaatoSdk.getPublisherId());
    }

    static /* synthetic */ IconImagesLoader lambda$moduleDiRegistry$4(DiConstructor diConstructor) {
        return new IconImagesLoader((SimpleHttpClient) diConstructor.get(SimpleHttpClient.class), (Logger) diConstructor.get(Logger.class), (Application) diConstructor.get(Application.class));
    }

    static /* synthetic */ VastTagConverter lambda$moduleDiRegistry$5(DiConstructor diConstructor) {
        return new VastTagConverter((HtmlPlayerUtils) diConstructor.get(HtmlPlayerUtils.class));
    }
}
