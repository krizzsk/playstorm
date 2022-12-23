package com.smaato.sdk.core.api;

import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.Expiration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

final class AutoValue_ApiAdResponse extends ApiAdResponse {
    private final AdFormat adFormat;
    private final byte[] body;
    private final String charset;
    private final String creativeId;
    private final String csm;
    private final Expiration expiration;
    private final ImpressionCountingType impressionCountingType;
    private final String requestUrl;
    private final Map<String, List<String>> responseHeaders;
    private final String sessionId;

    private AutoValue_ApiAdResponse(AdFormat adFormat2, byte[] bArr, Map<String, List<String>> map, String str, String str2, Expiration expiration2, String str3, String str4, ImpressionCountingType impressionCountingType2, String str5) {
        this.adFormat = adFormat2;
        this.body = bArr;
        this.responseHeaders = map;
        this.charset = str;
        this.requestUrl = str2;
        this.expiration = expiration2;
        this.sessionId = str3;
        this.creativeId = str4;
        this.impressionCountingType = impressionCountingType2;
        this.csm = str5;
    }

    public AdFormat getAdFormat() {
        return this.adFormat;
    }

    public byte[] getBody() {
        return this.body;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.responseHeaders;
    }

    public String getCharset() {
        return this.charset;
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public Expiration getExpiration() {
        return this.expiration;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getCreativeId() {
        return this.creativeId;
    }

    public ImpressionCountingType getImpressionCountingType() {
        return this.impressionCountingType;
    }

    /* access modifiers changed from: package-private */
    public String getCsm() {
        return this.csm;
    }

    public String toString() {
        return "ApiAdResponse{adFormat=" + this.adFormat + ", body=" + Arrays.toString(this.body) + ", responseHeaders=" + this.responseHeaders + ", charset=" + this.charset + ", requestUrl=" + this.requestUrl + ", expiration=" + this.expiration + ", sessionId=" + this.sessionId + ", creativeId=" + this.creativeId + ", impressionCountingType=" + this.impressionCountingType + ", csm=" + this.csm + "}";
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiAdResponse)) {
            return false;
        }
        ApiAdResponse apiAdResponse = (ApiAdResponse) obj;
        if (this.adFormat.equals(apiAdResponse.getAdFormat())) {
            if (Arrays.equals(this.body, apiAdResponse instanceof AutoValue_ApiAdResponse ? ((AutoValue_ApiAdResponse) apiAdResponse).body : apiAdResponse.getBody()) && this.responseHeaders.equals(apiAdResponse.getResponseHeaders()) && this.charset.equals(apiAdResponse.getCharset()) && this.requestUrl.equals(apiAdResponse.getRequestUrl()) && this.expiration.equals(apiAdResponse.getExpiration()) && this.sessionId.equals(apiAdResponse.getSessionId()) && ((str = this.creativeId) != null ? str.equals(apiAdResponse.getCreativeId()) : apiAdResponse.getCreativeId() == null) && this.impressionCountingType.equals(apiAdResponse.getImpressionCountingType())) {
                String str2 = this.csm;
                if (str2 == null) {
                    if (apiAdResponse.getCsm() == null) {
                        return true;
                    }
                } else if (str2.equals(apiAdResponse.getCsm())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((((((this.adFormat.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.body)) * 1000003) ^ this.responseHeaders.hashCode()) * 1000003) ^ this.charset.hashCode()) * 1000003) ^ this.requestUrl.hashCode()) * 1000003) ^ this.expiration.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003;
        String str = this.creativeId;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.impressionCountingType.hashCode()) * 1000003;
        String str2 = this.csm;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }

    static final class Builder extends ApiAdResponse.Builder {
        private AdFormat adFormat;
        private byte[] body;
        private String charset;
        private String creativeId;
        private String csm;
        private Expiration expiration;
        private ImpressionCountingType impressionCountingType;
        private String requestUrl;
        private Map<String, List<String>> responseHeaders;
        private String sessionId;

        Builder() {
        }

        public ApiAdResponse.Builder adFormat(AdFormat adFormat2) {
            if (adFormat2 != null) {
                this.adFormat = adFormat2;
                return this;
            }
            throw new NullPointerException("Null adFormat");
        }

        public ApiAdResponse.Builder body(byte[] bArr) {
            if (bArr != null) {
                this.body = bArr;
                return this;
            }
            throw new NullPointerException("Null body");
        }

        /* access modifiers changed from: package-private */
        public byte[] getBody() {
            byte[] bArr = this.body;
            if (bArr != null) {
                return bArr;
            }
            throw new IllegalStateException("Property \"body\" has not been set");
        }

        public ApiAdResponse.Builder responseHeaders(Map<String, List<String>> map) {
            if (map != null) {
                this.responseHeaders = map;
                return this;
            }
            throw new NullPointerException("Null responseHeaders");
        }

        /* access modifiers changed from: package-private */
        public Map<String, List<String>> getResponseHeaders() {
            Map<String, List<String>> map = this.responseHeaders;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"responseHeaders\" has not been set");
        }

        public ApiAdResponse.Builder charset(String str) {
            if (str != null) {
                this.charset = str;
                return this;
            }
            throw new NullPointerException("Null charset");
        }

        public ApiAdResponse.Builder requestUrl(String str) {
            if (str != null) {
                this.requestUrl = str;
                return this;
            }
            throw new NullPointerException("Null requestUrl");
        }

        public ApiAdResponse.Builder expiration(Expiration expiration2) {
            if (expiration2 != null) {
                this.expiration = expiration2;
                return this;
            }
            throw new NullPointerException("Null expiration");
        }

        public ApiAdResponse.Builder sessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public ApiAdResponse.Builder creativeId(String str) {
            this.creativeId = str;
            return this;
        }

        public ApiAdResponse.Builder impressionCountingType(ImpressionCountingType impressionCountingType2) {
            if (impressionCountingType2 != null) {
                this.impressionCountingType = impressionCountingType2;
                return this;
            }
            throw new NullPointerException("Null impressionCountingType");
        }

        public ApiAdResponse.Builder csm(String str) {
            this.csm = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public ApiAdResponse autoBuild() {
            String str = "";
            if (this.adFormat == null) {
                str = str + " adFormat";
            }
            if (this.body == null) {
                str = str + " body";
            }
            if (this.responseHeaders == null) {
                str = str + " responseHeaders";
            }
            if (this.charset == null) {
                str = str + " charset";
            }
            if (this.requestUrl == null) {
                str = str + " requestUrl";
            }
            if (this.expiration == null) {
                str = str + " expiration";
            }
            if (this.sessionId == null) {
                str = str + " sessionId";
            }
            if (this.impressionCountingType == null) {
                str = str + " impressionCountingType";
            }
            if (str.isEmpty()) {
                return new AutoValue_ApiAdResponse(this.adFormat, this.body, this.responseHeaders, this.charset, this.requestUrl, this.expiration, this.sessionId, this.creativeId, this.impressionCountingType, this.csm);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
