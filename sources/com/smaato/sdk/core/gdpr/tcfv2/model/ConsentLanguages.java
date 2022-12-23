package com.smaato.sdk.core.gdpr.tcfv2.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class ConsentLanguages {
    public static final Set<String> LANGUAGES = Collections.unmodifiableSet(new HashSet<String>() {
        {
            add("EN");
            add("BG");
            add("CS");
            add("DA");
            add("DE");
            add("EL");
            add("ES");
            add("ET");
            add("FI");
            add("FR");
            add("GA");
            add("HR");
            add("HU");
            add("IT");
            add("LT");
            add("LV");
            add("MT");
            add("NL");
            add("PL");
            add("PT");
            add("RO");
            add("SK");
            add("SL");
            add("SV");
        }
    });

    private ConsentLanguages() {
    }
}
