package com.p374my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* renamed from: com.my.target.c6 */
public class C9644c6 extends FrameLayout {

    /* renamed from: a */
    public final int f23709a;

    /* renamed from: b */
    public final BitmapDrawable f23710b;

    /* renamed from: c */
    public final int f23711c;

    /* renamed from: d */
    public final int f23712d;

    /* renamed from: e */
    public final int f23713e;

    /* renamed from: f */
    public final Rect f23714f = new Rect();

    /* renamed from: g */
    public final Rect f23715g = new Rect();

    /* renamed from: h */
    public final Rect f23716h = new Rect();

    /* renamed from: i */
    public final Rect f23717i = new Rect();

    /* renamed from: j */
    public C9645a f23718j;

    /* renamed from: k */
    public boolean f23719k;

    /* renamed from: l */
    public boolean f23720l;

    /* renamed from: m */
    public int f23721m = 8388661;

    /* renamed from: com.my.target.c6$a */
    public interface C9645a {
        /* renamed from: d */
        void mo63312d();
    }

    public C9644c6(Context context) {
        super(context);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(C9905p5.m28985a(C10059y8.m29843c(context).mo65778b(30)));
        this.f23710b = bitmapDrawable;
        bitmapDrawable.setState(FrameLayout.EMPTY_STATE_SET);
        bitmapDrawable.setCallback(this);
        this.f23709a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f23711c = C10059y8.m29824a(50, context);
        this.f23712d = C10059y8.m29824a(30, context);
        this.f23713e = C10059y8.m29824a(8, context);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public final void mo63688a() {
        playSoundEffect(0);
        C9645a aVar = this.f23718j;
        if (aVar != null) {
            aVar.mo63312d();
        }
    }

    /* renamed from: a */
    public final void mo63689a(int i, Rect rect, Rect rect2) {
        Gravity.apply(this.f23721m, i, i, rect, rect2);
    }

    /* renamed from: a */
    public boolean mo63690a(int i, int i2, int i3) {
        Rect rect = this.f23715g;
        return i >= rect.left - i3 && i2 >= rect.top - i3 && i < rect.right + i3 && i2 < rect.bottom + i3;
    }

    /* renamed from: b */
    public void mo63691b(int i, Rect rect, Rect rect2) {
        int i2 = this.f23712d;
        Gravity.apply(i, i2, i2, rect, rect2);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f23719k) {
            this.f23719k = false;
            this.f23714f.set(0, 0, getWidth(), getHeight());
            mo63689a(this.f23711c, this.f23714f, this.f23715g);
            this.f23717i.set(this.f23715g);
            Rect rect = this.f23717i;
            int i = this.f23713e;
            rect.inset(i, i);
            mo63689a(this.f23712d, this.f23717i, this.f23716h);
            this.f23710b.setBounds(this.f23716h);
        }
        if (this.f23710b.isVisible()) {
            this.f23710b.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return mo63690a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f23719k = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r5 != 3) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            float r0 = r5.getX()
            int r0 = (int) r0
            float r1 = r5.getY()
            int r1 = (int) r1
            android.graphics.drawable.BitmapDrawable r2 = r4.f23710b
            boolean r2 = r2.isVisible()
            r3 = 0
            if (r2 == 0) goto L_0x0035
            int r2 = r4.f23709a
            boolean r0 = r4.mo63690a((int) r0, (int) r1, (int) r2)
            if (r0 == 0) goto L_0x0035
            int r5 = r5.getAction()
            r0 = 1
            if (r5 == 0) goto L_0x0032
            if (r5 == r0) goto L_0x0028
            r1 = 3
            if (r5 == r1) goto L_0x002f
            goto L_0x0034
        L_0x0028:
            boolean r5 = r4.f23720l
            if (r5 == 0) goto L_0x0034
            r4.mo63688a()
        L_0x002f:
            r4.f23720l = r3
            goto L_0x0034
        L_0x0032:
            r4.f23720l = r0
        L_0x0034:
            return r0
        L_0x0035:
            super.onTouchEvent(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9644c6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCloseBounds(Rect rect) {
        this.f23715g.set(rect);
    }

    public void setCloseGravity(int i) {
        this.f23721m = i;
    }

    public void setCloseVisible(boolean z) {
        C10059y8.m29833a((View) this, z ? "close_button" : "closeable_layout");
        if (this.f23710b.setVisible(z, false)) {
            invalidate(this.f23715g);
        }
    }

    public void setOnCloseListener(C9645a aVar) {
        this.f23718j = aVar;
    }
}
