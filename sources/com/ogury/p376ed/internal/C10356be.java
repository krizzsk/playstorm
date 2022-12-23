package com.ogury.p376ed.internal;

import android.graphics.Rect;
import android.view.View;
import com.ogury.p376ed.internal.C10648iz;
import java.util.List;

/* renamed from: com.ogury.ed.internal.be */
public final class C10356be {

    /* renamed from: a */
    private final C10354bc f26234a;

    /* renamed from: b */
    private final C10365bl f26235b;

    /* renamed from: c */
    private final List<C10364bk> f26236c;

    private C10356be(C10354bc bcVar, C10365bl blVar) {
        C10765mq.m32773b(bcVar, "rectHelper");
        C10765mq.m32773b(blVar, "screenRotationAdjustment");
        this.f26234a = bcVar;
        this.f26235b = blVar;
        this.f26236c = C10692km.m32649b(new C10363bj(), new C10360bg(), this.f26235b, new C10362bi(1.0f));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C10356be() {
        /*
            r4 = this;
            com.ogury.ed.internal.bc r0 = new com.ogury.ed.internal.bc
            r0.<init>()
            com.ogury.ed.internal.bl r1 = new com.ogury.ed.internal.bl
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.lang.String r3 = "getSystem().configuration"
            com.ogury.p376ed.internal.C10765mq.m32770a((java.lang.Object) r2, (java.lang.String) r3)
            r1.<init>(r2)
            r4.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10356be.<init>():void");
    }

    /* renamed from: a */
    public final C10648iz mo67089a(View view, C10648iz izVar) {
        if (izVar == null || view == null) {
            return null;
        }
        Rect g = izVar.mo67676g();
        Rect c = C10354bc.m31332c(view);
        g.offset(c.left, c.top);
        C10648iz a = m31334a(view, g);
        if (a != null) {
            a.mo67673e(izVar.mo67675f());
        }
        return a;
    }

    /* renamed from: com.ogury.ed.internal.be$a */
    /* synthetic */ class C10357a extends C10764mp implements C10730lk<C10546g, C10684ke> {
        C10357a(Object obj) {
            super(1, obj, C10356be.class, "onMouseUp", "onMouseUp(Lio/presage/ads/viewer/AdLayout;)V");
        }

        /* renamed from: a */
        private void m31339a(C10546g gVar) {
            C10765mq.m32773b(gVar, "p0");
            ((C10356be) this.f26984a).m31336a(gVar);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m31339a((C10546g) obj);
            return C10684ke.f26938a;
        }
    }

    /* renamed from: a */
    public final C10648iz mo67090a(C10546g gVar, View view) {
        C10765mq.m32773b(gVar, "adLayout");
        C10765mq.m32773b(view, TtmlNode.RUBY_CONTAINER);
        Rect c = C10354bc.m31332c(gVar);
        gVar.setOnMouseUpListener(new C10357a(this));
        return m31334a(view, c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m31336a(C10546g gVar) {
        this.f26235b.mo67096a(C10354bc.m31332c(gVar));
    }

    /* renamed from: a */
    private final C10648iz m31334a(View view, Rect rect) {
        Rect c = C10354bc.m31332c(view);
        if (C10355bd.m31333a(view, c)) {
            return null;
        }
        for (C10364bk a : this.f26236c) {
            a.mo67092a(rect, c);
        }
        this.f26235b.mo67096a(rect);
        rect.offset(-c.left, -c.top);
        C10648iz.C10649a aVar = C10648iz.f26875a;
        return C10648iz.C10649a.m32547a(rect);
    }
}
