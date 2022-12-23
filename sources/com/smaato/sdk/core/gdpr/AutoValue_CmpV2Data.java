package com.smaato.sdk.core.gdpr;

import com.smaato.sdk.core.gdpr.CmpV2Data;

final class AutoValue_CmpV2Data extends CmpV2Data {
    private final boolean cmpPresent;
    private final String cmpSdkVersion;
    private final String consentString;
    private final String policyVersion;
    private final String publisherCC;
    private final String publisherConsent;
    private final String publisherCustomPurposesConsents;
    private final String publisherCustomPurposesLegitimateInterests;
    private final String publisherLegitimateInterests;
    private final String publisherRestrictions;
    private final String purposeLegitimateInterests;
    private final String purposeOneTreatment;
    private final String purposesString;
    private final String sdkId;
    private final String specialFeaturesOptIns;
    private final SubjectToGdpr subjectToGdpr;
    private final String useNonStandardStacks;
    private final String vendorLegitimateInterests;
    private final String vendorsString;

    private AutoValue_CmpV2Data(boolean z, SubjectToGdpr subjectToGdpr2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.cmpPresent = z;
        this.subjectToGdpr = subjectToGdpr2;
        this.consentString = str;
        this.vendorsString = str2;
        this.purposesString = str3;
        this.sdkId = str4;
        this.cmpSdkVersion = str5;
        this.policyVersion = str6;
        this.publisherCC = str7;
        this.purposeOneTreatment = str8;
        this.useNonStandardStacks = str9;
        this.vendorLegitimateInterests = str10;
        this.purposeLegitimateInterests = str11;
        this.specialFeaturesOptIns = str12;
        this.publisherRestrictions = str13;
        this.publisherConsent = str14;
        this.publisherLegitimateInterests = str15;
        this.publisherCustomPurposesConsents = str16;
        this.publisherCustomPurposesLegitimateInterests = str17;
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

    public String getSdkId() {
        return this.sdkId;
    }

    public String getCmpSdkVersion() {
        return this.cmpSdkVersion;
    }

    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public String getPublisherCC() {
        return this.publisherCC;
    }

    public String getPurposeOneTreatment() {
        return this.purposeOneTreatment;
    }

    public String getUseNonStandardStacks() {
        return this.useNonStandardStacks;
    }

    public String getVendorLegitimateInterests() {
        return this.vendorLegitimateInterests;
    }

    public String getPurposeLegitimateInterests() {
        return this.purposeLegitimateInterests;
    }

    public String getSpecialFeaturesOptIns() {
        return this.specialFeaturesOptIns;
    }

    public String getPublisherRestrictions() {
        return this.publisherRestrictions;
    }

    public String getPublisherConsent() {
        return this.publisherConsent;
    }

    public String getPublisherLegitimateInterests() {
        return this.publisherLegitimateInterests;
    }

    public String getPublisherCustomPurposesConsents() {
        return this.publisherCustomPurposesConsents;
    }

    public String getPublisherCustomPurposesLegitimateInterests() {
        return this.publisherCustomPurposesLegitimateInterests;
    }

    public String toString() {
        return "CmpV2Data{cmpPresent=" + this.cmpPresent + ", subjectToGdpr=" + this.subjectToGdpr + ", consentString=" + this.consentString + ", vendorsString=" + this.vendorsString + ", purposesString=" + this.purposesString + ", sdkId=" + this.sdkId + ", cmpSdkVersion=" + this.cmpSdkVersion + ", policyVersion=" + this.policyVersion + ", publisherCC=" + this.publisherCC + ", purposeOneTreatment=" + this.purposeOneTreatment + ", useNonStandardStacks=" + this.useNonStandardStacks + ", vendorLegitimateInterests=" + this.vendorLegitimateInterests + ", purposeLegitimateInterests=" + this.purposeLegitimateInterests + ", specialFeaturesOptIns=" + this.specialFeaturesOptIns + ", publisherRestrictions=" + this.publisherRestrictions + ", publisherConsent=" + this.publisherConsent + ", publisherLegitimateInterests=" + this.publisherLegitimateInterests + ", publisherCustomPurposesConsents=" + this.publisherCustomPurposesConsents + ", publisherCustomPurposesLegitimateInterests=" + this.publisherCustomPurposesLegitimateInterests + "}";
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmpV2Data)) {
            return false;
        }
        CmpV2Data cmpV2Data = (CmpV2Data) obj;
        if (this.cmpPresent != cmpV2Data.isCmpPresent() || !this.subjectToGdpr.equals(cmpV2Data.getSubjectToGdpr()) || !this.consentString.equals(cmpV2Data.getConsentString()) || !this.vendorsString.equals(cmpV2Data.getVendorsString()) || !this.purposesString.equals(cmpV2Data.getPurposesString()) || !this.sdkId.equals(cmpV2Data.getSdkId()) || !this.cmpSdkVersion.equals(cmpV2Data.getCmpSdkVersion()) || !this.policyVersion.equals(cmpV2Data.getPolicyVersion()) || !this.publisherCC.equals(cmpV2Data.getPublisherCC()) || !this.purposeOneTreatment.equals(cmpV2Data.getPurposeOneTreatment()) || !this.useNonStandardStacks.equals(cmpV2Data.getUseNonStandardStacks()) || !this.vendorLegitimateInterests.equals(cmpV2Data.getVendorLegitimateInterests()) || !this.purposeLegitimateInterests.equals(cmpV2Data.getPurposeLegitimateInterests()) || !this.specialFeaturesOptIns.equals(cmpV2Data.getSpecialFeaturesOptIns()) || ((str = this.publisherRestrictions) != null ? !str.equals(cmpV2Data.getPublisherRestrictions()) : cmpV2Data.getPublisherRestrictions() != null) || !this.publisherConsent.equals(cmpV2Data.getPublisherConsent()) || !this.publisherLegitimateInterests.equals(cmpV2Data.getPublisherLegitimateInterests()) || !this.publisherCustomPurposesConsents.equals(cmpV2Data.getPublisherCustomPurposesConsents()) || !this.publisherCustomPurposesLegitimateInterests.equals(cmpV2Data.getPublisherCustomPurposesLegitimateInterests())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((this.cmpPresent ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.subjectToGdpr.hashCode()) * 1000003) ^ this.consentString.hashCode()) * 1000003) ^ this.vendorsString.hashCode()) * 1000003) ^ this.purposesString.hashCode()) * 1000003) ^ this.sdkId.hashCode()) * 1000003) ^ this.cmpSdkVersion.hashCode()) * 1000003) ^ this.policyVersion.hashCode()) * 1000003) ^ this.publisherCC.hashCode()) * 1000003) ^ this.purposeOneTreatment.hashCode()) * 1000003) ^ this.useNonStandardStacks.hashCode()) * 1000003) ^ this.vendorLegitimateInterests.hashCode()) * 1000003) ^ this.purposeLegitimateInterests.hashCode()) * 1000003) ^ this.specialFeaturesOptIns.hashCode()) * 1000003;
        String str = this.publisherRestrictions;
        return ((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.publisherConsent.hashCode()) * 1000003) ^ this.publisherLegitimateInterests.hashCode()) * 1000003) ^ this.publisherCustomPurposesConsents.hashCode()) * 1000003) ^ this.publisherCustomPurposesLegitimateInterests.hashCode();
    }

    static final class Builder extends CmpV2Data.Builder {
        private Boolean cmpPresent;
        private String cmpSdkVersion;
        private String consentString;
        private String policyVersion;
        private String publisherCC;
        private String publisherConsent;
        private String publisherCustomPurposesConsents;
        private String publisherCustomPurposesLegitimateInterests;
        private String publisherLegitimateInterests;
        private String publisherRestrictions;
        private String purposeLegitimateInterests;
        private String purposeOneTreatment;
        private String purposesString;
        private String sdkId;
        private String specialFeaturesOptIns;
        private SubjectToGdpr subjectToGdpr;
        private String useNonStandardStacks;
        private String vendorLegitimateInterests;
        private String vendorsString;

        Builder() {
        }

        public CmpV2Data.Builder setCmpPresent(boolean z) {
            this.cmpPresent = Boolean.valueOf(z);
            return this;
        }

        public CmpV2Data.Builder setSubjectToGdpr(SubjectToGdpr subjectToGdpr2) {
            if (subjectToGdpr2 != null) {
                this.subjectToGdpr = subjectToGdpr2;
                return this;
            }
            throw new NullPointerException("Null subjectToGdpr");
        }

        public CmpV2Data.Builder setConsentString(String str) {
            if (str != null) {
                this.consentString = str;
                return this;
            }
            throw new NullPointerException("Null consentString");
        }

        public CmpV2Data.Builder setVendorsString(String str) {
            if (str != null) {
                this.vendorsString = str;
                return this;
            }
            throw new NullPointerException("Null vendorsString");
        }

        public CmpV2Data.Builder setPurposesString(String str) {
            if (str != null) {
                this.purposesString = str;
                return this;
            }
            throw new NullPointerException("Null purposesString");
        }

        public CmpV2Data.Builder setSdkId(String str) {
            if (str != null) {
                this.sdkId = str;
                return this;
            }
            throw new NullPointerException("Null sdkId");
        }

        public CmpV2Data.Builder setCmpSdkVersion(String str) {
            if (str != null) {
                this.cmpSdkVersion = str;
                return this;
            }
            throw new NullPointerException("Null cmpSdkVersion");
        }

        public CmpV2Data.Builder setPolicyVersion(String str) {
            if (str != null) {
                this.policyVersion = str;
                return this;
            }
            throw new NullPointerException("Null policyVersion");
        }

        public CmpV2Data.Builder setPublisherCC(String str) {
            if (str != null) {
                this.publisherCC = str;
                return this;
            }
            throw new NullPointerException("Null publisherCC");
        }

        public CmpV2Data.Builder setPurposeOneTreatment(String str) {
            if (str != null) {
                this.purposeOneTreatment = str;
                return this;
            }
            throw new NullPointerException("Null purposeOneTreatment");
        }

        public CmpV2Data.Builder setUseNonStandardStacks(String str) {
            if (str != null) {
                this.useNonStandardStacks = str;
                return this;
            }
            throw new NullPointerException("Null useNonStandardStacks");
        }

        public CmpV2Data.Builder setVendorLegitimateInterests(String str) {
            if (str != null) {
                this.vendorLegitimateInterests = str;
                return this;
            }
            throw new NullPointerException("Null vendorLegitimateInterests");
        }

        public CmpV2Data.Builder setPurposeLegitimateInterests(String str) {
            if (str != null) {
                this.purposeLegitimateInterests = str;
                return this;
            }
            throw new NullPointerException("Null purposeLegitimateInterests");
        }

        public CmpV2Data.Builder setSpecialFeaturesOptIns(String str) {
            if (str != null) {
                this.specialFeaturesOptIns = str;
                return this;
            }
            throw new NullPointerException("Null specialFeaturesOptIns");
        }

        public CmpV2Data.Builder setPublisherRestrictions(String str) {
            this.publisherRestrictions = str;
            return this;
        }

        public CmpV2Data.Builder setPublisherConsent(String str) {
            if (str != null) {
                this.publisherConsent = str;
                return this;
            }
            throw new NullPointerException("Null publisherConsent");
        }

        public CmpV2Data.Builder setPublisherLegitimateInterests(String str) {
            if (str != null) {
                this.publisherLegitimateInterests = str;
                return this;
            }
            throw new NullPointerException("Null publisherLegitimateInterests");
        }

        public CmpV2Data.Builder setPublisherCustomPurposesConsents(String str) {
            if (str != null) {
                this.publisherCustomPurposesConsents = str;
                return this;
            }
            throw new NullPointerException("Null publisherCustomPurposesConsents");
        }

        public CmpV2Data.Builder setPublisherCustomPurposesLegitimateInterests(String str) {
            if (str != null) {
                this.publisherCustomPurposesLegitimateInterests = str;
                return this;
            }
            throw new NullPointerException("Null publisherCustomPurposesLegitimateInterests");
        }

        public CmpV2Data build() {
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
            if (this.sdkId == null) {
                str = str + " sdkId";
            }
            if (this.cmpSdkVersion == null) {
                str = str + " cmpSdkVersion";
            }
            if (this.policyVersion == null) {
                str = str + " policyVersion";
            }
            if (this.publisherCC == null) {
                str = str + " publisherCC";
            }
            if (this.purposeOneTreatment == null) {
                str = str + " purposeOneTreatment";
            }
            if (this.useNonStandardStacks == null) {
                str = str + " useNonStandardStacks";
            }
            if (this.vendorLegitimateInterests == null) {
                str = str + " vendorLegitimateInterests";
            }
            if (this.purposeLegitimateInterests == null) {
                str = str + " purposeLegitimateInterests";
            }
            if (this.specialFeaturesOptIns == null) {
                str = str + " specialFeaturesOptIns";
            }
            if (this.publisherConsent == null) {
                str = str + " publisherConsent";
            }
            if (this.publisherLegitimateInterests == null) {
                str = str + " publisherLegitimateInterests";
            }
            if (this.publisherCustomPurposesConsents == null) {
                str = str + " publisherCustomPurposesConsents";
            }
            if (this.publisherCustomPurposesLegitimateInterests == null) {
                str = str + " publisherCustomPurposesLegitimateInterests";
            }
            if (str.isEmpty()) {
                return new AutoValue_CmpV2Data(this.cmpPresent.booleanValue(), this.subjectToGdpr, this.consentString, this.vendorsString, this.purposesString, this.sdkId, this.cmpSdkVersion, this.policyVersion, this.publisherCC, this.purposeOneTreatment, this.useNonStandardStacks, this.vendorLegitimateInterests, this.purposeLegitimateInterests, this.specialFeaturesOptIns, this.publisherRestrictions, this.publisherConsent, this.publisherLegitimateInterests, this.publisherCustomPurposesConsents, this.publisherCustomPurposesLegitimateInterests);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
