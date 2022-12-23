package com.smaato.sdk.iahb;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.iahb.IahbExt;

final class AutoValue_IahbExt extends IahbExt {
    private final String adspaceid;
    private final String adtype;
    private final long expiresAt;
    private final ImpressionCountingType impressionMeasurement;

    private AutoValue_IahbExt(String str, String str2, long j, ImpressionCountingType impressionCountingType) {
        this.adspaceid = str;
        this.adtype = str2;
        this.expiresAt = j;
        this.impressionMeasurement = impressionCountingType;
    }

    /* access modifiers changed from: package-private */
    public String adspaceid() {
        return this.adspaceid;
    }

    /* access modifiers changed from: package-private */
    public String adtype() {
        return this.adtype;
    }

    /* access modifiers changed from: package-private */
    public long expiresAt() {
        return this.expiresAt;
    }

    /* access modifiers changed from: package-private */
    public ImpressionCountingType impressionMeasurement() {
        return this.impressionMeasurement;
    }

    public String toString() {
        return "IahbExt{adspaceid=" + this.adspaceid + ", adtype=" + this.adtype + ", expiresAt=" + this.expiresAt + ", impressionMeasurement=" + this.impressionMeasurement + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IahbExt)) {
            return false;
        }
        IahbExt iahbExt = (IahbExt) obj;
        if (!this.adspaceid.equals(iahbExt.adspaceid()) || !this.adtype.equals(iahbExt.adtype()) || this.expiresAt != iahbExt.expiresAt() || !this.impressionMeasurement.equals(iahbExt.impressionMeasurement())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.expiresAt;
        return ((((((this.adspaceid.hashCode() ^ 1000003) * 1000003) ^ this.adtype.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.impressionMeasurement.hashCode();
    }

    static final class Builder extends IahbExt.Builder {
        private String adspaceid;
        private String adtype;
        private Long expiresAt;
        private ImpressionCountingType impressionMeasurement;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public IahbExt.Builder adspaceid(String str) {
            if (str != null) {
                this.adspaceid = str;
                return this;
            }
            throw new NullPointerException("Null adspaceid");
        }

        /* access modifiers changed from: package-private */
        public IahbExt.Builder adtype(String str) {
            if (str != null) {
                this.adtype = str;
                return this;
            }
            throw new NullPointerException("Null adtype");
        }

        /* access modifiers changed from: package-private */
        public IahbExt.Builder expiresAt(long j) {
            this.expiresAt = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public IahbExt.Builder impressionMeasurement(ImpressionCountingType impressionCountingType) {
            if (impressionCountingType != null) {
                this.impressionMeasurement = impressionCountingType;
                return this;
            }
            throw new NullPointerException("Null impressionMeasurement");
        }

        /* access modifiers changed from: package-private */
        public IahbExt autoBuild() {
            String str = "";
            if (this.adspaceid == null) {
                str = str + " adspaceid";
            }
            if (this.adtype == null) {
                str = str + " adtype";
            }
            if (this.expiresAt == null) {
                str = str + " expiresAt";
            }
            if (this.impressionMeasurement == null) {
                str = str + " impressionMeasurement";
            }
            if (str.isEmpty()) {
                return new AutoValue_IahbExt(this.adspaceid, this.adtype, this.expiresAt.longValue(), this.impressionMeasurement);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
