package com.bytedance.sdk.component.adexpress.dynamic.interact.p103a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.C2734c;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a.d */
/* compiled from: TapTouch */
public class C2732d implements View.OnTouchListener {

    /* renamed from: c */
    private static int f6058c = 10;

    /* renamed from: a */
    private float f6059a;

    /* renamed from: b */
    private float f6060b;

    /* renamed from: d */
    private boolean f6061d;

    /* renamed from: e */
    private C2734c f6062e;

    public C2732d(C2734c cVar) {
        this.f6062e = cVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6059a = motionEvent.getX();
            this.f6060b = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f6059a) >= ((float) f6058c) || Math.abs(y - this.f6060b) >= ((float) f6058c)) {
                    this.f6061d = true;
                }
            } else if (action == 3) {
                this.f6061d = false;
            }
        } else if (this.f6061d) {
            this.f6061d = false;
            return false;
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.f6059a) >= ((float) f6058c) || Math.abs(y2 - this.f6060b) >= ((float) f6058c)) {
                this.f6061d = false;
            } else {
                C2734c cVar = this.f6062e;
                if (cVar != null) {
                    cVar.mo17292a();
                }
            }
        }
        return true;
    }
}
