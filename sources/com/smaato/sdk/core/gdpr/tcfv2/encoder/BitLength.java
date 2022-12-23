package com.smaato.sdk.core.gdpr.tcfv2.encoder;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class BitLength {
    public static final String ANY_BOOLEAN = "anyBoolean";
    public static final String CHECKSUM = "checksum";
    public static final String CMP_ID = "cmpId";
    public static final String CMP_VERSION = "cmpVersion";
    public static final String CONSENT_LANGUAGE = "consentLanguage";
    public static final String CONSENT_SCREEN = "consentScreen";
    public static final String CREATED = "created";
    public static final String ENCODING_TYPE = "encodingType";
    public static final String IS_SERVICE_SPECIFIC = "isServiceSpecific";
    public static final String LAST_UPDATED = "lastUpdated";
    public static final String MAX_ID = "maxId";
    public static final String NUM_CUSTOM_PURPOSES = "numCustomPurposes";
    public static final String NUM_ENTRIES = "numEntries";
    public static final String NUM_RESTRICTIONS = "numRestrictions";
    public static final String POLICY_VERSION = "policyVersion";
    public static final String PUBLISHER_CONSENTS = "publisherConsents";
    public static final String PUBLISHER_COUNTRY_CODE = "publisherCountryCode";
    public static final String PUBLISHER_LEGITIMATE_INTEREST = "publisherLegitimateInterest";
    public static final String PURPOSE_CONSENTS = "purposeConsents";
    public static final String PURPOSE_ID = "purposeId";
    public static final String PURPOSE_LEGITIMATE_INTEREST = "purposeLegitimateInterest";
    public static final String PURPOSE_ONE_TREATMENT = "purposeOneTreatment";
    public static final String RESTRICTION_TYPE = "restrictionType";
    public static final String SEGMENT_TYPE = "segmentType";
    public static final String SINGLE_OR_RANGE = "singleOrRange";
    public static final String SPECIAL_FEATURE_OPT_INS = "specialFeatureOptIns";
    public static final String USE_NON_STANDARD_STACKS = "useNonStandardStacks";
    public static final String VENDOR_ID = "vendorId";
    public static final String VENDOR_LIST_VERSION = "vendorListVersion";
    public static final String VERSION = "version";
    private static Map<String, Integer> fieldLengths = Collections.unmodifiableMap(new HashMap<String, Integer>() {
        {
            put("version", 6);
            put(BitLength.ANY_BOOLEAN, 1);
            put(BitLength.SINGLE_OR_RANGE, 1);
            put(BitLength.ENCODING_TYPE, 1);
            put(BitLength.CHECKSUM, 18);
            put("created", 36);
            put("lastUpdated", 36);
            put("cmpId", 12);
            put("cmpVersion", 12);
            put("consentScreen", 6);
            put("consentLanguage", 12);
            put("vendorListVersion", 12);
            put("policyVersion", 6);
            put("isServiceSpecific", 1);
            put("useNonStandardStacks", 1);
            put("purposeOneTreatment", 1);
            put("publisherCountryCode", 12);
            put("specialFeatureOptIns", 12);
            put("purposeConsents", 24);
            put("purposeLegitimateInterest", 24);
            put(BitLength.VENDOR_ID, 16);
            put(BitLength.PURPOSE_ID, 6);
            put(BitLength.NUM_ENTRIES, 12);
            put(BitLength.MAX_ID, 16);
            put(BitLength.RESTRICTION_TYPE, 2);
            put(BitLength.NUM_RESTRICTIONS, 12);
            put("segmentType", 3);
            put("publisherConsents", 24);
            put("publisherLegitimateInterest", 24);
            put("numCustomPurposes", 6);
        }
    });

    private BitLength() {
    }

    public static Map<String, Integer> getFieldLengths() {
        return fieldLengths;
    }
}
