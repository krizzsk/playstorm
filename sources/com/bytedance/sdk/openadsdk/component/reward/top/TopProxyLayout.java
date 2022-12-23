package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;

public class TopProxyLayout extends View implements C3378a<TopProxyLayout> {

    /* renamed from: a */
    private C3378a f8101a;

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public TopProxyLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View getITopLayout() {
        C3378a aVar = this.f8101a;
        if (!(aVar instanceof View)) {
            return null;
        }
        return (View) aVar;
    }

    /* renamed from: a */
    public TopProxyLayout mo19255a(boolean z, C3498n nVar) {
        TopLayoutDislike2 a = new TopLayoutDislike2(getContext()).mo19241a(z, nVar);
        if (a instanceof C3378a) {
            this.f8101a = a;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                m10043a((View) a, (ViewGroup) parent);
            }
            return this;
        }
        C2975l.m8391e("TopProxyLayout", "view not implements ITopLayout interface");
        return this;
    }

    /* renamed from: a */
    private void m10043a(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setShowSkip(boolean z) {
        C3378a aVar = this.f8101a;
        if (aVar != null) {
            aVar.setShowSkip(z);
        }
    }

    public void setSkipEnable(boolean z) {
        C3378a aVar = this.f8101a;
        if (aVar != null) {
            aVar.setSkipEnable(z);
        }
    }

    /* renamed from: c */
    public void mo19245c() {
        C3378a aVar = this.f8101a;
        if (aVar != null) {
            aVar.mo19245c();
        }
    }

    public void setShowSound(boolean z) {
        C3378a aVar = this.f8101a;
        if (aVar != null) {
            aVar.setShowSound(z);
        }
    }

    public void setSoundMute(boolean z) {
        C3378a aVar = this.f8101a;
        if (aVar != null) {
            aVar.setSoundMute(z);
        }
    }

    /* renamed from: a */
    public void mo19243a(CharSequence charSequence, CharSequence charSequence2) {
        C3378a aVar = this.f8101a;
        if (aVar != null) {
            aVar.mo19243a(charSequence, charSequence2);
        }
    }

    public void setShowDislike(boolean z) {
        C3378a aVar = this.f8101a;
        if (aVar != null) {
            aVar.setShowDislike(z);
        }
    }

    public void setListener(C3379b bVar) {
        C3378a aVar = this.f8101a;
        if (aVar != null) {
            aVar.setListener(bVar);
        }
    }

    /* renamed from: a */
    public void mo19242a() {
        C3378a aVar = this.f8101a;
        if (aVar != null) {
            aVar.mo19242a();
        }
    }

    /* renamed from: b */
    public void mo19244b() {
        C3378a aVar = this.f8101a;
        if (aVar != null) {
            aVar.mo19244b();
        }
    }
}
