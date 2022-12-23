package com.smaato.sdk.core.api;

import com.smaato.sdk.core.api.ApiConnector;
import com.smaato.sdk.core.api.ApiResponseMapper;
import com.smaato.sdk.core.network.Call;
import com.smaato.sdk.core.network.Callback;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;

public class ApiConnector {
    /* access modifiers changed from: private */
    public Listener apiConnectorListener;
    private final ApiRequestMapper apiRequestMapper;
    /* access modifiers changed from: private */
    public final ApiResponseMapper apiResponseMapper;
    private final Callback httpClientCallback = new Callback() {
        public void onResponse(Call call, Response response) {
            try {
                Objects.onNotNull(ApiConnector.this.apiConnectorListener, new Consumer(call, ApiConnector.this.apiResponseMapper.map(response)) {
                    public final /* synthetic */ Call f$1;
                    public final /* synthetic */ ApiAdResponse f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void accept(Object obj) {
                        ApiConnector.C109481.this.lambda$onResponse$0$ApiConnector$1(this.f$1, this.f$2, (ApiConnector.Listener) obj);
                    }
                });
            } catch (ApiResponseMapper.MappingException e) {
                Objects.onNotNull(ApiConnector.this.apiConnectorListener, new Consumer(call, ErrorMappingUtil.mapApiResponseMapperErrorToApiConnectorException(e)) {
                    public final /* synthetic */ Call f$1;
                    public final /* synthetic */ ApiConnectorException f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void accept(Object obj) {
                        ApiConnector.C109481.this.lambda$onResponse$1$ApiConnector$1(this.f$1, this.f$2, (ApiConnector.Listener) obj);
                    }
                });
            }
        }

        public /* synthetic */ void lambda$onResponse$0$ApiConnector$1(Call call, ApiAdResponse apiAdResponse, Listener listener) {
            listener.onAdRequestSuccess(ApiConnector.this, call, apiAdResponse);
        }

        public /* synthetic */ void lambda$onResponse$1$ApiConnector$1(Call call, ApiConnectorException apiConnectorException, Listener listener) {
            listener.onAdRequestError(ApiConnector.this, call, apiConnectorException);
        }

        public void onFailure(Call call, Exception exc) {
            Objects.onNotNull(ApiConnector.this.apiConnectorListener, new Consumer(call, ErrorMappingUtil.mapSomaExceptionToApiConnectorLayerException(exc)) {
                public final /* synthetic */ Call f$1;
                public final /* synthetic */ ApiConnectorException f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void accept(Object obj) {
                    ApiConnector.C109481.this.lambda$onFailure$2$ApiConnector$1(this.f$1, this.f$2, (ApiConnector.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onFailure$2$ApiConnector$1(Call call, ApiConnectorException apiConnectorException, Listener listener) {
            listener.onAdRequestError(ApiConnector.this, call, apiConnectorException);
        }
    };
    HttpClient somaHttpClient;

    public enum Error {
        NO_AD,
        BAD_REQUEST,
        BAD_RESPONSE,
        TRANSPORT_TIMEOUT,
        TRANSPORT_IO_ERROR,
        TRANSPORT_GENERIC,
        RESPONSE_MAPPING
    }

    public interface Listener {
        void onAdRequestError(ApiConnector apiConnector, Call call, ApiConnectorException apiConnectorException);

        void onAdRequestSuccess(ApiConnector apiConnector, Call call, ApiAdResponse apiAdResponse);
    }

    public ApiConnector(ApiRequestMapper apiRequestMapper2, ApiResponseMapper apiResponseMapper2, HttpClient httpClient) {
        this.apiRequestMapper = (ApiRequestMapper) Objects.requireNonNull(apiRequestMapper2);
        this.apiResponseMapper = (ApiResponseMapper) Objects.requireNonNull(apiResponseMapper2);
        this.somaHttpClient = (HttpClient) Objects.requireNonNull(httpClient);
    }

    public void setListener(Listener listener) {
        this.apiConnectorListener = (Listener) Objects.requireNonNull(listener);
    }

    public Call getNetworkCall(ApiAdRequest apiAdRequest) {
        Objects.requireNonNull(apiAdRequest);
        return this.somaHttpClient.newCall(this.apiRequestMapper.map(apiAdRequest));
    }

    public Call getNetworkCall(String str) {
        Objects.requireNonNull(str);
        return this.somaHttpClient.newCall(this.apiRequestMapper.map(str));
    }

    public void startNetworkCall(Call call) {
        call.enqueue(this.httpClientCallback);
    }
}
