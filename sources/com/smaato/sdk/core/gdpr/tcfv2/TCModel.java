package com.smaato.sdk.core.gdpr.tcfv2;

import android.util.Log;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.field.DateEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.model.ConsentLanguages;
import com.smaato.sdk.core.gdpr.tcfv2.model.PurposeRestrictionVector;
import com.smaato.sdk.core.gdpr.tcfv2.model.SortedVector;
import com.smaato.sdk.core.gdpr.tcfv2.model.gvl.Purpose;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

public class TCModel {
    private static final String TAG = "com.smaato.sdk.core.gdpr.tcfv2.TCModel";

    /* renamed from: p */
    private static Pattern f27136p = Pattern.compile("[A-Z]{2}", 2);
    private int cmpId;
    private int cmpVersion;
    private String consentLanguage;
    private int consentScreen = 0;
    private String created;
    private Map<String, Purpose> customPurposes;
    private Boolean isServiceSpecific;
    private String lastUpdated;
    private int policyVersion = 2;
    private SortedVector publisherConsents;
    private String publisherCountryCode;
    private SortedVector publisherCustomConsents;
    private SortedVector publisherCustomLegitimateInterest;
    private SortedVector publisherLegitimateInterest;
    private PurposeRestrictionVector publisherRestrictions;
    private SortedVector purposeConsents;
    private SortedVector purposeLegitimateInterest;
    private Boolean purposeOneTreatment;
    private SortedVector specialFeatureOptIns;
    private Boolean supportOOB;
    private Boolean useNonStandardStacks;
    private SortedVector vendorConsents;
    private SortedVector vendorLegitimateInterest;
    private int vendorListVersion;
    private SortedVector vendorsAllowed;
    private SortedVector vendorsDisclosed;
    private int version = 2;

    TCModel() {
        Boolean bool = Boolean.FALSE;
        this.isServiceSpecific = bool;
        this.useNonStandardStacks = bool;
        this.purposeOneTreatment = bool;
        this.publisherCountryCode = "EN";
        this.supportOOB = bool;
        this.cmpId = 0;
        this.cmpVersion = 0;
        this.vendorListVersion = 0;
        this.specialFeatureOptIns = new SortedVector();
        this.purposeConsents = new SortedVector();
        this.publisherConsents = new SortedVector();
        this.purposeLegitimateInterest = new SortedVector();
        this.publisherLegitimateInterest = new SortedVector();
        this.publisherCustomConsents = new SortedVector();
        this.publisherCustomLegitimateInterest = new SortedVector();
        this.vendorConsents = new SortedVector();
        this.vendorLegitimateInterest = new SortedVector();
        this.vendorsDisclosed = new SortedVector();
        this.vendorsAllowed = new SortedVector();
        this.publisherRestrictions = new PurposeRestrictionVector();
        update();
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i) {
        if (i <= 0 || i > 2) {
            String str = TAG;
            Log.e(str, "Incorrect Version: " + i);
            return;
        }
        this.version = i;
    }

    /* access modifiers changed from: package-private */
    public int getConsentScreen() {
        return this.consentScreen;
    }

    /* access modifiers changed from: package-private */
    public void setConsentScreen(int i) {
        if (i > -1) {
            this.consentScreen = i;
            return;
        }
        String str = TAG;
        Log.e(str, "Incorrect consentScreen: " + i);
    }

    public int getPolicyVersion() {
        return this.policyVersion;
    }

    /* access modifiers changed from: package-private */
    public void setPolicyVersion(int i) {
        this.policyVersion = i;
    }

    /* access modifiers changed from: package-private */
    public Boolean getServiceSpecific() {
        return this.isServiceSpecific;
    }

    /* access modifiers changed from: package-private */
    public void setServiceSpecific(Boolean bool) {
        this.isServiceSpecific = bool;
    }

    public Boolean getUseNonStandardStacks() {
        return this.useNonStandardStacks;
    }

    /* access modifiers changed from: package-private */
    public void setUseNonStandardStacks(Boolean bool) {
        this.useNonStandardStacks = bool;
    }

    public Boolean getPurposeOneTreatment() {
        return this.purposeOneTreatment;
    }

    /* access modifiers changed from: package-private */
    public void setPurposeOneTreatment(Boolean bool) {
        this.purposeOneTreatment = bool;
    }

