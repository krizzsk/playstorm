package com.smaato.sdk.richmedia.mraid.interactor;

import android.graphics.Rect;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.notifier.ChangeNotifier;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsEvents;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidAppOrientation;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidAudioVolumeLevel;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidDataProvider;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidExposureProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidLocationProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidOrientationProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidResizeProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory;
import com.smaato.sdk.richmedia.mraid.dataprovider.PlacementType;
import com.smaato.sdk.richmedia.mraid.interactor.MraidInteractor;
import java.util.List;

public final class MraidInteractor {
    private final ChangeNotifier.Listener<MraidAudioVolumeLevel> audioVolumeLevelListener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            MraidInteractor.this.processAudioVolumeLevel((MraidAudioVolumeLevel) obj);
        }
    };
    private Callback callback;
    private final ChangeNotifier.Listener<Rect> currentPositionListener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            MraidInteractor.this.processCurrentPosition((Rect) obj);
        }
    };
    private final MraidDataProvider dataProvider;
    private final ChangeNotifier.Listener<Rect> defaultPositionListener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            MraidInteractor.this.processDefaultPosition((Rect) obj);
        }
    };
    private final ChangeNotifier.Listener<MraidExposureProperties> exposureListener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            MraidInteractor.this.processExposureProperties((MraidExposureProperties) obj);
        }
    };
    private final ChangeNotifier.Listener<MraidLocationProperties> locationPropertiesChangeListener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            MraidInteractor.this.processLocationProperties((MraidLocationProperties) obj);
        }
    };
    private final ChangeNotifier.Listener<Rect> maxSizeListener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            MraidInteractor.this.processMaxSize((Rect) obj);
        }
    };
    private final ChangeNotifier.Listener<MraidAppOrientation> orientationListener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            MraidInteractor.this.processAppOrientation((MraidAppOrientation) obj);
        }
    };
    private final ChangeNotifier.Listener<Rect> screenSizeListener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            MraidInteractor.this.processScreenSize((Rect) obj);
        }
    };
    private final ChangeNotifier.Listener<MraidStateMachineFactory.State> stateChangeListener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            MraidInteractor.this.processChangeState((MraidStateMachineFactory.State) obj);
        }
    };
    private final StateMachine<MraidStateMachineFactory.Event, MraidStateMachineFactory.State> stateMachine;
    private final ChangeNotifier.Listener<List<String>> supportedFeaturesChangeListener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            MraidInteractor.this.processSupportedFeatures((List) obj);
        }
    };
    private String urlToExpand;
    private final ChangeNotifier.Listener<Boolean> viewableChangeListener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            MraidInteractor.this.processViewableChange((Boolean) obj);
        }
    };

    public interface Callback {
        void processAudioVolumeChange(MraidAudioVolumeLevel mraidAudioVolumeLevel);

        void processCollapse();

        void processCurrentAppOrientationChange(MraidAppOrientation mraidAppOrientation);

        void processCurrentPositionChange(Rect rect);

        void processDefaultPositionChange(Rect rect);

        void processError(String str, String str2);

        void processExpand(String str);

        void processExposureChange(MraidExposureProperties mraidExposureProperties);

        void processHide();

        void processLoadCompleted();

        void processLocationPropertiesChange(MraidLocationProperties mraidLocationProperties);

        void processMaxSizeChange(Rect rect);

        void processOpen(String str);

        void processOrientationPropertiesChange(MraidOrientationProperties mraidOrientationProperties);

        void processPlacementType(PlacementType placementType);

        void processPlayVideo(String str);

        void processResize(Rect rect, Rect rect2);

        void processRestoreOriginalOrientation();

        void processScreenSizeChange(Rect rect);

        void processStateChange(MraidStateMachineFactory.State state);

        void processSupportedFeatures(List<String> list);

        void processViewableChange(boolean z);

        void processVisibilityParamsCheck();
    }

    public MraidInteractor(MraidDataProvider mraidDataProvider, StateMachine<MraidStateMachineFactory.Event, MraidStateMachineFactory.State> stateMachine2) {
        this.dataProvider = (MraidDataProvider) Objects.requireNonNull(mraidDataProvider);
        this.stateMachine = (StateMachine) Objects.requireNonNull(stateMachine2);
        stateMachine2.addListener(new StateMachine.Listener() {
            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                MraidInteractor.this.lambda$new$0$MraidInteractor((MraidStateMachineFactory.State) obj, (MraidStateMachineFactory.State) obj2, metadata);
            }
        });
        initDataChangeListeners();
    }

    public /* synthetic */ void lambda$new$0$MraidInteractor(MraidStateMachineFactory.State state, MraidStateMachineFactory.State state2, Metadata metadata) {
        onStateChanged(state2);
    }

    private void initDataChangeListeners() {
        this.dataProvider.getOrientationChangeSender().addListener(this.orientationListener);
        this.dataProvider.getExposureChangeSender().addListener(this.exposureListener);
        this.dataProvider.getCurrentPositionInDpChangeSender().addListener(this.currentPositionListener);
        this.dataProvider.getDefaultPositionInDpChangeSender().addListener(this.defaultPositionListener);
        this.dataProvider.getScreenSizeInDpSender().addListener(this.screenSizeListener);
        this.dataProvider.getMaxSizeInDpChangeSender().addListener(this.maxSizeListener);
        this.dataProvider.getAudioVolumeChangeSender().addListener(this.audioVolumeLevelListener);
        this.dataProvider.getStateChangeSender().addListener(this.stateChangeListener);
        this.dataProvider.getSupportedFeatures().addListener(this.supportedFeaturesChangeListener);
        this.dataProvider.getViewableChangeSender().addListener(this.viewableChangeListener);
        this.dataProvider.getLocationPropertiesSender().addListener(this.locationPropertiesChangeListener);
    }

    /* renamed from: com.smaato.sdk.richmedia.mraid.interactor.MraidInteractor$1 */
    static /* synthetic */ class C112491 {

        /* renamed from: $SwitchMap$com$smaato$sdk$richmedia$mraid$dataprovider$MraidStateMachineFactory$State */
        static final /* synthetic */ int[] f27149x94e48a94;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State[] r0 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27149x94e48a94 = r0
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State r1 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.RESIZE_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27149x94e48a94     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State r1 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.EXPAND_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27149x94e48a94     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State r1 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.COLLAPSE_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27149x94e48a94     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State r1 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27149x94e48a94     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State r1 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.LOADING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27149x94e48a94     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State r1 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27149x94e48a94     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State r1 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.RESIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f27149x94e48a94     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State r1 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.EXPANDED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.mraid.interactor.MraidInteractor.C112491.<clinit>():void");
        }
    }

    private void onStateChanged(MraidStateMachineFactory.State state) {
        int i = C112491.f27149x94e48a94[state.ordinal()];
        if (i == 1) {
            Objects.onNotNull(this.callback, new Consumer() {
                public final void accept(Object obj) {
                    MraidInteractor.this.lambda$onStateChanged$1$MraidInteractor((MraidInteractor.Callback) obj);
                }
            });
        } else if (i == 2) {
            Objects.onNotNull(this.callback, new Consumer() {
                public final void accept(Object obj) {
                    MraidInteractor.this.lambda$onStateChanged$2$MraidInteractor((MraidInteractor.Callback) obj);
                }
            });
            this.urlToExpand = null;
        } else if (i != 3) {
            if (i == 4) {
                Objects.onNotNull(this.callback, $$Lambda$cN95_zKCa6lQzVxILzp0xtpVZ9Y.INSTANCE);
            }
            this.dataProvider.getStateChangeSender().newValue(state);
        } else {
            Objects.onNotNull(this.callback, $$Lambda$vbBNRK9ohUBOPxc9kqMoXnTFspI.INSTANCE);
        }
    }

    public /* synthetic */ void lambda$onStateChanged$1$MraidInteractor(Callback callback2) {
        Rect value = this.dataProvider.getMaxSizeInDpChangeSender().getValue();
        callback2.processResize(this.dataProvider.getCurrentPositionInDpChangeSender().getValue(), new Rect(0, 0, value.width(), value.height()));
    }

    public /* synthetic */ void lambda$onStateChanged$2$MraidInteractor(Callback callback2) {
        callback2.processExpand(this.urlToExpand);
    }

    /* access modifiers changed from: private */
    public void processChangeState(MraidStateMachineFactory.State state) {
        Objects.onNotNull(this.callback, new Consumer() {
            public final void accept(Object obj) {
                ((MraidInteractor.Callback) obj).processStateChange(MraidStateMachineFactory.State.this);
            }
        });
    }

    /* access modifiers changed from: private */
    public void processExposureProperties(MraidExposureProperties mraidExposureProperties) {
        Objects.onNotNull(this.callback, new Consumer() {
            public final void accept(Object obj) {
                ((MraidInteractor.Callback) obj).processExposureChange(MraidExposureProperties.this);
            }
        });
    }

    /* access modifiers changed from: private */
    public void processAppOrientation(MraidAppOrientation mraidAppOrientation) {
        Objects.onNotNull(this.callback, new Consumer() {
            public final void accept(Object obj) {
                ((MraidInteractor.Callback) obj).processCurrentAppOrientationChange(MraidAppOrientation.this);
            }
        });
    }

    /* access modifiers changed from: private */
    public void processAudioVolumeLevel(MraidAudioVolumeLevel mraidAudioVolumeLevel) {
        Objects.onNotNull(this.callback, new Consumer() {
            public final void accept(Object obj) {
                ((MraidInteractor.Callback) obj).processAudioVolumeChange(MraidAudioVolumeLevel.this);
            }
        });
    }

    /* access modifiers changed from: private */
    public void processCurrentPosition(Rect rect) {
        Objects.onNotNull(this.callback, new Consumer(rect) {
            public final /* synthetic */ Rect f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((MraidInteractor.Callback) obj).processCurrentPositionChange(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    public void processDefaultPosition(Rect rect) {
        Objects.onNotNull(this.callback, new Consumer(rect) {
            public final /* synthetic */ Rect f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((MraidInteractor.Callback) obj).processDefaultPositionChange(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    public void processScreenSize(Rect rect) {
        Objects.onNotNull(this.callback, new Consumer(rect) {
            public final /* synthetic */ Rect f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((MraidInteractor.Callback) obj).processScreenSizeChange(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    public void processMaxSize(Rect rect) {
        Objects.onNotNull(this.callback, new Consumer(rect) {
            public final /* synthetic */ Rect f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((MraidInteractor.Callback) obj).processMaxSizeChange(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    public void processLocationProperties(MraidLocationProperties mraidLocationProperties) {
        Objects.onNotNull(this.callback, new Consumer() {
            public final void accept(Object obj) {
                ((MraidInteractor.Callback) obj).processLocationPropertiesChange(MraidLocationProperties.this);
            }
        });
    }

    private void processPlacementType(PlacementType placementType) {
        Objects.onNotNull(this.callback, new Consumer() {
            public final void accept(Object obj) {
                ((MraidInteractor.Callback) obj).processPlacementType(PlacementType.this);
            }
        });
    }

    /* access modifiers changed from: private */
    public void processViewableChange(Boolean bool) {
        Objects.onNotNull(this.callback, new Consumer(bool) {
            public final /* synthetic */ Boolean f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((MraidInteractor.Callback) obj).processViewableChange(this.f$0.booleanValue());
            }
        });
    }

    /* access modifiers changed from: private */
    public void processSupportedFeatures(List<String> list) {
        Objects.onNotNull(this.callback, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((MraidInteractor.Callback) obj).processSupportedFeatures(this.f$0);
            }
        });
    }

    public void handleHtmlLoaded() {
        initMraidProperties();
        Objects.onNotNull(this.callback, $$Lambda$Mvj5VzbjZAQxuXS9_u_OO6qItxg.INSTANCE);
        this.stateMachine.onEvent(MraidStateMachineFactory.Event.LOAD_COMPLETE);
        Objects.onNotNull(this.callback, $$Lambda$h1vrcoYjg4xUxqLW6SKvleziZlc.INSTANCE);
    }

    private void initMraidProperties() {
        processAppOrientation(this.dataProvider.getOrientationChangeSender().getValue());
        processScreenSize(this.dataProvider.getScreenSizeInDpSender().getValue());
        processMaxSize(this.dataProvider.getMaxSizeInDpChangeSender().getValue());
        processLocationProperties(this.dataProvider.getLocationPropertiesSender().getValue());
        processPlacementType(this.dataProvider.getPlacementType());
        processSupportedFeatures(this.dataProvider.getSupportedFeatures().getValue());
        processAudioVolumeLevel(this.dataProvider.getAudioVolumeChangeSender().getValue());
    }

    public void setCallback(Callback callback2) {
        this.callback = callback2;
    }

    public void handleAddEventListener(String str) {
        if (MraidJsEvents.AUDIO_VOLUME_CHANGE.equalsIgnoreCase(str)) {
            processAudioVolumeLevel(this.dataProvider.getAudioVolumeChangeSender().getValue());
        }
        if (MraidJsEvents.EXPOSURE_CHANGE.equalsIgnoreCase(str)) {
            processExposureProperties(this.dataProvider.getExposureChangeSender().getValue());
        }
    }

    public void handleUrlOpen(String str) {
        if (TextUtils.isEmpty(str)) {
            Objects.onNotNull(this.callback, $$Lambda$MraidInteractor$xNgCqaPaYpwWrmNzhN7f5WPL4.INSTANCE);
        } else {
            Objects.onNotNull(this.callback, new Consumer(str) {
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    ((MraidInteractor.Callback) obj).processOpen(this.f$0);
                }
            });
        }
    }

    public void handlePlayVideo(String str) {
        if (TextUtils.isEmpty(str)) {
            Objects.onNotNull(this.callback, $$Lambda$MraidInteractor$g1xWUoUtrKI66K694G_Vamzvvak.INSTANCE);
        } else {
            Objects.onNotNull(this.callback, new Consumer(str) {
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    ((MraidInteractor.Callback) obj).processPlayVideo(this.f$0);
                }
            });
        }
    }

    public void handleResize(MraidResizeProperties mraidResizeProperties) {
        if (mraidResizeProperties == null) {
            Objects.onNotNull(this.callback, $$Lambda$MraidInteractor$CYlP4hwcjS8PdSGf1tl1nFJaW4.INSTANCE);
        } else if (this.stateMachine.getCurrentState() == MraidStateMachineFactory.State.EXPANDED) {
            Objects.onNotNull(this.callback, $$Lambda$MraidInteractor$RTlfqUP3NpGTc_DIAdT0lJfGyVo.INSTANCE);
        } else {
            this.stateMachine.onEvent(MraidStateMachineFactory.Event.RESIZE);
        }
    }

    public void handleExposureChange(MraidExposureProperties mraidExposureProperties) {
        this.dataProvider.getExposureChangeSender().newValue(mraidExposureProperties);
    }

    public void handleOrientationChange(MraidAppOrientation mraidAppOrientation) {
        this.dataProvider.getOrientationChangeSender().newValue(mraidAppOrientation);
    }

    public void handleScreenSizeInDpChange(Rect rect) {
        this.dataProvider.getScreenSizeInDpSender().newValue(rect);
    }

    public void handleScreenMaxSizeInDpChange(Rect rect) {
        this.dataProvider.getMaxSizeInDpChangeSender().newValue(rect);
    }

    public void handleOrientationPropertiesChange(MraidOrientationProperties mraidOrientationProperties) {
        boolean z = true;
        boolean z2 = this.stateMachine.getCurrentState() == MraidStateMachineFactory.State.EXPANDED;
        if (this.dataProvider.getPlacementType() != PlacementType.INTERSTITIAL) {
            z = false;
        }
        if (z2 || z) {
            Objects.onNotNull(this.callback, new Consumer() {
                public final void accept(Object obj) {
                    ((MraidInteractor.Callback) obj).processOrientationPropertiesChange(MraidOrientationProperties.this);
                }
            });
        }
    }

    public void handleAudioVolumeLevelChange(int i, int i2) {
        this.dataProvider.getAudioVolumeChangeSender().newValue(MraidAudioVolumeLevel.create(i, i2));
    }

    public void handleExpand(String str) {
        if (this.dataProvider.getPlacementType() != PlacementType.INTERSTITIAL) {
            this.urlToExpand = str;
            this.stateMachine.onEvent(MraidStateMachineFactory.Event.EXPAND);
        }
    }

    public void handleDefaultPositionChange(Rect rect) {
        this.dataProvider.getDefaultPositionInDpChangeSender().newValue(getRectRelativeToMaxSize(rect));
    }

    public void handleCurrentPositionChange(Rect rect) {
        this.dataProvider.getCurrentPositionInDpChangeSender().newValue(getRectRelativeToMaxSize(rect));
    }

    public void handleViewableChange(boolean z) {
        this.dataProvider.getViewableChangeSender().newValue(Boolean.valueOf(z));
    }

    private Rect getRectRelativeToMaxSize(Rect rect) {
        Rect value = this.dataProvider.getMaxSizeInDpChangeSender().getValue();
        Rect value2 = this.dataProvider.getScreenSizeInDpSender().getValue();
        int abs = Math.abs(value2.left - value.left);
        int abs2 = Math.abs(value2.top - value.top);
        return new Rect(rect.left - abs, rect.top - abs2, rect.right - abs, rect.bottom - abs2);
    }

    public void handleSupportedFeaturesChange(List<String> list) {
        this.dataProvider.getSupportedFeatures().newValue(list);
    }

    public void handleLocationPropertiesChange(MraidLocationProperties mraidLocationProperties) {
        this.dataProvider.getLocationPropertiesSender().newValue(mraidLocationProperties);
    }

    public void handleWasResized() {
        Objects.onNotNull(this.callback, $$Lambda$Mvj5VzbjZAQxuXS9_u_OO6qItxg.INSTANCE);
        this.stateMachine.onEvent(MraidStateMachineFactory.Event.RESIZING_FINISHED);
    }

    public void handleWasExpanded() {
        Objects.onNotNull(this.callback, $$Lambda$Mvj5VzbjZAQxuXS9_u_OO6qItxg.INSTANCE);
        this.stateMachine.onEvent(MraidStateMachineFactory.Event.EXPANDING_FINISHED);
    }

    public void handleFailedToResize(String str) {
        Objects.onNotNull(this.callback, new Consumer(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((MraidInteractor.Callback) obj).processError(MraidJsMethods.RESIZE, this.f$0);
            }
        });
        if (this.stateMachine.getCurrentState() == MraidStateMachineFactory.State.RESIZED) {
            Objects.onNotNull(this.callback, $$Lambda$vbBNRK9ohUBOPxc9kqMoXnTFspI.INSTANCE);
        }
        this.stateMachine.onEvent(MraidStateMachineFactory.Event.ERROR);
    }

    public void handleFailedToExpand() {
        this.stateMachine.onEvent(MraidStateMachineFactory.Event.ERROR);
    }

    public void handleClose() {
        boolean z = true;
        boolean z2 = this.stateMachine.getCurrentState() == MraidStateMachineFactory.State.EXPANDED;
        if (this.dataProvider.getPlacementType() != PlacementType.INTERSTITIAL) {
            z = false;
        }
        if (z2 || z) {
            Objects.onNotNull(this.callback, $$Lambda$Ne9GUvFZIfYk6obq2KKWVQUj54.INSTANCE);
        }
        this.stateMachine.onEvent(MraidStateMachineFactory.Event.CLOSE);
    }

    public void handleWasClosed() {
        Objects.onNotNull(this.callback, $$Lambda$Mvj5VzbjZAQxuXS9_u_OO6qItxg.INSTANCE);
        this.stateMachine.onEvent(MraidStateMachineFactory.Event.CLOSE_FINISHED);
    }

    public void handleVisibilityParamsCheck() {
        if (this.stateMachine.isTransitionAllowed(MraidStateMachineFactory.Event.VISIBILITY_PARAMS_CHECK)) {
            Objects.onNotNull(this.callback, $$Lambda$Mvj5VzbjZAQxuXS9_u_OO6qItxg.INSTANCE);
        }
    }
}
