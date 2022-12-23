package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.hd */
public final class C10583hd {

    /* renamed from: a */
    public static final C10583hd f26708a = new C10583hd();

    /* renamed from: a */
    private static String m32197a() {
        return "window.MRAID_ENV =  { version: '3.0', sdk: 'Presage', sdkVersion: '4.2.0'};";
    }

    private C10583hd() {
    }

    /* renamed from: b */
    private static String m32199b(C10493ek ekVar) {
        return "window.MRAID_ENV =  { version: '3.0', sdk: 'Presage', sdkVersion: '4.2.0', adUnit: { type: '" + ekVar.mo67296c() + "', reward : { name: '" + ekVar.mo67300e().getName() + "', value: '" + ekVar.mo67300e().getValue() + "', launch: '" + ekVar.mo67298d() + "'}}};";
    }

    /* renamed from: a */
    public static String m32198a(C10493ek ekVar) {
        if (ekVar == null || !C10765mq.m32772a((Object) ekVar.mo67296c(), (Object) "optin_video")) {
            return m32197a();
        }
        return m32199b(ekVar);
    }
}
