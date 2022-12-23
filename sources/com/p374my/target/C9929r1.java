package com.p374my.target;

/* renamed from: com.my.target.r1 */
public class C9929r1 {

    /* renamed from: a */
    public static final C9929r1 f24581a = new C9929r1(4096);

    /* renamed from: b */
    public static final C9929r1 f24582b = new C9929r1(64);

    /* renamed from: c */
    public final boolean f24583c;

    /* renamed from: d */
    public final boolean f24584d;

    /* renamed from: e */
    public final boolean f24585e;

    /* renamed from: f */
    public final boolean f24586f;

    /* renamed from: g */
    public final boolean f24587g;

    /* renamed from: h */
    public final boolean f24588h;

    /* renamed from: i */
    public final boolean f24589i;

    /* renamed from: j */
    public final boolean f24590j;

    /* renamed from: k */
    public final boolean f24591k;

    /* renamed from: l */
    public final boolean f24592l;

    /* renamed from: m */
    public final boolean f24593m;

    /* renamed from: n */
    public final boolean f24594n;

    /* renamed from: o */
    public final boolean f24595o;

    /* renamed from: p */
    public final int f24596p;

    public C9929r1(int i) {
        this.f24596p = i;
        boolean z = false;
        this.f24583c = (i & 1) == 1;
        this.f24584d = (i & 2) == 2;
        this.f24585e = (i & 4) == 4;
        this.f24586f = (i & 8) == 8;
        this.f24587g = (i & 16) == 16;
        this.f24588h = (i & 32) == 32;
        this.f24589i = (i & 64) == 64;
        this.f24590j = (i & 128) == 128;
        this.f24591k = (i & 256) == 256;
        this.f24592l = (i & 512) == 512;
        this.f24593m = (i & 1024) == 1024;
        this.f24594n = (i & 2048) == 2048;
        this.f24595o = (i & 4096) == 4096 ? true : z;
    }

    /* renamed from: a */
    public static C9929r1 m29121a(int i) {
        return new C9929r1(i);
    }

    /* renamed from: a */
    public int mo65320a() {
        return this.f24596p;
    }
}
