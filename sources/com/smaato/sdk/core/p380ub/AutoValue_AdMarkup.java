package com.smaato.sdk.core.p380ub;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.p378ad.Expiration;
import com.smaato.sdk.core.p380ub.AdMarkup;

/* renamed from: com.smaato.sdk.core.ub.AutoValue_AdMarkup */
final class AutoValue_AdMarkup extends AdMarkup {
    private final String adFormat;
    private final String adSpaceId;
    private final Expiration expiresAt;
    private final ImpressionCountingType impressionCountingType;
    private final String markup;
    private final String sessionId;

    private AutoValue_AdMarkup(String str, String str2, String str3, String str4, Expiration expiration, ImpressionCountingType impressionCountingType2) {
        this.markup = str;
        this.adFormat = str2;
        this.sessionId = str3;
        this.adSpaceId = str4;
        this.expiresAt = expiration;
        this.impressionCountingType = impressionCountingType2;
    }

    public String markup() {
        return this.markup;
    }

    public String adFormat() {
        return this.adFormat;
    }

    public String sessionId() {
        return this.sessionId;
    }

    public String adSpaceId() {
        return this.adSpaceId;
    }

    public Expiration expiresAt() {
        return this.expiresAt;
    }

    public ImpressionCountingType impressionCountingType() {
        return this.impressionCountingType;
    }

    public String toString() {
        return "AdMarkup{markup=" + this.markup + ", adFormat=" + this.adFormat + ", sessionId=" + this.sessionId + ", adSpaceId=" + this.adSpaceId + ", expiresAt=" + this.expiresAt + ", impressionCountingType=" + this.impressionCountingType + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdMarkup)) {
            return false;
        }
        AdMarkup adMarkup = (AdMarkup) obj;
        if (!this.markup.equals(adMarkup.markup()) || !this.adFormat.equals(adMarkup.adFormat()) || !this.sessionId.equals(adMarkup.sessionId()) || !this.adSpaceId.equals(adMarkup.adSpaceId()) || !this.expiresAt.equals(adMarkup.expiresAt()) || !this.impressionCountingType.equals(adMarkup.impressionCountingType())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((this.markup.hashCode() ^ 1000003) * 1000003) ^ this.adFormat.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.adSpaceId.hashCode()) * 1000003) ^ this.expiresAt.hashCode()) * 1000003) ^ this.impressionCountingType.hashCode();
    }

    /* renamed from: com.smaato.sdk.core.ub.AutoValue_AdMarkup$Builder */
    static final class Builder extends AdMarkup.Builder {
        private String adFormat;
        private String adSpaceId;
        private Expiration expiresAt;
        private ImpressionCountingType impressionCountingType;
        private String markup;
        private String sessionId;

        Builder() {
        }

        public AdMarkup.Builder markup(String str) {
            if (str != null) {
                this.markup = str;
                return this;
            }
            throw new NullPointerException("Null markup");
        }

        public AdMarkup.Builder adFormat(String str) {
            if (str != null) {
                this.adFormat = str;
                return this;
            }
            throw new NullPointerException("Null adFormat");
        }

        public AdMarkup.Builder sessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public AdMarkup.Builder adSpaceId(String str) {
            if (str != null) {
                this.adSpaceId = str;
                return this;
            }
            throw new NullPointerException("Null adSpaceId");
        }

        public AdMarkup.Builder expiresAt(Expiration expiration) {
            if (expiration != null) {
                this.expiresAt = expiration;
                return this;
            }
            throw new NullPointerException("Null expiresAt");
        }

        public AdMarkup.Builder impressionCountingType(ImpressionCountingType impressionCountingType2) {
            if (impressionCountingType2 != null) {
                this.impressionCountingType = impressionCountingType2;
                return this;
            }
            throw new NullPointerException("Null impressionCountingType");
        }

        public AdMarkup build() {
            String str = "";
            if (this.markup == null) {
                str = str + " markup";
            }
            if (this.adFormat == null) {
                str = str + " adFormat";
            }
            if (this.sessionId == null) {
                str = str + " sessionId";
            }
            if (this.adSpaceId == null) {
                str = str + " adSpaceId";
            }
            if (this.expiresAt == null) {
                str = str + " expiresAt";
            }
            if (this.impressionCountingType == null) {
                str = str + " impressionCountingType";
            }
            if (str.isEmpty()) {
                return new AutoValue_AdMarkup(this.markup, this.adFormat, this.sessionId, this.adSpaceId, this.expiresAt, this.impressionCountingType);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
