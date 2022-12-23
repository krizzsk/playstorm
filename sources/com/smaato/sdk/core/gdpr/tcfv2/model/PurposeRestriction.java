package com.smaato.sdk.core.gdpr.tcfv2.model;

import com.smaato.sdk.core.util.Objects;
import java.util.Arrays;
import java.util.List;

public class PurposeRestriction {
    private static String hashSeparator = "-";
    private int purposeId;
    private final RestrictionType restrictionType;

    public PurposeRestriction(int i, RestrictionType restrictionType2) {
        this.purposeId = i;
        this.restrictionType = (RestrictionType) Objects.requireNonNull(restrictionType2);
    }

    static PurposeRestriction unHash(String str) {
        List asList = Arrays.asList(str.split(hashSeparator));
        int parseInt = Integer.parseInt((String) asList.get(0));
        int parseInt2 = Integer.parseInt((String) asList.get(1));
        if (parseInt2 == 0) {
            return new PurposeRestriction(parseInt, RestrictionType.NOT_ALLOWED);
        }
        if (parseInt2 == 1) {
            return new PurposeRestriction(parseInt, RestrictionType.REQUIRE_CONSENT);
        }
        if (parseInt2 != 2) {
            return null;
        }
        return new PurposeRestriction(parseInt, RestrictionType.REQUIRE_LI);
    }

    public String getHash() {
        return this.purposeId + hashSeparator + this.restrictionType.getType();
    }

    /* access modifiers changed from: package-private */
    public int getPurposeId() {
        return this.purposeId;
    }

    public void setPurposeId(int i) {
        this.purposeId = i;
    }

    /* access modifiers changed from: package-private */
    public RestrictionType getRestrictionType() {
        return this.restrictionType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !(obj instanceof PurposeRestriction)) {
            return false;
        }
        PurposeRestriction purposeRestriction = (PurposeRestriction) obj;
        if (this.purposeId != purposeRestriction.purposeId) {
            return false;
        }
        if (this.restrictionType == purposeRestriction.restrictionType) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.purposeId * 31) + this.restrictionType.hashCode();
    }
}
