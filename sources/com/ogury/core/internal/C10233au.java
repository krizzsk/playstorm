package com.ogury.core.internal;

import com.google.android.exoplayer2.C5487C;
import java.nio.charset.Charset;

/* renamed from: com.ogury.core.internal.au */
/* compiled from: Charsets.kt */
public final class C10233au {

    /* renamed from: a */
    public static final Charset f26004a;

    static {
        new C10233au();
        Charset forName = Charset.forName("UTF-8");
        C10219ai.m31034a((Object) forName, "Charset.forName(\"UTF-8\")");
        f26004a = forName;
        C10219ai.m31034a((Object) Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        C10219ai.m31034a((Object) Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        C10219ai.m31034a((Object) Charset.forName(C5487C.UTF16LE_NAME), "Charset.forName(\"UTF-16LE\")");
        C10219ai.m31034a((Object) Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        C10219ai.m31034a((Object) Charset.forName(C5487C.ISO88591_NAME), "Charset.forName(\"ISO-8859-1\")");
    }

    private C10233au() {
    }
}
