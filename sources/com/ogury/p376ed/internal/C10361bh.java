package com.ogury.p376ed.internal;

import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bh */
public final class C10361bh implements C10364bk {

    /* renamed from: a */
    private final Rect f26240a;

    /* renamed from: b */
    private final Rect f26241b;

    /* renamed from: c */
    private final float f26242c;

    public C10361bh(Rect rect, Rect rect2, float f) {
        C10765mq.m32773b(rect, "adLayoutRect");
        C10765mq.m32773b(rect2, "containerRect");
        this.f26240a = rect;
        this.f26241b = rect2;
        this.f26242c = f;
    }

    /* renamed from: a */
    public final void mo67092a(Rect rect, Rect rect2) {
        C10765mq.m32773b(rect, "adLayoutRect");
        C10765mq.m32773b(rect2, "containerRect");
        mo67093a();
    }

    /* renamed from: a */
    public final boolean mo67093a() {
        return m31348c() || m31349d() || m31350e() || m31351f();
    }

    /* renamed from: c */
    private final boolean m31348c() {
        if (this.f26240a.left < this.f26241b.left) {
            this.f26240a.right += this.f26241b.left - this.f26240a.left;
            this.f26240a.left = this.f26241b.left;
        }
        return m31352g();
    }

    /* renamed from: d */
    private final boolean m31349d() {
        if (this.f26240a.top < this.f26241b.top) {
            this.f26240a.bottom += this.f26241b.top - this.f26240a.top;
            this.f26240a.top = this.f26241b.top;
        }
        return m31352g();
    }

    /* renamed from: e */
    private final boolean m31350e() {
        if (this.f26240a.right > this.f26241b.right) {
            int i = this.f26240a.right - this.f26241b.right;
            this.f26240a.left -= i;
            this.f26240a.right -= i;
        }
        return m31352g();
    }

    /* renamed from: f */
    private final boolean m31351f() {
        if (this.f26240a.bottom > this.f26241b.bottom) {
            int i = this.f26240a.bottom - this.f26241b.bottom;
            this.f26240a.top -= i;
            this.f26240a.bottom -= i;
        }
        return m31352g();
    }

    /* renamed from: g */
    private final boolean m31352g() {
        return mo67094b() >= this.f26242c;
    }

    /* renamed from: b */
    public final float mo67094b() {
        Rect c = C10349ay.m31321c(this.f26240a, this.f26241b);
        if (c == null) {
            return 0.0f;
        }
        return ((float) (c.width() * c.height())) / ((float) (this.f26240a.width() * this.f26240a.height()));
    }
}
