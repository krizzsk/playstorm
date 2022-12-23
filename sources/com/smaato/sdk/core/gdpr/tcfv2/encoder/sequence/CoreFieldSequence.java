package com.smaato.sdk.core.gdpr.tcfv2.encoder.sequence;

import com.smaato.sdk.core.gdpr.tcfv2.model.Fields;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CoreFieldSequence {
    private static final CoreFieldSequence instance = new CoreFieldSequence();
    private List<String> versionOneFieldSequence = Collections.unmodifiableList(new ArrayList<String>() {
        {
            add("version");
            add("created");
            add("lastUpdated");
            add("cmpId");
            add("cmpVersion");
            add("consentScreen");
            add("consentLanguage");
            add("vendorListVersion");
            add("purposeConsents");
            add(Fields.VENDOR_CONSENTS);
        }
    });
    private List<String> versionTwoFieldSequence = Collections.unmodifiableList(new ArrayList<String>() {
        {
            add("version");
            add("created");
            add("lastUpdated");
            add("cmpId");
            add("cmpVersion");
            add("consentScreen");
            add("consentLanguage");
            add("vendorListVersion");
            add("policyVersion");
            add("isServiceSpecific");
            add("useNonStandardStacks");
            add("specialFeatureOptIns");
            add("purposeConsents");
            add("purposeLegitimateInterest");
            add("purposeOneTreatment");
            add("publisherCountryCode");
            add(Fields.VENDOR_CONSENTS);
            add(Fields.VENDOR_LEGITIMATE_INTEREST);
            add(Fields.PUBLISHER_RESTRICTIONS);
        }
    });

    private CoreFieldSequence() {
    }

    public static CoreFieldSequence getInstance() {
        return instance;
    }

    public List<String> getVersionOneFieldSequence() {
        return this.versionOneFieldSequence;
    }

    public List<String> getVersionTwoFieldSequence() {
        return this.versionTwoFieldSequence;
    }
}
