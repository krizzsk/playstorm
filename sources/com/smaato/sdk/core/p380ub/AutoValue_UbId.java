package com.smaato.sdk.core.p380ub;

import com.smaato.sdk.core.p380ub.UbId;

/* renamed from: com.smaato.sdk.core.ub.AutoValue_UbId */
final class AutoValue_UbId extends UbId {
    private final String adSpaceId;
    private final String sessionId;

    private AutoValue_UbId(String str, String str2) {
        this.sessionId = str;
        this.adSpaceId = str2;
    }

    public String sessionId() {
        return this.sessionId;
    }

    public String adSpaceId() {
        return this.adSpaceId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UbId)) {
            return false;
        }
        UbId ubId = (UbId) obj;
        if (!this.sessionId.equals(ubId.sessionId()) || !this.adSpaceId.equals(ubId.adSpaceId())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.sessionId.hashCode() ^ 1000003) * 1000003) ^ this.adSpaceId.hashCode();
    }

    /* renamed from: com.smaato.sdk.core.ub.AutoValue_UbId$Builder */
    static final class Builder extends UbId.Builder {
        private String adSpaceId;
        private String sessionId;

        Builder() {
        }

        public UbId.Builder sessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public UbId.Builder adSpaceId(String str) {
            if (str != null) {
                this.adSpaceId = str;
                return this;
            }
            throw new NullPointerException("Null adSpaceId");
        }

        public UbId build() {
            String str = "";
            if (this.sessionId == null) {
                str = str + " sessionId";
            }
            if (this.adSpaceId == null) {
                str = str + " adSpaceId";
            }
            if (str.isEmpty()) {
                return new AutoValue_UbId(this.sessionId, this.adSpaceId);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
