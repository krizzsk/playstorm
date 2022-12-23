package com.smaato.sdk.richmedia.mraid.presenter;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.p378ad.RequestInfoMapper;
import com.smaato.sdk.core.p378ad.RequestInfoProvider;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Size;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.core.util.ViewUtils;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.notifier.ChangeNotifier;
import com.smaato.sdk.core.util.p382fi.BiConsumer;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.framework.OrientationChangeWatcher;
import com.smaato.sdk.richmedia.mraid.RepeatableActionScheduler;
import com.smaato.sdk.richmedia.mraid.Views;
import com.smaato.sdk.richmedia.mraid.bridge.ErrorListener;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsBridge;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsEvents;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.AudioVolumeObserver;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidAppOrientation;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidAudioVolumeLevel;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidExpandProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidExposureProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidLocationProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidOrientationProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidResizeProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidSupportsProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.PlacementType;
import com.smaato.sdk.richmedia.mraid.interactor.MraidInteractor;
import com.smaato.sdk.richmedia.mraid.mvp.BasePresenter;
import com.smaato.sdk.richmedia.mraid.presenter.MraidPresenterImpl;
import com.smaato.sdk.richmedia.util.RectUtils;
import com.smaato.sdk.richmedia.widget.RichMediaAdContentView;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.util.List;

public final class MraidPresenterImpl extends BasePresenter<RichMediaAdContentView> implements MraidPresenter {
    private BiConsumer<String, String> adViolationCallback;
    private final AppBackgroundDetector appBackgroundDetector;
    private final AppBackgroundDetector.Listener appBackgroundListener;
    private final AudioVolumeObserver audioVolumeObserver;
    /* access modifiers changed from: private */
    public Consumer<Whatever> collapseCallback;
    /* access modifiers changed from: private */
    public BiConsumer<String, MraidExpandProperties> expandCallback;
    /* access modifiers changed from: private */
    public Consumer<Whatever> hideCallback;
    /* access modifiers changed from: private */
    public final MraidInteractor interactor;
    private final MraidInteractor.Callback interactorCallback = new MraidInteractor.Callback() {
        public void processExposureChange(MraidExposureProperties mraidExposureProperties) {
            MraidPresenterImpl.this.mraidJsEvents.fireExposureChangeEvent(mraidExposureProperties);
        }

        public void processCurrentAppOrientationChange(MraidAppOrientation mraidAppOrientation) {
            MraidPresenterImpl.this.mraidJsProperties.setCurrentAppOrientation(mraidAppOrientation);
        }

        public void processStateChange(MraidStateMachineFactory.State state) {
            MraidPresenterImpl.this.mraidJsEvents.fireStateChangeEvent(state);
        }

        public /* synthetic */ void lambda$processOrientationPropertiesChange$0$MraidPresenterImpl$1(MraidOrientationProperties mraidOrientationProperties, RichMediaAdContentView richMediaAdContentView) {
            MraidPresenterImpl.this.orientationManager.applyOrientationProperties(richMediaAdContentView.getContext(), mraidOrientationProperties);
        }

        public void processOrientationPropertiesChange(MraidOrientationProperties mraidOrientationProperties) {
            MraidPresenterImpl.this.ifViewAttached(new Consumer(mraidOrientationProperties) {
                public final /* synthetic */ MraidOrientationProperties f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    MraidPresenterImpl.C112501.this.lambda$processOrientationPropertiesChange$0$MraidPresenterImpl$1(this.f$1, (RichMediaAdContentView) obj);
                }
            });
        }

        public /* synthetic */ void lambda$processRestoreOriginalOrientation$1$MraidPresenterImpl$1(RichMediaAdContentView richMediaAdContentView) {
            MraidPresenterImpl.this.orientationManager.restoreOriginalOrientation(richMediaAdContentView.getContext());
        }

        public void processRestoreOriginalOrientation() {
            MraidPresenterImpl.this.ifViewAttached(new Consumer() {
                public final void accept(Object obj) {
                    MraidPresenterImpl.C112501.this.lambda$processRestoreOriginalOrientation$1$MraidPresenterImpl$1((RichMediaAdContentView) obj);
                }
            });
        }

        public void processCollapse() {
            Objects.onNotNull(MraidPresenterImpl.this.collapseCallback, $$Lambda$MraidPresenterImpl$1$WHU0s2JdHVvOpMznN9f_q4IuU8.INSTANCE);
        }

