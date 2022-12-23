package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.hx */
public final class C10611hx {

    /* renamed from: a */
    private final boolean f26780a;

    /* renamed from: b */
    private boolean f26781b;

    /* renamed from: c */
    private final String f26782c;

    /* renamed from: d */
    private boolean f26783d;

    /* renamed from: e */
    private boolean f26784e;

    /* renamed from: f */
    private boolean f26785f;

    private C10611hx(boolean z, boolean z2, String str, boolean z3) {
        C10765mq.m32773b(str, "url");
        this.f26780a = z;
        this.f26781b = z2;
        this.f26782c = str;
        this.f26783d = z3;
        this.f26784e = false;
        this.f26785f = false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10611hx(boolean z, boolean z2, String str, boolean z3, int i) {
        this(z, z2, str, (i & 8) != 0 ? false : z3);
    }

    /* renamed from: a */
    public final boolean mo67597a() {
        return this.f26780a;
    }

    /* renamed from: b */
    public final boolean mo67598b() {
        return this.f26781b;
    }

    /* renamed from: c */
    public final String mo67599c() {
        return this.f26782c;
    }

    /* renamed from: d */
    public final boolean mo67600d() {
        return this.f26783d;
    }

    /* renamed from: e */
    public final void mo67601e() {
        this.f26783d = true;
    }

    /* renamed from: f */
    public final boolean mo67602f() {
        return this.f26784e;
    }

    /* renamed from: g */
    public final void mo67603g() {
        this.f26784e = true;
    }

    /* renamed from: h */
    public final boolean mo67604h() {
        return this.f26785f;
    }

    /* renamed from: i */
    public final void mo67605i() {
        this.f26785f = true;
    }
}
