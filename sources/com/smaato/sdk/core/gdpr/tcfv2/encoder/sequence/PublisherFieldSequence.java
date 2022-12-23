package com.smaato.sdk.core.gdpr.tcfv2.encoder.sequence;

import com.smaato.sdk.core.gdpr.tcfv2.model.Fields;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PublisherFieldSequence {
    private static final PublisherFieldSequence instance = new PublisherFieldSequence();
    private List<String> versionOneFieldSequence = Collections.emptyList();
    private List<String> versionTwoFieldSequence = Collections.unmodifiableList(new ArrayList<String>() {
        {
            add("publisherConsents");
            add("publisherLegitimateInterest");
            add("numCustomPurposes");
            add(Fields.PUBLISHER_CUSTOM_CONSENTS);
            add(Fields.PUBLISHER_CUSTOM_LEGITIMATE_INTEREST);
        }
    });

    private PublisherFieldSequence() {
    }

    public static PublisherFieldSequence getInstance() {
        return instance;
    }

    public List<String> getVersionOneFieldSequence() {
        return this.versionOneFieldSequence;
    }

    public List<String> getVersionTwoFieldSequence() {
        return this.versionTwoFieldSequence;
    }
}
