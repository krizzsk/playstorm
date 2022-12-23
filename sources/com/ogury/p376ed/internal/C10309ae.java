package com.ogury.p376ed.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: com.ogury.ed.internal.ae */
public final class C10309ae implements C10829q {

    /* renamed from: a */
    public static final C10311a f26115a = new C10311a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ViewGroup f26116b;

    /* renamed from: c */
    private final C10354bc f26117c;

    /* renamed from: d */
    private C10830r f26118d;

    /* renamed from: e */
    private C10352ba f26119e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ViewTreeObserver.OnScrollChangedListener f26120f;

    /* renamed from: g */
    private final View f26121g;

    private C10309ae(ViewGroup viewGroup, C10354bc bcVar) {
        C10765mq.m32773b(viewGroup, "adContainer");
        C10765mq.m32773b(bcVar, "rectHelper");
        this.f26116b = viewGroup;
        this.f26117c = bcVar;
        this.f26119e = new C10352ba(this.f26116b);
        this.f26120f = new ViewTreeObserver.OnScrollChangedListener() {
            public final void onScrollChanged() {
                C10309ae.m31159c(C10309ae.this);
            }
        };
        this.f26116b.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {

            /* renamed from: a */
            final /* synthetic */ C10309ae f26122a;

            {
                this.f26122a = r1;
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f26122a.f26116b.getViewTreeObserver().removeOnScrollChangedListener(this.f26122a.f26120f);
            }

            public final void onViewAttachedToWindow(View view) {
                ViewTreeObserver viewTreeObserver = this.f26122a.f26116b.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f26122a.f26120f);
                }
            }
        });
        this.f26121g = this.f26116b.getRootView();
    }

    public /* synthetic */ C10309ae(ViewGroup viewGroup) {
        this(viewGroup, new C10354bc());
    }

    /* renamed from: c */
    private C10830r m31158c() {
        return this.f26118d;
    }

    /* renamed from: a */
    public final void mo67006a(C10830r rVar) {
        this.f26118d = rVar;
    }

    /* renamed from: com.ogury.ed.internal.ae$a */
    public static final class C10311a {
        public /* synthetic */ C10311a(byte b) {
            this();
        }

        private C10311a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m31159c(C10309ae aeVar) {
        C10765mq.m32773b(aeVar, "this$0");
        aeVar.mo67005a();
    }

    /* renamed from: a */
    private final int m31154a(Rect rect) {
        Rect rect2 = new Rect();
        this.f26121g.getHitRect(rect2);
        if (!this.f26116b.getLocalVisibleRect(rect2) || this.f26116b.getWindowToken() == null) {
            return 0;
        }
        return rect.width() * rect.height();
    }

    /* renamed from: d */
    private final C10576gy m31160d() {
        C10576gy gyVar = new C10576gy();
        Rect a = C10354bc.m31330a(this.f26116b);
        int measuredWidth = this.f26116b.getMeasuredWidth() * this.f26116b.getMeasuredHeight();
        if (measuredWidth != 0) {
            gyVar.mo67513a(100.0f - ((((float) (measuredWidth - m31154a(a))) * 100.0f) / ((float) measuredWidth)));
        }
        if (gyVar.mo67517c() == 0.0f) {
            gyVar.mo67514a((Rect) null);
        } else {
            gyVar.mo67514a(a);
        }
        return gyVar;
    }

    /* renamed from: a */
    public final void mo67005a() {
        int childCount = this.f26116b.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = this.f26116b.getChildAt(i);
                if (childAt instanceof C10660jh) {
                    C10660jh jhVar = (C10660jh) childAt;
                    if (jhVar.getContainsMraid()) {
                        m31156a(jhVar, m31160d());
                    }
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m31156a(C10660jh jhVar, C10576gy gyVar) {
        if (jhVar.mo67703h()) {
            this.f26119e.mo67088a(gyVar);
            jhVar.getMraidCommandExecutor().mo67522a(gyVar);
            C10830r c = m31158c();
            if (c != null) {
                c.mo67010a(gyVar.mo67517c());
            }
        }
    }

    /* renamed from: b */
    public final void mo67007b() {
        mo67006a((C10830r) null);
    }
}
