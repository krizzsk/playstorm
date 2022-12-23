package com.smaato.sdk.core.network;

import java.util.List;
import java.util.concurrent.ExecutorService;

final class AutoValue_HttpClient extends HttpClient {
    private final long connectTimeoutMillis;
    private final ExecutorService executor;
    private final List<Interceptor> interceptors;
    private final long readTimeoutMillis;

    AutoValue_HttpClient(ExecutorService executorService, List<Interceptor> list, long j, long j2) {
        if (executorService != null) {
            this.executor = executorService;
            if (list != null) {
                this.interceptors = list;
                this.connectTimeoutMillis = j;
                this.readTimeoutMillis = j2;
                return;
            }
            throw new NullPointerException("Null interceptors");
        }
        throw new NullPointerException("Null executor");
    }

    /* access modifiers changed from: package-private */
    public ExecutorService executor() {
        return this.executor;
    }

    /* access modifiers changed from: package-private */
    public List<Interceptor> interceptors() {
        return this.interceptors;
    }

    /* access modifiers changed from: package-private */
    public long connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* access modifiers changed from: package-private */
    public long readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String toString() {
        return "HttpClient{executor=" + this.executor + ", interceptors=" + this.interceptors + ", connectTimeoutMillis=" + this.connectTimeoutMillis + ", readTimeoutMillis=" + this.readTimeoutMillis + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpClient)) {
            return false;
        }
        HttpClient httpClient = (HttpClient) obj;
        if (!this.executor.equals(httpClient.executor()) || !this.interceptors.equals(httpClient.interceptors()) || this.connectTimeoutMillis != httpClient.connectTimeoutMillis() || this.readTimeoutMillis != httpClient.readTimeoutMillis()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.connectTimeoutMillis;
        long j2 = this.readTimeoutMillis;
        return ((((((this.executor.hashCode() ^ 1000003) * 1000003) ^ this.interceptors.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }
}
