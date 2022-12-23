package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.ix */
public final class C10646ix {

    /* renamed from: a */
    private final String f26871a;

    /* renamed from: b */
    private final String f26872b;

    /* renamed from: c */
    private final String f26873c;

    /* renamed from: d */
    private final String f26874d;

    public C10646ix(String str, String str2, String str3, String str4) {
        C10765mq.m32773b(str, "identifier");
        C10765mq.m32773b(str2, "name");
        C10765mq.m32773b(str3, "iconUrl");
        C10765mq.m32773b(str4, "argsJson");
        this.f26871a = str;
        this.f26872b = str2;
        this.f26873c = str3;
        this.f26874d = str4;
    }

    /* renamed from: a */
    public final String mo67658a() {
        return this.f26871a;
    }

    /* renamed from: b */
    public final String mo67659b() {
        return this.f26872b;
    }

    /* renamed from: c */
    public final String mo67660c() {
        return this.f26873c;
    }

    /* renamed from: d */
    public final String mo67661d() {
        return this.f26874d;
    }

    /* renamed from: e */
    public final boolean mo67662e() {
        if (!(this.f26874d.length() == 0)) {
            if (!(this.f26871a.length() == 0)) {
                return this.f26873c.length() == 0;
            }
        }
    }
}
