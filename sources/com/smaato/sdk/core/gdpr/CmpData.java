package com.smaato.sdk.core.gdpr;

interface CmpData {
    String getConsentString();

    String getPurposesString();

    SubjectToGdpr getSubjectToGdpr();

    String getVendorsString();

    boolean isCmpPresent();
}
