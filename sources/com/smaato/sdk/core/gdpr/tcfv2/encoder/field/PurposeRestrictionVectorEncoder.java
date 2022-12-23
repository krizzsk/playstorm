package com.smaato.sdk.core.gdpr.tcfv2.encoder.field;

import android.util.Log;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BaseEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BitLength;
import com.smaato.sdk.core.gdpr.tcfv2.model.PurposeRestriction;
import com.smaato.sdk.core.gdpr.tcfv2.model.PurposeRestrictionVector;
import com.smaato.sdk.core.gdpr.tcfv2.model.RestrictionType;
import com.smaato.sdk.core.util.Objects;

public final class PurposeRestrictionVectorEncoder implements BaseEncoder<PurposeRestrictionVector> {
    private static volatile PurposeRestrictionVectorEncoder instance = new PurposeRestrictionVectorEncoder();
    private BooleanEncoder booleanEncoder = BooleanEncoder.getInstance();
    private IntEncoder intEncoder = IntEncoder.getInstance();

    private PurposeRestrictionVectorEncoder() {
    }

    public static PurposeRestrictionVectorEncoder getInstance() {
        return instance;
    }

    public PurposeRestrictionVector decode(String str) {
        PurposeRestriction purposeRestriction;
        try {
            PurposeRestrictionVector purposeRestrictionVector = new PurposeRestrictionVector();
            int intValueFromMap = Objects.getIntValueFromMap(BitLength.getFieldLengths(), BitLength.NUM_RESTRICTIONS) + 0;
            int intValue = this.intEncoder.decode(str.substring(0, intValueFromMap)).intValue();
            for (int i = 0; i < intValue; i++) {
                int intValueFromMap2 = Objects.getIntValueFromMap(BitLength.getFieldLengths(), BitLength.PURPOSE_ID) + intValueFromMap;
                int intValue2 = this.intEncoder.decode(str.substring(intValueFromMap, intValueFromMap2)).intValue();
                int intValueFromMap3 = Objects.getIntValueFromMap(BitLength.getFieldLengths(), BitLength.RESTRICTION_TYPE) + intValueFromMap2;
                int intValue3 = this.intEncoder.decode(str.substring(intValueFromMap2, intValueFromMap3)).intValue();
                if (intValue3 == 0) {
                    purposeRestriction = new PurposeRestriction(intValue2, RestrictionType.NOT_ALLOWED);
                } else if (intValue3 == 1) {
                    purposeRestriction = new PurposeRestriction(intValue2, RestrictionType.REQUIRE_CONSENT);
                } else if (intValue3 != 2) {
                    purposeRestriction = null;
                } else {
                    purposeRestriction = new PurposeRestriction(intValue2, RestrictionType.REQUIRE_LI);
                }
                intValueFromMap = Objects.getIntValueFromMap(BitLength.getFieldLengths(), BitLength.NUM_ENTRIES) + intValueFromMap3;
                int intValue4 = this.intEncoder.decode(str.substring(intValueFromMap3, intValueFromMap)).intValue();
                for (int i2 = 0; i2 < intValue4; i2++) {
                    int intValueFromMap4 = Objects.getIntValueFromMap(BitLength.getFieldLengths(), BitLength.ANY_BOOLEAN) + intValueFromMap;
                    Boolean decode = this.booleanEncoder.decode(str.substring(intValueFromMap, intValueFromMap4));
                    int intValueFromMap5 = Objects.getIntValueFromMap(BitLength.getFieldLengths(), BitLength.VENDOR_ID) + intValueFromMap4;
                    int intValue5 = this.intEncoder.decode(str.substring(intValueFromMap4, intValueFromMap5)).intValue();
                    if (decode.booleanValue()) {
                        intValueFromMap = Objects.getIntValueFromMap(BitLength.getFieldLengths(), BitLength.VENDOR_ID) + intValueFromMap5;
                        int intValue6 = this.intEncoder.decode(str.substring(intValueFromMap5, intValueFromMap)).intValue();
                        while (intValue5 <= intValue6) {
                            purposeRestrictionVector.add(intValue5, purposeRestriction);
                            intValue5++;
                        }
                    } else {
                        purposeRestrictionVector.add(intValue5, purposeRestriction);
                        intValueFromMap = intValueFromMap5;
                    }
                }
            }
            purposeRestrictionVector.setBitLength(intValueFromMap);
            return purposeRestrictionVector;
        } catch (Exception e) {
            Log.e(PurposeRestrictionVectorEncoder.class.getName(), "PurposeRestrictionVector's decoder failed: " + e.getMessage());
            return null;
        }
    }
}
