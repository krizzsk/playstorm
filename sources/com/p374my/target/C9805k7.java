package com.p374my.target;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.k7 */
public class C9805k7 extends LinearSnapHelper {

    /* renamed from: a */
    public final DecelerateInterpolator f24207a;

    /* renamed from: b */
    public int f24208b;

    /* renamed from: c */
    public boolean f24209c = false;

    /* renamed from: d */
    public float f24210d = 60.0f;

    /* renamed from: e */
    public int f24211e = -1;

    /* renamed from: f */
    public float f24212f = -1.0f;

    /* renamed from: g */
    public OrientationHelper f24213g;

    /* renamed from: h */
    public OrientationHelper f24214h;

    /* renamed from: i */
    public RecyclerView f24215i;

    /* renamed from: com.my.target.k7$a */
    public class C9806a extends LinearSmoothScroller {
        public C9806a(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return C9805k7.this.f24210d / ((float) displayMetrics.densityDpi);
        }

        public int calculateTimeForDeceleration(int i) {
            return (int) Math.ceil(((double) calculateTimeForScrolling(i)) / 0.3d);
        }

        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            if (C9805k7.this.f24215i != null && C9805k7.this.f24215i.getLayoutManager() != null) {
                C9805k7 k7Var = C9805k7.this;
                int[] calculateDistanceToFinalSnap = k7Var.calculateDistanceToFinalSnap(k7Var.f24215i.getLayoutManager(), view);
                int i = calculateDistanceToFinalSnap[0];
                int i2 = calculateDistanceToFinalSnap[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (calculateTimeForDeceleration > 0) {
                    action.update(i, i2, calculateTimeForDeceleration, C9805k7.this.f24207a);
                }
            }
        }
    }

    public C9805k7(int i) {
        this.f24208b = i;
        this.f24207a = new DecelerateInterpolator(1.7f);
    }

