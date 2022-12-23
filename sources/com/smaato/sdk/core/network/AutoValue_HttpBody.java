package com.smaato.sdk.core.network;

import com.smaato.sdk.core.network.HttpBody;
import java.io.InputStream;

final class AutoValue_HttpBody extends HttpBody {
    private final long contentLength;
    private final InputStream source;

    private AutoValue_HttpBody(InputStream inputStream, long j) {
        this.source = inputStream;
        this.contentLength = j;
    }

    public InputStream source() {
        return this.source;
    }

    public long contentLength() {
        return this.contentLength;
    }

    public String toString() {
        return "HttpBody{source=" + this.source + ", contentLength=" + this.contentLength + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpBody)) {
            return false;
        }
        HttpBody httpBody = (HttpBody) obj;
        if (!this.source.equals(httpBody.source()) || this.contentLength != httpBody.contentLength()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.contentLength;
        return ((this.source.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    static final class Builder extends HttpBody.Builder {
        private Long contentLength;
        private InputStream source;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public HttpBody.Builder source(InputStream inputStream) {
            if (inputStream != null) {
                this.source = inputStream;
                return this;
            }
            throw new NullPointerException("Null source");
        }

        /* access modifiers changed from: package-private */
        public HttpBody.Builder contentLength(long j) {
            this.contentLength = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public HttpBody build() {
            String str = "";
            if (this.source == null) {
                str = str + " source";
            }
            if (this.contentLength == null) {
                str = str + " contentLength";
            }
            if (str.isEmpty()) {
                return new AutoValue_HttpBody(this.source, this.contentLength.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
