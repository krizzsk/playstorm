package com.smaato.sdk.core.gdpr.tcfv2.encoder;

import android.util.Base64;
import android.util.Log;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public final class Base64Converter {
    private static final Base64Converter instance = new Base64Converter();

    /* renamed from: p */
    private static final Pattern f27137p = Pattern.compile("[A-Z0-9\\-_+/]*", 2);

    private Base64Converter() {
    }

    public static Base64Converter getInstance() {
        return instance;
    }

    public static String decode(String str) {
        Class<Base64Converter> cls = Base64Converter.class;
        if (!f27137p.matcher(str).matches()) {
            Logger.getLogger(cls.getName()).warning("Base64Converter regex mismatch:" + str);
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            StringBuilder sb = new StringBuilder();
            for (byte b : decode) {
                String binaryString = Integer.toBinaryString(b & 255);
                for (int i = 0; i < 8 - binaryString.length(); i++) {
                    sb.append("0");
                }
                sb.append(binaryString);
            }
            return sb.toString();
        } catch (Exception e) {
            Log.e(cls.getName(), "Base64 decoder failed: " + e.getMessage());
            return null;
        }
    }
}