    /* renamed from: a */
    public final int mo64608a() {
        int width;
        RecyclerView recyclerView = this.f24215i;
        if (recyclerView == null) {
            return Integer.MAX_VALUE;
        }
        if (this.f24212f != -1.0f) {
            if (this.f24213g != null) {
                width = recyclerView.getHeight();
            } else if (this.f24214h == null) {
                return Integer.MAX_VALUE;
            } else {
                width = recyclerView.getWidth();
            }
            return (int) (((float) width) * this.f24212f);
        }
        int i = this.f24211e;
        if (i != -1) {
            return i;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final int mo64609a(View view, OrientationHelper orientationHelper) {
        int i;
        int i2;
        if (!this.f24209c) {
            int decoratedEnd = orientationHelper.getDecoratedEnd(view);
            if (decoratedEnd < orientationHelper.getEnd() - ((orientationHelper.getEnd() - orientationHelper.getEndAfterPadding()) / 2)) {
                return decoratedEnd - orientationHelper.getEndAfterPadding();
            }
            i2 = orientationHelper.getDecoratedEnd(view);
            i = orientationHelper.getEnd();
        } else {
            i2 = orientationHelper.getDecoratedEnd(view);
            i = orientationHelper.getEndAfterPadding();
        }
        return i2 - i;
    }

    /* renamed from: a */
    public final View mo64610a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i, boolean z) {
        View view = null;
        if (layoutManager.getChildCount() != 0 && (layoutManager instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (z && mo64615a(linearLayoutManager)) {
                return null;
            }
            int i2 = Integer.MAX_VALUE;
            int startAfterPadding = layoutManager.getClipToPadding() ? orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2) : orientationHelper.getEnd() / 2;
            boolean z2 = i == 8388611;
            for (int i3 = 0; i3 < linearLayoutManager.getChildCount(); i3++) {
                View childAt = linearLayoutManager.getChildAt(i3);
                int abs = Math.abs(z2 ? !this.f24209c ? orientationHelper.getDecoratedStart(childAt) : orientationHelper.getStartAfterPadding() - orientationHelper.getDecoratedStart(childAt) : (orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
                if (abs < i2) {
                    view = childAt;
                    i2 = abs;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    public final View mo64611a(RecyclerView.LayoutManager layoutManager, boolean z) {
        OrientationHelper orientationHelper;
        OrientationHelper orientationHelper2;
        int i = this.f24208b;
        if (i == 17) {
            return mo64610a(layoutManager, getHorizontalHelper(layoutManager), 17, z);
        }
        if (i != 48) {
            if (i == 80) {
                orientationHelper2 = getVerticalHelper(layoutManager);
            } else if (i == 8388611) {
                orientationHelper = getHorizontalHelper(layoutManager);
            } else if (i != 8388613) {
                return null;
            } else {
                orientationHelper2 = getHorizontalHelper(layoutManager);
            }
            return mo64610a(layoutManager, orientationHelper2, GravityCompat.END, z);
        }
        orientationHelper = getVerticalHelper(layoutManager);
        return mo64610a(layoutManager, orientationHelper, GravityCompat.START, z);
    }

    /* renamed from: a */
    public void mo64612a(int i) {
        mo64613a(i, Boolean.TRUE);
    }

    /* renamed from: a */
    public void mo64613a(int i, Boolean bool) {
        if (this.f24208b != i) {
            this.f24208b = i;
            mo64614a(bool);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r3.f24215i.getLayoutManager();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64614a(java.lang.Boolean r4) {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.f24215i
            if (r0 == 0) goto L_0x0036
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            if (r0 != 0) goto L_0x000b
            goto L_0x0036
        L_0x000b:
            androidx.recyclerview.widget.RecyclerView r0 = r3.f24215i
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            r1 = 0
            android.view.View r2 = r3.mo64611a((androidx.recyclerview.widget.RecyclerView.LayoutManager) r0, (boolean) r1)
            if (r2 == 0) goto L_0x0036
            int[] r0 = r3.calculateDistanceToFinalSnap(r0, r2)
            boolean r4 = r4.booleanValue()
            r2 = 1
            if (r4 == 0) goto L_0x002d
            androidx.recyclerview.widget.RecyclerView r4 = r3.f24215i
            r1 = r0[r1]
            r0 = r0[r2]
            r4.smoothScrollBy(r1, r0)
            goto L_0x0036
        L_0x002d:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f24215i
            r1 = r0[r1]
            r0 = r0[r2]
            r4.scrollBy(r1, r0)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9805k7.mo64614a(java.lang.Boolean):void");
    }

    /* renamed from: a */
    public final boolean mo64615a(LinearLayoutManager linearLayoutManager) {
        return ((linearLayoutManager.getReverseLayout() || this.f24208b != 8388611) && (!linearLayoutManager.getReverseLayout() || this.f24208b != 8388613) && ((linearLayoutManager.getReverseLayout() || this.f24208b != 48) && (!linearLayoutManager.getReverseLayout() || this.f24208b != 80))) ? this.f24208b == 17 ? linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 || linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1 : linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 : linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.setOnFlingListener((RecyclerView.OnFlingListener) null);
            this.f24215i = recyclerView;
        } else {
            this.f24215i = null;
        }
        try {
            super.attachToRecyclerView(recyclerView);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final int mo64616b(View view, OrientationHelper orientationHelper) {
        boolean z = this.f24209c;
        int decoratedStart = orientationHelper.getDecoratedStart(view);
        return (z || decoratedStart >= orientationHelper.getStartAfterPadding() / 2) ? decoratedStart - orientationHelper.getStartAfterPadding() : decoratedStart;
    }

    /* renamed from: b */
    public void mo64617b(int i) {
        RecyclerView recyclerView;
        RecyclerView.SmoothScroller createScroller;
        if (i != -1 && (recyclerView = this.f24215i) != null && recyclerView.getLayoutManager() != null && (createScroller = createScroller(this.f24215i.getLayoutManager())) != null) {
            createScroller.setTargetPosition(i);
            this.f24215i.getLayoutManager().startSmoothScroll(createScroller);
        }
    }

    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int i = this.f24208b;
        if (i == 17) {
            return super.calculateDistanceToFinalSnap(layoutManager, view);
        }
        int[] iArr = new int[2];
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return iArr;
        }
        OrientationHelper horizontalHelper = getHorizontalHelper((LinearLayoutManager) layoutManager);
        if (i == 8388611) {
            iArr[0] = mo64616b(view, horizontalHelper);
        } else {
            iArr[0] = mo64609a(view, horizontalHelper);
        }
        return iArr;
    }

    public int[] calculateScrollDistance(int i, int i2) {
        if (this.f24215i == null || ((this.f24213g == null && this.f24214h == null) || (this.f24211e == -1 && this.f24212f == -1.0f))) {
            return super.calculateScrollDistance(i, i2);
        }
        Scroller scroller = new Scroller(this.f24215i.getContext(), new DecelerateInterpolator());
        int a = mo64608a();
        int i3 = -a;
        scroller.fling(0, 0, i, i2, i3, a, i3, a);
        return new int[]{scroller.getFinalX(), scroller.getFinalY()};
    }

    public RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (recyclerView = this.f24215i) == null) {
            return null;
        }
        return new C9806a(recyclerView.getContext());
    }

    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return mo64611a(layoutManager, true);
    }

    public final OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f24214h;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.f24214h = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f24214h;
    }

    public final OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f24213g;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.f24213g = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.f24213g;
    }
}
