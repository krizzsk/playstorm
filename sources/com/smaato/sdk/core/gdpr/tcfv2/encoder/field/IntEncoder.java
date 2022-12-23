package com.smaato.sdk.core.gdpr.tcfv2.encoder.field;

import android.util.Log;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BaseEncoder;

public final class IntEncoder implements BaseEncoder<Integer> {
    private static final IntEncoder instance = new IntEncoder();

    private IntEncoder() {
    }

    public static IntEncoder getInstance() {
        return instance;
    }

    public Integer decode(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str, 2));
        } catch (Exception e) {
            String name = IntEncoder.class.getName();
            Log.e(name, "IntEncoder's decoding failed:" + e.getMessage());
            return 0;
        }
    }
}
