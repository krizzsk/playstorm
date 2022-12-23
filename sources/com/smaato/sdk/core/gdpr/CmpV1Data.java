package com.smaato.sdk.core.gdpr;

import com.smaato.sdk.core.gdpr.AutoValue_CmpV1Data;

public abstract class CmpV1Data implements CmpData {

    public static abstract class Builder {
        public abstract CmpV1Data build();

        public abstract Builder setCmpPresent(boolean z);

        public abstract Builder setConsentString(String str);

        public abstract Builder setPurposesString(String str);

        public abstract Builder setSubjectToGdpr(SubjectToGdpr subjectToGdpr);

        public abstract Builder setVendorsString(String str);
    }

    public abstract String getConsentString();

    public abstract String getPurposesString();

    public abstract SubjectToGdpr getSubjectToGdpr();

    public abstract String getVendorsString();

    public abstract boolean isCmpPresent();

    public static Builder builder() {
        return new AutoValue_CmpV1Data.Builder();
    }
}
