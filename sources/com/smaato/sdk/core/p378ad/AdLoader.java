package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.api.ApiAdRequest;
import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.api.ApiConnector;
import com.smaato.sdk.core.api.ApiConnectorException;
import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.csm.CsmAdPresenterBuilder;
import com.smaato.sdk.core.csm.CsmAdPresenterBuilderImpl;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.Call;
import com.smaato.sdk.core.p378ad.AdLoader;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.AdRequestMapper;
import com.smaato.sdk.core.repository.AdTypeStrategy;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkConfigHintBuilder;
import com.smaato.sdk.core.util.p382fi.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.core.ad.AdLoader */
public class AdLoader {
    private final AdLoaderPlugin adLoaderPlugin;
    /* access modifiers changed from: private */
    public final AdLoaderAdQualityViolationUtils adQualityViolationUtils;
    private final AdRequestMapper adRequestMapper;
    private final ApiConnector apiConnector;
    /* access modifiers changed from: private */
    public Listener listener;
    /* access modifiers changed from: private */
    public final Logger logger;
    private Map<String, Object> objectExtras = new HashMap();
    private final SdkConfigHintBuilder sdkConfigHintBuilder;
    /* access modifiers changed from: private */
    public final AtomicReference<AdRequestHolder> startedAdRequest = new AtomicReference<>();

    /* renamed from: com.smaato.sdk.core.ad.AdLoader$Error */
    public enum Error {
        NO_AD,
        BAD_REQUEST,
        PRESENTER_BUILDER_GENERIC,
        INVALID_RESPONSE,
        API,
        CANCELLED,
        NETWORK,
        NO_CONNECTION,
        CONFIGURATION_ERROR,
        INTERNAL,
        CREATIVE_RESOURCE_EXPIRED,
        TTL_EXPIRED,
        NO_MANDATORY_CACHE,
        CACHE_LIMIT_REACHED
    }

    /* renamed from: com.smaato.sdk.core.ad.AdLoader$Listener */
    public interface Listener {
        void onAdLoadError(AdLoader adLoader, AdLoaderException adLoaderException);

        void onAdLoadSuccess(AdLoader adLoader, AdPresenter adPresenter);
    }

