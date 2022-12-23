package com.ogury.p375cm.internal;

import com.google.android.exoplayer2.C5487C;
import java.nio.charset.Charset;

/* renamed from: com.ogury.cm.internal.bbbcb */
public final class bbbcb {

    /* renamed from: a */
    public static final Charset f25942a;

    /* renamed from: b */
    public static final Charset f25943b;

    /* renamed from: c */
    public static final Charset f25944c;

    /* renamed from: d */
    public static final Charset f25945d;

    /* renamed from: e */
    public static final Charset f25946e;

    /* renamed from: f */
    public static final Charset f25947f;

    /* renamed from: g */
    public static final bbbcb f25948g = new bbbcb();

    static {
        Charset forName = Charset.forName("UTF-8");
        bbabc.m30940a((Object) forName, "Charset.forName(\"UTF-8\")");
        f25942a = forName;
        Charset forName2 = Charset.forName("UTF-16");
        bbabc.m30940a((Object) forName2, "Charset.forName(\"UTF-16\")");
        f25943b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        bbabc.m30940a((Object) forName3, "Charset.forName(\"UTF-16BE\")");
        f25944c = forName3;
        Charset forName4 = Charset.forName(C5487C.UTF16LE_NAME);
        bbabc.m30940a((Object) forName4, "Charset.forName(\"UTF-16LE\")");
        f25945d = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        bbabc.m30940a((Object) forName5, "Charset.forName(\"US-ASCII\")");
        f25946e = forName5;
        Charset forName6 = Charset.forName(C5487C.ISO88591_NAME);
        bbabc.m30940a((Object) forName6, "Charset.forName(\"ISO-8859-1\")");
        f25947f = forName6;
    }

    private bbbcb() {
    }
}
