package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.inmobi.media.ez */
/* compiled from: NativeContainerLayout */
public class C6058ez extends ViewGroup {

    /* renamed from: a */
    private static final String f15411a = C6058ez.class.getSimpleName();

    public C6058ez(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C6059a aVar = (C6059a) childAt.getLayoutParams();
                i4 = Math.max(i4, aVar.f15412a + childAt.getMeasuredWidth());
                i3 = Math.max(i3, aVar.f15413b + childAt.getMeasuredHeight());
            }
        }
        setMeasuredDimension(resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C6059a(-2, -2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C6059a aVar = (C6059a) childAt.getLayoutParams();
                childAt.layout(aVar.f15412a, aVar.f15413b, aVar.f15412a + childAt.getMeasuredWidth(), aVar.f15413b + childAt.getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C6059a;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C6059a(layoutParams);
    }

    /* renamed from: com.inmobi.media.ez$a */
    /* compiled from: NativeContainerLayout */
    public static class C6059a extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public int f15412a;

        /* renamed from: b */
        public int f15413b;

        public C6059a(int i, int i2) {
            super(i, i2);
        }

        public C6059a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
