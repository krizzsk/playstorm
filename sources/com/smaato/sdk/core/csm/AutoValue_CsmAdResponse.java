package com.smaato.sdk.core.csm;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.csm.CsmAdResponse;
import java.util.List;

final class AutoValue_CsmAdResponse extends CsmAdResponse {
    private final ImpressionCountingType impressionCountingType;
    private final List<Network> networks;
    private final String passback;
    private final String sessionId;

    private AutoValue_CsmAdResponse(List<Network> list, String str, String str2, ImpressionCountingType impressionCountingType2) {
        this.networks = list;
        this.sessionId = str;
        this.passback = str2;
        this.impressionCountingType = impressionCountingType2;
    }

    public List<Network> getNetworks() {
        return this.networks;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getPassback() {
        return this.passback;
    }

    public ImpressionCountingType getImpressionCountingType() {
        return this.impressionCountingType;
    }

    public String toString() {
        return "CsmAdResponse{networks=" + this.networks + ", sessionId=" + this.sessionId + ", passback=" + this.passback + ", impressionCountingType=" + this.impressionCountingType + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CsmAdResponse)) {
            return false;
        }
        CsmAdResponse csmAdResponse = (CsmAdResponse) obj;
        if (!this.networks.equals(csmAdResponse.getNetworks()) || !this.sessionId.equals(csmAdResponse.getSessionId()) || !this.passback.equals(csmAdResponse.getPassback()) || !this.impressionCountingType.equals(csmAdResponse.getImpressionCountingType())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.networks.hashCode() ^ 1000003) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.passback.hashCode()) * 1000003) ^ this.impressionCountingType.hashCode();
    }

    static final class Builder extends CsmAdResponse.Builder {
        private ImpressionCountingType impressionCountingType;
        private List<Network> networks;
        private String passback;
        private String sessionId;

        Builder() {
        }

        public CsmAdResponse.Builder setNetworks(List<Network> list) {
            if (list != null) {
                this.networks = list;
                return this;
            }
            throw new NullPointerException("Null networks");
        }

        public CsmAdResponse.Builder setSessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public CsmAdResponse.Builder setPassback(String str) {
            if (str != null) {
                this.passback = str;
                return this;
            }
            throw new NullPointerException("Null passback");
        }

        public CsmAdResponse.Builder setImpressionCountingType(ImpressionCountingType impressionCountingType2) {
            if (impressionCountingType2 != null) {
                this.impressionCountingType = impressionCountingType2;
                return this;
            }
            throw new NullPointerException("Null impressionCountingType");
        }

        public CsmAdResponse build() {
            String str = "";
            if (this.networks == null) {
                str = str + " networks";
            }
            if (this.sessionId == null) {
                str = str + " sessionId";
            }
            if (this.passback == null) {
                str = str + " passback";
            }
            if (this.impressionCountingType == null) {
                str = str + " impressionCountingType";
            }
            if (str.isEmpty()) {
                return new AutoValue_CsmAdResponse(this.networks, this.sessionId, this.passback, this.impressionCountingType);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
