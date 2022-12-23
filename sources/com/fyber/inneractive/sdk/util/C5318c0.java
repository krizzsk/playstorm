package com.fyber.inneractive.sdk.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.util.c0 */
public class C5318c0 {
    /* renamed from: a */
    public static String m16712a(long j, long j2) {
        return new SimpleDateFormat("ss:S", Locale.getDefault()).format(new Date((System.currentTimeMillis() - j) - j2));
    }
}
