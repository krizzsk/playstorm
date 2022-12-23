package com.ogury.p376ed.internal;

import java.util.regex.Pattern;

/* renamed from: com.ogury.ed.internal.ih */
public class C10623ih extends C10661ji {

    /* renamed from: a */
    private final Pattern f26819a;

    /* renamed from: b */
    private final String f26820b;

    public C10623ih(Pattern pattern) {
        C10765mq.m32773b(pattern, "whitelistPattern");
        this.f26819a = pattern;
        this.f26820b = pattern.pattern();
    }

    /* renamed from: a */
    public final boolean mo67623a(String str) {
        C10765mq.m32773b(str, "url");
        String str2 = this.f26820b;
        C10765mq.m32770a((Object) str2, "stringPattern");
        return (str2.length() > 0) && !this.f26819a.matcher(str).find();
    }
}
