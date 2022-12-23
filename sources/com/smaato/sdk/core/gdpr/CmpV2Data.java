package com.smaato.sdk.core.gdpr;

import com.smaato.sdk.core.gdpr.AutoValue_CmpV2Data;

public abstract class CmpV2Data implements CmpData {

    public static abstract class Builder {
        public abstract CmpV2Data build();

        public abstract Builder setCmpPresent(boolean z);

        public abstract Builder setCmpSdkVersion(String str);

        public abstract Builder setConsentString(String str);

        public abstract Builder setPolicyVersion(String str);

        public abstract Builder setPublisherCC(String str);

        public abstract Builder setPublisherConsent(String str);

        public abstract Builder setPublisherCustomPurposesConsents(String str);

        public abstract Builder setPublisherCustomPurposesLegitimateInterests(String str);

        public abstract Builder setPublisherLegitimateInterests(String str);

        public abstract Builder setPublisherRestrictions(String str);

        public abstract Builder setPurposeLegitimateInterests(String str);

        public abstract Builder setPurposeOneTreatment(String str);

        public abstract Builder setPurposesString(String str);

        public abstract Builder setSdkId(String str);

        public abstract Builder setSpecialFeaturesOptIns(String str);

        public abstract Builder setSubjectToGdpr(SubjectToGdpr subjectToGdpr);

        public abstract Builder setUseNonStandardStacks(String str);

        public abstract Builder setVendorLegitimateInterests(String str);

        public abstract Builder setVendorsString(String str);
    }

    public abstract String getCmpSdkVersion();

    public abstract String getConsentString();

    public abstract String getPolicyVersion();

    public abstract String getPublisherCC();

    public abstract String getPublisherConsent();

    public abstract String getPublisherCustomPurposesConsents();

    public abstract String getPublisherCustomPurposesLegitimateInterests();

    public abstract String getPublisherLegitimateInterests();

    public abstract String getPublisherRestrictions();

    public abstract String getPurposeLegitimateInterests();

    public abstract String getPurposeOneTreatment();

    public abstract String getPurposesString();

    public abstract String getSdkId();

    public abstract String getSpecialFeaturesOptIns();

    public abstract SubjectToGdpr getSubjectToGdpr();

    public abstract String getUseNonStandardStacks();

    public abstract String getVendorLegitimateInterests();

    public abstract String getVendorsString();

    public abstract boolean isCmpPresent();

    public static Builder builder() {
        return new AutoValue_CmpV2Data.Builder();
    }

    public static Builder buildEmpty(boolean z, SubjectToGdpr subjectToGdpr, String str) {
        return new AutoValue_CmpV2Data.Builder().setCmpPresent(z).setSubjectToGdpr(subjectToGdpr).setConsentString(str).setVendorsString("").setPurposesString("").setSdkId("").setCmpSdkVersion("").setPolicyVersion("").setPublisherCC("").setPurposeOneTreatment("").setUseNonStandardStacks("").setVendorLegitimateInterests("").setPurposeLegitimateInterests("").setSpecialFeaturesOptIns("").setPublisherConsent("").setPublisherLegitimateInterests("").setPublisherCustomPurposesConsents("").setPublisherCustomPurposesLegitimateInterests("");
    }
}
