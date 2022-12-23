package com.smaato.sdk.core.csm;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.csm.CsmAdObject;

final class AutoValue_CsmAdObject extends CsmAdObject {
    private final ImpressionCountingType impressionCountingType;
    private final Network network;
    private final String passback;
    private final String sessionId;
    private final SomaApiContext somaApiContext;

    private AutoValue_CsmAdObject(SomaApiContext somaApiContext2, Network network2, String str, String str2, ImpressionCountingType impressionCountingType2) {
        this.somaApiContext = somaApiContext2;
        this.network = network2;
        this.sessionId = str;
        this.passback = str2;
        this.impressionCountingType = impressionCountingType2;
    }

    public SomaApiContext getSomaApiContext() {
        return this.somaApiContext;
    }

    public Network getNetwork() {
        return this.network;
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
        return "CsmAdObject{somaApiContext=" + this.somaApiContext + ", network=" + this.network + ", sessionId=" + this.sessionId + ", passback=" + this.passback + ", impressionCountingType=" + this.impressionCountingType + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CsmAdObject)) {
            return false;
        }
        CsmAdObject csmAdObject = (CsmAdObject) obj;
        if (!this.somaApiContext.equals(csmAdObject.getSomaApiContext()) || !this.network.equals(csmAdObject.getNetwork()) || !this.sessionId.equals(csmAdObject.getSessionId()) || !this.passback.equals(csmAdObject.getPassback()) || !this.impressionCountingType.equals(csmAdObject.getImpressionCountingType())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((this.somaApiContext.hashCode() ^ 1000003) * 1000003) ^ this.network.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.passback.hashCode()) * 1000003) ^ this.impressionCountingType.hashCode();
    }

    static final class Builder extends CsmAdObject.Builder {
        private ImpressionCountingType impressionCountingType;
        private Network network;
        private String passback;
        private String sessionId;
        private SomaApiContext somaApiContext;

        Builder() {
        }

        public CsmAdObject.Builder setSomaApiContext(SomaApiContext somaApiContext2) {
            if (somaApiContext2 != null) {
                this.somaApiContext = somaApiContext2;
                return this;
            }
            throw new NullPointerException("Null somaApiContext");
        }

        public CsmAdObject.Builder setNetwork(Network network2) {
            if (network2 != null) {
                this.network = network2;
                return this;
            }
            throw new NullPointerException("Null network");
        }

        public CsmAdObject.Builder setSessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public CsmAdObject.Builder setPassback(String str) {
            if (str != null) {
                this.passback = str;
                return this;
            }
            throw new NullPointerException("Null passback");
        }

        public CsmAdObject.Builder setImpressionCountingType(ImpressionCountingType impressionCountingType2) {
            if (impressionCountingType2 != null) {
                this.impressionCountingType = impressionCountingType2;
                return this;
            }
            throw new NullPointerException("Null impressionCountingType");
        }

        public CsmAdObject build() {
            String str = "";
            if (this.somaApiContext == null) {
                str = str + " somaApiContext";
            }
            if (this.network == null) {
                str = str + " network";
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
                return new AutoValue_CsmAdObject(this.somaApiContext, this.network, this.sessionId, this.passback, this.impressionCountingType);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
