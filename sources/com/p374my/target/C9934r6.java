package com.p374my.target;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.r6 */
public class C9934r6 extends LinearLayoutManager {

    /* renamed from: com.my.target.r6$a */
    public interface C9935a {
        /* renamed from: a */
        void mo63318a();
    }

    public C9934r6(Context context) {
        super(context, 0, false);
    }

    /* renamed from: a */
    public boolean mo65331a(View view) {
        return findViewByPosition(findFirstCompletelyVisibleItemPosition()) == view;
    }

    public void measureChildWithMargins(View view, int i, int i2) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        view.measure(LinearLayoutManager.getChildMeasureSpec((int) (((float) getWidth()) * 0.75f), getWidthMode(), getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin + i, layoutParams.width, canScrollHorizontally()), LinearLayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin + i2, layoutParams.height, canScrollVertically()));
    }
}
