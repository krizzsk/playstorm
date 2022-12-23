package com.smaato.sdk.core.network;

import com.smaato.sdk.core.network.Response;
import java.net.HttpURLConnection;

final class AutoValue_Response extends Response {
    private final Response.Body body;
    private final HttpURLConnection connection;
    private final String encoding;
    private final Headers headers;
    private final MimeType mimeType;
    private final Request request;
    private final int responseCode;

    private AutoValue_Response(Request request2, int i, Headers headers2, MimeType mimeType2, Response.Body body2, String str, HttpURLConnection httpURLConnection) {
        this.request = request2;
        this.responseCode = i;
        this.headers = headers2;
        this.mimeType = mimeType2;
        this.body = body2;
        this.encoding = str;
        this.connection = httpURLConnection;
    }

    public Request request() {
        return this.request;
    }

    public int responseCode() {
        return this.responseCode;
    }

    public Headers headers() {
        return this.headers;
    }

    public MimeType mimeType() {
        return this.mimeType;
    }

    public Response.Body body() {
        return this.body;
    }

    public String encoding() {
        return this.encoding;
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection connection() {
        return this.connection;
    }

    public String toString() {
        return "Response{request=" + this.request + ", responseCode=" + this.responseCode + ", headers=" + this.headers + ", mimeType=" + this.mimeType + ", body=" + this.body + ", encoding=" + this.encoding + ", connection=" + this.connection + "}";
    }

    public boolean equals(Object obj) {
        MimeType mimeType2;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return false;
        }
        Response response = (Response) obj;
        if (!this.request.equals(response.request()) || this.responseCode != response.responseCode() || !this.headers.equals(response.headers()) || ((mimeType2 = this.mimeType) != null ? !mimeType2.equals(response.mimeType()) : response.mimeType() != null) || !this.body.equals(response.body()) || ((str = this.encoding) != null ? !str.equals(response.encoding()) : response.encoding() != null) || !this.connection.equals(response.connection())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.request.hashCode() ^ 1000003) * 1000003) ^ this.responseCode) * 1000003) ^ this.headers.hashCode()) * 1000003;
        MimeType mimeType2 = this.mimeType;
        int i = 0;
        int hashCode2 = (((hashCode ^ (mimeType2 == null ? 0 : mimeType2.hashCode())) * 1000003) ^ this.body.hashCode()) * 1000003;
        String str = this.encoding;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.connection.hashCode();
    }

    static final class Builder extends Response.Builder {
        private Response.Body body;
        private HttpURLConnection connection;
        private String encoding;
        private Headers headers;
        private MimeType mimeType;
        private Request request;
        private Integer responseCode;

        Builder() {
        }

        public Response.Builder request(Request request2) {
            if (request2 != null) {
                this.request = request2;
                return this;
            }
            throw new NullPointerException("Null request");
        }

        public Response.Builder responseCode(int i) {
            this.responseCode = Integer.valueOf(i);
            return this;
        }

        public Response.Builder headers(Headers headers2) {
            if (headers2 != null) {
                this.headers = headers2;
                return this;
            }
            throw new NullPointerException("Null headers");
        }

        public Response.Builder mimeType(MimeType mimeType2) {
            this.mimeType = mimeType2;
            return this;
        }

        public Response.Builder body(Response.Body body2) {
            if (body2 != null) {
                this.body = body2;
                return this;
            }
            throw new NullPointerException("Null body");
        }

        public Response.Builder encoding(String str) {
            this.encoding = str;
            return this;
        }

        public Response.Builder connection(HttpURLConnection httpURLConnection) {
            if (httpURLConnection != null) {
                this.connection = httpURLConnection;
                return this;
            }
            throw new NullPointerException("Null connection");
        }

        public Response build() {
            String str = "";
            if (this.request == null) {
                str = str + " request";
            }
            if (this.responseCode == null) {
                str = str + " responseCode";
            }
            if (this.headers == null) {
                str = str + " headers";
            }
            if (this.body == null) {
                str = str + " body";
            }
            if (this.connection == null) {
                str = str + " connection";
            }
            if (str.isEmpty()) {
                return new AutoValue_Response(this.request, this.responseCode.intValue(), this.headers, this.mimeType, this.body, this.encoding, this.connection);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
