package com.smaato.sdk.richmedia.mraid;

import android.content.Context;
import android.webkit.WebView;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.RequestInfoMapper;
import com.smaato.sdk.core.p378ad.RequestInfoProvider;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.richmedia.framework.OrientationChangeWatcher;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsBridge;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsEvents;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.AudioVolumeObserver;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidDataProvider;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidSupportsProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MusicPlaybackVolume;
import com.smaato.sdk.richmedia.mraid.dataprovider.PlacementType;
import com.smaato.sdk.richmedia.mraid.interactor.MraidInteractor;
import com.smaato.sdk.richmedia.mraid.presenter.MraidPresenter;
import com.smaato.sdk.richmedia.mraid.presenter.MraidPresenterImpl;
import com.smaato.sdk.richmedia.mraid.presenter.OrientationManager;
import com.smaato.sdk.richmedia.p387ad.LoadedWebViewCache;
import com.smaato.sdk.richmedia.p387ad.RichMediaAdObject;
import com.smaato.sdk.richmedia.util.ActivityHelper;
import com.smaato.sdk.richmedia.widget.RichMediaAdContentView;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.util.List;

public final class MraidConfigurator {
    private final AppBackgroundAwareHandler appBackgroundAwareHandler;
    private final AppBackgroundDetector appBackgroundDetector;
    private final AudioVolumeObserver audioVolumeObserver;
    private final Logger logger;
    private final MraidSupportsProperties mraidSupportsProperties;
    private final MusicPlaybackVolume musicPlaybackVolume;
    private final OrientationChangeWatcher orientationChangeWatcher;
    private final RequestInfoMapper requestInfoMapper;
    private final RequestInfoProvider requestInfoProvider;
    private final SdkConfiguration sdkConfiguration;
    private final MraidStateMachineFactory stateMachineFactory;
    private final LoadedWebViewCache webViewCache;
    private final RichMediaWebViewFactory webViewFactory;

