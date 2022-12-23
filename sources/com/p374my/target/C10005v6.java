package com.p374my.target;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;

/* renamed from: com.my.target.v6 */
public interface C10005v6 {

    /* renamed from: com.my.target.v6$a */
    public interface C10006a {
        /* renamed from: a */
        void mo63985a(int i, Context context);

        /* renamed from: a */
        void mo63987a(View view, int i);

        /* renamed from: a */
        void mo63989a(int[] iArr, Context context);
    }

    void dispose();

    Parcelable getState();

    int[] getVisibleCardNumbers();

    void restoreState(Parcelable parcelable);

    void setPromoCardSliderListener(C10006a aVar);
}
