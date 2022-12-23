package com.p374my.target;

import android.graphics.Rect;

/* renamed from: com.my.target.o1 */
public class C9878o1 {

    /* renamed from: a */
    public final Rect f24420a = new Rect();

    /* renamed from: b */
    public final Rect f24421b = new Rect();

    /* renamed from: c */
    public final Rect f24422c = new Rect();

    /* renamed from: d */
    public final Rect f24423d = new Rect();

    /* renamed from: e */
    public final Rect f24424e = new Rect();

    /* renamed from: f */
    public final Rect f24425f = new Rect();

    /* renamed from: g */
    public final Rect f24426g = new Rect();

    /* renamed from: h */
    public final Rect f24427h = new Rect();

    /* renamed from: a */
    public static void m28880a(Rect rect, Rect rect2) {
        rect2.set(C10059y8.m29842c(rect.left), C10059y8.m29842c(rect.top), C10059y8.m29842c(rect.right), C10059y8.m29842c(rect.bottom));
    }

    /* renamed from: e */
    public static C9878o1 m28881e() {
        return new C9878o1();
    }

    /* renamed from: a */
    public Rect mo65147a() {
        return this.f24423d;
    }

    /* renamed from: a */
    public void mo65148a(int i, int i2) {
        this.f24420a.set(0, 0, i, i2);
        m28880a(this.f24420a, this.f24421b);
    }

    /* renamed from: a */
    public void mo65149a(int i, int i2, int i3, int i4) {
        this.f24422c.set(i, i2, i3, i4);
        m28880a(this.f24422c, this.f24423d);
    }

    /* renamed from: b */
    public Rect mo65150b() {
        return this.f24425f;
    }

    /* renamed from: b */
    public void mo65151b(int i, int i2, int i3, int i4) {
        this.f24424e.set(i, i2, i3, i4);
        m28880a(this.f24424e, this.f24425f);
    }

    /* renamed from: c */
    public Rect mo65152c() {
        return this.f24427h;
    }

    /* renamed from: c */
    public void mo65153c(int i, int i2, int i3, int i4) {
        this.f24426g.set(i, i2, i3, i4);
        m28880a(this.f24426g, this.f24427h);
    }

    /* renamed from: d */
    public Rect mo65154d() {
        return this.f24421b;
    }
}
