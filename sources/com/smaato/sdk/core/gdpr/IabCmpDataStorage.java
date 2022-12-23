package com.smaato.sdk.core.gdpr;

public interface IabCmpDataStorage {
    CmpData getCmpData();

    String getConsentString();

    int getConsentVersion();

    String getPurposesString();

    SubjectToGdpr getSubjectToGdpr();

    String getVendorsString();

    boolean isCmpPresent();
}
