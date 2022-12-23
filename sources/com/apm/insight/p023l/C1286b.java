package com.apm.insight.p023l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.apm.insight.l.b */
public class C1286b {

    /* renamed from: a */
    private static DateFormat f1283a;

    /* renamed from: a */
    public static DateFormat m1730a() {
        if (f1283a == null) {
            f1283a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return f1283a;
    }
}
