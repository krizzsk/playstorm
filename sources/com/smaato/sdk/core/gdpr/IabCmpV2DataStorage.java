package com.smaato.sdk.core.gdpr;

import android.content.SharedPreferences;
import com.smaato.sdk.core.gdpr.tcfv2.TCModel;
import com.smaato.sdk.core.gdpr.tcfv2.TCString;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;

public class IabCmpV2DataStorage implements IabCmpDataStorage {
    private final SharedPreferences defaultSharedPreferences;

    public int getConsentVersion() {
        return 2;
    }

    public IabCmpV2DataStorage(SharedPreferences sharedPreferences) {
        this.defaultSharedPreferences = (SharedPreferences) Objects.requireNonNull(sharedPreferences, "defaultSharedPreferences must not be null for IabCmpV2DataStorage::new");
    }

    public CmpData getCmpData() {
        String consentString = getConsentString();
        if (TextUtils.isEmpty(consentString)) {
            return CmpV2Data.buildEmpty(isCmpPresent(), getSubjectToGdpr(), "").build();
        }
        TCModel decode = TCString.getInstance().decode(consentString);
        if (!decode.isValid().booleanValue()) {
            return CmpV2Data.buildEmpty(isCmpPresent(), getSubjectToGdpr(), consentString).build();
        }
        return CmpV2Data.builder().setCmpPresent(isCmpPresent()).setSubjectToGdpr(getSubjectToGdpr()).setConsentString(consentString).setVendorsString(decode.getVendorConsents().toString()).setPurposesString(decode.getPurposeConsents().toString()).setSdkId(String.valueOf(decode.getCmpId())).setCmpSdkVersion(String.valueOf(decode.getCmpVersion())).setPolicyVersion(String.valueOf(decode.getPolicyVersion())).setPublisherCC((String) Objects.notNull(decode.getPublisherCountryCode(), "")).setPurposeOneTreatment(decode.getPurposeOneTreatment().toString()).setUseNonStandardStacks(decode.getUseNonStandardStacks().toString()).setVendorLegitimateInterests(decode.getVendorLegitimateInterest().toString()).setPurposeLegitimateInterests(decode.getPurposeLegitimateInterest().toString()).setSpecialFeaturesOptIns(decode.getSpecialFeatureOptIns().toString()).setPublisherConsent(decode.getPublisherConsents().toString()).setPublisherLegitimateInterests(decode.getPublisherLegitimateInterest().toString()).setPublisherCustomPurposesConsents(decode.getPublisherCustomConsents().toString()).setPublisherCustomPurposesLegitimateInterests(decode.getPublisherCustomLegitimateInterest().toString()).build();
    }

    public SubjectToGdpr getSubjectToGdpr() {
        String asString = getAsString(CmpApiConstants.IABTCF_GDPR_APPLIES, (String) null);
        for (SubjectToGdpr subjectToGdpr : SubjectToGdpr.values()) {
            if (subjectToGdpr.f27135id.equals(asString)) {
                return subjectToGdpr;
            }
        }
        return SubjectToGdpr.CMP_GDPR_UNKNOWN;
    }

    public String getConsentString() {
        return getAsString(CmpApiConstants.IABTCF_TC_STRING, "");
    }

    public boolean isCmpPresent() {
        return this.defaultSharedPreferences.contains(CmpApiConstants.IABTCF_TC_STRING);
    }

    public String getVendorsString() {
        return getAsString(CmpApiConstants.IABTCF_VENDOR_CONSENT, "");
    }

    public String getPurposesString() {
        return getAsString(CmpApiConstants.IABTCF_PURPOSE_CONSENTS, "");
    }

    public String getSdkId() {
        return getAsString(CmpApiConstants.IABTCF_CMP_SDK_ID, "");
    }

    public String getCmpSdkVersion() {
        return getAsString(CmpApiConstants.IABTCF_CMP_SDK_VERSION, "");
    }

    public String getPolicyVersion() {
        return getAsString(CmpApiConstants.IABTCF_POLICY_VERSION, "");
    }

    public String getPublisherCC() {
        return getAsString(CmpApiConstants.IABTCF_PUBLISHER_CC, "AA");
    }

    public String getPurposeOneTreatment() {
        return getAsString(CmpApiConstants.IABTCF_PURPOSE_ONE_TREATMENT, "");
    }

    public String getUseNonStandardStacks() {
        return getAsString(CmpApiConstants.IABTCF_USE_NON_STANDARD_STACKS, "");
    }

    public String getVendorLegitimateInterests() {
        return getAsString(CmpApiConstants.IABTCF_VENDOR_LEGITIMATE_INTERESTS, "");
    }

    public String getPurposeLegitimateInterests() {
        return getAsString(CmpApiConstants.IABTCF_PURPOSE_LEGITIMATE_INTERESTS, "");
    }

    public String getSpecialFeaturesOptIns() {
        return getAsString(CmpApiConstants.IABTCF_SPECIAL_FEATURES_OPT_INS, "");
    }

    public String getPublisherRestrictions() {
        return getAsString(CmpApiConstants.IABTCF_PUBLISHER_RERSTRICTIONS, "");
    }

    public String getPublisherConsent() {
        return getAsString(CmpApiConstants.IABTCF_PUBLISHER_CONSENT, "");
    }

    public String getPublisherLegitimateInterests() {
        return getAsString(CmpApiConstants.IABTCF_PUBLISHER_LEGITIMATE_INTERESTS, "");
    }

    public String getPublisherCustomPurposesConsents() {
        return getAsString(CmpApiConstants.IABTCF_PUBLISHER_CUSTOM_PURPOSES_CONSENTS, "");
    }

    public String getPublisherCustomPurposesLegitimateInterests() {
        return getAsString(CmpApiConstants.IABTCF_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS, "");
    }

    public boolean isVendorConsentGivenForVendorId(int i) {
        String vendorsString = getVendorsString();
        if (i <= 0 || vendorsString.length() < i || vendorsString.charAt(i - 1) != '1') {
            return false;
        }
        return true;
    }

    public boolean isVendorLegitimateInterestsGivenForVendorId(int i) {
        String vendorLegitimateInterests = getVendorLegitimateInterests();
        if (i <= 0 || vendorLegitimateInterests.length() < i || vendorLegitimateInterests.charAt(i - 1) != '1') {
            return false;
        }
        return true;
    }

    public boolean isPurposeLegitimateInterestsGivenForVendorId(int i) {
        String purposeLegitimateInterests = getPurposeLegitimateInterests();
        if (i <= 0 || purposeLegitimateInterests.length() < i || purposeLegitimateInterests.charAt(i - 1) != '1') {
            return false;
        }
        return true;
    }

    public boolean isPurposeConsentGivenForPurposeId(int i) {
        String purposesString = getPurposesString();
        if (i <= 0 || purposesString.length() < i || purposesString.charAt(i - 1) != '1') {
            return false;
        }
        return true;
    }

    private String getAsString(String str, String str2) {
        Object obj = this.defaultSharedPreferences.getAll().get(str);
        if (obj == null) {
            return str2;
        }
        if (!(obj instanceof String)) {
            return String.valueOf(obj);
        }
        String str3 = (String) obj;
        if ("true".equals(str3)) {
            return "1";
        }
        return "false".equals(str3) ? "0" : str3;
    }
}
