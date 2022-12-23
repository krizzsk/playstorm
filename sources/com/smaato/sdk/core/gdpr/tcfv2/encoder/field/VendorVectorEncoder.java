package com.smaato.sdk.core.gdpr.tcfv2.encoder.field;

import android.util.Log;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BaseEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BitLength;
import com.smaato.sdk.core.gdpr.tcfv2.model.SortedVector;
import com.smaato.sdk.core.util.Objects;

public final class VendorVectorEncoder implements BaseEncoder<SortedVector> {
    private static final VendorVectorEncoder instance = new VendorVectorEncoder();
    private BooleanEncoder booleanEncoder = BooleanEncoder.getInstance();
    private FixedVectorEncoder fixedVectorEncoder = FixedVectorEncoder.getInstance();
    private IntEncoder intEncoder = IntEncoder.getInstance();

    private VendorVectorEncoder() {
    }

    public static VendorVectorEncoder getInstance() {
        return instance;
    }

    public final SortedVector decode(String str) {
        int i;
        try {
            SortedVector sortedVector = new SortedVector();
            int intValueFromMap = Objects.getIntValueFromMap(BitLength.getFieldLengths(), BitLength.MAX_ID) + 0;
            int intValue = this.intEncoder.decode(str.substring(0, intValueFromMap)).intValue();
            VectorEncodingType valueOf = VectorEncodingType.valueOf(this.intEncoder.decode(Character.toString(str.charAt(intValueFromMap))).intValue() == 0 ? "FIELD" : "RANGE");
            int intValueFromMap2 = intValueFromMap + Objects.getIntValueFromMap(BitLength.getFieldLengths(), BitLength.ENCODING_TYPE);
            if (valueOf.getType() == VectorEncodingType.RANGE.getType()) {
                i = Objects.getIntValueFromMap(BitLength.getFieldLengths(), BitLength.NUM_ENTRIES) + intValueFromMap2;
                int intValue2 = this.intEncoder.decode(str.substring(intValueFromMap2, i)).intValue();
                for (int i2 = 0; i2 < intValue2; i2++) {
                    Boolean decode = this.booleanEncoder.decode(Character.toString(str.charAt(i)));
                    int intValueFromMap3 = i + Objects.getIntValueFromMap(BitLength.getFieldLengths(), BitLength.SINGLE_OR_RANGE);
                    int intValueFromMap4 = Objects.getIntValueFromMap(BitLength.getFieldLengths(), BitLength.VENDOR_ID) + intValueFromMap3;
                    int intValue3 = this.intEncoder.decode(str.substring(intValueFromMap3, intValueFromMap4)).intValue();
                    if (decode.booleanValue()) {
                        int intValueFromMap5 = Objects.getIntValueFromMap(BitLength.getFieldLengths(), BitLength.SINGLE_OR_RANGE) + intValueFromMap4;
                        int intValue4 = this.intEncoder.decode(str.substring(intValueFromMap4, intValueFromMap5)).intValue();
                        while (intValue3 <= intValue4) {
                            sortedVector.getSet().add(Integer.valueOf(intValue3));
                            sortedVector.setBitLength(0);
                            intValue3++;
                        }
                        i = intValueFromMap5;
                    } else {
                        sortedVector.getSet().add(Integer.valueOf(intValue3));
                        sortedVector.setBitLength(0);
                        i = intValueFromMap4;
                    }
                }
            } else {
                i = intValue + intValueFromMap2;
                sortedVector = this.fixedVectorEncoder.decode(str.substring(intValueFromMap2, i));
            }
            sortedVector.setBitLength(i);
            return sortedVector;
        } catch (Exception e) {
            Log.e(VendorVectorEncoder.class.getName(), "VendorVectorEncoder's decoder failed: " + e.getMessage());
            return null;
        }
    }
}