    public String getPublisherCountryCode() {
        return this.publisherCountryCode;
    }

    /* access modifiers changed from: package-private */
    public void setPublisherCountryCode(String str) {
        if (f27136p.matcher(str).matches()) {
            this.publisherCountryCode = str.toUpperCase(Locale.getDefault());
            return;
        }
        String str2 = TAG;
        Log.e(str2, "Incorrect CountryCode : " + str);
    }

    /* access modifiers changed from: package-private */
    public Boolean getSupportOOB() {
        return this.supportOOB;
    }

    /* access modifiers changed from: package-private */
    public void setSupportOOB(Boolean bool) {
        this.supportOOB = bool;
    }

    /* access modifiers changed from: package-private */
    public String getConsentLanguage() {
        return this.consentLanguage;
    }

    /* access modifiers changed from: package-private */
    public void setConsentLanguage(String str) {
        String upperCase = str.toUpperCase(Locale.getDefault());
        if (ConsentLanguages.LANGUAGES.contains(upperCase)) {
            this.consentLanguage = upperCase;
        }
    }

    public int getCmpId() {
        return this.cmpId;
    }

    /* access modifiers changed from: package-private */
    public void setCmpId(int i) {
        if (i > 1) {
            this.cmpId = i;
            return;
        }
        String str = TAG;
        Log.e(str, "Invalid cmpId: " + i);
    }

    public int getCmpVersion() {
        return this.cmpVersion;
    }

    /* access modifiers changed from: package-private */
    public void setCmpVersion(int i) {
        if (i > 0) {
            this.cmpVersion = i;
            return;
        }
        String str = TAG;
        Log.e(str, "Invalid cmpVersion:" + i);
    }

    /* access modifiers changed from: package-private */
    public int getVendorListVersion() {
        return this.vendorListVersion;
    }

    /* access modifiers changed from: package-private */
    public void setVendorListVersion(int i) {
        if (i > 0) {
            this.vendorListVersion = i;
            return;
        }
        String str = TAG;
        Log.e(str, "Invalid VendorListVersion:" + i);
    }

    public String getCreated() {
        return this.created;
    }

    public void setCreated(String str) {
        this.created = str;
    }

    /* access modifiers changed from: package-private */
    public String getLastUpdated() {
        return this.lastUpdated;
    }

    /* access modifiers changed from: package-private */
    public void setLastUpdated(String str) {
        this.lastUpdated = str;
    }

    private void update() {
        this.created = DateEncoder.getInstance().decode((String) null);
        this.lastUpdated = DateEncoder.getInstance().decode((String) null);
    }

