package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.C2679b;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import java.util.List;

public class DynamicSkipCountDownContainer extends DynamicBaseWidgetImp implements C2679b {

    /* renamed from: a */
    private int f6016a;

    /* renamed from: b */
    private int f6017b;

    /* renamed from: s */
    private int f6018s;

    public DynamicSkipCountDownContainer(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        m7414a();
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    /* renamed from: h */
    public boolean mo17249h() {
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(getBackgroundDrawable());
        }
        setPadding((int) C2642b.m6894a(C2640c.m6890a(), (float) this.f5974l.mo17114c()), (int) C2642b.m6894a(C2640c.m6890a(), (float) this.f5974l.mo17113b()), (int) C2642b.m6894a(C2640c.m6890a(), (float) this.f5974l.mo17115d()), (int) C2642b.m6894a(C2640c.m6890a(), (float) this.f5974l.mo17110a()));
        return true;
    }

    /* renamed from: f */
    public void mo17231f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f5971i;
        layoutParams.topMargin = this.f5972j;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6018s == 0) {
            setMeasuredDimension(this.f6017b, this.f5970h);
        } else {
            setMeasuredDimension(this.f6016a, this.f5970h);
        }
    }

    /* renamed from: a */
    public void mo16910a(CharSequence charSequence, boolean z, int i) {
        this.f6018s = i;
    }

    /* renamed from: a */
    private void m7414a() {
        List<C2688h> j = this.f5975m.mo17161j();
        if (j != null && j.size() > 0) {
            for (C2688h next : j) {
                if (next.mo17160i().mo16951a() == 21) {
                    this.f6016a = (int) (((float) this.f5969g) - C2642b.m6894a(this.f5973k, next.mo17157g()));
                }
                if (next.mo17160i().mo16951a() == 20) {
                    this.f6017b = (int) (((float) this.f5969g) - C2642b.m6894a(this.f5973k, next.mo17157g()));
                }
            }
        }
    }
}
