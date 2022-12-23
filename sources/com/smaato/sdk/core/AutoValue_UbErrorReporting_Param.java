package com.smaato.sdk.core;

import com.smaato.sdk.core.UbErrorReporting;
import com.smaato.sdk.core.p378ad.AdFormat;

final class AutoValue_UbErrorReporting_Param extends UbErrorReporting.Param {
    private final AdFormat adFormat;
    private final String adSpaceId;
    private final String creativeId;
    private final String publisherId;
    private final Long requestTimestamp;
    private final String sessionId;

    private AutoValue_UbErrorReporting_Param(String str, String str2, String str3, String str4, AdFormat adFormat2, Long l) {
        this.publisherId = str;
        this.adSpaceId = str2;
        this.sessionId = str3;
        this.creativeId = str4;
        this.adFormat = adFormat2;
        this.requestTimestamp = l;
    }

    public String publisherId() {
        return this.publisherId;
    }

    public String adSpaceId() {
        return this.adSpaceId;
    }

    public String sessionId() {
        return this.sessionId;
    }

    public String creativeId() {
        return this.creativeId;
    }

    public AdFormat adFormat() {
        return this.adFormat;
    }

    public Long requestTimestamp() {
        return this.requestTimestamp;
    }

    public String toString() {
        return "Param{publisherId=" + this.publisherId + ", adSpaceId=" + this.adSpaceId + ", sessionId=" + this.sessionId + ", creativeId=" + this.creativeId + ", adFormat=" + this.adFormat + ", requestTimestamp=" + this.requestTimestamp + "}";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        AdFormat adFormat2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UbErrorReporting.Param)) {
            return false;
        }
        UbErrorReporting.Param param = (UbErrorReporting.Param) obj;
        if (this.publisherId.equals(param.publisherId()) && this.adSpaceId.equals(param.adSpaceId()) && ((str = this.sessionId) != null ? str.equals(param.sessionId()) : param.sessionId() == null) && ((str2 = this.creativeId) != null ? str2.equals(param.creativeId()) : param.creativeId() == null) && ((adFormat2 = this.adFormat) != null ? adFormat2.equals(param.adFormat()) : param.adFormat() == null)) {
            Long l = this.requestTimestamp;
            if (l == null) {
                if (param.requestTimestamp() == null) {
                    return true;
                }
            } else if (l.equals(param.requestTimestamp())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.publisherId.hashCode() ^ 1000003) * 1000003) ^ this.adSpaceId.hashCode()) * 1000003;
        String str = this.sessionId;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.creativeId;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        AdFormat adFormat2 = this.adFormat;
        int hashCode4 = (hashCode3 ^ (adFormat2 == null ? 0 : adFormat2.hashCode())) * 1000003;
        Long l = this.requestTimestamp;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode4 ^ i;
    }

    static final class Builder extends UbErrorReporting.Param.Builder {
        private AdFormat adFormat;
        private String adSpaceId;
        private String creativeId;
        private String publisherId;
        private Long requestTimestamp;
        private String sessionId;

        Builder() {
        }

        public UbErrorReporting.Param.Builder setPublisherId(String str) {
            if (str != null) {
                this.publisherId = str;
                return this;
            }
            throw new NullPointerException("Null publisherId");
        }

        public UbErrorReporting.Param.Builder setAdSpaceId(String str) {
            if (str != null) {
                this.adSpaceId = str;
                return this;
            }
            throw new NullPointerException("Null adSpaceId");
        }

        public UbErrorReporting.Param.Builder setSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        public UbErrorReporting.Param.Builder setCreativeId(String str) {
            this.creativeId = str;
            return this;
        }

        public UbErrorReporting.Param.Builder setAdFormat(AdFormat adFormat2) {
            this.adFormat = adFormat2;
            return this;
        }

        public UbErrorReporting.Param.Builder setRequestTimestamp(Long l) {
            this.requestTimestamp = l;
            return this;
        }

        public UbErrorReporting.Param build() {
            String str = "";
            if (this.publisherId == null) {
                str = str + " publisherId";
            }
            if (this.adSpaceId == null) {
                str = str + " adSpaceId";
            }
            if (str.isEmpty()) {
                return new AutoValue_UbErrorReporting_Param(this.publisherId, this.adSpaceId, this.sessionId, this.creativeId, this.adFormat, this.requestTimestamp);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
