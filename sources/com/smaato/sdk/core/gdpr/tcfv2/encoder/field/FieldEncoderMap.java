package com.smaato.sdk.core.gdpr.tcfv2.encoder.field;

import com.smaato.sdk.core.gdpr.tcfv2.encoder.BaseEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.sequence.CoreFieldSequence;
import com.smaato.sdk.core.gdpr.tcfv2.model.Fields;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class FieldEncoderMap {
    private static final FieldEncoderMap instance = new FieldEncoderMap();
    /* access modifiers changed from: private */
    public final IntEncoder cmpId = IntEncoder.getInstance();
    /* access modifiers changed from: private */
    public final IntEncoder cmpVersion = IntEncoder.getInstance();
    /* access modifiers changed from: private */
    public final LangEncoder consentLanguage = LangEncoder.getInstance();
    /* access modifiers changed from: private */
    public final IntEncoder consentScreen = IntEncoder.getInstance();
    public final CoreFieldSequence coreFieldSequence = CoreFieldSequence.getInstance();
    public final DateEncoder created = DateEncoder.getInstance();
    private final Map<String, BaseEncoder> fieldMap = Collections.unmodifiableMap(new HashMap<String, BaseEncoder>() {
        {
            put("version", FieldEncoderMap.this.version);
            put("created", FieldEncoderMap.this.created);
            put("lastUpdated", FieldEncoderMap.this.lastUpdated);
            put("cmpId", FieldEncoderMap.this.cmpId);
            put("cmpVersion", FieldEncoderMap.this.cmpVersion);
            put("consentScreen", FieldEncoderMap.this.consentScreen);
            put("consentLanguage", FieldEncoderMap.this.consentLanguage);
            put("vendorListVersion", FieldEncoderMap.this.vendorListVersion);
            put("policyVersion", FieldEncoderMap.this.policyVersion);
            put("isServiceSpecific", FieldEncoderMap.this.isServiceSpecific);
            put("useNonStandardStacks", FieldEncoderMap.this.useNonStandardStacks);
            put("specialFeatureOptIns", FieldEncoderMap.this.specialFeatureOptIns);
            put("purposeConsents", FieldEncoderMap.this.purposeConsents);
            put("purposeLegitimateInterest", FieldEncoderMap.this.purposeLegitimateInterest);
            put("purposeOneTreatment", FieldEncoderMap.this.purposeOneTreatment);
            put("publisherCountryCode", FieldEncoderMap.this.publisherCountryCode);
            put(Fields.VENDOR_CONSENTS, FieldEncoderMap.this.vendorConsents);
            put(Fields.VENDOR_LEGITIMATE_INTEREST, FieldEncoderMap.this.vendorLegitimateInterest);
            put(Fields.PUBLISHER_RESTRICTIONS, FieldEncoderMap.this.publisherRestrictions);
            put("segmentType", FieldEncoderMap.this.segmentType);
            put("vendorsDisclosed", FieldEncoderMap.this.vendorsDisclosed);
            put("vendorsAllowed", FieldEncoderMap.this.vendorsAllowed);
            put("publisherConsents", FieldEncoderMap.this.publisherConsents);
            put("publisherLegitimateInterest", FieldEncoderMap.this.publisherLegitimateInterest);
            put("numCustomPurposes", FieldEncoderMap.this.numCustomPurposes);
            put(Fields.PUBLISHER_CUSTOM_CONSENTS, FieldEncoderMap.this.publisherCustomConsents);
            put(Fields.PUBLISHER_CUSTOM_LEGITIMATE_INTEREST, FieldEncoderMap.this.publisherCustomLegitimateInterest);
        }
    });
    /* access modifiers changed from: private */
    public final BooleanEncoder isServiceSpecific = BooleanEncoder.getInstance();
    /* access modifiers changed from: private */
    public final DateEncoder lastUpdated = DateEncoder.getInstance();
    /* access modifiers changed from: private */
    public final IntEncoder numCustomPurposes = IntEncoder.getInstance();
    /* access modifiers changed from: private */
    public final IntEncoder policyVersion = IntEncoder.getInstance();
    /* access modifiers changed from: private */
    public final FixedVectorEncoder publisherConsents = FixedVectorEncoder.getInstance();
    /* access modifiers changed from: private */
    public final LangEncoder publisherCountryCode = LangEncoder.getInstance();
    /* access modifiers changed from: private */
    public final FixedVectorEncoder publisherCustomConsents = FixedVectorEncoder.getInstance();
    /* access modifiers changed from: private */
    public final FixedVectorEncoder publisherCustomLegitimateInterest = FixedVectorEncoder.getInstance();
    /* access modifiers changed from: private */
    public final FixedVectorEncoder publisherLegitimateInterest = FixedVectorEncoder.getInstance();
    /* access modifiers changed from: private */
    public final PurposeRestrictionVectorEncoder publisherRestrictions = PurposeRestrictionVectorEncoder.getInstance();
    /* access modifiers changed from: private */
    public final FixedVectorEncoder purposeConsents = FixedVectorEncoder.getInstance();
    /* access modifiers changed from: private */
    public final FixedVectorEncoder purposeLegitimateInterest = FixedVectorEncoder.getInstance();
    /* access modifiers changed from: private */
    public final BooleanEncoder purposeOneTreatment = BooleanEncoder.getInstance();
    /* access modifiers changed from: private */
    public final IntEncoder segmentType = IntEncoder.getInstance();
    /* access modifiers changed from: private */
    public final FixedVectorEncoder specialFeatureOptIns = FixedVectorEncoder.getInstance();
    /* access modifiers changed from: private */
    public final BooleanEncoder useNonStandardStacks = BooleanEncoder.getInstance();
    /* access modifiers changed from: private */
    public final VendorVectorEncoder vendorConsents = VendorVectorEncoder.getInstance();
    /* access modifiers changed from: private */
    public final VendorVectorEncoder vendorLegitimateInterest = VendorVectorEncoder.getInstance();
    /* access modifiers changed from: private */
    public final IntEncoder vendorListVersion = IntEncoder.getInstance();
    /* access modifiers changed from: private */
    public final VendorVectorEncoder vendorsAllowed = VendorVectorEncoder.getInstance();
    /* access modifiers changed from: private */
    public final VendorVectorEncoder vendorsDisclosed = VendorVectorEncoder.getInstance();
    public final IntEncoder version = IntEncoder.getInstance();

    private FieldEncoderMap() {
    }

    public static FieldEncoderMap getInstance() {
        return instance;
    }

    public Map<String, BaseEncoder> getFieldMap() {
        return this.fieldMap;
    }
}
