package com.google.common.base;

import com.google.android.exoplayer2.C5487C;
import java.nio.charset.Charset;

public final class Charsets {
    public static final Charset ISO_8859_1 = Charset.forName(C5487C.ISO88591_NAME);
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset UTF_16 = Charset.forName("UTF-16");
    public static final Charset UTF_16BE = Charset.forName("UTF-16BE");
    public static final Charset UTF_16LE = Charset.forName(C5487C.UTF16LE_NAME);
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    private Charsets() {
    }
}
