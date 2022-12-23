package com.unity3d.player;

/* renamed from: com.unity3d.player.n */
final class C11935n {

    /* renamed from: a */
    private static boolean f29228a = false;

    /* renamed from: b */
    private boolean f29229b = false;

    /* renamed from: c */
    private boolean f29230c = false;

    /* renamed from: d */
    private boolean f29231d = true;

    /* renamed from: e */
    private boolean f29232e = false;

    C11935n() {
    }

    /* renamed from: a */
    static void m34558a() {
        f29228a = true;
    }

    /* renamed from: b */
    static void m34559b() {
        f29228a = false;
    }

    /* renamed from: c */
    static boolean m34560c() {
        return f29228a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73069a(boolean z) {
        this.f29229b = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo73070b(boolean z) {
        this.f29231d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo73071c(boolean z) {
        this.f29232e = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo73072d(boolean z) {
        this.f29230c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo73073d() {
        return this.f29231d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo73074e() {
        return this.f29232e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo73075f() {
        return f29228a && this.f29229b && !this.f29231d && !this.f29230c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo73076g() {
        return this.f29230c;
    }

    public final String toString() {
        return super.toString();
    }
}