        public void processHide() {
            Objects.onNotNull(MraidPresenterImpl.this.hideCallback, $$Lambda$MraidPresenterImpl$1$I2rHAM4MZxhRt3yThn3zT4hAgvo.INSTANCE);
        }

        public void processCurrentPositionChange(Rect rect) {
            MraidPresenterImpl.this.mraidJsProperties.setCurrentPosition(rect);
            MraidPresenterImpl.this.mraidJsEvents.fireSizeChangeEvent(rect);
        }

        public void processDefaultPositionChange(Rect rect) {
            MraidPresenterImpl.this.mraidJsProperties.setDefaultPosition(rect);
        }

        public void processScreenSizeChange(Rect rect) {
            MraidPresenterImpl.this.mraidJsProperties.setScreenSize(new Size(rect.width(), rect.height()));
        }

        public void processMaxSizeChange(Rect rect) {
            MraidPresenterImpl.this.mraidJsProperties.setMaxSize(new Size(rect.width(), rect.height()));
        }

        public void processOpen(String str) {
            Objects.onNotNull(MraidPresenterImpl.this.openCallback, new Consumer(str) {
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    ((Consumer) obj).accept(this.f$0);
                }
            });
        }

        public void processError(String str, String str2) {
            MraidPresenterImpl.this.mraidJsEvents.fireErrorEvent(str, str2);
        }

        public void processExpand(String str) {
            MraidPresenterImpl.this.ifViewAttached(new Consumer(MraidPresenterImpl.this.mraidJsProperties.getOrientationPropertiesChangeSender().getValue(), str) {
                public final /* synthetic */ MraidOrientationProperties f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void accept(Object obj) {
                    MraidPresenterImpl.C112501.this.lambda$processExpand$6$MraidPresenterImpl$1(this.f$1, this.f$2, (RichMediaAdContentView) obj);
                }
            });
        }

        public /* synthetic */ void lambda$processExpand$6$MraidPresenterImpl$1(MraidOrientationProperties mraidOrientationProperties, String str, RichMediaAdContentView richMediaAdContentView) {
            MraidPresenterImpl.this.orientationManager.applyOrientationProperties(richMediaAdContentView.getContext(), mraidOrientationProperties);
            Objects.onNotNull(MraidPresenterImpl.this.expandCallback, new Consumer(str) {
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    MraidPresenterImpl.C112501.this.lambda$processExpand$5$MraidPresenterImpl$1(this.f$1, (BiConsumer) obj);
                }
            });
        }

        public /* synthetic */ void lambda$processExpand$5$MraidPresenterImpl$1(String str, BiConsumer biConsumer) {
            biConsumer.accept(str, MraidPresenterImpl.this.mraidJsProperties.getExpandProperties());
        }

        public void processResize(Rect rect, Rect rect2) {
            MraidResizeProperties resizeProperties = MraidPresenterImpl.this.mraidJsProperties.getResizeProperties();
            if (resizeProperties == null) {
                MraidPresenterImpl.this.interactor.handleFailedToResize("Resize properties should be set before resize");
                return;
            }
            MraidPresenterImpl.this.ifViewAttached(new Consumer(resizeProperties.getRectRelativeToMaxSize(rect, rect2), rect2) {
                public final /* synthetic */ Rect f$1;
                public final /* synthetic */ Rect f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void accept(Object obj) {
                    MraidPresenterImpl.C112501.this.lambda$processResize$8$MraidPresenterImpl$1(this.f$1, this.f$2, (RichMediaAdContentView) obj);
                }
            });
        }

        public /* synthetic */ void lambda$processResize$8$MraidPresenterImpl$1(Rect rect, Rect rect2, RichMediaAdContentView richMediaAdContentView) {
            Context context = richMediaAdContentView.getContext();
            Rect mapToPx = RectUtils.mapToPx(context, rect);
            Objects.onNotNull(MraidPresenterImpl.this.resizeCallback, new Consumer(RectUtils.mapToPx(context, rect2), mapToPx) {
                public final /* synthetic */ Rect f$0;
                public final /* synthetic */ Rect f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    ((Consumer) obj).accept(new ResizeParams(this.f$0, this.f$1));
                }
            });
        }

        public void processAudioVolumeChange(MraidAudioVolumeLevel mraidAudioVolumeLevel) {
            MraidPresenterImpl.this.mraidJsEvents.fireAudioVolumeChangeEvent(mraidAudioVolumeLevel);
        }

        public void processLocationPropertiesChange(MraidLocationProperties mraidLocationProperties) {
            MraidPresenterImpl.this.mraidJsProperties.setLocation(mraidLocationProperties);
        }

        public void processPlacementType(PlacementType placementType) {
            MraidPresenterImpl.this.mraidJsProperties.setPlacementType(placementType);
        }

        public void processSupportedFeatures(List<String> list) {
            MraidPresenterImpl.this.mraidJsProperties.setSupportedFeatures(list, MraidPresenterImpl.this.mraidSupportsProperties.getAllMraidFeatures());
        }

        public void processViewableChange(boolean z) {
            MraidPresenterImpl.this.mraidJsEvents.fireViewableChangeEvent(z);
        }

        public void processVisibilityParamsCheck() {
            MraidPresenterImpl.this.checkVisibilityParams();
        }

        public void processLoadCompleted() {
            MraidPresenterImpl.this.mraidJsBridge.fireReadyEvent();
        }

        public void processPlayVideo(String str) {
            Objects.onNotNull(MraidPresenterImpl.this.playVideoCallback, new Consumer(str) {
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    ((Consumer) obj).accept(this.f$0);
                }
            });
        }
    };
    /* access modifiers changed from: private */
    public final MraidJsBridge mraidJsBridge;
    /* access modifiers changed from: private */
    public final MraidJsEvents mraidJsEvents;
    private final MraidJsMethods mraidJsMethods;
    /* access modifiers changed from: private */
    public final MraidJsProperties mraidJsProperties;
    /* access modifiers changed from: private */
    public final MraidSupportsProperties mraidSupportsProperties;
    private AudioVolumeObserver.Listener onAudioVolumeChangedListener = new AudioVolumeObserver.Listener() {
        public final void onVolumeChange(int i, int i2) {
            MraidPresenterImpl.this.lambda$new$0$MraidPresenterImpl(i, i2);
        }
    };
    /* access modifiers changed from: private */
    public Consumer<String> openCallback;
    private final OrientationChangeWatcher.Listener orientationChangeListener = new OrientationChangeWatcher.Listener() {
        public final void onOrientationChange() {
            MraidPresenterImpl.this.checkOrientationDependentParams();
        }
    };
    private final OrientationChangeWatcher orientationChangeWatcher;
    /* access modifiers changed from: private */
    public final OrientationManager orientationManager;
    private final ChangeNotifier.Listener<MraidOrientationProperties> orientationPropertiesChangeListener;
    /* access modifiers changed from: private */
    public Consumer<String> playVideoCallback;
    private final RepeatableActionScheduler repeatableActionScheduler;
    private final RequestInfoMapper requestInfoMapper;
    private final RequestInfoProvider requestInfoProvider;
    /* access modifiers changed from: private */
    public Consumer<ResizeParams> resizeCallback;
    private final SdkConfiguration sdkConfiguration;
    private Consumer<Whatever> unloadCallback;

    public MraidPresenterImpl(MraidInteractor mraidInteractor, MraidJsBridge mraidJsBridge2, MraidJsEvents mraidJsEvents2, MraidJsMethods mraidJsMethods2, MraidJsProperties mraidJsProperties2, RepeatableActionScheduler repeatableActionScheduler2, OrientationChangeWatcher orientationChangeWatcher2, OrientationManager orientationManager2, AppBackgroundDetector appBackgroundDetector2, RequestInfoProvider requestInfoProvider2, SdkConfiguration sdkConfiguration2, RequestInfoMapper requestInfoMapper2, MraidSupportsProperties mraidSupportsProperties2, AudioVolumeObserver audioVolumeObserver2) {
        C112512 r1 = new AppBackgroundDetector.Listener() {
            public void onAppEnteredInBackground() {
                MraidPresenterImpl.this.unsubscribeFromOrientationChange();
            }

            public void onAppEnteredInForeground() {
                MraidPresenterImpl.this.subscribeToOrientationChange();
            }
        };
        this.appBackgroundListener = r1;
        this.interactor = (MraidInteractor) Objects.requireNonNull(mraidInteractor);
        this.mraidJsBridge = (MraidJsBridge) Objects.requireNonNull(mraidJsBridge2);
        this.mraidJsEvents = (MraidJsEvents) Objects.requireNonNull(mraidJsEvents2);
        this.mraidJsMethods = (MraidJsMethods) Objects.requireNonNull(mraidJsMethods2);
        this.mraidJsProperties = (MraidJsProperties) Objects.requireNonNull(mraidJsProperties2);
        this.repeatableActionScheduler = (RepeatableActionScheduler) Objects.requireNonNull(repeatableActionScheduler2);
        this.orientationChangeWatcher = (OrientationChangeWatcher) Objects.requireNonNull(orientationChangeWatcher2);
        this.orientationManager = (OrientationManager) Objects.requireNonNull(orientationManager2);
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector2);
        this.requestInfoProvider = (RequestInfoProvider) Objects.requireNonNull(requestInfoProvider2);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration2);
        this.requestInfoMapper = (RequestInfoMapper) Objects.requireNonNull(requestInfoMapper2);
        this.mraidSupportsProperties = (MraidSupportsProperties) Objects.requireNonNull(mraidSupportsProperties2);
        this.audioVolumeObserver = (AudioVolumeObserver) Objects.requireNonNull(audioVolumeObserver2);
        java.util.Objects.requireNonNull(mraidInteractor);
        MraidInteractor mraidInteractor2 = mraidInteractor;
        this.orientationPropertiesChangeListener = new ChangeNotifier.Listener() {
            public final void onNextValue(Object obj) {
                MraidInteractor.this.handleOrientationPropertiesChange((MraidOrientationProperties) obj);
            }
        };
        AppBackgroundDetector appBackgroundDetector3 = appBackgroundDetector2;
        appBackgroundDetector2.addListener(r1, false);
        setComponentCallbacks();
        setJsCallbacks();
    }

    private void setComponentCallbacks() {
        this.interactor.setCallback(this.interactorCallback);
        MraidJsProperties mraidJsProperties2 = this.mraidJsProperties;
        MraidInteractor.Callback callback = this.interactorCallback;
        java.util.Objects.requireNonNull(callback);
        mraidJsProperties2.setErrorListener(new ErrorListener() {
            public final void onError(String str, String str2) {
                MraidInteractor.Callback.this.processError(str, str2);
            }
        });
    }

    private void setJsCallbacks() {
        MraidJsMethods mraidJsMethods2 = this.mraidJsMethods;
        MraidInteractor mraidInteractor = this.interactor;
        java.util.Objects.requireNonNull(mraidInteractor);
        mraidJsMethods2.setAddEventListenerCallback(new Consumer() {
            public final void accept(Object obj) {
                MraidInteractor.this.handleAddEventListener((String) obj);
            }
        });
        MraidJsMethods mraidJsMethods3 = this.mraidJsMethods;
        MraidInteractor mraidInteractor2 = this.interactor;
        java.util.Objects.requireNonNull(mraidInteractor2);
        mraidJsMethods3.setOpenCallback(new Consumer() {
            public final void accept(Object obj) {
                MraidInteractor.this.handleUrlOpen((String) obj);
            }
        });
        this.mraidJsMethods.setResizeCallback(new Consumer() {
            public final void accept(Object obj) {
                MraidPresenterImpl.this.lambda$setJsCallbacks$1$MraidPresenterImpl((Whatever) obj);
            }
        });
        MraidJsMethods mraidJsMethods4 = this.mraidJsMethods;
        MraidInteractor mraidInteractor3 = this.interactor;
        java.util.Objects.requireNonNull(mraidInteractor3);
        mraidJsMethods4.setExpandCallback(new Consumer() {
            public final void accept(Object obj) {
                MraidInteractor.this.handleExpand((String) obj);
            }
        });
        this.mraidJsMethods.setUnloadCallback(new Consumer() {
            public final void accept(Object obj) {
                MraidPresenterImpl.this.lambda$setJsCallbacks$3$MraidPresenterImpl((Whatever) obj);
            }
        });
        MraidJsMethods mraidJsMethods5 = this.mraidJsMethods;
        MraidInteractor mraidInteractor4 = this.interactor;
        java.util.Objects.requireNonNull(mraidInteractor4);
        mraidJsMethods5.setPlayVideoCallback(new Consumer() {
            public final void accept(Object obj) {
                MraidInteractor.this.handlePlayVideo((String) obj);
            }
        });
        this.mraidJsMethods.setCloseCallback(new Consumer() {
            public final void accept(Object obj) {
                MraidPresenterImpl.this.lambda$setJsCallbacks$4$MraidPresenterImpl((Whatever) obj);
            }
        });
        this.mraidJsMethods.setAdViolationCallback(new BiConsumer() {
            public final void accept(Object obj, Object obj2) {
                MraidPresenterImpl.this.lambda$setJsCallbacks$6$MraidPresenterImpl((String) obj, (String) obj2);
            }
        });
    }

    public /* synthetic */ void lambda$setJsCallbacks$1$MraidPresenterImpl(Whatever whatever) {
        this.interactor.handleResize(this.mraidJsProperties.getResizeProperties());
    }

    public /* synthetic */ void lambda$setJsCallbacks$3$MraidPresenterImpl(Whatever whatever) {
        Objects.onNotNull(this.unloadCallback, new Consumer() {
            public final void accept(Object obj) {
                ((Consumer) obj).accept(Whatever.this);
            }
        });
    }

    public /* synthetic */ void lambda$setJsCallbacks$4$MraidPresenterImpl(Whatever whatever) {
        this.interactor.handleClose();
    }

    public /* synthetic */ void lambda$setJsCallbacks$6$MraidPresenterImpl(String str, String str2) {
        Objects.onNotNull(this.adViolationCallback, new Consumer(str, str2) {
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((BiConsumer) obj).accept(this.f$0, this.f$1);
            }
        });
    }

    public void attachView(RichMediaAdContentView richMediaAdContentView) {
        super.attachView(richMediaAdContentView);
        updateSupportedFeatures(richMediaAdContentView);
        RepeatableActionScheduler repeatableActionScheduler2 = this.repeatableActionScheduler;
        MraidInteractor mraidInteractor = this.interactor;
        java.util.Objects.requireNonNull(mraidInteractor);
        repeatableActionScheduler2.start(new Runnable() {
            public final void run() {
                MraidInteractor.this.handleVisibilityParamsCheck();
            }
        });
        subscribeToOrientationChange();
        this.audioVolumeObserver.register(this.onAudioVolumeChangedListener);
    }

    public void detachView() {
        super.detachView();
        this.repeatableActionScheduler.stop();
        unsubscribeFromOrientationChange();
        this.audioVolumeObserver.unregister(this.onAudioVolumeChangedListener);
    }

    public void destroy() {
        this.appBackgroundDetector.deleteListener(this.appBackgroundListener);
    }

    private void updateSupportedFeatures(RichMediaAdContentView richMediaAdContentView) {
        this.interactor.handleSupportedFeaturesChange(this.mraidSupportsProperties.getSupportedFeatures(richMediaAdContentView.getContext(), richMediaAdContentView.getWebView()));
    }

    /* access modifiers changed from: private */
    public void checkVisibilityParams() {
        ifViewAttached(new Consumer() {
            public final void accept(Object obj) {
                MraidPresenterImpl.this.lambda$checkVisibilityParams$7$MraidPresenterImpl((RichMediaAdContentView) obj);
            }
        });
    }

    public /* synthetic */ void lambda$checkVisibilityParams$7$MraidPresenterImpl(RichMediaAdContentView richMediaAdContentView) {
        Context context = richMediaAdContentView.getContext();
        RichMediaWebView webView = richMediaAdContentView.getWebView();
        this.interactor.handleDefaultPositionChange(RectUtils.mapToDp(context, Views.positionOnScreenOf(richMediaAdContentView)));
        this.interactor.handleCurrentPositionChange(RectUtils.mapToDp(context, Views.positionOnScreenOf(webView)));
        Views.ViewVisibilityContext visibilityContextRelativeToView = Views.visibilityContextRelativeToView(webView);
        MraidExposureProperties valueOf = MraidExposureProperties.valueOf(visibilityContextRelativeToView.visibilityPercent, RectUtils.mapToDp(context, visibilityContextRelativeToView.visibleRect));
        this.interactor.handleExposureChange(valueOf);
        this.interactor.handleViewableChange(Views.isViewable(valueOf.exposedPercentage));
        this.interactor.handleLocationPropertiesChange(MraidLocationProperties.create(this.requestInfoProvider, this.sdkConfiguration, this.requestInfoMapper));
    }

    public void onHtmlLoaded() {
        checkOrientationDependentParams();
        this.interactor.handleHtmlLoaded();
    }

    public void handleMraidUrl(String str, boolean z) {
        this.mraidJsBridge.handleMraidUrl(str, z);
    }

    public void setOnOpenCallback(Consumer<String> consumer) {
        this.openCallback = consumer;
    }

    public void setOnPlayVideoCallback(Consumer<String> consumer) {
        this.playVideoCallback = consumer;
    }

    public void setOnExpandCallback(BiConsumer<String, MraidExpandProperties> biConsumer) {
        this.expandCallback = biConsumer;
    }

    public void handleClose() {
        this.interactor.handleClose();
    }

    public void setOnCollapseCallback(Consumer<Whatever> consumer) {
        this.collapseCallback = consumer;
    }

    public void setOnHideCallback(Consumer<Whatever> consumer) {
        this.hideCallback = consumer;
    }

    public void setOnUnloadCallback(Consumer<Whatever> consumer) {
        this.unloadCallback = consumer;
    }

    public void setResizeCallback(Consumer<ResizeParams> consumer) {
        this.resizeCallback = consumer;
    }

    public void onWasResized() {
        this.interactor.handleWasResized();
    }

    public void onFailedToResize(String str) {
        this.interactor.handleFailedToResize(str);
    }

    public void onFailedToExpand() {
        this.interactor.handleFailedToExpand();
    }

    public void onWasExpanded() {
        this.interactor.handleWasExpanded();
    }

    public void onWasClosed() {
        this.interactor.handleWasClosed();
    }

    public void setAdViolationCallback(BiConsumer<String, String> biConsumer) {
        this.adViolationCallback = biConsumer;
    }

    /* access modifiers changed from: private */
    /* renamed from: audioVolumeChangeNotification */
    public void lambda$new$0$MraidPresenterImpl(int i, int i2) {
        this.interactor.handleAudioVolumeLevelChange(i, i2);
    }

    /* access modifiers changed from: private */
    public void subscribeToOrientationChange() {
        this.orientationChangeWatcher.addListener(this.orientationChangeListener);
        this.mraidJsProperties.getOrientationPropertiesChangeSender().addListener(this.orientationPropertiesChangeListener);
    }

    /* access modifiers changed from: private */
    public void checkOrientationDependentParams() {
        ifViewAttached(new Consumer() {
            public final void accept(Object obj) {
                MraidPresenterImpl.this.lambda$checkOrientationDependentParams$9$MraidPresenterImpl((RichMediaAdContentView) obj);
            }
        });
    }

    public /* synthetic */ void lambda$checkOrientationDependentParams$9$MraidPresenterImpl(RichMediaAdContentView richMediaAdContentView) {
        Context context = richMediaAdContentView.getContext();
        this.interactor.handleOrientationChange(MraidAppOrientation.from(context));
        Size displaySizeInDp = UIUtils.getDisplaySizeInDp(context);
        Rect rect = new Rect(0, 0, displaySizeInDp.width, displaySizeInDp.height);
        this.interactor.handleScreenSizeInDpChange(rect);
        View rootView = ViewUtils.getRootView(richMediaAdContentView);
        if (rootView == null) {
            this.interactor.handleScreenMaxSizeInDpChange(rect);
        } else {
            rootView.post(new Runnable(rootView, context) {
                public final /* synthetic */ View f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    MraidPresenterImpl.this.lambda$checkOrientationDependentParams$8$MraidPresenterImpl(this.f$1, this.f$2);
                }
            });
        }
    }

    public /* synthetic */ void lambda$checkOrientationDependentParams$8$MraidPresenterImpl(View view, Context context) {
        this.interactor.handleScreenMaxSizeInDpChange(RectUtils.mapToDp(context, Views.positionOnScreenOf(view)));
    }

    /* access modifiers changed from: private */
    public void unsubscribeFromOrientationChange() {
        this.orientationChangeWatcher.removeListener(this.orientationChangeListener);
        this.mraidJsProperties.getOrientationPropertiesChangeSender().removeListener(this.orientationPropertiesChangeListener);
    }
}
