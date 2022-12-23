package com.smaato.sdk.core.gdpr.tcfv2.encoder.field;

import com.smaato.sdk.core.gdpr.tcfv2.encoder.BaseEncoder;

public final class BooleanEncoder implements BaseEncoder<Boolean> {
    private static final BooleanEncoder instance = new BooleanEncoder();

    private BooleanEncoder() {
    }

    public static BooleanEncoder getInstance() {
        return instance;
    }

    public final Boolean decode(String str) {
        return Boolean.valueOf(str.equals("1"));
    }
}
