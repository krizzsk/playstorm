package com.ogury.p376ed.internal;

import java.util.Locale;

/* renamed from: com.ogury.ed.internal.hl */
public final class C10592hl {
    /* renamed from: a */
    public static final boolean m32219a(String str) {
        C10765mq.m32773b(str, "<this>");
        Locale locale = Locale.US;
        C10765mq.m32770a((Object) locale, "US");
        String lowerCase = str.toLowerCase(locale);
        C10765mq.m32770a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return C10814oc.m32844b(lowerCase, "http://ogymraid") || C10814oc.m32844b(lowerCase, "https://ogymraid");
    }

    /* renamed from: b */
    public static final String m32220b(String str) {
        C10765mq.m32773b(str, "<this>");
        Locale locale = Locale.US;
        C10765mq.m32770a((Object) locale, "US");
        String lowerCase = str.toLowerCase(locale);
        C10765mq.m32770a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        String str2 = "http://ogymraid";
        if (!C10814oc.m32844b(lowerCase, str2)) {
            str2 = "https://ogymraid";
        }
        String substring = str.substring(C10765mq.m32765a(str2, (Object) "/?q=").length());
        C10765mq.m32770a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }
}
