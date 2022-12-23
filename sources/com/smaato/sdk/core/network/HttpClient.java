package com.smaato.sdk.core.network;

import com.smaato.sdk.core.network.Call;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public abstract class HttpClient implements Call.Factory {
    /* access modifiers changed from: package-private */
    public abstract long connectTimeoutMillis();

    /* access modifiers changed from: package-private */
    public abstract ExecutorService executor();

    /* access modifiers changed from: package-private */
    public abstract List<Interceptor> interceptors();

    /* access modifiers changed from: package-private */
    public abstract long readTimeoutMillis();

    public static Builder builder() {
        Builder executor = new Builder(Collections.emptyList()).executor(Executors.newFixedThreadPool(10));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return executor.connectTimeout(10, timeUnit).readTimeout(10, timeUnit);
    }

    public Builder buildUpon() {
        Builder executor = new Builder(interceptors()).executor(executor());
        long connectTimeoutMillis = connectTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return executor.connectTimeout(connectTimeoutMillis, timeUnit).readTimeout(connectTimeoutMillis(), timeUnit);
    }

    public Call newCall(Request request) {
        return new RealCall(this, request);
    }

    public static class Builder {
        private long connectTimeout;
        private ExecutorService executor;
        private final ArrayList<Interceptor> interceptors;
        private long readTimeout;

        Builder(List<Interceptor> list) {
            ArrayList<Interceptor> arrayList = new ArrayList<>();
            this.interceptors = arrayList;
            arrayList.addAll(list);
        }

        public Builder executor(ExecutorService executorService) {
            this.executor = executorService;
            return this;
        }

        public Builder addInterceptor(Interceptor interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        public Builder addAsFirstInterceptor(Interceptor interceptor) {
            this.interceptors.add(0, interceptor);
            return this;
        }

        public Builder connectTimeout(long j, TimeUnit timeUnit) {
            this.connectTimeout = timeUnit.toMillis(j);
            return this;
        }

        public Builder readTimeout(long j, TimeUnit timeUnit) {
            this.readTimeout = timeUnit.toMillis(j);
            return this;
        }

        public HttpClient build() {
            return new AutoValue_HttpClient(this.executor, Collections.unmodifiableList(this.interceptors), this.connectTimeout, this.readTimeout);
        }
    }
}
