package com.ogury.p376ed.internal;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: com.ogury.ed.internal.bf */
public final class C10358bf {

    /* renamed from: a */
    public static final C10359a f26237a = new C10359a((byte) 0);

    /* renamed from: b */
    private final C10362bi f26238b;

    /* renamed from: c */
    private final int f26239c;

    private C10358bf(C10362bi biVar) {
        C10765mq.m32773b(biVar, "minVisibilityAdjustmentGateway");
        this.f26238b = biVar;
        this.f26239c = C10556gi.m32087b(50);
    }

    public /* synthetic */ C10358bf() {
        this(new C10362bi(0.75f));
    }

    /* renamed from: com.ogury.ed.internal.bf$a */
    public static final class C10359a {
        public /* synthetic */ C10359a(byte b) {
            this();
        }

        private C10359a() {
        }
    }

    /* renamed from: a */
    public final boolean mo67091a(ViewGroup viewGroup, C10648iz izVar) {
        C10765mq.m32773b(viewGroup, "adLayout");
        C10765mq.m32773b(izVar, "resizeProps");
        if (izVar.mo67666b() < this.f26239c || izVar.mo67668c() < this.f26239c) {
            return false;
        }
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        Rect a = m31341a(rect, izVar);
        C10361bh b = this.f26238b.mo67095b(a, rect);
        float b2 = b.mo67094b();
        if (b2 < 0.5f) {
            return false;
        }
        if (!izVar.mo67665a() && b2 < 0.75f) {
            return false;
        }
        if (!izVar.mo67665a() || b2 >= 0.75f) {
            return true;
        }
        if (!b.mo67093a()) {
            return false;
        }
        m31342a(izVar, a, rect);
        return true;
    }

    /* renamed from: a */
    private static void m31342a(C10648iz izVar, Rect rect, Rect rect2) {
        izVar.mo67669c(rect.left - rect2.left);
        izVar.mo67671d(rect.top - rect2.top);
        izVar.mo67663a(rect.width());
        izVar.mo67667b(rect.height());
    }

    /* renamed from: a */
    private static Rect m31341a(Rect rect, C10648iz izVar) {
        Rect rect2 = new Rect();
        rect2.left = rect.left + izVar.mo67670d();
        rect2.top = rect.top + izVar.mo67672e();
        rect2.right = rect2.left + izVar.mo67666b();
        rect2.bottom = rect2.top + izVar.mo67668c();
        return rect2;
    }
}