    public int getNumCustomPurposes() {
        Map<String, Purpose> map = this.customPurposes;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void setNumCustomPurposes(int i) {
        if (this.customPurposes == null) {
            this.customPurposes = new HashMap();
            int i2 = 0;
            while (i2 < i) {
                i2++;
                String valueOf = String.valueOf(i2);
                Purpose purpose = new Purpose();
                purpose.setId(i2);
                purpose.setName("publisher purpose " + valueOf);
                purpose.setDescription("publisher purpose description " + valueOf);
                purpose.setDescriptionLegal("publisher purpose legal description" + valueOf);
                this.customPurposes.put(valueOf, purpose);
            }
        }
    }

    public SortedVector getSpecialFeatureOptIns() {
        return this.specialFeatureOptIns;
    }

    public SortedVector getPurposeConsents() {
        return this.purposeConsents;
    }

    public SortedVector getPurposeLegitimateInterest() {
        return this.purposeLegitimateInterest;
    }

    public SortedVector getVendorConsents() {
        return this.vendorConsents;
    }

    public SortedVector getVendorLegitimateInterest() {
        return this.vendorLegitimateInterest;
    }

    /* access modifiers changed from: package-private */
    public PurposeRestrictionVector getPublisherRestrictions() {
        return this.publisherRestrictions;
    }

    /* access modifiers changed from: package-private */
    public void setSpecialFeatureOptIns(SortedVector sortedVector) {
        if (sortedVector == null) {
            Log.w("TCModel", "specialFeatureOptIns is null");
        } else {
            this.specialFeatureOptIns = sortedVector;
        }
    }

    /* access modifiers changed from: package-private */
    public void setPurposeConsents(SortedVector sortedVector) {
        if (sortedVector == null) {
            Log.w("TCModel", "purposeConsents is null");
        } else {
            this.purposeConsents = sortedVector;
        }
    }

    /* access modifiers changed from: package-private */
    public void setPurposeLegitimateInterest(SortedVector sortedVector) {
        if (sortedVector == null) {
            Log.w("TCModel", "purposeLegitimateInterest is null");
        } else {
            this.purposeLegitimateInterest = sortedVector;
        }
    }

    /* access modifiers changed from: package-private */
    public void setVendorConsents(SortedVector sortedVector) {
        if (sortedVector == null) {
            Log.w("TCModel", "vendorConsents is null");
        } else {
            this.vendorConsents = sortedVector;
        }
    }

    /* access modifiers changed from: package-private */
    public void setVendorLegitimateInterest(SortedVector sortedVector) {
        if (sortedVector == null) {
            Log.w("TCModel", "vendorLegitimateInterest is null");
        } else {
            this.vendorLegitimateInterest = sortedVector;
        }
    }

    /* access modifiers changed from: package-private */
    public void setPublisherRestrictions(PurposeRestrictionVector purposeRestrictionVector) {
        if (purposeRestrictionVector == null) {
            Log.w("TCModel", "publisherRestrictions is null");
        } else {
            this.publisherRestrictions = purposeRestrictionVector;
        }
    }

    /* access modifiers changed from: package-private */
    public SortedVector getVendorsDisclosed() {
        return this.vendorsDisclosed;
    }

    /* access modifiers changed from: package-private */
    public void setVendorsDisclosed(SortedVector sortedVector) {
        if (sortedVector == null) {
            Log.w("TCModel", "vendorsDisclosed is null");
        } else {
            this.vendorsDisclosed = sortedVector;
        }
    }

    /* access modifiers changed from: package-private */
    public SortedVector getVendorsAllowed() {
        return this.vendorsAllowed;
    }

    /* access modifiers changed from: package-private */
    public void setVendorsAllowed(SortedVector sortedVector) {
        if (sortedVector == null) {
            Log.w("TCModel", "vendorsAllowed is null");
        } else {
            this.vendorsAllowed = sortedVector;
        }
    }

    public SortedVector getPublisherConsents() {
        return this.publisherConsents;
    }

    /* access modifiers changed from: package-private */
    public void setPublisherConsents(SortedVector sortedVector) {
        if (sortedVector == null) {
            Log.w("TCModel", "publisherConsents is null");
        } else {
            this.publisherConsents = sortedVector;
        }
    }

    public SortedVector getPublisherLegitimateInterest() {
        return this.publisherLegitimateInterest;
    }

    /* access modifiers changed from: package-private */
    public void setPublisherLegitimateInterest(SortedVector sortedVector) {
        if (sortedVector == null) {
            Log.w("TCModel", "publisherLegitimateInterest is null");
        } else {
            this.publisherLegitimateInterest = sortedVector;
        }
    }

    public SortedVector getPublisherCustomConsents() {
        return this.publisherCustomConsents;
    }

    /* access modifiers changed from: package-private */
    public void setPublisherCustomConsents(SortedVector sortedVector) {
        if (sortedVector == null) {
            Log.w("TCModel", "publisherCustomConsents is null");
        } else {
            this.publisherCustomConsents = sortedVector;
        }
    }

    public SortedVector getPublisherCustomLegitimateInterest() {
        return this.publisherCustomLegitimateInterest;
    }

    /* access modifiers changed from: package-private */
    public void setPublisherCustomLegitimateInterest(SortedVector sortedVector) {
        if (sortedVector == null) {
            Log.w("TCModel", "publisherCustomLegitimateInterest is null");
        } else {
            this.publisherCustomLegitimateInterest = sortedVector;
        }
    }

    public Boolean isValid() {
        int i;
        int i2;
        boolean z = true;
        if (this.isServiceSpecific == null || this.useNonStandardStacks == null || this.cmpId == 0 || this.cmpVersion == 0 || this.consentLanguage == null || this.publisherCountryCode == null || this.purposeOneTreatment == null || this.consentScreen == 0 || this.created == null || this.lastUpdated == null || !(((i = this.policyVersion) == 1 || i == 2) && this.vendorListVersion != 0 && ((i2 = this.version) == 2 || i2 == 1))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
