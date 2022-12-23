package com.ogury.p376ed.internal;

import java.net.URLDecoder;

/* renamed from: com.ogury.ed.internal.gn */
public final class C10562gn {
    /* renamed from: a */
    public static final String m32098a(String str) {
        C10765mq.m32773b(str, "<this>");
        try {
            String decode = URLDecoder.decode(str, "UTF-8");
            C10765mq.m32770a((Object) decode, "{\n        URLDecoder.decode(this, \"UTF-8\")\n    }");
            return decode;
        } catch (Exception unused) {
            return "";
        }
    }
}
