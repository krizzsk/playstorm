package com.smaato.sdk.core.network;

import com.smaato.sdk.core.network.AutoValue_RealChain;
import com.smaato.sdk.core.network.Interceptor;
import java.io.IOException;
import java.util.List;

abstract class RealChain implements Interceptor.Chain {
    /* access modifiers changed from: package-private */
    public abstract int index();

    /* access modifiers changed from: package-private */
    public abstract List<Interceptor> interceptors();

    RealChain() {
    }

    static Builder builder() {
        return new AutoValue_RealChain.Builder().index(0);
    }

    public Response proceed(Request request) throws IOException {
        if (index() < interceptors().size()) {
            RealChain build = builder().readTimeoutMillis(readTimeoutMillis()).connectTimeoutMillis(connectTimeoutMillis()).interceptors(interceptors()).index(index() + 1).request(request).call(call()).build();
            Interceptor interceptor = interceptors().get(index());
            Response intercept = interceptor.intercept(build);
            if (intercept == null) {
                throw new IOException("interceptor " + interceptor + " returned null");
            } else if (intercept.body() != null) {
                return intercept;
            } else {
                throw new IOException("interceptor " + interceptor + " returned response with null body");
            }
        } else {
            throw new IndexOutOfBoundsException("index = " + index() + ", interceptors = " + interceptors().size());
        }
    }

    static abstract class Builder {
        /* access modifiers changed from: package-private */
        public abstract RealChain build();

        /* access modifiers changed from: package-private */
        public abstract Builder call(Call call);

        /* access modifiers changed from: package-private */
        public abstract Builder connectTimeoutMillis(long j);

        /* access modifiers changed from: package-private */
        public abstract Builder index(int i);

        /* access modifiers changed from: package-private */
        public abstract Builder interceptors(List<Interceptor> list);

        /* access modifiers changed from: package-private */
        public abstract Builder readTimeoutMillis(long j);

        /* access modifiers changed from: package-private */
        public abstract Builder request(Request request);

        Builder() {
        }
    }
}
