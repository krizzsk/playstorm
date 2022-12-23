package com.smaato.sdk.core.gdpr.tcfv2.encoder.field;

import android.util.Log;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BaseEncoder;

public final class LangEncoder implements BaseEncoder<String> {
    private static final LangEncoder instance = new LangEncoder();
    private IntEncoder intEncoder = IntEncoder.getInstance();

    private LangEncoder() {
    }

    public static LangEncoder getInstance() {
        return instance;
    }

    public final String decode(String str) {
        if (str.isEmpty() || str.length() % 2 != 0) {
            String name = LangEncoder.class.getName();
            Log.e(name, "Decoding bits should be even in length and greater than 0. " + str);
            return "";
        }
        int length = str.length() / 2;
        return fromCharCode(this.intEncoder.decode(str.substring(0, length)).intValue() + 65) + fromCharCode(this.intEncoder.decode(str.substring(length)).intValue() + 65);
    }

    private static String fromCharCode(int... iArr) {
        return new String(iArr, 0, iArr.length);
    }
}
