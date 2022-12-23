package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: com.applovin.impl.adview.h */
public class C1524h extends WebView {

    /* renamed from: a */
    private PointF f1898a = new PointF();

    public C1524h(Context context) {
        super(context);
    }

    public PointF getAndClearLastClickLocation() {
        PointF pointF = this.f1898a;
        this.f1898a = new PointF();
        return pointF;
    }

    public PointF getLastClickLocation() {
        return this.f1898a;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f1898a = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        return super.onTouchEvent(motionEvent);
    }
}
