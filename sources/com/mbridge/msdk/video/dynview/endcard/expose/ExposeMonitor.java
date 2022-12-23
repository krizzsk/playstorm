package com.mbridge.msdk.video.dynview.endcard.expose;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class ExposeMonitor {
    private List<Integer> exposeList = new ArrayList();
    /* access modifiers changed from: private */
    public boolean isFirstScroll = false;
    private boolean mIsRecyclerViewVisibleInLogic = true;
    /* access modifiers changed from: private */
    public OnItemExposeListener mItemOnExposeListener;
    private RecyclerView mRecyclerView;

    public void setRecyclerItemExposeListener(RecyclerView recyclerView, OnItemExposeListener onItemExposeListener) {
        this.mItemOnExposeListener = onItemExposeListener;
        this.mRecyclerView = recyclerView;
        if (recyclerView != null && recyclerView.getVisibility() == 0) {
            this.mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (i == 0) {
                        ExposeMonitor.this.handleCurrentVisibleItems();
                    }
                }

                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    if (!ExposeMonitor.this.isFirstScroll) {
                        boolean unused = ExposeMonitor.this.isFirstScroll = true;
                        if (ExposeMonitor.this.mItemOnExposeListener != null) {
                            ExposeMonitor.this.mItemOnExposeListener.onItemViewFirstVisible();
                        }
                        ExposeMonitor.this.handleCurrentVisibleItems();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ Exception -> 0x006e }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleCurrentVisibleItems() {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r7.mRecyclerView
            if (r0 == 0) goto L_0x0072
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0072
            androidx.recyclerview.widget.RecyclerView r0 = r7.mRecyclerView
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r0 = r0.getGlobalVisibleRect(r1)
            if (r0 != 0) goto L_0x0018
            goto L_0x0072
        L_0x0018:
            r0 = 2
            int[] r1 = new int[r0]     // Catch:{ Exception -> 0x006e }
            androidx.recyclerview.widget.RecyclerView r2 = r7.mRecyclerView     // Catch:{ Exception -> 0x006e }
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()     // Catch:{ Exception -> 0x006e }
            boolean r3 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ Exception -> 0x006e }
            r4 = 0
            if (r3 == 0) goto L_0x0035
            r1 = r2
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1     // Catch:{ Exception -> 0x006e }
            int[] r3 = r7.findRangeLinear(r1)     // Catch:{ Exception -> 0x006e }
            int r1 = r1.getOrientation()     // Catch:{ Exception -> 0x006e }
        L_0x0031:
            r6 = r3
            r3 = r1
            r1 = r6
            goto L_0x0056
        L_0x0035:
            boolean r3 = r2 instanceof androidx.recyclerview.widget.GridLayoutManager     // Catch:{ Exception -> 0x006e }
            if (r3 == 0) goto L_0x0045
            r1 = r2
            androidx.recyclerview.widget.GridLayoutManager r1 = (androidx.recyclerview.widget.GridLayoutManager) r1     // Catch:{ Exception -> 0x006e }
            int[] r3 = r7.findRangeGrid(r1)     // Catch:{ Exception -> 0x006e }
            int r1 = r1.getOrientation()     // Catch:{ Exception -> 0x006e }
            goto L_0x0031
        L_0x0045:
            boolean r3 = r2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager     // Catch:{ Exception -> 0x006e }
            if (r3 == 0) goto L_0x0055
            r1 = r2
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1     // Catch:{ Exception -> 0x006e }
            int[] r3 = r7.findRangeStaggeredGrid(r1)     // Catch:{ Exception -> 0x006e }
            int r1 = r1.getOrientation()     // Catch:{ Exception -> 0x006e }
            goto L_0x0031
        L_0x0055:
            r3 = r4
        L_0x0056:
            if (r1 == 0) goto L_0x006d
            int r5 = r1.length     // Catch:{ Exception -> 0x006e }
            if (r5 >= r0) goto L_0x005c
            goto L_0x006d
        L_0x005c:
            r0 = r1[r4]     // Catch:{ Exception -> 0x006e }
        L_0x005e:
            r4 = 1
            r4 = r1[r4]     // Catch:{ Exception -> 0x006e }
            if (r0 > r4) goto L_0x0072
            android.view.View r4 = r2.findViewByPosition(r0)     // Catch:{ Exception -> 0x006e }
            r7.setCallbackForLogicVisibleView(r4, r0, r3)     // Catch:{ Exception -> 0x006e }
            int r0 = r0 + 1
            goto L_0x005e
        L_0x006d:
            return
        L_0x006e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.endcard.expose.ExposeMonitor.handleCurrentVisibleItems():void");
    }

    private void setCallbackForLogicVisibleView(View view, int i, int i2) {
        if (view != null && view.getVisibility() == 0 && view.getGlobalVisibleRect(new Rect())) {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            boolean z = false;
            boolean z2 = i2 == 1 && rect.height() > view.getMeasuredHeight() / 2;
            boolean z3 = i2 == 0 && rect.width() > view.getMeasuredWidth() / 2;
            if (z2 || z3) {
                z = true;
            }
            if (globalVisibleRect && this.mIsRecyclerViewVisibleInLogic && z && checkViewIsiNotShown(i)) {
                this.mItemOnExposeListener.onItemViewVisible(true, i);
            }
        }
    }

    private int[] findRangeLinear(LinearLayoutManager linearLayoutManager) {
        return new int[]{linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition()};
    }

    private int[] findRangeGrid(GridLayoutManager gridLayoutManager) {
        return new int[]{gridLayoutManager.findFirstVisibleItemPosition(), gridLayoutManager.findLastVisibleItemPosition()};
    }

    private int[] findRangeStaggeredGrid(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        int[] iArr2 = new int[staggeredGridLayoutManager.getSpanCount()];
        staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
        staggeredGridLayoutManager.findLastVisibleItemPositions(iArr2);
        return findRange(iArr, iArr2);
    }

    private int[] findRange(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr2[0];
        for (int i3 = 1; i3 < iArr.length; i3++) {
            if (i > iArr[i3]) {
                i = iArr[i3];
            }
        }
        for (int i4 = 1; i4 < iArr2.length; i4++) {
            if (i2 < iArr2[i4]) {
                i2 = iArr2[i4];
            }
        }
        return new int[]{i, i2};
    }

    public void setIsRecyclerViewVisibleInLogic(boolean z) {
        this.mIsRecyclerViewVisibleInLogic = z;
    }

    private boolean checkViewIsiNotShown(int i) {
        if (this.exposeList == null) {
            this.exposeList = new ArrayList();
        }
        if (this.exposeList.contains(Integer.valueOf(i))) {
            return false;
        }
        this.exposeList.add(Integer.valueOf(i));
        return true;
    }

    public void release() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.removeAllViews();
            this.mRecyclerView = null;
        }
        List<Integer> list = this.exposeList;
        if (list != null) {
            list.clear();
        }
        if (this.mItemOnExposeListener != null) {
            this.mItemOnExposeListener = null;
        }
    }
}
