package com.mbridge.msdk.mbnative.p332b;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.mbridge.msdk.mbnative.b.a */
/* compiled from: NativeConst */
public final class C8737a {
    /* renamed from: a */
    public static String m25353a(Exception exc) {
        if (exc == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
