package com.smaato.sdk.core.gdpr;

import com.smaato.sdk.core.gdpr.CmpV1Data;

final class AutoValue_CmpV1Data extends CmpV1Data {
    private final boolean cmpPresent;
    private final String consentString;
    private final String purposesString;
    private final SubjectToGdpr subjectToGdpr;
    private final String vendorsString;

    private AutoValue_CmpV1Data(boolean z, SubjectToGdpr subjectToGdpr2, String str, String str2, String str3) {
        this.cmpPresent = z;
        this.subjectToGdpr = subjectToGdpr2;
        this.consentString = str;
        this.vendorsString = str2;
        this.purposesString = str3;
    }

    public boolean isCmpPresent() {
        return this.cmpPresent;
    }

    public SubjectToGdpr getSubjectToGdpr() {
        return this.subjectToGdpr;
    }

    public String getConsentString() {
        return this.consentString;
    }

    public String getVendorsString() {
        return this.vendorsString;
    }

    public String getPurposesString() {
        return this.purposesString;
    }

    public String toString() {
        return "CmpV1Data{cmpPresent=" + this.cmpPresent + ", subjectToGdpr=" + this.subjectToGdpr + ", consentString=" + this.consentString + ", vendorsString=" + this.vendorsString + ", purposesString=" + this.purposesString + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmpV1Data)) {
            return false;
        }
        CmpV1Data cmpV1Data = (CmpV1Data) obj;
        if (this.cmpPresent != cmpV1Data.isCmpPresent() || !this.subjectToGdpr.equals(cmpV1Data.getSubjectToGdpr()) || !this.consentString.equals(cmpV1Data.getConsentString()) || !this.vendorsString.equals(cmpV1Data.getVendorsString()) || !this.purposesString.equals(cmpV1Data.getPurposesString())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((this.cmpPresent ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.subjectToGdpr.hashCode()) * 1000003) ^ this.consentString.hashCode()) * 1000003) ^ this.vendorsString.hashCode()) * 1000003) ^ this.purposesString.hashCode();
    }

    static final class Builder extends CmpV1Data.Builder {
        private Boolean cmpPresent;
        private String consentString;
        private String purposesString;
        private SubjectToGdpr subjectToGdpr;
        private String vendorsString;

        Builder() {
        }

        public CmpV1Data.Builder setCmpPresent(boolean z) {
            this.cmpPresent = Boolean.valueOf(z);
            return this;
        }

        public CmpV1Data.Builder setSubjectToGdpr(SubjectToGdpr subjectToGdpr2) {
            if (subjectToGdpr2 != null) {
                this.subjectToGdpr = subjectToGdpr2;
                return this;
            }
            throw new NullPointerException("Null subjectToGdpr");
        }

        public CmpV1Data.Builder setConsentString(String str) {
            if (str != null) {
                this.consentString = str;
                return this;
            }
            throw new NullPointerException("Null consentString");
        }

        public CmpV1Data.Builder setVendorsString(String str) {
            if (str != null) {
                this.vendorsString = str;
                return this;
            }
            throw new NullPointerException("Null vendorsString");
        }

        public CmpV1Data.Builder setPurposesString(String str) {
            if (str != null) {
                this.purposesString = str;
                return this;
            }
            throw new NullPointerException("Null purposesString");
        }

        public CmpV1Data build() {
            String str = "";
            if (this.cmpPresent == null) {
                str = str + " cmpPresent";
            }
            if (this.subjectToGdpr == null) {
                str = str + " subjectToGdpr";
            }
            if (this.consentString == null) {
                str = str + " consentString";
            }
            if (this.vendorsString == null) {
                str = str + " vendorsString";
            }
            if (this.purposesString == null) {
                str = str + " purposesString";
            }
            if (str.isEmpty()) {
                return new AutoValue_CmpV1Data(this.cmpPresent.booleanValue(), this.subjectToGdpr, this.consentString, this.vendorsString, this.purposesString);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
