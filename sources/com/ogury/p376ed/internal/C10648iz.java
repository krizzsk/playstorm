package com.ogury.p376ed.internal;

import android.graphics.Rect;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.iz */
public final class C10648iz {

    /* renamed from: a */
    public static final C10649a f26875a = new C10649a((byte) 0);

    /* renamed from: b */
    private boolean f26876b;

    /* renamed from: c */
    private int f26877c;

    /* renamed from: d */
    private int f26878d;

    /* renamed from: e */
    private int f26879e;

    /* renamed from: f */
    private int f26880f;

    /* renamed from: g */
    private int f26881g;

    /* renamed from: a */
    public static /* synthetic */ C10648iz m32531a(C10648iz izVar, boolean z, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            z = izVar.f26876b;
        }
        if ((i5 & 2) != 0) {
            i = izVar.f26877c;
        }
        if ((i5 & 4) != 0) {
            i2 = izVar.f26878d;
        }
        if ((i5 & 8) != 0) {
            i3 = izVar.f26879e;
        }
        if ((i5 & 16) != 0) {
            i4 = izVar.f26880f;
        }
        return m32532a(z, i, i2, i3, i4);
    }

    /* renamed from: a */
    private static C10648iz m32532a(boolean z, int i, int i2, int i3, int i4) {
        return new C10648iz(z, i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10648iz)) {
            return false;
        }
        C10648iz izVar = (C10648iz) obj;
        return this.f26876b == izVar.f26876b && this.f26877c == izVar.f26877c && this.f26878d == izVar.f26878d && this.f26879e == izVar.f26879e && this.f26880f == izVar.f26880f;
    }

    public final int hashCode() {
        boolean z = this.f26876b;
        if (z) {
            z = true;
        }
        return ((((((((z ? 1 : 0) * true) + Integer.hashCode(this.f26877c)) * 31) + Integer.hashCode(this.f26878d)) * 31) + Integer.hashCode(this.f26879e)) * 31) + Integer.hashCode(this.f26880f);
    }

    public final String toString() {
        return "ResizeProps(allowOffscreen=" + this.f26876b + ", width=" + this.f26877c + ", height=" + this.f26878d + ", offsetX=" + this.f26879e + ", offsetY=" + this.f26880f + ')';
    }

    public C10648iz(boolean z, int i, int i2, int i3, int i4) {
        this.f26876b = z;
        this.f26877c = i;
        this.f26878d = i2;
        this.f26879e = i3;
        this.f26880f = i4;
    }

    /* renamed from: a */
    public final void mo67664a(boolean z) {
        this.f26876b = z;
    }

    /* renamed from: a */
    public final boolean mo67665a() {
        return this.f26876b;
    }

    /* renamed from: a */
    public final void mo67663a(int i) {
        this.f26877c = i;
    }

    /* renamed from: b */
    public final int mo67666b() {
        return this.f26877c;
    }

    /* renamed from: b */
    public final void mo67667b(int i) {
        this.f26878d = i;
    }

    /* renamed from: c */
    public final int mo67668c() {
        return this.f26878d;
    }

    /* renamed from: c */
    public final void mo67669c(int i) {
        this.f26879e = i;
    }

    /* renamed from: d */
    public final int mo67670d() {
        return this.f26879e;
    }

    /* renamed from: d */
    public final void mo67671d(int i) {
        this.f26880f = i;
    }

    /* renamed from: e */
    public final int mo67672e() {
        return this.f26880f;
    }

    /* renamed from: e */
    public final void mo67673e(int i) {
        this.f26881g = i;
    }

    /* renamed from: f */
    public final int mo67675f() {
        return this.f26881g;
    }

    public C10648iz() {
        this(false, 0, 0, 0, 0);
    }

    /* renamed from: g */
    public final Rect mo67676g() {
        int i = this.f26879e;
        int i2 = this.f26880f;
        return new Rect(i, i2, this.f26877c + i, this.f26878d + i2);
    }

    /* renamed from: com.ogury.ed.internal.iz$a */
    public static final class C10649a {
        public /* synthetic */ C10649a(byte b) {
            this();
        }

        private C10649a() {
        }

        /* renamed from: a */
        public static C10648iz m32548a(Map<String, String> map) {
            C10765mq.m32773b(map, "params");
            C10648iz izVar = new C10648iz();
            String str = map.get("allowOffscreen");
            izVar.mo67664a(str == null ? true : Boolean.parseBoolean(str));
            try {
                izVar.mo67663a(C10556gi.m32087b(C10554gg.m32083a(map, "width")));
                izVar.mo67667b(C10556gi.m32087b(C10554gg.m32083a(map, "height")));
                izVar.mo67669c(C10556gi.m32087b(C10554gg.m32083a(map, "offsetX")));
                izVar.mo67671d(C10556gi.m32087b(C10554gg.m32083a(map, "offsetY")));
                return izVar;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: a */
        public static C10648iz m32547a(Rect rect) {
            C10765mq.m32773b(rect, "rect");
            return m32546a(rect.left, rect.top, rect.width(), rect.height());
        }

        /* renamed from: a */
        private static C10648iz m32546a(int i, int i2, int i3, int i4) {
            C10648iz izVar = new C10648iz();
            izVar.mo67664a(false);
            izVar.mo67669c(i);
            izVar.mo67671d(i2);
            izVar.mo67663a(i3);
            izVar.mo67667b(i4);
            return izVar;
        }
    }
}
