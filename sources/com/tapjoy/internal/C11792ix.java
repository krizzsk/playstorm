package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* renamed from: com.tapjoy.internal.ix */
public final class C11792ix extends View {

    /* renamed from: a */
    public boolean f28776a = false;

    /* renamed from: b */
    private Bitmap f28777b = null;

    /* renamed from: c */
    private Rect f28778c = null;

    /* renamed from: d */
    private Rect f28779d = null;

    /* renamed from: e */
    private Rect f28780e = null;

    /* renamed from: f */
    private Rect f28781f = new Rect();

    public C11792ix(Context context) {
        super(context);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        this.f28777b = bitmap;
        int width = bitmap.getWidth();
        int height = this.f28777b.getHeight();
        int i = width / 2;
        this.f28779d = new Rect(0, 0, i, height);
        this.f28778c = new Rect(i, 0, width, height);
        mo72727a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72727a() {
        if (this.f28776a) {
            this.f28780e = this.f28778c;
        } else {
            this.f28780e = this.f28779d;
        }
    }

    public final void onDraw(Canvas canvas) {
        if (this.f28780e != null && this.f28777b != null) {
            getDrawingRect(this.f28781f);
            canvas.drawBitmap(this.f28777b, this.f28780e, this.f28781f, (Paint) null);
        }
    }
}
