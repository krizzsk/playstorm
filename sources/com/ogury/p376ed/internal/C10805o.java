package com.ogury.p376ed.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ogury.p376ed.internal.C10828p;
import java.util.Calendar;

/* renamed from: com.ogury.ed.internal.o */
public final class C10805o<T extends ViewGroup & C10828p> implements C10775n {

    /* renamed from: a */
    public static final C10806a f27025a = new C10806a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C10775n f27026f = new C10807b();

    /* renamed from: b */
    private final T f27027b;

    /* renamed from: c */
    private float f27028c;

    /* renamed from: d */
    private float f27029d;

    /* renamed from: e */
    private long f27030e;

    public C10805o(T t) {
        C10765mq.m32773b(t, "adLayout");
        this.f27027b = t;
    }

    /* renamed from: com.ogury.ed.internal.o$a */
    public static final class C10806a {
        public /* synthetic */ C10806a(byte b) {
            this();
        }

        private C10806a() {
        }

        /* renamed from: a */
        public static C10775n m32827a() {
            return C10805o.f27026f;
        }

        /* renamed from: a */
        public static C10775n m32828a(C10546g gVar, boolean z) {
            C10765mq.m32773b(gVar, "adLayout");
            if (z) {
                return new C10805o(gVar);
            }
            return m32827a();
        }
    }

    /* renamed from: com.ogury.ed.internal.o$b */
    public static final class C10807b implements C10775n {
        /* renamed from: a */
        public final boolean mo67866a(MotionEvent motionEvent) {
            C10765mq.m32773b(motionEvent, "ev");
            return false;
        }

        C10807b() {
        }
    }

    /* renamed from: a */
    public final boolean mo67866a(MotionEvent motionEvent) {
        C10765mq.m32773b(motionEvent, "ev");
        if (m32822b(motionEvent)) {
            return false;
        }
        m32820b();
        return true;
    }

    /* renamed from: b */
    private final boolean m32822b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f27030e = Calendar.getInstance().getTimeInMillis();
        } else if (action == 1) {
            ((C10828p) this.f27027b).mo67457b();
            if (Calendar.getInstance().getTimeInMillis() - this.f27030e < 200) {
                return true;
            }
            return false;
        }
        m32823c(motionEvent);
        return true;
    }

    /* renamed from: c */
    private final void m32823c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m32824d(motionEvent);
        } else if (action == 2) {
            m32825e(motionEvent);
        }
    }

    /* renamed from: d */
    private final void m32824d(MotionEvent motionEvent) {
        this.f27028c = this.f27027b.getX() - motionEvent.getRawX();
        this.f27029d = this.f27027b.getY() - motionEvent.getRawY();
    }

    /* renamed from: e */
    private final void m32825e(MotionEvent motionEvent) {
        this.f27027b.bringToFront();
        if (m32819a(motionEvent.getRawX() + this.f27028c + ((float) (this.f27027b.getWidth() / 4)))) {
            this.f27027b.setX(motionEvent.getRawX() + this.f27028c);
        }
        if (m32821b(motionEvent.getRawY() + this.f27029d + ((float) (this.f27027b.getHeight() / 4)))) {
            this.f27027b.setY(motionEvent.getRawY() + this.f27029d);
        }
    }

    /* renamed from: a */
    private final boolean m32819a(float f) {
        return f > 0.0f && f + ((float) (this.f27027b.getWidth() / 2)) < ((float) ((C10828p) this.f27027b).getContainerWidth());
    }

    /* renamed from: b */
    private final boolean m32821b(float f) {
        return f > 0.0f && f + ((float) (this.f27027b.getHeight() / 2)) < ((float) ((C10828p) this.f27027b).getContainerHeight());
    }

    /* renamed from: b */
    private final void m32820b() {
        int childCount = this.f27027b.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = this.f27027b.getChildAt(i);
                if (childAt instanceof C10660jh) {
                    ((C10660jh) childAt).mo67693f();
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}
