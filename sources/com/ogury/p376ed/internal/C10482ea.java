package com.ogury.p376ed.internal;

import java.util.Arrays;

/* renamed from: com.ogury.ed.internal.ea */
public final class C10482ea {

    /* renamed from: a */
    public static final C10482ea f26477a = new C10482ea();

    /* renamed from: b */
    private static String f26478b = "https://%s-%s.presage.io/%s";

    private C10482ea() {
    }

    /* renamed from: a */
    public static String m31686a() {
        return m31687a("ad_sync", "sy", "v1");
    }

    /* renamed from: b */
    public static String m31689b() {
        return m31687a("pl", "pl", "v2");
    }

    /* renamed from: a */
    public static String m31688a(boolean z) {
        String a = m31687a("p", "pad", "v3");
        return z ? C10814oc.m32843b(a, "https://", "http://") : a;
    }

    /* renamed from: c */
    public static String m31690c() {
        return m31687a("track", "tr", "v1");
    }

    /* renamed from: d */
    public static String m31691d() {
        return m31687a("ad_history", "ah", "v1");
    }

    /* renamed from: a */
    private static String m31687a(String str, String str2, String str3) {
        C10770mv mvVar = C10770mv.f27006a;
        String format = String.format(f26478b + '/' + str, Arrays.copyOf(new Object[]{str2, str3, str3}, 3));
        C10765mq.m32770a((Object) format, "java.lang.String.format(format, *args)");
        return format;
    }
}