    public AdLoader(final Logger logger2, AdRequestMapper adRequestMapper2, AdLoaderPlugin adLoaderPlugin2, ApiConnector apiConnector2, SdkConfigHintBuilder sdkConfigHintBuilder2, AdLoaderAdQualityViolationUtils adLoaderAdQualityViolationUtils) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.adRequestMapper = (AdRequestMapper) Objects.requireNonNull(adRequestMapper2);
        this.adLoaderPlugin = (AdLoaderPlugin) Objects.requireNonNull(adLoaderPlugin2);
        ApiConnector apiConnector3 = (ApiConnector) Objects.requireNonNull(apiConnector2);
        this.apiConnector = apiConnector3;
        this.sdkConfigHintBuilder = (SdkConfigHintBuilder) Objects.requireNonNull(sdkConfigHintBuilder2);
        this.adQualityViolationUtils = (AdLoaderAdQualityViolationUtils) Objects.requireNonNull(adLoaderAdQualityViolationUtils);
        apiConnector3.setListener(new ApiConnector.Listener() {
            public void onAdRequestSuccess(ApiConnector apiConnector, Call call, ApiAdResponse apiAdResponse) {
                Objects.requireNonNull(apiConnector);
                Objects.requireNonNull(apiAdResponse);
                AdRequestHolder adRequestHolder = (AdRequestHolder) AdLoader.this.startedAdRequest.get();
                if (!AdLoader.this.isInvalidCall(adRequestHolder != null ? adRequestHolder.call : null, call)) {
                    AdLoader.this.buildAdPresenter(new SomaApiContext(adRequestHolder.apiAdRequest, apiAdResponse), adRequestHolder.adPresenterClass);
                }
            }

            public void onAdRequestError(ApiConnector apiConnector, Call call, ApiConnectorException apiConnectorException) {
                Objects.requireNonNull(apiConnector);
                Objects.requireNonNull(apiConnectorException);
                AdRequestHolder adRequestHolder = (AdRequestHolder) AdLoader.this.startedAdRequest.get();
                if (!AdLoader.this.isInvalidCall(adRequestHolder != null ? adRequestHolder.call : null, call)) {
                    logger2.error(LogDomain.AD, "Failed to perform ad request. Error: %s", apiConnectorException);
                    AdLoader.this.handleApiConnectorException(apiConnectorException);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean isInvalidCall(Call call, Call call2) {
        if (call == null) {
            this.logger.info(LogDomain.AD, "There is no request currently running. Callback was not expected", new Object[0]);
            return true;
        } else if (call2 == call) {
            return false;
        } else {
            this.logger.info(LogDomain.AD, "Unknown task. Current task=%s, received task=%s", call, call2);
            return true;
        }
    }

    public void setListener(Listener listener2) {
        this.listener = (Listener) Objects.requireNonNull(listener2);
    }

    public void setObjectExtras(Map<String, Object> map) {
        this.objectExtras = (Map) Objects.requireNonNull(map);
    }

    public void requestAd(AdRequest adRequest, AdTypeStrategy adTypeStrategy) {
        try {
            requestAdInternal(adRequest, adTypeStrategy);
        } catch (AdRequestMapper.UnresolvedServerAdFormatException e) {
            this.logger.error(LogDomain.AD, e, "Configuration error: can not resolve ad format", new Object[0]);
            Objects.onNotNull(this.listener, new Consumer(e) {
                public final /* synthetic */ AdRequestMapper.UnresolvedServerAdFormatException f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    AdLoader.this.lambda$requestAd$0$AdLoader(this.f$1, (AdLoader.Listener) obj);
                }
            });
        } catch (Exception e2) {
            this.logger.error(LogDomain.AD, e2, "Internal error", new Object[0]);
            Objects.onNotNull(this.listener, new Consumer(e2) {
                public final /* synthetic */ Exception f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    AdLoader.this.lambda$requestAd$1$AdLoader(this.f$1, (AdLoader.Listener) obj);
                }
            });
        }
    }

    public /* synthetic */ void lambda$requestAd$0$AdLoader(AdRequestMapper.UnresolvedServerAdFormatException unresolvedServerAdFormatException, Listener listener2) {
        listener2.onAdLoadError(this, new AdLoaderException(Error.CONFIGURATION_ERROR, unresolvedServerAdFormatException));
    }

    public /* synthetic */ void lambda$requestAd$1$AdLoader(Exception exc, Listener listener2) {
        listener2.onAdLoadError(this, new AdLoaderException(Error.INTERNAL, exc));
    }

    private void requestAdInternal(AdRequest adRequest, AdTypeStrategy adTypeStrategy) {
        Objects.requireNonNull(adRequest);
        Objects.requireNonNull(adTypeStrategy);
        Objects.onNotNull(this.startedAdRequest.get(), $$Lambda$AdLoader$VGMbGdMRP7IPBytK4r2U3JgAH20.INSTANCE);
        sendAdRequest(this.adRequestMapper.map(adRequest), adTypeStrategy.getAdPresenterClass());
    }

    /* access modifiers changed from: private */
    public void buildAdPresenter(SomaApiContext somaApiContext, Class<? extends AdPresenter> cls) {
        buildAdPresenter(somaApiContext, cls, (AdPresenterBuilder.Listener) new AdPresenterBuilderListener(somaApiContext));
    }

    private void buildAdPresenter(SomaApiContext somaApiContext, Class<? extends AdPresenter> cls, AdPresenterBuilder.Listener listener2) {
        this.logger.debug(LogDomain.AD, "Requesting an Ad finished with success", new Object[0]);
        AdFormat adFormat = somaApiContext.getApiAdResponse().getAdFormat();
        AdPresenterBuilder adPresenterBuilder = this.adLoaderPlugin.getAdPresenterBuilder(adFormat, cls, this.logger);
        if (adPresenterBuilder == null) {
            this.logger.warning(LogDomain.AD, "No %s implementation was found for %s: %s", AdPresenterBuilder.class.getSimpleName(), AdFormat.class.getSimpleName(), adFormat);
            String buildSdkModuleMissedHintForAdFormat = this.sdkConfigHintBuilder.buildSdkModuleMissedHintForAdFormat(adFormat);
            this.logger.error(LogDomain.AD, buildSdkModuleMissedHintForAdFormat, new Object[0]);
            Objects.onNotNull(this.listener, new Consumer(Error.CONFIGURATION_ERROR, buildSdkModuleMissedHintForAdFormat) {
                public final /* synthetic */ AdLoader.Error f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void accept(Object obj) {
                    AdLoader.this.lambda$buildAdPresenter$3$AdLoader(this.f$1, this.f$2, (AdLoader.Listener) obj);
                }
            });
            return;
        }
        if (adPresenterBuilder instanceof CsmAdPresenterBuilder) {
            CsmAdPresenterBuilderImpl csmAdPresenterBuilderImpl = (CsmAdPresenterBuilderImpl) adPresenterBuilder;
            csmAdPresenterBuilderImpl.setPassbackUrlRequestListener(new CsmAdPresenterBuilder.PassbackUrlRequestListener(somaApiContext) {
                public final /* synthetic */ SomaApiContext f$1;

                {
                    this.f$1 = r2;
                }

                public final void onCallPassbackUrl(String str) {
                    AdLoader.this.lambda$buildAdPresenter$4$AdLoader(this.f$1, str);
                }
            });
            csmAdPresenterBuilderImpl.setObjectExtras(this.objectExtras);
        }
        adPresenterBuilder.buildAdPresenter(somaApiContext, listener2);
    }

    public /* synthetic */ void lambda$buildAdPresenter$3$AdLoader(Error error, String str, Listener listener2) {
        listener2.onAdLoadError(this, new AdLoaderException(error, new RuntimeException(str)));
    }

    public /* synthetic */ void lambda$buildAdPresenter$4$AdLoader(SomaApiContext somaApiContext, String str) {
        sendAdRequest(str, this.startedAdRequest.get(), somaApiContext);
    }

    private void sendAdRequest(ApiAdRequest apiAdRequest, Class<? extends AdPresenter> cls) {
        Call networkCall = this.apiConnector.getNetworkCall(apiAdRequest);
        this.startedAdRequest.set(new AdRequestHolder(networkCall, cls, apiAdRequest));
        this.apiConnector.startNetworkCall(networkCall);
    }

    private void sendAdRequest(String str, AdRequestHolder adRequestHolder, SomaApiContext somaApiContext) {
        Call networkCall = this.apiConnector.getNetworkCall(str);
        this.startedAdRequest.set(new AdRequestHolder(networkCall, adRequestHolder.adPresenterClass, adRequestHolder.apiAdRequest));
        this.apiConnector.startNetworkCall(networkCall);
    }

    public void cancel() {
        AdRequestHolder adRequestHolder = this.startedAdRequest.get();
        if (adRequestHolder == null) {
            this.logger.debug(LogDomain.AD, "There is no request currently running. Nothing to cancel", new Object[0]);
            return;
        }
        this.logger.debug(LogDomain.AD, "Canceling request: %s", adRequestHolder);
        adRequestHolder.call.cancel();
    }

    /* access modifiers changed from: private */
    public void handleApiConnectorException(ApiConnectorException apiConnectorException) {
        Error error;
        switch (C109392.$SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error[apiConnectorException.getErrorType().ordinal()]) {
            case 1:
                error = Error.NO_AD;
                break;
            case 2:
                error = Error.BAD_REQUEST;
                break;
            case 3:
                error = Error.API;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                error = Error.NETWORK;
                break;
            default:
                throw new IllegalArgumentException(String.format("Unexpected %s %s: %s", new Object[]{ApiConnector.class.getSimpleName(), ApiConnector.Error.class.getSimpleName(), apiConnectorException}));
        }
        Objects.onNotNull(this.listener, new Consumer(error, apiConnectorException) {
            public final /* synthetic */ AdLoader.Error f$1;
            public final /* synthetic */ ApiConnectorException f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                AdLoader.this.lambda$handleApiConnectorException$5$AdLoader(this.f$1, this.f$2, (AdLoader.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$handleApiConnectorException$5$AdLoader(Error error, ApiConnectorException apiConnectorException, Listener listener2) {
        listener2.onAdLoadError(this, new AdLoaderException(error, apiConnectorException));
    }

    public void buildAdPresenter(AdTypeStrategy adTypeStrategy, AdRequest adRequest, ApiAdResponse apiAdResponse) {
        buildAdPresenter(new SomaApiContext(this.adRequestMapper.map(adRequest), apiAdResponse), adTypeStrategy.getAdPresenterClass());
    }

    /* renamed from: com.smaato.sdk.core.ad.AdLoader$AdRequestHolder */
    static final class AdRequestHolder {
        final Class<? extends AdPresenter> adPresenterClass;
        final ApiAdRequest apiAdRequest;
        final Call call;

        private AdRequestHolder(Call call2, Class<? extends AdPresenter> cls, ApiAdRequest apiAdRequest2) {
            this.call = (Call) Objects.requireNonNull(call2, "Parameter call cannot be null for AdRequestHolder::new");
            this.adPresenterClass = (Class) Objects.requireNonNull(cls, "Parameter clazz cannot be null for AdRequestHolder::new");
            this.apiAdRequest = (ApiAdRequest) Objects.requireNonNull(apiAdRequest2, "Parameter apiAdRequest cannot be null for AdRequestHolder::new");
        }
    }

    /* renamed from: com.smaato.sdk.core.ad.AdLoader$AdPresenterBuilderListener */
    private final class AdPresenterBuilderListener implements AdPresenterBuilder.Listener {
        private final SomaApiContext somaApiContext;

        private AdPresenterBuilderListener(SomaApiContext somaApiContext2) {
            this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
        }

        public void onAdPresenterBuildSuccess(AdPresenterBuilder adPresenterBuilder, AdPresenter adPresenter) {
            Objects.requireNonNull(adPresenterBuilder);
            Objects.requireNonNull(adPresenter);
            AdLoader.this.logger.debug(LogDomain.AD, "%s building with %s finished with success", AdPresenter.class.getSimpleName(), adPresenterBuilder.getClass().getSimpleName());
            Objects.onNotNull(AdLoader.this.listener, new Consumer(adPresenter) {
                public final /* synthetic */ AdPresenter f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    AdLoader.AdPresenterBuilderListener.this.mo68376x5954ce3e(this.f$1, (AdLoader.Listener) obj);
                }
            });
        }

        /* renamed from: lambda$onAdPresenterBuildSuccess$0$AdLoader$AdPresenterBuilderListener */
        public /* synthetic */ void mo68376x5954ce3e(AdPresenter adPresenter, Listener listener) {
            listener.onAdLoadSuccess(AdLoader.this, adPresenter);
        }

        public void onAdPresenterBuildError(AdPresenterBuilder adPresenterBuilder, AdPresenterBuilderException adPresenterBuilderException) {
            Objects.requireNonNull(adPresenterBuilder);
            Objects.requireNonNull(adPresenterBuilderException);
            AdLoader.this.logger.error(LogDomain.AD, "Failed to build %s with %s. Error: %s", AdPresenter.class.getSimpleName(), adPresenterBuilder.getClass().getSimpleName(), adPresenterBuilderException);
            AdLoader.this.adQualityViolationUtils.handleImageAdLoadingViolationIfRequired(adPresenterBuilderException);
            Objects.onNotNull(AdLoader.this.listener, new Consumer(handleAdPresenterBuilderException(adPresenterBuilderException), adPresenterBuilderException) {
                public final /* synthetic */ AdLoader.Error f$1;
                public final /* synthetic */ AdPresenterBuilderException f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void accept(Object obj) {
                    AdLoader.AdPresenterBuilderListener.this.mo68375x963e2c4(this.f$1, this.f$2, (AdLoader.Listener) obj);
                }
            });
        }

        /* renamed from: lambda$onAdPresenterBuildError$1$AdLoader$AdPresenterBuilderListener */
        public /* synthetic */ void mo68375x963e2c4(Error error, AdPresenterBuilderException adPresenterBuilderException, Listener listener) {
            listener.onAdLoadError(AdLoader.this, new AdLoaderException(error, adPresenterBuilderException));
        }

        private Error handleAdPresenterBuilderException(AdPresenterBuilderException adPresenterBuilderException) {
            switch (C109392.$SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error[adPresenterBuilderException.getErrorType().ordinal()]) {
                case 1:
                    return Error.CANCELLED;
                case 2:
                    return Error.INVALID_RESPONSE;
                case 3:
                    return Error.CREATIVE_RESOURCE_EXPIRED;
                case 4:
                    return Error.NO_CONNECTION;
                case 5:
                case 6:
                case 7:
                case 8:
                    return Error.NETWORK;
                case 9:
                    return Error.PRESENTER_BUILDER_GENERIC;
                default:
                    throw new IllegalArgumentException(String.format("Unexpected %s %s: %s", new Object[]{AdPresenterBuilder.class.getSimpleName(), AdPresenterBuilder.Error.class.getSimpleName(), adPresenterBuilderException}));
            }
        }
    }

    /* renamed from: com.smaato.sdk.core.ad.AdLoader$2 */
    static /* synthetic */ class C109392 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error;
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error;

        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0091 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x009b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00af */
        static {
            /*
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error[] r0 = com.smaato.sdk.core.p378ad.AdPresenterBuilder.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error = r0
                r1 = 1
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r2 = com.smaato.sdk.core.p378ad.AdPresenterBuilder.Error.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r3 = com.smaato.sdk.core.p378ad.AdPresenterBuilder.Error.INVALID_RESPONSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r4 = com.smaato.sdk.core.p378ad.AdPresenterBuilder.Error.RESOURCE_EXPIRED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r5 = com.smaato.sdk.core.p378ad.AdPresenterBuilder.Error.TRANSPORT_NO_NETWORK_CONNECTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r6 = com.smaato.sdk.core.p378ad.AdPresenterBuilder.Error.TRANSPORT_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r7 = com.smaato.sdk.core.p378ad.AdPresenterBuilder.Error.TRANSPORT_IO_ERROR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r8 = com.smaato.sdk.core.p378ad.AdPresenterBuilder.Error.TRANSPORT_IO_TOO_MANY_REDIRECTS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r7 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r8 = com.smaato.sdk.core.p378ad.AdPresenterBuilder.Error.TRANSPORT_GENERIC     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r9 = 8
                r7[r8] = r9     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r7 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x006c }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r8 = com.smaato.sdk.core.p378ad.AdPresenterBuilder.Error.GENERIC     // Catch:{ NoSuchFieldError -> 0x006c }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9 = 9
                r7[r8] = r9     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                com.smaato.sdk.core.api.ApiConnector$Error[] r7 = com.smaato.sdk.core.api.ApiConnector.Error.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error = r7
                com.smaato.sdk.core.api.ApiConnector$Error r8 = com.smaato.sdk.core.api.ApiConnector.Error.NO_AD     // Catch:{ NoSuchFieldError -> 0x007d }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r1 = $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.smaato.sdk.core.api.ApiConnector$Error r7 = com.smaato.sdk.core.api.ApiConnector.Error.BAD_REQUEST     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r1[r7] = r0     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error     // Catch:{ NoSuchFieldError -> 0x0091 }
                com.smaato.sdk.core.api.ApiConnector$Error r1 = com.smaato.sdk.core.api.ApiConnector.Error.RESPONSE_MAPPING     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error     // Catch:{ NoSuchFieldError -> 0x009b }
                com.smaato.sdk.core.api.ApiConnector$Error r1 = com.smaato.sdk.core.api.ApiConnector.Error.TRANSPORT_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error     // Catch:{ NoSuchFieldError -> 0x00a5 }
                com.smaato.sdk.core.api.ApiConnector$Error r1 = com.smaato.sdk.core.api.ApiConnector.Error.TRANSPORT_GENERIC     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error     // Catch:{ NoSuchFieldError -> 0x00af }
                com.smaato.sdk.core.api.ApiConnector$Error r1 = com.smaato.sdk.core.api.ApiConnector.Error.TRANSPORT_IO_ERROR     // Catch:{ NoSuchFieldError -> 0x00af }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error     // Catch:{ NoSuchFieldError -> 0x00b9 }
                com.smaato.sdk.core.api.ApiConnector$Error r1 = com.smaato.sdk.core.api.ApiConnector.Error.BAD_RESPONSE     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.p378ad.AdLoader.C109392.<clinit>():void");
        }
    }
}
