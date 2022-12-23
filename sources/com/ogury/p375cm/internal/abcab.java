package com.ogury.p375cm.internal;

/* renamed from: com.ogury.cm.internal.abcab */
public abstract class abcab {

    /* renamed from: a */
    private String f25750a = "";

    /* renamed from: b */
    private boolean f25751b = true;

    /* renamed from: d */
    public static <T extends abcab> T m30772d() {
        abbba abbba = abbba.f25716a;
        T c = abbba.m30722c().mo66560c();
        if (c != null) {
            return c;
        }
        throw new babca("null cannot be cast to non-null type T");
    }

    /* renamed from: a */
    public final String mo66578a() {
        return this.f25750a;
    }

    /* renamed from: a */
    public final void mo66579a(String str) {
        bbabc.m30943b(str, "<set-?>");
        this.f25750a = str;
    }

    /* renamed from: a */
    public final void mo66580a(boolean z) {
        this.f25751b = z;
    }

    /* renamed from: b */
    public final boolean mo66581b() {
        abbba abbba = abbba.f25716a;
        if (abbba.m30729f("TCF")) {
            return this.f25751b;
        }
        return false;
    }

    /* renamed from: c */
    public abstract int mo66582c();
}
