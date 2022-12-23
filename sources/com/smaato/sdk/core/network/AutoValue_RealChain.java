package com.smaato.sdk.core.network;

import com.smaato.sdk.core.network.RealChain;
import java.util.List;

final class AutoValue_RealChain extends RealChain {
    private final Call call;
    private final long connectTimeoutMillis;
    private final int index;
    private final List<Interceptor> interceptors;
    private final long readTimeoutMillis;
    private final Request request;

    private AutoValue_RealChain(Call call2, Request request2, long j, long j2, List<Interceptor> list, int i) {
        this.call = call2;
        this.request = request2;
        this.connectTimeoutMillis = j;
        this.readTimeoutMillis = j2;
        this.interceptors = list;
        this.index = i;
    }

    public Call call() {
        return this.call;
    }

    public Request request() {
        return this.request;
    }

    public long connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public long readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* access modifiers changed from: package-private */
    public List<Interceptor> interceptors() {
        return this.interceptors;
    }

    /* access modifiers changed from: package-private */
    public int index() {
        return this.index;
    }

    public String toString() {
        return "RealChain{call=" + this.call + ", request=" + this.request + ", connectTimeoutMillis=" + this.connectTimeoutMillis + ", readTimeoutMillis=" + this.readTimeoutMillis + ", interceptors=" + this.interceptors + ", index=" + this.index + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealChain)) {
            return false;
        }
        RealChain realChain = (RealChain) obj;
        if (!this.call.equals(realChain.call()) || !this.request.equals(realChain.request()) || this.connectTimeoutMillis != realChain.connectTimeoutMillis() || this.readTimeoutMillis != realChain.readTimeoutMillis() || !this.interceptors.equals(realChain.interceptors()) || this.index != realChain.index()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.connectTimeoutMillis;
        long j2 = this.readTimeoutMillis;
        return ((((((((((this.call.hashCode() ^ 1000003) * 1000003) ^ this.request.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.interceptors.hashCode()) * 1000003) ^ this.index;
    }

    static final class Builder extends RealChain.Builder {
        private Call call;
        private Long connectTimeoutMillis;
        private Integer index;
        private List<Interceptor> interceptors;
        private Long readTimeoutMillis;
        private Request request;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public RealChain.Builder call(Call call2) {
            if (call2 != null) {
                this.call = call2;
                return this;
            }
            throw new NullPointerException("Null call");
        }

        /* access modifiers changed from: package-private */
        public RealChain.Builder request(Request request2) {
            if (request2 != null) {
                this.request = request2;
                return this;
            }
            throw new NullPointerException("Null request");
        }

        /* access modifiers changed from: package-private */
        public RealChain.Builder connectTimeoutMillis(long j) {
            this.connectTimeoutMillis = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public RealChain.Builder readTimeoutMillis(long j) {
            this.readTimeoutMillis = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public RealChain.Builder interceptors(List<Interceptor> list) {
            if (list != null) {
                this.interceptors = list;
                return this;
            }
            throw new NullPointerException("Null interceptors");
        }

        /* access modifiers changed from: package-private */
        public RealChain.Builder index(int i) {
            this.index = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public RealChain build() {
            String str = "";
            if (this.call == null) {
                str = str + " call";
            }
            if (this.request == null) {
                str = str + " request";
            }
            if (this.connectTimeoutMillis == null) {
                str = str + " connectTimeoutMillis";
            }
            if (this.readTimeoutMillis == null) {
                str = str + " readTimeoutMillis";
            }
            if (this.interceptors == null) {
                str = str + " interceptors";
            }
            if (this.index == null) {
                str = str + " index";
            }
            if (str.isEmpty()) {
                return new AutoValue_RealChain(this.call, this.request, this.connectTimeoutMillis.longValue(), this.readTimeoutMillis.longValue(), this.interceptors, this.index.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
