package com.smaato.sdk.core.network;

import android.net.Uri;
import com.smaato.sdk.core.network.Request;

final class AutoValue_Request extends Request {
    private final Request.Body body;
    private final boolean followRedirects;
    private final Headers headers;
    private final String method;
    private final Uri uri;

    private AutoValue_Request(Uri uri2, String str, Headers headers2, Request.Body body2, boolean z) {
        this.uri = uri2;
        this.method = str;
        this.headers = headers2;
        this.body = body2;
        this.followRedirects = z;
    }

    public Uri uri() {
        return this.uri;
    }

    public String method() {
        return this.method;
    }

    public Headers headers() {
        return this.headers;
    }

    public Request.Body body() {
        return this.body;
    }

    /* access modifiers changed from: package-private */
    public boolean followRedirects() {
        return this.followRedirects;
    }

    public String toString() {
        return "Request{uri=" + this.uri + ", method=" + this.method + ", headers=" + this.headers + ", body=" + this.body + ", followRedirects=" + this.followRedirects + "}";
    }

    public boolean equals(Object obj) {
        Request.Body body2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return false;
        }
        Request request = (Request) obj;
        if (!this.uri.equals(request.uri()) || !this.method.equals(request.method()) || !this.headers.equals(request.headers()) || ((body2 = this.body) != null ? !body2.equals(request.body()) : request.body() != null) || this.followRedirects != request.followRedirects()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.method.hashCode()) * 1000003) ^ this.headers.hashCode()) * 1000003;
        Request.Body body2 = this.body;
        return ((hashCode ^ (body2 == null ? 0 : body2.hashCode())) * 1000003) ^ (this.followRedirects ? 1231 : 1237);
    }

    static final class Builder extends Request.Builder {
        private Request.Body body;
        private Boolean followRedirects;
        private Headers headers;
        private String method;
        private Uri uri;

        Builder() {
        }

        public Request.Builder uri(Uri uri2) {
            if (uri2 != null) {
                this.uri = uri2;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public Request.Builder method(String str) {
            if (str != null) {
                this.method = str;
                return this;
            }
            throw new NullPointerException("Null method");
        }

        public Request.Builder headers(Headers headers2) {
            if (headers2 != null) {
                this.headers = headers2;
                return this;
            }
            throw new NullPointerException("Null headers");
        }

        public Request.Builder body(Request.Body body2) {
            this.body = body2;
            return this;
        }

        public Request.Builder followRedirects(boolean z) {
            this.followRedirects = Boolean.valueOf(z);
            return this;
        }

        public Request build() {
            String str = "";
            if (this.uri == null) {
                str = str + " uri";
            }
            if (this.method == null) {
                str = str + " method";
            }
            if (this.headers == null) {
                str = str + " headers";
            }
            if (this.followRedirects == null) {
                str = str + " followRedirects";
            }
            if (str.isEmpty()) {
                return new AutoValue_Request(this.uri, this.method, this.headers, this.body, this.followRedirects.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
