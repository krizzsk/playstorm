package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.ep */
public final class C10498ep {

    /* renamed from: a */
    public static final C10498ep f26545a = new C10498ep();

    private C10498ep() {
    }

    /* renamed from: a */
    public static C10497eo m31824a(String str) {
        C10765mq.m32773b(str, "impressionSource");
        if (C10765mq.m32772a((Object) str, (Object) "sdk")) {
            return C10497eo.IMPRESSION_SOURCE_SDK;
        }
        C10765mq.m32772a((Object) str, (Object) "format");
        return C10497eo.IMPRESSION_SOURCE_FORMAT;
    }
}
