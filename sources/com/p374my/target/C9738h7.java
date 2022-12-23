package com.p374my.target;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.h7 */
public class C9738h7 extends LinearLayoutManager {

    /* renamed from: a */
    public final int f24007a;

    /* renamed from: b */
    public int f24008b;

    /* renamed from: c */
    public C9739a f24009c;

    /* renamed from: d */
    public int f24010d;

    /* renamed from: e */
    public int f24011e;

    /* renamed from: f */
    public int f24012f;

    /* renamed from: g */
    public int f24013g;

    /* renamed from: com.my.target.h7$a */
    public interface C9739a {
        /* renamed from: a */
        void mo63327a();
    }

    public C9738h7(Context context) {
        super(context, 0, false);
        this.f24007a = C10059y8.m29843c(context).mo65778b(4);
    }

    /* renamed from: a */
    public void mo64186a(int i) {
        this.f24008b = i;
    }

    /* renamed from: a */
    public void mo64187a(C9739a aVar) {
        this.f24009c = aVar;
    }

    /* renamed from: a */
    public boolean mo64188a(View view) {
        int findFirstCompletelyVisibleItemPosition = findFirstCompletelyVisibleItemPosition();
        int position = getPosition(view);
        return findFirstCompletelyVisibleItemPosition <= position && position <= findLastCompletelyVisibleItemPosition();
    }

    public void measureChildWithMargins(View view, int i, int i2) {
        int height = getHeight();
        int width = getWidth();
        if (height != this.f24013g || width != this.f24012f || this.f24010d <= 0 || this.f24011e <= 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
            float width2 = ((float) getWidth()) / ((float) view.getMeasuredWidth());
            this.f24010d = width2 > 1.0f ? (int) (((double) ((float) width)) / (Math.floor((double) width2) + 0.5d)) : (int) (((float) width) / 1.5f);
            this.f24011e = height;
            this.f24012f = width;
            this.f24013g = height;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (view != getChildAt(0)) {
            layoutParams.leftMargin = C10059y8.m29824a(this.f24008b / 2, view.getContext());
        }
        if (view != getChildAt(getChildCount())) {
            layoutParams.rightMargin = C10059y8.m29824a(this.f24008b / 2, view.getContext());
        }
        int childMeasureSpec = LinearLayoutManager.getChildMeasureSpec(width, getWidthMode(), 0, this.f24010d, canScrollHorizontally());
        int heightMode = getHeightMode();
        int i3 = this.f24007a;
        view.measure(childMeasureSpec, LinearLayoutManager.getChildMeasureSpec(height, heightMode, i3, height - (i3 * 2), canScrollVertically()));
    }

    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        C9739a aVar = this.f24009c;
        if (aVar != null) {
            aVar.mo63327a();
        }
    }
}
