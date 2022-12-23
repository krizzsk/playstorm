package com.smaato.sdk.core.resourceloader;

import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.Call;
import com.smaato.sdk.core.network.Callback;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.p378ad.Expiration;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;

public class ResourceLoader<PersistedResourceType, OutputResourceType> {
    private final HttpClient httpClient;
    /* access modifiers changed from: private */
    public final Logger logger;
    /* access modifiers changed from: private */
    public final PersistingStrategy<PersistedResourceType> persistingStrategy;
    /* access modifiers changed from: private */
    public final ResourceTransformer<PersistedResourceType, OutputResourceType> resourceTransformer;

    public enum Error {
        RESOURCE_EXPIRED,
        IO_ERROR,
        NETWORK_GENERIC
    }

    public interface Listener<OutputResourceType> {
        void onFailure(ResourceLoaderException resourceLoaderException);

        void onResourceLoaded(OutputResourceType outputresourcetype);
    }

    public ResourceLoader(Logger logger2, HttpClient httpClient2, PersistingStrategy<PersistedResourceType> persistingStrategy2, ResourceTransformer<PersistedResourceType, OutputResourceType> resourceTransformer2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.httpClient = (HttpClient) Objects.requireNonNull(httpClient2);
        this.persistingStrategy = (PersistingStrategy) Objects.requireNonNull(persistingStrategy2);
        this.resourceTransformer = (ResourceTransformer) Objects.requireNonNull(resourceTransformer2);
    }

    public void loadResource(String str, SomaApiContext somaApiContext, Listener<OutputResourceType> listener) {
        Threads.runOnBackgroundThread(new Runnable(str, listener, somaApiContext) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ ResourceLoader.Listener f$2;
            public final /* synthetic */ SomaApiContext f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                ResourceLoader.this.lambda$loadResource$0$ResourceLoader(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public /* synthetic */ void lambda$loadResource$0$ResourceLoader(String str, Listener listener, SomaApiContext somaApiContext) {
        try {
            PersistedResourceType persistedresourcetype = this.persistingStrategy.get(str);
            if (persistedresourcetype != null) {
                listener.onResourceLoaded(this.resourceTransformer.transform(persistedresourcetype));
                return;
            }
            Expiration expiration = somaApiContext.getApiAdResponse().getExpiration();
            if (expiration.isExpired()) {
                this.logger.warning(LogDomain.RESOURCE_LOADER, "Resource already expired, resourceExpirationTimestamp=%d, current time=%d. Skipping the loading.", Long.valueOf(expiration.getTimestamp()), Long.valueOf(System.currentTimeMillis()));
                listener.onFailure(new ResourceLoaderException(Error.RESOURCE_EXPIRED, new IllegalStateException()));
                return;
            }
            loadNetworkResource(str, somaApiContext, listener);
        } catch (PersistingStrategyException e) {
            listener.onFailure(new ResourceLoaderException(Error.IO_ERROR, e));
        }
    }

    private void loadNetworkResource(final String str, final SomaApiContext somaApiContext, final Listener<OutputResourceType> listener) {
        this.httpClient.newCall(Request.get(str)).enqueue(new Callback() {
            public void onResponse(Call call, Response response) {
                try {
                    listener.onResourceLoaded(ResourceLoader.this.resourceTransformer.transform(ResourceLoader.this.persistingStrategy.put(response.body().source(), str, somaApiContext.getApiAdResponse().getExpiration().getTimestamp())));
                } catch (PersistingStrategyException e) {
                    ResourceLoader.this.logger.error(LogDomain.RESOURCE_LOADER, "Failed to persist resource at url: %s with error: %s", str, e);
                    listener.onFailure(new ResourceLoaderException(Error.IO_ERROR, e));
                }
            }

            public void onFailure(Call call, Exception exc) {
                ResourceLoader.this.logger.error(LogDomain.RESOURCE_LOADER, "Failed to load resource at url: %s with error: %s", str, exc);
                listener.onFailure(new ResourceLoaderException(Error.NETWORK_GENERIC, exc));
            }
        });
    }
}
