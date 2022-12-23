package com.p374my.target;

import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.l7 */
public class C9830l7 extends RecyclerView {

    /* renamed from: a */
    public C9831a f24259a;

    /* renamed from: com.my.target.l7$a */
    public interface C9831a {
        /* renamed from: b */
        void mo63962b();
    }

    public C9830l7(Context context) {
        super(context);
    }

    public void onScrollStateChanged(int i) {
        C9831a aVar;
        super.onScrollStateChanged(i);
        if (!(i != 0) && (aVar = this.f24259a) != null) {
            aVar.mo63962b();
        }
    }

    public void setMoveStopListener(C9831a aVar) {
        this.f24259a = aVar;
    }

    public void smoothScrollBy(int i, int i2) {
        super.smoothScrollBy(i, i2, new AccelerateDecelerateInterpolator());
    }
}