    public MraidConfigurator(AppBackgroundAwareHandler appBackgroundAwareHandler2, OrientationChangeWatcher orientationChangeWatcher2, AppBackgroundDetector appBackgroundDetector2, Logger logger2, RequestInfoProvider requestInfoProvider2, SdkConfiguration sdkConfiguration2, MraidStateMachineFactory mraidStateMachineFactory, RichMediaWebViewFactory richMediaWebViewFactory, RequestInfoMapper requestInfoMapper2, MraidSupportsProperties mraidSupportsProperties2, AudioVolumeObserver audioVolumeObserver2, MusicPlaybackVolume musicPlaybackVolume2, LoadedWebViewCache loadedWebViewCache) {
        this.appBackgroundAwareHandler = (AppBackgroundAwareHandler) Objects.requireNonNull(appBackgroundAwareHandler2);
        this.orientationChangeWatcher = (OrientationChangeWatcher) Objects.requireNonNull(orientationChangeWatcher2);
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector2);
        this.requestInfoProvider = (RequestInfoProvider) Objects.requireNonNull(requestInfoProvider2);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration2);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.stateMachineFactory = (MraidStateMachineFactory) Objects.requireNonNull(mraidStateMachineFactory);
        this.webViewFactory = (RichMediaWebViewFactory) Objects.requireNonNull(richMediaWebViewFactory);
        this.requestInfoMapper = (RequestInfoMapper) Objects.requireNonNull(requestInfoMapper2);
        this.mraidSupportsProperties = (MraidSupportsProperties) Objects.requireNonNull(mraidSupportsProperties2);
        this.audioVolumeObserver = (AudioVolumeObserver) Objects.requireNonNull(audioVolumeObserver2);
        this.musicPlaybackVolume = (MusicPlaybackVolume) Objects.requireNonNull(musicPlaybackVolume2);
        this.webViewCache = (LoadedWebViewCache) Objects.requireNonNull(loadedWebViewCache);
    }

    public RichMediaAdContentView createViewForBanner(Context context, RichMediaAdObject richMediaAdObject, RichMediaAdContentView.Callback callback) {
        RichMediaWebView pop = this.webViewCache.pop(richMediaAdObject.getWebViewKey());
        if (pop == null) {
            ApiAdResponse apiAdResponse = richMediaAdObject.getSomaApiContext().getApiAdResponse();
            Logger logger2 = this.logger;
            LogDomain logDomain = LogDomain.AD;
            logger2.error(logDomain, "No pre-rendered WebView was found for the Ad with sessionId: " + apiAdResponse.getSessionId(), new Object[0]);
            return null;
        }
        return RichMediaAdContentView.create(this.logger, context, richMediaAdObject, callback, this.webViewFactory, pop, createPresenter(pop, this.stateMachineFactory.newInstanceForBanner(), PlacementType.INLINE));
    }

    public RichMediaAdContentView createViewForNative(Context context, String str, RichMediaWebView richMediaWebView, RichMediaAdContentView.Callback callback) {
        return RichMediaAdContentView.create(this.logger, context, str, callback, this.webViewFactory, richMediaWebView, createPresenter(richMediaWebView, this.stateMachineFactory.newInstanceForBanner(), PlacementType.INLINE));
    }

    public RichMediaAdContentView createViewForInterstitial(Context context, RichMediaAdObject richMediaAdObject, RichMediaAdContentView.Callback callback) {
        RichMediaWebView pop = this.webViewCache.pop(richMediaAdObject.getWebViewKey());
        if (pop == null) {
            ApiAdResponse apiAdResponse = richMediaAdObject.getSomaApiContext().getApiAdResponse();
            Logger logger2 = this.logger;
            LogDomain logDomain = LogDomain.AD;
            logger2.error(logDomain, "No pre-rendered WebView was found for the Ad with sessionId: " + apiAdResponse.getSessionId(), new Object[0]);
            return null;
        }
        return RichMediaAdContentView.create(this.logger, context, richMediaAdObject, callback, this.webViewFactory, pop, createPresenter(pop, this.stateMachineFactory.newInstanceForInterstitial(), PlacementType.INTERSTITIAL));
    }

    public MraidPresenter createPresenter(WebView webView, StateMachine<MraidStateMachineFactory.Event, MraidStateMachineFactory.State> stateMachine, PlacementType placementType) {
        WebView webView2 = webView;
        Context context = webView.getContext();
        MraidInteractor createInteractor = createInteractor(context, stateMachine, placementType, this.mraidSupportsProperties.getSupportedFeatures(context, webView2));
        MraidJsBridge mraidJsBridge = new MraidJsBridge(webView2, this.logger);
        MraidJsEvents mraidJsEvents = new MraidJsEvents(this.logger, mraidJsBridge);
        MraidJsMethods mraidJsMethods = new MraidJsMethods(mraidJsBridge);
        MraidJsProperties mraidJsProperties = new MraidJsProperties(this.logger, mraidJsBridge);
        RepeatableActionScheduler createRepeatableActionScheduler = createRepeatableActionScheduler(this.logger);
        OrientationManager orientationManager = new OrientationManager(this.logger, new ActivityHelper());
        OrientationChangeWatcher orientationChangeWatcher2 = this.orientationChangeWatcher;
        AppBackgroundDetector appBackgroundDetector2 = this.appBackgroundDetector;
        RequestInfoProvider requestInfoProvider2 = this.requestInfoProvider;
        SdkConfiguration sdkConfiguration2 = this.sdkConfiguration;
        RequestInfoMapper requestInfoMapper2 = this.requestInfoMapper;
        return new MraidPresenterImpl(createInteractor, mraidJsBridge, mraidJsEvents, mraidJsMethods, mraidJsProperties, createRepeatableActionScheduler, orientationChangeWatcher2, orientationManager, appBackgroundDetector2, requestInfoProvider2, sdkConfiguration2, requestInfoMapper2, this.mraidSupportsProperties, this.audioVolumeObserver);
    }

    private MraidInteractor createInteractor(Context context, StateMachine<MraidStateMachineFactory.Event, MraidStateMachineFactory.State> stateMachine, PlacementType placementType, List<String> list) {
        return new MraidInteractor(new MraidDataProvider(context, placementType, stateMachine.getCurrentState(), this.requestInfoProvider, this.sdkConfiguration, list, this.requestInfoMapper, this.musicPlaybackVolume), stateMachine);
    }

    private RepeatableActionScheduler createRepeatableActionScheduler(Logger logger2) {
        return new RepeatableActionScheduler(logger2, this.appBackgroundAwareHandler, 200);
    }
}
