package com.smaato.sdk.core.gdpr.tcfv2.encoder.field;

import android.util.Log;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BaseEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.model.SortedVector;

public final class FixedVectorEncoder implements BaseEncoder<SortedVector> {
    private static final FixedVectorEncoder instance = new FixedVectorEncoder();
    private BooleanEncoder booleanEncoder = BooleanEncoder.getInstance();

    private FixedVectorEncoder() {
    }

    public static FixedVectorEncoder getInstance() {
        return instance;
    }

    public final SortedVector decode(String str) {
        try {
            SortedVector sortedVector = new SortedVector();
            for (int i = 1; i <= str.length(); i++) {
                if (this.booleanEncoder.decode(String.valueOf(str.charAt(i - 1))).booleanValue()) {
                    sortedVector.getSet().add(Integer.valueOf(i));
                    if (sortedVector.getBitLength() != 0) {
                        sortedVector.setBitLength(0);
                    }
                }
            }
            sortedVector.setBitLength(str.length());
            return sortedVector;
        } catch (Exception e) {
            String name = FixedVectorEncoder.class.getName();
            Log.e(name, "FixedVector decoder failed :" + e.getMessage());
            return null;
        }
    }
}
