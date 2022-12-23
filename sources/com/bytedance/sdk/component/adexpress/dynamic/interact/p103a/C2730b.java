package com.bytedance.sdk.component.adexpress.dynamic.interact.p103a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.C2734c;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a.b */
/* compiled from: SlideRightTouch */
public class C2730b implements View.OnTouchListener {

    /* renamed from: a */
    private float f6049a;

    /* renamed from: b */
    private float f6050b;

    /* renamed from: c */
    private boolean f6051c;

    /* renamed from: d */
    private C2734c f6052d;

    public C2730b(C2734c cVar) {
        this.f6052d = cVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C2734c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6049a = motionEvent.getX();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                this.f6050b = x;
                if (Math.abs(x - this.f6049a) > 10.0f) {
                    this.f6051c = true;
                }
            }
        } else if (!this.f6051c) {
            return false;
        } else {
            int b = C2642b.m6898b(C2640c.m6890a(), Math.abs(this.f6050b - this.f6049a));
            if (this.f6050b > this.f6049a && b > 5 && (cVar = this.f6052d) != null) {
                cVar.mo17292a();
            }
        }
        return true;
    }
}
