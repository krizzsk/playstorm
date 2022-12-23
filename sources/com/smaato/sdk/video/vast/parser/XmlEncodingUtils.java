package com.smaato.sdk.video.vast.parser;

import android.util.Xml;
import java.io.UnsupportedEncodingException;

public final class XmlEncodingUtils {
    private XmlEncodingUtils() {
    }

    public static boolean isSupported(String str) {
        try {
            return Xml.findEncodingByName(str) != null;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }
}
