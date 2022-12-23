package com.smaato.sdk.core.gdpr.tcfv2.model;

public enum RestrictionType {
    NOT_ALLOWED(0),
    REQUIRE_CONSENT(1),
    REQUIRE_LI(2);
    
    private int type;

    private RestrictionType(int i) {
        this.type = i;
    }

    public int getType() {
        return this.type;
    }
}
