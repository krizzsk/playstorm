package com.ogury.p376ed.internal;

import com.google.android.exoplayer2.C5487C;
import java.nio.charset.Charset;

/* renamed from: com.ogury.ed.internal.nz */
public final class C10804nz {

    /* renamed from: a */
    public static final Charset f27018a;

    /* renamed from: b */
    public static final Charset f27019b;

    /* renamed from: c */
    public static final Charset f27020c;

    /* renamed from: d */
    public static final Charset f27021d;

    /* renamed from: e */
    public static final Charset f27022e;

    /* renamed from: f */
    public static final Charset f27023f;

    /* renamed from: g */
    public static final C10804nz f27024g = new C10804nz();

    static {
        Charset forName = Charset.forName("UTF-8");
        C10765mq.m32770a((Object) forName, "Charset.forName(\"UTF-8\")");
        f27018a = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C10765mq.m32770a((Object) forName2, "Charset.forName(\"UTF-16\")");
        f27019b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C10765mq.m32770a((Object) forName3, "Charset.forName(\"UTF-16BE\")");
        f27020c = forName3;
        Charset forName4 = Charset.forName(C5487C.UTF16LE_NAME);
        C10765mq.m32770a((Object) forName4, "Charset.forName(\"UTF-16LE\")");
        f27021d = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C10765mq.m32770a((Object) forName5, "Charset.forName(\"US-ASCII\")");
        f27022e = forName5;
        Charset forName6 = Charset.forName(C5487C.ISO88591_NAME);
        C10765mq.m32770a((Object) forName6, "Charset.forName(\"ISO-8859-1\")");
        f27023f = forName6;
    }

    private C10804nz() {
    }
}
