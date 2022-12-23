package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.C2679b;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import java.util.Iterator;
import java.util.List;

public class DynamicTimeOuterContainerWidgetImp extends DynamicBaseWidgetImp implements C2679b {

    /* renamed from: a */
    int f6021a;

    /* renamed from: b */
    boolean f6022b;

    /* renamed from: s */
    private int f6023s = 0;

    public DynamicTimeOuterContainerWidgetImp(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        setTag(Integer.valueOf(getClickArea()));
        m7430a();
        dynamicRootView.setTimeOutListener(this);
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    /* renamed from: f */
    public void mo17231f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.f6022b) {
            layoutParams.leftMargin = this.f5971i;
        } else {
            layoutParams.leftMargin = this.f5971i + this.f6023s;
        }
        layoutParams.topMargin = this.f5972j;
        setLayoutParams(layoutParams);
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        setPadding((int) C2642b.m6894a(C2640c.m6890a(), (float) this.f5974l.mo17114c()), (int) C2642b.m6894a(C2640c.m6890a(), (float) this.f5974l.mo17113b()), (int) C2642b.m6894a(C2640c.m6890a(), (float) this.f5974l.mo17115d()), (int) C2642b.m6894a(C2640c.m6890a(), (float) this.f5974l.mo17110a()));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6022b) {
            setMeasuredDimension(this.f5969g, this.f5970h);
        } else {
            setMeasuredDimension(this.f6021a, this.f5970h);
        }
    }

    /* renamed from: a */
    private void m7430a() {
        List<C2688h> j = this.f5975m.mo17161j();
        if (j != null && j.size() > 0) {
            Iterator<C2688h> it = j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2688h next = it.next();
                if (TextUtils.equals("skip-with-time-skip-btn", next.mo17160i().mo16954b())) {
                    this.f6021a = (int) (((float) this.f5969g) - C2642b.m6894a(this.f5973k, next.mo17157g()));
                    break;
                }
            }
            this.f6023s = this.f5969g - this.f6021a;
        }
    }

    /* renamed from: a */
    public void mo16910a(CharSequence charSequence, boolean z, int i) {
        if (z && this.f6022b != z) {
            this.f6022b = z;
            mo17231f();
        }
        this.f6022b = z;
    }
}
