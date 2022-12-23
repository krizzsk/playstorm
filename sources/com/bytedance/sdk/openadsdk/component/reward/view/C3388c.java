package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.utils.C4020v;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.c */
/* compiled from: RewardFullNativeVideoLayout */
public class C3388c extends C3389d {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo19304a() {
        return false;
    }

    public C3388c(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public void mo19303a(int i, int i2) {
        super.mo19303a(i, i2);
        if (this.f8149c != null && C3498n.m10583c(this.f8149c) && this.f8149c.mo19746t() == 3 && this.f8149c.mo19750v() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.f8148b.findViewById(C2984t.m8432e(this.f8148b, "tt_video_container_back"));
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.f8149c.mo19669am() == 1) {
                    int e = C4020v.m13315e(C3578m.m11231a(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = e;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
