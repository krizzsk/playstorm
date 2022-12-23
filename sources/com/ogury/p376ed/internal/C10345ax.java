package com.ogury.p376ed.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.ogury.p376ed.internal.C10420cw;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ax */
public final class C10345ax implements C10829q {

    /* renamed from: a */
    public static final C10346a f26219a = new C10346a((byte) 0);

    /* renamed from: b */
    private final ViewGroup f26220b;

    /* renamed from: c */
    private final C10354bc f26221c;

    /* renamed from: d */
    private final C10353bb f26222d;

    /* renamed from: e */
    private final C10350az f26223e;

    /* renamed from: f */
    private C10412cq f26224f;

    /* renamed from: g */
    private C10830r f26225g;

    /* renamed from: h */
    private C10352ba f26226h;

    private C10345ax(ViewGroup viewGroup, C10354bc bcVar, C10353bb bbVar, C10350az azVar) {
        C10765mq.m32773b(viewGroup, "adContainer");
        C10765mq.m32773b(bcVar, "webViewHelper");
        C10765mq.m32773b(bbVar, "overlapCalculator");
        C10765mq.m32773b(azVar, "viewHierarchy");
        this.f26220b = viewGroup;
        this.f26221c = bcVar;
        this.f26222d = bbVar;
        this.f26223e = azVar;
        this.f26224f = new C10412cq();
        this.f26226h = new C10352ba(this.f26220b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C10345ax(android.view.ViewGroup r4) {
        /*
            r3 = this;
            com.ogury.ed.internal.bc r0 = new com.ogury.ed.internal.bc
            r0.<init>()
            com.ogury.ed.internal.bb r1 = new com.ogury.ed.internal.bb
            r1.<init>(r0)
            com.ogury.ed.internal.az r2 = new com.ogury.ed.internal.az
            r2.<init>()
            r3.<init>(r4, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10345ax.<init>(android.view.ViewGroup):void");
    }

    /* renamed from: c */
    private C10830r m31306c() {
        return this.f26225g;
    }

    /* renamed from: a */
    public final void mo67006a(C10830r rVar) {
        this.f26225g = rVar;
    }

    /* renamed from: com.ogury.ed.internal.ax$a */
    public static final class C10346a {
        public /* synthetic */ C10346a(byte b) {
            this();
        }

        private C10346a() {
        }
    }

    /* renamed from: a */
    public final void mo67005a() {
        this.f26224f.mo67165a();
        int childCount = this.f26220b.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = this.f26220b.getChildAt(i);
                if ((childAt instanceof C10660jh) && ((C10660jh) childAt).getContainsMraid()) {
                    C10420cw.C10421a aVar = C10420cw.f26359a;
                    this.f26224f.mo67166a(C10420cw.C10421a.m31531a(new C10347b(this, childAt)).mo67170b(new C10348c(this, childAt)));
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.ogury.ed.internal.ax$b */
    static final class C10347b extends C10766mr implements C10729lj<C10576gy> {

        /* renamed from: a */
        final /* synthetic */ C10345ax f26227a;

        /* renamed from: b */
        final /* synthetic */ View f26228b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10347b(C10345ax axVar, View view) {
            super(0);
            this.f26227a = axVar;
            this.f26228b = view;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C10576gy mo67074a() {
            C10345ax axVar = this.f26227a;
            View view = this.f26228b;
            C10765mq.m32770a((Object) view, "child");
            return axVar.m31303a((C10660jh) view);
        }
    }

    /* renamed from: com.ogury.ed.internal.ax$c */
    static final class C10348c extends C10766mr implements C10730lk<C10576gy, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10345ax f26229a;

        /* renamed from: b */
        final /* synthetic */ View f26230b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10348c(C10345ax axVar, View view) {
            super(1);
            this.f26229a = axVar;
            this.f26230b = view;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m31312a((C10576gy) obj);
            return C10684ke.f26938a;
        }

        /* renamed from: a */
        private void m31312a(C10576gy gyVar) {
            C10765mq.m32773b(gyVar, "it");
            C10345ax axVar = this.f26229a;
            View view = this.f26230b;
            C10765mq.m32770a((Object) view, "child");
            axVar.m31305a((C10660jh) view, gyVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m31305a(C10660jh jhVar, C10576gy gyVar) {
        if (jhVar.mo67703h()) {
            this.f26226h.mo67088a(gyVar);
            jhVar.getMraidCommandExecutor().mo67522a(gyVar);
            C10830r c = m31306c();
            if (c != null) {
                c.mo67010a(gyVar.mo67517c());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C10576gy m31303a(C10660jh jhVar) {
        C10576gy gyVar = new C10576gy();
        View rootView = this.f26220b.getRootView();
        if (rootView != null) {
            ViewGroup viewGroup = (ViewGroup) rootView;
            Rect a = C10354bc.m31330a(jhVar);
            Rect b = C10354bc.m31331b(this.f26220b);
            a.bottom = a.top + jhVar.getMeasuredHeight();
            a.right = a.left + jhVar.getMeasuredWidth();
            if (!a.intersect(b)) {
                return gyVar;
            }
            List<Rect> a2 = C10353bb.m31328a((List<? extends View>) this.f26223e.mo67086a(viewGroup, (WebView) jhVar), a);
            int a3 = C10353bb.m31326a(a, a2);
            int measuredWidth = jhVar.getMeasuredWidth() * jhVar.getMeasuredHeight();
            int a4 = measuredWidth - C10349ay.m31314a(a);
            boolean z = false;
            if (a4 < 0) {
                a4 = 0;
            }
            float f = (float) measuredWidth;
            if (measuredWidth != 0) {
                gyVar.mo67513a(100.0f - ((((float) (a3 + a4)) * 100.0f) / f));
            } else {
                gyVar.mo67513a(0.0f);
            }
            if (gyVar.mo67517c() == 0.0f) {
                z = true;
            }
            if (!z) {
                C10349ay.m31317a(a2, b);
                C10349ay.m31316a(a, b);
                gyVar.mo67515a(a2);
                gyVar.mo67514a(a);
            }
            return gyVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: b */
    public final void mo67007b() {
        mo67006a((C10830r) null);
        this.f26224f.mo67165a();
    }
}
