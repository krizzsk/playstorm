package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.C3985e;
import com.bytedance.sdk.openadsdk.utils.C4020v;

/* renamed from: com.bytedance.sdk.openadsdk.core.x */
/* compiled from: VisibilityChecker */
public class C3765x {
    /* renamed from: a */
    private static boolean m12369a(View view, int i) {
        float a = m12368a(view);
        return a > 0.0f && a >= ((float) i) / 100.0f;
    }

    /* renamed from: a */
    public static float m12368a(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0) {
                    if (view.getParent() != null) {
                        Rect rect = new Rect();
                        if (!view.getGlobalVisibleRect(rect)) {
                            return -1.0f;
                        }
                        long height = ((long) rect.height()) * ((long) rect.width());
                        long height2 = ((long) view.getHeight()) * ((long) view.getWidth());
                        if (height2 <= 0) {
                            return -1.0f;
                        }
                        return ((float) height) / ((float) height2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    /* renamed from: b */
    private static boolean m12372b(View view) {
        return view != null && view.isShown();
    }

    /* renamed from: b */
    private static boolean m12373b(View view, int i) {
        return view.getWidth() >= m12374c(view, i) && view.getHeight() >= m12375d(view, i);
    }

    /* renamed from: c */
    private static int m12374c(View view, int i) {
        if (i == 3) {
            return (int) (((double) C4020v.m13306c(view.getContext().getApplicationContext())) * 0.7d);
        }
        return 20;
    }

    /* renamed from: d */
    private static int m12375d(View view, int i) {
        if (i == 3) {
            return C4020v.m13310d(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    /* renamed from: b */
    private static int m12371b(View view, int i, int i2) throws Throwable {
        if (!C3985e.m13054a()) {
            return 4;
        }
        if (!m12372b(view)) {
            return 1;
        }
        if (!m12373b(view, i2)) {
            return 6;
        }
        return !m12369a(view, i) ? 3 : 0;
    }

    /* renamed from: a */
    public static boolean m12370a(View view, int i, int i2) {
        if (i2 == 1) {
            while (true) {
                if (view == null) {
                    break;
                }
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if (view instanceof NativeExpressView) {
                        break;
                    } else if (view instanceof BannerExpressView) {
                        break;
                    } else {
                        view = (View) view.getParent();
                    }
                } catch (Throwable unused) {
                    return false;
                }
            }
        }
        if (m12371b(view, i, i2) == 0) {
            return true;
        }
        return false;
    }
}
